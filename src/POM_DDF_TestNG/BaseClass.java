package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass  {
	
	WebDriver driver;
	
	public void initializeBrowser()
	
	{
		
	 driver=new ChromeDriver();
	 
	 driver.get("https://www.saucedemo.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
	 
	
	
	}
	
	

}
