package overriding;

public class B extends A{
void operations(int b,int c)
{
	a=b*c;
	System.out.println(a);
}
	public static void main(String[] args) {
		
B a=new B();
a.operations(6, 5);
	}

}
