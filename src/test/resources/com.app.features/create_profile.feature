@regression
Feature: Create a new Profile

  Scenario Outline: Create profile
    Given I logged into Mahara as username "sopist" and password "abc1234"
    When I click "Profile" on the Content list
    And I create profile
      | firstName    | <firstName>    |
      | lastName     | <lastName>     |
      | studentID    | <studentID>    |
      | displayName  | <displayName>  |
      | introduction | <introduction> |
    And I save profile
    Then I should see contact information for "<firstName> <lastName>"

    Examples: 
      | firstName | lastName | studentID | displayName | introduction |
      | Nodira    | J        |      5555 | Nodira      | hello        |
      | Paul      | Walker   |     23444 | Paul W      | Good luck    |
      
  Scenario: Create contact information
    Given I logged into Mahara as username "sopist" and password "abc1234"
    When I click "Profile" on the Content list
    And I click on Contact information:
    Then followings should be displayed
      | Official website address            |
      | Personal website address            |
      | Blog address                        |
      | Postal address                      |
      | Town                                |
      | City/region                         |
      | Country                             |
      | Home phone                          |
      | Business phone                      |
      | Mobile phone                        |
      | Fax number                          |
