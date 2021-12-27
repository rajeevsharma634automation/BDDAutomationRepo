package stepdefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features", // features means the path of feature file
		glue = { "stepdefinition" }, // glue means the path of step definition files
		monochrome = true, // monochrome display the console output in readable format
		dryRun = false ,  // To check the mapping between feature file and step definition file
		plugin = {"pretty", "junit:target/JunitReports/report.xml","json:json_output/cucumber.json"  })
public class TestRunner {

}
