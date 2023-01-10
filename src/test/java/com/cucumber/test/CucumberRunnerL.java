package com.cucumber.test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin={"json:target/cucumber.json"},
		features ={"src\\main\\resources\\Automation L.feature"},
		glue={"com.cucumber.test"}
		
		)
public class CucumberRunnerL extends AbstractTestNGCucumberTests{

}
