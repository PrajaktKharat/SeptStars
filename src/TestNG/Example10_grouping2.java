package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example10_grouping2 {

	@Test(groups="login")
	public void TC5()
	{
	   Reporter.log("running TC5");
	   
	}
	
	@Test(groups="login")
	public void TC6()
	{
	   Reporter.log("running TC6");
	   
	}
	
	
	@Test(groups="setting")
	public void TC7()
	{
	   Reporter.log("running TC7");
	   
	}
	
	@Test(groups="profile")
	public void TC8()
	{
	   Reporter.log("running TC8");
	   
	
	
	}
	
	
	
	
	
	
	
	
	
}
