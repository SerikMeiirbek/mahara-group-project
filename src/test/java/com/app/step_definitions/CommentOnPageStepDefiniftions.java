package com.app.step_definitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.app.pages.MaharaCreatePagesPage;
import com.app.pages.MaharaDashboardPage;
import com.app.pages.MaharaEditPagesPage;
import com.app.pages.MaharaPortfolioPage;
import com.app.pages.MaharaViewPagesPage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CommentOnPageStepDefiniftions {

	MaharaDashboardPage dashboardPage = new MaharaDashboardPage();
	MaharaPortfolioPage portfolioPage = new MaharaPortfolioPage();
	MaharaCreatePagesPage createPage = new MaharaCreatePagesPage();
	MaharaEditPagesPage editPage = new MaharaEditPagesPage();
	MaharaViewPagesPage viewPage = new MaharaViewPagesPage();

	@Then("^I click on \"([^\"]*)\" page$")
	public void i_click_on_page(String page) {
		BrowserUtils.waitForVisibility(dashboardPage.navigationBar, 5);
		dashboardPage.navigationBar.click();
		assertTrue(dashboardPage.navigationList.isDisplayed());
		BrowserUtils.waitForVisibility(dashboardPage.portfolio, 5);
		dashboardPage.portfolio1.click();

		assertEquals(Driver.getDriver().getTitle(), "Pages and collections - Mahara");
		createPage.clickOnPage(page);
		assertEquals(Driver.getDriver().getTitle(), page + " - Mahara");
	}

	@Then("^I comment \"([^\"]*)\" into the add comment box$")
	public void i_comment_into_the_add_comment_box(String comment) {
		assertTrue(viewPage.addCommentText.isDisplayed());
		viewPage.addComment(comment);
	}

	@Then("^I click Comment$")
	public void i_click_Comment() {
		viewPage.commentButton.click();
	}

	@Then("^I should see comment \"([^\"]*)\"$")
	public void i_should_see_comment(String comment) {
		BrowserUtils.waitForVisibility(viewPage.messages, 3);
		assertEquals(viewPage.messages.getText(), "Comment submitted");
		assertEquals(viewPage.currentComment(), comment);
	}

	@And("^I attach file$")
	public void i_attach_file() {
		viewPage.addImage();
	}

	@And("^I should see the file attached$")
	public void i_should_see_the_file_attached() {
		assertTrue(viewPage.attachedMessage.isDisplayed());
	}

}
