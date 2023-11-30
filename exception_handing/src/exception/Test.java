package exception;
import java.util.Scanner;
public class Test {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		try
		{
		System.out.println("Enter Any Value : ");
		arr[1]=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Any Value : ");
		arr[2]=Integer.parseInt(sc.nextLine());
		
		arr[3]=arr[1]/arr[2];
	System.out.println("Result : "+arr[3]);
	}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(ArithmeticException e)
		{
		  System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
		System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
	     System.out.println(e.getMessage());
		}
        finally {
        	System.out.println("Hii!");
        }
		
System.out.println("Good Morning  !!");

	}

}
