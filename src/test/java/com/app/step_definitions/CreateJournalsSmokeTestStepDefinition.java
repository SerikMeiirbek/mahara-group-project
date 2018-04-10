package com.app.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.app.pages.MaharaDashboardPage;
import com.app.pages.MaharaGoalsAndSkillsPage;
import com.app.pages.MaharaJournalsPage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

import cucumber.api.java.en.Then;

public class CreateJournalsSmokeTestStepDefinition {

	MaharaDashboardPage dashboardPage = new MaharaDashboardPage();

	MaharaJournalsPage journalsPage = new MaharaJournalsPage();

	MaharaGoalsAndSkillsPage goalsAndSkillsPage = new MaharaGoalsAndSkillsPage();

	@Then("^I click Journals on the Content list$")
	public void i_click_Journals_on_the_Content_list() {
		dashboardPage.navigationBar.click(); // clicking navigation Bar
		BrowserUtils.waitForVisibility(dashboardPage.contentDropDown, 2);
		dashboardPage.contentDropDown.click();
		BrowserUtils.waitForVisibility(dashboardPage.journals, 2);
		dashboardPage.journals.click(); // clicking Journals
		BrowserUtils.waitForPageToLoad(2);
		assertTrue(Driver.getDriver().getTitle().equals("View journal - Mahara"));
	}

	@Then("^I enter \"([^\"]*)\" into Title field$")
	public void i_enter_into_Title_field(String string) {
		BrowserUtils.waitForVisibility(journalsPage.editpost_title, 2); // entering Title field
		journalsPage.editpost_title.sendKeys(string);
	}

	@Then("^I enter \"([^\"]*)\" into Entry field$")
	public void i_enter_into_Entry_field(String string) {
		Driver.getDriver().switchTo().frame("editpost_description_ifr"); // entering Description form
		Driver.getDriver().findElement(By.id("tinymce")).clear();
		Driver.getDriver().findElement(By.id("tinymce")).sendKeys(string);
		Driver.getDriver().switchTo().defaultContent();
	}

	@Then("^I click on New entry button$")
	public void i_click_on_New_entry_button() {
		assertEquals(Driver.getDriver().getTitle(), "View journal - Mahara");
		journalsPage.newEntry.click();
	}

	@Then("^I click save entry button$")
	public void i_click_save_entry_button() {
		BrowserUtils.waitForVisibility(journalsPage.editpost_submitpost, 2); // Clicking save
		Actions actions = new Actions(Driver.getDriver());
		actions.moveToElement(journalsPage.editpost_submitpost).click().perform();
	}

	@Then("^I should see journal as \"([^\"]*)\" and entry as \"([^\"]*)\" are displayed$")
	public void i_should_see_journal_as_and_entry_as_are_displayed(String string1, String string2) { // Verifying
		assertEquals(journalsPage.messages.getText(), "Journal entry saved");
		assertEquals(journalsPage.getPostTitle(), string1);
		assertEquals(journalsPage.getPostDescription(), string2);
	}
}
