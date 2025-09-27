
 Feature: Check login functionality
@smoke
  Scenario: check login status
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the homepage
    
    Scenario: check login status
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the homepage

  
