package com.implemnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Events {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
		// Click
		
		WebElement clickbutton = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		Actions act=new Actions(driver);
		
		act.click(clickbutton).build().perform();
		
		// Right click
		WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
		
		act.contextClick(rightclick).build().perform();
		
		//Double click
		
		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
		
		act.doubleClick(doubleclick).build().perform();
		
		// Move to element 
		
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		WebElement swing = driver.findElement(By.xpath("//a[@aria-label='Fashion']"));
		
		act.moveToElement(swing).build().perform();
		
		act.click(swing).build().perform();
		
		// Drag And Drop concept
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		
		WebElement drag = driver.findElement(By.id("draggable"));
		
		WebElement drop = driver.findElement(By.id("draggable"));		
	
		act.dragAndDrop(drag, drop).build().perform();		
		
		
	}

}
