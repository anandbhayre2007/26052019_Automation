package basicSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program1 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();		
		dr.manage().window().maximize();		
		dr.get("http://www.newtours.demoaut.com/");
		dr.findElement(By.name("userName")).sendKeys("mercury");
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		
		
		String path=System.getProperty("user.dir") + "\\src\\testdata\\TestData.xls";
		FileInputStream file= new FileInputStream(path);
		
		HSSFWorkbook wb= new HSSFWorkbook(file);
		
		HSSFSheet sheet=wb.getSheet("Sheet4");
				
		
		
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		
		Select sel= new Select(dr.findElement(By.xpath("//select[@name='passCount']")));
		sel.selectByIndex(2);
		
		dr.findElement(By.name("findFlights")).click();
		
		dr.findElement(By.name("reserveFlights")).click();
		
		String firstName=sheet.getRow(1).getCell(0).getStringCellValue();
		String lastname=sheet.getRow(1).getCell(1).getStringCellValue();
		String card=sheet.getRow(1).getCell(2).getStringCellValue();
		String expected=sheet.getRow(1).getCell(3).getStringCellValue();
		
		dr.findElement(By.name("passFirst0")).sendKeys(firstName);
		dr.findElement(By.name("passLast0")).sendKeys(lastname);
		dr.findElement(By.name("creditnumber")).sendKeys(card);
		
		dr.findElement(By.name("buyFlights")).click();
		
		String str=dr.findElement(By.xpath("//font[contains(text(),'itinerary has been booked!')]")).getText();
		
		HSSFCell cell=sheet.getRow(1).getCell(4);
		
		if(cell==null)
			cell=sheet.getRow(1).createCell(4);
		cell.setCellValue(str);
		
		FileOutputStream fileOut = new FileOutputStream(path);

		wb.write(fileOut);

		fileOut.close();
		
		if(str.equals(expected))
		{
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		
		System.out.println(str);

	}

}
