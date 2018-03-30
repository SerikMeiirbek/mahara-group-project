Feature: Create resume

 @thisclass1
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
    Then I should see Visa status as "Green Card"
    Then I should see Gender as "Man"
    Then I should see marital status "Single"
    
 @thisclass
  Scenario: 
    Given I logged into Mahara as username "sanjar" and password "112233uuu"
    When I click on Resume
    And I click on Education and employment 
    And I click button add
    And I enter Start date "09/01/2011"
    And I enter End date "07/01/2015"
    And I enter Institution "IKTU"
    And I enter Institution address "Kazakhstan"
    And I enter Qualification type "IT"
    And I enter Qualification name "IT"
    And I enter Qualification description "computer science"
    And I click save
    Then I should see institution "IKTU"
    
    
    
