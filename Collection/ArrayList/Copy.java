package arrList;

import java.util.ArrayList;

public class Copy {

	public static void main(String[] args) {
		ArrayList <Integer>a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println("List 1: "+a);
		ArrayList<Character>b=new ArrayList<Character>();
		b.add('A');
		b.add('B');
		b.add('C');
		b.add('D');
		System.out.println("List 2: "+b);
		System.out.println("After Copy");
		
		
	}

}
