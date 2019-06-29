package arrays;

public class TwoDimentionalArray {

	public static void main(String[] args) 
	{
		String[][] arr= new String[5][2];

		//Row 1
		arr[0][0]="U1";
		arr[0][1]="P1";
		
		//Row 2
		arr[1][0]="U2";
		arr[1][1]="P2";
		
		//Row 3
		arr[2][0]="U3";
		arr[2][1]="P3";
		
		//Row 4
		arr[3][0]="U4";
		arr[3][1]="P4";
		
		//Row 5
		arr[4][0]="U5";
		arr[4][1]="P5";
		
		for(int r=0; r<arr.length; r++)
		{
			for(int c=0; c<arr[0].length; c++)
			{
				System.out.println(arr[r][c]);
			}
		}
	}

}
