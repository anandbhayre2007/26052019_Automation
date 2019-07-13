package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebtable 
{
	public static void main(String[] args) 
	{
		Library lib= new Library();
		
		//Launch Browser
		WebDriver dr=lib.launchBrowser();
		
		List<WebElement> Rowslist=dr.findElements(By.xpath("//table[@border='2']/tbody/tr"));
		
		
		List<WebElement> Columnlist=dr.findElements(By.xpath("//table[@border='2']/tbody/tr/td"));	

		
		for(WebElement e:Columnlist)
		{
			System.out.println(e.getText());
		}
		
		
	}
	
	

}
