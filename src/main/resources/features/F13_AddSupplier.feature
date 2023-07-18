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