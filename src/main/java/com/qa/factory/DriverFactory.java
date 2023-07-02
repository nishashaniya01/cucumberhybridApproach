package com.qa.factory;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

	public  WebDriver driver;

	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();

	public  WebDriver init_driver(String Browser) {

		System.out.println("the entered browser name is:" + Browser);

		if (Browser.equalsIgnoreCase("Chrome")) {

			//WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			// Used by default, waits for all resources to download
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			 tldriver.set(new ChromeDriver(options));
			//driver = new ChromeDriver(options);

		} else if (Browser.equalsIgnoreCase("Firefox")) {

			//System.setProperty("webdriver.http.factory", "jdk-http-client");
			FirefoxOptions options = new FirefoxOptions();
			// Used by default, waits for all resources to download
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			 tldriver.set(new FirefoxDriver(options));
			//driver = new FirefoxDriver(options);

		} else if (Browser.equalsIgnoreCase("Safari")) {

			//System.setProperty("webdriver.http.factory", "jdk-http-client");
			 tldriver.set(new SafariDriver());
			//driver = new SafariDriver();

		} else {

			System.out.println("Please enter the correct browser name");
		}

		 covertToWebdriver().manage().deleteAllCookies();
		 covertToWebdriver().manage().window().maximize();
		//driver.manage().deleteAllCookies();

		//driver.manage().window().maximize();

		return covertToWebdriver() ;

	}

	public static WebDriver covertToWebdriver() {

		return tldriver.get();
	}

}
