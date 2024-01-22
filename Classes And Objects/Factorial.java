import java.util.Scanner;

//Program to find the factorial of a given number
public class Factorial {
    //int fact=1;
   // int num;
	public static void main(String[] args) {
	int fact=1;
	
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a Number : ");
        int num=Integer.parseInt(sc.nextLine());
        for(int i=1;i<num;i++){
        	fact=fact*i;
        }
        System.out.println("Factorial Of "+num +"is "+fact);
	}
}
