package functions;

public class Car 
{
	String name;
	String colour;
	int speed;
	static int wheels=4;
	
	
	public Car(String name, String colour, int speed)
	{
		this.name=name;
		this.colour=colour;
		this.speed=speed;
	}
	
	//Default Constructor
	public Car() {
		
	}

	public void driving()
	{
		System.out.println("I am driving "+colour+" colour "+name+" which has "+wheels+" wheels");
	}

}
