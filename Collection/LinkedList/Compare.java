package arrList;

import java.util.ArrayList;

public class Compare {

	public static void main(String[] args) {
		ArrayList <String>a=new ArrayList<String>();
		a.add("Red");
		a.add("Green");
		a.add("Black");
		a.add("White");
		a.add("Pink");
		a.add("orange");
		System.out.println("List1: "+a);
		ArrayList<String>b=new ArrayList<String>();
		b.add("Red");
		b.add("Green");
		b.add("Black");
		b.add("Pink");
		System.out.println("List2: "+b);
		System.out.println("Output :");
		for(String s:a) {
		if(b.contains(s))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	}

}
