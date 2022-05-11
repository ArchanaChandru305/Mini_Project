package com.implemnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta_login {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("Lohith");
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("123456789");

		WebElement log=driver.findElement(By.xpath("//div[text()='Log In']"));
		log.click();
}
}
