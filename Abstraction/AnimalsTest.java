package abstraction;

abstract class Animals
{
	abstract void Cats();
	abstract Void dogs();
}

class Cats extends Animals{

	@Override
	void Cats() {
		System.out.println("Cats Meow Meow");	
	}
	
class Dogs extends Animals
{
	@Override
	 dogs() {
		System.out.println("Dogs Bhaoo Bhaooooo");	
		return null;
	}

}	
	
}
public class AnimalsTest {
	
	public static void main(String[] args) {
	Cats A=new Cats();
	A.Cats();
	Dogs B=new Dogs();
	B.dogs();

	}

}
