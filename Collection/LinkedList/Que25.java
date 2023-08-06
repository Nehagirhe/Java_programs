package linkedlist;

import java.util.Collections;
import java.util.LinkedList;
public class Que25 {

	public static void main(String[] args) 
	{
	LinkedList<String>a=new LinkedList<String>();
    a.add("Red");
    a.add("Green");
    a.add("Black");
    a.add("White");
    a.add("Pink");
    System.out.println("Original Linked List: "+a);
    System.out.println("Check The Above Linked List Is Empty Or Not! "+a.isEmpty());
    System.out.println("Linked List After Remove All Elements :");
    a.removeAll(a);
    System.out.println(a);
    System.out.println("Check The Above Linked List Is Empty Or Not! "+a.isEmpty());
    
	}

}
