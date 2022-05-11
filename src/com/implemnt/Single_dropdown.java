package com.implemnt;

import java.awt.List;
import java.io.IOException;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Single_dropdown {

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
		
	WebElement day = driver.findElement(By.id("day"));
	
	Select sel=new Select(day);
	sel.selectByValue("30");
	
	WebElement mnth = driver.findElement(By.id("month"));
	Select s1=new Select(mnth);
	s1.selectByIndex(2);
	
	WebElement yr = driver.findElement(By.id("year"));
	Select s2=new Select(yr);
	s2.selectByValue("1993");
	
	//s2.deselectByValue("1993");
	
	//s1.deselectByVisibleText("Mar");
	
	System.out.println("Get Options");
	
	java.util.List<WebElement> alloption = sel.getOptions();
	for(WebElement all: alloption)
	{
	String text=all.getText();
	System.out.println("Get text :"+text);
	}
	
	System.out.println();
	System.out.println("Get First Selected");
	System.out.println();
	
	WebElement firstselect=sel.getFirstSelectedOption();
	String text= firstselect.getText();
	System.out.println("First selected :"+text);
	
	System.out.println();
	System.out.println("Get All Selected");
	System.out.println();
	
	java.util.List<WebElement> allselected =sel.getAllSelectedOptions();
	
	for(WebElement allsel : allselected)
	{
	String text1= allsel.getText();
	System.out.println("All Selected:"+text1);
	
	}
	
	}
	
}