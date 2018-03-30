package com.app.step_definitions;

import static org.testng.Assert.assertTrue;

import com.app.pages.résumé.MaharaEducationAndEmploymentPage;
import com.app.utilities.BrowserUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CreateResumeEducationStepDefinition {

	MaharaEducationAndEmploymentPage educationPage = new MaharaEducationAndEmploymentPage();

	@When("^I click on Education and employment$")
	public void i_click_on_Education_and_employment() {
		educationPage.EducationAndEmployment.click();
	}

	@When("^I click button add$")
	public void i_click_button_add() {
		BrowserUtils.waitForVisibility(educationPage.addButton,2);
		educationPage.addButton.click();
	}

	@When("^I enter Start date \"([^\"]*)\"$")
	public void i_enter_Start_date(String startDate) {
		educationPage.startDate.sendKeys(startDate);
	}

	@When("^I enter End date \"([^\"]*)\"$")
	public void i_enter_End_date(String endDate) {
		educationPage.endDate.sendKeys(endDate);
	}

	@When("^I enter Institution \"([^\"]*)\"$")
	public void i_enter_Institution(String institution) {
		educationPage.institution.sendKeys(institution);
	}

	@When("^I enter Institution address \"([^\"]*)\"$")
	public void i_enter_Institution_address(String address) {
		educationPage.institutionAddress.sendKeys(address);
	}

	@When("^I enter Qualification type \"([^\"]*)\"$")
	public void i_enter_Qualification_type(String qualification) {
		educationPage.qualificationType.sendKeys(qualification);
	}

	@When("^I enter Qualification name \"([^\"]*)\"$")
	public void i_enter_Qualification_name(String qualificationName) {
		educationPage.qualificationName.sendKeys(qualificationName);
	}

	@When("^I enter Qualification description \"([^\"]*)\"$")
	public void i_enter_Qualification_description(String qualificationDescription) {
		educationPage.qualificationDescription.sendKeys(qualificationDescription);
	}

	@When("^I click save$")
	public void i_click_save() {
		educationPage.save.click();
	}

	@Then("^I should see institution \"([^\"]*)\"$")
	public void i_should_see_institution(String string) {
		assertTrue(educationPage.educationList.getText().contains(string));
		
	}
}
