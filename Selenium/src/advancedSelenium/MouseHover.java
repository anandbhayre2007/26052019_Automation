package advancedSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.Library;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException 
	{
		Library lib= new Library();
		
		WebDriver dr=lib.launchBrowser("https://www.flipkart.com/");
		
		//Implicit wait
		//dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();		
		Actions act= new Actions(dr);		
		act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();
		
		//Explicit wait
		WebDriverWait wait= new WebDriverWait(dr, 50);
	    wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[text()='Shirts']"))));
		
		dr.findElement(By.xpath("//a[text()='Shirts']")).click();
		
		Thread.sleep(3000);
		
		//Drag and Drop
		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]")), 50, 0).build().perform();

		Thread.sleep(3000);
		
		//Drag and Drop
		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[2]")), -50, 0).build().perform();
		
		Thread.sleep(3000);

		dr.findElement(By.xpath("//img[@class='_3togXc']")).click();
	}

}
