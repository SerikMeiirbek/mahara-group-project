package com.app.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.app.pages.MaharaDashboardPage;
import com.app.pages.MaharaProfilePage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

import cucumber.api.java.en.Then;

public class ProfilePageStepDefinitions {
	
	MaharaDashboardPage dashboardPage = new MaharaDashboardPage();
	MaharaProfilePage profilePage = new MaharaProfilePage();
	
	@Then("^I click \"([^\"]*)\" on the Content list$")
	public void i_click_on_the_Content_list(String arg1) {
		dashboardPage.navigationBar.click();
		BrowserUtils.waitForVisibility(dashboardPage.navigationList, 2);
		dashboardPage.contentDropDown.click();
		dashboardPage.profile.click();
		assertEquals(Driver.getDriver().getTitle(), "Profile - Mahara");
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

}
