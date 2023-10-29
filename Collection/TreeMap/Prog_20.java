package Tree;
import java.util.TreeMap;

public class Prog_20 {
public static void main(String[] args) {
	TreeMap<Integer,String>t=new TreeMap<Integer,String>();
	t.put(10, "Red");
	t.put(20, "Green");
	t.put(30, "Black");
	t.put(40, "White");
	t.put(50, "Pink");
	System.out.println("Sample Output: ");
	System.out.println("Original TreeMap Content: "+t);
	System.out.println("\nSub Map Key-Values: "+t.subMap(20, 50));

	}

}
