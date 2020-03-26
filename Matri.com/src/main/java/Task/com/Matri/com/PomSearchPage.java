package Task.com.Matri.com;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;



public class PomSearchPage  extends Base {
	 public PomSearchPage(AndroidDriver driver) {
			PageFactory.initElements(driver,this);
		}
	 @FindBy(xpath="//*[@text=' SEARCH PROFILES ']")
	 private WebElement profilesearch;
	 public WebElement getProfilesearch() {
		return profilesearch;
	}
	@FindBy(xpath="//*[@text and @nodeName='DIV' and @width>0 and (./preceding-sibling::* | ./following-sibling::*)[@id='rb-149-0'] and ./parent::*[@nodeName='ION-RADIO'] and ./*[@nodeName='DIV']]")
	 private WebElement radiobutton;
	 public WebElement getRadiobutton() {
		return radiobutton;
	}
	@FindBy(xpath="//*[@text='		  SAVED SEARCH		']")
	 private WebElement savesearchtab;
	 public WebElement getSavesearchtab() {
		return savesearchtab;
	}
	@FindBy(xpath="//*[@nodeName='ION-ICON' and ./parent::*[@text='                              ']]")
	 private WebElement back;
	 public WebElement getBack() {
		return back;
	}
	@FindBy(xpath="//*[@text='SAVE' and @nodeName='BUTTON']")
	 private WebElement savebutton;
	 public WebElement getSavebutton() {
		return savebutton;
	}
	@FindBy(xpath="//*[@nodeName='INPUT']")
	 private WebElement savesearch;
	 public WebElement getSavesearch() {
		return savesearch;
	}
	@FindBy(xpath="//*[@text='Save ']")
	 private WebElement save;
	 public WebElement getSave() {
		return save;
	}
	@FindBy(xpath="(//*/*[@nodeName='SPAN' and @width>0])[3]")
	 private WebElement searchresult;
	 public WebElement getSearchresult() {
		return searchresult;
	}
	//=================================================submit======================================================================
	 @FindBy(xpath="//*[@nodeName='BUTTON' and @type='submit']")
	 private WebElement submit;
	
	 public WebElement getSubmit() {
		return submit;
	}
	//=================================================annualincome============================================================================
	 @FindBy(xpath="//*[@nodeName='IMG' and ./parent::*[@width>0 and (./preceding-sibling::* | ./following-sibling::*)[./*[./*[@text]]]]]")
	 private WebElement up2;
	 public WebElement getUp2() {
		return up2;
	}
	@FindBy(xpath="(//*/*/*/*/*/*[@nodeName='IMG' and ./parent::*[./parent::*[./parent::*[@nodeName='DIV']] and (./preceding-sibling::* | ./following-sibling::*)[./*[@width>0]]]])[13]")
	 private WebElement incometo;
	 @FindBy(xpath="(//*/*/*/*/*/*[@nodeName='IMG' and ./parent::*[./parent::*[./parent::*[@nodeName='DIV']] and (./preceding-sibling::* | ./following-sibling::*)[./*[@width>0]]]])[12]")
	 private WebElement incomefrom;
	 @FindBy(xpath="(//*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./*[./*[@nodeName='SPAN' and @width>0]] and ./parent::*[@nodeName='ION-COL']])[3]")
	 private WebElement annualincome;
	 public WebElement getIncometo() {
		return incometo;
	}

	public WebElement getIncomefrom() {
		return incomefrom;
	}

	public WebElement getAnnualincome() {
		return annualincome;
	}
	//===============================================occupation==================================================================
	 @FindBy(xpath="//*[@class='label label-md' and @text='Manager']")
	 private WebElement manager;
	 @FindBy(xpath="//*[@class='label label-md' and @text='Any']")
	 private WebElement any7;
	 @FindBy(xpath="(//*/*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./parent::*[@nodeName='DIV'] and ./*[./*[@nodeName='SPAN' and @width>0]]])[11]")
	 private WebElement occupation;
	 public WebElement getManager() {
		return manager;
	}

	public WebElement getAny7() {
		return any7;
	}

	public WebElement getOccupation() {
		return occupation;
	}
	//================================================education==============================================================
	 @FindBy(xpath="//*[@class='label label-md' and @text='MBA']")
	 private WebElement mba;
	 public WebElement getMba() {
		return mba;
	}

	public WebElement getBe() {
		return be;
	}

	public WebElement getAny6() {
		return any6;
	}

	public WebElement getEducation() {
		return education;
	}
	@FindBy(xpath="//*[@class='label label-md' and @text='BE']")
	 private WebElement be;
	 @FindBy(xpath="//*[@class='label label-md' and @text='Any']")
	 private WebElement any6;
	 @FindBy(xpath="(//*/*/*/*/*/*/*[@nodeName='IMG' and ./parent::*[./parent::*[./parent::*[@nodeName='DIV']] and (./preceding-sibling::* | ./following-sibling::*)[./*[@width>0]]]])[10]")
	 private WebElement education;
	 //=========================================================city========================================================
	 @FindBy(xpath="//*[@class='label label-md']")
	 private WebElement chennai;
	 @FindBy(xpath="//*[@class='label label-md' and @text='Any']")
	 private WebElement any5;
	 @FindBy(xpath="(//*/*/*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./parent::*[@nodeName='DIV'] and ./*[./*[@nodeName='SPAN' and @width>0]]])[9]")
	 private WebElement city;
	 public WebElement getChennai() {
		return chennai;
	}

