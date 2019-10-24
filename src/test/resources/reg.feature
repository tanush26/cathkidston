@register
Feature: registration
  As a new customer
  I want to register
  So that I can login

  Scenario:
    Given I am on Homepage
    When I click "SELECT/REGISTER"
    Then I should be able to see login/registration page
    And I enter email as "dlatha1@gmail.com"
    And I click the radio button "No I am a new customer"
    And I select title "Mrs"
    And I enter firstName as "Narala"
    And I enter lastName as "latha"
    And I enter telephoneNumber as "07404033030"
    And I enter password as "amhasrilatha"
    And I reenter password as "amhasrilatha"
    And click "JOIN OUR EMAIL CLUB AND BE THE FIRST TO KNOW ABOUT EVENTS, COMPETITIONS AND SPECIAL OFFERS."
    Then I click "Create my account"button