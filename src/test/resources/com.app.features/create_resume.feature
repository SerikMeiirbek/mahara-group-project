@thisone
Feature: Create resume

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

  Scenario: Filing Education and employment form
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
    When I click save
    Then I should see institution "IKTU"

  Scenario: Filling Certifications form
    Given I logged into Mahara as username "sanjar" and password "112233uuu"
    When I click on Resume
    And I click on Achievements
    And I click add on Certifications, accreditations and awards
    And I enter Date "Date"
    And I enter Title "Java"
    And I enter Description "java for everyone"
    When I click save button
    Then I should see "Java"

  Scenario: Filling Books and publications
    Given I logged into Mahara as username "sanjar" and password "112233uuu"
    When I click on Resume
    And I click on Achievements
    And I click add on Books and publications
    And I enter Date of publications "1/1/2018"
    And I enter Book title "Java"
    And I enter Contribution "OCA"
    And I enter Details of your contribution "how pass java certification"
    When I click addBook save
    Then I should see book Title "Java"

  Scenario: Filling Professional memberships form
    Given I logged into Mahara as username "sanjar" and password "112233uuu"
    When I click on Resume
    And I click on Achievements
    And click add on Professional memberships
    And I enter start date "1/1/2018"
    And I enter End Date "1/5/2018"
    And I enter Title of memberships "Golf Club"
    And I enter Membership description "healthy life style"
    When I click add membership button
    Then I should see membership title "Golf Club"
