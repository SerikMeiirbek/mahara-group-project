@regression
Feature: Create a new Profile

  Scenario: Create contact information
    Given I logged into Mahara as username "sopist" and password "abc1234"
    When I click "Profile" on the Content list
    Then I create contact information:
      | Official website address | http://www.mahara.com     |
      | Personal website address | http://www.morris.com     |
      | Blog address             | http://bloggerst.blog.com |
      | Postal address           | 3636 Homeland             |
      | Town                     | Stroudsburg               |
      | City/region              | Poconos                   |
      | Country                  | United States             |
      | Home phone               | 215-321-5588              |
      | Business phone           | 215-111-0000              |
      | Mobile phone             | 215-289-4545              |
      | Fax number               | 215-111-11-11             |
    And I save profile
    Then I should see following information:
      | Official website address | http://www.mahara.com     |
      | Personal website address | http://www.morris.com     |
      | Blog address             | http://bloggerst.blog.com |
      | Postal address           | 3636 Homeland             |
      | Town                     | Stroudsburg               |
      | City/region              | Poconos                   |
      | Country                  | United States             |
      | Home phone               | 215-321-5588              |
      | Business phone           | 215-111-0000              |
      | Mobile phone             | 215-289-4545              |
      | Fax number               | 215-111-11-11             |

  @thisone
  Scenario: Create contact information
    Given I logged into Mahara as username "sopist" and password "abc1234"
    When I click "Profile" on the Content list
    Then I click on General
    Then General contents followings should be displayed:
      | Occupation |
      | Industry   |
    Then I add required information:
      | Occupation | SDET |
      | Industry   | IT   |
    Then I click save profile
    Then following information should be displayed
      | Occupation | SDET |
      | Industry   | IT   |
