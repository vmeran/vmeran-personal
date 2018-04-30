package gbh.step.definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class BrowserConfig {
	
	public static WebDriver driver;
	
	@Before("@firefox")
	public void setUpFirefox() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Víctor Merán\\eclipse\\geckodriver.exe");
		 
		driver = new FirefoxDriver();
		
	}
	
	@After
	public static void setDownClass() {
		
		for(String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			driver.close();
		}
	}

}
