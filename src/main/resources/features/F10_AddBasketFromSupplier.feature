Feature: Add Basket From supplier

  Background:
    Given user  enter  to  supplier  page
    And user   enter   Email
    And user   enter   pass
    And user   click  on  login
    And user   change   language
    When user  choose   marketing  tool
    And user choose Basket promotion

  Scenario: user could create basket with invalid data (Keep search product is an empty)
    When user  choose product  type
    And Keep search product is an empty
    And user choose Promotion Period
    When user choose Return Time Limit
    And user enter Title En
    And user enter Title AR
    And user enter Main image
    And user input images
    And user click on submit Btn

  Scenario: user could create basket with invalid data (keep Return Time Limit is an empty)
    When User  choose  product  type
    And user  enter search product
    And user  choose Promotion Period
    When keep Return Time Limit is an empty
    And user  enter Title En
    And user  enter Title AR
    And user  enter Main image
    And user  input images
    And user  click on submit Btn

  Scenario: user could create new basket with invalid data (Keep Title En is an empty)
    When User  choose   product  type
    And user  enter  search product
    And user  choose  Promotion Period
    When user  enter Return  Time Limit
    And Keep Title En is an empty
    And user  enter  Title AR
    And user  enter  Main image
    And user  input  images
    And user  click  on submit Btn

  Scenario: user could create new basket with invalid data (Keep Title Ar is an empty)
    When User   choose   product  type
    And user   enter  search product
    And user   choose  Promotion Period
    When user   enter Return  Time Limit
    And user  enter  Title En
    And Keep Title Ar is an empty
    And user   enter  Main image
    And user   input  images
    And user   click  on submit Btn

  Scenario: user could create new basket with invalid data (keep quantity from first product is an empty)
    When User   choose   product   type
    And user   enter  search  product
    And user   choose  Promotion  Period
    When user   enter Return  Time  Limit
    And user  enter  Title  En
    And user   enter Title AR
    And user   enter  Main  image
    And user   input   images
    And keep quantity from first product is an empty
    And user enter from last product quantity
    And user   click  on submit  Btn

  Scenario: user could create new basket with valid data
    When User   Choose   product   type
    And User   enter  search  product
    And User   choose  Promotion  Period
    When User   enter Return  Time  Limit
    And User  enter  Title  En
    And User   enter Title AR
    And User   enter  Main  image
    And User   input   images
    And user enter quantity from first product
    And User enter from last product quantity
    And User   click  on submit  Btn
