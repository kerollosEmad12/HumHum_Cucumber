Feature: Test admin automation functionality

  Background:
    Given user enter to admin page
    And user enter  Email
    And user enter  password
    And user   click   on  login
    When user click on my supply
    And user click on product Btn
    And user click on add product

  Scenario Outline: user could create product with invalid data
    And user enter "<supplier>" name
    And user enter the category
    And user enter the sub category
    And user enter the last category
    When user select the brand name
    And user enter name en
    And user enter name ar
    And user select product from
    And user click on save Btn
    Examples:
    | supplier |
    |          |
    | s        |
    | shrouk   |

  Scenario Outline: user could create product with invalid data
    And user enter supplier name
    And user  enter the category
    And user  enter the sub category
    And user  enter the last category
    When user  select the brand name
    And user enter "<name en>"  and "<name ar>"
    And user  select product from
    And user  click on save Btn
    Examples:
    | name en  | name ar  |
    |          | خيار     |
    |cucumber  |          |
    |cucumber  | خيار     |