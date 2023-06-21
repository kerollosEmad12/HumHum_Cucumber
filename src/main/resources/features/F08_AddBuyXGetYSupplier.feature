@supplier
Feature: Add Buy X get Y promotion

  Background:
    Given user  enter to supplier  page
    And user  enter  Email
    And user  enter  pass
    And user  click on  login
    And user  change  language
    When user  choose  marketing tool
    And user choose Buy X Get Y

  Scenario: user could create new Buy X Get Y promotion with invalid data (Keep search product is an empty)
    And user choose product type
    And keep search product is an empty
    And user enter buy
    And user enter get
    When user enter promotion period
    Then The Buy X Get Y is created successfully

  Scenario: user could create New Buy X Get Y promotion with invalid data (Keep  buy is an empty)
    And user  choose product type
    And user enter search product
    And keep buy is an empty
    And user  enter get
    When user  enter promotion period
    Then The  Buy X Get Y is created successfully