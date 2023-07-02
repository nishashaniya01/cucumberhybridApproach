package com.qa.hooks;

import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.pages.LoginPageHybrid;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	public static DriverFactory df;
	private ConfigReader cr;
	private WebDriver driver;

	Properties prop;

	@Before(order = 0)
	public void getProperty() throws IOException {

		cr = new ConfigReader();
		prop = cr.init_properties();

	}

	@Before
	public void loadDriver() {

		df = new DriverFactory();
		driver = df.init_driver("chrome");

	}

	@After(order = 0)
	public void quitBrowser() {

		driver.quit();

	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {

		if (scenario.isFailed()) {

			String screenShotName = scenario.getName().replaceAll("", "_");

			// It will create a screenshot and save it in sourcePath
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenShotName);

		}
	}

}
