import java.util.HashSet;

public class Empty {

	public static void main(String[] args) {
		HashSet<String>h=new HashSet<String>();
	    h.add("Red");
	    h.add("White");
	    h.add("Pink");
	    h.add("Yellow");
	    h.add("Black");
	    h.add("Green");
	    System.out.println("The Hash Set: "+h);
	    h.clear();
	    System.out.println("Hash Set Afer Removing All The Elements: "+h);

	}

}
