package com.app.step_definitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.app.pages.MaharaDashboardPage;
import com.app.pages.MaharaPersonalInformationPage;
import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CreateResumeIntroductionStepDefinition {

	MaharaPersonalInformationPage informationPage = new MaharaPersonalInformationPage();
	MaharaDashboardPage dashboardPage = new MaharaDashboardPage();

	@When("^I click on Resume$")
	public void i_click_on_Resume() {

		dashboardPage.navigationBar.click(); // click navigation Bar

		BrowserUtils.waitForVisibility(dashboardPage.contentDropDown, 2);

		dashboardPage.contentDropDown.click();

		BrowserUtils.waitForVisibility(dashboardPage.Résumé, 2);

		dashboardPage.Résumé.click();

		BrowserUtils.waitForPageToLoad(2);

		
		assertTrue(Driver.getDriver().getTitle().equals("Résumé - Mahara"));
		
		
		
		
	}

	@When("^I enter Date of birth \"([^\"]*)\"$")
	public void i_enter_Date_of_birth(String dateOfBirth) {
		informationPage.dateOfBirth.clear();
		BrowserUtils.waitFor(1);
		informationPage.dateOfBirth.sendKeys(dateOfBirth);
	}

	@When("^I enter Place of birth \"([^\"]*)\"$")
	public void i_enter_Place_of_birth(String placeOfBirth) {
		informationPage.placeOfBirth.sendKeys(Keys.ENTER);
		
		BrowserUtils.waitFor(1);
		informationPage.placeOfBirth.clear();
		BrowserUtils.waitFor(1);
		informationPage.placeOfBirth.sendKeys(placeOfBirth);
	}

	@When("^I enter Citizenship \"([^\"]*)\"$")
	public void i_enter_Citizenship(String citizenship) {
		informationPage.citizenship.clear();
		BrowserUtils.waitFor(1);
		informationPage.citizenship.sendKeys(citizenship);
	}

	@When("^I enter Visa status \"([^\"]*)\"$")
	public void i_enter_Visa_status(String visaStatus) {
		informationPage.visaStatus.clear();
		BrowserUtils.waitFor(1);
		informationPage.visaStatus.sendKeys(visaStatus);
	}

	@When("^I select Gender \"([^\"]*)\"$")
	public void i_select_Gender(String gender) {
		//informationPage.selectedByDefault.click();
		informationPage.selectGender(gender);
	}

	@When("^I enter marital status \"([^\"]*)\"$")
	public void i_enter_marital_status(String maritalstatus) {
		informationPage.maritalstatus.clear();
		BrowserUtils.waitFor(1);
		informationPage.maritalstatus.sendKeys(maritalstatus);
	}

	@When("^click save$")
	public void click_save() {
		informationPage.save.click();
	}

	@Then("^I should see  todays date \"([^\"]*)\"$")
	public void i_should_see_todays_date(String dateOfBirth) {
		BrowserUtils.waitForVisibility(informationPage.dateOfBirth, 2);
		assertTrue(informationPage.dateOfBirth.getAttribute("value").contains(dateOfBirth));
//		System.out.println("=============");
//		System.out.println(informationPage.dateOfBirth.getAttribute("value"));
	}

	@Then("^I shoukd see Place of birth as \"([^\"]*)\"$")
	public void i_shoukd_see_Place_of_birth_as(String placeOfBirth) {
		assertTrue(informationPage.placeOfBirth.getAttribute("value").contains(placeOfBirth));
//		System.out.println("=============");
//		System.out.println(informationPage.placeOfBirth.getAttribute("value"));
	}

	@Then("^I should see Visa status as \"([^\"]*)\"$")
	public void i_should_see_Visa_status_as(String visaStatus) {
		assertTrue(informationPage.visaStatus.getAttribute("value").contains(visaStatus));
//		System.out.println("=============");
//		System.out.println(informationPage.visaStatus.getAttribute("value"));
	}

	@Then("^I should see Gender as \"([^\"]*)\"$")
	public void i_should_see_Gender_as(String gender) {
		//assertTrue(informationPage.isSelectGender(gender));
	}

	@Then("^I should see marital status \"([^\"]*)\"$")
	public void i_should_see_marital_status(String maritalstatus) {
		assertTrue(informationPage.maritalstatus.getAttribute("value").contains(maritalstatus));
	}
}
