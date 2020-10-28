package cms.cmstest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyMailPOM extends Base {
	public VerifyMailPOM(WebDriver driver) {
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

	@FindBy(xpath="//*[@id='menusegment']/ion-segment-button[2]")
	private WebElement matches;
	
	public WebElement getMatches() {
		return matches;
	}

	
	@FindBy(xpath="/html/body/ion-app/ng-component/page-matches/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[2]")
	private WebElement mail;

	public WebElement getMail() {
		return mail;
	}
	
	@FindBy(xpath="/html/body/ion-app/ng-component/page-mailbox/ion-header/div[2]/ion-col/button[2]")
	private WebElement sent;

	public WebElement getSent() {
		return sent;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
