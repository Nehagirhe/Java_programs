package abstraction;

abstract class A{
	A()
	{
	System.out.println("This Is Constructor Of Abstract Class");
	}
	abstract void a_method();
	void b_method()
	{
	System.out.println("This Is A Normal Method Of Abstract Class");
	}
}
class Subclass extends A{

	@Override
	void a_method() {
		System.out.println("This Is Abstract Method");
	}
}
	
public class Const {

	public static void main(String[] args) {
		
   Subclass s=new Subclass();
   s.a_method();
   s.b_method();
	}

}
