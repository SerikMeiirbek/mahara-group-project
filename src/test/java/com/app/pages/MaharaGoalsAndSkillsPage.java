package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

public class MaharaGoalsAndSkillsPage {
	private WebDriver driver;

	public MaharaGoalsAndSkillsPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href=\"http://34.223.219.142:1022/mahara/artefact/resume/goalsandskills.php\"]")
	public WebElement GoalsAndSkills;

	@FindBy(id = "editgoalsandskills_description_ifr")
	public WebElement personalGoalsDescription;

	public WebElement goals_edit_personalgoal;

	public WebElement goals_edit_academicgoal;

	public WebElement goals_edit_careergoal;

	public WebElement skills_edit_personalskill;

	public WebElement skills_edit_academicskill;

	public WebElement skills_edit_workskill;

	public WebElement editgoalsandskills_submitform;
	
	public WebElement messages;

	public void sendTextToDescriptionGoalsAndSkills(String string) {
		
		Driver.getDriver().switchTo().frame("editgoalsandskills_description_ifr");

		Driver.getDriver().findElement(By.id("tinymce")).clear();;
		
		Driver.getDriver().findElement(By.id("tinymce")).sendKeys(string);

		Driver.getDriver().switchTo().defaultContent();
	}
		
	public void saveButton() {
		BrowserUtils.waitForVisibility(editgoalsandskills_submitform,2);
		Actions actions = new Actions(Driver.getDriver());
		actions.moveToElement(editgoalsandskills_submitform).click().perform();
		
	}
}
