package test.lokee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	public Pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@id='idEmail']")
	private WebElement username;
	

}
