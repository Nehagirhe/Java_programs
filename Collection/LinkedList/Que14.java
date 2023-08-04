package linkedlist;

import java.util.LinkedList;

public class Que14 {

	public static void main(String[] args) 
	{
	LinkedList<String>a=new LinkedList<String>();
	    a.add("Red");
	    a.add("Green");
	    a.add(2,"Black");
	    a.add(2,"Orange");
	    System.out.println("Original linked list: "+a);
        a.removeAll(a);
        System.out.println("The New Linked List: "+a);
	}

}
