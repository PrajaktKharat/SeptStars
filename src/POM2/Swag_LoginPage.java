package POM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swag_LoginPage {
	
	@FindBy(xpath="//input[@placeholder='Username']")private WebElement UN;
	
	@FindBy(xpath="//input[@placeholder='Password']")private WebElement PWD;
	
	@FindBy(xpath="//input[@name='login-button']")private WebElement login;
	
	public Swag_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUN()
	{
		UN.sendKeys("standard_user");
	}
	public void enterPWD()
	{
		PWD.sendKeys("secret_sauce");
	}
	
	public void clickOnLogin()
	{
		login.click();
	}

}
