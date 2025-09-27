package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"StepDefinitions"},
monochrome=true,dryRun=true,
plugin={"pretty","html:target/HtmlReports/report.html",
		"html:target/JSONReports/report.html",
		"junit:target/JUnitReports/report.xml"},
tags="@smoketest"
		)
public class TestRunner {

}
