Feature: Create new plans in Content

  Scenario: Create new plans in Content
    Given I logged into Mahara as username "admin" and password "abc123"
    When I click on Content
    And I choose Plans section
    And I should be able to click "New plan" 
		And I click on the "New plan" button
		
 	Scenario: Create new plans in Content
 		Given I logged into Mahara as username "admin" and password "abc123"
 		When I click on Content
    And I choose Plans section
    And I should be able to click "New plan" 
    And I click on the "New plan" button
 		Then I enter title name as a "Plans for next 5 years"
 		
