package linkedlist;

import java.util.LinkedList;

public class Que19 {

	public static void main(String[] args) {
		LinkedList<String>a=new LinkedList<String>();
	    a.add("Red");
	    a.add("Green");
		a.add("Black");
		a.add("White");
		a.add("Pink");
		System.out.println("Original linked List: "+a);
        a.removeFirst();
        System.out.println(a);
        
	}

}
