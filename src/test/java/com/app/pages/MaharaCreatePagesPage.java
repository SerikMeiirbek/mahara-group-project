package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	public WebElement iframe;
	
	@FindBy(id = "tinymce")
	public WebElement descriptionField;
	
	public String formatName;
	
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
			select.selectByValue("1");
			text = select.getFirstSelectedOption().getText().trim().split("\\(");
			formatName = text[1].replace(")", "");
			break;
		case "full name":
			select.selectByValue("3");
			select.selectByValue("1");
			text = select.getFirstSelectedOption().getText().trim().split("\\(");
			formatName = text[1].replace(")", "");
			break;
		default:
			select.selectByValue("6");
			select.selectByValue("1");
			text = select.getFirstSelectedOption().getText().trim().split("\\(");
			formatName = text[1].replace(")", "");
		}
	
		System.out.println("Name: " + formatName);
	}
}
