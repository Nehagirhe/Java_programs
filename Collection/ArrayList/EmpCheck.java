package arrList;

import java.util.ArrayList;
import java.util.Collections;
public class EmpCheck {

	public static void main(String[] args) {
		ArrayList <String>a=new ArrayList<String>();
		a.add("Red");
		a.add("Green");
		a.add("Black");
		a.add("White");
		a.add("Pink");
		System.out.println("Original Array List: "+a);
		System.out.println("Checking the above array list is empty or not! ");
		System.out.println(a.isEmpty());
		System.out.println("Arraylist After Remove All Elements : "+Collections.EMPTY_LIST);
		a.removeAll(a);
		System.out.println("Checking the above array list is empty or not! ");
		System.out.println(a.isEmpty());
	}

}
