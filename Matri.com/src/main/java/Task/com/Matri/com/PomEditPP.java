package Task.com.Matri.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;



public class PomEditPP extends Base {
	 public PomEditPP(AndroidDriver driver) {
			PageFactory.initElements(driver,this);
	 }
	 //==============================================================================ppmatchesdetails==============================
     @FindBy(xpath="(//*/*[@text and @nodeName='ION-COL'])[86]")
	 private WebElement ppstate;
	 public WebElement getPpstate() {
		return ppstate;
	}

	public WebElement getPpcountry() {
		return ppcountry;
	}

	public WebElement getPpoccupation() {
		return ppoccupation;
	}

	public WebElement getPpeducation() {
		return ppeducation;
	}

	public WebElement getPpcaste() {
		return ppcaste;
	}

	public WebElement getPpreligion() {
		return ppreligion;
	}

	public WebElement getPpphysicalstatus() {
		return ppphysicalstatus;
	}

	public WebElement getPpmothertougu() {
		return ppmothertougu;
	}

	public WebElement getPpmatrialstatus() {
		return ppmatrialstatus;
	}

	public WebElement getPpheight() {
		return ppheight;
	}

	public WebElement getPpage() {
		return ppage;
	}
	@FindBy(xpath="(//*/*[@text and @nodeName='ION-COL'])[86]")
	 private WebElement ppcountry;
	 @FindBy(xpath="(//*/*[@text and @nodeName='ION-COL'])[86]")
	 private WebElement ppoccupation;
	 @FindBy(xpath="(//*/*[@text and @nodeName='ION-COL'])[80]")
	 private WebElement ppeducation;
	 @FindBy(xpath="(//*/*[@text and @nodeName='ION-COL'])[60]")
	 private WebElement ppcaste;
	 @FindBy(xpath="(//*/*[@text and @nodeName='ION-COL'])[57]")
	 private WebElement ppreligion;
	 @FindBy(xpath="(//*/*[@text and @nodeName='ION-COL'])[35]")
	 private WebElement ppphysicalstatus;
	 @FindBy(xpath="(//*/*[@text and @nodeName='ION-COL'])[32]")
	 private WebElement ppmothertougu;
	 @FindBy(xpath="(//*/*[@text and @nodeName='ION-COL'])[29]")
	 private WebElement ppmatrialstatus;
	 @FindBy(xpath="(//*/*[@text and @nodeName='ION-COL'])[23]")
	 private WebElement ppheight;
	 @FindBy(xpath="(//*/*[@text and @nodeName='ION-COL'])[20]")
	 private WebElement ppage;
	 //======================================================match================================================
	 @FindBy(xpath="//*[@class='bold-txt font-clrwhite font-16 paddl10 v-middle txt-shdw']")
	 private WebElement matriid;
	 public WebElement getMatriid() {
		return matriid;
	}

	@FindBy(xpath="//*[@nodeName='ION-ROW' and ./*[@nodeName='ION-ROW']]")
	 private WebElement matchmember;
	 public WebElement getMatchmember() {
		return matchmember;
	}
	//=================================================================================================================
	 @FindBy(xpath="//*[@class='icon-icn_home fnts icon icon-md']")
	 private WebElement homeicon;
	 public WebElement getHomeicon() {
		return homeicon;
	}

	public WebElement getBackfromeditpp() {
		return backfromeditpp;
	}
	@FindBy(xpath="//*[@class='font-clrwhite icon-arrow-left2 paddl10 v-middle icon icon-md']")
	 private WebElement backfromeditpp;
	 //===========================================================location==============================================
	 @FindBy(xpath="(//*/*[@nodeName='ION-COL'])[240]")
	 private WebElement locacitizenship;
	 public WebElement getLocacitizenship() {
		return locacitizenship;
	}

	public WebElement getLocastate() {
		return locastate;
	}

	public WebElement getLocacountry() {
		return locacountry;
	}
	@FindBy(xpath="(//*/*[@nodeName='ION-COL'])[237]")
	 private WebElement locastate;
	 @FindBy(xpath="(//*/*[@nodeName='ION-COL'])[234]")
	 private WebElement locacountry;
	 //==================================================================professional===================
	 @FindBy(xpath="(//*/*[@nodeName='ION-COL'])[228]")
	 private WebElement profannualincome;
	 @FindBy(xpath="(//*/*[@nodeName='ION-COL'])[225]")
	 private WebElement profoccupation;
	 @FindBy(xpath="(//*/*[@nodeName='ION-COL'])[222]")
	 private WebElement profeducation;
	 public WebElement getProfannualincome() {
			return profannualincome;
		}

