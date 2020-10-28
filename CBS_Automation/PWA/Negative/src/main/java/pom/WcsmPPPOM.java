package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WcsmPPPOM {
	public WcsmPPPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='idEmail']")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='password1']")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='login-button']")
	private WebElement login;
	
	@FindBy(xpath="//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[5]")
	private WebElement editpp;
	
	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement basicdetails;
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[1]/div[2]")
	private WebElement maritalstatus;

	@FindBy(xpath="//*[@id='PP_have_child']/div[2]")
	private WebElement havechildren;

	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[3]/div[2]")
	private WebElement heightfrom;

	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[4]/div[2]")
	private WebElement heightto;
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[7]/div[2]")
	private WebElement mothertongue;
  
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[8]/div[2]")
	private WebElement physcialstatus;

	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[9]/div[2]")
	private WebElement eatinghabit;

	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[10]/div[2]")
	private WebElement drinkinghabit;

	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[11]/div[2]")
	private WebElement smokinghabit	;

	@FindBy(xpath="//*[@id='editpp-pwa']/div[5]/div[1]/div[2]")
	private WebElement professionalinformation;
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[1]/div[2]")
	private WebElement education;
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[2]/div[2]")
	private WebElement occupation;
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[3]/div[2]")
	private WebElement annualincomefrom;
	
	@FindBy(xpath="//*[@id='PP_Annual_income_To_display']/div[2]")
	private WebElement annualincometo;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEditpp() {
		return editpp;
	}

	public WebElement getBasicdetails() {
		return basicdetails;
	}

	public WebElement getMaritalstatus() {
		return maritalstatus;
	}

	public WebElement getHavechildren() {
		return havechildren;
	}

	public WebElement getHeightfrom() {
		return heightfrom;
	}

	public WebElement getHeightto() {
		return heightto;
	}

	public WebElement getMothertongue() {
		return mothertongue;
	}

	public WebElement getPhyscialstatus() {
		return physcialstatus;
	}

	public WebElement getEatinghabit() {
		return eatinghabit;
	}

	public WebElement getDrinkinghabit() {
		return drinkinghabit;
	}

	public WebElement getSmokinghabit() {
		return smokinghabit;
	}

	public WebElement getProfessionalinformation() {
		return professionalinformation;
	}

	public WebElement getEducation() {
		return education;
	}

	public WebElement getOccupation() {
		return occupation;
	}

	public WebElement getAnnualincomefrom() {
		return annualincomefrom;
	}

	public WebElement getAnnualincometo() {
		return annualincometo;
	}

	@FindBy(xpath="//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[7]")
	private WebElement setting;

	@FindBy(xpath="/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list/ion-item[6]")
	private WebElement whocanseeme;

	public WebElement getSetting() {
		return setting;
	}

	public WebElement getWhocanseeme() {
		return whocanseeme;
	}

	
	@FindBy(xpath="//div[@class='linknb more_link']")
	private WebElement morepreference;

	public WebElement getMorepreference() {
		return morepreference;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

}
