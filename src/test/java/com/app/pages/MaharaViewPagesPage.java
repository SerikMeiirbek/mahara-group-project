package com.app.pages;

import java.util.List;

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
	
	@FindBy(xpath= "//div[@id='row_1_column_2']//img")
	public List<WebElement> imageBlocks;
	
	@FindBy(tagName = "iframe")
	public WebElement iframe;
	
	@FindBy(id = "tinymce")
	public WebElement commentField;
	
	@FindBy(id = "add_feedback_heading")
	public WebElement addCommentText;
	
	@FindBy(id = "add_feedback_form_submit")
	public WebElement commentButton;
	
	@FindBy(id = "messages")
	public WebElement messages;
	
	@FindBy(className = "comment-content")
	public List<WebElement> commentContent;
	
	@FindBy(id = "add_feedback_form_attachments_files_0")
	public WebElement chooseFile;
	
	@FindBy(tagName = "em")
	public WebElement attachedMessage;
	
	@FindBy(xpath = "//a[@title='Edit this page']")
	public WebElement editPageButton;
	
	@FindBy(id = "row_1_column_1")
	public WebElement row_1_column_1;
	
	@FindBy(xpath = "//div[starts-with(@id, 'blockinstance_')]")
	public WebElement addedTab;
	
	@FindBy(xpath = "//div[@id='row_1_column_1']//div[@class='block']")
	public List<WebElement> messageOnTextTab;
	
	public void addComment(String comment) {
		driver.switchTo().frame(iframe);
		commentField.sendKeys(comment);
		driver.switchTo().parentFrame();
	}
	
	public void addImage() {
		String filePath = System.getProperty("user.dir")+"/src/test/resources/lights_beach.jpg";
		chooseFile.sendKeys(filePath);
	}
	
	public String currentComment() {
		return commentContent.get(commentContent.size()-1).getText();
	}
	
	public String getMessageOnTab() {
		return messageOnTextTab.get(messageOnTextTab.size()-1).getText();
	}
	
	public WebElement getImageWebElement() {
		return imageBlocks.get(imageBlocks.size()-1);
	}
}
