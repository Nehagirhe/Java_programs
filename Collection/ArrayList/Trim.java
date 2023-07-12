package arrList;

import java.util.ArrayList;

public class Trim {

	public static void main(String[] args) {
		ArrayList <String>a=new ArrayList<String>();
		a.add("Red");
		a.add("Green");
		a.add("Black");
		a.add("White");
		a.add("Pink");
		System.out.println("Original Array List: "+a);
		System.out.println("Let trim to size the above array:");
		a.trimToSize();
		System.out.println(a);
	}

}
