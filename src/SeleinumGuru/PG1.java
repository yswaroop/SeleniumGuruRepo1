package SeleinumGuru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG1 {
	
	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		String baseURL = "http://newtours.demoaut.com";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		// Launch Firefox browser and navigate to baseURL
		driver.get(baseURL);
		
		// get the actual value of title
		actualTitle = driver.getTitle();
		
		/**
		 * Compare the actual title with expected title
		 */
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");			
		} else {
			System.out.println("Test Failed");
		}
		
		// Close Firefox
		driver.close();
		
		// exit the program explicitly	
		System.exit(0);
	}

}
