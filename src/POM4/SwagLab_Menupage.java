package POM4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLab_Menupage {

	
	@FindBy(xpath="//a[text()='Logout']")private WebElement LogOut;
	
	public  SwagLab_Menupage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void inpSwagMenupageLogOut()
	{
		LogOut.click();
	}
	
	
	
	
	
}
