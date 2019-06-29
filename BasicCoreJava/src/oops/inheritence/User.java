package oops.inheritence;

public class User {

	public static void main(String[] args) 
	{
		Smartphone phone= new Smartphone();
		phone.internet();
		phone.texting();
		phone.calling();
		
		Telephone obj=new Telephone();
		obj.calling();
		
		// byte, short, int, long
		
		long a=674475878;
		
		Telephone tel=new Telephone();
		tel=new Mobile();
		tel=new Smartphone();

	}

}
