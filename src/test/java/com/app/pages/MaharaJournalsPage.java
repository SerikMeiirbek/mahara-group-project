package com.app.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class MaharaJournalsPage {
	
	private WebDriver driver;

	public MaharaJournalsPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "New entry")
	public WebElement newEntry;
	
	@FindBy(id = "editpost_title")
	public WebElement titleField;
	
	@FindBy(tagName = "iframe")
	public WebElement iframe;
	
	@FindBy(id = "tinymce")
	public WebElement entryField;
	
	@FindBy(id = "editpost_submitpost")
	public WebElement saveEntry;
	
	@FindBy(xpath = "//div[@id='messages']/div/div")
	public WebElement messages;
	
	@FindBy(tagName = "h2")
	public List<WebElement> postTitle;
	
	@FindBy(xpath = "//div[starts-with(@id,'posttitle_')]//p[2]")
	public List<WebElement> postDescription;
	
	public void addEntry(String text) {
		driver.switchTo().frame(iframe);
		entryField.sendKeys(text);
		driver.switchTo().parentFrame();
	}	
	
	public String getPostTitle() {
		return postTitle.get(0).getText();
	}
	
	public String getPostDescription() {
		return postDescription.get(0).getText();
	}
	
		
	public WebElement editpost_title;
	
	public WebElement editpost_submitpost;
	


}
