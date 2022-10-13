package driverManger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	public WebDriver driver;	
	
//Manager class for initializing driver once

public WebDriver getDriver() {
	
	if (driver==null) {
		
		System.setProperty("DISPLAY", "localhost:0.0");
		FirefoxOptions options = new FirefoxOptions();
		//ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.chromedriver().setup();
		driver = new FirefoxDriver(options);
		//driver = new ChromeDriver(options);
		
		//WebDriverManager.chromedriver().setup();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--no-sandbox"); // Bypass OS security model, MUST BE THE VERY FIRST OPTION
		//options.addArguments("--headless");
		//options.setExperimentalOption("useAutomationExtension", false);
		//options.addArguments("start-maximized"); // open Browser in maximized mode
		//options.addArguments("disable-infobars"); // disabling infobars
		//options.addArguments("--disable-extensions"); // disabling extensions
		//options.addArguments("--disable-gpu"); // applicable to windows os only
		//options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		//driver = new ChromeDriver(options);
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
