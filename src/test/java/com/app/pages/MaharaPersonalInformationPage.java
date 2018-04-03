package com.app.pages©sum√©;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class MaharaPersonalInformationPage {
	private WebDriver driver;

	
	public MaharaPersonalInformationPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "personalinformation_dateofbirth")
	public WebElement dateOfBirth;
	
	@FindBy(id = "personalinformation_placeofbirth")
	public WebElement placeOfBirth;

	@FindBy(id = "personalinformation_citizenship")
	public WebElement citizenship;

	@FindBy(id = "personalinformation_visastatus")
	public WebElement visaStatus;

	@FindBy(xpath = "//input[@value='female']")
	public WebElement Woman;

	@FindBy(xpath = "//input[@value='male']")
	public WebElement Man;

	@FindBy(xpath = "(//input[@name='gender'])[1]")
	public WebElement selectedByDefault;

	@FindBy(id = "personalinformation_maritalstatus")
	public WebElement maritalstatus;

	@FindBy(id = "personalinformation_save")
	public WebElement save;

	
	public void selectGender(String gender) {
		switch (gender) {
		case "Woman":
			try {
				Woman.click();
			} catch (NoSuchElementException e) {
				System.out.println("Checkbox Woman isn't  selected");
			}

		case "Man":
			try {
				Man.click();
			} catch (NoSuchElementException e) {
				System.out.println("CheckBox Man isn't  selected");
			}

		default:
			

		}
	}

	public boolean isSelectGender(String gender) {
		switch (gender) {
		case "Woman":
			try {
				return Woman.isSelected();
			} catch (NoSuchElementException e) {
				System.out.println("Checkbox Woman isn't  selected");
			}

		case "Man":
			try {
				return Man.isSelected();
			} catch (NoSuchElementException e) {
				System.out.println("CheckBox Man isn't been selected");
			}

		default:
			return false;

		}
	}

}
