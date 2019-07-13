package basicSelenium;

import java.io.IOException;

public class ReadExxcelData {

	public static void main(String[] args) throws IOException
	{
		Xls_Reader obj= new Xls_Reader("D:\\26052019\\26052019_Automation\\Selenium\\src\\testdata\\TestDataFile.xls");
		
		int rows=obj.getrowcount("Sheet1");
		int cols=obj.getColumncount("Sheet1");
		
		System.out.println(rows);
		System.out.println(cols);
		
		String str=obj.getCellData("Sheet1", 1, 1);		
		System.out.println(str);
		
		String str2=obj.getCellData("Sheet1", 2, "surname");
		System.out.println(str2);
		
		obj.setCellData("Sheet1", "surname", 3, "abcjhgkds");
	}

}
