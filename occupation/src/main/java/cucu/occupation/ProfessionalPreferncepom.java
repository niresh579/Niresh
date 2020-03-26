package cucu.occupation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfessionalPreferncepom extends Base {
	public ProfessionalPreferncepom (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//login
			@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-grid/ion-row[2]/ion-col/ion-item/div[1]/div/ion-input/input")
			 private WebElement username;
			@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-grid/ion-row[3]/ion-col/ion-item/div[1]/div/ion-input/input")
		    private WebElement password;
			@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-grid/ion-row[4]/ion-col/button")
		    private WebElement login;
			public WebElement getLogin() {
				return login;
			}
			public WebElement getUsername() {
				return username;
			}
			public WebElement getPassword() {
				return password;
			}
			
			
			//menu
			@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-matches/ion-footer/div/header/div/ion-navbar/div[2]/ion-row/ion-col[5]/span")
			private WebElement menu;
			public WebElement getMenu() {
				return menu;
			}
			
			

			//edit pp
			@FindBy(xpath="//*[@id='rightmenu']/ion-row[17]/ion-col")
			private WebElement editpp;
			public WebElement getEditpp() {
				return editpp;
			}
			
			
			//subpp
			@FindBy(xpath="//*[@id='editform11']/ion-row[1]/ion-col[2]")
			private WebElement subpp;
			public WebElement getSubpp() {
				return subpp;
			}
			
            //click occupation
			@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-editpartnerpreference/ion-content/div[2]/ion-grid/ion-row[5]")
			private WebElement clickoccupation;
			public WebElement getClickoccupation() {
				return clickoccupation;
			}
			
}
