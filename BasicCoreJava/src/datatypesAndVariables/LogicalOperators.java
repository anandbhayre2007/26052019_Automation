package datatypesAndVariables;

public class LogicalOperators {

	public static void main(String[] args) 
	{
		int a=40;
		int b=20;
		int c=30;
		
		//And
		if(a>b && a>c)
		{
			System.out.println("A is greatest");
		}else {
			System.out.println("A is not greatest");
		}
		
		//OR
		if(a>b || a>c)
		{
			System.out.println("A is greater than either B or C");
		}else
		{
			System.out.println("A is smallest");
		}
		
		
		

	}

}
