package WebDriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s1 {

	public static void main(String[] args) throws InterruptedException {
		
		
        WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.meesho.com/");
		
		String title= driver.getTitle();
		System.out.println(title);
		
		
		
		
	}
	
	
	
	
	
	
	
}
