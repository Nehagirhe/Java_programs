package arrList;
import java.util.ArrayList;

public class Replace {

	public static void main(String[] args) {
		ArrayList <String>a=new ArrayList<String>();
		a.add("Red");
		a.add("Green");
		System.out.println("Original Array List: "+a);
		a.set(1, "White");
		System.out.println("Replace Second Element with 'White'.\n"+a);
	}

}
