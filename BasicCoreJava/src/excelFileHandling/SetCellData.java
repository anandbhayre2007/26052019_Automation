package excelFileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class SetCellData {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\excelFileHandling\\TestData.xls");

		HSSFWorkbook wb = new HSSFWorkbook(file);

		HSSFSheet sheet = wb.getSheet("Sheet1");

		HSSFRow row = sheet.getRow(7);
		if (row == null)
			row = sheet.createRow(7);

		HSSFCell cell = row.getCell(7);
		if (cell == null)
			cell = row.createCell(7);

		
		cell.setCellValue("Anand");

		FileOutputStream fileOut = new FileOutputStream(System.getProperty("user.dir") + "\\src\\excelFileHandling\\TestData.xls");

		wb.write(fileOut);

		fileOut.close();
	}

}
