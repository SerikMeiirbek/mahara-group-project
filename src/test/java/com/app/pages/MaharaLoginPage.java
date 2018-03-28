package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class MaharaLoginPage {
	
private WebDriver driver;
	
	public MaharaLoginPage() {
		this.driver=Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "login_login_username")
	public WebElement userName;
	
	@FindBy(id = "login_login_password")
	public WebElement password;
	
	@FindBy(id = "login_submit")
	public WebElement loginButton;
	
	public void signIn(String userName, String password) {
		this.userName.sendKeys(userName);
		this.password.sendKeys(password);
		loginButton.click();
	}

}
