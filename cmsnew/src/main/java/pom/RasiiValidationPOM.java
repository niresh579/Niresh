package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RasiiValidationPOM {
	public RasiiValidationPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}



	@FindBy(xpath="//*[@id='idEmail']")
	private WebElement username;
	
	@FindBy(xpath="//*[@id='password1']")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='login-button']")
	private WebElement login;

	@FindBy(xpath="//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[4]")
	private WebElement editprofile;
	
	@FindBy(xpath="//*[@id='linktobasic_details']/div[1]/div[2]")
    private WebElement Basicdetails;

	public WebElement getEditprofile() {
		return editprofile;
	}



	public WebElement getBasicdetails() {
		return Basicdetails;
	}	
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[9]/div[2]")
	private WebElement mothertongue;
	
	@FindBy(xpath="//*[@id='RegPanelSearchvalue']")
	private WebElement search;

	public WebElement getMothertongue() {
		return mothertongue;
	}



	public WebElement getSearch() {
		return search;
	}
	
	
	public WebElement getDeleteicon() {
		return deleteicon;
	}



	public WebElement getBackhistory() {
		return backhistory;
	}



	public WebElement getSave() {
		return save;
	}



	@FindBy(xpath="//*[@id='edit-prof_footer']/div[2]")
	private WebElement save;

	@FindBy(xpath="//*[@id='wap-edit-profile']/div[3]/div[3]/div[1]/div[2]")
	private WebElement religiousinformation;

	public WebElement getReligiousinformation() {
		return religiousinformation;
	}
	
	@FindBy(xpath="//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[3]/div[2]")
	private WebElement raasi;

	public WebElement getRaasi() {
		return raasi;
	}
	
	@FindBy(xpath="//*[@id='Icon_delete']/span")
	private WebElement deleteicon;
	
	@FindBy(xpath="(//*[@id='historyBack']/span)[2]")
	private WebElement backhistory;
	
	
	
	
}
