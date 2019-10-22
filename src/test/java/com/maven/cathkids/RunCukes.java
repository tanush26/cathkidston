package com.maven.cathkids;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",dryRun = false,strict = true,tags = "@register",
        plugin = {"json:target/cucumber.json","html:target/cucumber-html-report",
                "junit:target/cucumber-report.xml"})


public class RunCukes {
}
