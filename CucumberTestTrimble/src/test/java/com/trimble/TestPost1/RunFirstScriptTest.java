package com.trimble.TestPost1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\resources\\com\\trimble\\FeatureFiles\\FeatureFile2.feature"},
        glue = {"com\\trimble\\TestPost1"}

)

public class RunFirstScriptTest {

}
