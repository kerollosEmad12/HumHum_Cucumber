@Test
Feature: Add address from checkout
  Background: user enter data
    Given user enter to home page
    And user press on login button
    And user enter user name
    And user input password and click on login button

  Scenario: user could create new address with invalid data (without city)
    And mouse hover on cart icon and click on checkout
    And click on new address
    When user choose province
    And keep city an empty
    And user enter street
    And user enter name
    And user enter floor
    And user enter home number
    And user enter zip code
    Then new address is created successfully

    Scenario: user could create new address with invalid data (without name)
      And user click on cart icon and click on checkout
      And click  on new address
      When user  choose province
      And user enter the city
      And user  enter street
      And keep the name is an empty
      And user  enter floor
      And user  enter home number
      And user  enter zip code
      Then new  address is created successfully
