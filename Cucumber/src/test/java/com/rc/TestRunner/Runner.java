package com.rc.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)				
@CucumberOptions(
		features="src\\test\\java\\Features\\Amazon.Feature",
		glue= {"StepDefinition"}
					)						

public class Runner {


}
