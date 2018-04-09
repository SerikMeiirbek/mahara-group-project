package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.app.utilities.Driver;

public class MaharaCreatePagesPage {

	private WebDriver driver;
	public String formatName;

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
	public WebElement iframe;
	
	@FindBy(id = "tinymce")
	public WebElement descriptionField;
	
	@FindBy(xpath = "//h1/span[2]")
	public WebElement settingsText;
	
	public void clickOnPage(String page) {
		driver.findElement(By.linkText(page)).click();
	}
		
	public void addDescription(String description) {
		driver.switchTo().frame(iframe);
		descriptionField.sendKeys(description);
		driver.switchTo().parentFrame();
	}	
	
	public void selectNameFormat(String format) {
		String[] text;
		Select select = new Select(nameDisplayFormat);
		
		switch(format.toLowerCase()) {
		case "first name":
			select.selectByValue("1");
			text = select.getFirstSelectedOption().getText().trim().split("\\(");
			formatName = text[1].replace(")", "");
			break;
		case "last name":
			select.selectByValue("2");
			text = select.getFirstSelectedOption().getText().trim().split("\\(");
			formatName = text[1].replace(")", "");
			break;
		case "full name":
			select.selectByValue("3");
			text = select.getFirstSelectedOption().getText().trim().split("\\(");
			formatName = text[1].replace(")", "");
			break;
		default:
			select.selectByValue("6");
			text = select.getFirstSelectedOption().getText().trim().split("\\(");
			formatName = text[1].replace(")", "");
		}
	
		System.out.println("Name: " + formatName);
	}
}
