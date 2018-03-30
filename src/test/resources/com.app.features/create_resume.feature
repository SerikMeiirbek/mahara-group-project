Feature: Create resume

  @thisclass
  Scenario: Filling Introduction form
    Given I logged into Mahara as username "sanjar" and password "112233uuu"
    When I click on Resume
    And I enter Date of birth "1992/12/22"
    And I enter Place of birth "Kazakhstan"
    And I enter Citizenship "Kazakhstan"
    And I enter Visa status "Green Card"
    And I select Gender "Man"
    And I enter marital status "Single"
    When click save
    Then I should see  todays date "1992/12/22"
    Then I shoukd see Place of birth as "Kazakhstan"
    Then I should see Visa status as "Green card"
    Then I should see Gender as "Man"
    Then I should see marital status "Single"

   