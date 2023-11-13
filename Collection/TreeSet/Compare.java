package Tree;

import java.util.TreeSet;

public class Compare {

	public static void main(String[] args) {
		TreeSet<String>t=new TreeSet<String>();
		t.add("Black");
		t.add("Green");
		t.add("Red");
		t.add("White");
		System.out.println("First Tree Set: "+t);
		
		TreeSet<String>t1=new TreeSet<String>();
		t1.add("Black");
		t1.add("Orange");
		t1.add("Pink");
		t1.add("Red");
		System.out.println("\nSecond Tree Set: "+t1);
		for(String s:t)
		{
		if(t1.contains(s))
		{
		System.out.println("yes");
	    }
		else
		System.out.println("No");
		}
	}
}
