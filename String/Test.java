package neha;

public class Test {

	public static void main(String[] args) 
	{
	String s=new String("hello");        //2 memory heap/scp
	String s1="hello";                   //1 memory scp
	String s2="hello";                   //1 memory  scp
	String s3="World";
	String s4=new String("hello");       //2 memory heap/scp
	System.out.println(s==s1);           //compare object  
	System.out.println(s.equals(s1));    //compare data
	System.out.println(s1==s2);            //true
    System.out.println(s==s3);                //false
    System.out.println(s1==s3);              //false
    System.out.println(s.equals(s3));       //false
    System.out.println(s1.equals(s3));     //false
    System.out.println(s==s4);            //false
	System.out.println(s.equals(s4)); //true
	}

}
