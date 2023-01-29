package POM_DDF_TestNG_PropertyFile_FailedTCCesSS;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	WebDriver driver;
	
	public void initializeBrowser() throws IOException
	
	{
		
	 driver=new ChromeDriver();
	 
	 driver.get(UtilityClass01.readDataFromPF("URL"));
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
	 
	
	
	}
	
	
	
	
	
	

}
