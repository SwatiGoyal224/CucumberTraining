package com.trimble.DataTableEx;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\resources\\com\\trimble\\FeatureFiles\\DataTableFeatureFile.feature"},
        glue = {"com\\trimble\\DataTableEx"}

)

public class RunFirstScriptTest {

}
