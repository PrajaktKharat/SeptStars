package POM_DDF_TestNG_PropertyFile_FailedTCCesSS;

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
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import POM_DDF_TestNG.UtilityClass;

public class SwagTestClass_01 extends BaseClass {
	
	 SwagLab_loginPage_01 login;
	 SwagLab_HomePage_01 Home;
	 SwagLab_LogOut_01 logout;
	 int TCID;
	
	 
	 @BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		
		
		 initializeBrowser();
		
		 
		login=new SwagLab_loginPage_01(driver);
		 
		  Home=new SwagLab_HomePage_01(driver);
		 
		  logout=new SwagLab_LogOut_01(driver);
		 
	}
		 @BeforeMethod
		public void OpenToBrowser() throws EncryptedDocumentException, IOException 
		{
			
			login.inpSwagLabUsername(UtilityClass01.readDataFromPF("UN"));
			
			login.inpSwagLabPassWord(UtilityClass01.readDataFromPF("PWD"));
			
			login.ClickSwagLab();
			
		}
		 
		 @Test(priority = 1)
		 public void OpenHomePage() throws InterruptedException, EncryptedDocumentException, IOException
		 {
			 
			 
			 boolean result =Home.SwagHomePageVerifylogo();
			 Assert.assertTrue(result);
			 
			 TCID=101;
			 
	  }
		
		 @Test(priority = 2)
		 public void AddToCart() throws InterruptedException, EncryptedDocumentException, IOException
		 {
			 
			 TCID=102;
			 
           Home.SwagHomePageAddTOCart();
			 
			 Thread.sleep(1000);
			 
			 String exptext = UtilityClass01.GetTD(0, 2);
			 
			 String acttext = Home.getSwagLab_HomePage_01Remove();
			 
			 Assert.assertEquals(acttext, exptext);
			 
			 
		 }
		 
		 
		 
		 
		 
		 
		 
		 @AfterMethod
		 public void OpenMenu(ITestResult s1) throws IOException
		 {
			 if(s1.getStatus()==ITestResult.FAILURE)
			 {
				 UtilityClass01.captureSS(driver, TCID);
			 }
			 
			 Home.SwagHomePageOpenMenu();
			 
			 logout.SwagLabLogout();
			 
		 }
		 
		@AfterClass	 
		public void LogOut() throws InterruptedException
		{
			
			
			//Thread.sleep(500);
		
		   driver.close();
		}
	
	
	
	
	
	
	
	

}
