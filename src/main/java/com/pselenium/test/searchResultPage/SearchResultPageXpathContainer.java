package com.pselenium.test.searchResultPage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pselenium.test.google.GoogleHomePageXpathContainer;

public class SearchResultPageXpathContainer {
	
private final Logger logger = LogManager.getLogger(GoogleHomePageXpathContainer.class);
	
	public WebDriver driver;
	public SearchResultPageXpathContainer(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// Google home page Xpaths should go here
	// EX:

	private By searchResult= By.xpath("//*[@id='rso']/div[1]/div[1]/div/div/div[1]/a/h3/span");
	
	
	
	
	public WebElement getSearchResult() {
		return driver.findElement(searchResult);
	}
	

}
