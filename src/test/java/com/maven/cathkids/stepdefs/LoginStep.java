package com.maven.cathkids.stepdefs;

import com.maven.cathkids.pageobjects.Login;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginStep {
    Login login = new Login();

    @And("^I enter Email as \"([^\"]*)\"$")
    public void iEnterEmailAs(String email) throws Throwable {
       login.email(email);
    }

    @And("^I click the Radio button \"([^\"]*)\"$")
    public void iClickTheRadioButton(String arg0) throws Throwable {
         login.button();
    }

    @And("^I enter Password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String pwd) throws Throwable {
         login.enterPassword(pwd);
    }

    @And("^I Click \"([^\"]*)\"$")
    public void iClick(String arg0) throws Throwable {
            login.loginAcc();
    }

    @Then("^I should be able to see \"([^\"]*)\" login homepage$")
    public void iShouldBeAbleToSeeLoginHomepage(String arg0) throws Throwable {
        String actual = login.title();
        assertThat("might be different page title",actual, Matchers.equalToIgnoringCase("MY ACCOUNT"));
    }

}
