package map;

import java.util.HashMap;

public class Program7 {

	public static void main(String[] args) {
		HashMap<String,Integer>h=new HashMap<String,Integer>();
		h.put("Red" ,1);
		h.put("White" ,4);
		h.put("Blue" ,5);
		h.put("Black" ,3);
		h.put("Green" ,2);
		System.out.println("Original Map: "+h);
		System.out.println("1. Is Key 'Green' Exist?");
		if(h.containsKey("Green"))
		System.out.println("Yes!");
		else
		System.out.println("No!");
		System.out.println("2. Is Key 'Orange' Exist?");
		if(h.containsKey("Orange"))
		System.out.println("yes");
		else
		System.out.println("No!");
		
	}

}
