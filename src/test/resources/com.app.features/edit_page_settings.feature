Feature: Edit pages by settings options
	
  Scenario: Add text page
    Given I logged into Mahara as username "sopist" and password "abc1234"
    Then I click on "New Page" page
    And I click edit the page
    And I click on page settings
    And I change page title as "Page01"
    And I save the page
    And I click display page
    Then I should see page title as "Page01 - Mahara"
@thisone
  Scenario: Add text page
    Given I logged into Mahara as username "sopist" and password "abc1234"
    Then I click on "New Page" page
    And I click edit the page
    And I click on page settings
    And I choose "Last name" display format
    And I save the page
    And I click display page
    And I should see name display format as "Sa"
