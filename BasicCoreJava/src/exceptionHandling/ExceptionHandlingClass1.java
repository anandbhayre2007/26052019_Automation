package exceptionHandling;

import oops.abstraction.RBI;

public class ExceptionHandlingClass1 {

	public static void main(String[] args) throws InterruptedException 
	{
		//Exception Type 1: Unchecked Exception
		int a=10;
		int b=0;
		
		System.out.println(a/b);
		
		RBI obj=null;
		obj.creditcard();
		
		String str="anand";
		System.out.println(str.charAt(5));
		
		System.out.println("anand");
		
		//Exception Type 2: check Exception
		Thread.sleep(3000);
		System.out.println("bhayre");
		Test.login();
	}

}
