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
	
	public void addIntroduction(String introduction) {
		driver.switchTo().frame(iframe);
		introductionField.clear();
		introductionField.sendKeys(introduction);
		driver.switchTo().parentFrame();
	}
}
