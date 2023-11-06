package Tree;

import java.util.TreeMap;

public class Prog_12 {

	public static void main(String[] args) {
		TreeMap<Integer,String>t=new TreeMap<Integer,String>();
		t.put(10, "Red");
		t.put(20, "Green");
		t.put(40, "Black");
		t.put(60, "yellow");
		t.put(80, "orange");
		out.print("<a href='profile?pId=1'>1</a>&emsp;");
		out.print("<a href='profile?pId=2'>2</a>&emsp; ");
		out.print("<a href='profile?pId=3'>3</a> ");
		
		t.put(60, "Pink");
		System.out.println("Original TreMap Content: "+t);
		System.out.println("Checking The Entry For 10:");
		System.out.println("Value is: "+t.floorKey(10));
		System.out.println("Checking The Entry For 30:");
		System.out.println("Value is: "+t.floorKey(30));
		System.out.println("Checking The Entry For 70:");
		System.out.println("Value is: "+t.floorKey(70));

	}

}
