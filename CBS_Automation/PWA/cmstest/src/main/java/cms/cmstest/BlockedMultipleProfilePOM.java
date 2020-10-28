package cms.cmstest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlockedMultipleProfilePOM extends Base {
	public BlockedMultipleProfilePOM(WebDriver driver) {
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
	
	
	@FindBy(xpath="/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")
	private WebElement menu;

	@FindBy(xpath="//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[7]")
	private WebElement setting;
	
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list/ion-item[1]")
	private WebElement blocked;

	public WebElement getMenu() {
		return menu;
	}

	public WebElement getSetting() {
		return setting;
	}

	public WebElement getBlocked() {
		return blocked;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
