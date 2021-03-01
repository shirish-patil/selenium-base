package com.pselenium.test.searchResultPage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.pselenium.test.google.GoogleHomePageTestService;
import com.pselenium.test.google.GoogleHomePageXpathContainer;

public class SearchResultPageTestService {
	
	private final Logger logger = LogManager.getLogger(GoogleHomePageTestService.class);


	private WebDriver driver;

	public SearchResultPageTestService(WebDriver driver) {
		this.driver= driver;
	}


	public void resultScreenPage() {
		logger.info("***** Google Search Result Page test starts...");	
		//GoogleHomePageXpathContainer googleHomePageXpathContainer= new GoogleHomePageXpathContainer(driver);

		SearchResultPageXpathContainer googleSearchResult= new SearchResultPageXpathContainer(driver);
		
		googleSearchResult.getSearchResult().click();
		
		// Actual test should be written here.
		// EX:
		
		
		
		
		//	googleHomePageXpathContainer.getUserNameTextBox().sendKeys("shirish@madakethealth.com");
		//	googleHomePageXpathContainer.getPasswordTextBox().sendKeys("Madaket?2015");
		//	googleHomePageXpathContainer.getLoginButton().click();


		logger.info("***** Google Search Result Page test ends here *****");
	}		

	
	

}
