package Tree;

import java.util.TreeMap;

public class Prog_7 {

	public static void main(String[] args) {
    TreeMap<String,String>t=new TreeMap<String,String>();
    t.put("c1", "White");
    t.put("c2", "Red");
    t.put("c3", "Black");
    t.put("c4", "Green");
    t.comparator();
    System.out.println("Sample Output: "+t);
	}

}
