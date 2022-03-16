package com.flipkart.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", dryRun = true, glue = "com/flipkart/stepDefinitions",
                 tags = {}, plugin = {})
public class TestRunner {
}
