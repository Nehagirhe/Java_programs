package classes;
import java.util.Scanner;
public class Test5 {

	public static void main(String[] args) {
		int len,bre;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length : ");
		len=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Breadth : ");
		bre=Integer.parseInt(sc.nextLine());
		Rectangle5 R=new Rectangle5(len,bre);
		System.out.println("Area : "+R.Area());

	}

}
