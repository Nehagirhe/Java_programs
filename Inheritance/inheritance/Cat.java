package inheritance;

import java.util.Scanner;

public class Cat extends Dog
{
	void fillCatDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Cat Breeds : ");
		breeds=sc.nextLine();
		System.out.println("Enter Cat Color : ");
		color=sc.nextLine();
		System.out.println("Enter Ears Shape : ");
		earshape=sc.nextLine();
		System.out.println("Enter Eyes Size : ");
		
	}
	void ShowCatDetails()
	{
		System.out.println(":: Cat Deteils ::");
		System.out.println("Cat Breed : "+breeds);
		System.out.println("Cat Color : "+color);
		System.out.println("Ears Shape : "+earshape);
		System.out.println("Eyes Size : "+eyesize);
		System.out.println("Cat Breeds : "+breeds);
		System.out.println("-------------***-------------------");
		
	}

}
