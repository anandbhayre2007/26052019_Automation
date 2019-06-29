package oops.abstraction;

public class User2 {

	public static void main(String[] args) 
	{
		RBI acc=bankFeature("ICICI");
		
		acc.creditcard();
		acc.debitcard();
		acc.savingAccount();
		acc.netbanking();
		acc.demonetization();
		
		
		SC.RBIGuideLines();
		
		

	}
	
	public static RBI bankFeature(String bankname)
	{
		RBI acc=null;
		
		if(bankname.equals("HDFC"))
		{
			acc=new HDFC();
		}else if(bankname.equals("ICICI"))
		{
			acc=new ICICI();
		}else if(bankname.equals("Axes"))
		{
			acc=new Axes();
		}
		return acc;		
	}

}
