package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class MaharaProfilePage {
	
	private WebDriver driver;
	
	public MaharaProfilePage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(tagName = "iframe")
	public WebElement iframe;
	
	@FindBy(id = "tinymce")
	public WebElement introductionField;
	
	@FindBy(id = "profileform_submit")
	public WebElement saveProfile;
	
	@FindBy(id = "messages")
	public WebElement messages;
	
	@FindBy(id = "profileform_firstname")
	public WebElement firstName;
	
	@FindBy(id = "profileform_lastname")
	public WebElement lastName;
	
	@FindBy(id = "profileform_studentid")
	public WebElement studentID;
	
	@FindBy(id = "profileform_preferredname")
	public WebElement displayName;
	
	@FindBy(linkText = "Contact information")
	public WebElement ContactInformation;
	
	@FindBy(xpath = "//div[@id='profileform_officialwebsite_container']/label")
	public WebElement officialwebsite;
	
	@FindBy(xpath = "//div[@id='profileform_personalwebsite_container']/label")
	public WebElement personalwebsite;
	
	@FindBy(xpath = "//div[@id='profileform_blogaddress_container']/label")
	public WebElement blogaddress;
	
	@FindBy(xpath = "//div[@id='profileform_address_container']/label")
	public WebElement postaladdress;
	
	@FindBy(xpath = "//div[@id='profileform_town_container']/label")
	public WebElement town;
	
	@FindBy(xpath = "//div[@id='profileform_city_container']/label")
	public WebElement city_region;
	
	@FindBy(xpath = "//div[@id='profileform_country_container']/label")
	public WebElement country;
	
	@FindBy(xpath = "//div[@id='profileform_homenumber_container']/label")
	public WebElement homenumber;
	
	@FindBy(xpath = "//div[@id='profileform_businessnumber_container']/label")
	public WebElement businessnumber;
	
	@FindBy(xpath = "//div[@id='profileform_mobilenumber_container']/label")
	public WebElement mobilenumber;
	
	@FindBy(xpath = "//div[@id='profileform_faxnumber_container']/label")
	public WebElement faxnumber;
	
	public void addIntroduction(String introduction) {
		driver.switchTo().frame(iframe);
		introductionField.clear();
		introductionField.sendKeys(introduction);
		driver.switchTo().parentFrame();
	}
}
