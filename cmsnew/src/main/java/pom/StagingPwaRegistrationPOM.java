package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;

public class StagingPwaRegistrationPOM extends BaseTest{
	public StagingPwaRegistrationPOM(WebDriver driver) {
    PageFactory.initElements(driver, this);		
		
	}
	
	@FindBy(xpath="//*[@id='CBSRegistration']/fieldset[2]/div[2]/div/div/div[2]/label")
	private WebElement profilecreatedfor;
	public WebElement getProfilecreatedfor() {
		return profilecreatedfor;
	}
	
	@FindBy(xpath="//*[@id='CBSRegistration']/fieldset[2]/div/div")
	private WebElement name;
	public WebElement getName() {
		return name;
	}
	
	@FindBy(xpath="//*[@id='CBSRegistration']/div[1]/fieldset/div[2]/div[2]/label/span")
	private WebElement gender;
	public WebElement getGender() {
		return gender;
	}

	@FindBy(xpath="//*[@id='ISDCode']")
	private WebElement phonecode;
	public WebElement getPhonecode() {
		return phonecode;
	}
	

	@FindBy(xpath="//*[@id='CBSRegistration']/fieldset[1]")
	private WebElement selectcommunity;
	public WebElement getSelectcommunity() {
		return selectcommunity;
	}

	@FindBy(xpath="//*[@id='RegPanelSearchvalue']")
	private WebElement search;
	public WebElement getSearch() {
		return search;
	}
	
	@FindBy(xpath="//*[@id='denomination_display']/fieldset/div/div")
	private WebElement denomination;
	public WebElement getDenomination() {
		return denomination;
	}
	
	@FindBy(xpath="//*[@id='CASTE']")
	private WebElement division;
	public WebElement getDivision() {
		return division;
	}
	
	@FindBy(xpath="//*[@id='mothertongue_display']/fieldset/div/div")
	private WebElement mothertongue;
	public WebElement getMothertongue() {
		return mothertongue;
	}

	@FindBy(xpath="//*[@id='home-footer']/div[1]")
	private WebElement continuebutton;
	public WebElement getContinuebutton() {
		return continuebutton;
	}
	
	@FindBy(xpath="//*[@id=\"reg_martial_block\"]/div[2]/div/div/div[1]/label/span")
	private WebElement maritalstatus;
	public WebElement getMaritalstatus() {
		return maritalstatus;
	}
	
	@FindBy(xpath="//*[@id='COUNTRYLIVING']")
	private WebElement countryliving;
	public WebElement getCountryliving() {
		return countryliving;
	}
	
	@FindBy(xpath="//*[@id='RESIDINGSTATE']")
	private WebElement residingstate;
	public WebElement getResidingstate() {
		return residingstate;
	}
	
	@FindBy(xpath="//*[@id='RESIDINGCITY']")
	private WebElement residingcity;
	public WebElement getResidingcity() {
		return residingcity;
	}
	
	@FindBy(xpath="//*[@id='CBSRegistration3']/fieldset[2]/div[2]/div/div/div[1]/label/span/span[1]")
	private WebElement physcialstatus;
	public WebElement getPhyscialstatus() {
		return physcialstatus;
	}

	@FindBy(xpath="//*[@id='EDUCATION']")
	private WebElement education;
	public WebElement getEducation() {
		return education;
	}
	
	@FindBy(xpath="//*[@id='CBSRegistration3']/fieldset[4]/div[2]/div/div/div[2]/label/span")
	private WebElement employedin;
	public WebElement getEmployedin() {
		return employedin;
	}
	
	@FindBy(xpath="//*[@id='CBSRegistration3']/fieldset[8]/div[2]/div[1]/div/div[2]/label/span")
	private WebElement familystatus;
	public WebElement getFamilystatus() {
		return familystatus;
	}
	
	@FindBy(xpath="//*[@id='CBSRegistration3']/fieldset[9]/div[2]/div/div/div[1]/label/span")
	private WebElement familytype;

