		package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;

public class EditPpPOM extends BaseTest {
	public EditPpPOM(WebDriver driver) {
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
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[1]/div[2]")
	private WebElement partnerlooking;
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[3]")
	private WebElement agefrom;
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[4]")
	private WebElement ageto;
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[5]/div[2]")
	private WebElement heightfrom;
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[6]/div[2]")
	private WebElement heightto;
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[7]/div[2]")
	private WebElement mothertongue;
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[8]/div[2]")
	private WebElement physcialstatus;
	
	@FindBy(xpath="//*[@id=\"wap-edit-profile\"]/div/div[2]/form/fieldset[9]/div[2]")
	private WebElement eatinghabit;
	
	
	@FindBy(xpath="//*[@id=\"wap-edit-profile\"]/div/div[2]/form/fieldset[10]/div[2]")
	private WebElement drinkinghabit;
	
	@FindBy(xpath="//*[@id=\"wap-edit-profile\"]/div/div[2]/form/fieldset[11]/div[2]")
	private WebElement smokinghabit;

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
	
	
	@FindBy(xpath="//*[@id='editpp-pwa']/div[4]/div[1]/div[2]")
	private WebElement religiousinformation;
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[1]/div[2]")
	private WebElement subcaste;
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[2]/div[2]")
	private WebElement dhosam;
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[3]/div[2]")
	private WebElement star;

	public WebElement getReligiousinformation() {
		return religiousinformation;
	}

	public WebElement getSubcaste() {
		return subcaste;
	}

	public WebElement getDhosam() {
		return dhosam;
	}

	public WebElement getStar() {
		return star;
	}
	
	
	@FindBy(xpath="//*[@id='edit-prof_footer']/div[2]")
	private WebElement save;

	public WebElement getSave() {
		return save;
	}
	
	

	@FindBy(xpath="//*[@id='editpp-pwa']/div[5]/div[1]/div[2]")
	private WebElement proffesionalinformation;
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[1]/div[2]")
	private WebElement education;
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[2]/div[2]")
	private WebElement occupation;
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[3]/div[2]")
	private WebElement annualincomefrom;
	
	public WebElement getProffesionalinformation() {
		return proffesionalinformation;
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
	@FindBy(xpath="//*[@id='PP_Annual_income_To_display']/div[2]")
	private WebElement annualincometo;
	
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div[3]/div[9]/div[1]/div[2]")
	private WebElement locationpreference;
	
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[1]/div[2]")
	private WebElement country;
	
	@FindBy(xpath="//*[@id='PP_Indian_state_display']/div[2]")
	private WebElement state;
	
	@FindBy(xpath="//*[@id='PP_City_Display']/div[2]")
	private WebElement city;
	
	public WebElement getLocationpreference() {
		return locationpreference;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getCitizenship() {
		return citizenship;
	}
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[5]/div[2]")
	private WebElement citizenship;
	
	
	
	
	
	
	
	

}
