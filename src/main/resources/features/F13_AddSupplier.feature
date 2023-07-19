Feature: Test admin automation functionality

  Background:
    Given user should enter admin page
    And user should input  Email "eslam@php-eg.com"
    And user should input  password "eslam123"
    And user should press on login
    When user should press on my supply
    And user should click on suppliers Btn
    And user should click on add supplier Btn

  Scenario Outline: user could create a new supplier from admin (first name and last name)
    And Entrance the first name "<first_name>" and last name "<last_name>"
    And Entrance the EN company name "fabrica" and AR company name "فابريكا"
    And Entrance the selling for
    And Entrance the job title "sales"
    And Entrance the valid email
    And Entrance the country code
    And Entrance the mobile number
    And Entrance the password "Fabrica123!" and confirm password "Fabrica123!"
    Then The create new supplier is successfully "<result>"
    Examples:
      | first_name | last_name |
      |            | Dev       |
      | f          | Dev       |
      | fa         | Dev       |
      | fabrica    |           |
      | fabrica    | d         |
      | fabrica    | De        |

  Scenario Outline: user could create a new supplier from admin (Email)
    And Ingress the first name "fabrica" and last name "Dev"
    And Ingress the EN company name "fabrica" and AR company name "فابريكا"
    And Ingress the selling for
    And Ingress the job title "sales"
    And Ingress the valid email "<email>"
    And Ingress the country code
    And Ingress the mobile number
    And Ingress the password "Fabrica123!" and confirm password "Fabrica123!"
    Then The create new supplier is submitted "<result>"
    Examples:
      |          email         | result |
      |m.elzoghbi24gmail.com   | failure|
      | m.elzoghbi24@gmail     | failure|
      |  @gmail.com            | failure|
      | m.elzoghbi24@@gmail.com| failure|
      | m.elzoghbi24@-gmail.com| failure|
      | m.elzoghbi24@ gmail.com| failure|
      | m.elzoghbi24@gmail.com | failure|

  Scenario Outline: user could create a new supplier from admin (phone number)
    And Insertion the first name "fabrica" and last name "Dev"
    And Insertion the EN company name "fabrica" and AR company name "فابريكا"
    And Insertion the selling for
    And Insertion the job title "sales"
    And Insertion the valid email
    And Insertion the country code
    And Insertion the mobile number "<phone_number>"
    And Insertion the password "Fabrica123!" and confirm password "Fabrica123!"
    Then user could created new supplier account submitted "<result>"
    Examples:
      | phone_number | result |
      | 0125489355   | failure|
      | 656587566882 | failure|
      | 0103358asd97 | failure|
      | 0103358477 5 | failure|
      | 01095510979  | failure|

  Scenario Outline: user could create a new supplier from admin (password and confirm password)
    And user type the first name "fabrica" and last name "Dev"
    And user type the EN company name "fabrica" and AR company name "فابريكا"
    And user type the selling for
    And user type the job title "sales"
    And user type the valid email
    And user type the country code
    And user type the mobile number
    And user type the password "<password>" and confirm password "<confirm_password>"
    Then the created new supplier account submitted "<result>"
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