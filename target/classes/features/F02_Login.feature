@regression
  Feature: Test Login functionality

    Scenario: user could create new account with invalid data (Email is an empty) for Login (Negative scenario)
      Given User Navigate to home page
      And User click on login icon
      And Keep email is an empty
      And user enter valid password
      Then Login is successfully

    Scenario:  user could create new account with invalid data (Email invalid format) for Login (Negative scenario)
      Given User Navigate To home page
      And User Click on login icon
      And user enter email invalid format
      And User enter valid password
      Then login is successfully

    Scenario:  user could create new account with invalid data (Email not registered) for Login (Negative scenario)
      Given User Navigate To Home page
      And User Click On login icon
      And user enter email not registered
      And User Enter valid password
      Then login Is successfully

    Scenario:  user could create new account with invalid data (pass is an empty) for Login (Negative scenario)
      Given User Navigate To Home Page
      And User Click On Login icon
      And User Enter Valid email
      And Keep password is an empty
      Then Login Is successfully