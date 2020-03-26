
@tag
Feature: To check the all occupation field in Registration
  I want to use this template for my feature file

  @tag1
  Scenario: Registration Page
    Given select any one of the categery in create profile for
    And enter the user name
        |username|Ashok|
    And select the gender  
    Then user should select the date of birth    
    And Select the country code
    When enter the mobile number
         |phonenumber|9176800869|
    And enter the password
     |password|test4bm|
    And select the religion     
    Then click the button register free
     When select the mother tongue
     
      @tag2
  Scenario: second page registration
    Given Enter the valid email id
     And Select the caste
     And Select the dosham 
     Then Select the martial status
     Then select the family information
     
    @tag3 
  Scenario: third page occupation
    Given User should enter the height
     And Select any one of the physical status
     And Select any one of the education in the list 
     Then Select any one of the employed in the list
     Then select the occupation and verify all the occupation 
     And  select the rupees and annual income 
     And  select the work location and residing state
     And  click the contine button