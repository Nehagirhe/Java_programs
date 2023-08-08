package linkedlist;

import java.util.LinkedList;

public class Remove {

	public static void main(String[] args) {
		LinkedList<String>a=new LinkedList<String>();
	    a.add("Red");
	    a.add("Green");
		a.add("Black");
		a.add("Pink");
		a.add("Orange");
		System.out.println("Original linked list: "+a);
		a.remove(2);
        System.out.println("The New Linked List: "+a);
	}

}
