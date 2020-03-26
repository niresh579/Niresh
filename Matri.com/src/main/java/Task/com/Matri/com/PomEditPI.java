package Task.com.Matri.com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;



public class PomEditPI extends Base {
	 public PomEditPI(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
	 @FindBy(xpath="//*[@nodeName='INPUT']")
	 private WebElement inputcitizen;
	 @FindBy(xpath="//*[@text=' CLOSE']")
	 private WebElement familyclose;
	 public WebElement getInputcitizen() {
		return inputcitizen;
	}

	public WebElement getFamilyclose() {
		return familyclose;
	}

	public WebElement getFamilydetailsupdate() {
		return familydetailsupdate;
	}

	public WebElement getSave4() {
		return save4;
	}

	public WebElement getOnesisy() {
		return onesisy;
	}

	public WebElement getOnesis() {
		return onesis;
	}

	public WebElement getNone() {
		return none;
	}

	public WebElement getOne() {
		return one;
	}

	public WebElement getRich() {
		return rich;
	}

	public WebElement getNuclear() {
		return nuclear;
	}

	public WebElement getModerate() {
		return moderate;
	}

	public WebElement getAncestralorigin() {
		return ancestralorigin;
	}

	public WebElement getSistermarried() {
		return sistermarried;
	}

	public WebElement getNoofsister() {
		return noofsister;
	}

	public WebElement getBrothermarried() {
		return brothermarried;
	}

	public WebElement getNoofbrothers() {
		return noofbrothers;
	}

	public WebElement getMotherstatus() {
		return motherstatus;
	}

	public WebElement getFathersstatus() {
		return fathersstatus;
	}

	public WebElement getFamilystatus() {
		return familystatus;
	}

	public WebElement getFamilytype() {
		return familytype;
	}

	public WebElement getFamilyvalue() {
		return familyvalue;
	}

	public WebElement getEdit5() {
		return edit5;
	}
	@FindBy(xpath="//*[@text='                Your family details have been updated successfully.            ']")
	 private WebElement familydetailsupdate;
	 @FindBy(xpath="//*[@nodeName='BUTTON']")
	 private WebElement save4;
	 @FindBy(xpath="//*[@text='   ' and @nodeName='ION-LABEL' and ./*[@text='1']]")
	 private WebElement onesisy;
	 @FindBy(xpath="//*[@text='   ' and @nodeName='ION-LABEL' and ./*[@text='1']]")
	 private WebElement onesis;
	 @FindBy(xpath="//*[@text='   ' and @nodeName='ION-LABEL' and ./*[@text='None']]")
	 private WebElement none;
	 @FindBy(xpath="//*[@text='   ' and @nodeName='ION-LABEL' and ./*[@text='1']]")
	 private WebElement one;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL' and ./parent::*[./parent::*[@nodeName='DIV']]])[3]")
	 private WebElement rich;
	 @FindBy(xpath="//*[@text='   ' and @nodeName='ION-LABEL' and ./*[@text='Nuclear']]")
	 private WebElement nuclear;
	 @FindBy(xpath="//*[@text='   ' and @nodeName='ION-LABEL' and ./*[@text='Moderate']]")
	 private WebElement moderate;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='INPUT'])[3]")
	 private WebElement ancestralorigin;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[7]")
	 private WebElement sistermarried;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[6]")
	 private WebElement noofsister;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[5]")
	 private WebElement brothermarried;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[4]")
	 private WebElement noofbrothers;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='INPUT'])[2]")
	 private WebElement motherstatus;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='INPUT'])[1]")
	 private WebElement fathersstatus;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[3]")
	 private WebElement familystatus;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[2]")
	 private WebElement familytype;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[1]")
	 private WebElement familyvalue;
	 @FindBy(xpath="//*[@nodeName='ION-ICON' and ./parent::*[@text='                            ' and (./preceding-sibling::* | ./following-sibling::*)[@text='                ' and ./*[@text='Family Details']]]]")
	 private WebElement edit5;
	 @FindBy(xpath="//*[@text=' CLOSE']")
	 private WebElement locationclose;
	 public WebElement getLocationclose() {
		return locationclose;
	}

	public WebElement getLocationdetailupdate() {
		return locationdetailupdate;
	}

	public WebElement getSave3() {
		return save3;
	}

	public WebElement getIndain() {
		return indain;
	}

	public WebElement getHyderbad() {
		return hyderbad;
	}

	public WebElement getAndhra() {
		return andhra;
	}

	public WebElement getIndia() {
		return india;
	}

	public WebElement getCitizenship() {
		return citizenship;
	}

	public WebElement getResidingcity() {
		return residingcity;
	}

	public WebElement getResidingstate() {
		return residingstate;
	}

	public WebElement getCountrylingingin() {
		return countrylingingin;
	}

	public WebElement getEdit4() {
		return edit4;
	}
	@FindBy(xpath="//*[@text='                Your Location information has been updated successfully.            ']")
	 private WebElement locationdetailupdate;
	 @FindBy(xpath="//*[@nodeName='BUTTON']")
	 private WebElement save3;
	 @FindBy(xpath="//*[@text='   ' and ./*[@text='India']]")
	 private WebElement indain;
	 @FindBy(xpath="//*[@text='   ' and @nodeName='ION-LABEL' and ./*[@text='Hyderabad']]")
	 private WebElement hyderbad;
	 @FindBy(xpath="//*[@text='Andhra Pradesh' and @nodeName='SPAN']")
	 private WebElement andhra;
	 @FindBy(xpath="//*[@text='India' and @nodeName='ION-LABEL']")
	 private WebElement india;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[4]")
	 private WebElement citizenship;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[3]")
	 private WebElement residingcity;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[2]")
	 private WebElement residingstate;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[1]")
	 private WebElement countrylingingin;
	 @FindBy(xpath="(//*/*/*[@nodeName='ION-ICON' and ./parent::*[@nodeName='ION-COL']])[10]")
	 private WebElement edit4;
	 @FindBy(xpath="//*[@text=' CLOSE']")
	 private WebElement professionalclose;
	 public WebElement getProfessionalclose() {
		return professionalclose;
	}

	public WebElement getProfessionaldetailsupdate() {
		return professionaldetailsupdate;
	}

	public WebElement getSave2() {
		return save2;
	}

	public WebElement getLakhs() {
		return lakhs;
	}

	public WebElement getAnnualincome() {
		return annualincome;
	}

	public WebElement getPrivatecompany() {
		return privatecompany;
	}

	public WebElement getEmployedin() {
		return employedin;
	}

	public WebElement getOccupationdetail() {
		return occupationdetail;
	}

	public WebElement getManager() {
		return manager;
	}

	public WebElement getOccupation() {
		return occupation;
	}

	public WebElement getEducationdetail() {
		return educationdetail;
	}

	public WebElement getCollege() {
		return college;
	}

	public WebElement getBe() {
		return be;
	}

	public WebElement getHighereducation() {
		return highereducation;
	}

	public WebElement getEdit3() {
		return edit3;
	}
	@FindBy(xpath="//*[@text='                Your Professional Information has been updated successfully.            ']")
	 private WebElement professionaldetailsupdate;
	 @FindBy(xpath="//*[@nodeName='BUTTON']")
	 private WebElement save2;
	 @FindBy(xpath="//*[@text='   ' and ./*[@text='12 - 14 Lakhs']]")
	 private WebElement lakhs;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[5]")
	 private WebElement annualincome;
	 @FindBy(xpath="//*[@text='   ' and ./*[@text='Private']]")
	 private WebElement privatecompany;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[3]")
	 private WebElement employedin;
	 @FindBy(xpath="(//*[@text='                                                                                                        								    ']/*/*/*/*[@nodeName='INPUT'])[3]")
	 private WebElement occupationdetail;
	 @FindBy(xpath="//*[@text='Manager' and @nodeName='ION-LABEL']")
	 private WebElement manager;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[2]")
	 private WebElement occupation;
	 @FindBy(xpath="(//*[@text='                                                                                                        								    ']/*/*/*/*[@nodeName='INPUT'])[2]")
	 private WebElement educationdetail;
	 @FindBy(xpath="(//*[@text='                                                                                                        								    ']/*/*/*/*[@nodeName='INPUT'])[1]")
	 private WebElement college;
	 @FindBy(xpath="//*[@text='BE' and @nodeName='ION-LABEL']")
	 private WebElement be;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[1]")
	 private WebElement highereducation;
	 @FindBy(xpath="//*[@nodeName='ION-ICON' and ./parent::*[@text='                            ' and (./preceding-sibling::* | ./following-sibling::*)[@text='                 ' and ./*[@text='Professional Information']]]]")
	 private WebElement edit3;
	 @FindBy(xpath="//*[@text=' CLOSE']")
	 private WebElement religiousclose;
	 public WebElement getReligiousclose() {
		return religiousclose;
	}

	public WebElement getReligiousdetailsupdate() {
		return religiousdetailsupdate;
	}

	public WebElement getSave1() {
		return save1;
	}

	public WebElement getDontkown() {
		return dontkown;
	}

	public WebElement getHavingdosh() {
		return havingdosh;
	}

	public WebElement getLeo() {
		return leo;
	}

	public WebElement getZodiac() {
		return zodiac;
	}

	public WebElement getMesham() {
		return mesham;
	}

	public WebElement getRaasi() {
		return raasi;
	}

	public WebElement getVishakam() {
		return vishakam;
	}

	public WebElement getStar() {
		return star;
	}

	public WebElement getEdit2() {
		return edit2;
	}
	@FindBy(xpath="//*[@text='                Your Religious Information has been updated successfully.            ']")
	 private WebElement religiousdetailsupdate;
	 @FindBy(xpath="//*[@nodeName='BUTTON' and ./parent::*[@nodeName='ION-COL']]")
	 private WebElement save1;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL' and ./*[@text] and ./parent::*[./parent::*[@nodeName='DIV']]])[3]")
	 private WebElement dontkown;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL' and ./*[@text]])[5]")
	 private WebElement havingdosh;
	 @FindBy(xpath="//*[@text='   ' and ./*[@text='Leo']]")
	 private WebElement leo;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL' and ./*[@text]])[4]")
	 private WebElement zodiac;
	 @FindBy(xpath="//*[@text='   ' and ./*[@text='Tula (Libra)']]")
	 private WebElement mesham;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL' and ./*[@text]])[3]")
	 private WebElement raasi;
	 @FindBy(xpath="//*[@text='   ' and ./*[@text='Vishaka / Vishakam']]")
     private WebElement vishakam;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL' and ./*[@text]])[2]")
     private WebElement star;
	 @FindBy(xpath="//*[@nodeName='ION-ICON' and ./parent::*[@text='                            ' and (./preceding-sibling::* | ./following-sibling::*)[@text='                 ' and ./*[@text='Religious Information']]]]")
     private WebElement edit2;
	 @FindBy(xpath="//*[@text=' CLOSE']")
	 private WebElement Basicclose;
	 public WebElement getBasicclose() {
		return Basicclose;
	}

	public WebElement getBasicdetailupdate() {
		return basicdetailupdate;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getNosmoking() {
		return nosmoking;
	}

	public WebElement getSmokinghabits() {
		return smokinghabits;
	}

	public WebElement getNodrinking() {
		return nodrinking;
	}

	public WebElement getDrinkinghabit() {
		return drinkinghabit;
	}

	public WebElement getNonveg() {
		return nonveg;
	}

	public WebElement getEatinghabits() {
		return eatinghabits;
	}

	public WebElement getTelegu() {
		return telegu;
	}

	public WebElement getMothertongue() {
		return mothertongue;
	}

	public WebElement getNormal() {
		return normal;
	}

	public WebElement getPhysicalstatus() {
		return physicalstatus;
	}

	public WebElement getFair() {
		return fair;
	}

	public WebElement getComplexion() {
		return complexion;
	}

	public WebElement getSlim() {
		return slim;
	}

	public WebElement getBodytype() {
		return bodytype;
	}

	public WebElement getNevermarried() {
		return nevermarried;
	}

	public WebElement getMarriagestauts() {
		return marriagestauts;
	}

	public WebElement getKg() {
		return kg;
	}

	public WebElement getWeight() {
		return weight;
	}

	public WebElement getFeet() {
		return feet;
	}

	public WebElement getHeight() {
		return height;
	}
	@FindBy(xpath="//*[@text='                Your Basic Details have been updated successfully.            ']")
	 private WebElement basicdetailupdate;
	 @FindBy(xpath="//*[@nodeName='BUTTON']")
	 private WebElement save;
	 @FindBy(xpath="//*[@text='   ' and ./*[@text='No']]")
	 private WebElement nosmoking;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[10]")
	 private WebElement smokinghabits;
	 @FindBy(xpath="//*[@text='   ' and ./*[@text='No']]")
	 private WebElement nodrinking;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[9]")
	 private WebElement drinkinghabit;
	 @FindBy(xpath="//*[@text='   ' and ./*[@text='Non-Vegetarian']]")
	 private WebElement nonveg;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[8]")
	 private WebElement eatinghabits;
	 @FindBy(xpath="//*[@text='Telugu' and @nodeName='ION-LABEL']")
	 private WebElement telegu;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[8]")
	 private WebElement mothertongue;
	 @FindBy(xpath="//*[@text='   ' and ./*[@text='Normal']]")
	 private WebElement normal;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[7]")
	 private WebElement physicalstatus;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL' and ./parent::*[./parent::*[@nodeName='DIV']]])[2]")
	 private WebElement fair;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[6]")
	 private WebElement complexion;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL' and ./parent::*[./parent::*[@nodeName='DIV']]])[3]")
	 private WebElement slim;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[5]")
	 private WebElement bodytype;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL' and ./parent::*[./parent::*[@nodeName='DIV']]])[1]")
	 private WebElement nevermarried;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[4]")
	 private WebElement marriagestauts;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL' and ./parent::*[./parent::*[@nodeName='DIV']]])[13]")
	 private WebElement kg;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[3]")
	 private WebElement weight;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL' and ./parent::*[./parent::*[@nodeName='DIV']]])[14]")
	 private WebElement feet;
	 @FindBy(xpath="(//*/*/*/*/*[@nodeName='ION-LABEL'])[2]")
	 private WebElement height;
	 
	 @FindBy(xpath="//*[@nodeName='ION-ICON' and ./parent::*[@text='                            ' and (./preceding-sibling::* | ./following-sibling::*)[@text='                 ' and ./*[@text='Basic details']]]]")
	 private WebElement edit1;
	 public WebElement getEdit1() {
		return edit1;
	}
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


