package collections;

import java.util.LinkedList;

public class LinkedListCollection {

	public static void main(String[] args) 
	{
		LinkedList<String> list= new LinkedList<>();
		
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
