package com.implemnt;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement deals = driver.findElement(By.xpath("//a[contains(text(),'Deals')]"));
		Actions ac = new Actions(driver);
		ac.contextClick(deals).build().perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement electronic = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		ac.contextClick(electronic).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement best = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
		ac.contextClick(best).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// Get window handle

		Set<String> handlewindow = driver.getWindowHandles();

		for (String unique : handlewindow) {
			String title = driver.switchTo().window(unique).getTitle();
			System.out.println(title);
		}
		String moveto = "Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";

		for (String unique : handlewindow) {
			if (driver.switchTo().window(unique).getTitle().equals(moveto)) {
				break;
			}
		}

		String bestdealer = "Amazon.in Bestsellers: The most popular items on Amazon";
		for (String move : handlewindow) {
			if (driver.switchTo().window(move).getTitle().equals(bestdealer)) {
				break;

			}

		}
	}
}
