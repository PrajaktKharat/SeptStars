package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example10_grouping {

	@Test(groups="login")
	public void TC1()
	{
	   Reporter.log("running TC1");
	   
	}
	
	@Test(groups="login")
	public void TC2()
	{
	   Reporter.log("running TC2");
	   
	}
	
	
	@Test(groups="setting")
	public void TC3()
	{
	   Reporter.log("running TC3");
	   
	}
	
	@Test(groups="profile")
	public void TC4()
	{
	   Reporter.log("running TC4");
	   
	}
	
}
