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