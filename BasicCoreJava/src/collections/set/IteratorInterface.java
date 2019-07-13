package collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorInterface {

	public static void main(String[] args) 
	{
		HashSet<String> set= new HashSet<>();
		
		set.add("Anand");
		set.add("Deepak");
		set.add("Amruta");
		set.add("Preksha");
		
		/*for(String s:set)
		{
			System.out.println(s);
		}*/
		
		Iterator it=set.iterator();
				
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
