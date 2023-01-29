package POM_DDF_TestNG_PropertyFile_FailedTCCesSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLab_loginPage_01 {
	
	
	 @FindBy (xpath="//input[@placeholder='Username']")	 private WebElement UN;
	 @FindBy (xpath="//input[@placeholder='Password']")  private WebElement Pwd;
	 @FindBy (xpath="//input[@name='login-button']")  private WebElement Login;
	 
	 
	 public SwagLab_loginPage_01(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	 public void inpSwagLabUsername(String username)
	 {
		 UN.sendKeys(username);
	 }
	 
	 public void inpSwagLabPassWord(String Password)
	 {
		 Pwd.sendKeys(Password);
	 }
	 
	 public void ClickSwagLab()
	 {
		 Login.click();
	 }

}
