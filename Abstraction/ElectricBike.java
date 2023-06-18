package abstraction;

abstract public class ElectricBike {

	abstract void BikeType();
	abstract void Brand();
	abstract void colour();
	abstract void Size();
	 void Wheeldiameter()
	{
		System.out.println("Wheel Diameter = 16 inch x 3 inch");
	}
	
}

 class HeroElectricZoin extends ElectricBike
{

	@Override
	void BikeType() {
	System.out.println("Bike Type : Electric Bike");
		
	}

	@Override
	void Brand() {
		System.out.println("Brand   : Bafang");
		
	}

	@Override
	void colour() {
	System.out.println("Colour   : c965 display");
		
	}

	@Override
	void Size() {
	System.out.println("Size    : Chain Wheel:52T With 13ah Battery");
		
	}

	 void Wheeldiameter()
		{
			System.out.println("Wheel Diameter = 14 inch x 2 inch");
		}
		
	
}
 