	public WebElement getAny5() {
		return any5;
	}

	public WebElement getCity() {
		return city;
	}
	//=================================================state=========================================================================
	 @FindBy(xpath="//*[@class='label label-md']")
	 private WebElement tamilnadu;
	 @FindBy(xpath="//*[@class='label label-md']")
	 private WebElement any4;
	 @FindBy(xpath="(//*/*/*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./parent::*[@nodeName='DIV'] and ./*[./*[@nodeName='SPAN' and @width>0]]])[8]")
	 private WebElement state;
	 public WebElement getTamilnadu() {
		return tamilnadu;
	}

	public WebElement getAny4() {
		return any4;
	}

	public WebElement getState() {
		return state;
	}
	//===================================================country======================================================
	 @FindBy(xpath="//*[@class='label label-md']")
	 private WebElement india;
	 @FindBy(xpath="//*[@class='label label-md' and @text='Any']")
	 private WebElement any3;
	 @FindBy(xpath="(//*/*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./parent::*[@nodeName='DIV'] and ./*[./*[@nodeName='SPAN' and @width>0]]])[7]")
	 private WebElement country;
	 public WebElement getIndia() {
		return india;
	}

	public WebElement getAny3() {
		return any3;
	}

	public WebElement getCountry() {
		return country;
	}
	//=========================================================star=============================================================
	 @FindBy(xpath="//*[@class='label label-md']")
	 private WebElement rohini;
	 @FindBy(xpath="//*[@class='label label-md']")
	 private WebElement any2;
	 @FindBy(xpath="(//*/*/*/*/*/*/*[@nodeName='IMG' and ./parent::*[./parent::*[./parent::*[@nodeName='DIV']] and (./preceding-sibling::* | ./following-sibling::*)[./*[@width>0]]]])[6]")
	 private WebElement star;
	 public WebElement getRohini() {
		return rohini;
	}

	public WebElement getAny2() {
		return any2;
	}

	public WebElement getStar() {
		return star;
	}
	//========================================================================caste=============================================
	 @FindBy(xpath="(//*/*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./parent::*[@nodeName='DIV'] and ./*[./*[@nodeName='SPAN' and @width>0]]])[5]")
	 private WebElement subcaste;
	 public WebElement getSubcaste() {
		return subcaste;
	}

	@FindBy(xpath="//*[@class='label label-md']")
	 private WebElement agarwal;
	 @FindBy(xpath="//*[@class='label label-md' and @id='lbl-345']")
	 private WebElement dontwish;
	 @FindBy(xpath="(//*/*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./parent::*[@nodeName='DIV'] and ./*[./*[@nodeName='SPAN' and @width>0]]])[4]")
	 private WebElement caste;
	 public WebElement getAgarwal() {
		return agarwal;
	}

	public WebElement getDontwish() {
		return dontwish;
	}

	public WebElement getCaste() {
		return caste;
	}
	//==================================================================mothertongue===========================================================
	 @FindBy(xpath="//*[@class='label label-md']")
	 private WebElement tamil;
	 @FindBy(xpath="//*[@class='label label-md']")
	 private WebElement any1;
	 @FindBy(xpath="(//*/*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./parent::*[@nodeName='DIV'] and ./*[./*[@nodeName='SPAN' and @width>0]]])[3]")
	 private WebElement mothertongue;
	 public WebElement getTamil() {
		return tamil;
	}

	public WebElement getAny1() {
		return any1;
	}

	public WebElement getMothertongue() {
		return mothertongue;
	}
	//==========================================================religion=================================================
	 @FindBy(xpath="(//*/*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./parent::*[@nodeName='DIV'] and ./*[./*[@nodeName='SPAN' and @width>0]]])[2]")
	 private WebElement religion;
	 public WebElement getReligion() {
		return religion;
	}
	//===================================================================ms================================================
	 @FindBy(xpath="(//*[@text='                                            ' and ./parent::*[@text='            ']]/*/*[@nodeName='ION-ICON' and ./parent::*[@text='                            ']])[2]")
	 private WebElement tik;
	 public WebElement getTik() {
		return tik;
	}
	@FindBy(xpath="//*[@class='label label-md']")
	 private WebElement nevermarried;
	 @FindBy(xpath="//*[@class='label label-md']")
	 private WebElement any;
	 @FindBy(xpath="(//*/*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./parent::*[@nodeName='DIV'] and ./*[./*[@nodeName='SPAN' and @width>0]]])[1]")
	 private WebElement matrialstatus;
	 public WebElement getNevermarried() {
		return nevermarried;
	}

