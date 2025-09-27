package stepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/Features/BackgroundDemo.feature", glue={"stepsForBackground"},
	monochrome=true,
	plugin={"pretty","html:target/HtmlReports/Hreport.html",
			"html:target/JSONReports/Hreport.html",
			"junit:target/JUnitReports/Hreport.xml"}
			)
	public class TestRunnerForBackgroundDemo {
		
}
