package collections;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String[] args) 
	{
		ArrayList<String> list= new ArrayList<>();
		
		list.add("Name");
		list.add("Surname");
		list.add("Address");
		
		System.out.println(list.get(0));
		
		for(String s:list)
		{
			System.out.println(s);
		}
		
		System.out.println(list.size());

	}

}
