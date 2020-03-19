package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommunicationSettingsPOM {
public CommunicationSettingsPOM(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//*[@id='idEmail']")
private WebElement username;

@FindBy(xpath="//*[@id='password1']")
private WebElement password;

@FindBy(xpath="//*[@id='login-button']")
private WebElement login;

@FindBy(xpath="//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[8]")
private WebElement setting;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

public WebElement getSetting() {
	return setting;
}

@FindBy(xpath="/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list/ion-item[3]")
private WebElement communicationsetting;

public WebElement getCommunicationsetting() {
	return communicationsetting;
}

@FindBy(xpath="/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list/ion-item[3]")
private WebElement smsnotification;

public WebElement getSmsnotification() {
	return smsnotification;
}

@FindBy(xpath="/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list/ion-item[1]/div[1]")
private WebElement chromenotification;

@FindBy(xpath="/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list/ion-item[2]/div[1]")
private WebElement emailnotification;

public WebElement getChromenotification() {
	return chromenotification;
}

public WebElement getEmailnotification() {
	return emailnotification;
}

@FindBy(xpath="//div[contains(text(),'Other Settings')]")
private WebElement othersetting;

public WebElement getOthersetting() {
	return othersetting;
}


@FindBy(xpath="/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list/ion-item[2]/div[1]")
private WebElement emailsetting;

public WebElement getEmailsetting() {
	return emailsetting;
}



}
