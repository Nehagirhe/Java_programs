package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException ,SQLException{

		//step 1
		Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Step 1");
        //step 2
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/w3school","root","abc123");
        System.out.println("Step 2");
        
        //step 3
        Statement st=con.createStatement(); 
        System.out.println("Step 3");
        //step4       
        String sql="SELECT * FROM school;";
        ResultSet rs= st.executeQuery(sql);        
        while(rs.next())
        {
         System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }   
        //step 5
        con.close();
        System.out.println("Step 5");       	  
	}
}