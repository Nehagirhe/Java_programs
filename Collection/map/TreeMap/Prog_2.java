package Tree;

import java.util.TreeMap;

public class Prog_2 {
	
	public static void main(String[] args) {
	TreeMap<String,String>t=new TreeMap<String,String>();
	t.put("c1", "Red");
	t.put("c2", "Green");
	t.put("c3", "Black");
	t.put("c4", "White");
	t.put("c5", "Blue");
	System.out.println("\nTree Map 1:"+t);
	TreeMap<String,String>t1=new TreeMap<String,String>();
	t1.put("A1", "Orange");
	t1.put("A2", "Pink");
	System.out.println("\nTree Map 2:"+t1);
    t.putAll(t1);
	System.out.println("\nAfter Coping Map2 to Map1: "+t);
	}

}
