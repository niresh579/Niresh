package cms.cmstest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewedmyprofilePOM extends Base {
	public ViewedmyprofilePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}
	
	@FindBy(xpath="//*[@id='idEmail']")
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getShortlisted() {
		return shortlisted;
	}

	@FindBy(xpath="//*[@id='password1']")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='login-button']")
	private WebElement login;

	@FindBy(xpath="//*[@id='menusegment']/ion-segment-button[5]")
	private WebElement shortlisted;
	
	
	
	
	
	
	

}
