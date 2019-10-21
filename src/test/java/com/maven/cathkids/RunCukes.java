package com.maven.cathkids;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",dryRun = false,strict = true,tags = "@register",//plugin = {"json:target/srilatha.json"})
plugin = {"json:target.json","pretty" ,"html:target/cathKidston-html-report"})
public class RunCukes {
}
