package com.implemnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop_concept {
	
			public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
					
					WebDriver driver=new ChromeDriver();
					
					driver.get("https://demoqa.com/droppable");
					
					Actions drag =new Actions(driver);
					
					WebElement drag1 = driver.findElement(By.id("draggable"));
					
					WebElement drophere = driver.findElement(By.id("droppable"));
					
					drag.dragAndDrop(drag1, drophere).build().perform();
					
		
	}

}
