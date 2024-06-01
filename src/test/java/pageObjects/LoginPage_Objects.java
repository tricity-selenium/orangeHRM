package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_Objects {
	
	public LoginPage_Objects(WebDriver driver) 
	{
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
				
	}
		
	public @FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	
	public @FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	
	public @FindBy(xpath = "//button[@type='submit']")
	WebElement loginButon;
	
	
	

}
