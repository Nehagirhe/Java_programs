package vect;

import java.util.Vector;
public class Test {

	public static void main(String[] args)
	{
     Vector<String>v=new Vector<String>(5,2);
     v.add("A");
     v.add("B");
     v.add("C");
     v.add("D");
     v.add("E");
     v.add("F");
     v.add("G");
     v.add("H");
    
     System.out.println("Size : "+v.size());
     System.out.println("Capacity : "+v.capacity()); 
     System.out.println(v);
	}

}
