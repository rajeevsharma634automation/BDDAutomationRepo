Feature: Login functionality check for Nopcommerce

  Scenario Outline: Check nopcommerce login is successful with valid credentials
    Given User is on Nopcommerce login page
    And Nopcommerce User enters <username> and <password>
    When Clicks on Nopcommerce login page
    Then Nopcommerce User is navigated to Home page

    Examples: 
      | username            | password |
      | admin@yourstore.com | admin    |
      | admin@yourstore			| admin    |
