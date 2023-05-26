package inheritance;
import java.util.Scanner;
public class Dog extends Animals
{
void fillDogDetails()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Dog Breeds : ");
	breeds=sc.nextLine();
	System.out.println("Enter Dog Color : ");
	color=sc.nextLine();
	System.out.println("Enter Ears Shape : ");
	earshape=sc.nextLine();
	System.out.println("Enter Eyes Size : ");
	eyesize=sc.nextLine();
	
}
void ShowDogDetails()
{
	System.out.println(":: Dog Deteils ::");
	System.out.println("Dog Breed : "+breeds);
	System.out.println("Dog Color : "+color);
	System.out.println("Ears Shape : "+earshape);
	System.out.println("Eyes Size : "+eyesize);
	System.out.println("Dog Breeds : "+breeds);
	System.out.println("-------------***-------------------");
	System.out.println();
}
}
