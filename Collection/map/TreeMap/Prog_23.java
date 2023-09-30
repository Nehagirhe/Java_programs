package Tree;
import java.util.TreeMap;

public class Prog_23 {
	public static void main(String[] args) 
{
	TreeMap<Integer,String>t=new TreeMap<Integer,String>();
	t.put(10, "Red");
	t.put(20, "Green");
	t.put(30, "Black");
	t.put(40, "White");
	t.put(50, "Pink");
	System.out.println("Sample Output: ");
	System.out.println("\nOriginal TreeMap Content: "+t);
    System.out.println("Keys Greater Than Or Equal To 20: "+t.ceilingEntry(20));
    System.out.println("Keys Greater Than Or Equal To 40: "+t.ceilingEntry(40));
    System.out.println("Keys Greater Than Or Equal To 50: "+t.ceilingEntry(50));
}
}
