import java.util.HashSet;
import java.util.ArrayList;
public class Que9 {
	
		public static void main(String[] args) {
			HashSet<String>h=new HashSet<String>();
			h.add("Red");
			h.add("White");
		    h.add("Pink");
		    h.add("Yellow");
		    h.add("Black");
		    h.add("Green");
		System.out.println("Original Hash Set: "+h);
		ArrayList<String>a=new ArrayList<String>(h);
	    System.out.println("ArrayList Contains: "+a);
	}

}
