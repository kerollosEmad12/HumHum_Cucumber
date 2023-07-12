@regression
  Feature: Test Login functionality

    Scenario Outline: user could login with invalid email data
      Given User Navigate to home page
      And User click on login icon
      And user enter invalid "<Email>" and valid "<Password>"
      Then The login "<result>" is displayed
      Examples:
        |    Email           | Password | result |
        |                    | Asd12312 | failure|
        | kerolos-gmail.com  | Asd12312 | error  |
        | kerolos @gmail.com | Asd12312 | error  |
        | Kerolos@gmail.com  | Asd12312 | error  |
        | kerolos\@gmail.com | Asd12312 | error  |

    Scenario Outline: user could login with invalid password data
    Given User  Navigate to home page
    And User  click on login icon
    And user  enter valid "<Email>" and invalid "<Password>"
    Then The login "<result>" is passed
    Examples:
      |    Email         | Password | result  |
      |kerolos@gmail.com |          | failure |
      |kerolos@gmail.com | 126381   | error   |
      |kerolos@gmail.com | Asd123 12| error   |
      |kerolos@gmail.com | Asd12312!| error   |
      |kerolos@gmail.com | Asd12312 | success |