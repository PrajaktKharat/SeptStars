package WebDriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7_selected {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		
		Thread.sleep(2000);
		
		boolean result = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("radio btn selected");
		}
	
		else
		{
			System.out.println("radio btn de-selected");
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
		boolean raj = driver.findElement(By.xpath("(//input[@name='sex'])[1]")).isSelected();
	
		System.out.println(raj);
		
		if (raj==true)
		{
			System.out.println("Radio btn selected");
		}
		
		else
		{
			System.out.println("Radio btn not-selected");
		}
		
		
		boolean ravi = driver.findElement(By.xpath("//input[@class='_8esa']")).isDisplayed();
		
		System.out.println(ravi);
		
		if(ravi==true)
		{
			System.out.println("displayed");
		}
		
		else
		{
			System.out.println("not displayed");
		}
		
		
		
		
	}
	
	
	
	
	
	
}
