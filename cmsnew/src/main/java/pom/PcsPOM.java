package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PcsPOM {
	public PcsPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
		@FindBy(xpath="//*[@id='login-button']")
		private WebElement login;
		public WebElement getLogin() {
			return login;
		}
		
		
	

}
