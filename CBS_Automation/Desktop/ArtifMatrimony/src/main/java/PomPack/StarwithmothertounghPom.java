package PomPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basepacknew.Base3;



public class StarwithmothertounghPom extends Base3 {
	public StarwithmothertounghPom(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
	
	}

	@FindBy(xpath="/html/body/div[1]/div[2]/div/form/div[1]/input")
	private WebElement Username;
	@FindBy(xpath="//input[@id='passwordClear1']")
	private WebElement password;
	@FindBy(xpath="//input[@id='password1']")
	private WebElement password1;
	@FindBy(xpath="/html/body/div[1]/div[2]/div/form/div[2]/input[3]")
	private WebElement login1;
	
	@FindBy(xpath="//*[@id=\\\"special_offer_lightpic1\\\"]/div[1]/div/a/img")
	private WebElement Popup;
	@FindBy(xpath="/html/body/div[1]/div[2]/a")
	private WebElement skip;
	@FindBy(xpath="//*[@id=\\\"lp-container\\\"]/div[4]/a/div/div/span/span")
	private WebElement Topplacement;
	@FindBy(xpath="//*[@id='phPopup']/div/div/div[1]/a")
	private WebElement skip2;
	@FindBy(xpath="//*[@id='vpc_CardNum_C']")
	private WebElement CC;
	@FindBy(xpath="//*[@id='vpc_CardSecurityCode']")
	private WebElement cvv;
	@FindBy(xpath="//*[@id='crditCardRiSubButL']")
	private WebElement Transfailed;
	@FindBy(xpath="//*[@id='TopListingPopup']/div/div/div[1]/a")
	private WebElement Skip3;
	@FindBy(xpath="//*[@id='specialOffer120']")
	private WebElement Profilehighclick;
	@FindBy(xpath="//*[@id='specialOffer125']")
	private WebElement topplacementclick;
	
	@FindBy(xpath="//*[@id='try-again-button']")
	private WebElement Tryagain;
	@FindBy(xpath="//*[@id='topnav-login-menu']/div[3]/div[2]/div[1]/span")
	private WebElement profileclick;
	@FindBy(xpath="//*[@id='topnav-login-menu']/div[2]/div[4]/a")
	private WebElement Searchclick;
	@FindBy(xpath="//*[@id='RSearchForm']/div[2]/div[1]/a[2]")
	private WebElement Advancesearch;
	
	public WebElement getAdvancesearch() {
		return Advancesearch;
	}

	public WebElement getSearchclick() {
		return Searchclick;
	}

	public WebElement getProfileclick() {
		return profileclick;
	}

	@FindBy(xpath="//*[@id='n2']")
	private WebElement personalclick;
	@FindBy(xpath="//*[@id='userpop']/div[2]/div/div[1]/a/span[2]")
	private WebElement editclick;
	
	public WebElement getEditclick() {
		return editclick;
	}

	public WebElement getPersonalclick() {
		return personalclick;
	}

	public WebElement getTryagain() {
		return Tryagain;
	}

	public WebElement getTopplacementclick() {
		return topplacementclick;
	}

	public WebElement getAstromatchclick() {
		return astromatchclick;
	}

	public void setAstromatchclick(WebElement astromatchclick) {
		this.astromatchclick = astromatchclick;
	}

	@FindBy(xpath="//*[@id='specialOffer111']")
	private WebElement astromatchclick;
	
	
	
	@FindBy(xpath="//*[@id='astroMatchPopup110']/div/div/div[1]/a")
	private WebElement Skip4;
	
	
	
	public WebElement getSkip4() {
		return Skip4;
	}

	public WebElement getProfilehighclick() {
		return Profilehighclick;
	}

	public WebElement getSkip3() {
		return Skip3;
	}

	public WebElement getTransfailed() {
		return Transfailed;
	}

	public WebElement getSkip2() {
		return skip2;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getCC() {
		return CC;
	}

	public WebElement getTopplacement() {
		return Topplacement;
	}

	public WebElement getSkip() {
		return skip;
	}

	public WebElement getPopup() {
		return Popup;
	}

	public WebElement getLogin1() {
		return login1;
	}

	public WebElement getPassword1() {
		return password1;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getUsername() {
		return Username;
	}
	
	
	}

	

