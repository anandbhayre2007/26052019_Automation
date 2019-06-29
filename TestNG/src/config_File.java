package configuration;

public class config_File 
{
	 public final static String reportPath=System.getProperty("user.dir")+"\\src\\test\\java\\reports\\";
	 public final static String screenShotPath=System.getProperty("user.dir")+"\\src\\test\\java\\screenshots\\";
	 public final static String testdata=System.getProperty("user.dir")+"\\src\\test\\java\\testdata\\TestData.xls";
	 public final static String or=System.getProperty("user.dir")+"\\src\\test\\java\\objectrepository\\OR.properties";
	 
	 public final static String driverpath=System.getProperty("user.dir")+"\\BrowserDriver\\";
	 
	 //update this variable
	 public final static String operabinary="C:\\Users\\AB46772\\AppData\\Local\\Programs\\Opera\\launcher.exe";
	 
	 public final static String url="http://www.newtours.demoaut.com/";
	 public final static long implicitwait=2;
	 public final static long explicitwait=3;
}
