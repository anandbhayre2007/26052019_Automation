package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();		
		dr.manage().window().maximize();		
		dr.get("http://www.newtours.demoaut.com/");
		
		//Css selector
		dr.findElement(By.cssSelector("input[name='userName']")).sendKeys("kdhhgkdfhgk");
		dr.findElement(By.cssSelector("input[name='password']")).sendKeys("asrregre");
		dr.findElement(By.name("login")).click();
	
		
		//Link text and Partial link
		//dr.findElement(By.linkText("REGISTER")).click();
		
		//Partial link Text
		//dr.findElement(By.partialLinkText("GIST")).click();
		
		//Xpath
		
	}

}
