package abstraction;

abstract class Parent
{
	abstract void Message();
}

class Child1 extends Parent
{

	@Override
	void Message() {
		System.out.println(" This Is First Subclass ");
	}
	
}

class Child2 extends Parent
{

	@Override
	void Message() {
	System.out.println(" This Is Second Subclass ");
		
	}
	
}

public class ParentTest {

	public static void main(String[] args) {
		  
		Parent p=new Child1();
		p.Message();
		Child2 c2=new Child2();
		c2.Message();
	}

}
