ofpackage neha;

public class Strbuffer {

	public static void main(String[] args) {
		String s="hello";
		s=s+" i ";
		
		System.out.println(s);
		s=s+"am ";
		
		System.out.println(s);
		s=" Neha";
		
	   StringBuffer s1=new StringBuffer("hello");
	   s1.append(" I ");
	   s1.append("Am ");
		
	   s1.append("Neha ");
	   System.out.println(s1);
		
	   System.out.println(s1.delete(0,5));
	   System.out.println(s1.insert(0, "Hello"));


	}

}
