Feature: Like, Comment, Mute, Flip, Share, Save Image and Report on Post

  Background:
    Given Click on Get started button
    And Click on topic picker login button
    And Click on Email button
    And Click on None of The Above button
    When Enter username "shamim30453@outlook.com"
    And Click on NEXT button
    And Enter password "963147@test"
    And Click on login button
    And Click on three dots menu from post
    Then Verify that three dots menu lists are open properly


  @Android
  Scenario: Verify that the user can like the post
    Given Click on Like button from menu lists
    Then Verify that post has been liked


  @Android
  Scenario: Verify that user can less like a post
    Given Click on Show less like this button from menu lists
    When Click on Done button
    Then Verify that feedback massage is displayed


  @Android
  Scenario: Verify that user can mute a post
    Given Click on Mute button from menu lists
    Then Verify that story hidden massage is displayed


  @Android
  Scenario Outline: Verify that user can flip a post
    Given Click on flip button from menu lists
    When Verify that flip tab is open
    And Click on Create new magazine button
    And Enter magazine "<title>" in magazine name box
    And Enter magazine "<description>" magazine description box
    And Click on Make this private button
    Then Click on Next button
    And Verify that Flipped message appears
    Examples:
      |        title       |    description    |
      | The New York Times |  Test description |


  @Android
  Scenario: Check that user can share a post
    Given Click on share button from menu lists
    When Verify that share tab is open
    And Click on Facebook icon
    Then Click on Post button


  @Android
  Scenario: Verify that viewing a post on web browser works properly
    Given Click on View on Web button from menu lists
    When Click on Chrome browser
    Then Verify that post is displayed in a web browser


  @Android
  Scenario: Verify that user can copy a post link
    Given Scroll down menu list
    When Click on Copy link button from menu lists
    Then Verify that Copied Link message appears


  @Android
  Scenario: Verify that user can save an image to device from post
    Given Scroll down menu list
    When Click on Save Image In Device button from menu lists
    And Click on allow for give permission to download
    Then Verify that Image saved message appears


  @Android
  Scenario: Verify that user can report a post
    Given Scroll down menu list
    When Click on Report button from menu lists
    And Click on This is off topic
    And Click on first reason from the list
    And Click on Done button
    Then Verify that feedback massage is displayed

