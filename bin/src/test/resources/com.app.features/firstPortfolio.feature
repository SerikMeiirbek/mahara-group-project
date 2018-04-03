Feature: Create a new Journal 
@thisclass

	Scenario: Create a new Journal
	Given I logged into Mahara as username "sanjar" and password "112233uuu"
	When I click on Journals
	And I entered new Title as "Our second project"
	And I entered the entry as "Anything"
	And I click on Save button
	Then I should see Title as "Our second project" and entry as "Anything"
	
	