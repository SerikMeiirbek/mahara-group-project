package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.app.utilities.BrowserUtils;
import com.app.utilities.Driver;

public class MaharaEditPagesPage {
	
	private WebDriver driver;
	private String filePath = "mahara-group-project/src/test/resources/lights_beach.jpg";

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
	
	@FindBy(xpath = "//a[@title='A single image from your files area']")
	public WebElement imageIcon;
	
	@FindBy(id = "row_1_column_2")
	public WebElement row_1_column_2;
	
	@FindBy(xpath = "//div[@class='modal-dialog modal-lg']")
	public WebElement imagePopup;
	
	@FindBy(xpath = "//div[@class='modal-dialog modal-lg']//h4[@class='modal-title blockinstance-header text-inline']")
	public WebElement imagePopupTitle;
	
	@FindBy(linkText = "Image")
	public WebElement imageTab;
	
	@FindBy(name = "userfile[]")
	public WebElement chooseFiles;
	
	@FindBy(xpath = "//button[starts-with(@id,'instconf_action_configureblockinstance_id_')]")
	public WebElement imagePopupSave;
	
	@FindBy(xpath = "//h4/a/span/span")
	public WebElement imageTabTitle;
	
	@FindBy(xpath = "//a/img[starts-with(@alt,'lights_beach.jpg')]")
	public WebElement theImage;
	
	public void addImage() {
		Actions action = new Actions(driver);
		action.dragAndDrop(imageIcon, row_1_column_2).perform();
		BrowserUtils.waitForVisibility(imagePopup, 5);
		imageTab.click();
		BrowserUtils.waitForVisibility(chooseFiles, 2);
		chooseFiles.sendKeys(filePath);

		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 3);
		wait.until(ExpectedConditions.textToBePresentInElement(imageTabTitle, "lights_beach.jpg"));
		
		BrowserUtils.waitFor(1);
		imagePopupSave.click();
	}
}
