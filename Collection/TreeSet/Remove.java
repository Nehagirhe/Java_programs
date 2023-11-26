package Tree;

import java.util.TreeSet;

public class Remove {
	public static void main(String[] args) {
		TreeSet<Integer>t=new TreeSet<Integer>();
	    t.add(10);
	    t.add(14);
	    t.add(16);
	    t.add(22);
	    t.add(25);
	    t.add(36);
	    t.add(70);
	    t.add(82);
	    t.add(89);
	    System.out.println("Original Tree Set: "+t);
	    t.remove(70);
	    System.out.println("Removes 70 From The List: "+t);
	}

}
