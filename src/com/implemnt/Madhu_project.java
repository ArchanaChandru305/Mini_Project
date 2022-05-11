package com.implemnt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Madhu_project {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\91950\\eclipse-workspace\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationpractice.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement sign = driver.findElement(By.xpath("//a[@rel='nofollow'][1]"));
		sign.click();
		
		WebElement name = driver.findElement(By.id("email_create"));
		name.sendKeys("gmfrnf@gmail.com");

		WebElement create = driver.findElement(By.xpath("//button[@name='SubmitCreate']"));
		create.click();

		WebElement mrs = driver.findElement(By.xpath("//input[@value='2']"));
		mrs.click();
		
		WebElement fn = driver.findElement(By.name("customer_firstname"));
		fn.sendKeys("Madhu");
		WebElement ln = driver.findElement(By.name("customer_lastname"));
		ln.sendKeys("Mitha.B");
	
	//	WebElement pass = driver.findElement(By.name("email"));
		//pass.sendKeys("gmfrnf@gmail.com");

		WebElement phn = driver.findElement(By.name("passwd"));
		phn.sendKeys("5767778797");

		WebElement bday = driver.findElement(By.name("days"));
		Select m = new Select(bday);
		m.selectByValue("14");

		WebElement month = driver.findElement(By.name("months"));
		Select g = new Select(month);
		g.selectByIndex(3);

		WebElement year = driver.findElement(By.name("years"));
		Select y = new Select(year);
		y.selectByValue("2021");
		
		WebElement signup = driver.findElement(By.xpath("//input[@value='1']"));
		signup.click();
		
		WebElement fn1 = driver.findElement(By.name("firstname"));
		fn1.sendKeys("Madhu");
		WebElement ln1 = driver.findElement(By.name("lastname"));
		ln1.sendKeys("Mitha.B");
		
		WebElement cmpy = driver.findElement(By.name("company"));
		cmpy.sendKeys("wipro");
		
		WebElement address = driver.findElement(By.name("address1"));
		address.sendKeys("101c/23j, main road, Thirunallveli- 628502");
		
		WebElement address1 = driver.findElement(By.name("address2"));
		address1.sendKeys("101c/23j, main road, Thirunallveli- 628502");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement city1 = driver.findElement(By.xpath("//input[@name='city']"));
		city1.sendKeys("chennai");
		
		WebElement state = driver.findElement(By.name("id_state"));
		Select m1 = new Select(state);
		m1.selectByValue("9");
		
		WebElement pin = driver.findElement(By.name("postcode"));
		pin.sendKeys("00000");
		
		WebElement country = driver.findElement(By.name("id_country"));
		Select m2 = new Select(country);
		m2.selectByValue("21");
		
		WebElement additi = driver.findElement(By.name("other"));
		additi.sendKeys("she is addtent the courses 8070405210");
		
		WebElement homephn = driver.findElement(By.name("phone"));
		homephn.sendKeys("7728543630");
		
		WebElement phn1 = driver.findElement(By.name("phone_mobile"));
		phn1.sendKeys("7728545530");
		
		WebElement address2 = driver.findElement(By.name("alias"));
		address2.sendKeys("101c/23j, main road, Thirunallveli- 628502");
		
		
		WebElement register=driver.findElement(By.xpath("//button[@name='submitAccount']"));
		register.click();      
		Alert gm =driver.switchTo().alert();
		gm.sendKeys("created successfull");
		gm.accept();

	}

}
