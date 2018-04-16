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

}
