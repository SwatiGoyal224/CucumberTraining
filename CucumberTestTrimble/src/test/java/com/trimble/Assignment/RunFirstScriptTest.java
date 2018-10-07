package com.trimble.Assignment;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\resources\\com\\trimble\\FeatureFiles\\AssignmentFeatureFile.feature"},
        glue = {"com\\trimble\\Assignment"}
        
        
        
        
        
        
        

)

public class RunFirstScriptTest {

}
