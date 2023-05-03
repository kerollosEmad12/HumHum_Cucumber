@regression
Feature: Test automation functionality

  Scenario: user could create new account with valid data for B2C Register (positive scenario)
    Given user navigate to home page
    And user click on login icon
    And user click on create account button
    When user select title
    And user write first name and last name
    And user enter valid email
    And user enter valid password and confirm password
    When select user country code
    And user enter valid phone number
    And mark on Subscribe to the Newsletter checkbox
    Then new account is created successfully

    Scenario: user could Create new account with invalid data for B2C Register (Negative scenario)
      Given user navigate to home page
      And user click on login icon
      And user click on create account button
      When user select title
      And user write first name with one character and valid last name
      And User enter valid email
      And User enter valid password and confirm password
      When Select user country code
      And User enter valid phone number
      And Mark on Subscribe to the Newsletter checkbox
      Then New account is created successfully

      Scenario: user could Create new account with invalid data (first name) for B2C Register (Negative scenario)
        Given user Navigate to home page
        And user Click on login Button
        And user Click on create account Btn
        When User Select title
        And user write first name two one character and valid last name
        And User Enter valid email
        And User Enter valid password and confirm password
        When Select User country code
        And User Enter valid phone number
        And Mark on subscribe to the Newsletter checkbox
        Then New Account is created successfully

  Scenario: user could Create new account with invalid data (last name is an empty) for B2C Register (Negative scenario)
      Given stepA user Navigate to home page
      And stepB user Click on login Button
      And stepC user Click on create account Btn
      When stepD User Select title
      And stepE user write valid first name and last name is an empty
      And stepF User Enter valid email
      And stepG User Enter valid password and confirm password
      When stepH Select User country code
      And stepI User Enter valid phone number
      And stepJ Mark on subscribe to the Newsletter checkbox
      Then stepK New Account is created successfully

      Scenario: user could Create new account with invalid data (Email is an empty) for B2C Register (Negative scenario)
        Given step[A] user Navigate to home page
        And step[B] user Click on login Button
        And step[C] user Click on create account Btn
        When step[D] User Select title
        And step[E] user write valid first name and valid last name
        And step[F] User keep email is an empty
        And step[G] User Enter valid password and confirm password
        When step[H] Select User country code
        And step[I] User Enter valid phone number
        And step[J] Mark on subscribe to the Newsletter checkbox
        Then step[K] New Account is created successfully

      Scenario:  user could Create new account with invalid data (Invalid Email format) for B2C Register (Negative scenario)
        Given Step[A] user Navigate to home page
        And Step[B] user Click on login Button
        And Step[C] user Click on create account Btn
        When Step[D] User Select title
        And Step[E] user write valid first name and valid last name
        And step[F] User keep email is invalid Email format
        And Step[G] User Enter valid password and confirm password
        When Step[H] Select User country code
        And Step[I] User Enter valid phone number
        And Step[J] Mark on subscribe to the Newsletter checkbox
        Then Step[K] New Account is created successfully

      Scenario:  user could Create new account with invalid data (Email is already registered in the database) for B2C Register (Negative scenario)
        Given STep[A] user Navigate to home page
        And STep[B] user Click on login Button
        And STep[C] user Click on create account Btn
        When STep[D] User Select title
        And STep[E] user write valid first name and valid last name
        And step[F] User keep email is already registered in the database
        And STep[G] User Enter valid password and confirm password
        When STep[H] Select User country code
        And STep[I] User Enter valid phone number
        And STep[J] Mark on subscribe to the Newsletter checkbox
        Then STep[K] New Account is created successfully

      Scenario:  user could Create new account with invalid data (Password with 7 character) for B2C Register (Negative scenario)
        Given STEp[A] user Navigate to home page
        And STEp[B] user Click on login Button
        And STEp[C] user Click on create account Btn
        When STEp[D] User Select title
        And STEp[E] user write valid first name and valid last name
        And Step[F] User enter valid email
        And STep[G] User Enter password with seven character and valid confirm password
        When STEp[H] Select User country code
        And STEp[I] User Enter valid phone number
        And STEp[J] Mark on subscribe to the Newsletter checkbox
        Then STEp[K] New Account is created successfully

      Scenario:  user could Create new account with invalid data (Password without special character) for B2C Register (Negative scenario)
        Given STEP[A] user Navigate to home page
        And STEP[B] user Click on login Button
        And STEP[C] user Click on create account Btn
        When STEP[D] User Select title
        And STEP[E] user write valid first name and valid last name
        And STep[F] User enter valid email
        And STep[G] User Enter password without special character and valid confirm password
        When STEP[H] Select User country code
        And STEP[I] User Enter valid phone number
        And STEP[J] Mark on subscribe to the Newsletter checkbox
        Then STEP[K] New Account is created successfully

      Scenario:  user could Create new account with invalid data (Password without Uppercase Letter) for B2C Register (Negative scenario)
        Given STEP[A] User Navigate to home page
        And STEP[B] User Click on login Button
        And STEP[C] User Click on create account Btn
        When STEP[D] User Select Title
        And STEP[E] User write valid first name and valid last name
        And STep[F] User Enter valid email
        And STep[G] User Enter password without Uppercase Letter and valid confirm password
        When STEP[H] Select User Country code
        And STEP[I] User Enter Valid phone number
        And STEP[J] Mark On subscribe to the Newsletter checkbox
        Then STEP[K] New Account Is created successfully

      Scenario:  user could Create new account with invalid data (Password without Number) for B2C Register (Negative scenario)
        Given STEP[A] User Navigate To home page
        And STEP[B] User Click On login Button
        And STEP[C] User Click On create account Btn
        When STEP[d] User Select Title
        And STEP[E] User Write valid first name and valid last name
        And STEp[F] User Enter valid email
        And STep[G] User Enter password without number and valid confirm password
        When STEP[H] Select User Country Code
        And STEP[I] User Enter Valid Phone number
        And STEP[J] Mark On Subscribe to the Newsletter checkbox
        Then STEP[K] New Account Is Created successfully

      Scenario:  user could Create new account with invalid data (invalid county code) for B2C Register (Negative scenario)
        Given STEP[A] User Navigate To Home page
        And STEP[B] User Click On Login Button
        And STEP[C] User Click On Create account Btn
        When STEP[d] USER Select Title
        And STEP[E] User Write Valid first name and valid last name
        And STEp[F] User Enter Valid email
        And STep[G] User Enter valid password and valid confirm password
        When STEP[H] User select invalid county code
        And STEP[I] User Enter Valid Phone Number
        And STEP[J] Mark On Subscribe to the Newsletter Checkbox
        Then STEP[K] New Account Is Created Successfully