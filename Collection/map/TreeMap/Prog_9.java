package Tree;

import java.util.TreeMap;

public class Prog_9 {

	public static void main(String[] args) {
		TreeMap<String,String>t=new TreeMap<String,String>();
	    t.put("c1", "Green");
	    t.put("c2", "Red");
	    t.put("c3", "White");
	    t.put("c4", "Black");
	    System.out.println("Original Tree Map Content: "+t);
	    System.out.println("Greatest Key: "+t.firstKey());
	    System.out.println("Least Key: "+t.lastKey());
	}
}
