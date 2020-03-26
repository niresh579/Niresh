
Feature: to verify the Horoscope Matches section in PWA
  I want to use this template for my feature file

  @tag1
  Scenario: login 
  Given user in the login page
  When The user enter the username
        |username|M3507028|
     When  The user enter the password
     |password|test4bm|
   
    Then User click on login button

  @tag2
  Scenario: Menu and horoscope matches
    Given Verify user in home page
    When click the menu button in the home page
    Then click the Horoscope matches.
    And verify the horoscope matches are present.
    And If the horoscope matches are not present click the generate horoscope in the page.
   
   @tag3
  Scenario: date of birth
    Given verify the user in ADD Horoscope page.
    When click the Date of birth.
    And select the date of birth.
    Then save the date of birth.
   
    @tag4
  Scenario: Time of birth
    Given click the Time of birth.
    And select the time of birth.
    Then save the time of birth.
    
   @tag5
  Scenario: country of birth
    Given click the country of birth.
    And select the country of birth.
    Then save the country of birth.
    
      @tag6
  Scenario: State of birth
    Given click the State of birth.
    And select the State of birth.
    Then save the State of birth.
    
      @tag7
  Scenario: city of birth
    Given click the city of birth.
    And select the city of birth.
    Then save the city of birth.
    
    @tag8
  Scenario:  chart style
    Given click the chart style button.
    And select any one of the chart style.
    Then save the chart style.
    
    @tag9
  Scenario:  Language and generate horoscope
    Given click the language button.
    Then select any one of the language
    And  save the language.
    Then click the generate horoscope button
   
   @tag10
  Scenario: selecting any one profile in horoscopem matches
    Given select a profile in Horoscope matches
    Then shortlist the profile and send interest
    And  Go to recently viewad section and check whether the profile is displayed
    Then goto shortlisted and check whether that profile is displayed. 
    And  goto mailbox and check in sendbox whether the request is sent.
    And  Check whether the profiles in HM hroscope percent is more than and equal to 60% profile are only displayed