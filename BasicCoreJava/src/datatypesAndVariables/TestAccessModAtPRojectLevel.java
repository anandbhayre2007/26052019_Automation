package datatypesAndVariables;

import functions.AccessModifiers;

public class TestAccessModAtPRojectLevel extends AccessModifiers{

	public static void main(String[] args) {
		
		AccessModifiers obj= new AccessModifiers();
		obj.publicMethod();
		
		TestAccessModAtPRojectLevel obj1= new TestAccessModAtPRojectLevel();
		obj1.protectedMethod();
				
	}

}
