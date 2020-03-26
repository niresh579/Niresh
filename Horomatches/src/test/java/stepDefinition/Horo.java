package stepDefinition;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;
import pom.HoroscopePOM;

public class Horo  {
	public static WebDriver driver;

	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\Horomatches\\driver\\chromedriver.exe";
	
	
	
	@Given("User login the page")
	public void user_login_the_page() {
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
        Map<String, String> mobileEmulation = new HashMap();
        mobileEmulation.put("deviceName", "Pixel 2");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        chromeOptions.addArguments("--disable-notifications");
        driver = new ChromeDriver(chromeOptions);

		
		
	}
	@Given("User gave ID")
	public void user_gave_ID(DataTable username)throws InterruptedException {
		
		
		HoroscopePOM rp=new HoroscopePOM(driver); 
    	Map<String, String> asMap = username.asMap(String.class,String.class);
    	Thread.sleep(10000);
    	
    	Base.btnclick(rp.getUsername());
    	Thread.sleep(1000);
    	Base.setText(rp.getUsername(),asMap.get("username"));
	}

	@Then("User User gave password")
	public void user_User_gave_password(DataTable password) throws InterruptedException {
	   
		
		HoroscopePOM rp=new HoroscopePOM(driver); 
    	Map<String, String> asMap = password.asMap(String.class,String.class);
    	Thread.sleep(1000);
    	Base.btnclick(rp.getPassword());
    	Thread.sleep(1000);
    	Base.setText(rp.getPassword(), asMap.get("password"));
		
		
	}

	
	

}
