package POM4;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabTest {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		SwagLab_LoginPage login=new SwagLab_LoginPage(driver);
		login.inpSwagLoginPageUsernmae();
		login.inpSwagLoginPagePassWord();
		login.inpSwagLoginPageLogin();
		
		
		SwagLab_HomePage home=new SwagLab_HomePage(driver);
		home.inpSwagLabHomepageVirefyLogo();
		home.inpSwagLabHomepageOpenmenu();
		
	
		
		SwagLab_Menupage menu=new SwagLab_Menupage(driver);
		menu.inpSwagMenupageLogOut();
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
