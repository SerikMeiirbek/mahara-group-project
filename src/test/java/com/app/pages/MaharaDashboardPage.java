package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.app.utilities.Driver;

public class MaharaDashboardPage {

	public MaharaDashboardPage() {
		Driver.getDriver();
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//button[@title='Main menu']")
	public WebElement navigationBar;
	
	@FindBy(xpath="//li[@class='content']/button[@class='navbar-showchildren navbar-toggle dropdown-toggle collapsed']")
	public WebElement contentDropDown;
	
	@FindBy(linkText = "Profile")
	public WebElement profile;
	

	@FindBy(xpath="//li[@class='myportfolio']/button[@class='navbar-showchildren navbar-toggle dropdown-toggle collapsed']")
	public WebElement portfolio;

	@FindBy(linkText="Résumé")
	public WebElement resume;
	
	@FindBy(xpath="//a[.='Portfolio']")
	public WebElement portfolio1;
	
	@FindBy(id = "nav")
	public WebElement navigationList;


	
	@FindBy(xpath="//a[@href=\"http://34.223.219.142:1022/mahara/artefact/blog/index.php\"]")
	public WebElement journals;
}
