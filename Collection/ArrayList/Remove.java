package arrList;
import java.util.ArrayList;
public class Remove {

	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList<String>();
		a.add("Red");
		a.add("Green");
		a.add("Orange");
		a.add("White");
		a.add("Black");
	    System.out.println("Sample Output: "+a);
		a.remove(2);
		System.out.println("\nAfter Removing Third element From the List: "+a);
	}

}
