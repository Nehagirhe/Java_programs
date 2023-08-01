package linkedlist;

import java.util.LinkedList;

public class Occurrence {

	public static void main(String[] args) {
		LinkedList<String>a=new LinkedList<String>();
	    a.add("Red");
	    a.add("Green");
		a.add("Black");
		a.add("Pink");
		a.add("Orange");
		System.out.println("Original linked list: "+a);
        System.out.println("First Element Is: "+a.getFirst());
        System.out.println("Last Element Is: "+a.getLast());
	}

}
