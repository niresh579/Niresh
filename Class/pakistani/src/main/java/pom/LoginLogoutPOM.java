package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLogoutPOM extends BaseTest{
	public LoginLogoutPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value='Matrimony ID / E-mail']")
	private WebElement username;
	
	@FindBy(xpath="//input[@value='Password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
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
	
	@FindBy(xpath="//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[7]")
	private WebElement setting;

	@FindBy(xpath="/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list/ion-item[7]")
	private WebElement logout;

	public WebElement getSetting() {
		return setting;
	}

	public WebElement getLogout() {
		return logout;
	}
    
	
	
	

}
