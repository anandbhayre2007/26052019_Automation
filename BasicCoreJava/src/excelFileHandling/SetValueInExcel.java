package excelFileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class SetValueInExcel {

	public static void main(String[] args) throws IOException 
	{
		String path=System.getProperty("user.dir") + "\\src\\excelFileHandling\\TestData.xls";
		
		FileInputStream file = new FileInputStream(	path);

		HSSFWorkbook wb = new HSSFWorkbook(file);

		HSSFSheet sheet = wb.getSheet("Sheet1");

		HSSFRow row = sheet.getRow(56);
		if (row == null)
			row = sheet.createRow(56);


		HSSFCell cell = row.getCell(1);
		if (cell == null)
			cell = row.createCell(1);

		
		cell.setCellValue("Anand");
		
		FileOutputStream fileOut = new FileOutputStream(path);

		wb.write(fileOut);

		fileOut.close();
				

	}

}
