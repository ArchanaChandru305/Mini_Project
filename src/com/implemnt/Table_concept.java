package com.implemnt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_concept {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();

		// Get all data
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));

		System.out.println("** All Table Data");

		for (WebElement all : alldata) {

			String text = all.getText();

			System.out.println(text);
		}
		System.out.println();
		// Get Particular row data

		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		System.out.println("**** Table Row Data ****");
		for (WebElement row : rowdata) {

			String text1 = row.getText();
			System.out.println(text1);
		}
		System.out.println();

		// Get Column data
		List<WebElement> columndata = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		System.out.println("**** Table Column Data ****");
		for (WebElement column : columndata) {
			String text = column.getText();
			System.out.println(text);
		}
		System.out.println();
		
		// Get particular Data
		System.out.println("**** Particular data from Table *****");
		System.out.println();
		WebElement particulardata = driver.findElement(By.xpath("//table/tbody/tr[5]/td[5]"));
		String text2 = particulardata.getText();
		System.out.println(text2);
		System.out.println();

		// Get Headers
		List<WebElement> header = driver.findElements(By.tagName("th"));
		System.out.println();
		System.out.println("**** Headers ****");
		System.out.println();

		for (WebElement head : header) {
			String text = head.getText();
			System.out.println(text);
		}

	}
}
