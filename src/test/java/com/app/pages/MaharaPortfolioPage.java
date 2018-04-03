package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class MaharaPortfolioPage {
	
	private WebDriver driver;
	
	public MaharaPortfolioPage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "addview-button")
	public WebElement addviewButton;
	
	@FindBy(className = "modal-content")
	public WebElement popup;
	
	@FindBy(className = "modal-title")
	public WebElement popupTitle;
	
	@FindBy(id = "add-view-button")
	public WebElement popupPageButton;

}
