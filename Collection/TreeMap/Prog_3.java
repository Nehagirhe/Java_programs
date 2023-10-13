package Tree;
import java.util.TreeMap;
public class Prog_3 {

	public static void main(String[] args) {
TreeMap<String,String>t=new TreeMap<String,String>();
t.put("c1", "Red");
t.put("c2", "Green");
t.put("c3", "Black");
t.put("c4", "White");
System.out.println("Output: "+t);
if(t.containsKey("c1"))
System.out.println("The Tree Map Contains Key C1");
else
System.out.println("The Tree Map Does Not Contain Key C5");
}

}
