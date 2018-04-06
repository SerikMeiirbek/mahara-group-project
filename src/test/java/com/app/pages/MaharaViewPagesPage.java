package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class MaharaViewPagesPage {
	
	private WebDriver driver;

	public MaharaViewPagesPage() {
		driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "viewh1")
	public WebElement titleOnPage;

	@FindBy(xpath = "//div[@class='with-heading text-small']/a")
	public WebElement nameDisplay;
	
	@FindBy(xpath = "//img[@itemprop='contentURL']")
	public WebElement theImage;
	
	@FindBy(xpath= "//div[contains(@id,'blockinstance_')]/h3")
	public WebElement imageBlock;
}
