Feature: User Choose 3 Topic

  @Android
  Scenario: User choose at least 3 topics to continue page
    Given Click on Get started button
    And User select first topic from list
    And User select second topic form list
    And User select third topic form list
    When Click on continue button
    And Click on continue button
    And Click on continue button
    Then Verify that login page is loaded