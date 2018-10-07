package com.trimble.TestPost;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\resources\\com\\trimble\\FeatureFiles\\FeatureFile1.feature"},
        glue = {"com\\trimble\\TestPost"}

)

public class RunFirstScriptTest {

}
