package arrList;

import java.util.ArrayList;

public class Que22 {

	public static void main(String[] args) {
		ArrayList <String>a=new ArrayList<String>();
		a.add("Red");
		a.add("Green");
		a.add("Black");
		a.add("White");
		a.add("Pink");
		System.out.println("Original Array List: "+a);
		System.out.println("Print using index of an element:");
		for(String s:a)
		{
		System.out.println(s);
		}
        
	}

}
