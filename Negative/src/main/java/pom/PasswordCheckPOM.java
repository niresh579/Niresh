package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordCheckPOM {
	public PasswordCheckPOM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[8]")
	private WebElement setting;

	public WebElement getSetting() {
		return setting;
	}
    	
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list/ion-item[6]")
	private WebElement changepassword;

	public WebElement getChangepassword() {
		return changepassword;
	}
	
	@FindBy(xpath="/html/body/ion-app/ng-component/page-changepassword/ion-content/div[2]/div/form/ion-item[1]/div[1]/div/ion-input/div")
	private WebElement oldpassword;
	
	@FindBy(xpath="/html/body/ion-app/ng-component/page-changepassword/ion-content/div[2]/div/form/ion-item[1]/div[1]/div/ion-input/div")
	private WebElement newpassword;

	public WebElement getOldpassword() {
		return oldpassword;
	}

	public WebElement getNewpassword() {
		return newpassword;
	}
	
	
	
	@FindBy(xpath="/html/body/ion-app/ng-component/page-changepassword/ion-content/div[2]/div/form/ion-grid/ion-row[1]/ion-col/button/span")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	@FindBy(xpath="/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list/ion-item[7]")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}

	
	
	
	
	

}
