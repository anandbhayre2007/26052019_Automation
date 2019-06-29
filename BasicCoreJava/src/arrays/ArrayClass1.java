package arrays;

public class ArrayClass1 {

	public static void main(String[] args) 
	{
		String user="Anand";		
		String[] arr= new String[10];
		arr[0]="Preksha";
		arr[1]="Amruta";
		arr[2]="Pankaj";
		arr[3]="Bidyut";
		arr[4]="Shikha";
		arr[5]="Deepak";
		arr[6]="Vishal";
		arr[7]="Vijay";
		arr[8]="Snehal";
		arr[9]="Neha";
		
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
		

	}

}
