package com.maven.cathkids;

import com.maven.cathkids.driver.DriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory();
    @Before
    public void startUp(){
        driverFactory.set("firefox");
        driverFactory.getUrl("https://www.cathkidston.com/");
        driverFactory.maximise();
        driverFactory.implicitWait();
        driverFactory.delAllCookies();
    }
    @After
    public void tearDown(){

        //driverFactory.closeBrowser();
    }
}
