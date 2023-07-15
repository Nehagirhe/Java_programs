package arrList;
import java.util.ArrayList;
public class Retrieve {

	public static void main(String[] args) {
	ArrayList <String>a=new ArrayList<String>();
	a.add("Red");
	a.add("Green");
	a.add("Orange");
	a.add("White");
	a.add("Black");
	System.out.println(a);
	//System.out.println(a.add("Green"));
	System.out.println("First Element: "+a.get(0));
	System.out.println("Third Element: "+a.get(2));
	}

}
