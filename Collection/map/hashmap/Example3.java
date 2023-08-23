package map;

import java.util.HashMap;
import java.util.Map;

public class Example3 {

	public static void main(String[] args) {
    HashMap<Integer,String>h=new HashMap<Integer,String>();
    System.out.println("Initial List Of Elements:"+h);
    h.put(100, "Amit");
    h.put(101, "Vijay");
    h.put(102, "Rahul");
    System.out.println("After Invoking Put() Method ");
    for(Map.Entry m:h.entrySet())
    {
    	System.out.println(m.getKey()+" "+m.getValue());
    }
    HashMap<Integer,String>m=new HashMap<Integer,String>();
    m.put(104, "Ravi");
    System.out.println("After Invoking PutAll()  method");
    for(map.entry)
	}

}
