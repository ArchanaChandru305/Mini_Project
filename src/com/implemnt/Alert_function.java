package com.implemnt;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_function {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");

		WebElement simplealert = driver.findElement(By.id("alertButton"));
		simplealert.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement confirmalert = driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		
		driver.switchTo().alert().dismiss();
		
		WebElement promptalert = driver.findElement(By.id("promtButton"));
		promptalert.click();
		
		Thread.sleep(5000);
		
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("success");
		alert2.accept();
	}

}
