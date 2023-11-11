package Tree;

import java.util.TreeSet;

public class Iterate {

	public static void main(String[] args) {
		TreeSet<String>t=new TreeSet<String>();
		t.add("Black");
		t.add("Green");
		t.add("Orange");
		t.add("Red");
		t.add("White");
		System.out.println(t);
		System.out.println("\nOutput:");
		for(String s:t)
		{
			System.out.println(s);
		}
		
		

	}

}