		public WebElement getProfoccupation() {
			return profoccupation;
		}

		public WebElement getProfeducation() {
			return profeducation;
		}
	 //===============================================================reglig=========================
	 
	 
	@FindBy(xpath="(//*/*[@nodeName='ION-COL'])[216]")
	 private WebElement religdosham;
	 public WebElement getReligdosham() {
		return religdosham;
	}

	public WebElement getReligstar() {
		return religstar;
	}

	public WebElement getReligsubcaste() {
		return religsubcaste;
	}

	public WebElement getReligcaste() {
		return religcaste;
	}

	public WebElement getReligionpp() {
		return religionpp;
	}

	public WebElement getReligmothertougue() {
		return religmothertougue;
	}

	@FindBy(xpath="(//*/*[@nodeName='ION-COL'])[213]")
	 private WebElement religstar;
	 @FindBy(xpath="(//*/*[@nodeName='ION-COL'])[210]")
	 private WebElement religsubcaste;
	 @FindBy(xpath="(//*/*[@nodeName='ION-COL'])[207]")
	 private WebElement religcaste;
	 @FindBy(xpath="(//*/*[@nodeName='ION-COL'])[204]")
	 private WebElement religionpp;
	 @FindBy(xpath="(//*/*[@nodeName='ION-COL'])[201]")
	 private WebElement religmothertougue;
	 //===================================================================================Basic======================
	 @FindBy(xpath="(//*/*[@nodeName='ION-COL'])[195]")
	 private WebElement basicdrinkinghabit;
	 @FindBy(xpath="(//*/*[@nodeName='ION-COL'])[192]")
	 private WebElement basicsmokinghabit;
	 @FindBy(xpath="(//*/*[@nodeName='ION-COL'])[189]")
	 private WebElement basiceatinghabit;
	 public WebElement getBasicdrinkinghabit() {
		return basicdrinkinghabit;
	}

	public WebElement getBasicsmokinghabit() {
		return basicsmokinghabit;
	}

	public WebElement getBasiceatinghabit() {
		return basiceatinghabit;
	}

	public WebElement getBasicphysicalstatus() {
		return basicphysicalstatus;
	}

	public WebElement getBasicmartialstatus() {
		return basicmartialstatus;
	}

	public WebElement getBasicheight() {
		return basicheight;
	}

	public WebElement getBridesage() {
		return bridesage;
	}

	@FindBy(xpath="(//*/*[@nodeName='ION-COL'])[186]")
	 private WebElement basicphysicalstatus;
	 @FindBy(xpath="(//*/*[@nodeName='ION-COL'])[183]")
	 private WebElement basicmartialstatus;
	 @FindBy(xpath="(//*/*[@nodeName='ION-COL'])[180]")
	 private WebElement basicheight;
	 @FindBy(xpath="(//*/*[@nodeName='ION-COL'])[177]")
	 private WebElement bridesage;
	 //================================================= pp get details =============================================
	 @FindBy(xpath="//*[@text=' CLOSE']")
	 private WebElement close4;
	 public WebElement getClose4() {
		return close4;
	}

	public WebElement getPartnerpreff4() {
		return partnerpreff4;
	}

	public WebElement getSave4() {
		return save4;
	}

	public WebElement getCitizenany() {
		return citizenany;
	}

	public WebElement getCitizenship() {
		return citizenship;
	}

	public WebElement getChennai() {
		return chennai;
	}

	public WebElement getResidingstateany() {
		return residingstateany;
	}

	public WebElement getResidingcity() {
		return residingcity;
	}

	public WebElement getTamilnadu() {
		return tamilnadu;
	}

	public WebElement getResidingany() {
		return residingany;
	}

	public WebElement getResidingstate() {
		return residingstate;
	}

	public WebElement getIndia() {
		return india;
	}

	public WebElement getCountryany() {
		return countryany;
	}

	public WebElement getCountrylivingin() {
		return countrylivingin;
	}

