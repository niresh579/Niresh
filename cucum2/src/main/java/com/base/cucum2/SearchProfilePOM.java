package com.base.cucum2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class SearchProfilePOM extends Base {
	public SearchProfilePOM(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
//login page
	@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-grid/ion-row[2]/ion-col/ion-item/div[1]/div/ion-input/input")
	 private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	
	

	@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-grid/ion-row[3]/ion-col/ion-item/div[1]/div/ion-input/input")
     private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-grid/ion-row[4]/ion-col/button")
     private WebElement login;
	public WebElement getLogin() {
		return login;
	}

// search profile
		
   @FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-matches/ion-footer/div/header/div/ion-navbar/div[2]/ion-row/ion-col[4]")	
    private WebElement search;
public WebElement getSearch() {
	return search;
}

// caste

@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-searchform/ion-content/div[2]/ion-grid/div/ion-row[6]")
private WebElement caste;


public WebElement getCaste() {
	return caste;
}

@FindBy(xpath="//*[@id='checkbox-5-0']/span")
private WebElement subcaste;
public WebElement getSubcaste() {
	return subcaste;
}

@FindBy(xpath="//*[@id='commonmenu']/div/menucontent/ion-content/div[2]/ion-grid/ion-row/ion-col[3]")
private WebElement savecaste;

public WebElement getSavecaste() {
	return savecaste;
}

//gothiram(stars)
@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-searchform/ion-content/div[2]/ion-grid/div/ion-row[7]")
private WebElement stars;
public WebElement getStars() {
	return stars;
}

@FindBy(xpath="//*[@id='checkbox-356-0']/span")
private WebElement substars;
public WebElement getSubstars() {
	return substars;
}

@FindBy(xpath="//*[@id='commonmenu']/div/menucontent/ion-content/div[2]/ion-grid/ion-row/ion-col[3]")
private WebElement savesubstars;
public WebElement getSavesubstars() {
	return savesubstars;
}

//physical status
@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-searchform/ion-content/div[2]/ion-grid/div/ion-row[11]")
private WebElement physicalstatus;
public WebElement getPhysicalstatus() {
	return physicalstatus;
}





@FindBy(xpath="//*[@id='commonmenu']/div/menucontent/ion-content/div[2]/ion-list/ion-item[1]/div[1]/div")
private WebElement subphysicalstatus;
public WebElement getSubphysicalstatus() {
	return subphysicalstatus;
}

//eating habits
@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-searchform/ion-content/div[2]/ion-grid/div/ion-row[12]")
private WebElement eatinghabits;
public WebElement getEatinghabits() {
	return eatinghabits;
}

@FindBy(xpath="//*[@id='checkbox-192-0']/span")
private WebElement subeatinghabits;
public WebElement getSubeatinghabits() {
	return subeatinghabits;
}
@FindBy(xpath="//*[@id='commonmenu']/div/menucontent/ion-content/div[2]/ion-grid/ion-row/ion-col[3]")
private WebElement saveeatinghabits;

public WebElement getSaveeatinghabits() {
	return saveeatinghabits;
}



//smoking habits
@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-searchform/ion-content/div[2]/ion-grid/div/ion-row[13]")
private WebElement smokinghabits;
public WebElement getSmokinghabits() {
	return smokinghabits;
}

@FindBy(xpath="//*[@id='checkbox-192-0']/span")
private WebElement subsmokinghabits;
public WebElement getSubsmokinghabits() {
	return subsmokinghabits;
}
@FindBy(xpath="//*[@id='commonmenu']/div/menucontent/ion-content/div[2]/ion-grid/ion-row/ion-col[3]")
private WebElement savesmokinghabits;
public WebElement getSavesmokinghabits() {
	return savesmokinghabits;
}

//drinking habits
@FindBy(xpath="/html/body/ion-app/ng-component/ion-nav/page-searchform/ion-content/div[2]/ion-grid/div/ion-row[14]")
private WebElement drinkinghabits;

public WebElement getDrinkinghabits() {
	return drinkinghabits;
}



@FindBy(xpath="//*[@id='checkbox-203-0']/span")
private WebElement subdrinkinghabits;


public WebElement getSubdrinkinghabits() {
	return subdrinkinghabits;
}

@FindBy(xpath="//*[@id=\'commonmenu\']/div/menucontent/ion-content/div[2]/ion-grid/ion-row/ion-col[3]")
private WebElement savedrinkinghabits;
public WebElement getSavedrinkinghabits() {
	return savedrinkinghabits;
}


//search profile
@FindBy(xpath="//page-searchform[not(@hidden)]//span[text()=' SEARCH PROFILES ']")
private WebElement searchprofile;
public WebElement getSearchprofile() {
	return searchprofile;
}





















	}



