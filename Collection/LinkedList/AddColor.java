package linkedlist;

import java.util.LinkedList;

public class AddColor {
	public static void main(String[] args) {
		LinkedList<String>a=new LinkedList<String>();
	    a.add("Red");
	    a.add("Green");
		a.add("Black");
		a.add("White");
		a.add("Pink");
		a.addd("Yellow");
		System.out.println("Original linked list: ");
		System.out.println(a);
        a.add(1,"Yellow");
		System.out.println("The Linked List: ");
		System.out.println(a);


	}

}
