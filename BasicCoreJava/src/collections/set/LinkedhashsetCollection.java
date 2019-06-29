package collections.set;

import java.util.LinkedHashSet;

public class LinkedhashsetCollection {

	public static void main(String[] args) {

		LinkedHashSet<String> set= new LinkedHashSet<>();
		
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