	public WebElement getEdit4() {
		return edit4;
	}
	@FindBy(xpath="//*[@text='                Your Partner Preference details have been updated successfully.            ']")
	 private WebElement partnerpreff4;
	 @FindBy(xpath="//*[@nodeName='BUTTON']")
	 private WebElement save4;
	 @FindBy(xpath="//*[@class='label label-md' and @text='Any']")
	 private WebElement citizenany;
	 @FindBy(xpath="(//*/*/*/*/*/*[@nodeName='ION-LABEL' and ./parent::*[./parent::*[./parent::*[./parent::*[@nodeName='DIV']]]]])[3]")
	 private WebElement citizenship;
	 @FindBy(xpath="//*[@class='label label-md' and @text='Chennai']")
	 private WebElement chennai;
	 @FindBy(xpath="//*[@class='label label-md' and @text='Any']")
	 private WebElement residingstateany;
	 @FindBy(xpath="(//*/*/*/*/*/*[@nodeName='ION-LABEL' and ./parent::*[./parent::*[./parent::*[./parent::*[@nodeName='DIV']]]]])[2]")
	 private WebElement residingcity;
	 @FindBy(xpath="//*[@class='label label-md' and @text='Tamil Nadu']")
	 private WebElement tamilnadu;
	 @FindBy(xpath="//*[@class='label label-md' and @text='Any']")
	 private WebElement residingany;
	 @FindBy(xpath="(//*/*/*/*/*/*[@nodeName='ION-LABEL' and ./parent::*[./parent::*[./parent::*[./parent::*[@nodeName='DIV']]]]])[1]")
	 private WebElement residingstate;
	 @FindBy(xpath="//*[@class='label label-md' and @text='India']")
	 private WebElement india;
	 @FindBy(xpath="//*[@class='label label-md' and @text='Any']")
	 private WebElement countryany;
	 @FindBy(xpath="//*[@nodeName='ION-LABEL' and ./parent::*[./parent::*[./parent::*[./parent::*[@nodeName='ION-GRID']]]]]")
	 private WebElement countrylivingin; 
	 @FindBy(xpath="//*[@nodeName='ION-ICON' and ./parent::*[@text='                            ' and (./preceding-sibling::* | ./following-sibling::*)[@text='                ' and ./*[@text='Location Preference']]]]")
	 private WebElement edit4;
	 @FindBy(xpath="//*[@class='label label-md' and @text='Manager']")
	 private WebElement manager;
	 public WebElement getManager() {
		return manager;
	}

	public WebElement getOccupationany() {
		return occupationany;
	}
	@FindBy(xpath="//*[@class='label label-md' and @text='Any']")
	 private WebElement occupationany;
	 @FindBy(xpath="//*[@text=' CLOSE']")
	 private WebElement close3;
	 public WebElement getClose3() {
		return close3;
	}

	public WebElement getPartnerpreff3() {
		return partnerpreff3;
	}

	public WebElement getSave3() {
		return save3;
	}

	public WebElement getLakhs9() {
		return lakhs9;
	}

	public WebElement getLakhs2() {
		return lakhs2;
	}

	public WebElement getMba() {
		return mba;
	}

	public WebElement getBe() {
		return be;
	}

	public WebElement getEducationany() {
		return educationany;
	}

	public WebElement getAnuualincometo() {
		return anuualincometo;
	}

	public WebElement getAnuualincomefrom() {
		return anuualincomefrom;
	}

	public WebElement getOccupation() {
		return occupation;
	}

	public WebElement getEducation() {
		return education;
	}

	public WebElement getEdit3() {
		return edit3;
	}
	@FindBy(xpath="//*[@text='                Your Partner Preference details have been updated successfully.            ']")
	 private WebElement partnerpreff3;
	 @FindBy(xpath="//*[@nodeName='BUTTON']")
	 private WebElement save3;
	 @FindBy(xpath="//*[@text='   ' and ./*[@text='Rs.9 Lakh']]")
	 private WebElement lakhs9;
	 @FindBy(xpath="//*[@text='   ' and ./*[@text='Rs.2 Lakh']]")
	 private WebElement lakhs2;
	 @FindBy(xpath="//*[@class='label label-md' and @text='MBA']")
	 private WebElement mba;
	 @FindBy(xpath="//*[@class='label label-md' and @text='BE'] ")
	 private WebElement be;
	 @FindBy(xpath="//*[@class='label label-md' and @text='Any']")
	 private WebElement educationany;
	 @FindBy(xpath="//*[@nodeName='ION-LABEL' and ./parent::*[./parent::*[./parent::*[./parent::*[@nodeName='DIV']]]]]")
	 private WebElement anuualincometo;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[3]")
	 private WebElement anuualincomefrom;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[2]")
	 private WebElement occupation;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[1]")
	 private WebElement education;
	 @FindBy(xpath="//*[@nodeName='ION-ICON' and ./parent::*[@text='                            ' and (./preceding-sibling::* | ./following-sibling::*)[@text='                 ' and ./*[@text='Professional Preference']]]]")
	 private WebElement edit3;
	 @FindBy(xpath="//*[@text=' CLOSE']")
	 private WebElement close2;
	 public WebElement getClose2() {
		return close2;
	}

