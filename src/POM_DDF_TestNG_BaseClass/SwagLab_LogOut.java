package POM_DDF_TestNG_BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLab_LogOut {
	
	
	@FindBy (xpath="//a[text()='Logout']")	 private WebElement Logout;
	
	
	public SwagLab_LogOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SwagLabLogout()
	{
		Logout.click();
	}
	
	
	
	
	
	

}
