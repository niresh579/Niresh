package cucu.HoroScopeMatches;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoroscopePOM extends Base{
	public HoroscopePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);

}
	//login
	@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-grid/ion-row[2]/ion-col/ion-item/div[1]/div/ion-input/input")
	 private WebElement username;
	@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-grid/ion-row[3]/ion-col/ion-item/div[1]/div/ion-input/input")
    private WebElement password;
	@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-grid/ion-row[4]/ion-col")
    private WebElement login;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	
	//menu
	@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-matches/ion-footer/div/header/div/ion-navbar/div[2]/ion-row/ion-col[5]/span")
	private WebElement menu;
	public WebElement getMenu() {
		return menu;
	}
	
	//horoscope matches click
	@FindBy(xpath="//*[@id='rightmenu']/ion-row[5]/ion-col")
	private WebElement clickhoroscope;
	public WebElement getClickhoroscope() {
		return clickhoroscope;
	}
	
	//generate horoscope
	@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-matches[2]/ion-content/div[2]/div/div/ion-row/ion-col[2]/ion-col[3]/button")
	private WebElement generatehoroscope;
	public WebElement getGeneratehoroscope() {
		return generatehoroscope;
	}
	
	//dob
	@FindBy(xpath="//*[@id='undefined']/span")
	private WebElement btnclickdob;
	public WebElement getBtnclickdob() {
		return btnclickdob;
	}
	
	@FindBy(xpath="/html/body/ion-app/ion-picker-cmp/div/div[1]/div[2]/button/span")
	private WebElement btndonedob;
	public WebElement getBtndonedob() {
		return btndonedob;
	}
	
	//time of birth
	@FindBy(xpath="(//*[@id='undefined']/span)[2]")
	private WebElement btntimeofbirth;
	public WebElement getBtntimeofbirth() {
		return btntimeofbirth;
	}
	
	//country of birth
	@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-generatehoro/ion-content/div[2]/ion-grid/ion-row[4]/ion-col[3]/div")
	private WebElement countryofbirth;
	public WebElement getCountryofbirth() {
		return countryofbirth;
	}
	//state of birth
    @FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-generatehoro/ion-content/div[2]/ion-grid/ion-row[5]/ion-col[3]/div")
	private WebElement stateofbirth;
	public WebElement getStateofbirth() {
		return stateofbirth;
	}
	//city of birth	
		 @FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-generatehoro/ion-content/div[2]/ion-grid/ion-row[6]/ion-col[3]/div")
			private WebElement cityofbirth;
		 public WebElement getCityofbirth() {
				return cityofbirth;
			}

	
	//chart style
	 @FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-generatehoro/ion-content/div[2]/ion-grid/ion-row[7]/ion-col[3]/div")
		private WebElement chartstyle;
	public WebElement getChartstyle() {
		return chartstyle;
	}
	//language
	@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-generatehoro/ion-content/div[2]/ion-grid/ion-row[8]/ion-col[3]/div")
	private WebElement language;
	public WebElement getLanguage() {
		return language;
	}
	
	//horoscope generate
	@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-generatehoro/ion-content/div[2]/ion-grid/ion-row[10]/ion-col/button/span/span")
	private WebElement horoscopegenerate;
	public WebElement getHoroscopegenerate() {
		return horoscopegenerate;
	}
	
	//shortlist and send interest
	
	@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-matches[2]/ion-content/div[2]/ion-list/ion-row/ion-grid[3]/div[1]/ion-row[2]/ion-col[1]/button")
	private WebElement shortlist;
	public WebElement getShortlist() {
		return shortlist;
	}
	
	@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-generatehoro/ion-content/div[2]/ion-grid/ion-row[10]/ion-col/button/span/span")
	private WebElement sendinterest;
	public WebElement getSendinterest() {
		return sendinterest;
	}
	
	
	
}