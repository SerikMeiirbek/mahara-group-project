Feature: Create a new Journal 

	Scenario: Create a new Journal
	Given I logged into Mahara as username "sopist" and password "abc1234"
	When I click on Journals
	And I entered new Title as "Our second project"
	And I entered the entry as "Anything"
	And I click on Save button
	Then I should see Title as "Our second project" and entry as "Anything"
	
	