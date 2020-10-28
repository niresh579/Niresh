package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;

public class StagingEditPiPOM extends BaseTest{
	public StagingEditPiPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id=\"loginpage\"]/div[1]/div[2]/div/form/div[1]")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='matripassword1']")
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
	
	@FindBy(xpath="//*[@id=\\\"wap-edit-profile\\\"]/div/div[2]/form/fieldset[1]/div[2]")
	private WebElement profilecreatedby;
	
	@FindBy(xpath="//*[@id='RegPanelSearchvalue']")
	private WebElement searchbar;

	public WebElement getProfilecreatedby() {
		return profilecreatedby;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}

	@FindBy(xpath="//*[@id=\"wap-edit-profile\"]/div/div[2]/form/fieldset[4]/div[2]")
	private WebElement height;
	
	@FindBy(xpath="//*[@id=\"wap-edit-profile\"]/div/div[2]/form/fieldset[5]/div[2]")
	private WebElement weight;

	public WebElement getHeight() {
		return height;
	}

	public WebElement getWeight() {
		return weight;
	}
	
	@FindBy(xpath="//*[@id=\"wap-edit-profile\"]/div/div[2]/form/fieldset[6]/div[2]")
	private WebElement maritalstatus;
	
	@FindBy(xpath="//*[@id=\"wap-edit-profile\"]/div/div[2]/form/fieldset[9]/div[2]")
	private WebElement mothertongue;
	
	@FindBy(xpath="//*[@id=\"wap-edit-profile\"]/div/div[2]/form/fieldset[10]/div[2]")
	private WebElement bodytype;
	
	@FindBy(xpath="//*[@id=\"wap-edit-profile\"]/div/div[2]/form/fieldset[11]/div[2]")
	private WebElement complexion;
	
	@FindBy(xpath="//*[@id=\"wap-edit-profile\"]/div/div[2]/form/fieldset[12]/div[2]")
	private WebElement physcialstatus;
	
	@FindBy(xpath="//*[@id=\"wap-edit-profile\"]/div/div[2]/form/fieldset[13]/div[2]")
	private WebElement languageknown;

	

	public WebElement getMothertongue() {
		return mothertongue;
	}

	public WebElement getBodytype() {
		return bodytype;
	}

	public WebElement getMaritalstatus() {
		return maritalstatus;
	}

	public WebElement getComplexion() {
		return complexion;
	}

	public WebElement getPhyscialstatus() {
		return physcialstatus;
	}

	public WebElement getLanguageknown() {
		return languageknown;
	}
	
	

}
