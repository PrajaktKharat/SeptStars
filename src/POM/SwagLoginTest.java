package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLoginTest {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 SwagLab_LoginPage login=new  SwagLab_LoginPage(driver);
		 login.enterUN();
		 login.enterPWD();
		 login.clickOnLogin();
		 
		 Thread.sleep(5000);
		 
		 SwagLabHomePage home=new SwagLabHomePage(driver);
		 home.varifylogo();
		 home.clickOnOpenmenu();
		
		 Thread.sleep(5000);
		 
		 SwagLabMenuPage menu=new SwagLabMenuPage(driver);
		 menu.clickonlogout();
		 
		 Thread.sleep(5000);
		 
		 driver.close();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
