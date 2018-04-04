package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class MaharaEditPagesPage {
	
	private WebDriver driver;

	public MaharaEditPagesPage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "messages")
	public WebElement messages;
	
	@FindBy(xpath = "//div[@selected='content']//a[contains(text(),'Display page')]")
	public WebElement displayPage;
	
	@FindBy(id = "view-description")
	public WebElement viewDescription;
	
}
