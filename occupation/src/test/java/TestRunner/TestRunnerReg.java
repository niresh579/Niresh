package TestRunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C://Users//CBS Testing//workspace//Niresh//occupation//feature//Registration.feature", glue={"StepDefinitions1"},
plugin={"html:target"})
public class TestRunnerReg {
	

}

