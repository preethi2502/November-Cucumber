package com.Runner.com;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.com.BaseClass;
import com.helper.com.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\com", glue = "com.stepdefenition.com", tags = "~@First", plugin = "pretty"

)

public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Throwable {
		String browser = FileReaderManager.getInstanceFR().getInstanceCR().browser();

		driver = BaseClass.browserLaunch(browser);
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.close();
	}

}
