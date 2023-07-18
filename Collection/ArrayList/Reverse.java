package arrList;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList<String>();
		System.out.println("List Before Reversing :");
		a.add("Red");
		a.add("Green");
		a.add("Orange");
		a.add("White");
		a.add("Black");
		System.out.println(a);
		System.out.println("List Before Reversing :");
        Collections.reverse(a);   
        System.out.println(a);
      

	}

}
