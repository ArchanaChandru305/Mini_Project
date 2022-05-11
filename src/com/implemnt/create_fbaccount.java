package com.implemnt;


import java.io.IOException;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class create_fbaccount {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");


	WebElement username = driver.findElement(By.name("email"));
	username.sendKeys("Lohith");
	
    WebElement password=driver.findElement(By.id("pass"));
	password.sendKeys("123456789");
	
	//WebElement log =driver.findElement(By.xpath("//button[@name='login']"));
//	log.click();
	
	
	
	Thread.sleep(3000);	
	
	WebElement opaccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	opaccount.click();
	
	Thread.sleep(3000);	
	
	WebElement fname= driver.findElement(By.name("firstname"));
	fname.sendKeys("Abi");
	
	WebElement lname =driver.findElement(By.name("lastname"));
	lname.sendKeys("lohi");
	
	WebElement mob=driver.findElement(By.name("reg_email__"));
	mob.sendKeys("9876543210");
	
	WebElement pass=driver.findElement(By.id("password_step_input"));
	pass.sendKeys("31622");
		
	}
}
