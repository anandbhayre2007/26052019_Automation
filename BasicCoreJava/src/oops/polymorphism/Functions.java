package oops.polymorphism;

public class Functions 
{

	public int sum(int a, int b)
	{
		return a+b;
	}
	
	public int sum(int a, int b, int c)
	{
		return 10;
	}
	
	
	public Functions getIntance()
	{
		return new Functions();
	}
	
	
	public int sum(int a, String b)
	{
		return a;
	}
	
	public String sum(String b,int a )
	{
		return a+b;
	}
}
