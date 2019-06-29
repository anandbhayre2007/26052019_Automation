package collections.set;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) 
	{
		HashSet<String> set= new HashSet<>();
		
		set.add("name");
		set.add("surname");
		set.add("address");
		set.add("name");
		set.add("surname");
		set.add("address");
		
		for(String s:set)
		{
			System.out.println(s);
		}

	}

}
