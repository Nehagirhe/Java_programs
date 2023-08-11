package linkedlist;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;
public class Reverse {

	public static void main(String[] args) {
		LinkedList<String>a=new LinkedList<String>();
	    a.add("Red");
	    a.add("Green");
		a.add("Black");
		a.add("Pink");
		a.add("Orange");
		System.out.println("Original linked list: "+a);
		System.out.println("Elements in reverse order: ");
		Collections.reverse(a);
		System.out.println(a);
	}

}
