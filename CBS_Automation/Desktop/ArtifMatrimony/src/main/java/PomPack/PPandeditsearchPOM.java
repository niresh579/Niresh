package PomPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Basepacknew.Base3;

public class PPandeditsearchPOM extends Base3 {
	public PPandeditsearchPOM(WebDriver driver) {
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
	@FindBy(xpath="(//span[@class='nextactive'])[2]")
	private WebElement clicknext;
	@FindBy(xpath="//*[@id='topnav-login-menu']/div[3]/div[2]/div[1]/span")
	private WebElement profileclick;
	@FindBy(xpath="//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[2]/a")
	private WebElement profileclick1;
	
	public WebElement getProfileclick1() {
		return profileclick1;
	}

	public WebElement getProfileclick() {
		return profileclick;
	}

	public WebElement getClicknext() {
		return clicknext;
	}

	@FindBy(xpath="//*[@id=\"myhomepop\"]/div[2]/div/div[2]/ul/li[1]/a")
	private WebElement Whoviewclick;
	
	public WebElement getWhoviewclick() {
		return Whoviewclick;
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

	
	

	

	public WebElement getSkip2() {
		return skip2;
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

	

