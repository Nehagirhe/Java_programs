package arrList;
import java.util.ArrayList;
import java.util.Scanner;
public class Iterate {

	public static void main(String[] args) {
	ArrayList <String>a=new ArrayList<String>();
	String color;
	int i;
	for(i=0;i<5;i++)
	{
	a.add("Red");
	a.add("Green");
    a.add("Orange");
    a.add("White");
    a.add("Black");
	}
	for(int j=0;j<5;j++)
	{
	System.out.println(a.get(j));
	}
	
	}

}
