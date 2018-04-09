package com.app.step_definitions;

import static org.testng.Assert.assertEquals;

import com.app.pages.MaharaJournalsPage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

import cucumber.api.java.en.Then;

public class CreateJournalsPageStepDefinitions {
	
	MaharaJournalsPage journalPage = new MaharaJournalsPage();
	
	@Then("^I click on New entry button$")
	public void i_click_on_New_entry_button() {
		assertEquals(Driver.getDriver().getTitle(), "View journal - Mahara");
	    journalPage.newEntry.click();
	}
	
	@Then("^I enter \"([^\"]*)\" into Title field$")
	public void i_enter_into_Title_field(String title) {
	    assertEquals(Driver.getDriver().getTitle(), "New journal entry in journal \"Sopist Sa's Journal\" - Mahara");
	    journalPage.titleField.sendKeys(title);
	}

	@Then("^I enter \"([^\"]*)\" into Entry field$")
	public void i_enter_into_Entry_field(String entry) {
	    journalPage.addEntry(entry);	   
	}
	
	@Then("^I click save entry button$")
	public void i_click_save_entry_button() {
	    BrowserUtils.waitForClickablility(journalPage.saveEntry, 5);
	    journalPage.saveEntry.click();	    
	}
	
	@Then("^I should see journal as \"([^\"]*)\" and entry as \"([^\"]*)\" are displayed$")
	public void i_should_see_journal_as_and_entry_as_are_displayed(String title, String entry) {
		assertEquals(journalPage.messages.getText(), "Journal entry saved");
		assertEquals(journalPage.getPostTitle(), title);
		assertEquals(journalPage.getPostDescription(), entry);
	    
	}
}
