package Tree;

import java.util.TreeMap;

public class Prog_13 {

	public static void main(String[] args) {
		TreeMap<Integer,String>t=new TreeMap<Integer,String>();
		t.put(10, "Red");
		t.put(20, "Green");
		t.put(40, "Black");
		t.put(50, "White");
		t.put(60, "Yellow");
		t.put(70, "Pink");
		System.out.println("Original TreMap Content: "+t);
		System.out.println("Checking The Entry For 10:");
		System.out.println("Key(s): "+t.higherEntry(10));
		System.out.println("Checking The Entry For 30:");
		System.out.println("Key(s): "+t.higherEntry(30));
		System.out.println("Checking The Entry For 70:");
		System.out.println("Key(s): "+t.higherEntry(70));
		System.out.println("Checking The Entry For 90:");
		System.out.println("Key(s): "+t.higherEntry(90));
	}

}
