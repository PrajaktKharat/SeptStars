package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example12_MultiBrowserTesting {
	@Parameters("pra")
	@Test
	public void TC(String pra) throws InterruptedException
	{
		
		WebDriver driver=null;
		
		if(pra.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		else if(pra.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		else if(pra.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
