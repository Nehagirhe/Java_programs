import java.util.HashSet;

public class Convert {

	public static void main(String[] args) {
		HashSet<String>h=new HashSet<String>();
	    h.add("Red");
	    h.add("White");
	    h.add("Pink");
	    h.add("Yellow");
	    h.add("Black");
	    h.add("Green");
	    System.out.println("The Hash Set: "+h);
	  // String Arr[]=new String[5];
		h.toArray();
	    System.out.println("Array Elements: ");
	    for(String s:h)
	    {
	    	System.out.println(s);
	    }
	    }

}
