package oops.polymorphism;

public class User2 {

	public static void main(String[] args) 
	{		
		NoDirectObject obj= NoDirectObject.getObject();
		obj.age=30;	
		
		NoDirectObject obj2= NoDirectObject.getObject();
		obj2.age=32;
		
		System.out.println(obj.age);
		System.out.println(obj2.age);
				
	}

}
