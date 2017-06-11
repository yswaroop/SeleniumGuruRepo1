package SeleinumGuru;

import java.util.Scanner;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author yswaroop
 *
 */

public class CodeModular {

	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
		setBrowser();
		setBrowserConfig();
		runTest();
	}

	public static void setBrowser() {
		System.out.println("Enter the browser name");
		Scanner sc = new Scanner(System.in);
		browser = sc.nextLine();
	}

	public static void setBrowserConfig() {
		String projectLocation = System.getProperty("user.dir");

		if(browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectLocation + "/chromedriver.exe");
			driver = new ChromeDriver();
		}

		if(browser.contains("firefox")) {
//			System.setProperty("webdriver.gecko.driver", projectLocation + "/lib/seleniumlib/geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}

	public static void runTest() {
		Logger l = Logger.getLogger(CodeModular.class.getName());
		driver.get("http://www.seleniumhq.org");
		l.info(driver.getTitle());
		l.info(browser);
		driver.quit();
	}

}
