package map;

import java.util.HashMap;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {
	HashMap<Integer,String>h=new HashMap<Integer,String>();
	h.put(1, "Mango");
	h.put(2, "Apple");
	h.put(3, "Banana");
	h.put(1, "Grapes");
	System.out.println("Iterating HashMap...");
	for(Map.Entry m:h.entrySet())
	{
	System.out.println(m.getKey()+" "+m.getValue());
	}
	}

}
