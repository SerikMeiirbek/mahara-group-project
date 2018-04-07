
Feature: Create a new page
	@one
  Scenario: Create a new page 
    Given I logged into Mahara as username "sopist" and password "abc1234"
    Then I click add new page
    And I enter the page title as "New Page"
    And I enter the page description  as "more information"
    And I save the page
    And I click display page
    Then I should see page title as "New Page - Mahara"
    And the page description is "more information"

  Scenario: Create a new page and name display format as First name
    Given I logged into Mahara as username "sopist" and password "abc1234"
    Then I click add new page
    And I enter the page title as "New Page"
    And I choose "First name" display format
    And I save the page
    And I click display page
    Then I should see page title as "New Page - Mahara"
    And I should see name display format as "Sopist"

  Scenario: Create a new page and add Image into the page
    Given I logged into Mahara as username "sopist" and password "abc1234"
    Then I click add new page
    And I enter the page title as "New Page"
    And I save the page
    And I add an image into the page
    And I click display page
    Then I should see page title as "New Page - Mahara"
    And I should see the image on the page

    
    
