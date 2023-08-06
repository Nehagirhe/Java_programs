package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Que22 {

	public static void main(String[] args) {
		LinkedList<String>a=new LinkedList<String>();
	    a.add("Red");
	    a.add("Green");
		a.add("Black");
		a.add("White");
		a.add("Pink");
		System.out.println(a);
		if(a.contains("Green"))
		System.out.println("Color Green Is Present In The Linked List.");
		else
		System.out.println("Color Green Is Not Present In The Linked List");
		if(a.contains("Orange"))
		System.out.println("Color Orange Is Present In The Linked List.");
		else
		System.out.println("Color Orange Is Not Present In The Linked List.");
}
}
