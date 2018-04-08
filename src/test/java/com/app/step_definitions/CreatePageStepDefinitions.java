package com.app.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.internal.EclipseInterface;

import com.app.pages.MaharaCreatePagesPage;
import com.app.pages.MaharaDashboardPage;
import com.app.pages.MaharaEditPagesPage;
import com.app.pages.MaharaPortfolioPage;
import com.app.pages.MaharaViewPagesPage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreatePageStepDefinitions {

	MaharaDashboardPage dashboardPage = new MaharaDashboardPage();
	MaharaPortfolioPage portfolioPage = new MaharaPortfolioPage();
	MaharaCreatePagesPage createPage = new MaharaCreatePagesPage();
	MaharaEditPagesPage editPage = new MaharaEditPagesPage();
	MaharaViewPagesPage viewPage = new MaharaViewPagesPage();

	@Then("^I click add new page$")
	public void i_click_add_new_page() {
		BrowserUtils.waitForVisibility(dashboardPage.navigationBar, 5);
		dashboardPage.navigationBar.click();
		assertTrue(dashboardPage.navigationList.isDisplayed());
		BrowserUtils.waitForVisibility(dashboardPage.portfolio, 5);
		dashboardPage.portfolio1.click();
		
		assertEquals(Driver.getDriver().getTitle(), "Pages and collections - Mahara");
		BrowserUtils.waitForVisibility(portfolioPage.addviewButton, 5);
		portfolioPage.addviewButton.click();
		BrowserUtils.waitForVisibility(portfolioPage.popup, 5);
		assertTrue(portfolioPage.popupPageButton.isDisplayed());
		portfolioPage.popupPageButton.click();
	}

	@Then("^I enter the page title as \"([^\"]*)\"$")
	public void i_enter_the_page_title_as(String title) {
		assertEquals(Driver.getDriver().getTitle(), "No title - Mahara");
		assertTrue(createPage.titleField.isDisplayed());
		createPage.titleField.clear();
		assertTrue(BrowserUtils.isFieldEmpty(createPage.titleField, 2));
		createPage.titleField.sendKeys(title);
	}

	@Then("^I enter the page description  as \"([^\"]*)\"$")
	public void i_enter_the_page_description_as(String description) {
		BrowserUtils.waitForVisibility(createPage.iframe, 2);
		createPage.addDescription(description);
	}

	@Then("^I save the page$")
	public void i_save_the_page() {
		BrowserUtils.waitForVisibility(createPage.save, 2);
		createPage.save.click();
		assertEquals(editPage.messages.getText(), "Page saved successfully");
	}

	@Then("^I click display page$")
	public void i_click_display_page() {
		editPage.displayPage.click();
	}

	@Then("^I should see page title as \"([^\"]*)\"$")
	public void i_should_see_page_title_as(String title) {
		assertEquals(Driver.getDriver().getTitle(), title);
		assertEquals(viewPage.titleOnPage.getText(), title.replace(" - Mahara", ""));
	}

	@Then("^the page description is \"([^\"]*)\"$")
	public void the_page_description_is(String description) {
		assertEquals(editPage.viewDescription.getText(), description);
	}

	@Then("^I choose \"([^\"]*)\" display format$")
	public void i_choose_display_format(String format) {
		createPage.selectNameFormat(format);
	}
	
	@Then("^I should see name display format as \"([^\"]*)\"$")
	public void i_should_see_name_display_format_as(String nameDisplay) {
		 assertEquals(viewPage.nameDisplay.getText(), nameDisplay);
	}
	
	@Then("^I add an image into the page$")
	public void i_add_an_image_into_the_page() {
		assertTrue(editPage.imageIcon.isDisplayed());
		editPage.addImage();
		BrowserUtils.waitForVisibility(editPage.theImage, 3);
	}

	@Then("^I should see the image on the page$")
	public void i_should_see_the_image_on_the_page() {
	    assertTrue(viewPage.theImage.isDisplayed());
	    assertEquals(viewPage.imageBlock.getText(), "Image");
	}
}
