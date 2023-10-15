package Tree;

import java.util.TreeMap;

public class Prog_4 {

	public static void main(String[] args) {
	TreeMap<String, String>t=new TreeMap<String, String>();
	t.put("c1", "Red");
	t.put("c2", "Green");
	t.put("c3", "Black");
	t.put("c4", "White");
	System.out.println("Output: "+t);
	if(t.containsValue("Green"))
	System.out.println("\nThe Tree Map Contains Value Green");
	else
	System.out.println("\nThe Tree Map Does Not Contain Value Green");
if(t.containsValue("Pink"))
System.out.println("\nThe Tree Map Contains Value Pink");
else
System.out.println("\nThe Tree Map Does Not Contain Value Pink");


		
	}

}
