package com.maven.cathkids.pageobjects;

import com.maven.cathkids.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Registration extends DriverFactory {
   @FindBy(linkText = "LOGIN/REGISTER")
    private WebElement register;
    public void newRegistration(){
     register.click();
    }
    @FindBy(css="#j_username")
    private WebElement  emails;
    public void enterMail(String email){
        emails.sendKeys(email);
    }
    @FindBy(xpath = "(//label[@class='inline_label'])[2]")
    private WebElement radiobutton;
    public void iamNewCustomer(){
        radiobutton.click();
    }
    @FindBy(css="#title")
    private WebElement title;
    public void selTitle(String tit){
        title.click();
        Select select = new Select(title);
        select.selectByVisibleText(tit);
    }
    @FindBy(css = "#first_name")
    private WebElement  firstName;
    public void first(String fn){
        firstName.sendKeys(fn);
    }
    @FindBy(css = "#last_name")
    private WebElement  lastName;
    public void last(String ln){
        lastName.sendKeys(ln);
    }
    @FindBy(css = "#telephone_number")
    private WebElement  number;
    public void telNumber(String pn){
        number.sendKeys(pn);
    }
    @FindBy(css = "#password")
    private WebElement  password;
    public void password(String pwd){
        password.sendKeys(pwd);
    }
    @FindBy(css = "#confirm_password")
    private WebElement  confirmPassword;
    public void confirmPwd(String pwd){
        confirmPassword.sendKeys(pwd);
    }
    @FindBy(xpath = "//*[@id='register_form_fields']/div[9]/label")
    private WebElement checkbox;
    public void setCheckbox() throws InterruptedException {
        Thread.sleep(3000);
        checkbox.click();
    }
    @FindBy(xpath = "(//button[@type='submit'])[3]")
    private WebElement acc;
    public void create(){
        acc.click();
    }
}
