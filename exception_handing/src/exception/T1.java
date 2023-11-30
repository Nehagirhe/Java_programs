package exception;
import java.util.Scanner;
public class T1
{
void  T() //throws ArithmeticException 
{
throw new ArithmeticException("device error");
}
void div()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Any Number : ");
	int a=Integer.parseInt(sc.nextLine());
	System.out.println("Enter Second Number : ");
	int b=Integer.parseInt(sc.nextLine());
	int c=a/b;
	System.out.println("Addition : "+c);
}
	
	public static void main(String[] args)
	{
    T1 a=new T1();
    a.T();
    a.div();
	}

}
