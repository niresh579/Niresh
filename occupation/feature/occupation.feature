
@tag
Feature: Title of your featureTo verify the occupation field in pwa
  I want to use this template for my feature file

  @tag1
  Scenario: Login
    Given user in the login page
  When The user enter the username
        |username|M3507028|
     When  The user enter the password
     |password|test4bm|
   
    Then User click on login button
  @tag2
  Scenario: menu and edit PI
    Given click the menu in home page
    When Go to edit PI and click it
    Then Click the professional Information in edit PI.
    And  Go to occupation field
    Then  verify all the list of occupation with existing criteria