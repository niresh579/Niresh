package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgeValidationinSearchPOM {
	public AgeValidationinSearchPOM(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//*[@id='idEmail']")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='password1']")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='login-button']")
	private WebElement login;


	@FindBy(xpath="/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")
	private WebElement menu; 

	public WebElement getMenu() {
		return menu;
	}
	
	@FindBy(xpath="//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[5]")
	private WebElement editpp;
	
	

	public WebElement getEditpp() {	
		return editpp;	
	}



	public WebElement getUsername() {
		return username;
	}



	public WebElement getPassword() {
		return password;
	}



	public WebElement getLogin() {
		return login;
	}
	
	
	@FindBy(xpath="//*[@id='login-button']")
	private WebElement basicdetailspp;

	public WebElement getBasicdetailspp() {
		return basicdetailspp;
	}

	public WebElement getBackhistory() {
		return backhistory;
	}

	@FindBy(xpath="//*[@id='historyBack']")
	private WebElement backhistory;	
	
}
