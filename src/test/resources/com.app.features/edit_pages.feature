Feature: Edit Pages by edit option

 Scenario: Add text page
    Given I logged into Mahara as username "sopist" and password "abc1234"
    Then I click on "New Page" page
    And I click edit the page
    And I add more text as "Hello everyone" into the page
    And I click display page
    Then I should see text as "Hello everyone" on the page
  
 Scenario: Add image page
    Given I logged into Mahara as username "sopist" and password "abc1234"
    Then I click on "New Page" page
    And I click edit the page
    And I add an image into the page
    And I click display page
    Then I should see the image on the page
    