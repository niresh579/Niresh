package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C://Users//CBS Testing//workspace//Niresh//Horomatches//featurefile//Horo.feature", glue={"stepDefinition"},plugin={"html:target"})
public class TestRunner1 {	
	
	

}