	public WebElement getPartnerperffupdate2() {
		return partnerperffupdate2;
	}

	public WebElement getSave2() {
		return save2;
	}
	@FindBy(xpath="//*[@text='                Your Partner Preference details have been updated successfully.            ']")
	 private WebElement partnerperffupdate2;
	 @FindBy(xpath="//*[@nodeName='BUTTON']")
	 private WebElement save2;
	 @FindBy(xpath="//*[@nodeName='DIV' and @width>0 and ./parent::*[@id='checkfliter[]'] and ./*[@nodeName='DIV']]")
	 private WebElement chevvaino;
	 public WebElement getChevvaino() {
		return chevvaino;
	}

	public WebElement getChevvaidosham() {
		return chevvaidosham;
	}
	@FindBy(xpath="(//*/*/*/*/*/*[@nodeName='ION-LABEL' and ./parent::*[./parent::*[./parent::*[./parent::*[@nodeName='DIV']]]]])[3]")
	 private WebElement chevvaidosham;
	 @FindBy(xpath="//*[@text='   ' and ./*[@text='Any']]")
	 private WebElement doshamany;
	 public WebElement getDoshamany() {
		return doshamany;
	}

	public WebElement getDosham() {
		return dosham;
	}
	@FindBy(xpath="(//*/*/*/*/*/*[@nodeName='ION-LABEL' and ./parent::*[./parent::*[./parent::*[./parent::*[@nodeName='DIV']]]]])[2]")
	 private WebElement dosham;
	 
	 @FindBy(xpath="//*[@class='label label-md' and @text='Any']")
	 private WebElement starany;
	 public WebElement getStarany() {
		return starany;
	}

	public WebElement getStar() {
		return star;
	}
	@FindBy(xpath="//*[@nodeName='ION-LABEL' and ./parent::*[./parent::*[./parent::*[./parent::*[@text='                		']]]] and ./*[@text='Any']]")
	 private WebElement star;
	 @FindBy(xpath="//*[@class='label label-md' and @text='Chettiar']")
	 private WebElement chettiar;
	 public WebElement getChettiar() {
		return chettiar;
	}

	public WebElement getCasteany() {
		return casteany;
	}

	public WebElement getCaste() {
		return caste;
	}
	@FindBy(xpath="//*[@class='label label-md' and @text='Any']")
	 private WebElement casteany;
	 @FindBy(xpath="//*[@nodeName='ION-LABEL' and ./*[@text='Any'] and ./parent::*[@text='                                            ']]")
	 private WebElement caste;
	 @FindBy(xpath="//*[@text='   ' and ./*[@text='Hindu']]")
	 private WebElement hindu;
	public WebElement getHindu() {
		return hindu;
	}
	@FindBy(xpath="//*[@class='label label-md' and @text='Tamil']")
	private WebElement tamil;
	 public WebElement getTamil() {
		return tamil;
	}

	public WebElement getMothertoungany() {
		return mothertoungany;
	}

	public WebElement getMothertongue() {
		return mothertongue;
	}

	public WebElement getReligion() {
		return religion;
	}

	public WebElement getEdit2() {
		return edit2;
	}
	@FindBy(xpath="//*[@class='label label-md' and @text='Any']")
	 private WebElement mothertoungany;
	 @FindBy(xpath="//*[@nodeName='ION-LABEL' and ./*[@text='Any'] and ./parent::*[@text='									']]")
	 private WebElement mothertongue;
	 @FindBy(xpath="//*[@nodeName='ION-LABEL' and ./*[@text='Hindu']]")
	 private WebElement religion;
	 @FindBy(xpath="//*[@nodeName='ION-ICON' and ./parent::*[@text='                            ' and (./preceding-sibling::* | ./following-sibling::*)[@text='                ' and ./*[@text='Religious Preference']]]]")
	 private WebElement edit2;
	 
	 @FindBy(xpath="//*[@nodeName='INPUT']")
	 private WebElement inputtext;
	 public WebElement getInputtext() {
		return inputtext;
	}
	@FindBy(xpath="//*[@text=' CLOSE']")
	 private WebElement close;
	 public WebElement getClose() {
		return close;
	}

