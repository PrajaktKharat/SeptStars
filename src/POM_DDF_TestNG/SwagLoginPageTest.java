package POM_DDF_TestNG;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;

public class SwagLoginPageTest extends BaseClass {

	
	Swag_LoginPage login;
	SwagLab_HomePage Home;
	SwagLogOut logout;
	
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException 
	{
		
		
		 initializeBrowser();
		 login =new Swag_LoginPage(driver);
		
		 Home = new SwagLab_HomePage(driver);
		
		  logout=new SwagLogOut(driver);
	}
	
	@BeforeMethod
	public void loginTopage() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.inpSwagLoginPageUsername(UtilityClass.GetTD(0,0));
		Thread.sleep(500);
		login.inpSwagLoginPagePassWord(UtilityClass.GetTD(0, 1));
		Thread.sleep(500);

		login.ClickOnLoginbnt();
		
	}
	
	@Test
	public void HomePage() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		boolean result1 = Home.verifylogoSwagHomePage();
		Assert.assertTrue(result1);
		Thread.sleep(500);

		Home.SwagHomePageAddToCart();
		Thread.sleep(500);

		Home.SwagHomePageRemove(UtilityClass.GetTD(0, 2));
		
		
	}
	
	@AfterMethod
	public void OpenMenu()
	{
		Home.SwagHomePageOpenMenu();
	}
	
	@AfterClass
	public void LogOutPage1() throws InterruptedException
	{
		
		logout.SwagPageLogout();
		Thread.sleep(500);
		
		driver.close();
	}
	
	
}
