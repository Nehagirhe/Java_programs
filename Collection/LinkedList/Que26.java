package linkedlist;

import java.util.LinkedList;

public class Que26 {

	public static void main(String[] args) {
		LinkedList<String>a=new LinkedList<String>();
	    a.add("Red");
	    a.add("Green");
	    a.add("Black");
	    a.add("White");
	    a.add("Pink");
	    System.out.println("Original Linked List: "+a);
	    a.set(1,"Orange");
	    System.out.println("The Value Of Second Element Changed.");
	    System.out.println("New Linked List :"+a);
	}
}
