package arrList;
import java.util.ArrayList;
import java.util.Scanner;
public class Sort {

	public static void main(String[] args) {
	ArrayList<String>a=new ArrayList();
	System.out.println("List Before Sort : ");
	a.add("Red");
	a.add("Green");
	a.add("Orange");
	a.add("White");
	a.add("Black");
	System.out.println(a);
    System.out.println("List After Sort :");
    a.sort(null);
    System.out.println("\n"+a);
	}

}
