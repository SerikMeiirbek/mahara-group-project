Feature: Comment on pages
	
  Scenario: Text comment
    Given I logged into Mahara as username "sopist" and password "abc1234"
    Then I click on "New Page" page
    And I comment "test comment" into the add comment box
    And I click Comment
    Then I should see comment "test comment"

  Scenario: Comment with text and attach file
    Given I logged into Mahara as username "sopist" and password "abc1234"
    And I click on "New Page" page
    And I comment "test comment" into the add comment box
    And I attach file
    And I click Comment
    Then I should see comment "test comment"
    And I should see the file attached

  Scenario: Attach file comment
    Given I logged into Mahara as username "sopist" and password "abc1234"
    Then I click on "New Page" page
    And I attach file
    And I click Comment
    Then I should see the file attached