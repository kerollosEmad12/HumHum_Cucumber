@coupon
Feature: Add coupon from supplier
  Background: The default data
    Given user enter to supplier page
    And user enter Email
    And user enter pass
    And user click on login
    And user change language
    When user choose marketing tool
    And user click on coupon button
    And user click on add coupon

  Scenario: user could create new coupon with valid data
    And user add coupon type
    And user choose client
    And user choose product
    And user enter code
    And user enter discount type
    And user enter discount
    And user enter max discount
    And user enter Minimum Purchase Amount
    And user enter count of use
    When user choose Start Date
    And user enter start time
    When user choose end date
    And user enter end time
    And user select Can be used with promotions
    Then coupon is created successfully