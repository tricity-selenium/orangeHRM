package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class DashboardPage_Objects {
	
	
	public DashboardPage_Objects(WebDriver driver)
	{
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
	}
	
	
	public @FindBy(xpath = "//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	WebElement headerText;
	
	public @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")
	WebElement adminLink;
    
	
	
	
}
