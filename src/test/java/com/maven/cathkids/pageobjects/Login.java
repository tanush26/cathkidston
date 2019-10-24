package com.maven.cathkids.pageobjects;

import com.maven.cathkids.driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends DriverFactory {
    @FindBy(css = "#j_username")
    private WebElement Email;
    public void email(String email){
        Email.sendKeys(email);
    }
    @FindBy(xpath = "(//label[@class='inline_label'])[1]")
    private WebElement radiobutton;
    public void button(){
        radiobutton.click();
    }
    @FindBy(css = "#j_password")
    private WebElement password;
    public void enterPassword(String pwd){
        password.sendKeys(pwd);
    }
    @FindBy(xpath = "//button[@class='submit button btn btn_primary btn_large btn_block']")
    private WebElement clickAccount;
    public void loginAcc(){
        clickAccount.click();
    }
@FindBy(xpath = "//li[@class='last']")
    private WebElement logOut;
    public String  title() throws InterruptedException {
        Thread.sleep(3000);
        return logOut.getText();
    }
}
