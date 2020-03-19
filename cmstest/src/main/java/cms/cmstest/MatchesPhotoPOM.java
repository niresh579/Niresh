package cms.cmstest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MatchesPhotoPOM {
	public MatchesPhotoPOM(WebDriver driver) {
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

}
