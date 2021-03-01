package com.pselenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotHelper {
	
	public static String takeScreenShotAndReturnFilePath(String testCaseName, WebDriver driver) throws IOException {
		
		System.out.println("+++++++++++++ScreenShot captured+++++++++++++++");
		
		TakesScreenshot screenShot= (TakesScreenshot) driver;
		File source= screenShot.getScreenshotAs(OutputType.FILE);
		
		String screenShotDestinationFilePath= System.getProperty("user.dir")+ "/reports/"+testCaseName+".png";
		
		FileUtils.copyFile(source, new File(screenShotDestinationFilePath));
		
		return screenShotDestinationFilePath;	
	}
}
