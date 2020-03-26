package cucu.occupation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OccupationPOM extends Base {
	public OccupationPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//login
		@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-grid/ion-row[2]/ion-col/ion-item/div[1]/div/ion-input/input")
		 private WebElement username;
		@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-grid/ion-row[3]/ion-col/ion-item/div[1]/div/ion-input/input")
	    private WebElement password;
		@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-grid/ion-row[4]/ion-col")
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
		
		//menu
		@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-matches/ion-footer/div/header/div/ion-navbar/div[2]/ion-row/ion-col[5]")
		private WebElement menu;
		public WebElement getMenu() {
			return menu;
		}
		
		@FindBy(xpath="//*[@id='rightmenu']/ion-row[16]/ion-col")
		private WebElement editprofile;
		public WebElement getEditprofile() {
			return editprofile;
		}
		
		@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-editprofile/ion-content/div[2]/ion-grid[11]/ion-row[1]/ion-col[2]")
		private WebElement pi;
		public WebElement getPi() {
			return pi;
		}
		

		@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-editprofile/ion-content/div[2]/ion-grid[11]/ion-row[1]/ion-col[2]")
		private WebElement occup;
		public WebElement getOccup() {
			return occup;
		}
		
		@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-edittemplate/ion-content/div[2]/ion-grid/ion-row[9]")
		private WebElement currentoccup;
		public WebElement getCurrentoccup() {
			return currentoccup;
		}
		
		public WebElement getSelectoccup() {
			return selectoccup;
		}

		@FindBy(xpath="//*[@id='commonmenu']/div/menucontent/ion-content/div[2]")
		private WebElement selectoccup;
		
		
		
		
		
		
		@FindBy(xpath="//*[@id=\"commonmenu\"]/div/menucontent/ion-header/ion-searchbar/div/input")
		private WebElement occupation1;
		public WebElement getOccupation1() {
			return occupation1;
		}

		
		

}
