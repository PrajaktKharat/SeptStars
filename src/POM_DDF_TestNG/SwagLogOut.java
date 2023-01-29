package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLogOut {
	
	
	@FindBy(xpath="//a[text()='Logout']")private WebElement Logout;
	
	public SwagLogOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SwagPageLogout()
	{
		Logout.click();
	}
	
	
	
	
	

}
