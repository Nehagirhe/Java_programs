package Tree;

import java.util.TreeMap;
public class Prog_16 {

	public static void main(String[] args) {
		TreeMap<Integer,String>t=new TreeMap<Integer,String>();
		t.put(10, "Red");
		t.put(20, "Green");
		t.put(40, "Black");
		t.put(50, "White");
		t.put(60, "Pink");
		System.out.println("Original TreeMap Content: "+t);
		System.out.println("\nTreeMap Content: "+t.keySet());
	}

}
