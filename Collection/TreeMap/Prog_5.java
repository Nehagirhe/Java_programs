package Tree;

import java.util.TreeMap;

public class Prog_5 {

	public static void main(String[] args) {
		TreeMap<String, String>t=new TreeMap<String, String>();
		
		t.put("c1", "Red");
		t.put("c2", "Green");
		t.put("c3", "Black");
		t.put("c4", "White");
		System.out.println("Output: "+t.keySet());
	}

}
