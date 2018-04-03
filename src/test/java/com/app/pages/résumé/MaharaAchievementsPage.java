package com.app.pages.résumé;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class MaharaAchievementsPage {
private WebDriver driver;

	public MaharaAchievementsPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='http://34.223.219.142:1022/mahara/artefact/resume/achievements.php']")
	public WebElement achievements;
	
	public WebElement addcertificationbutton;
	
	public WebElement addcertification_date;
	
	public WebElement addcertification_title;
	
	@FindBy(id="addcertification_description_ifr")
	public WebElement adddescription;
	
	public WebElement addcertification_submit;
	
	public WebElement addbookbutton;
	
	@FindBy(id="addbook_date")
	public WebElement bookDate;
	
	@FindBy(id="addbook_title")
	public WebElement bookTitle;
	
	@FindBy(id="addbook_contribution")
	public WebElement bookContribution;
	
	@FindBy(id="addbook_description_ifr")
	public WebElement contributionDescription;
	
	@FindBy(id="addbook_submit")
	public WebElement saveBookButton;
	
	public WebElement addmembershipbutton;
	
	public WebElement addmembership_startdate;
	
	public WebElement addmembership_enddate;
	
	public WebElement addmembership_title;
	
	public WebElement addmembership_description_ifr;
	
	public WebElement addmembership_submit;
	
	
	
	
}
