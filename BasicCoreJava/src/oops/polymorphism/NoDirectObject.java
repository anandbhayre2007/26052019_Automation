package oops.polymorphism;

public class NoDirectObject 
{
	int age;
	private static NoDirectObject obj= new NoDirectObject();
	
	private NoDirectObject()
	{
		
	}

	public static NoDirectObject getObject()
	{
		return obj;
	}
}
