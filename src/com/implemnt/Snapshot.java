package com.implemnt;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapshot {

	public static void main(String[] args) throws IOException, InterruptedException {
					
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			WebElement username= driver.findElement(By.name("email"));
			username.sendKeys("abcxyz");
			
			WebElement password = driver.findElement(By.name("pass"));
			password.sendKeys("98752112");
			
			WebElement press = driver.findElement(By.xpath("//button[@name='login']"));
			press.click();
			
			Thread.sleep(3000);
			
			TakesScreenshot ts= (TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\images\\snap.png");
		FileUtils.copyFile(source, destination);
	}
}
