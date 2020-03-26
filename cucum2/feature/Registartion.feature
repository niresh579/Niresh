
Feature: verify the search profile in pwa
 Given Verify the search profile
 @tag1
 Scenario: login 
  Given user in the login page
  When The user enter the username
        |username|M3507028|
     When  The user enter the password
     |password|test4bm|
   
    Then User click on login button

  @tag2
   Scenario:caste,stars,physical 
    And click the search button in the page
    And verify the user in search page.
    And click the caste button in the page
    When After click the caste verify the list of subcaste present or not.
    And click the any of the caste
    And save the selected caste
    And click the gotharam(stars).
    And  verify the list of stars
    And select any one of the stars from the list
    And save the selected star.
    And click the Physical status in the page
    Then verify the list of physical status
    @tag3
   Scenario: eating and drinking habits
    And select any one of the status from the list
    And  save the selected physical status in the page
    And click the Eating habits in the page.
    Then  verify the list of eating habits in the page
    And select any one of the eating habits from the list.
     And save the selected eating habits.
    And click the drinking habits.
    Then   verify the list of drinking habits
    @tag3
   Scenario:  smoking and search profile
    And select any one of the habits from the list
    And save the selected habits in the list.
    And click the smoking habits 
   Then verify the list of smoking habits
    And select any one of the habits from the list 
    And save the selected smoking habits in the list
   Then click the search profile