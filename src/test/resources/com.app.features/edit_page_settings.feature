Feature: Edit pages by settings options

 Scenario: Add text page
    Given I logged into Mahara as username "admin" and password "abc123"
    Then I click on add Pages and collections
    And I click edit the page
    And I click Settings
    And I change page title as "Page01"
    And I click on save
    Then I should see page title as "Page01 - Mahara" 
    
  Scenario: Add text page
    Given I logged into Mahara as username "admin" and password "abc123"
    Then I click on add Pages and collections
    And I click edit the page
    And I click Settings
   	And I choose "Last name" display format
    And I click on save
    And I should see name display format as "Last name" of user