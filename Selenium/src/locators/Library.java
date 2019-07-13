package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Library 
{
	
	public WebDriver launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();		
		dr.manage().window().maximize();		
		dr.get("http://www.newtours.demoaut.com/");
		
		return dr;
		
	}	
	
	public WebDriver launchBrowser(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();		
		dr.manage().window().maximize();		
		dr.get(url);
		
		return dr;
		
	}

}
