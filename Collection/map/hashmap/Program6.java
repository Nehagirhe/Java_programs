package map;

import java.util.HashMap;

public class Program6 {

	public static void main(String[] args) {
		HashMap<Integer,String>h=new HashMap<Integer,String>();
		h.put(1, "Red");
		h.put(2, "Green");
		h.put(3, "Black");
		h.put(4, "White");
		h.put(5, "Blue");
		HashMap<Integer,String>m=new HashMap<Integer,String>();
		m=(HashMap)h.clone();
		System.out.println("The Original Map: "+h);
		System.out.println("Cloned Map: "+m);
		
		

	}

}
