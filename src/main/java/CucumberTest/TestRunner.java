package CucumberTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class TestRunner {
	@CucumberOptions(
			plugin = {"pretty"},
			glue = {"StepDefs"},
			features = {"src/test/java/Features"})
	public class CucumberTests {}
}
