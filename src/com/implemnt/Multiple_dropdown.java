package com.implemnt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_dropdown {
	
		public static void main(String[] args) {
					
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://www.leafground.com/pages/Dropdown.html");
			
			WebElement coff = driver.findElement(By.xpath("(//select)[6]"));
			
			Select s=new Select(coff);
			boolean multi = s.isMultiple();
			System.out.println(multi);
			
			s.selectByValue("1");
			
			s.selectByIndex(2);
			
			s.selectByVisibleText("Loadrunner");
			
			s.selectByValue("3");
			
			s.deselectByIndex(4);
			
			
	}

}
