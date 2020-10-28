package PomPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basepacknew.Base3;



public class RandomidcheckPOM extends Base3 {
	public RandomidcheckPOM(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
	
	}

	@FindBy(xpath="//html/body/div[1]/div[2]/div/form/div[1]/input]")
	private WebElement Username;
	@FindBy(xpath="//input[@id='passwordClear1']")
	private WebElement password;
	@FindBy(xpath="//input[@id='password1']")
	private WebElement password1;
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

	

