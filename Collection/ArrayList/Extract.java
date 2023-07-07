package arrList;
import java.util.ArrayList;

public class Extract {

	public static void main(String[] args) {
		ArrayList <String>a=new ArrayList<String>();
		a.add("Red");
		a.add("Green");
		a.add("Orange");
		a.add("White");
		a.add("Black");
	    System.out.println("Original list: "+a);
	    System.out.println("List Of First Three Elements: ");
	    System.out.println(a.subList(0, 3));
	}

}