	public WebElement getAny() {
		return any;
	}

	public WebElement getMatrialstatus() {
		return matrialstatus;
	}
	//========================================================================height=============================================================
	 @FindBy(xpath="(//*/*/*/*/*/*[@nodeName='IMG' and ./parent::*[@width>0]])[2]")
	 private WebElement heightup;
	 @FindBy(xpath="(//*/*/*/*/*/*[@nodeName='IMG' and ./parent::*[./parent::*[./parent::*[@nodeName='DIV']] and (./preceding-sibling::* | ./following-sibling::*)[./*[@width>0]]]])[2]")
	 private WebElement heightto;
	 @FindBy(xpath="(//*/*/*/*/*/*[@nodeName='IMG' and ./parent::*[./parent::*[./parent::*[@nodeName='DIV']] and (./preceding-sibling::* | ./following-sibling::*)[./*[@width>0]]]])[1]")
	 private WebElement heightfrom;
	 @FindBy(xpath="(//*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./*[./*[@nodeName='SPAN' and @width>0]] and ./parent::*[@nodeName='ION-COL']])[2]")
	 private WebElement height;
	 
	 
	 public WebElement getHeightup() {
		return heightup;
	}

	public WebElement getHeightto() {
		return heightto;
	}

	public WebElement getHeightfrom() {
		return heightfrom;
	}

	public WebElement getHeight() {
		return height;
	}
	//==================================================age=================================================================
	 @FindBy(xpath="(//*/*/*/*/*/*[@nodeName='IMG' and ./parent::*[@width>0]])[1]")
	 private WebElement upbutton;
	 public WebElement getUpbutton() {
		return upbutton;
	}

	public WebElement getSkip() {
		return skip;
	}


	@FindBy(xpath="//*[@nodeName='DIV' and @width>0 and ./*[@nodeName='ION-LABEL']]")
	 private WebElement agefromvalue;
	 @FindBy(xpath="//*[@nodeName='INPUT']")
	 private WebElement textinput;
	 @FindBy(xpath="(//*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./*[./*[@nodeName='SPAN' and @width>0]] and ./parent::*[@nodeName='ION-COL']])[1]")
	 private WebElement age;
	 @FindBy(xpath="(//*/*/*/*/*/*[@nodeName='IMG' and ./parent::*[./parent::*[./parent::*[@nodeName='DIV']] and (./preceding-sibling::* | ./following-sibling::*)[./*[@width>0]]]])[1]")
	 private WebElement agefrom;
	 @FindBy(xpath="(//*/*/*/*/*/*[@nodeName='IMG' and ./parent::*[./parent::*[./parent::*[@nodeName='DIV']] and (./preceding-sibling::* | ./following-sibling::*)[./*[@width>0]]]])[2]")
	 private WebElement ageto;
	public WebElement getAgefromvalue() {
		return agefromvalue;
	}

	public WebElement getTextinput() {
		return textinput;
	}

	public WebElement getAge() {
		return age;
	}

	public WebElement getAgefrom() {
		return agefrom;
	}

	public WebElement getAgeto() {
		return ageto;
	}

	
	// ======================================================================================================================
	 @FindBy(xpath="//*[@text='Search']")
	 private WebElement search;
public WebElement getSearch() {
return search;
}
	 
	 @FindBy(xpath="//*[@text='Clear']")
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
	 @FindBy(xpath="//*[@text=' Skip ']")
	 private WebElement skip;
	 @FindBy(xpath="//*[@text='Logout' and @nodeName='SPAN']")
	 private WebElement logout;
	 public WebElement getLogout() {
		return logout;
	}
	public void setLogout(WebElement logout) {
		this.logout = logout;
	}
	@FindBy(xpath="//*[@text=' Account']")
	 private WebElement Account;
	 public WebElement getAccount() {
		return Account;
	}
	public void setAccount(WebElement account) {
		Account = account;
	}
	@FindBy(xpath="//*[@text='Settings']")
	 private WebElement setting;
	 public WebElement getSetting() {
		return setting;
	}
	public void setSetting(WebElement setting) {
		this.setting = setting;
	}
	@FindBy(xpath="//*[@text=' ' and @nodeName='ION-ICON']")
	 private WebElement menu;
	 public WebElement getMenu() {
		return menu;
	}
	public void setMenu(WebElement menu) {
		this.menu = menu;
	}
	@FindBy(xpath="//*[@nodeName='BUTTON']")
	 private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}
	@FindBy(xpath="//*[@nodeName='INPUT' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@id='lbl-1']]]")
	private WebElement password;
	 public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	@FindBy(xpath="//*[@nodeName='INPUT' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@id='lbl-0']]]")
	 private WebElement username;
	 
	  public WebElement getUsername() {
		return username;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	@FindBy(xpath="//*[@text='LOGIN']")
	 private WebElement loginbutton;
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	
	}

}
