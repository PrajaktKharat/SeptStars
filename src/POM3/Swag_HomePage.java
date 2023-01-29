package POM3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swag_HomePage {

	@FindBy(xpath="//div[@class='app_logo']")private WebElement logo;
	
	@FindBy(xpath="//button[text()='Open Menu']")private WebElement Openmenu;
	
	
	public Swag_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyLogo()
	{
		boolean result = logo.isDisplayed();
		
		if(result==true)
		{
			System.out.println("logo is found-->Pass");
		}
		else
		{
			System.out.println("logo not found-->Fail");
		}
	}
	
	public void ClickOnMenu()
	{
		Openmenu.click();
	}
	
	
	
	
	
	
	
}
