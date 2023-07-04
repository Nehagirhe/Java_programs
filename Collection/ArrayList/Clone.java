package arrList;

import java.util.ArrayList;

public class Clone {

	public static void main(String[] args) {
ArrayList<String>a=new ArrayList<String>();
a.add("Red");
a.add("Green");
a.add("Black");
a.add("White");
a.add("Pink");
System.out.println("Original Array List: "+a);
a.clone();
System.out.println("Cloned Array List: "+a);
}

}
