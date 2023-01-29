package POM6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLab_LoginPage {

	@FindBy(xpath="//input[@placeholder='Username']")private WebElement UN;
	@FindBy(xpath="//input[@placeholder='Password']")private WebElement PWD;
	@FindBy(xpath="//input[@name='login-button']")private WebElement Login;
	
	public SwagLab_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpSwagLoginPageUserName()
	{
		UN.sendKeys("standard_user");
		
	}
	public void inpSwagLoginPagePassWord()
	{
		PWD.sendKeys("secret_sauce");
	}
	public void inpSwagLoginPageLogin()
	{
		Login.click();
	}
	
	
	
	
	
}
