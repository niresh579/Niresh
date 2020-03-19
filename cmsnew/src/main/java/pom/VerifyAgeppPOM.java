package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;

public class VerifyAgeppPOM extends BaseTest {
	public VerifyAgeppPOM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id='historyBack']")
	private WebElement backhistory;	
	
	@FindBy(xpath="(//span[contains(text(),'MATCHES')])[1]")
	private WebElement matches;

	

	public WebElement getBackhistory() {
		return backhistory;
	}

	public WebElement getMatches() {
		return matches;
	}
	
	
	@FindBy(xpath="//*[@id='editpp-pwa']/div[1]/div/div[2]")
	private WebElement strictfilter;

	public WebElement getStrictfilter() {
		return strictfilter;
	}	
	
	public WebElement getAgestrictfilter() {
		return agestrictfilter;
	}

	public WebElement getHeightstrictfilter() {
		return heightstrictfilter;
	}

	public WebElement getStatusstrictfilter() {
		return statusstrictfilter;
	}


	@FindBy(xpath="(//span[@class='ui-btn-inner'])[2]")
	private WebElement agestrictfilter;

	@FindBy(xpath="(//span[@class='ui-btn-inner'])[3]")
	private WebElement heightstrictfilter;

	@FindBy(xpath="(//span[@class='ui-btn-inner'])[4]")
	private WebElement statusstrictfilter;

	
	
	
	
	
	
	
}
