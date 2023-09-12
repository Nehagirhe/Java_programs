package Tree;
import java.util.TreeMap;

public class Prog_6
{
	public static void main(String[] args) {
 TreeMap<String,String>t=new TreeMap<String,String>();
 t.put("c1", "Red");
 t.put("c2", "Green");
 t.put("c3", "Black");
 t.put("c4", "White");
 System.out.println("Original TreeMap Content: "+t);
 t.clear();
 System.out.println("The New Map: "+t);
 
	}

}
