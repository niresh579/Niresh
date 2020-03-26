
package ref.referenecepg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom extends Base {

public Pom(WebDriver driver) {
PageFactory.initElements(driver, this);

}
@FindBy(xpath="//*[@id='ID']")
private WebElement name;
@FindBy(xpath="//*[@id='TEMPPASSWD1']")
private WebElement pass;
@FindBy(xpath="(//input[@value='Log In'])[1]")
      private WebElement login;
@FindBy(xpath="//*[@id='PASSWORD']")
private WebElement pass2;
@FindBy(xpath="//div[@id='logout']")
private WebElement logout1;
@FindBy(xpath="//div[@class='log-out-icon']")
private WebElement logout2;
@FindBy(xpath="//a[text()='Logout Completely']")
private WebElement logout3;
@FindBy(xpath="//a[text()='SEARCH']")
private WebElement Search;
@FindBy(xpath="//a[text()='Search by ID']")
private WebElement Searchbyid;

public WebElement getSearch() {
return Search;
}
public WebElement getLogout2() {
return logout2;
}
public WebElement getLogout3() {
return logout3;
}
public WebElement getLogout1() {
return logout1;
}
public WebElement getPass2() {
return pass2;
}
public WebElement getName() {
return name;
}
public WebElement getPass() {
return pass;
}
public WebElement getLogin() {
return login;
}
@FindBy(xpath="//*[@id='MID']")
private WebElement name1;
@FindBy(xpath="//*[@id='TEMPPASSWD1']")
private WebElement pass1;
@FindBy(xpath="/html/body/center/div[3]/div/div/center/div/div[2]/form/div[4]/input")
      private WebElement login1;
public WebElement getName1() {
return name1;
}
public WebElement getPass1() {
return pass1;
}
public WebElement getLogin1() {
return login1;
}
@FindBy(xpath="//*[@id='fixed-topnavbg']/div/ul/div[1]/li[4]/div/div[1]/a")
private WebElement matches;

public WebElement getMatches() {
return matches;
}

//task

@FindBy(xpath="//*[@id='MIDP']")
private WebElement stglog;

public WebElement getStglog() {
return stglog;
}

public WebElement getStgpass() {
return stgpass;
}

public WebElement getStglogin() {
return stglogin;
}
@FindBy(xpath="//*[@id='PASSWORD2']")
private WebElement stgpass;
@FindBy(xpath="//*[@id='rndcorner']/div[2]/form/div/div[4]/input")
private WebElement stglogin;

@FindBy(xpath="//*[@id='fixed-topnavbg']/div/ul/div[2]/li[2]/div/div[2]/div[3]/a[1]")
private WebElement EditPI;

public WebElement getEditPI() {
return EditPI;
}

@FindBy(xpath="//*[@id='logout']/a[2]/div/img")
private WebElement action5;
/**
* @return the action5
*/
public WebElement getAction5() {
return action5;
}
@FindBy(xpath="//*[@id='CREATEDBY']")
private WebElement pcreated;



/**
* @return the pcreated
*/
public WebElement getPcreated() {
return pcreated;
}
@FindBy(xpath="//*[@id='CREATEDBY']/option[3]")
private WebElement pcreatedfor;
/**
* @return the pcreatedfor
*/
public WebElement getPcreatedfor() {
return pcreatedfor;
}
/**

/**
* @return the height
*/
public WebElement getHeight() {
return Height;
}
/**
* @return the weight
*/
public WebElement getWeight() {
return Weight;
}
/**
* @return the maritalstatus
*/
public WebElement getMaritalstatus() {
return Maritalstatus;
}
/**
* @return the bodytype
*/
public WebElement getBodytype() {
return bodytype;
}
/**
* @return the complexion
*/
public WebElement getComplexion() {
return Complexion;
}
@FindBy(xpath="//input[@id='AGE1']")
private WebElement Age2;

/**
* @return the age2
*/
public WebElement getAge2() {
return Age2;
}
@FindBy(xpath="//*[@id='FEET']")
private WebElement Height;

@FindBy(xpath="//*[@id='KGS']")
private WebElement Weight;

@FindBy(xpath="//*[@id='MARITAL_STATUS']")
private WebElement Maritalstatus;

@FindBy(xpath="//*[@id='slim']")
private WebElement bodytype;

@FindBy(xpath="//*[@id='wheatishbrown']")
private WebElement Complexion;
@FindBy(xpath="//select[@id='DOBDAY']")
private WebElement date;
/**
* @return the date
*/
public WebElement getDate() {
return date;
}
@FindBy(xpath="//*[@id='STAR']")
private WebElement star;
/**
* @return the star
*/
public WebElement getStar() {
return star;
}
/**
* @return the rassi
*/
public WebElement getRassi() {
return Rassi;
}
/**
* @return the zodic
*/
public WebElement getZodic() {
return Zodic;
}
/**
* @return the dhosam
*/
public WebElement getDhosam() {
return Dhosam;
}
/**
* @return the birthplace
*/
public WebElement getBirthplace() {
return Birthplace;
}
/**
* @return the state
*/
public WebElement getState() {
return State;
}
/**
* @return the city
*/
public WebElement getCity() {
return city;
}
@FindBy(xpath="//*[@id='RAASI']")
private WebElement Rassi;
@FindBy(xpath="//*[@id='ZODICSIGN']")
private WebElement Zodic;
@FindBy(xpath="(//*[@id='MANGLIK'])[1]")
private WebElement Dhosam;
@FindBy(xpath=" //*[@id='selNewCountry']")
private WebElement Birthplace;
@FindBy(xpath="//*[@id='lstState1']")
private WebElement State;
@FindBy(xpath="//*[@id='lstcity']")
private WebElement city;

@FindBy(xpath=" //*[@id='lsthour']")
private WebElement Horohrs;

/**
* @return the horohrs
*/
public WebElement getHorohrs() {
return Horohrs;
}
/**
* @return the horomin
*/
public WebElement getHoromin() {
return Horomin;
}
/**
* @return the horoAmPm
*/
public WebElement getHoroAmPm() {
return HoroAmPm;
}
@FindBy(xpath="//*[@id='lstminute']")
private WebElement Horomin;
@FindBy(xpath="//*[@id='lstsession']")
private WebElement HoroAmPm;

@FindBy(xpath=" //*[@id='countryliv']")
private WebElement countryliv;
/**
* @return the countryliv
*/
public WebElement getCountryliv() {
return countryliv;
}
/**
* @return the citizenshipliv
*/
public WebElement getCitizenshipliv() {
return citizenshipliv;
}
/**
* @return the rESIDENTSTATUS
*/
public WebElement getRESIDENTSTATUS() {
return RESIDENTSTATUS;
}
/**
* @return the rESIDINGSTATE
*/
public WebElement getRESIDINGSTATE() {
return RESIDINGSTATE;
}
/**
* @return the rESIDINGCITY
*/
public WebElement getRESIDINGCITY() {
return RESIDINGCITY;
}
@FindBy(xpath="//*[@id='citizenshipliv']")
private WebElement citizenshipliv;

@FindBy(xpath="//*[@id='RESIDENTSTATUS']")
private WebElement RESIDENTSTATUS;
@FindBy(xpath="//*[@id='RESIDINGSTATE']")
private WebElement RESIDINGSTATE;
@FindBy(xpath="//*[@id='RESIDINGCITY']")
private WebElement RESIDINGCITY;

@FindBy(xpath="//*[@id='EDUCATION']")
private WebElement EDUCATION;
/**
* @return the eDUCATION
*/
public WebElement getEDUCATION() {
return EDUCATION;
}

@FindBy(xpath="//*[@id='occcate6']")
private WebElement employedIn;
/**
* @return the employedIn
*/
public WebElement getEmployedIn() {
return employedIn;
}

@FindBy(xpath="//*[@id='newoccuption']")
private WebElement newoccuption;
/**
* @return the newoccuption
*/
public WebElement getNewoccuption() {
return newoccuption;
}

@FindBy(xpath="//*[@id='MATRIFAMILYINFO']/div/div[1]/div[3]/input[1]")
private WebElement Familyvalue;
/**
* @return the familyvalue
*/
public WebElement getFamilyvalue() {
return Familyvalue;
}

@FindBy(xpath="//*[@id='MATRIFAMILYINFO']/div/div[3]/div[3]/input[1]")
private WebElement Familytype;
/**
* @return the familytype
*/
public WebElement getFamilytype() {
return Familytype;
}

@FindBy(xpath="//*[@id='MATRIFAMILYINFO']/div/div[5]/div[3]/input[2]")
private WebElement Familystatus;
/**
* @return the familystatus
*/
public WebElement getFamilystatus() {
return Familystatus;
}
@FindBy(xpath="//*[@id='famsameasme']")
private WebElement Familylocation;
/**
* @return the familylocation
*/
public WebElement getFamilylocation() {
return Familylocation;
}

@FindBy(xpath="//*[@id='LIFESTYLEEATING_HABITS2']")
private WebElement eatinghabbit;
public WebElement getEatinghabbit() {
return eatinghabbit;
}
@FindBy(xpath="//*[@id='LIFESTYLEDRINKING_HABITS1']")
private WebElement drinkinghabbit;
public WebElement getDrinkinghabbit() {
return drinkinghabbit;
}

@FindBy(xpath="//*[@id='LIFESTYLESMOKING_HABITS1']")
private WebElement smokinghabbit;
public WebElement getSmokinghabbit() {
return smokinghabbit;
}

@FindBy(xpath="//*[@id='countryliv']")
private WebElement bridecountry;
public WebElement getBridecountry() {
return bridecountry;
}


}
