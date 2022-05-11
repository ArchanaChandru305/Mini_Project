package com.implemnt;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_sample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement simple = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		simple.click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		Thread.sleep(2000);
		
		WebElement confirm = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		confirm.click();
		
		Alert alert2 = driver.switchTo().alert();
		//alert2.accept();
		alert2.dismiss();
		
		
		WebElement prompt = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		prompt.click();
		
		Thread.sleep(6000);
		
		Alert promptalert = driver.switchTo().alert();
		/*promptalert.sendKeys("Welcome to Selenium");
		String text=promptalert.getText();
		System.out.println("Text :"+text);
		promptalert.accept();*/
		promptalert.dismiss();
		
		
	}
}
