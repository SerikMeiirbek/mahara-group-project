Feature: Create a new page

  Scenario: Create a new page 
    Given I logged into Mahara as username "sopist" and password "sunsilk00"
    Then I click on add Pages and collections
    And I click on add Page
    And I enter the page title as "New Page"
    And I enter the page description  as "more information"
    And I save the page
    And I click display page
    Then I should see the page title is "New Page" and the page description is "more information"

  Scenario: Create a new page and name display format as First name
    Given I logged into Mahara as username "sopist" and password "sunsilk00"
    Then I click on add Pages and collections
    And I click on add Page
    And I enter the page title as "New Page"
    And I enter the page description  as "more information"
    And I choose "First name" display format
    And I save the page
    And I click display page
    Then I should see the page title is "New Page" and the page description is "more information"
    And I should see name display format as First name of user

  Scenario: Create a new page and add Image into the page
    Given I logged into Mahara as username "sopist" and password "sunsilk00"
    Then I click on add Pages and collections
    And I click on add Page
    And I enter the page title as "New Page"
    And I enter the page description  as "more information"
    And I save the page
    And I add an image into the page
    And I click display page
    Then I should see the page title is "New Page" and the page description is "more information"
    And I should see the image on the page
    
    Scenario: Create a new page and add Profile information into the page
    Given I logged into Mahara as username "sopist" and password "sunsilk00"
    Then I click on add Pages and collections
    And I click on add Page
    And I enter the page title as "New Page"
    And I enter the page description  as "more information"
    And I save the page
    And I add an image into the page
    And I click display page
    Then I should see the page title is "New Page" and the page description is "more information"
    And I should see the Profile information on the page
    
    