	public WebElement getFamilytype() {
		return familytype;
	}

	
	@FindBy(xpath="//*[@id='CBSRegistration3']/fieldset[10]/div[2]/div/div/div[3]/label/span")
	private WebElement familyvalue;
	public WebElement getFamilyvalue() {
		return familyvalue;
	}

	@FindBy(xpath="//*[@id='OCCUPATION']")
	private WebElement occupation;
	public WebElement getOccupation() {
		return occupation;
	}

	
	@FindBy(xpath="//*[@id='RUPEESTYPE']")
	private WebElement rs;
	public WebElement getRs() {
		return rs;
	}

	@FindBy(xpath="(//*[@id='INCOMETEXT'])[1]")
	private WebElement income;
	public WebElement getIncome() {
		return income;
	}

	@FindBy(xpath="//*[@id='STAR']")
	private WebElement star;
	public WebElement getStar() {
		return star;
	}

	
	@FindBy(xpath="//*[@id='RAASI']")
	private WebElement raasi;
	
	public WebElement getRaasi() {
		return raasi;
	}
	
	@FindBy(xpath="//*[@id='HEIGHT']")
	private WebElement height;
	public WebElement getHeight() {
		return height;
	}

	@FindBy(xpath="//*[@id='ethnicity_display']/fieldset/div")
	private WebElement ethinicity;
	public WebElement getEthinicity() {
		return ethinicity;
	}
	
	@FindBy(xpath="//*[@id='religious_display']/fieldset/div/div")
	private WebElement religiousvalue;
	public WebElement getReligiousvalue() {
		return religiousvalue;
	}
	
	@FindBy(xpath="//*[@id='dressofmodestry_display']/fieldset/div[2]/div/div/div[1]/label")
	private WebElement dressofmodestry;

	public WebElement getDressofmodestry() {
		return dressofmodestry;
	}


	@FindBy(xpath="//*[@id='readquran_display']/fieldset/div[2]/div/div/div[1]/label")
	private WebElement readquran;

	public WebElement getReadquran() {
		return readquran;
	}
	

	@FindBy(xpath="//*[@id='STAR']")
	private WebElement stars;
	public WebElement getStars() {
		return stars;
	}
	
	@FindBy(xpath="//*[@id='RAASI']")
	private WebElement raasii;
	public WebElement getRaasii() {
		return raasii;
	}
    	
	@FindBy(xpath="//*[@id='GOTHRA_TXT']")
    private WebElement  gothra;
	public WebElement getGothra() {
		return gothra;
	}

	
	@FindBy(xpath="//*[@id='chevaidosham_display']/fieldset/div[2]/div[1]/label")
    private WebElement  dhosham;
	public WebElement getDhosham() {
		return dhosham;
	}


	@FindBy(xpath="//*[@id='TIMEOFBIRTH']")
    private WebElement  timeofbirth;

	public WebElement getTimeofbirth() {
		return timeofbirth;
	}
	
	@FindBy(xpath="//*[@id='COUNTRYBIRTH']")
    private WebElement  countryofbirth;

	public WebElement getCountryofbirth() {
		return countryofbirth;
	}

	
	
	
	@FindBy(xpath="//*[@id='BIRTHSTATE']")
    private WebElement  stateofbirth;
	public WebElement getStateofbirth() {
		return stateofbirth;
	}

	
	@FindBy(xpath="//*[@id='BIRTHCITY']")
    private WebElement  cityofbirth;
	public WebElement getCityofbirth() {
		return cityofbirth;
	}

	
	@FindBy(xpath="//*[@id='chartstyle']")
    private WebElement  chartstyle;
	public WebElement getChartstyle() {
		return chartstyle;
	}

	
	@FindBy(xpath="//*[@id='DOSHAM_SEL']")
    private WebElement  selectdhosham;
	public WebElement getSelectdhosham() {
		return selectdhosham;
	}

	
	
	
	
	
	
	
	
}
