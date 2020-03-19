package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;

public class StagingPiShowExtendedMatchesPOM extends BaseTest {
	public StagingPiShowExtendedMatchesPOM(WebDriver driver) {
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
	
	@FindBy(xpath="//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[4]")
	private WebElement editpi;

	public WebElement getEditpi() {
		return editpi;
	}
	
	
	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement ppbasicdetails;

	
	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement agefrom;
	
	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement ageto;
	
	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement heightfrom;
	
	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement heightto;

	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement maritalstatus;
	
	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement physcialstatus;
	
	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement mothertongue;
	
	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement religion;

	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement caste;

	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement subcaste;

	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement gothram;

	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement dosham;

	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement education;
	
	
	public WebElement getPpbasicdetails() {
		return ppbasicdetails;
	}

	public WebElement getAgefrom() {
		return agefrom;
	}

	public WebElement getAgeto() {
		return ageto;
	}

	public WebElement getHeightfrom() {
		return heightfrom;
	}

	public WebElement getHeightto() {
		return heightto;
	}

	public WebElement getMaritalstatus() {
		return maritalstatus;
	}

	public WebElement getPhyscialstatus() {
		return physcialstatus;
	}

	public WebElement getMothertongue() {
		return mothertongue;
	}

	public WebElement getReligion() {
		return religion;
	}

	public WebElement getCaste() {
		return caste;
	}

	public WebElement getSubcaste() {
		return subcaste;
	}

	public WebElement getGothram() {
		return gothram;
	}

	public WebElement getDosham() {
		return dosham;
	}

	public WebElement getEducation() {
		return education;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement country;

	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement state;

	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement extendedmatches;

	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement drinkinghabit;

	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement smokinghabit;

	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement eatinghabit;

	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement star;

	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement occupation;

	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement annualincomefrom;

	public WebElement getExtendedmatches() {
		return extendedmatches;
	}

	public WebElement getDrinkinghabit() {
		return drinkinghabit;
	}

	public WebElement getSmokinghabit() {
		return smokinghabit;
	}

	public WebElement getEatinghabit() {
		return eatinghabit;
	}

	public WebElement getStar() {
		return star;
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

	public WebElement getCity() {
		return city;
	}

	public WebElement getCitizenship() {
		return citizenship;
	}

	public WebElement getDone() {
		return done;
	}

	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement annualincometo;

	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement city;
	
	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement citizenship;
	
	@FindBy(xpath="//*[@id='editpp-pwa']/div[3]/div[1]/div[2]")
	private WebElement done;
	
}

