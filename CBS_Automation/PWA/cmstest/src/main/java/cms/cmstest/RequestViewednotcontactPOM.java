package cms.cmstest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestViewednotcontactPOM {
	public RequestViewednotcontactPOM(WebDriver driver) {
	PageFactory.initElements(driver, this);	
		
	}
	@FindBy(xpath="//*[@id='idEmail']")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='password1']")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='login-button']")
	private WebElement login;
	
	
	@FindBy(xpath="//*[@id='menusegment']/ion-segment-button[4]")
	private WebElement viewednotcontact;


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin() {
		return login;
	}


	public WebElement getViewednotcontact() {
		return viewednotcontact;
	}
	

}
