Feature: Create a new Journal

  @create_profile
  Scenario: Create profile
    Given I logged into Mahara
    When I click on Profile:
      | firstName | lastName | studentID | displayName | introduction |
      | Nodira    | J        |      5555 | Nodira      | hello        |
    Then I should see contact information for "Nodira J"
    Then I save profile

  @create_contact_info
  Scenario: Create contact information
    Given I logged into Mahara
    When I click on Contact information:
    Then  followings should be displayed
   
|Official website address|
|Help for "Official website address"|
|Personal website address|
|Blog address|
|Postal address|
|Town|
|City/region|
|Country|
|Home phone|
|Business phone|
|Mobile phone|
|Fax number|
    