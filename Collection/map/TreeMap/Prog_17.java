package Tree;

import java.util.TreeMap;

public class Prog_17 {

	public static void main(String[] args) {
		TreeMap<Integer,String>t=new TreeMap<Integer,String>();
		t.put(10, "Red");
		t.put(20, "Green");
		t.put(40, "Black");
		t.put(50, "White");
		t.put(60, "Pink");
		System.out.println("Sample Output: ");
		System.out.println("Value Before Poll: "+t);
		System.out.println("Value Returned: "+t.pollFirstEntry());
		System.out.println("Value After Poll: "+t);
	}

}
