package functions;

public class AccessModifiers 
{
	public static void main(String[] args) 
	{
		AccessModifiers obj= new AccessModifiers();
		obj.publicMethod();
		obj.privateMethod();
		obj.NoAccessMethod();
		obj.protectedMethod();
		
	}
	
	//Public method
	public void publicMethod()
	{
		System.out.println("Public method");
	}
			
	//PRivate method
	private void privateMethod()
	{
		System.out.println("Private method");
	}
		
	//NoAccessMethod method
	void NoAccessMethod()
	{
		System.out.println("No Access Modifier method");
	}
	
	//Protected method
	protected void protectedMethod()
	{
		System.out.println("Protected method");
	}

}
