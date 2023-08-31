package map;
import java.util.HashMap;

public class Program8 {

	public static void main(String[] args) {
		HashMap<Integer ,String>h=new HashMap<Integer,String>();
		h.put(1,"Red");
		h.put(4,"White");
		h.put(5,"Blue");
		h.put(3,"Black");
		h.put(2,"Green");
		System.out.println("\nThe Original Map: "+h);
		System.out.println("1. Is Key 'Green' Exist?");
		if(h.containsValue("Green"))
		System.out.println("Yes!");
		else
		System.out.println("No!");
		System.out.println("2. Is Key 'Orange' Exist?");
		if(h.containsValue("Orange"))
		System.out.println("yes");
		else
		System.out.println("No!");

	}

}
