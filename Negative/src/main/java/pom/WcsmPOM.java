package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WcsmPOM {
	public WcsmPOM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id=\"mainsidemenu\"]/div/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[4]")
	private WebElement editpi;

	public WebElement getEditpi() {
		return editpi;
	}
	
	public WebElement getBasicdetails() {
		return basicdetails;
	}


	@FindBy(xpath="//*[@id=\"linktobasic_details\"]/div[1]/div[2]")
	private WebElement basicdetails;
	
	@FindBy(xpath="//ion-label[contains(text(),'Settings')]")
	private WebElement setting;

	public WebElement getSetting() {
		return setting;
	}


}
