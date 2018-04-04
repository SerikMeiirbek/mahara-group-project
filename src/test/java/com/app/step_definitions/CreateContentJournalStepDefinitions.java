package com.app.step_definitions;

import com.app.pages.MaharaLoginPage;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class CreateContentJournalStepDefinitions {

	MaharaLoginPage loginPage = new MaharaLoginPage();
	
	@Given("^I logged into Mahara as username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_logged_into_Mahara_as_username_and_password(String username, String password) {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		loginPage.signIn(username, password);
	}

	@When("^I click on Journals$")
	public void i_click_on_Journals() {
		
	}

	@When("^I entered new Title as \"([^\"]*)\"$")
	public void i_entered_new_Title_as(String arg1) {

	}

	@When("^I entered the entry as \"([^\"]*)\"$")
	public void i_entered_the_entry_as(String arg1) {

	}

	@When("^I click on Save button$")
	public void i_click_on_Save_button() {

	}

	@Then("^I should see Title as \"([^\"]*)\" and entry as \"([^\"]*)\"$")
	public void i_should_see_Title_as_and_entry_as(String arg1, String arg2) {

	}

}
