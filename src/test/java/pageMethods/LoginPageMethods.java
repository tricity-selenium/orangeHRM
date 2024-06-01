package pageMethods;

import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage_Objects;

public class LoginPageMethods {
	
	LoginPage_Objects loginpageObjects;
	
	public LoginPageMethods(WebDriver driver)
	{
		loginpageObjects = new LoginPage_Objects(driver);
	}
	
	public void doLogin()
	
	{
		loginpageObjects.username.sendKeys("Admin");
		loginpageObjects.password.sendKeys("admin123");
		loginpageObjects.loginButon.click();
		
	}

}
