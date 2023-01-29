package POM3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swag_MenuPage {

	@FindBy(xpath="//a[text()='Logout']")private WebElement LogOut;
	
	public Swag_MenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnLogOut()
	{
		LogOut.click();
	}
	
}
