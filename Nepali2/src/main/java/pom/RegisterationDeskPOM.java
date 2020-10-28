package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class RegisterationDeskPOM extends BaseTest {
	
	
	public RegisterationDeskPOM(WebDriver driver) {
	
		PageFactory.initElements(driver, this);	
	}
	
	
	
	
	@FindBy(xpath="//label[@for='genderfemale']")
	private WebElement gender;
	public WebElement getGender() {
		return gender;
	}
	
	@FindBy(id="mStatus1")
	private WebElement marital;
	public WebElement getMarital() {
		return marital;
	}
	
	@FindBy(id="religion")
	private WebElement religion;
	public WebElement getReligion() {
		return religion;
	}
	
	@FindBy(xpath="//input[@value='REGISTER NOW']")
	private WebElement registernow;
	public WebElement getRegisternow() {
		return registernow;
	}
	
	
	@FindBy(id="physicalStatuss0")
	private WebElement physicalstatus;
	public WebElement getPhysicalstatus() {
		return physicalstatus;
	}
	
	
	@FindBy(id="employmentCategorys3")
	private WebElement employedin;
	public WebElement getEmployedin() {
		return employedin;
	}
	
	
	@FindBy(id="familyValues1")
	private WebElement familyvalue;
	
	
	public WebElement getFamilyvalue() {
		return familyvalue;
	}

	@FindBy(id="familyTypes1")
	private WebElement familytype;
	public WebElement getFamilytype() {
		return familytype;
	}


	@FindBy(id="familyStatuss1")
	private WebElement familystatus;
	
	public WebElement getFamilystatus() {
		return familystatus;
	}

	@FindBy(id="complete")
	private WebElement compliteregisteration;
	public WebElement getCompliteregisteration() {
		return compliteregisteration;
	}
	


	
	
	
	
	
	
	
	
	
	
}