package stringClass;

public class TestingStrings {

	public static void main(String[] args) 
	{
		String str="anand";
		String str2="Anand";
		String test="My name is Anand Bhayre";
		
		//1. CharAt
		System.out.println(str.charAt(3));
		
		//2. Length
		System.out.println(str.length());
		
		//3. Equals
		System.out.println(str.equals(str2));
		
		//4. EqualIgnorecase
		System.out.println(str.equalsIgnoreCase(str2));
		
		//5. Replace
		System.out.println(str.replace("anan", "Vishal"));
		
		//6. Split
		String[] arr=test.split(" ");
		for(String s:arr)
		{
			System.out.println(s);
		}
		
		//7. Sub string
		System.out.println(str.substring(3));
		System.out.println(str.substring(2, 4));
		
		

	}

}
