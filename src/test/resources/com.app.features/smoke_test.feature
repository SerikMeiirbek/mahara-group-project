#@smoke
Feature: Pages and collections smoke test
	@smoke
  Scenario: Pages and collections smoke test
    Given I logged into Mahara as username "sopist" and password "abc1234"
    Then I click add new page
    And I enter the page title as "New Page"
    And I save the page
    And I add an image into the page
    And I click display page
    Then I should see page title as "New Page - Mahara"
    And I should see the image on the page

  Scenario: Profile smoke test
    Given I logged into Mahara as username "admin" and password "abc123"
    Then I click "Profile" on the Content list
    And I enter "Hello everyone" into introduction field
    And I click save profile
    Then I should see text "Profile saved successfully" is displayed

  Scenario: Resume smoke test
    Given I logged into Mahara as username "admin" and password "abc123"
    Then I click "Résumé" on the Content list
    And I click on Edit personal goals
    And I click save button
    Then I should see text "Saved successfully" is displayed

  Scenario: Journals smoke test
    Given I logged into Mahara as username "admin" and password "abc123"
    Then I click "Journals" on the Content list
    And I click on New entry button
    And I enter "My journal" into Title field
    And I enter "Hello world" into Entry field
    And I click save entry button
    Then I should see journal as "My journal" and entry as "Hello world" are displayed
