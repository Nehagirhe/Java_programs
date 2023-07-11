package arrList;

import java.util.ArrayList;

public class Join {

	public static void main(String[] args) {
		ArrayList <String>a=new ArrayList<String>();
		a.add("Red");
		a.add("Green");
		a.add("Black");
		a.add("White");
		a.add("Pink");
		System.out.println("List Of First Array: "+a);
		ArrayList<String>b=new ArrayList<String>();
		b.add("Red");
		b.add("Green");
		b.add("Black");
		b.add("Pink");
        System.out.println("List Of Second Array: "+a);
	    a.addAll(b);
	    System.out.println("New Array: "+a);
	}

}
