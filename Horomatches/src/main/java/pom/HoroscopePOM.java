package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class HoroscopePOM extends Base{
	public HoroscopePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);

}
	@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-grid/ion-row[2]/ion-col/ion-item/div[1]/div/ion-input/input")
	 private WebElement username;
	@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-grid/ion-row[3]/ion-col/ion-item/div[1]/div/ion-input/input")
    private WebElement password;
	@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-grid/ion-row[4]/ion-col/button")
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}