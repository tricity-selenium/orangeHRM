package pageMethods;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.DashboardPage_Objects;

public class DashboardPageMethods {
	
	DashboardPage_Objects dashboardPageObjects;
	
	public DashboardPageMethods(WebDriver driver)
	{
		dashboardPageObjects = new DashboardPage_Objects(driver);
	}

	
	public void checkHeaderText()
	{
		Assert.assertEquals(dashboardPageObjects.headerText.getText(), "Dashboard");
	}
	
	public void clickAdminMenu()
	{
		dashboardPageObjects.adminLink.click();
	}
	
	
}
