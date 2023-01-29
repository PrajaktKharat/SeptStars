package POM1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag_LoginTest {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Swag_loginPage login=new Swag_loginPage(driver);
		login.enterUN();
		login.enterPWD();
		login.clickonloginbtn();
		
		Thread.sleep(2000);
		 Swag_HomePage home=new  Swag_HomePage(driver);
		 home.virefylogo();
		 home.clickonopenmenu();
	
		
		Thread.sleep(2000);
		 Swag_MenuPage menu=new  Swag_MenuPage(driver);
		 menu.Clickonlogout();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
