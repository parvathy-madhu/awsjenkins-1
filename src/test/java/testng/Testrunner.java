package testng;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions( 	
		features = "src/test/resources/Features/Test.feature", 
		glue = "stepdefinitions",
		monochrome = true,
		

 
public class Testrunner extends AbstractTestNGCucumberTests   {
 
}
