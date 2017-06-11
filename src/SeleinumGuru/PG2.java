package SeleinumGuru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG2 {
	
	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
//		String baseURL = "http://www.facebook.com";
		String baseURL = "http://www.popuptest.com/popuptest2.html";
		String tagName = "";
		
		// Launch Firefox browser and navigate to baseURL
		System.out.println(driver.getClass());
//		driver.get(baseURL);
		driver.navigate().to(baseURL);
		driver.close();
		try {
			driver.wait(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();/*
		System.out.println(driver.getTitle());
		
		//  ID
		tagName = driver.findElement(By.id("email")).getTagName();
		System.out.println(tagName);
		
		// ClassName
		driver.findElement(By.className("inputtext")).sendKeys("Test");
		driver.findElement(By.id("pass")).sendKeys("password");
//		driver.findElement(By.id("u_0_q")).submit();
		driver.findElement(By.id("u_0_q")).click();
		System.out.println(driver.getTitle());
		System.out.println(tagName);
		
//		WebElement webelement = driver.get(baseURL);
		
		// Close Firefox
		driver.close();
		
		// exit the program explicitly	
		System.exit(0);*/
	}

}
