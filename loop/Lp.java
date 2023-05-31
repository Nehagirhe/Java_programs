package pracprog;
import java.util.Scanner;
public class Lp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
System.out.println("Enter How Many Values To Calculate Cube :");
int n=Integer.parseInt(sc.nextLine());
for(int i=1;i<=n;i++)
{
	System.out.print("Number is "+i);
	System.out.print(" And Cube Of The "+i);
	//int x=i*i*i;
	System.out.println(" Is : "+i*i*i);
}

	}

}
