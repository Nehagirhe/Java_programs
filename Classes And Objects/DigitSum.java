import java.util.Scanner;
//Program For Sum Of Digits 
public class DigitSum {

	public static void main(String[] args) {
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num=Integer.parseInt(sc.nextLine());
		while(num>0)
		{
		int a=num%10;
		System.out.println("a= "+a);
		c=c+a;
		num=num/10;
		System.out.println("Sum of entered Number "+c);
		}
		
		}

}
