Feature: Test admin automation functionality

  Background:
    Given user could go to admin page
    And user input  Email "eslam@php-eg.com"
    And user input  password "eslam123"
    And user press on login
    When user press on my supply
    And user click on buyer Btn
    And user click on add buyer Btn

    Scenario Outline: user could create a new buyer from admin (first name and last name)
      And user enter the first name "<first_name>" and last name "<last_name>"
      And user enter valid email
      And user enter EN company name "fabrica" and AR company name "فابريكا"
      And user enter the job title "sales"
      And user enter the mobile number
      And user enter password "Fabrica123!" and confirm password "Fabrica123!"
      Then The create new buyer is successfully
      Examples:
      | first_name  | last_name |
      |             | kandil    |
      | eslam       |           |


  Scenario Outline: user could create a new buyer from admin (Email)
    And user could enter the first name "eslam" and last name "kandil"
    And user could enter valid email "<email>"
    And user could enter EN company name "fabrica" and AR company name "فابريكا"
    And user could enter the job title "sales"
    And user could enter the mobile number
    And user could enter password "Fabrica123!" and confirm password "Fabrica123!"
    Then user could The create new buyer is successfully "<result>"
    Examples:
      |          email         | result |
      |                        | failure|
      |m.elzoghbi24gmail.com   | failure|
      | m.elzoghbi24@gmail     | failure|
      |  @gmail.com            | failure|
      | m.elzoghbi24@@gmail.com| failure|
      | m.elzoghbi24@-gmail.com| failure|
      | m.elzoghbi24@ gmail.com| failure|
      | m.elzoghbi24@gmail.com | failure|


  Scenario Outline: user could create a new buyer from admin (phone number)
    And user could input the first name "eslam" and last name "kandil"
    And user could input valid email
    And user could input EN company name "fabrica" and AR company name "فابريكا"
    And user could input the job title "sales"
    And user could input the mobile number "<phone_number>"
    And user could input password "Fabrica123!" and confirm password "Fabrica123!"
    Then user could The created new buyer is successfully "<result>"
    Examples:
      | phone_number | result |
      | 0125489355   | failure|
      | 656587566882 | failure|
      | 0103358asd97 | failure|
      | 0103358477 5 | failure|


  Scenario Outline: user could create a new buyer from admin (password and confirm password)
    And add buyer should be possible if user input the first name "eslam" and last name "kandil"
    And add buyer should be possible if user input valid email
    And add buyer should be possible if user input EN company name "fabrica" and AR company name "فابريكا"
    And add buyer should be possible if user input the job title "sales"
    And add buyer should be possible if user input the mobile number
    And add buyer should be possible if user could password "<password>" and confirm password "<confirm_password>"
    Then add buyer should be possible if user The created new buyer is successfully "<result>"
    Examples:
      |   password  | confirm_password | result |
      | f           | Fabrica123!      | failure|
      | fa123       | Fabrica123!      | failure|
      | Fabrica     | Fabrica123!      | failure|
      | fabrica123! | Fabrica123!      | failure|
      | FABRICA123! | Fabrica123!      | failure|
      | Fabrica123  | Fabrica123!      | failure|
      | 12345678    | Fabrica123!      | failure|
      | @#%*&^!@    | Fabrica123!      | failure|
      | Fabrica 123!| Fabrica123!      | failure|
      | Fabrica123! | Fabrica124!      | failure|
      | Fabrica123! | fabrica123!      | failure|
      | Fabrica123! | Fabrica 123!     | failure|
      | Fabrica123! | kerolos123!      | failure|