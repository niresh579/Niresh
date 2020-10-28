package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;

public class RandomPOM extends BaseTest{
	public RandomPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);	
		}

	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/form/div[2]/input[3]")
	private WebElement login;


	public WebElement getLogin() {
		return login;
	}

}
