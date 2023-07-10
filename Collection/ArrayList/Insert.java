package arrList;
import java.util.ArrayList;
public class Insert {

	public static void main(String[] args)
	{
	ArrayList <String>a=new ArrayList<String>();
	a.add("Red");
	a.add("Green");
	a.add("Orange");
	a.add("White");
	a.add("Yellow");
	a.add("Black");
	System.out.println(a);
	a.add(0, "Pink");
	System.out.println("\n"+a);
	}

}
