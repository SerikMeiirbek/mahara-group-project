package com.app.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.app.pages.MaharaViewPagesPage;
import com.app.utilities.Driver;

import cucumber.api.java.en.Then;

public class ViewPagesPageStepDefinitions {
	
	MaharaViewPagesPage viewPage = new MaharaViewPagesPage();
	
	@Then("^I should see text as \"([^\"]*)\" on the page$")
	public void i_should_see_text_as_on_the_page(String text) {
	    assertTrue(viewPage.addedTab.isDisplayed());
	    assertEquals(viewPage.getMessageOnTab(), text);
	}
	
	@Then("^I should see the image on the page$")
	public void i_should_see_the_image_on_the_page() {
	    assertTrue(viewPage.theImage.isDisplayed());
	    assertTrue(viewPage.getImageWebElement().isDisplayed());
	}
	
	@Then("^I should see name display format as \"([^\"]*)\"$")
	public void i_should_see_name_display_format_as(String nameDisplay) {
		 assertEquals(viewPage.nameDisplay.getText(), nameDisplay);
	}
	
	@Then("^I should see page title as \"([^\"]*)\"$")
	public void i_should_see_page_title_as(String title) {
		assertEquals(Driver.getDriver().getTitle(), title);
		assertEquals(viewPage.titleOnPage.getText(), title.replace(" - Mahara", ""));
	}
}
