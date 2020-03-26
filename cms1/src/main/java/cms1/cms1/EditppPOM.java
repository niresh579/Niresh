package cms1.cms1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cms1.cms.Base;

public class EditppPOM extends Base{
	public EditppPOM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[5]")
	private WebElement editpp;
	
	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement editBasic;

	public WebElement getEditpp() {
		return editpp;
	}

	public WebElement getEditBasic() {
		return editBasic;
	}
	
	public WebElement getPartnerlooking() {
		return partnerlooking;
	}

	public WebElement getAgefrom() {
		return agefrom;
	}

	public WebElement getAgeto() {
		return ageto;
	}
	@FindBy(xpath="//*[@id=\"PP_Marital_Status\"]")
	private WebElement partnerlooking;
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[3]")
	private WebElement agefrom;
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[4]")
	private WebElement ageto;
	
	
	
	
	
}
