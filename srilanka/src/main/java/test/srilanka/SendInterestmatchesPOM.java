package test.srilanka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class SendInterestmatchesPOM extends BaseTest {
	public SendInterestmatchesPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='idEmail']")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='password1']")
	private WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement login;

	@FindBy(xpath="//*[@id='menusegment']/ion-segment-button[6]")
	private WebElement viewedmyprofile;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getViewedmyprofile() {
		return viewedmyprofile;
	}
	
	
	@FindBy(xpath="//*[@id='menusegment']/ion-segment-button[2]")
	private WebElement matches;

	public WebElement getMatches() {
		return matches;
	}

	
	

	@FindBy(xpath="//*[@id='menusegment']/ion-segment-button[3]")
	private WebElement lastmatches;

	public WebElement getLastmatches() {
		return lastmatches;
	}
	
	@FindBy(xpath="//*[@id='menusegment']/ion-segment-button[4]")
	private WebElement viewednotcontacted;

	public WebElement getViewednotcontacted() {
		return viewednotcontacted;
	}

	
	
	
	
	
}

