package com.implemnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerOuter_frames {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement multi = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
multi.click();

int size1 = driver.findElements(By.tagName("iframe")).size();
System.out.println(size1);

WebElement outer = driver.findElement(By.xpath("///body[@aria-hidden='false']"));
driver.switchTo().frame(outer);

}
}