package abstraction;

abstract class Shape
{
	abstract void RectangleArea(int l,int b);
	abstract void SquareArea(int x);
	abstract void CircleArea(double r);
}

class Area extends Shape
{

	@Override
	void RectangleArea(int l, int b) {
	System.out.println("Area Of Rectangle : "+l*b);	
	}

	@Override
	void SquareArea(int x) {
	System.out.println("Area Of Square : "+x*x);
 
	}

	@Override
	void CircleArea (double r) {
	System.out.println("Area Of Circle : "+3.14*r*r);

	}

	
}
public class ShapeTest {

	public static void main(String[] args) {
	Area A=new Area();
	A.RectangleArea(5, 6);
	A.SquareArea(7);
	A.CircleArea(4);

	}

}
