package Interface;

interface Area
{
	int l=10;
	int b=5;
	int s=7;
	double r=2.5;
	void rectArea();
	void squareArea();
	void circleArea();
}

class B implements Area
{

	@Override
	public void rectArea() {
	System.out.println("Area Of Rectangle : "+l*b);
	}

	@Override
	public void squareArea() {
	System.out.println("Area Of Square : "+s*s);
	}

	@Override
	public void circleArea() {
	System.out.println("Area Of Circle : "+3.14*r*r);
		
	}
	
}
public class Test {

	public static void main(String[] args) {
		B b=new B();
		b.circleArea();
		b.rectArea();
        b.squareArea();
	}

}
