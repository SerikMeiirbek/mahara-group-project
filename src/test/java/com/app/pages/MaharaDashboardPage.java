package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class MaharaDashboardPage {
	private WebDriver driver;

	
	
	
	
	public MaharaDashboardPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='main-nav-toggle navbar-toggle collapsed']")
	public WebElement navigationBar;
	
	@FindBy(xpath="//li[@class='content']/button[@class='navbar-showchildren navbar-toggle dropdown-toggle collapsed']")
	public WebElement contentDropDown;
	
	@FindBy(linkText="Résumé")
	public WebElement Résumé;
	
	
}
