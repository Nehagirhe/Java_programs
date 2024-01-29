import java.util.Scanner;

//Swapping Without Third Variable
public class SwapWithoutVar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the value of a");
		int a=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the value of b");
		int b=Integer.parseInt(sc.nextLine());
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}

}
