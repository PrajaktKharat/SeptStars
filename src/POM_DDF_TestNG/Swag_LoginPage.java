package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swag_LoginPage {

	
	@FindBy(xpath="//input[@placeholder='Username']")private WebElement UN;
	@FindBy(xpath="//input[@placeholder='Password']")private WebElement PWD;
	@FindBy(xpath="//input[@name='login-button']")private WebElement login;
	
	
	public  Swag_LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpSwagLoginPageUsername(String username)
	{
		UN.sendKeys(username);
	}
	
	public void inpSwagLoginPagePassWord(String password)
	{
		PWD.sendKeys(password);
	}
	
    public void ClickOnLoginbnt()
    {
    	login.click();
    }
	
	
}
