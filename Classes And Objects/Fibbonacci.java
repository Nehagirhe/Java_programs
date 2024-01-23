import java.util.Scanner;

//Program To Find The Factorial Of A Given Number
public class Fibbonacci {
	public static void main(String[] args) {
		
		int a=0,b=1,c,n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number :");
		n=Integer.parseInt(sc.nextLine());
		System.out.print(+a);
		System.out.print(" "+b);
		for(i=3;i<=n;i++){
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
