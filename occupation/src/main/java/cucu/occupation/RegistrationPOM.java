package cucu.occupation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPOM extends Base {
	public RegistrationPOM (WebDriver driver) {
	PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//*[@id='REGISPROFILECREATEDHASHEXT']")
	 private WebElement selectprofile;
	public WebElement getSelectprofile() {
		return selectprofile;
	}
	
	@FindBy(xpath="//*[@id='scroller']/ul/li[2]")
	 private WebElement personchoose;
	public WebElement getPersonchoose() {
		return personchoose;
	}
	
	
	@FindBy(xpath="//*[@id='USERNAME']")
	 private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	
	public WebElement getCountrycode() {
		return countrycode;
	}
	@FindBy(xpath="//*[@id='COUNTRYCODE']")
	 private WebElement countrycode;
	
	

	
	@FindBy(xpath="//*[@id='scroller']/ul/li[110]")
	 private WebElement countryselected;
	public WebElement getCountryselected() {
		return countryselected;
	}
	
	@FindBy(xpath="//*[@id='CONTACTNO']")
	 private WebElement phonenumber;
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//*[@id='RELIGION']")
	 private WebElement religion;

	public WebElement getReligion() {
		return religion;
	}

	public WebElement getPhonenumber() {
		return phonenumber;
	}
	@FindBy(xpath="//*[@id='PASSWORD']")
	 private WebElement password;
	
	
	@FindBy(xpath="//*[@id='MOTHERTONGUE']")
	 private WebElement mothertongue;
	public WebElement getMothertongue() {
		return mothertongue;
	}
	
	@FindBy(xpath="//*[@id='regform']/div[12]/div[2]/div/input")
	 private WebElement register;
	public WebElement getRegister() {
		return register;
	}	
	
	
	public WebElement getCaste() {
		return caste;
	}
	@FindBy(xpath="//*[@id='CASTE']")
	 private WebElement caste;
	
	@FindBy(xpath="//*[@id='SUBCASTE']")
	 private WebElement subcaste;
	
	public WebElement getSubcaste() {
		return subcaste;
	}
	@FindBy(xpath="//*[@id='MALEMARITALSTATUS']")
	 private WebElement maritalstatus;
	public WebElement getMaritalstatus() {
		return maritalstatus;
	}
	
	@FindBy(xpath="//*[@id='FAMILYSTATUS']")
	 private WebElement familystatus;
	@FindBy(xpath="//*[@id='FAMILYTYPE']")
	 private WebElement familytype;
	public WebElement getFamilystatus() {
		return familystatus;
	}

	public WebElement getFamilytype() {
		return familytype;
	}

	public WebElement getFamilyvalue() {
		return familyvalue;
	}
	@FindBy(xpath="//*[@id='FAMILYVALUE']")
	 private WebElement familyvalue;
	
	
	@FindBy(xpath="//*[@id='HEIGHT_REG']")
	 private WebElement height;
	
	@FindBy(xpath="//*[@id='EDUCATION_REG']")
	 private WebElement education;
	
	@FindBy(xpath="//*[@id='OCCUPATION']")
	 private WebElement employed;
	
	
	public WebElement getHeight() {
		return height;
	}

	public WebElement getEducation() {
		return education;
	}

	public WebElement getEmployed() {
		return employed;
	}
	@FindBy(xpath="//*[@id='OCCUPATION_REG']")
	 private WebElement occupation;

	public WebElement getOccupation() {
		return occupation;
	}
	
	@FindBy(xpath="//*[@id=\'INCOMECURRENCYHASH\']")
	 private WebElement rs;
	
	public WebElement getRs() {
		return rs;
	}

	
	@FindBy(xpath="//*[@id='ANNUALINCOMEARRAY']")
	 private WebElement income;
	public WebElement getIncome() {
		return income;
	}
	
	@FindBy(xpath="//*[@id='familycountry']")
	 private WebElement country;
	
	@FindBy(xpath="//*[@id='STATEIN']")
	 private WebElement state;
	
	@FindBy(xpath="//*[@id='familyresicity']")
	 private WebElement city;
	
	
	public WebElement getCountry() {
		return country;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(xpath="//*[@id='regform']/div[21]/div/div/input")
	 private WebElement submit;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	











