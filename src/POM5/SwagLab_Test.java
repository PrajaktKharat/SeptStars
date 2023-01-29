package POM5;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLab_Test {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		SwagLab_LoginPage login=new SwagLab_LoginPage(driver);
		login.inpSwagLab_UserName();
		login.inpSwagLab_PassWord();
		login.inpSwagLab_login();
		
		Thread.sleep(2000);
		
		SwagLab_HomePage home=new SwagLab_HomePage(driver);
		home.inpSwagLab_VarifyLogo();
		home.inpSwagLab_ClickOnOpenMenu();
		
		
		Thread.sleep(2000);
		
		SwagLag_MenuPage menu=new SwagLag_MenuPage(driver);
		menu.inpSwagLab_LogOut();
		
		Thread.sleep(2000);
		
		driver.close();


		
		
		
	}
	
	
	
	
	
	

}
