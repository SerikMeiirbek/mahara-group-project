Feature: Edit Pages by edit option
 
 Scenario: Add text page
    Given I logged into Mahara as username "admin" and password "abc123"
    Then I click on add Pages and collections
    And I click edit the page
    And I add more text as "Hello everyone" into the page
    Then I should see text as "Hello everyone" on the page
    
 Scenario: Add image page
    Given I logged into Mahara as username "admin" and password "abc123"
    Then I click on add Pages and collections
    And I click edit the page
    And I add an image into the page
    Then I should see the image is displayed on the page
    