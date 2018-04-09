package com.app.pages;

import java.util.List;

import org.apache.velocity.tools.view.tools.BrowserSnifferTool;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.app.utilities.BrowserUtils;
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
	
	@FindBy(xpath="//ul[@id='childmenu-1']/li/a")
	public List<WebElement> contentList;


	public void clickOnContectList(String menu) {
		menu = menu.toLowerCase();
		contentDropDown.click();
		BrowserUtils.waitForVisibility(contentList.get(3), 3);
		
		LOOP:
		for(int i = 0; i < contentList.size(); i++) {
			WebElement element = contentList.get(i);
			String content = element.getText().toLowerCase();
			
			System.out.println(contentList.size());
			System.out.println(content);
			
			if (content.equals(menu)) {
				switch(menu) {
				case "journals":
					element.click();
					break LOOP;
				case "profile":
					element.click();
					break LOOP;
				}
				
			}
		}
		
		
		
	}
	
}
