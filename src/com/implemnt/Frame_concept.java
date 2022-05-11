package com.implemnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_concept {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		// Single Frame
		driver.switchTo().frame("singleframe");	
		// Passing input to Single frame text box
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("ArchanaChandru");
		Thread.sleep(3000);		
		// To get exit from frame to webpage
		driver.switchTo().defaultContent();
		
		// Multi Frame
		WebElement multiframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		multiframe.click();
		
		//Switching into parentframe
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		
		//Switching into childframe
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe);
		
		//Passing Input to Multiframe text box
		WebElement textbox1 = driver.findElement(By.xpath("//input[@type='text']"));
		textbox1.sendKeys("Lohith");
		
		// Getting exit from innerframe to outerframe
		driver.switchTo().parentFrame();
		
		// Getting exit from outer frame to webpage
		driver.switchTo().defaultContent();
		
	}

}
