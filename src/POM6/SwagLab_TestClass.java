package POM6;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLab_TestClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		SwagLab_LoginPage login=new SwagLab_LoginPage(driver);
		login.inpSwagLoginPageUserName();
		login.inpSwagLoginPagePassWord();
		login.inpSwagLoginPageLogin();
		
		Thread.sleep(2000);
		
		SwagLab_HomePage home=new SwagLab_HomePage(driver);
		home.inpSwagLab_HomePageVerifyLogo();
		home.inpSwagLab_HomePageopenMenu();
		
		Thread.sleep(2000);

		
		SwagLab_MenuPage menu=new SwagLab_MenuPage(driver);
		menu.inpSwagLab_MenuPageLogout();
		
		Thread.sleep(2000);
		
		driver.close();

		
		
		
		
	}
	
	
	

}
