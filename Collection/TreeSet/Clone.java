package Tree;

import java.util.TreeSet;

public class Clone {

	public static void main(String[] args) {
		TreeSet<String>t=new TreeSet<String>();
		t.add("Black");
		t.add("Green");
		t.add("Pink");
		t.add("Red");
		t.add("Orange");
		System.out.println("Original Tree Set: "+t);
		System.out.println("\nCloned Tree Set: "+t.clone());
		
		
	}

}
