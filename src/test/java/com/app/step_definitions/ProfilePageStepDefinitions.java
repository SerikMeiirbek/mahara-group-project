package com.app.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import com.app.pages.MaharaDashboardPage;
import com.app.pages.MaharaProfilePage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProfilePageStepDefinitions {

	MaharaDashboardPage dashboardPage = new MaharaDashboardPage();
	MaharaProfilePage profilePage = new MaharaProfilePage();

	@Then("^I click \"([^\"]*)\" on the Content list$")
	public void i_click_on_the_Content_list(String menu) {
		dashboardPage.navigationBar.click();
		BrowserUtils.waitForVisibility(dashboardPage.navigationList, 2);
		// dashboardPage.contentDropDown.click();
		// dashboardPage.profile.click();
		dashboardPage.clickOnContectList(menu);
	}

	@Then("^I enter \"([^\"]*)\" into introduction field$")
	public void i_enter_into_introduction_field(String introduction) {
		profilePage.addIntroduction(introduction);
		BrowserUtils.waitForVisibility(profilePage.saveProfile, 2);
	}

	@Then("^I click save profile$")
	public void i_click_save_profile() {
		profilePage.saveProfile.click();
	}

	@Then("^I should see text \"([^\"]*)\" is displayed$")
	public void i_should_see_text_is_displayed(String arg1) {
		assertEquals(profilePage.messages.getText(), "Profile saved successfully");
	}

	@When("^I create profile$")
	public void i_create_profile(Map<String, String> profile) {
		BrowserUtils.waitForVisibility(profilePage.firstName, 3);

		profilePage.firstName.clear();
		profilePage.firstName.sendKeys(profile.get("firstName"));
		profilePage.lastName.clear();
		profilePage.lastName.sendKeys(profile.get("lastName"));
		profilePage.studentID.clear();
		profilePage.studentID.sendKeys(profile.get("studentID"));
		profilePage.displayName.clear();
		profilePage.displayName.sendKeys(profile.get("displayName"));
		profilePage.addIntroduction(profile.get("introduction"));
	}

	@Then("^I should see contact information for \"([^\"]*)\"$")
	public void i_should_see_contact_information_for(String fullName) {
		BrowserUtils.waitForVisibility(profilePage.firstName, 3);
		assertTrue(profilePage.messages.isDisplayed());
		assertEquals(profilePage.firstName.getAttribute("value") + " " + profilePage.lastName.getAttribute("value"),
				fullName);
	}

	@Then("^I save profile$")
	public void i_save_profile() {
		profilePage.saveProfile.click();
	}

	@When("^I click on Contact information:$")
	public void i_click_on_Contact_information() {
		profilePage.ContactInformation.click();
	}

	@Then("^followings should be displayed$")
	public void followings_should_be_displayed(List<String> contents) {
		BrowserUtils.waitForVisibility(profilePage.officialwebsite, 5);

		assertEquals(profilePage.officialwebsite.getText(), contents.get(0));
		assertEquals(profilePage.personalwebsite.getText(), contents.get(1));
		assertEquals(profilePage.blogaddress.getText(), contents.get(2));
		assertEquals(profilePage.postaladdress.getText(), contents.get(3));
	}

	@Then("^I create contact information:$")
	public void i_create_contact_information(Map<String, String> details) {
		profilePage.ContactInformation.click();
		BrowserUtils.waitForVisibility(profilePage.officialwebsiteF, 5);

		for (String key : details.keySet()) {

			switch (key) {
			case "Official website address":
				profilePage.officialwebsiteF.clear();
				profilePage.officialwebsiteF.sendKeys(details.get(key));
				break;
			case "Personal website address":
				profilePage.personalwebsiteF.clear();
				profilePage.personalwebsiteF.sendKeys(details.get(key));
				break;
			case "Blog address":
				profilePage.blogaddressF.clear();
				profilePage.blogaddressF.sendKeys(details.get(key));
				break;
			case "Postal address":
				profilePage.postaladdressF.clear();
				profilePage.postaladdressF.sendKeys(details.get(key));
				break;
			case "Town":
				profilePage.townF.clear();
				profilePage.townF.sendKeys(details.get(key));
				break;
			}

		}
	}

	@Then("^I should see following information:$")
	public void i_should_see_following_information(Map<String, String> details) {
		BrowserUtils.waitForVisibility(profilePage.officialwebsiteF, 5);

		for (String key : details.keySet()) {
			
			switch (key) {
			case "Official website address":
				assertEquals(profilePage.officialwebsiteF.getAttribute("value"), details.get(key));
				break;
			case "Personal website address":
				assertEquals(profilePage.personalwebsiteF.getAttribute("value"), details.get(key));
				break;
			case "Blog address":
				assertEquals(profilePage.blogaddressF.getAttribute("value"), details.get(key));;
				break;
			case "Postal address":
				assertEquals(profilePage.postaladdressF.getAttribute("value"), details.get(key));
				break;
			case "Town":
				assertEquals(profilePage.townF.getAttribute("value"), details.get(key));
				break;
			}
		}
	}
	
	
	@Then("^I click on General$")
	public void i_click_on_General() {
	    profilePage.General.click();
	}

	@Then("^General contents followings should be displayed:$")
	public void general_contents_followings_should_be_displayed(List<String> contents) {
		BrowserUtils.waitForVisibility(profilePage.occupation, 5);
		assertEquals(profilePage.occupation.getText(), contents.get(0));
		assertEquals(profilePage.industry.getText(), contents.get(1));
	}

	@Then("^I add required information:$")
	public void i_add_required_information(Map<String, String> input) {
		profilePage.occupationF.clear();
		profilePage.occupationF.sendKeys(input.get("Occupation"));
		profilePage.industryF.clear();
		profilePage.industryF.sendKeys(input.get("Industry"));
	}

	@Then("^following information should be displayed$")
	public void following_information_should_be_displayed(Map<String, String> input) {
	    assertEquals(profilePage.occupationF.getAttribute("value"), input.get("Occupation"));
	    assertEquals(profilePage.industryF.getAttribute("value"), input.get("Industry"));
	}

}
