package com.maven.cathkids.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
public static WebDriver driver;
public DriverFactory(){
    PageFactory.initElements(driver,this);
}
public void set(String browser){
    switch (browser){
        case "chrome":
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            break;
        case "firefox":
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            break;
        default:
            driver = new SafariDriver();
            break;

    }
}
public void getUrl(String url){
    driver.get(url);
}
public void maximise(){
    driver.manage().window().maximize();
}
public void implicitWait(){
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
}
public void delAllCookies(){
    driver.manage().deleteAllCookies();
}
public void closeBrowser(){
    driver.close();
}
}
