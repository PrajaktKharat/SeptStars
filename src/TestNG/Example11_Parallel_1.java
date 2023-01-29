package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example11_Parallel_1 {
	
	@Test
	public void TC1() throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.olacabs.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.close();
		
	}
	
	
	
	
	
	
	
	

}
