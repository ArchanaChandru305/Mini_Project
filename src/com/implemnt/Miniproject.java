package com.implemnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class Miniproject {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("ArchanaChandru");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("archana");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		WebElement location = driver.findElement(By.name("location"));
		Select s=new Select(location);
		s.selectByValue("London");
		WebElement hotels = driver.findElement(By.name("hotels"));
		Select s1=new Select(hotels);
		s1.selectByIndex(1);
		WebElement room = driver.findElement(By.id("room_type"));
		Select s2 = new Select(room);
		s2.selectByVisibleText("Super Deluxe");
		WebElement room_nos = driver.findElement(By.name("room_nos"));
		Select s3=new Select(room_nos);
		s3.selectByValue("1");
		WebElement adult = driver.findElement(By.name("adult_room"));
		Select s4=new Select(adult);
		s4.selectByIndex(1);
		WebElement child = driver.findElement(By.name("child_room"));
		Select s5=new Select(child);
		s5.selectByVisibleText("1 - One");
		WebElement submit = driver.findElement(By.name("Submit"));
		submit.click();
		WebElement radio = driver.findElement(By.name("radiobutton_0"));
		radio.click();
		WebElement conti = driver.findElement(By.name("continue"));
		conti.click();
		WebElement fname = driver.findElement(By.name("first_name"));
		fname.sendKeys("Archana");
		WebElement lname = driver.findElement(By.name("last_name"));
		lname.sendKeys("Chandru");
		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys("Plot no:158, Balaji Nagar");
		WebElement cnum = driver.findElement(By.id("cc_num"));
		cnum.sendKeys("1234567890654321");
		WebElement cred = driver.findElement(By.name("cc_type"));
		Select s6=new Select(cred);
		s6.selectByValue("AMEX");
		WebElement mnth = driver.findElement(By.name("cc_exp_month"));
		Select s7=new Select(mnth);
		s7.selectByIndex(2);
		WebElement year = driver.findElement(By.name("cc_exp_year"));
		Select s8=new Select(year);
		s8.selectByVisibleText("2022");
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("123");
		WebElement booknow = driver.findElement(By.name("book_now"));
		booknow.click();	
		Thread.sleep(3000);
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();		
		
	}

}
