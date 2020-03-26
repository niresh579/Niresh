
@tag
Feature: Title of your featureTo verify the occupation field in editpp
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
    When click the edit pp.
    Then The user to click the professional preference in patner preference field. 
    And  User to click the occupation field.
    Then Verify the list of occupation with existing criteria 
    