package collections.set;

import java.util.TreeSet;

public class TreeSetCollection {

	public static void main(String[] args) {
		
		TreeSet<String> set= new TreeSet<>();		
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
