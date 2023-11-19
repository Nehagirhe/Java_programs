import java.util.HashSet;

public class Que5 {

	public static void main(String[] args)
	{
		HashSet<String>h=new HashSet<String>();
	    h.add("Red");
	    h.add("White");
	    h.add("Pink");
	    h.add("Yellow");
	    h.add("Black");
	    h.add("Green");
	    System.out.println("The Hash Set: "+h);
	    System.out.println("\nChecking the Above Array List Is Empty Or Not! "+h.isEmpty());
        System.out.println("\nRemove All Elements From a Hash Set:");
        h.removeAll(h);
        System.out.println("\nHash Set After Removing All The Elements:"+h);
       
	}

}
