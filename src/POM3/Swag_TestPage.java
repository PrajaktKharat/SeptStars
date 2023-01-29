package POM3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swag_TestPage {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Swag_LoginPage login=new Swag_LoginPage( driver);
		login.enterUN();
		login.enterPWD();
		login.clickOnLogin();
		
		Thread.sleep(2000);
		
		Swag_HomePage home=new Swag_HomePage(driver);
		home.VerifyLogo();
		home.ClickOnMenu();
		
		Thread.sleep(2000);
		
		Swag_MenuPage menu=new Swag_MenuPage(driver);
		menu.ClickOnLogOut();
		
		Thread.sleep(2000);
		
		driver.close();

		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
