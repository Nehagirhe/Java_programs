package map;
import java.util.HashMap;

public class Program10 {
	public static void main(String[] args) {
     HashMap<Integer,String>h=new HashMap<Integer,String>();
     h.put(1, "Red");
     h.put(2, "Green");
     h.put(3, "Black");
     h.put(4, "White");
     h.put(5, "Blue");
     System.out.println("Sample Output: ");
     System.out.println("Value For Key 3 is: "+h.get(3));
	}

}
