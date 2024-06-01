package tutorials;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class WebDriverManagerDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		
		    System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64 2\\msedgedriver.exe");			
		    WebDriver driver = new EdgeDriver();	    	  	  
		    //driver.manage().window().maximize();		    
		    //driver.get("https://www.selenium.dev/");
		    
		    
		   //// WebDriver driver = WebDriverManager.firefoxdriver().create();
		    //driver.manage().window().maximize();
		    driver.get("https://demoqa.com/automation-practice-form");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.findElement(By.id("uploadPicture")).click();
		   // Runtime.getRuntime().exec("F//QAFile.exe");
		    
		    
		    
		   
		   

	}

}
