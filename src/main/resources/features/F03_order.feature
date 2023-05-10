@regression
Feature: Test order functionality

  Scenario: user could create order for promotions (Buy x get y without assigning a cart allotted to it)
    Given user go to home page
    And user click on login Btn
    And user enter email
    And user enter password
    And user choose product promotion
    And user click on view cart button
    And user enter coupon
    And mark on payment checkbox
    And mark on I accept checkbox
    And user click on checkout button
    Then user click on track your order