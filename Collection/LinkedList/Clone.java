package linkedlist;

import java.util.LinkedList;

public class Clone {

	public static void main(String[] args) {
		LinkedList<String>a=new LinkedList<String>();
	    a.add("Red");
	    a.add("Green");
		a.add("Black");
		a.add("White");
		a.add("Pink");
		System.out.println("First linked list: "+a);
		System.out.println("Cloned linked list: "+a.clone());
     
	}

}
