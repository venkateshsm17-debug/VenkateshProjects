package com.TestRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features = "./Features",
		glue = {"com.StepDef"},
		dryRun=false,
		tags = {"@UATTesting"},
		monochrome = true,
		plugin={ "pretty",
			"html:test-output"}
			)

public class TestRunner {
	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun = true)
	public void setUp(){
	//To get all the properties in this same class
	testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberfeature){
	testNGCucumberRunner.runCucumber(cucumberfeature.getCucumberFeature());
	}
	
@DataProvider
	public Object[][] features(){
		return testNGCucumberRunner.provideFeatures();
	}

@AfterClass(alwaysRun = true)
public void tearDownClass(){
	testNGCucumberRunner.finish();
}
}
