package collections;

import java.util.ArrayList;

public class ListImplementations {

	public static void main(String[] args) 
	{
		
		ArrayList list= new ArrayList<>();
		
		list.add(100);
		list.add(true);
		list.add("anand");
		
		for(Object o:list)
		{
			System.out.println(o);
		}

	}

}
