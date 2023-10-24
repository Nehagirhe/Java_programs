package Tree;

import java.util.TreeMap;

public class Prog_15 {

	public static void main(String[] args) {
		TreeMap<Integer,String>t=new TreeMap<Integer,String>();
		t.put(10, "Red");
		t.put(20, "Green");
		t.put(40, "Black");
		t.put(50, "White");
		t.put(60, "Pink");
		System.out.println("Original TreMap Content: "+t);
		System.out.println("Checking The Entry For 10:");
		System.out.println("Key(s): "+t.lowerKey(10));
		System.out.println("Checking The Entry For 20:");
		System.out.println("Key(s): "+t.lowerKey(20));
		System.out.println("Checking The Entry For 70:");
		System.out.println("Key(s): "+t.lowerKey(70));
	}

}
