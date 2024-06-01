package testScript;

import org.testng.annotations.Test;

import utilities.BaseClass;

public class TestScript1 extends BaseClass{
	
	@Test(priority =1)
	
	public void loginTest()
	
	
	{
		loginPageMethods.doLogin();
		
		loginPageMethods.doLogin();
				
	}	
	
	@Test (priority =2)
	
	public void dashboardTest()
	{
		dashboardPageMethods.checkHeaderText();
		dashboardPageMethods.clickAdminMenu();
	}
	
	

}
