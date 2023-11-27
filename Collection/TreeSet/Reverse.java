package Tree;

import java.util.TreeSet;

public class Reverse {

	public static void main(String[] args) {
		TreeSet<String>t=new TreeSet<String>();
		t.add("Black");
		t.add("Green");
		t.add("Pink");
		t.add("Red");
		t.add("Orange");
		System.out.println(t);
	    System.out.println("Elements In Reverse Order: "+t.descendingSet());        
	}

}
