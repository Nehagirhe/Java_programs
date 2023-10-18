package Tree;

import java.util.TreeMap;

public class Prog_10 {

	public static void main(String[] args) {
   TreeMap<String,String>t=new TreeMap<String,String>();
   t.put("c1", "Green");
   t.put("c2", "Red");
   t.put("c3", "White");
   t.put("c4", "Black");
   System.out.println("Original TreeMap Content: "+t);
   System.out.println("Reverse Order View Of The Keys: "+t.descendingKeySet());
}
}
