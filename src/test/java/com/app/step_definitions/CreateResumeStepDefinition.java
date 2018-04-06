package com.app.step_definitions;

import static org.testng.Assert.assertTrue;

import com.app.pages.MaharaGoalsAndSkillsPage;
import com.app.utilities.BrowserUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateResumeStepDefinition {
	
	
	MaharaGoalsAndSkillsPage goalsAndSkillsPage = new MaharaGoalsAndSkillsPage();
	
	@When("^I click on Goals and skills$")
	public void i_click_on_Goals_and_skills() {
		BrowserUtils.waitForVisibility(goalsAndSkillsPage.GoalsAndSkills, 2);
		goalsAndSkillsPage.GoalsAndSkills.click();								//Clicking Goals And Skills button 
	}

	
	@When("^I click Personal goals$")
	public void i_click_Personal_goals() {
		BrowserUtils.waitForVisibility(goalsAndSkillsPage.goals_edit_personalgoal, 2);
		goalsAndSkillsPage.goals_edit_personalgoal.click();						//Clicking Personal goals form
	}

	@When("^I enter Personal golas \"([^\"]*)\"$")
	public void i_enter_Personal_golas(String string) {
		goalsAndSkillsPage.sendTextToDescriptionGoalsAndSkills(string);			//Entering Personal goals 
		
	}

	@When("^I click save on Goals and skills page$")	
	public void i_click_save_on_Goals_and_skills_page() {						//Saving the Form
		goalsAndSkillsPage.saveButton();
		
	}

	@Then("^I should see Saved successfully$")
	public void i_should_see_Saved_successfully() {
		BrowserUtils.waitForVisibility(goalsAndSkillsPage.messages, 2);
		assertTrue(goalsAndSkillsPage.messages.isDisplayed());					//Verify the Form has been saved
	}

	@Then("^I click on Academic Goals$")
	public void i_click_on_Academic_Goals() {
		BrowserUtils.waitForVisibility(goalsAndSkillsPage.goals_edit_academicgoal, 2);
		goalsAndSkillsPage.goals_edit_academicgoal.click();						//Clicking Academic goals form
		
	}

	@Then("^I enter Academic Goals \"([^\"]*)\"$")
	public void i_enter_Academic_Goals(String string) {
		goalsAndSkillsPage.sendTextToDescriptionGoalsAndSkills(string);			//Entering  Academic goals 
	}

	@Then("^I click Career goals$")												
	public void i_click_Career_goals() {										//Clicking Carer goals
		goalsAndSkillsPage.goals_edit_careergoal.click();								
	}

	@Then("^I enter Carrer goals \"([^\"]*)\"$")								//Entering Carer goals
	public void i_enter_Carrer_goals(String string) {
		goalsAndSkillsPage.sendTextToDescriptionGoalsAndSkills(string);	
	}

	@Then("^I click Personal skills$")
	public void i_click_Personal_skills() {
		BrowserUtils.waitForVisibility(goalsAndSkillsPage.skills_edit_personalskill, 2);
		goalsAndSkillsPage.skills_edit_personalskill.click();				//Clicking Personal skills
	}

	@Then("^I enter Personal skills \"([^\"]*)\"$")
	public void i_enter_Personal_skills(String string) {						//Entering Personal skills

		goalsAndSkillsPage.sendTextToDescriptionGoalsAndSkills(string);
	}

	@Then("^I click Work skills$")
	public void i_click_Work_skills() {
		BrowserUtils.waitForVisibility(goalsAndSkillsPage.skills_edit_workskill, 2);//Clicking Work skills
		goalsAndSkillsPage.skills_edit_workskill.click();
	}

	@Then("^I enter Work skills \"([^\"]*)\"$")								//Entering Work skills
	public void i_enter_Work_skills(String string) {
		goalsAndSkillsPage.sendTextToDescriptionGoalsAndSkills(string);
	}

}
