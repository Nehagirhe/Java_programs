package arrList;

import java.util.ArrayList;
import java.util.Collections;

public class Empty {

	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList<String>();
		a.add("Red");
		a.add("Green");
		a.add("Black");
		a.add("White");
		a.add("Pink");
		System.out.println("Original Array List: "+a);
		a.removeAll(a);
		System.out.println("Array List After Remove All Elements: "+Collections.EMPTY_LIST);
	}

}
