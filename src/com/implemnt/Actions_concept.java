package com.implemnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_concept {
	
	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		Actions act=new Actions(driver);
		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(doubleclick).build().perform();
		
		Actions act1=new Actions(driver);
		WebElement clicks = driver.findElement(By.xpath("//button[text()='Click Me']"));
		act1.click(clicks).build().perform();
		
		Actions act2=new Actions(driver);
		WebElement riteclick = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		act2.contextClick(riteclick).build().perform();
		
		
	}

}
