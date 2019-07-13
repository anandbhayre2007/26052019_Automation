package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebtable2 
{
	public static void main(String[] args) 
	{
		Library lib= new Library();
		
		//Launch Browser
		WebDriver dr=lib.launchBrowser();
		
		List<WebElement> Rowslist=dr.findElements(By.xpath("//table[@border='2']/tbody/tr"));
		
		
		List<WebElement> Columnlist=dr.findElements(By.xpath("//table[@border='2']/tbody/tr[1]/td"));	

		int rows=Rowslist.size();
		
		int cols=Columnlist.size();
		
		System.out.println(rows);
		System.out.println(cols);
		
		
		for(int r=1; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{				
				String val=dr.findElement(By.xpath("//table[@border='2']/tbody/tr["+r+"]/td["+c+"]")).getText();		
				System.out.println(val);				
			}			
		}
		
		
		
		
	}
	
	

}
