package com.implemnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_function {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Frames.html");
 int size = driver.findElements(By.tagName("iframe")).size();
 System.out.println(size);
	
	WebElement single = driver.findElement(By.id("singleframe"));
	driver.switchTo().frame(single);
	
	WebElement move = driver.findElement(By.xpath("//input[@type='text'][1]"));
	move.sendKeys("Hello");
	
}

}
