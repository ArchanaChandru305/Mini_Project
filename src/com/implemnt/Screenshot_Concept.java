package com.implemnt;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Concept {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot screen =(TakesScreenshot) driver;
		
		File source = screen.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\ScreenShot\\mypic.png");
		
		FileUtils.copyFile(source, destination);
	}
}
