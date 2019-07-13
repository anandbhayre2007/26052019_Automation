package basicSelenium;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.*;

public class ReadExcel {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream file= new FileInputStream(System.getProperty("user.dir")+"\\src\\excelFileHandling\\TestData.xls");
		
		HSSFWorkbook wb= new HSSFWorkbook(file);
		
		HSSFSheet sheet=wb.getSheet("Sheet1");
				
		HSSFRow row=sheet.getRow(1);		
		
		HSSFCell cell=row.getCell(0);
		
		String val=cell.getStringCellValue();
		
		
		int rows=sheet.getLastRowNum();	
		int cols=row.getLastCellNum();
		
		System.out.println(rows);
		System.out.println(cols);
		
		for(int r=0; r<=rows; r++)
		{
			for(int c=0; c<cols; c++)
			{
				String val1=sheet.getRow(r).getCell(c).getStringCellValue();
				System.out.println(val1);
			}
		}		
	}
	
	

}
