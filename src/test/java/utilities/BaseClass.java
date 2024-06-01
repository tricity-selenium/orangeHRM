package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageMethods.DashboardPageMethods;
import pageMethods.LoginPageMethods;

public class BaseClass {
	public WebDriver driver;
	
	public LoginPageMethods loginPageMethods;
	public DashboardPageMethods dashboardPageMethods;
	
	
	
	public void intialize()
	{
		
		loginPageMethods = new LoginPageMethods(driver);
		dashboardPageMethods = new DashboardPageMethods(driver);
	}
	
	@BeforeTest	
    public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		intialize();
		
	}
	
	
	@AfterTest
	
	public void closeBrowser()
	{
		//driver.close();
	}

}
