package com.cucumber.MavenCucumberPrototype;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty","json:target/cucumber.json"},
        features = "src/test/java/resource/outline.feature"
)
public class TestRunner {

}
