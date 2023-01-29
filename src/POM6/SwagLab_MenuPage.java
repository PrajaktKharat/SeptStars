package POM6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLab_MenuPage {

	@FindBy(xpath="//a[text()='Logout']")private WebElement LogOut;
	
	public SwagLab_MenuPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpSwagLab_MenuPageLogout()
	{
		LogOut.click();
	}
	
	
}
