Feature: Edit resume

  Scenario: Edit Introduction form
    Given I logged into Mahara as username "sanjar" and password "112233uuu"
    When I click on Resume
    And I enter Place of birth "USA"
    And I enter Citizenship "USA"
    When click save
    Then I should see Place of birth as "USA"
    Then I should see Citizenship as "USA"
    
   Scenario: Edit Education and employment form
    Given I logged into Mahara as username "sanjar" and password "112233uuu"
    When I click on Resume
    And I click on Education and employment
    And I click button edit
    And I enter Start date "01/12/2010"
    And I enter Institution "HR"
    When I click save
    Then I should see Start date as "01/12/2010"
    Then I should see institution "HR"