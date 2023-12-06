Feature: Test the amazon Application

  Scenario: Validate search product Functionality
    Given user open a amazon url
    And user search iphone and select product
    When user go to details page
    Then user select and capture price and store in varible
    And add to cart
    
    Scenario: Create New user
    When user is on home page and click on Account and list
    Then user go to sign in page and click on create your amazon account link
    Then user enter firstname and lastname and mobile number and password
    And click on verify mobile number link
    
    Scenario: Validate phone filter functionality
    Given user is on homePage
    And user search phone
    And click on sort by
  
    
    
    