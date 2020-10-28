package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;

public class DailyMatchesPOM extends BaseTest{
	public DailyMatchesPOM(WebDriver driver) {
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
	
	
	@FindBy(xpath="/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[3]/a")
	private WebElement dailymatches;

	public WebElement getDailymatches() {
		return dailymatches;
	}
	
	
	@FindBy(xpath="(//span[contains(text(),'YES')])[1]")
	private WebElement yes;
	

	@FindBy(xpath="(//span[contains(text(),'SKIP')])[2]")
	private WebElement skip;

	public WebElement getYes() {
		return yes;
	}

	public WebElement getSkip() {
		return skip;
	}
	
	
	
	

}
