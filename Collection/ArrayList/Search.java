package arrList;
import java.util.Scanner;
import java.util.ArrayList;

public class Search {
public static void main(String[] args) 
{
ArrayList <String>a=new ArrayList<String>();
Scanner sc=new Scanner(System.in);
a.add("Red");
a.add("Green");
a.add("Orange");
a.add("White");
a.add("Black");
System.out.println(a);
System.out.println("Enter The Element You Want To found: ");
String s=sc.nextLine();
if(a.contains(s))
	{
	System.out.println("Found the Element");
	}
else
{
	System.out.println("Element Not Found");
}
}
}
