package linkedlist;

import java.util.LinkedList;

public class Join {

	public static void main(String[] args) {
		LinkedList<String>a=new LinkedList<String>();
	    a.add("Red");
	    a.add("Green");
		a.add("Black");
		a.add("White");
		a.add("Pink");
		System.out.println("First linked list: "+a);
		LinkedList<String>b=new LinkedList<String>();
	    b.add("Red");
	    b.add("Green");
		b.add("Black");
		b.add("Pink");
		System.out.println("Second linked list: "+b);
		a.addAll(b);
		System.out.println("New linked list: "+a);


	}

}
