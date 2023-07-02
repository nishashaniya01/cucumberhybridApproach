package com.qa.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/com/qa/features/LoginHybrid.feature" }
				, glue = {"com.qa.stepDefinition","com.qa.hooks" }
				,dryRun = false
				,monochrome = true
				,publish = true
				,plugin = { "pretty", "html:target/cucumber-reports", "json:target/cucumber.json" })

public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {

		return super.scenarios();
	}

}
