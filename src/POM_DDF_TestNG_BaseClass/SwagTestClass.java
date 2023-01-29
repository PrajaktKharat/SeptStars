package POM_DDF_TestNG_BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_DDF_TestNG.UtilityClass;

public class SwagTestClass extends BaseClass {
	
	 SwagLab_loginPage login;
	 SwagLab_HomePage Home;
	 SwagLab_LogOut logout;
	 
	
	 
	 @BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		
		
		 initializeBrowser();
		 UtilityClass.GetTD(0, 2);
		 UtilityClass.captureSS(driver,0);
		 
		login=new SwagLab_loginPage(driver);
		 
		  Home=new SwagLab_HomePage(driver);
		 
		  logout=new SwagLab_LogOut(driver);
		 
	}
		 @BeforeMethod
		public void OpenToBrowser() throws EncryptedDocumentException, IOException 
		{
			
			login.inpSwagLabUsername(UtilityClass.GetTD(0, 0));
			
			login.inpSwagLabPassWord(UtilityClass.GetTD(0, 1));
			
			login.ClickSwagLab();
			
		}
		 
		 @Test
		 public void OpenHomePage() throws InterruptedException, EncryptedDocumentException, IOException
		 {
			 boolean result = Home.SwagHomePageVerifylogo();
			 Assert.assertTrue(result);
			 
			 Home.SwagHomePageAddTOCart();
			 
			 Thread.sleep(1000);
			 
			 Home.SwagHomePageRemove(UtilityClass.GetTD(0, 2));
			 
			 
		 }
		 
		 @AfterMethod
		 public void OpenMenu()
		 {
			 Home.SwagHomePageOpenMenu();
			 
		 }
		 
		@AfterClass	 
		public void LogOut() throws InterruptedException
		{
			logout.SwagLabLogout();
			
			Thread.sleep(500);
		
		   driver.close();
		}
	
	
	
	
	
	
	
	

}
