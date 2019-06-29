package conditionalStatments;

public class NestedIf {

	public static void main(String[] args) 
	{
		
		boolean login=true;
		
		if(login)
		{
			System.out.println("Login passed successfully");
			
			boolean logoDisplayed=false;
			if(logoDisplayed){
				System.out.println("Correct logo is displayed");
			}else {
				System.out.println("Home page is not displayed properly");
			}
			
		}else {
			System.out.println("Login failed");
		}

	}

}
