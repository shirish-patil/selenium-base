package com.pselenium.test.google;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.inject.Key;

public class GoogleHomePageTestService {
	private final Logger logger = LogManager.getLogger(GoogleHomePageTestService.class);


	private WebDriver driver;

	public GoogleHomePageTestService(WebDriver driver) {
		this.driver= driver;
	}


	public void testHomePage() {
		logger.info("***** Google Home Page test starts...");	
		GoogleHomePageXpathContainer googleHomePageXpathContainer= new GoogleHomePageXpathContainer(driver);

		// Actual test should be written here.
		// EX:
		
		googleHomePageXpathContainer.getSearchTextBox().sendKeys("SeleniumHQ Browser Automation");
		
		Actions action= new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
		
		
		//	googleHomePageXpathContainer.getUserNameTextBox().sendKeys("shirish@madakethealth.com");
		//	googleHomePageXpathContainer.getPasswordTextBox().sendKeys("Madaket?2015");
		//	googleHomePageXpathContainer.getLoginButton().click();


		logger.info("***** Google Home Page test ends here *****");
	}		

}
