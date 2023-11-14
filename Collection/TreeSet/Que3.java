package Tree;

import java.util.TreeSet;

public class Que3 {

	public static void main(String[] args) {
		TreeSet<String>t=new TreeSet<String>();
		t.add("Green");
		t.add("Orange");
		t.add("Red");
		System.out.println("\n"+t);
		
		TreeSet<String>t1=new TreeSet<String>();
		t1.add("Black");
		t1.add("Pink");
		t1.add("White");
		System.out.println("\n"+t1);
		
		TreeSet<String>t2=new TreeSet<String>();
		t2.add("Black");
		t2.add("Green");
		t2.add("Orange");
		t2.add("Pink");
		t2.add("Red");
		t2.add("White");
        System.out.println("\n"+t2);
        
        System.out.println("\nTree Set1: "+t);
        System.out.println("\nTree Set2: "+t1);
        t.addAll(t1);
        t1.addAll(t2);
        System.out.println("\nTree Set1:"+t1);

	}

}
