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
	
	@FindBy(xpath= "//div[contains(@id,'blockinstance_')]/h3")
	public WebElement imageBlock;
	
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
}
