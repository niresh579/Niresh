package cms.cmstest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequestMatchesPOM extends Base{
	public RequestMatchesPOM(WebDriver driver) {

}

	@FindBy(xpath="//*[@id='idEmail']")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='password1']")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='login-button']")
	private WebElement login;
	
	

	@FindBy(xpath="//*[@id='menusegment']/ion-segment-button[2]")
	private WebElement matches;



	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getMatches() {
		return matches;
	}
	


	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}