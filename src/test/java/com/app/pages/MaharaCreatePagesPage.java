package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class MaharaCreatePagesPage {

	private WebDriver driver;

	public MaharaCreatePagesPage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "settings_title")
	public WebElement titleField;

	@FindBy(id = "settings_submit")
	public WebElement save;
	
	@FindBy(id = "settings_ownerformat")
	public WebElement nameDisplayFormat;
	
	@FindBy(tagName = "iframe")
	public WebElement descriptionField;
	
}
