package com.pselenium.test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pselenium.SeleniumTest;
import com.pselenium.test.google.GoogleHomePageTestService;

public class GooleHomePageTest extends SeleniumTest {
	public WebDriver driver;
	private final Logger logger = LogManager.getLogger(GooleHomePageTest.class);
		
	@BeforeTest
	public void startTest() throws IOException {
		driver = initialize();	
	}
	
	@Test
	public void login() {
		driver.get(prop.getProperty("BaseUrl"));
		GoogleHomePageTestService googleHomePageTestService = new GoogleHomePageTestService(driver);
		googleHomePageTestService.testHomePage();		
	}
}
