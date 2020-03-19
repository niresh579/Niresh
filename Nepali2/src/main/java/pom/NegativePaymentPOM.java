package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NegativePaymentPOM {
	public NegativePaymentPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='idEmail']")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='password1']")
	private WebElement password;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement login;
	
	@FindBy(xpath="/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")
	private WebElement menu;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getMenu() {
		return menu;
	}
	
	@FindBy(xpath="//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[6]/ion-item/div[1]/div/ion-label/span")
	private WebElement upgradenow;

	public WebElement getUpgradenow() {
		return upgradenow;
	}
	
	
	@FindBy(xpath="//*[@id='pakd']/h3/a/span/span[2]")
	private WebElement editpackages;

	public WebElement getEditpackages() {
		return editpackages;
	}
	
	@FindBy(xpath="//div[contains(text(),'Diamond Pack  (6 Months)')]")
	private WebElement sixmonthdiamond;

	public WebElement getSixmonthdiamond() {
		return sixmonthdiamond;
	}
	

	@FindBy(xpath="//div[contains(text(),'Gold Pack  (3 Months)')]")
	private WebElement threemonthgold;
	
	@FindBy(xpath="//div[contains(text(),'Gold Pack  (6 Months)')]")
	private WebElement sixmonthgold;

	public WebElement getThreemonthgold() {
		return threemonthgold;
	}

	public WebElement getSixmonthgold() {
		return sixmonthgold;
	}
	
	@FindBy(xpath="//*[@id='goldtab']")
	private WebElement goldtab;

	public WebElement getGoldtab() {
		return goldtab;
	}
	
	@FindBy(xpath="//*[@id='platinumtab']")
	private WebElement platiniumtab;

	public WebElement getPlatiniumtab() {
		return platiniumtab;
	}
	
	@FindBy(xpath="//div[contains(text(),'Platinum Pack  (6 Months)')]")
	private WebElement sixmonthplatinum;

	public WebElement getSixmonthplatinum() {
		return sixmonthplatinum;
	}
	
	@FindBy(xpath="//div[contains(text(),'Till-U-Marry Pack  (1 Year)')]")
	private WebElement tiilumarry;

	public WebElement getTiilumarry() {
		return tiilumarry;
	}
   
	@FindBy(xpath="//div[@id='assistedtab']")
	private WebElement assisted;

	public WebElement getAssisted() {
		return assisted;
	}
    
	@FindBy(xpath="//div[contains(text(),'Assisted Service Pack  (6 Months)')]")
	private WebElement sixmonthassisted;
	@FindBy(xpath="//div[contains(text(),'Assisted Service Pack  (1 Year)')]")
	private WebElement oneyearassisted;

	public WebElement getSixmonthassisted() {
		return sixmonthassisted;
	}

	public WebElement getOneyearassisted() {
		return oneyearassisted;
	}

	@FindBy(css="body > div > div.gmg_chat_head > div")
    private WebElement hide_chat;
    public WebElement getHide_chat() {
        return hide_chat;
    }

	
	
	
	
	
}
