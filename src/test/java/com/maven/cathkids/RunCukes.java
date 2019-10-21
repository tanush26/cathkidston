package com.maven.cathkids;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",dryRun = false,strict = true,tags = "@register",
        plugin = {"json:target/cucumber.json"})
                //"target/cucumber-html-reports/overview-features.html"})


public class RunCukes {
}
