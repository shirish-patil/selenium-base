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
import com.pselenium.test.searchResultPage.SearchResultPageTestService;

public class SearchResultPageTest extends SeleniumTest {
	public WebDriver driver;
	private final Logger logger = LogManager.getLogger(SearchResultPageTest.class);
		
	@BeforeTest
	public void startTest() throws IOException {
		driver = initialize();	
	}
	
	@Test
	public void result() {
		
		SearchResultPageTestService searchResult= new SearchResultPageTestService(driver);
		
		searchResult.resultScreenPage();
	
		
		
			}
}
