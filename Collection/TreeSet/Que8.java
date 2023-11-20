import java.util.HashSet;
import java.util.TreeSet;
public class Que8 {

	public static void main(String[] args) {
	HashSet<String>h=new HashSet<String>();
	h.add("Red");
	h.add("White");
    h.add("Pink");
    h.add("Yellow");
    h.add("Black");
    h.add("Green");
System.out.println("Original Hash Set: "+h);
TreeSet<String>t=new TreeSet<String>(h);
System.out.println("TreeSet Elements: ");
for(String s:t)
{
System.out.println(s);
}
	}

}