	public WebElement getPartnerpefupdate() {
		return partnerpefupdate;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getNosmoking() {
		return nosmoking;
	}

	public WebElement getNodrinking() {
		return nodrinking;
	}

	public WebElement getAny() {
		return any;
	}

	public WebElement getNormal() {
		return normal;
	}

	public WebElement getFeet51() {
		return feet51;
	}

	public WebElement getFeet5() {
		return feet5;
	}

	public WebElement getNevermarried() {
		return nevermarried;
	}

	public WebElement getAge29() {
		return age29;
	}

	public WebElement getAge25() {
		return age25;
	}

	public WebElement getSmokinghabit() {
		return smokinghabit;
	}

	public WebElement getDrinkinghabit() {
		return drinkinghabit;
	}

	public WebElement getEatinghabits() {
		return eatinghabits;
	}

	public WebElement getPhysicalstatus() {
		return physicalstatus;
	}

	public WebElement getHeightto() {
		return heightto;
	}

	public WebElement getHeightfrom() {
		return heightfrom;
	}

	public WebElement getMartialstatus() {
		return martialstatus;
	}

	public WebElement getAgeto() {
		return ageto;
	}

	public WebElement getAgefrom() {
		return agefrom;
	}

	public WebElement getEdit1() {
		return edit1;
	}
	@FindBy(xpath="(//*[@text='                                            ' and @nodeName='ION-ROW']/*/*[@nodeName='ION-ICON' and ./parent::*[@text='                            ']])[2]")
	private WebElement tik;
	public WebElement getTik() {
		return tik;
	}
	@FindBy(xpath="//*[@text='                Your Partner Preference details have been updated successfully.            ']")
	 private WebElement partnerpefupdate;
	 @FindBy(xpath="//*[@nodeName='BUTTON']")
	 private WebElement save;
	 @FindBy(xpath="//*[@nodeName='DIV' and @width>0 and (./preceding-sibling::* | ./following-sibling::*)[@id='checkbox-167-0'] and ./parent::*[@id='checkfliter[]'] and ./*[@nodeName='DIV']]")
	 private WebElement nosmoking;
	 @FindBy(xpath="//*[@nodeName='DIV' and @width>0 and (./preceding-sibling::* | ./following-sibling::*)[@id='checkbox-163-0'] and ./parent::*[@id='checkfliter[]'] and ./*[@nodeName='DIV']]")
	 private WebElement nodrinking;
	 @FindBy(xpath="//*[@nodeName='DIV' and @width>0 and (./preceding-sibling::* | ./following-sibling::*)[@id='checkbox-158-0'] and ./parent::*[@id='checkfliter[]'] and ./*[@nodeName='DIV']]")
	 private WebElement any;
	 @FindBy(xpath="//*[@text='   ' and ./*[@text='Normal']]")
	 private WebElement normal;
	 @FindBy(xpath="//*[@text='   ' and ./*[@text='5ft 11in']]")
	 private WebElement feet51;
	 @FindBy(xpath="//*[@text='   ' and ./*[@text='5ft']]")
	 private WebElement feet5;
	 @FindBy(xpath="//*[@id='lbl-147' and @nodeName='ION-LABEL']")
	 private WebElement nevermarried;
	 @FindBy(xpath="//*[@text='   ' and ./*[@text='29']]")
	 private WebElement age29;
	 @FindBy(xpath="//*[@text='   ' and ./*[@text='25']]")
	 private WebElement age25;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[9]")
	 private WebElement smokinghabit;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[8]")
	 private WebElement drinkinghabit;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[7]")
	 private WebElement eatinghabits;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[6]")
	 private WebElement physicalstatus;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[5]")
	 private WebElement heightto;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[4]")
	 private WebElement heightfrom;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[3]")
	 private WebElement martialstatus;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[2]")
	 private WebElement ageto;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[1]")
	 private WebElement agefrom;
	 @FindBy(xpath="//*[@nodeName='ION-ICON' and ./parent::*[@text='                            ' and (./preceding-sibling::* | ./following-sibling::*)[@text='                ' and ./*[@text='Basic Preference']]]]")
	 private WebElement edit1;
	 @FindBy(xpath="//*[@text='Edit Profile' and @nodeName='SPAN']")
	 private WebElement editprofile;
	 public WebElement getEditprofile() {
		return editprofile;
	}
	@FindBy(xpath="//*[@class='font-25 hamburger-menu icon icon-md']")
	 private WebElement menu;
	public WebElement getMenu() {
		return menu;
	}
	@FindBy(xpath="//*[@class='font-clrwhite paddr15 fright']")
	 private WebElement skip;
	 public WebElement getSkip() {
		return skip;
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
		@FindBy(xpath="//*[@text='LOGIN' and @nodeName='A']")
		 private WebElement loginbutton;
		public WebElement getLoginbutton() {
			return loginbutton;
		}
		public void setLoginbutton(WebElement loginbutton) {
			this.loginbutton = loginbutton;
		}

}