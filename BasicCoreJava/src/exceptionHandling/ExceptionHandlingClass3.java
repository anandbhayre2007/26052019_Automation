package exceptionHandling;

import oops.abstraction.RBI;

public class ExceptionHandlingClass3 {

	public static void main(String[] args) throws InterruptedException {
				
		try {	//Exception Type 1: Unchecked Exception
				int a=10;
				int b=10;
				
				System.out.println(a/b);
				
				RBI obj=null;
				//obj.creditcard();
				
				String str="anand";
				System.out.println(str.charAt(5));
				
				System.out.println("anand");
				
				//Exception Type 2: check Exception
				Thread.sleep(3000);
				System.out.println("bhayre");
				Test.login();
		}catch(ArithmeticException e)
		{
			System.out.println("Divident is zero");
		}catch(NullPointerException e)
		{
			System.out.println("RBI refrence is not intialized");
		}catch(RuntimeException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("step 2");
	}

}
