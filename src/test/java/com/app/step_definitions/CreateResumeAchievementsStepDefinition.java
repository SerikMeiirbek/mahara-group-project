package com.app.step_definitions;

import com.app.pages.MaharaAchievementsPage;
import com.app.utilities.BrowserUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateResumeAchievementsStepDefinition {

	MaharaAchievementsPage achievementsPage = new MaharaAchievementsPage();
	
	@When("^I click on Achievements$")
	public void i_click_on_Achievements() {
		achievementsPage.achievements.click();
	}

	@When("^I click add on Certifications, accreditations and awards$")
	public void i_click_add_on_Certifications_accreditations_and_awards() {
	    BrowserUtils.waitForVisibility(achievementsPage.addcertificationbutton, 2);
	    achievementsPage.addcertificationbutton.click();
	}

	@When("^I enter Date \"([^\"]*)\"$")
	public void i_enter_Date(String date) {
	    BrowserUtils.waitForVisibility(achievementsPage.addcertification_date, 2);
	    achievementsPage.addcertification_date.sendKeys(date);
	}

	@When("^I enter Title \"([^\"]*)\"$")
	public void i_enter_Title(String title) {
		achievementsPage.addcertification_title.sendKeys(title);
	}

	@When("^I enter Description \"([^\"]*)\"$")
	public void i_enter_Description(String description) {
		achievementsPage.adddescription.sendKeys(description);
	}

	@When("^I click save button$")
	public void i_click_save_button() {
		achievementsPage.addcertification_submit.click();
	}

	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String title) {
		
	}

	@Then("^I click add on Books and publications$")
	public void i_click_add_on_Books_and_publications() {
		BrowserUtils.waitForVisibility( achievementsPage.addbookbutton, 2);
	    achievementsPage.addbookbutton.click();
	}

	@Then("^I enter Date of publications \"([^\"]*)\"$")
	public void i_enter_Date_of_publications(String date) {
	   BrowserUtils.waitForVisibility(achievementsPage.bookDate, 2);
	   achievementsPage.bookDate.sendKeys(date);
	}

	@Then("^I enter Book title \"([^\"]*)\"$")
	public void i_enter_Book_title(String bookTitle) {
		BrowserUtils.waitForVisibility(achievementsPage.bookTitle, 2);
	    achievementsPage.bookTitle.sendKeys(bookTitle);
	}

	@Then("^I enter Contribution \"([^\"]*)\"$")
	public void i_enter_Contribution(String contribution) {
	    achievementsPage.bookContribution.sendKeys(contribution);
	}

	@Then("^I enter Details of your contribution \"([^\"]*)\"$")
	public void i_enter_Details_of_your_contribution(String description) {
	    achievementsPage.contributionDescription.sendKeys(description);
	}

	@When("^I click addBook save$")
	public void i_click_addBook_save() {
	    achievementsPage.saveBookButton.click();
	}

	@Then("^I should see book Title \"([^\"]*)\"$")
	public void i_should_see_book_Title(String arg1) {
	    ///////////////////////////////////////////////////
	}

	@Then("^click add on Professional memberships$")
	public void click_add_on_Professional_memberships() {
		BrowserUtils.waitForVisibility(achievementsPage.addmembershipbutton, 2);
		achievementsPage.addmembershipbutton.click();
	}

	@Then("^I enter start date \"([^\"]*)\"$")
	public void i_enter_start_date(String startDate) {
	    achievementsPage.addmembership_startdate.sendKeys(startDate);
	}

	@Then("^I enter End Date \"([^\"]*)\"$")
	public void i_enter_End_Date(String endDate) {
		achievementsPage.addmembership_enddate.sendKeys(endDate);
	}

	@Then("^I enter Title of memberships \"([^\"]*)\"$")
	public void i_enter_Title_of_memberships(String title) {
		achievementsPage.addmembership_title.sendKeys(title);
	}

	@Then("^I enter Membership description \"([^\"]*)\"$")
	public void i_enter_Membership_description(String description) {
	    achievementsPage.addmembership_description_ifr.sendKeys(description);
	}

	@When("^I click add membership button$")
	public void i_click_add_membership_button() {
		achievementsPage.addmembership_submit.click();
	}

	@Then("^I should see membership title \"([^\"]*)\"$")
	public void i_should_see_membership_title(String arg1) {
	    //////////////////////////////////////////
	}
}
