Feature: Add product from supplier
  Background: The  default data
    Given user  enter to supplier page
    And user  enter Email
    And user  enter pass
    And user  click on login
    And user  change language
    When user  choose marketing tool
    And user click on list new product

  Scenario:user could create new product with valid data
    And user enter category
    And user enter sub category
    And user enter last category
    And user add brand name
    And user enter name En
    And user enter name AR
    And user enter product from
    When user choose selling country
    And user click on save button
    And user enter main image
    And user enter product image
    Then product is created successfully
    And user enter price BtoB
    And user enter wight
    And user enter stock quantity
    And user enter main order
    And user enter low stock
    When user enter return time
    When user choose delivery time
    And user click on ask admin to publish button
    Then BtoB is publish successfully

  Scenario: user could create new product with invalid data (Keep name EN is an empty)
    And user  enter category
    And user  enter sub category
    And user  enter last category
    And user  add brand name
    And Keep name En is an empty
    And user  enter name AR
    And user  enter product from
    When user  choose selling country
    And user  click on save button

  Scenario: user could create new product with invalid data (Keep name AR is an empty)
    And user  enter  category
    And user  enter  sub category
    And user  enter  last category
    And user  add  brand name
    And user  enter name En
    And Keep name AR is an empty
    And user  enter  product from
    When user  choose  selling country
    And user  click  on save button

  Scenario: user could create new product with invalid data (Without Dynamic Input
    And user   enter  category
    And user   enter  sub category
    And user   enter  last category
    And user   add  brand name
    And user   enter name En
    And user   enter name AR
    And user   enter  product from
    When user  choose  selling country without dynamic input
    And user   click  on save button