package com.cucumber.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.cucumber.baseclass.BaseClass;
import com.cucumber.helper.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\cucumber\\feature", 
					glue = "com\\cucumber\\stepdefinition", 
					plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Report/cucumber-reports/Cucumber_Report.html",
							"json:target/cucumber.json",
							"html:normal.html",
							"pretty"},
					monochrome=true,
					strict=true,
					dryRun=false,
					tags="@RegressionTest"
		)

public class TestRunner {
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() throws Throwable {
		String browser = FileReaderManager.getInstance().getCrInstance().getBrowser();
		driver= BaseClass.getBrowser(browser);
	}
	
	@AfterClass
	public static void driverQuit() {
		driver.quit();
	}

}
