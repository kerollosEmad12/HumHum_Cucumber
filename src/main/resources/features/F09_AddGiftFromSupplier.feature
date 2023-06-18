Feature: Add Buy X Gift Y promotion

  Background:
    Given user  enter  to supplier  page
    And user  enter   Email
    And user  enter   pass
    And user  click  on  login
    And user  change   language
    When user  choose   marketing tool
    And user choose Buy X Gift Y

  Scenario: user could create new Gift promotion with invalid data (Keep Buy product is an empty)
    When user choose product  type
    And Keep Buy product is an empty
    And user enter the gift product
    And user enter buy number
    And user enter gift number
    And user enter promotion period start date and end date
    Then The  Buy X Gift Y is created successfully

  Scenario: user could create new Gift with invalid data (Keep gift product is an empty)
    When user choose  product  type
    And user enter Buy product
    And Keep gift product is an empty
    And user enter  buy number
    And user enter  gift number
    And user enter  promotion period start date and end date
    Then The  Buy X  Gift Y is created successfully

  Scenario: user could create new Gift with invalid data (Keep buy number is an empty)
    When user  choose  product  type
    And user  enter Buy product
    And user enter gift product
    And Keep buy number is an empty
    And user  enter  gift number
    And user  enter  promotion period start date and end date
    Then The  Buy  X  Gift Y is created successfully

  Scenario: user could create new Gift with invalid dta (Keep gift number is an empty)
    When user  choose   product  type
    And user  enter  Buy product
    And user  enter gift product
    And user  enter buy number
    And Keep gift number is an empty
    And user  enter  promotion  period start date and end date
    Then The  Buy  X  Gift  Y is created successfully

  Scenario: user could create new Gift with invalid data (user enters a date prior to the current date)
    When user  choose   product   type
    And user  enter  Buy  product
    And user  enter  gift product
    And user  enter  buy number
    And user  enter  gift  number
    And user enters a date prior to the current date
    Then The  Buy  X  Gift  Y  is created successfully