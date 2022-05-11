package com.implemnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("Lohith");
		
	WebElement	password=driver.findElement(By.id("pass"));
		
		password.sendKeys("1234567890");
		
		WebElement signin =driver.findElement(By.name("login"));
		signin.click();
	}

}
