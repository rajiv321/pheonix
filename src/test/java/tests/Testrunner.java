package tests;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "./src/test/java/feature",
		glue = {"apphooks","stepdef"},
		dryRun = false,
		monochrome = false,
//		tags = "@tag1",
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//				, "html:target/cucumber.html"}
//				"junit:target/cucumber.xml", "rerun:target/failed_scenarios.txt", "timeline:test-output-thread/"}
		)


public class Testrunner extends AbstractTestNGCucumberTests{
	
}

