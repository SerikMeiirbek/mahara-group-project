package com.app.pages.résumé;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class MaharaEducationAndEmploymentPage {

	private WebDriver driver;

	public MaharaEducationAndEmploymentPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='http://34.223.219.142:1022/mahara/artefact/resume/employment.php']")
	public WebElement EducationAndEmployment;

	@FindBy(id = "addeducationhistorybutton")
	public WebElement addButton;

	@FindBy(id = "addeducationhistory_startdate")
	public WebElement startDate;

	@FindBy(id = "addeducationhistory_enddate")
	public WebElement endDate;

	@FindBy(id = "addeducationhistory_institution")
	public WebElement institution;

	@FindBy(id = "addeducationhistory_institutionaddress")
	public WebElement institutionAddress;

	@FindBy(id = "addeducationhistory_qualtype")
	public WebElement qualificationType;

	@FindBy(id = "addeducationhistory_qualname")
	public WebElement qualificationName;

	@FindBy(id = "mceu_122")
	public WebElement qualificationDescription;
	
	@FindBy(id = "addeducationhistory_submit")
	public WebElement save;

	@FindBy(id = "educationhistorylist")
	public WebElement educationList;
}
