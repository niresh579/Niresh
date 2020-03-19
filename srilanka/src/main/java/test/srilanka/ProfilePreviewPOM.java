package test.srilanka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePreviewPOM {
	public ProfilePreviewPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='idEmail']")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='password1']")
	private WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement login;
	
	@FindBy(xpath="/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")
	private WebElement menu;
	
	@FindBy(xpath="//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[4]")
	private WebElement editpi;
	
	@FindBy(xpath="//*[@id=\"linktobasic_details\"]/div[1]/div[2]")
	private WebElement basicdetails;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getMenu() {
		return menu;
	}

	public WebElement getEditpi() {
		return editpi;
	}

	public WebElement getBasicdetails() {
		return basicdetails;
	}
	
	
	
	
	
	

}
