package com.trimble.TestPost3;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\resources\\com\\trimble\\FeatureFiles\\FeatureFile3.feature"},
        glue = {"com\\trimble\\TestPost3"}

)

public class RunFirstScriptTest {

}
