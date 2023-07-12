@regression
Feature: Test registration automation functionality

  Background:
    Given user navigate to home page
    And user click on login icon
    And user click on create account button
    When user select title "Mr"

   Scenario Outline: user could Create new account with invalid data for B2C Register (first name and last name)
      And user write invalid "<first_name>" and valid "<last_name>"
      And User enter valid email
      And User enter valid "Fabrica123!" and "Fabrica123!"
      When Select user country code "EG"
      And User enter valid number "01274068949"
      And Mark on Subscribe to the Newsletter checkbox
      Then New account is created successfully "<result>"
     Examples:
     | first_name  | last_name   | result  |
     |             | Dev         | failure |
     | F           | Dev         | error   |
     | Fa          | Dev         | success |
     | fabrica     |             | failure |
     | fabrica     | D           | failure |
     | fabrica     | Dev         | success |

  Scenario Outline: user could Create new account with invalid data for B2C Register (Email)
    And user should enter valid first name "fabrica" and valid last name "Dev"
    And User should enter invalid email "<email>"
    And Register should be possible if user enter valid password "Fabrica123!" and valid confirm password "Fabrica123!"
    When Register should be possible if user Select valid country code "EG"
    And Register should be possible if user enter valid number "01274068949"
    And Register should be possible if user Mark on Subscribe to the Newsletter checkbox
    Then Register should be possible if user created new account successfully "<result>"
    Examples:
      |        email           | result |
      |                        | failure|
      | m.elzoghbi24gmail.com  | failure|
      | m.elzoghbi24@gmail     | failure|
      | @gmail.com             | failure|
      |m.elzoghbi24@@gmail.com | failure|
      | m.elzoghbi24@-gmail.com| failure|
      | m.elzoghbi24@ gmail.com| failure|
      | m.elzoghbi24@gmail.com | failure|
      | m.elzoghbi.24@gmail.com| success|

  Scenario Outline: user could Create new account with invalid data for B2C Register (Password and confirm password)
    And user could enter valid first name "fabrica" and valid last name "Dev"
    And User could enter valid email
    And user could enter invalid password "<password>" and valid confirm password "<confirm_password>"
    When user could Select valid country code "EG"
    And user could enter valid number "01274068949"
    And user could Mark on Subscribe to the Newsletter checkbox
    Then user could created new account successfully "<result>"
    Examples:
      |  password   | confirm_password| result  |
      | fa123       |  Fabrica123!    |  failure|
      | Fabrica     |  Fabrica123!    |  failure|
      | fabrica123! |  Fabrica123!    |  failure|
      | FABRICA123! |  Fabrica123!    |  failure|
      | Fabrica123  |  Fabrica123!    |  failure|
      | 12345678    |  Fabrica123!    |  failure|
      | @#%*&^!@    |  Fabrica123!    |  failure|
      | Fabrica 123!|  Fabrica123!    |  failure|
      | Fabrica123! |                 |  failure|
      | Fabrica123! |  Fabrica124!    |  failure|
      | Fabrica123! |  fabrica123!    |  failure|
      | Fabrica123! |  Fabrica 123!   |  failure|
      | Fabrica123! |  kerolos123!    |  failure|

  Scenario Outline: user could Create new account with invalid data for B2C Register (Phone Number)
    And user could input valid first name "fabrica" and valid last name "Dev"
    And User could input valid email
    And user could input valid password "Fabrica123!" and invalid confirm password "Fabrica123!"
    When user could choose valid country code "EG"
    And user could input valid number "<phone_number>"
    And user could click on Mark on Subscribe to the Newsletter checkbox
    Then user could created new account submitted "<result>"
    Examples:
      | phone_number | result |
      |              | failure|
      | 0125489355   | failure|
      | 656587566882 | failure|
      | 0103358asd97 | failure|
      | 0103358477 5 | failure|
      | 01033584775  | success|