package map;
import java.util.HashMap;

public class Program12 {
	public static void main(String[] args) {
		HashMap<Integer,String>h=new HashMap<Integer,String>();
		h.put(1 ,"Red");
		h.put(2 ,"Green");
		h.put(3 ,"Black");
		h.put(4 ,"White");
		h.put(5, "Blue");
		System.out.println("Input: "+h);
		System.out.println("\nCollection View Is: "+h.values());

	}

}
