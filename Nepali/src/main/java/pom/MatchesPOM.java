package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MatchesPOM extends BaseTest{
	public MatchesPOM (WebDriver driver) {
		PageFactory.initElements(driver, this);

}
	
	@FindBy(xpath="//*[@id='idEmail']")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='password1']")
	private WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
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

	public WebElement getShortlist() {
		return shortlist;
	}

	@FindBy(xpath="/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row[1]/ion-grid/ion-row[2]/ion-col[1]/button/span")
	private WebElement shortlist;
	
	@FindBy(xpath="//*[@id='menusegment']/ion-segment-button[5]")
	private WebElement shortlistedmenu;

	public WebElement getShortlistedmenu() {
		return shortlistedmenu;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}