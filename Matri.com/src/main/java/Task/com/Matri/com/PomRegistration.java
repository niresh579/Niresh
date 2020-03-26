package Task.com.Matri.com;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;


public class PomRegistration extends Base {
	public PomRegistration(AndroidDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@text='CLEAR']")
	 private WebElement clear;
	 public WebElement getClear() {
		return clear;
	}
	@FindBy(xpath="//*[@text='Clear data' and @width>0]")
	 private WebElement cleardata;
	 public WebElement getCleardata() {
		return cleardata;
	}
	@FindBy(xpath="//*[@text='Clear browsing data…']")
	 private WebElement clearbrowserdata;
	 public WebElement getClearbrowserdata() {
		return clearbrowserdata;
	}
	@FindBy(xpath="//*[@class='android.widget.LinearLayout' and @width>0 and @height>0 and ./*[@text='History']]")
	 private WebElement history;
	 @FindBy(xpath="//*[@id='menu_button']")
	 private WebElement menub;
		 public WebElement getMenub() {
		return menub;
	}
		
		 public WebElement getHistory() {
			return history;
		}
	@FindBy(xpath="//*[@id='REGISPROFILECREATEDHASHEXT']")
	private WebElement profilefor;
	public WebElement getProfilefor() {
		return profilefor;
	}
	public void setProfilefor(WebElement profilefor) {
		this.profilefor = profilefor;
	}
    
	@FindBy(xpath="//*[@name='USERNAME']")
	private WebElement name;
	public WebElement getName() {
		return name;
	}
	public void setName(WebElement name) {
		this.name = name;
	}
	@FindBy(xpath="//*[@value='1' and ./parent::*[@id='day']]")
	private WebElement day;
	@FindBy(xpath="//*[@value='3' and ./parent::*[@id='month']]")
	private WebElement month;
	@FindBy(xpath="//*[@value='1996']")
	private WebElement year;
	public WebElement getDay() {
		return day;
	}
	public void setDay(WebElement day) {
		this.day = day;
	}
	public WebElement getMonth() {
		return month;
	}
	public void setMonth(WebElement month) {
		this.month = month;
	}
	public WebElement getYear() {
		return year;
	}
	public void setYear(WebElement year) {
		this.year = year;
	}
	@FindBy(xpath="//*[@name='COUNTRYCODE']")
	private WebElement countrycode;
	public WebElement getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(WebElement countrycode) {
		this.countrycode = countrycode;
	}
	@FindBy(xpath="//*[@name='CONTACTNO']")
	private WebElement mobileno;
	public WebElement getMobileno() {
		return mobileno;
	}
	public void setMobileno(WebElement mobileno) {
		this.mobileno = mobileno;
	}
	@FindBy(xpath="//*[@name='PASSWORD']")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	@FindBy(xpath="//*[@id='RELIGION' and @nodeName='A']")
	private WebElement religion;
	public WebElement getReligion() {
		return religion;
	}
	public void setReligion(WebElement religion) {
		this.religion = religion;
	}
	@FindBy(xpath="//*[@id='MOTHERTONGUE' and @nodeName='A']")
	private WebElement mothertongue;
	public WebElement getMothertongue() {
		return mothertongue;
	}
	public void setMothertongue(WebElement mothertongue) {
		this.mothertongue = mothertongue;
	}
	@FindBy(xpath="//*[@id='']")
	private WebElement continuebutton;
	public WebElement getContinuebutton() {
		return continuebutton;
	}
	public void setContinuebutton(WebElement continuebutton) {
		this.continuebutton = continuebutton;
	}
	@FindBy(xpath="//*[@name='EMAIL']")
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	@FindBy(xpath="//*[@id='CASTE' and @nodeName='A']")
	private WebElement caste;
	public WebElement getCaste() {
		return caste;
	}
	public void setCaste(WebElement caste) {
		this.caste = caste;
	}
	@FindBy(xpath="//*[@id='SUBCASTE' and @nodeName='A']")
	private WebElement subcaste;
	public WebElement getSubcaste() {
		return subcaste;
	}
	public void setSubcaste(WebElement subcaste) {
		this.subcaste = subcaste;
	}
	@FindBy(xpath="//*[@text='No' and @nodeName='LABEL']")
	private WebElement doshno;
	public WebElement getDoshno() {
		return doshno;
	}
	
