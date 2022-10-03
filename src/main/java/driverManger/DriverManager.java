package driverManger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	public WebDriver driver;	
	
//Manager class for initializing driver once

public WebDriver getDriver() {
	
	if (driver==null) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-dev-shm-usage");
		//disable-dev-shm-usage
		driver = new ChromeDriver(options);
		//driver = new ChromeDriver(new ChromeOptions());
	}
	return driver;
}
	public void closeDriver() {
		
		if (driver!=null) {
			driver.quit();
			driver = null;
		}
	}
	
}
