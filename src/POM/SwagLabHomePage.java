package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage {

	
	@FindBy(xpath="//div[@class='app_logo']") private WebElement logo;
	
	@FindBy(xpath="//button[text()='Open Menu']")private WebElement openMenu;
	
	
	public SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void varifylogo()
	{
		boolean ruselt = logo.isDisplayed();
		if(ruselt==true)
		{
			System.out.println("logo is found-->Pass");
		}
		else
		{
			System.out.println("logo not found --->Fail");
		}
	}
	
	public void clickOnOpenmenu()
	{
		openMenu.click();
	}
	
	
	
	
	
	
}
