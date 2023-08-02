package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Que16 {

	public static void main(String[] args) {
		LinkedList<String>a=new LinkedList<String>();
		   a.add("Red");
		   a.add("Green");
		   a.add("Black");
		   a.add("White");
		   a.add("Pink");
	System.out.println("Linked List Before Shuffling: "+a);   
	Collections.shuffle(a);
    System.out.println("Linked List After Shuffling: "+a);
	}

}
