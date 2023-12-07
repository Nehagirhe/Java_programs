package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class stud {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Step 1");	
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/w3school","root","abc123");
        Scanner sc=new Scanner (System.in);
        System.out.println("Step 2");
        System.out.println("1.insert\n2.update\n3.Delete\n0.Exit");
        System.out.println("Enter Choice: ");
        int ch=Integer.parseInt(sc.nextLine());
        int roll,a;
        String name,city,sql;
        System.out.print("Enter Roll : ");
        roll=Integer.parseInt(sc.nextLine());
        System.out.print("Enter Name : ");
        name=sc.nextLine();
        System.out.print("Enter Address : ");
        city=sc.nextLine();
        
        switch(ch)
        {
        case 1: 
        	 
             sql="insert into school values(?,?,?)";
             PreparedStatement ps=con.prepareStatement(sql);
             ps.setInt(1, roll);
             ps.setString(2, name);
             ps.setString(3, city);
             System.out.println("Step 3");
             
             //step4
             a=ps.executeUpdate();// insert update delete 
             System.out.println("Step 4");
             if(a>0)
             {
             	System.out.println("Data Inserted");
             }
             else
             {
             	System.out.println("Data Not Inserted");
             }
             con.close();
             System.out.println("Step 5");
             break;
        case 2:
//       	 System.out.print("Enter Roll no. u want to update: ");
//         roll=Integer.parseInt(sc.nextLine());
         sql="update school set  name=? where roll=?" ;
         PreparedStatement ps1=con.prepareStatement(sql);
         ps1.setInt(1, roll);
         ps1.setString(2, name);
         ps1.setString(3, city);
         System.out.println("Step 3");
         
         //step4
         a=ps1.executeUpdate();// insert update delete 
         System.out.println("Step 4");
         if(a>0)
         {
         	System.out.println("Data Inserted");
         }
         else
         {
         	System.out.println("Data Not Inserted");
         }
         con.close();
         System.out.println("Step 5");
         break;
        case 3:
          	 System.out.print("Enter Roll no. u want to delete: ");
             roll=Integer.parseInt(sc.nextLine());
//           
            sql="delete school where roll=?";
            PreparedStatement ps3=con.prepareStatement(sql);
            ps3.setInt(1, roll);
            System.out.println("Step 3");
            
            //step4
            a=ps3.executeUpdate();// insert update delete 
            System.out.println("Step 4");
            if(a>0)
            {
            	System.out.println("Data Inserted");
            }
            else
            {
            	System.out.println("Data Not Inserted");
            }
            con.close();
            System.out.println("Step 5");
            break;
        }   
	}
}
