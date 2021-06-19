package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources",
		glue="com.stepDefinition", 
		plugin= {"html:target/cucumber-reports.html","rerun:target/failedtestcase.txt", "timeline:target/thread-time"},
		publish=true,
		monochrome=true,
		dryRun=false
		
		)

public class testRunner {

}
