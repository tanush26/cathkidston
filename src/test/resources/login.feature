@login
Feature:
  As a registered customer
  I want to login
  so that i can view my account page

  Scenario:
    Given I am on Homepage
    When I click "SELECT/REGISTER"
    Then I should be able to see login/registration page
    And I enter Email as "dlatha1@gmail.com"
    And I click the Radio button "YES, I HAVE A PASSWORD"
    And I enter Password as "amhasrilatha"
    And I Click "Log in to my account"
    Then I should be able to see "MY ACCOUNT" login homepage
