package SeleinumGuru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PG4 {
	
	@Test
	public static void test() {
		WebDriver driver;
		driver = new FirefoxDriver();
		String baseURL = "http://demo.guru99.com/selenium/deprecated.html";
		
		// Launch Firefox browser and navigate to baseURL
		driver.get(baseURL);
		
		driver.switchTo().frame("classFrame");
		WebElement webelement =  driver.findElement(By.linkText("Deprecated"));
		webelement.click();
		System.out.println(driver.getCurrentUrl());
		
		String title = driver.findElement(By.className("title")).getText();
		System.out.println(title);
//		webelement.click();
		
		// Close Firefox
		driver.close();
	}

}
