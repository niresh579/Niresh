package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class RegistrationRaasiPOM {
	public RegistrationRaasiPOM(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath="//*[@id='COMMUNITY']")
	private WebElement community;
	
	
	public WebElement getCommunity() {
		return community;
	}

	@FindBy(xpath="//*[@id='CBSRegistration']/fieldset[1]/div[2]/div/div/div[2]/label")
	private WebElement profilecreatedfor;
	
	@FindBy(xpath="//*[@id='CBSRegistration']/fieldset[2]/div/div")
	private WebElement name;
	
	@FindBy(xpath="//*[@id='CBSRegistration']/div[1]/fieldset/div[2]/div[2]/label/span")
	private WebElement gender;
	
	@FindBy(xpath="	")
	private WebElement dob;

	public WebElement getProfilecreatedfor() {
		return profilecreatedfor;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getDob() {
		return dob;
	}
	
	
	
	@FindBy(xpath="//*[@id='CBSRegistration']/fieldset[6]/div/div[1]/div")
	private WebElement phonecode;

	public WebElement getPhonecode() {
		return phonecode;
	}
	
	@FindBy(xpath="//*[@id='RELIGION']")
	private WebElement religion;
	
	public WebElement getReligion() {
		return religion;
	}

	public WebElement getSubcaste() {
		return subcaste;
	}

	@FindBy(xpath="(//*[@id='SUBCASTE'])[1]")
	private WebElement subcaste;
	
	
	
	@FindBy(xpath="//*[@id='MOTHERTONGUE']")
	private WebElement mothertongue;

	public WebElement getMothertongue() {
		return mothertongue;
	}
	
	
	@FindBy(xpath="//*[@id='RegPanelSearchvalue']")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}
	
	
	@FindBy(xpath="//div[@class='continue-btn']")
	private WebElement continuebutton;

	public WebElement getContinuebutton() {
		return continuebutton;
	}
	
	////////Page 2 //////////
	
	
	@FindBy(xpath="//*[@id='reg_martial_block']/div[2]/div/div/div[1]/label/span")
	private WebElement maritalstatus;
	
	@FindBy(xpath="//*[@id='COUNTRYLIVING']")
	private WebElement countryliving;

	public WebElement getMaritalstatus() {
		return maritalstatus;
	}

	public WebElement getCountryliving() {
		return countryliving;
	}
	
	@FindBy(xpath="//*[@id='RESIDINGSTATE']")
	private WebElement state;
	
	@FindBy(xpath="//*[@id='RESIDINGCITY']")
	private WebElement city;

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}
	
	
	@FindBy(xpath="//*[@id='HEIGHT']")
	private WebElement height;

	public WebElement getHeight() {
		return height;
	}
	
	public WebElement getPhyscialstatus() {
		return physcialstatus;
	}

	public WebElement getEducation() {
		return education;
	}

	public WebElement getEmployedin() {
		return employedin;
	}

	@FindBy(xpath="//*[@id='CBSRegistration3']/fieldset[2]/div[2]/div/div/div[1]/label/span/span[1]")
	private WebElement physcialstatus;

	@FindBy(xpath="//*[@id='EDUCATION']")
	private WebElement education;
	
	@FindBy(xpath="//*[@id='CBSRegistration3']/fieldset[4]/div[2]/div/div/div[2]/label/span")
	private WebElement employedin;
	
	@FindBy(xpath="//*[@id='CBSRegistration3']/fieldset[8]/div[2]/div[1]/div/div[2]/label/span")
	private WebElement familystatus;
	
	@FindBy(xpath="//*[@id='CBSRegistration3']/fieldset[9]/div[2]/div/div/div[1]/label/span")
	private WebElement familytype;
	
	@FindBy(xpath="//*[@id='CBSRegistration3']/fieldset[10]/div[2]/div/div/div[3]/label/span")
	private WebElement familyvalue;

	public WebElement getFamilystatus() {
		return familystatus;
	}

	public WebElement getFamilytype() {
		return familytype;
	}

	public WebElement getFamilyvalue() {
		return familyvalue;
	}
	
	@FindBy(xpath="//*[@id='OCCUPATION']")
	private WebElement occupation;
	
	
	@FindBy(xpath="//*[@id='RUPEESTYPE']")
	private WebElement rs;
	

	@FindBy(xpath="(//*[@id='INCOMETEXT'])[1]")
	private WebElement income;

	public WebElement getOccupation() {
		return occupation;
	}

	public WebElement getRs() {
		return rs;
	}

	public WebElement getIncome() {
		return income;
	}
	
	
	public WebElement getStar() {
		return star;
	}

	public WebElement getRaasi() {
		return raasi;
	}

	@FindBy(xpath="//*[@id='STAR']")
	private WebElement star;
	
	@FindBy(xpath="//*[@id='RAASI']")
	private WebElement raasi;
	
	
	
	
}
