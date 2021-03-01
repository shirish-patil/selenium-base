package com.pselenium.test.google;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePageXpathContainer {
	private final Logger logger = LogManager.getLogger(GoogleHomePageXpathContainer.class);
	
	public WebDriver driver;
	public GoogleHomePageXpathContainer(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// Google home page Xpaths should go here
	// EX:
	
	private By searchTextBox= By.xpath("//input[@title='Search']");
	
	
	//private By userNameTextBox= By.id("username");
	//private By passwordTextBox= By.id("password");
	
	
	public WebElement getSearchTextBox() {
		return driver.findElement(searchTextBox);
	}
		
		

//	public WebElement getUserNameTextBox() {
//		return driver.findElement(userNameTextBox);
//	}
//	
//	public WebElement getPasswordTextBox() {
//		return driver.findElement(passwordTextBox);
//	}
}