package POM_DDF_TestNG_BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLab_HomePage {
	
	@FindBy(xpath="//div[@class='app_logo']")   private WebElement verifylogo;
	
	@FindBy(xpath="(//button[@class='btn btn_primary btn_small btn_inventory'])[1]")   private WebElement AddTOCart;
	
	@FindBy(xpath="//button[@class='btn btn_secondary btn_small btn_inventory']")   private WebElement Remove;
	
	@FindBy(xpath="//button[text()='Open Menu']")   private WebElement OpenMenu;
	
	
	public SwagLab_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean SwagHomePageVerifylogo()
	{
		boolean result = verifylogo.isDisplayed();
		return result;
	}
	
	public void SwagHomePageAddTOCart()
	{
		AddTOCart.click();
	}
	
	public void SwagHomePageRemove( String expText)
	{
		String actText = Remove.getText();
		if(actText.equals(expText))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	public void SwagHomePageOpenMenu()
	{
		 OpenMenu.click();
	}

}
