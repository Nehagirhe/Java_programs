package linkedlist;

import java.util.LinkedList;

public class Iterate {

	public static void main(String[] args) {
		LinkedList<String>a=new LinkedList<String>();
	    a.add("Red");
	    a.add("Green");
		a.add("Black");
		a.add("White");
		a.add("Pink");
		a.add("Yellow");
		System.out.println("Output: ");
		for(String s:a)
		{
		System.out.println(s);
		}

	}

}
