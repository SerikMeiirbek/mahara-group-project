
Feature: Comment on pages

  Scenario: Text comment
    Given I logged into Mahara as username "admin" and password "abc123"
    Then I click on add Pages and collections
    And I click on Page1
    And I comment "test comment" into the add comment box
    And I click Comment
    Then I should see comment "test comment"

  Scenario: Comment with text and attach file
    Given I logged into Mahara as username "admin" and password "abc123"
    Then I click on add Pages and collections
    And I click on Page1
    And I comment "test comment" into the add comment box
    And I attach file
    And I click Comment
    Then I should see comment "test comment"
    And I should see the file attached

  Scenario: Attach file comment
    Given I logged into Mahara as username "admin" and password "abc123"
    Then I click on add Pages and collections
    And I click on Page1
    And I attach file
    And I click Comment
    Then I should see the file attached