package classes;
import java.util.Scanner;
public class Student3 {
int rno;
String add,phno,name;
Scanner sc=new Scanner(System.in);
	void Setdata()
	{
		System.out.println("Enter Name : ");
		name=sc.nextLine();
		System.out.println("Enter Roll No. : ");
		rno=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Phone No.:");
		phno=(sc.nextLine());
		System.out.println("Enter Address : ");
		add=sc.nextLine();
	}
	
	void getdata()
	{
		System.out.println("Name : "+name);
		System.out.println("Roll No.:"+rno);
		System.out.println("Phone No. :"+phno);
		System.out.println("Address : "+add);
	}
}
