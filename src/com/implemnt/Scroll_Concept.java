package com.implemnt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Concept {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement beauty = driver.findElement(By.xpath("//img[@alt='Amazing Deals on Beauty Products']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();",beauty);
		
		Thread.sleep(2000);
		
		WebElement earphone = driver.findElement(By.xpath("//img[contains(@alt,'Airdopes')]"));
		
		js.executeScript("arguments[0].scrollIntoView();",earphone);
	}

}
