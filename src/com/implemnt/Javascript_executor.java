package com.implemnt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_executor {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.in/");
		
		JavascriptExecutor a=(JavascriptExecutor)driver;
		
		a.executeScript("window.scrollBy(0,9000);");
		
		a.executeScript("window.scrollBy(0,-3000);");
		
		WebElement value = driver.findElement(By.xpath("//h2[text()='Amazon Pay | Book your travel tickets']"));
		
		a.executeScript("arguments[0].scrollIntoView();",value);
		
		a.executeScript("window.scrollBy(0,1995);");
		
		WebElement press = driver.findElement(By.xpath("//img[@alt='Daily essentials']"));
		a.executeScript("arguments[0].click();",press);
		
		a.executeScript("alert('verification');");
		
		a.executeScript("history.go(0)");
		
		
		
		
	}
}
