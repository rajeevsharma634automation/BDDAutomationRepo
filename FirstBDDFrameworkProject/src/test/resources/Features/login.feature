Feature: Login functionality check

  Scenario: Check login is successful with valid credentials
    Given User is on login page
    When User enters username and password
    And Clicks on login page
    Then User is navigated to Home page
