package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Gothra_Pom {
	public Gothra_Pom(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@id='ln_editProfile_partner']")
	private WebElement epp;
	
	public WebElement getEditPP() {
		return epp;
	}
	
	
	@FindBy(xpath="//*[@id='partnerreligious_edit']")
	private WebElement partnerReligious_Edit;
	
	public WebElement getPartnerReligious_Edit() {
		return partnerReligious_Edit;
	}
	
	@FindBy(xpath="//*[@id='edit_txt_partner_gothram_value']")
	private WebElement partnerGothra_Edit;
	
	public WebElement getPartnerGothra_Edit() {
		return partnerGothra_Edit;
	}
	
	@FindBy(xpath="//*[@text='All Except My Gothra(m)' and @top='true']")
	private WebElement partnerGothra_AllExcept;
	public WebElement getPGothra_AllExceptMy() {
		return partnerGothra_AllExcept;
	}
	
	@FindBy(xpath="//*[@text='Submit']")
	private WebElement partnerGothra_Submit;
	public WebElement getPartnerGothra_Submit() {
		return partnerGothra_Submit;
	}
	
	@FindBy(xpath="//*[@text='Save']")
	private WebElement partnerGothra_Save;
	public WebElement getPartnerGothra_Save() {
		return partnerGothra_Save;
	}
	
	@FindBy(xpath="//*[@text='Save']")
	private WebElement ppGothram;
	public WebElement getPP_Gothram() {
		return ppGothram;
	}
	
	@FindBy(xpath="//*[@id='ln_editProfile']")
	private WebElement editProfile;
	public WebElement getEditProfile() {
		return editProfile;
	}
	
	@FindBy(xpath="//*[@id='religiousdetails_edit']")
	private WebElement religiousEdit_PI;
	public WebElement getReligiousEdit_PI() {
		return religiousEdit_PI;
	}
	
	@FindBy(xpath="//*[@id='edit_txt_gothram_value']")
	private WebElement gothram_PI;
	public WebElement getGothram_PI() {
		return gothram_PI;
	}
	
	@FindBy(xpath="//*[text()='Search']")
	private WebElement search;
	public WebElement getSearch() {
		return search;
	}
	
	@FindBy(xpath="//*[@id='search_now_imageView']")
	private WebElement searchNow;
	public WebElement getSearchNow() {
		return searchNow;
	}
	
	@FindBy(xpath="(//*[@text='Gothra']/following-sibling::*)[2]")
	private WebElement gotham_vp;
	public WebElement getGotham_vp() {
		return gotham_vp;
	}
	@FindBy(xpath="//*[@id='nextprofile']")
	private WebElement nextProfile_btn;
	public WebElement getNextProfile_btn() {
		return nextProfile_btn;
	}
	@FindBy(xpath="//*[@id='imgHoro']")
	private WebElement horoscopeIcon_vp;
	public WebElement getHoroscopeIcon_vp() {
		return horoscopeIcon_vp;
	}
	@FindBy(xpath="//*[@id='reg_search_editText']")
	private WebElement gothramSearch_PI;
	public WebElement getGothramSearch_PI() {
		return gothramSearch_PI;
	}
	
	@FindBy(xpath="//*[@text='JUST JOINED']")
	private WebElement justJoined;
	public WebElement getJustJoined() {
		return justJoined;
	}
	@FindBy(xpath="//*[@text='Home']")
	private WebElement homeIcon;
	public WebElement getHomeIcon() {
		return homeIcon;
	}
	@FindBy(xpath="//*[@id='count']")
	private WebElement profileListCount;
	public WebElement getProfileListCount() {
		return profileListCount;
	}
	@FindBy(xpath="//*[@id='profilematriid']")
	private WebElement matriId_VP;
	public WebElement getMatriId_VP() {
		return matriId_VP;
	}
	@FindBy(xpath="//*[@text='All Except My Gothra(m)']")
	private WebElement gothra_Value1;
	public WebElement getGothra_Value1() {
		return gothra_Value1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
