Feature: Login
  This feature file contains multiple steps to login to application

  Scenario: Login to Test Titans with valid credentials
    Given Navigate to test titans website
    And user enters the login id "sk@gmail.com"
    And user enters the correct password "123456"
    When users click on login button
    Then user should be able to login in


  Scenario: Login to Test Titans with false credentials
    Given Navigate to test titans website
    And user enters the incorrect login id "sk12@gmail.com"
    And user enters the incorrect password "123456768"
    When users click on login button
    Then  user should not be able to login
