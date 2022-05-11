package com.implemnt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_type {
	
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().to("https://www.instagram.com/?hl=en");
		
		driver.navigate().back();
		
		driver.manage().window().maximize();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();
		
	}

}
