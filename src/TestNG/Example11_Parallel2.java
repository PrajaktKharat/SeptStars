package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example11_Parallel2 {

	@Test
	public void TC2() throws InterruptedException
	{
		

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.uber.com/in/en/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
