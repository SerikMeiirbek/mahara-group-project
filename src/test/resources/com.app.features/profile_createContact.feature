Feature: Create a new Profile

  @create_contact_info
  Scenario: Create contact information
    Given I logged into Mahara
    When In the Profile I click on Contact information:
    Then I create contact information: 
      | Official website address            |www.mahara.com|
      | Personal website address            |www.morris.com|
      | Blog address                        |http://bloggerst.blog.com|
      | Postal address                      |3636 Homeland|
      | Town                                |Stroudsburg|
      | City/region                         |Poconos|
      | Country                             |United States|
      | Home phone                          |215-321-5588|
      | Business phone                      |215-111-0000|
      | Mobile phone                        |215-289-4545|
      | Fax number                          |215-111-11-11|
      
      Then I should see following information: 
      | Official website address            |www.mahara.com|
      | Personal website address            |www.morris.com|
      | Blog address                        |http://bloggerst.blog.com|
      | Postal address                      |3636 Homeland|
      | Town                                |Stroudsburg|
      | City/region                         |Poconos|
      | Country                             |United States|
      | Home phone                          |215-321-5588|
      | Business phone                      |215-111-0000|
      | Mobile phone                        |215-289-4545|
      | Fax number                          |215-111-11-11|
     Then I save profile
     
 @create_contact_info
  Scenario: Create contact information
    Given I logged into Mahara
    When In the Profile I click on General
    Then followings should be displayed:
    |Occupation|
    |Industry|
Then I add required information:
|Occupation|SDET|
    |Industry|IT|
Then following information should be displayed
    |Occupation|SDET|
    |Industry|IT|
    Then I click save profile
    
    
    