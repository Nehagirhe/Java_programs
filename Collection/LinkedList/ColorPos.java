package linkedlist;

import java.util.LinkedList;

public class ColorPos {
	public static void main(String[] args) {
		LinkedList<String>a=new LinkedList<String>();
	    a.add("Red");
	    a.add("Green");
		a.add("Black");
		a.add("Pink");
		a.add("Blue");
	        a.add("Indigo");
		a.add("Orange");
		System.out.println("Original linked list: "+a);
		a.add("voilet");
		a.add("yellow");
		a.add("golden");
	        a.add("Silver");
		a.add("grey");
                System.out.println("linked list: "+a);
       
	}
}
