package overriding;

public class Bike extends Vehicle
{
void run()
{
System.out.println("Bike Is Not Running");
}
	
public static void main(String[] args) 
{
Bike B=new Bike();
B.run();
}
}
