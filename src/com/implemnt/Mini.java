package com.implemnt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini {
	public static void main(String[] args) throws Throwable {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationpractice.com/");
				
		WebElement mini = driver.findElement(By.xpath("//a[@class='login']"));
		mini.click();
		
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("shravya@gmail.com");
		
		//Thread.sleep(1000);
		WebElement create = driver.findElement(By.id("SubmitCreate"));
		create.click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement rad = driver.findElement(By.xpath("//input[@value='2']"));
		rad.click();
		
		WebElement fname = driver.findElement(By.xpath("//input[@class='is_required validate form-control'][1]"));
		fname.sendKeys("Shravya");
		
		WebElement lname = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		lname.sendKeys("chandru");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("123456");
		
		WebElement date = driver.findElement(By.id("days"));
		Select s=new Select(date);
		s.selectByValue("30");
		
		WebElement month = driver.findElement(By.id("months"));
		Select s1=new Select(month);
		s1.selectByIndex(3);
		
		WebElement year = driver.findElement(By.name("years"));
		Select s2=new Select(year);
		s2.selectByValue("1993");
		
		WebElement afname = driver.findElement(By.xpath("//input[@class='form-control']"));
		
		afname.sendKeys("Lohith");	
		
		WebElement alname = driver.findElement(By.xpath("//input[@id='lastname']"));
		alname.sendKeys("Nivas");
		
		WebElement comp = driver.findElement(By.xpath("//input[@id='company']"));
		comp.sendKeys("Lohith VMC");
		
		WebElement add = driver.findElement(By.id("address1"));
		add.sendKeys("plot no:148, KM Layout, Ganesh Nagar");
		
		WebElement add2 = driver.findElement(By.id("address2"));
		add2.sendKeys("Near Railway station");
		
		WebElement cit = driver.findElement(By.id("city"));
		cit.sendKeys("Hosur");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select ss=new Select(state);
		ss.selectByIndex(1);
		
		WebElement pincode = driver.findElement(By.id("postcode"));
		pincode.sendKeys("00000");
		
		WebElement country = driver.findElement(By.id("id_country"));
		Select count=new Select(country);
		count.selectByValue("21");
		
		WebElement detail = driver.findElement(By.id("other"));
		detail.sendKeys("i am mother of lohith");
		
		WebElement ph = driver.findElement(By.id("phone"));
		ph.sendKeys("875453212");
		
		WebElement mph = driver.findElement(By.id("phone_mobile"));
		mph.sendKeys("9876543210");
		
		WebElement ali = driver.findElement(By.xpath("//input[@name='alias']"));
		ali.sendKeys("plot 18,ganesh nagar");
		
		WebElement sub = driver.findElement(By.xpath("//button[@name='submitAccount']"));
		sub.click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Accounted Created Successfully");
		alt.accept();
	}
}
