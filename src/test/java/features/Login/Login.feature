Feature: User Login

  @Android
  Scenario: Verify that home page is loaded without login
    Given Click on Get started button
    And User select first topic from list
    And User select second topic form list
    And User select third topic form list
    When Click on continue button
    And Click on continue button
    And Click on continue button
    And Click on Skip for Now button
    Then Home page is loaded without login



  @Android
  Scenario Outline: Verify that login By Email is Successful with valid credentials
    Given Click on Get started button
    And Click on topic picker login button
    And Click on Email button
    And Click on None of The Above button
    When User enter "<email>" in the email field
    And Click on NEXT button
    And User enter "<password>" in the password field
    Then Click on login button
    And Login successfully and home page is loaded
    Examples:
      |          email          |  password   |
      | shamim30453@outlook.com | 963147@test |



  @Android
  Scenario Outline: Verify that login By Email is Successful with invalid credentials
    Given Click on Get started button
    And Click on topic picker login button
    And Click on Email button
    And Click on None of The Above button
    When User enter "<email>" in the email field
    And Click on NEXT button
    And User enter "<password>" in the password field
    And Click on login button
    Then Error message should be visible
    Examples:
      |          email          |  password   |
      | shamim30453@outlook.com |  123456789  |