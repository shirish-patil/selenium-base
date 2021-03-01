package com.pselenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {
	private static final Logger logger = LogManager.getLogger(SeleniumTest.class);
	
	
	public static String browserName;
	public static Properties prop;
	private static WebDriver driver;

	public WebDriver initialize() throws IOException {
		
		if(driver!=null) {
			return driver;
		}

		prop = new Properties();		
		FileInputStream fileAppProp=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/application.properties");
		prop.load(fileAppProp);
		browserName = prop.getProperty("Browser");
		System.out.println(browserName);

		if (browserName.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", prop.getProperty("webdriver.path"));
			ChromeOptions options= new ChromeOptions();
			//options.addArguments("--window-size=1920,1080");
			//options.addArguments("headless");
			
			driver = new ChromeDriver(options);

		} 
		else if (browserName.equals("FireFox")) {

			// Write code for FireFox browser
		} 
		else if (browserName.equals("Safari")) {

			// Write code for Safari browser
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		return driver;
	}
}


