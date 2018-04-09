package com.app.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.app.pages.MaharaEditPagesPage;
import com.app.pages.MaharaViewPagesPage;
import com.app.utilities.Driver;

import cucumber.api.java.en.Then;

public class EditPagesPageStepDefinitions {
	
	MaharaViewPagesPage viewPage = new MaharaViewPagesPage();
	MaharaEditPagesPage editPage = new MaharaEditPagesPage();
	
	@Then("^I click edit the page$")
	public void i_click_edit_the_page() {
		viewPage.editPageButton.click();
		assertEquals(editPage.editText.getText(), "| Edit");
	}

	@Then("^I add more text as \"([^\"]*)\" into the page$")
	public void i_add_more_text_as_into_the_page(String text) {
	    editPage.addTextTab(text);
	}



}