	public void setDoshno(WebElement doshno) {
		this.doshno = doshno;
	}
	@FindBy(xpath="//*[@id='MALEMARITALSTATUS' and @nodeName='A']")
	private WebElement matritalstatus;
	public WebElement getMatritalstatus() {
		return matritalstatus;
	}
	public void setMatritalstatus(WebElement matritalstatus) {
		this.matritalstatus = matritalstatus;
	}
	@FindBy(xpath="//*[@text='Never Married' and @nodeName='LI']")
	private WebElement nevermarried;
	public WebElement getNevermarried() {
		return nevermarried;
	}
	public void setNevermarried(WebElement nevermarried) {
		this.nevermarried = nevermarried;
	}
	@FindBy(xpath="//*[@id='FAMILYSTATUS' and @nodeName='A']")
	private WebElement familystatus;
	@FindBy(xpath="//*[@id='FAMILYTYPE' and @nodeName='A']")
	private WebElement familytype;
	@FindBy(xpath="//*[@id='FAMILYVALUE' and @nodeName='A']")
	private WebElement familyvalue;
	public WebElement getFamilystatus() {
		return familystatus;
	}
	public void setFamilystatus(WebElement familystatus) {
		this.familystatus = familystatus;
	}
	public WebElement getFamilytype() {
		return familytype;
	}
	public void setFamilytype(WebElement familytype) {
		this.familytype = familytype;
	}
	public WebElement getFamilyvalue() {
		return familyvalue;
	}
	public void setFamilyvalue(WebElement familyvalue) {
		this.familyvalue = familyvalue;
	}
	@FindBy(xpath="//*[@text='Rich' and @nodeName='LI']")
	private WebElement rich;
	public WebElement getRich() {
		return rich;
	}
	public void setRich(WebElement rich) {
		this.rich = rich;
	}
	@FindBy(xpath="//*[@text='Nuclear' and @nodeName='LI']")
	private WebElement nuclear;
	public WebElement getNuclear() {
		return nuclear;
	}
	public void setNuclear(WebElement nuclear) {
		this.nuclear = nuclear;
	}
	@FindBy(xpath="//*[@text='Moderate' and @nodeName='LI']")
	private WebElement moderate;
	public WebElement getModerate() {
		return moderate;
	}
	public void setModerate(WebElement moderate) {
		this.moderate = moderate;
	}
	@FindBy(xpath="//*[@id='HEIGHT_REG' and @nodeName='A']")
	private WebElement height;
	public WebElement getHeight() {
		return height;
	}
	public void setHeight(WebElement height) {
		this.height = height;
	}
	@FindBy(xpath="//*[@text='5ft']")
	private WebElement fivefeet;
	public WebElement getFivefeet() {
		return fivefeet;
	}
	public void setFivefeet(WebElement fivefeet) {
		this.fivefeet = fivefeet;
	}
	@FindBy(xpath="//*[@id='EDUCATION_REG' and @nodeName='A']")
	private WebElement education;
	public WebElement getEducation() {
		return education;
	}
	public void setEducation(WebElement education) {
		this.education = education;
	}
	@FindBy(xpath="//*[@text='BE' and @nodeName='LI']")
	private WebElement educationbe;
	public WebElement getEducationbe() {
		return educationbe;
	}
	public void setEducationbe(WebElement educationbe) {
		this.educationbe = educationbe;
	}
	@FindBy(xpath="//*[@id='OCCUPATION' and @nodeName='A']")
	private WebElement  employedin;
	public WebElement getEmployedin() {
		return employedin;
	}
	public void setEmployedin(WebElement employedin) {
		this.employedin = employedin;
	}
	@FindBy(xpath="//*[@text='Private' and @nodeName='LI']")
	private WebElement privateemp;
	public WebElement getPrivateemp() {
		return privateemp;
	}
	public void setPrivateemp(WebElement privateemp) {
		this.privateemp = privateemp;
	}
	@FindBy(xpath="//*[@id='OCCUPATION_REG' and @nodeName='A']")
	private WebElement occupation;
	public WebElement getOccupation() {
		return occupation;
	}
	public void setOccupation(WebElement occupation) {
		this.occupation = occupation;
	}
	@FindBy(xpath="//*[@text='Manager' and @nodeName='LI']")
	private WebElement manager;
	public WebElement getManager() {
		return manager;
	}
	public void setManager(WebElement manager) {
		this.manager = manager;
	}
	@FindBy(xpath="//*[@id='ANNUALINCOMEARRAY' and @nodeName='A']")
	private WebElement income;
	public WebElement getIncome() {
		return income;
	}
	public void setIncome(WebElement income) {
		this.income = income;
	}
	@FindBy(xpath="//*[@text='6 - 7 Lakhs' and @nodeName='LI']")
	private WebElement lakhs;
	public WebElement getLakhs() {
		return lakhs;
	}
	public void setLakhs(WebElement lakhs) {
		this.lakhs = lakhs;
	}
    @FindBy(xpath="//*[@id='familycountry' and @nodeName='A']")
    private WebElement countrywork;
	public WebElement getCountrywork() {
		return countrywork;
	}
	public void setCountrywork(WebElement countrywork) {
		this.countrywork = countrywork;
	}
	@FindBy(xpath="(//*[@text='																																																																																																																																																																																																																																																															...']/*[@text='India' and @nodeName='LI'])[1]")
	private WebElement placeofwork;
	public WebElement getPlaceofwork() {
		return placeofwork;
	}
	public void setPlaceofwork(WebElement placeofwork) {
		this.placeofwork = placeofwork;
	}
	@FindBy(xpath="//*[@id='STATEIN' and @nodeName='A']")
	private WebElement regstate;
	public WebElement getRegstate() {
		return regstate;
	}
	public void setRegstate(WebElement regstate) {
		this.regstate = regstate;
	}
	@FindBy(xpath="//*[@text='Andhra Pradesh' and @nodeName='LI']")
	private WebElement andhra;
	public WebElement getAndhra() {
		return andhra;
	}
	public void setAndhra(WebElement andhra) {
		this.andhra = andhra;
	}
	@FindBy(xpath="//*[@id='familyresicity' and @nodeName='A']")
	private WebElement city;
	public WebElement getCity() {
		return city;
	}
	public void setCity(WebElement city) {
		this.city = city;
	}
	@FindBy(xpath="//*[@text='Chittoor' and @nodeName='LI']")
	private WebElement cityplace;
	public WebElement getCityplace() {
		return cityplace;
	}
	public void setCityplace(WebElement cityplace) {
		this.cityplace = cityplace;
	}
	@FindBy(xpath="//*[@name='Comments']")
	private WebElement comments;
	public WebElement getComments() {
		return comments;
	}
	public void setComments(WebElement comments) {
		this.comments = comments;
	}
	@FindBy(xpath="(//*/*[@text and @nodeName='DIV'])[4]")
	private WebElement matrixid;
	public WebElement getMatrixid() {
		return matrixid;
	}
	public void setMatrixid(WebElement matrixid) {
		this.matrixid = matrixid;
	}
	
	
}

