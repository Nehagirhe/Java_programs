package arrList;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {

	public static void main(String[] args) {
		ArrayList <String>a=new ArrayList<String>();
		a.add("Red");
		a.add("Green");
		a.add("Black");
		a.add("White");
		a.add("Pink");
		System.out.println("Array List Before Swap: "+a);
		Collections.swap(a, 0, 2);
		System.out.println("Array List After Swap: "+a);
	}

}
