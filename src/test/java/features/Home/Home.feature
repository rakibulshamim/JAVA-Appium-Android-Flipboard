Feature: Exploring Flipboard Home Features

  Background:
    Given Click on Get started button
    And Click on topic picker login button
    And Click on Email button
    And Click on None of The Above button
    When Enter username "shamim30453@outlook.com"
    And Click on NEXT button
    And Enter password "963147@test"
    Then Click on login button


  @Android
  Scenario: Verify that Daily Edition, Ukraine and What's Your Passion pages are opened
    Given Click on Daily Edition
    When Verify that Daily Edition page is open
    And Click on What's Your Passion
    Then Verify that What's Your Passion page is open



  @Android
  Scenario Outline: Verify that topic personalize tab works properly
    Given Click on Personalize button
    When Verify that Personalize For You tab is open
    And Type "<search>" in search bar
    And Click on GOLD(COMMODITY) from the list
    And Click on Save Changes button
    Then Verify that Updated message appears
    Examples:
      | search |
      |  gold  |


  @Android
  Scenario: Check that post following/unfollowing works properly
    Given Click on Following icon from bottom nav
    When Verify that Following page is open properly
    And Click on first topic menu from the list
    And Click on Unfollow button
    Then Click on Unfollow button again from Unfollow tab



  @Android
  Scenario Outline: Check that Explore page works properly
    Given Click on Explore icon from bottom nav
    When Verify that Explore page is open properly
    And Click on search box
    And Enter "<search>" in search bar
    And Press Enter key
    And Verify that search results display properly
    And Click on first search result topic
    Then Verify that proper topic page is open
    Examples:
      |  search   |
      | education |



  @Android
  Scenario: Check that Notifications are showing properly
    Given Click on Notifications icon from bottom nav
    When Verify that Notifications page is open properly
    And Click on Activity button
    And Verify that activity notifications are displayed
    And Click on Updates button
    Then Verify that update notifications are displayed



  @Android
  Scenario: Check that Profile picture is uploaded properly
    Given Click on Profile icon from bottom nav
    When Verify that Profile page is open properly
    And Click on profile avatar
    And Click on Update Profile Picture button
    And Click on Choose From Library
    And Click on Gallery
    And Click on first image from gallery
    Then Click on Save button
    And Verify that profile picture is uploaded and Profile page is loaded properly



  @Android
  Scenario: Check that history is showing properly
    Given Click on Profile icon from bottom nav
    When Verify that Profile page is open properly
    And Click on history icon from profile page header
    Then Verify that History page is open properly
    And Verify that history list is showing properly



  @Android
  Scenario: Check that Share Tab is open properly
    Given Click on Profile icon from bottom nav
    When Verify that Profile page is open properly
    And Click on Share icon from profile page header
    Then Verify that Share Tab is open properly



  @Android
  Scenario: Verify that Find People to Follow works properly
    Given Click on Profile icon from bottom nav
    When Verify that Profile page is open properly
    And Click on Find Friends icon from profile page header
    And Verify that Find People to Follow page is open properly
    And Click on Follow button
    Then Verify that Following message appears



  @Android
  Scenario Outline: Verify that user can create a magazine successfully
    Given Click on Profile icon from bottom nav
    When Verify that Profile page is open properly
    And Click on red magazine grid button
    And Verify that Make a Magazine tab is open properly
    And Click on For collecting
    And Verify that For collecting tab is open properly
    And Enter magazine "<title>" in magazine name box
    And Enter magazine "<description>" magazine description box
    And Click on Make this private button
    Then Click on Next button
    And Verify that magazine was created successfully
    Examples:
      |        title       |    description    |
      | The New York Times |  Test description |



  @Android
  Scenario: Verify that user can Log out successfully
    Given Click on Profile icon from bottom nav
    When Verify that Profile page is open properly
    And Click on settings icon from profile page header
    And Verify that settings page is open properly
    And Click on Account button
    And Verify that Account page is open properly
    And Click on Log out button
    And Verify that confirm alert tab is open properly
    And Click on confirm Log out button
    Then Verify that user can Log out successfully