package basicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class LaunchBrowser {

	public static void main(String[] args)
	{
		/*System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		
		dr.get("http://www.newtours.demoaut.com/");*/
		
		
		System.setProperty("webdriver.opera.driver", "D:\\Drivers\\operadriver.exe");
		OperaOptions op = new OperaOptions();
		op.setBinary("C:\\Users\\AB46772\\AppData\\Local\\Programs\\Opera\\launcher.exe");
		OperaDriver dr1 = new OperaDriver(op);

	}

}
