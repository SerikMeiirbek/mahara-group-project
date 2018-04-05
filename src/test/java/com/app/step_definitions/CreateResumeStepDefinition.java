package com.app.step_definitions;

import org.openqa.selenium.interactions.Actions;

import com.app.pages.MaharaGoalsAndSkillsPage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

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
		goalsAndSkillsPage.goals_edit_personalgoal.click();
	}

	@When("^I enter Personal golas \"([^\"]*)\"$")
	public void i_enter_Personal_golas(String string) {
		BrowserUtils.waitFor(2);
//		
//		BrowserUtils.waitForVisibility(goalsAndSkillsPage.personalGoalsDescription, 2);
//		goalsAndSkillsPage.personalGoalsDescription.clear();
//		goalsAndSkillsPage.personalGoalsDescription.sendKeys(string);
	//	Actions actions = new Actions(Driver.getDriver());
	
	//	actions.sendKeys(goalsAndSkillsPage.personalGoalsDescription, string).perform();
	}

	@When("^I click save on Goals and skills page$")
	public void i_click_save_on_Goals_and_skills_page() {
		
		BrowserUtils.waitForVisibility(goalsAndSkillsPage.editgoalsandskills_submitform,2);
		Actions actions = new Actions(Driver.getDriver());
		actions.moveToElement(goalsAndSkillsPage.editgoalsandskills_submitform).click().perform();
		
	}

	@Then("^I should see Saved successfully$")
	public void i_should_see_Saved_successfully() {
		
	}

	@Then("^I click on Academic Goals$")
	public void i_click_on_Academic_Goals() {
		BrowserUtils.waitForVisibility(goalsAndSkillsPage.goals_edit_academicgoal, 2);
		goalsAndSkillsPage.goals_edit_academicgoal.click();
		
	}

	@Then("^I enter Academic Goals \"([^\"]*)\"$")
	public void i_enter_Academic_Goals(String string) {
		BrowserUtils.waitForVisibility(goalsAndSkillsPage.personalGoalsDescription, 2);
		goalsAndSkillsPage.personalGoalsDescription.sendKeys(string);
	}

	@Then("^I click Career goals$")
	public void i_click_Career_goals() {
		
	}

	@Then("^I enter Carrer goals \"([^\"]*)\"$")
	public void i_enter_Carrer_goals(String arg1) {
		
	}

	@Then("^I click Personal skills$")
	public void i_click_Personal_skills() {
		
	}

	@Then("^I enter Personal skills \"([^\"]*)\"$")
	public void i_enter_Personal_skills(String arg1) {
		
	}

	@Then("^I click Work skills$")
	public void i_click_Work_skills() {
		
	}

	@Then("^I enter Work skills \"([^\"]*)\"$")
	public void i_enter_Work_skills(String arg1) {
		
	}

}
