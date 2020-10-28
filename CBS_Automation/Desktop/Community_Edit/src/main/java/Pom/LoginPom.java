package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.Base;

public class LoginPom extends Base{
	
	public LoginPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/form/div[1]/input")
	private WebElement matri_id;
	
	@FindBy(xpath="//*[@id='passwordClear1']")
	private WebElement passwordclear;
	
	@FindBy(xpath="//*[@id='password1']")
	private WebElement password;
	
	public WebElement getPasswordclear() {
		return passwordclear;
	}

	@FindBy(xpath="/html/body/div[1]/div[2]/div/form/div[2]/input[3]")
	private WebElement login_button;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/a")
	private WebElement intermediate_horoscope;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/a")
	private WebElement intermediate_dailymatch;
	
	@FindBy(xpath="//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")
	private WebElement homepage_ads_alert;
	
	@FindBy(xpath="//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a")
	private WebElement editt_PP_mouse;
	
	@FindBy(xpath="//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[2]/a")
	private WebElement edit_partnerP;
	
	@FindBy(xpath="//*[@id=\"strictflag\"]/div[2]/div[1]/span[1]")
	private WebElement marital_status;
	
	@FindBy(xpath="//*[@id=\"strictflag\"]/div[2]/div[1]/span[2]")
	private WebElement marital_status_value;

	public WebElement getMarital_status_value() {
		return marital_status_value;
	}

	public WebElement getMarital_status() {
		return marital_status;
	}

	public WebElement getMatri_id() {
		return matri_id;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_button() {
		return login_button;
	}

	public WebElement getIntermediate_horoscope() {
		return intermediate_horoscope;
	}

	public WebElement getIntermediate_dailymatch() {
		return intermediate_dailymatch;
	}

	public WebElement getHomepage_ads_alert() {
		return homepage_ads_alert;
	}

	public WebElement getEditt_PP_mouse() {
		return editt_PP_mouse;
	}

	public WebElement getEdit_partnerP() {
		return edit_partnerP;
	}
	

}
