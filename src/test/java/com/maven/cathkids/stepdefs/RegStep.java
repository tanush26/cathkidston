package com.maven.cathkids.stepdefs;

import com.maven.cathkids.pageobjects.Registration;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegStep {
    Registration register = new Registration();
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }
    @When("^I click \"([^\"]*)\"$")
    public void iClick(String arg0) throws Throwable {
       register.newRegistration();
    }

    @Then("^I should be able to see login/registration page$")
    public void iShouldBeAbleToSeeLoginRegistrationPage() {
    }

    @And("^I enter email as \"([^\"]*)\"$")
    public void iEnterEmailAs(String email) throws Throwable {
       register.enterMail(email);
    }


    @And("^I click the radio button \"([^\"]*)\"$")
    public void iClickTheRadioButton(String arg0) throws Throwable {
       register.iamNewCustomer();
    }

    @And("^I select title \"([^\"]*)\"$")
    public void iSelectTitle(String tit) throws Throwable {
     register.selTitle(tit);
    }

    @And("^I enter firstName as \"([^\"]*)\"$")
    public void iEnterFirstNameAs(String fn) throws Throwable {
      register.first(fn);
    }

    @And("^I enter lastName as \"([^\"]*)\"$")
    public void iEnterLastNameAs(String ln) throws Throwable {
       register.last(ln);
    }

    @And("^I enter telephoneNumber as \"([^\"]*)\"$")
    public void iEnterTelephoneNumberAs(String tn) throws Throwable {
      register.telNumber(tn);
    }

    @And("^I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String pwd) throws Throwable {
       register.password(pwd);
    }

    @And("^I reenter password as \"([^\"]*)\"$")
    public void iReenterPasswordAs(String pwd) throws Throwable {
        register.confirmPwd(pwd);
    }

    @And("^click \"([^\"]*)\"$")
    public void click(String arg0) throws Throwable {
        register.setCheckbox();
    }

    @Then("^I click \"([^\"]*)\"button$")
    public void iClickButton(String arg0) throws Throwable {
      register.create();
    }


}
