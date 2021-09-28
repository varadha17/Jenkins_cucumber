package com.baseTest;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Utilities.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {
	
	public static Properties prop;
	public static FileInputStream fis;
	public static WebDriver driver;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	
	public baseTest() {
		prop = new Properties();
		try {
			fis = new FileInputStream(Constants.testDataPath);
			prop.load(fis);
		} catch(Exception ex) {
			System.out.println(ex.getMessage()); 
		}
	}
	
	
	String browser = prop.getProperty("browser");
	
	public static void initialize_webdriver() {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("headless")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions ch = new ChromeOptions();
			ch.addArguments("window-size=1400x600");
			ch.addArguments("headless");
			driver = new ChromeDriver(ch);	
		} else {
			System.out.println("No Browser Found");
		}
		
		driver.get(prop.getProperty("url"));
		
		
	}

}
