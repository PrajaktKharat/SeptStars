package POM5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLag_MenuPage {
	
	
	@FindBy(xpath="//a[text()='Logout']")private WebElement LogOut;
	
	public SwagLag_MenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpSwagLab_LogOut()
	{
		LogOut.click();
	}
	
	
	
	
	
	
	
	

}
