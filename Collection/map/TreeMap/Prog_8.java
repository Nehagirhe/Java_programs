package Tree;

import java.util.TreeMap;

public class Prog_8 {

	public static void main(String[] args) {
		TreeMap<String,String>t=new TreeMap<String,String>();
	    t.put("c1", "Red");
	    t.put("c2", "Green");
	    t.put("c3", "Black");
	    t.put("c4", "White");
	    t.put("c5", "Orange");
	    System.out.println("Original TreeMap Content: "+t);
	    System.out.println("Greatest Key: "+t.firstEntry());
	    System.out.println("Least Key: "+t.lastEntry());
	}
}
