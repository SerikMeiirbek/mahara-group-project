<<<<<<< HEAD
Feature: Pages and collections smoke test

  Scenario: Pages and collections smoke test
    Given I logged into Mahara as username "admin" and password "abc123"
    Then I click on Portfolio
    And I click add button
    And I enter page title as "Page 1"
    And I click save button
    And I add image block into page
    And I click display page
    Then I should see page "Page 1" is displayed
    And I sould see image block is displayed

  Scenario: Profile smoke test
    Given I logged into Mahara as username "admin" and password "abc123"
    Then I click Profile on the Content list
    And I enter "Hello everyone" into introduction field
    And I click save profile
    Then I should see text "Profile saved successfully" is displayed


  
  @smoke
  Scenario: Resume smoke test
    Given I logged into Mahara as username "serik" and password "abc1234"
    When I click on Resume
    And I click on Goals and skills
    And I click Personal goals
    And I enter Personal golas "my goals"
    When I click save on Goals and skills page
    Then I should see Saved successfully

  Scenario: Journals smoke test
    Given I logged into Mahara as username "serik" and password "abc1234"
    Then I click Journals on the Content list
=======
#@smoke
Feature: Mahara Smoke test
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
	@smoke
  Scenario: Profile smoke test
    Given I logged into Mahara as username "sopist" and password "abc1234"
    Then I click "Profile" on the Content list
    And I enter "Hello everyone" into introduction field
    And I click save profile
    Then I should see text "Profile saved successfully" is displayed

  Scenario: Resume smoke test
    Given I logged into Mahara as username "sopist" and password "abc1234"
    Then I click "R�sum�" on the Content list
    And I click on Edit personal goals
    And I click save button
    Then I should see text "Saved successfully" is displayed

  Scenario: Journals smoke test
    Given I logged into Mahara as username "sopist" and password "abc1234"
    Then I click "Journals" on the Content list

    And I click on New entry button
    And I enter "My journal" into Title field
    And I enter "Hello world" into Entry field
    And I click save entry button
    Then I should see journal as "My journal" and entry as "Hello world" are displayed
