package StepDefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumbercms.cucumbercms.BaseTest;
import cucumbercms.cucumbercms.EditPiPOM;
import io.cucumber.datatable.DataTable;

public class EditPi {
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\cucumbercms\\drivernew\\chromedriver.exe";


	@Given("enter the webpage")
	public void enter_the_webpage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
        Map<String, String> mobileEmulation = new HashMap();
        mobileEmulation.put("deviceName", "Pixel 2");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        chromeOptions.addArguments("--disable-notifications");
        driver = new ChromeDriver(chromeOptions);


		driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
		Thread.sleep(5000);
	    
	}

	@Given("enter the username")
	public void enter_the_username(DataTable username) throws InterruptedException {
		EditPiPOM rp= new EditPiPOM(driver);
		Map<String, String> asMap = username.asMap(String.class,String.class);
    	Thread.sleep(7000);
    	Actions a=new Actions(driver);
		Thread.sleep(4000);
		 WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
		a.sendKeys(e,"EZH556542").build().perform();
    	
    	Thread.sleep(7000);
    //	BaseTest.select_text(rp.getUsername(),asMap.get("username"));
 	    
	}

	@When("enter the password")
	public void enter_the_password(DataTable password) throws InterruptedException {
		EditPiPOM rp= new EditPiPOM(driver);
  
   Map<String, String> asMap = password.asMap(String.class,String.class);
   Thread.sleep(7000);
   Actions b=new Actions(driver);
   Thread.sleep(4000);
   WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
	b.sendKeys(d,"cbstest").build().perform();
	Thread.sleep(4000);
   // BaseTest.select_text(rp.getPassword(),asMap.get("password"));
 
	}

	@When("click the login")
	public void click_the_login() {
		EditPiPOM rp= new EditPiPOM(driver);
		BaseTest.click(rp.getLogin());
	}

	@Then("click the menu bar")
	public void click_the_menu_bar() throws Throwable {
		EditPiPOM rp= new EditPiPOM(driver);
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
		  
		  Thread.sleep(4000);
		  BaseTest.click(rp.getEditpi());
		  
		  Thread.sleep(4000);
		  BaseTest.click(rp.getBasicdetails());
		  

		  Thread.sleep(4000);
		driver.findElement(By.id("PCF")).click();
		//RegPanelSearchvalue
		
		 Thread.sleep(4000);
	driver.findElement(By.id("RegPanelSearchvalue")).click();
		
		Thread.sleep(4000);
		BaseTest.select_string(driver.findElement(By.id("RegPanelSearchvalue")), BaseTest.getExcelData("Data", 5, 1));
		Thread.sleep(2000);
		
	//  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 5, 1)+"')]")));
		Thread.sleep(3000);
	     
		
		
	}


}
