package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;

public class GmailPOM extends BaseTest {
	public GmailPOM(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}

	@FindBy(xpath="//*[@id='view_container']/div/div/div[2]/div/div/div/form/span/section/div/div/div/div/ul/li[2]/div")
	private WebElement useanotheraccount;
	
	@FindBy(xpath="//*[@id='identifierId']")
	private WebElement username;

	@FindBy(xpath="//*[@id='identifierNext']/span")
	private WebElement next;
	
	@FindBy(xpath="//*[@id='passwordNext']/span")
	private WebElement passwordnext;


	public WebElement getUseanotheraccount() {
		return useanotheraccount;
	}

	

	public WebElement getPasswordnext() {
		return passwordnext;
	}



	public WebElement getUsername() {
		return username;
	}

	public WebElement getNext() {
		return next;
	}
	
	
	
}
