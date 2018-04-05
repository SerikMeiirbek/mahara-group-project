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

  @ThisMine
  
  Scenario: Resume smoke test
    Given I logged into Mahara as username "serik" and password "abc1234"
    When I click on Resume
    And I click on Edit personal goals
    And I click save button
    Then I should see text "Saved successfully" is displayed

  Scenario: Journals smoke test
    Given I logged into Mahara as username "admin" and password "abc123"
    Then I click Journals on the Content list
    And I click on New entry button
    And I enter "My journal" into Title field
    And I enter "Hello world" into Entry field
    And I click save entry button
    Then I should see journal as "My journal" and entry as "Hello world" are displayed
