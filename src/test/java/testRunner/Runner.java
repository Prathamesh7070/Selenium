package testRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/java/FeatureFile",
	    glue = "testDefinationFile",
	    monochrome = true,tags="@jaydev",plugin= {"pretty", "html:target/jaydev.html"}
	    		 
	)
public class Runner  extends AbstractTestNGCucumberTests
{
	
}
