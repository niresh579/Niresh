package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;

public class StagePPwithMatchesPom extends BaseTest{
	public StagePPwithMatchesPom(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath="//*[@id='idEmail']")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='password1']")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='login-button']")
	private WebElement login;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(xpath="//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[5]")
	private WebElement editpp;
	
	@FindBy(xpath="//ion-segment-button[@class='segment-button menu-on']//following::span[contains(text(),'MATCHES')][1]")
	private WebElement matches;

	public WebElement getEditpp() {
		return editpp;
	}

	public WebElement getMatches() {
		return matches;
	}
	
	@FindBy(xpath="//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[5]")
	private WebElement marital;
	
}
