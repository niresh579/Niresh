package StepDefinitions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import cucu.HoroScopeMatches.Base;
import cucu.HoroScopeMatches.HoroscopePOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import net.sourceforge.htmlunit.corejs.javascript.ast.TryStatement;

public class Horoscope  {
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\HoroScopeMatches\\driver\\chromedriver.exe";

	    @Given("user in the login page")
	    public void user_in_the_login_page() throws InterruptedException {
	    	System.setProperty("webdriver.chrome.driver", driverExecutablePath);
            Map<String, String> mobileEmulation = new HashMap();
            mobileEmulation.put("deviceName", "Pixel 2");

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
            chromeOptions.addArguments("--disable-notifications");
            driver = new ChromeDriver(chromeOptions);


			driver.get("https://devmobile.tamilmatrimony.com/july/staging/qa9/");
			Thread.sleep(5000);
    }	 
	    
	    @When("The user enter the username")
	    public void the_user_enter_the_username(DataTable username)throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver); 
	    	Map<String, String> asMap = username.asMap(String.class,String.class);
	    	Thread.sleep(10000);
	    	
	    	Base.btnclick(rp.getUsername());
	    	Thread.sleep(1000);
	    	Base.setText(rp.getUsername(),asMap.get("username"));
	    }

	    @When("The user enter the password")
	    public void the_user_enter_the_password(DataTable password) throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver); 
	    	Map<String, String> asMap = password.asMap(String.class,String.class);
	    	Thread.sleep(1000);
	    	Base.btnclick(rp.getPassword());
	    	Thread.sleep(1000);
	    	Base.setText(rp.getPassword(), asMap.get("password"));
	    	
	    }
	    

	    @Then("User click on login button")
	    public void user_click_on_login_button() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver); 
            Thread.sleep(5000);
            Base.btnclick(rp.getLogin());
            Thread.sleep(5000);
	    	try {
				driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-equality/ion-content/div[2]/div[2]/photo/div/ion-thumbnail/img")).click();
			} catch (Exception e) {
				System.out.println("no element");
			}
	    	Thread.sleep(8000);
	    	try {
	    		driver.findElement(By.xpath("//*[@id='close']/img")).click();
	    		
	    	} catch (Exception e) {
	    		System.out.println("no popup");
	    	}
	    }

	    @Given("Verify user in home page")
	    public void verify_user_in_home_page() {
	    	System.out.println("user in home page");
	       
	    }

	    @When("click the menu button in the home page")
	    public void click_the_menu_button_in_the_home_page() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver); 
	    	Thread.sleep(3000);
	    	Base.btnclick(rp.getMenu());
	    }

	    @Then("click the Horoscope matches.")
	    public void click_the_Horoscope_matches() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver); 
	    	Thread.sleep(5000);
	    	Base.btnclick(rp.getClickhoroscope());
	    }

	    @Then("verify the horoscope matches are present.")
	    public void verify_the_horoscope_matches_are_present() {
	    	System.out.println("Horoscope matches not present");
	    }

	   @Then("If the horoscope matches are not present click the generate horoscope in the page.")
	    public void if_the_horoscope_matches_are_not_present_click_the_generate_horoscope_in_the_page() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver); 
	    	Thread.sleep(5000);
	    /*	Base.btnclick(rp.getGeneratehoroscope());
	    	
	    }

	    @Given("verify the user in ADD Horoscope page.")
	    public void verify_the_user_in_ADD_Horoscope_page() {
	    	System.out.println("user in horoscope page");
	    }

	    @When("click the Date of birth.")
	    public void click_the_Date_of_birth() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver); 
	    	Thread.sleep(3000);
	    	Base.btnclick(rp.getBtnclickdob());
	    }

	    @When("select the date of birth.")
	    public void select_the_date_of_birth() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver); 
	    	Thread.sleep(5000);
	    	//month
	    WebElement src=driver.findElement(By.xpath("/html/body/ion-app/ion-picker-cmp/div/div[2]/div[2]/div/button[12]"));
	    Thread.sleep(5000);
	    WebElement dest=driver.findElement(By.xpath("/html/body/ion-app/ion-picker-cmp/div/div[2]/div[2]/div/button[6]"));
	    Thread.sleep(5000);	
	    	Actions a=new Actions(driver);
	    	a.dragAndDrop(src, dest).build().perform();
	    	//date
	    	WebElement src1=driver.findElement(By.xpath("/html/body/ion-app/ion-picker-cmp/div/div[2]/div[3]/div/button[13]"));
		    Thread.sleep(5000);
		    WebElement dest1=driver.findElement(By.xpath("/html/body/ion-app/ion-picker-cmp/div/div[2]/div[3]/div/button[15]"));
		    Thread.sleep(5000);	
		    	Actions b=new Actions(driver);
		    	b.dragAndDrop(src1, dest1).build().perform();
		    	//year
		    	WebElement src2=driver.findElement(By.xpath("/html/body/ion-app/ion-picker-cmp/div/div[2]/div[4]/div/button[28]"));
			    Thread.sleep(5000);
			    WebElement dest2=driver.findElement(By.xpath("/html/body/ion-app/ion-picker-cmp/div/div[2]/div[4]/div/button[30]"));
			    Thread.sleep(5000);	
			    	Actions c=new Actions(driver);
			    	c.dragAndDrop(src2, dest2).build().perform();
			    	
			    	
	    }

	    @Then("save the date of birth.")
	    public void save_the_date_of_birth() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver);
	    	Thread.sleep(5000);
	    	Base.btnclick(rp.getBtndonedob());
	    }

	    @Given("click the Time of birth.")
	    public void click_the_Time_of_birth() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver);
	    	Thread.sleep(5000);
	    	Base.btnclick(rp.getBtntimeofbirth());
	    	
	    }

	    @Given("select the time of birth.")
	    public void select_the_time_of_birth() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver);
	    	Thread.sleep(5000);
	    	System.out.println("selected");
	    	//date
		  WebElement src=driver.findElement(By.xpath("/html/body/ion-app/ion-picker-cmp/div/div[2]/div[2]/div/button[9]"));
		    Thread.sleep(5000);
		    WebElement dest=driver.findElement(By.xpath("/html/body/ion-app/ion-picker-cmp/div/div[2]/div[2]/div/button[7]"));
		    Thread.sleep(5000);	
		    	Actions a=new Actions(driver);
		    	a.dragAndDrop(src, dest).build().perform();
		    	//minutes
		    	WebElement src1=driver.findElement(By.xpath("/html/body/ion-app/ion-picker-cmp/div/div[2]/div[3]/div/button[28]"));
			    Thread.sleep(5000);
			    WebElement dest1=driver.findElement(By.xpath("/html/body/ion-app/ion-picker-cmp/div/div[2]/div[3]/div/button[55]"));
			    Thread.sleep(5000);	
			    	Actions b=new Actions(driver);
			    	b.dragAndDrop(src1, dest1).build().perform();
			    	//am or pm
			    	WebElement src2=driver.findElement(By.xpath("/html/body/ion-app/ion-picker-cmp/div/div[2]/div[4]/div/button[1]"));
				    Thread.sleep(5000);
				    WebElement dest2=driver.findElement(By.xpath("/html/body/ion-app/ion-picker-cmp/div/div[2]/div[4]/div/button[2]"));
				    Thread.sleep(5000);	
				    	Actions c=new Actions(driver);
				    	c.dragAndDrop(src2, dest2).build().perform(); 
				    	
	    	
	    }

	    @Then("save the time of birth.")
	    public void save_the_time_of_birth() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver);
	    	Thread.sleep(5000);
	    	Base.btnclick(rp.getBtndonedob());
	    }

	    @Given("click the country of birth.")
	    public void click_the_country_of_birth() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver);
	    	Thread.sleep(5000);
	    	Base.btnclick(rp.getCountryofbirth());
	    	Thread.sleep(5000);
	    	WebElement gh=driver.findElement(By.xpath("//*[@id='commonmenu']/div/menucontent/ion-header/ion-searchbar/div/input"));
	    	gh.sendKeys("India");
	    	
	    }

	    @Given("select the country of birth.")
	    public void select_the_country_of_birth() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver);
	    	Thread.sleep(5000);
	    	WebElement btnclk=driver.findElement(By.xpath("//*[@id='commonmenu']/div/menucontent/ion-content/div[2]/ion-list/ion-item/div[1]/div"));
	    	btnclk.click();
	    }

	    @Then("save the country of birth.")
	    public void save_the_country_of_birth() {
	    	System.out.println("saved successfully");
	    }
	    
	    @Given("click the State of birth.")
	    public void click_the_State_of_birth() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver);
	    	Thread.sleep(10000);
	    	Base.btnclick(rp.getStateofbirth());
	    	Thread.sleep(10000);
	    	WebElement stateclick=driver.findElement(By.xpath("//*[@id='commonmenu']/div/menucontent/ion-header/ion-searchbar/div/input"));
	    	stateclick.sendKeys("Tamil Nadu");
	        
	    }

	    @Given("select the State of birth.")
	    public void select_the_State_of_birth() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver);
	    	Thread.sleep(5000);
	    	WebElement btnclk=driver.findElement(By.xpath("//*[@id='commonmenu']/div/menucontent/ion-content/div[2]/ion-list/ion-item/div[1]/div"));
	    	btnclk.click();
	    	
	    }

	    @Then("save the State of birth.")
	    public void save_the_State_of_birth() {
	        System.out.println("saved successfully");
	    }

	    @Given("click the city of birth.")
	    public void click_the_city_of_birth() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver);
	    	Thread.sleep(10000);
	    	Base.btnclick(rp.getCityofbirth());
	    	Thread.sleep(10000);
	    	WebElement cityclick=driver.findElement(By.xpath("//*[@id='commonmenu']/div/menucontent/ion-header/ion-searchbar/div/input"));
	    	cityclick.sendKeys("Ariyalur");
	        
	    }

	    @Given("select the city of birth.")
	    public void select_the_city_of_birth() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver);
	    	Thread.sleep(5000);
	    	WebElement btnclk=driver.findElement(By.xpath("//*[@id='commonmenu']/div/menucontent/ion-content/div[2]/ion-list/ion-item/div[1]/div"));
	    	btnclk.click();
	       
	    }

	    @Then("save the city of birth.")
	    public void save_the_city_of_birth() {
	    	System.out.println("city saved successfully");
	    }   

	    @Given("click the chart style button.")
	    public void click_the_chart_style_button() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver);
	    	Thread.sleep(5000);
	    	Base.btnclick(rp.getChartstyle());
	    	Thread.sleep(5000);
	    	WebElement chrtstyle=driver.findElement(By.xpath("//*[@id='commonmenu']/div/menucontent/ion-header/ion-searchbar/div/input"));
	    	chrtstyle.sendKeys("South Indian");
	    }

	    @Given("select any one of the chart style.")
	    public void select_any_one_of_the_chart_style() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver);
	    	Thread.sleep(5000);
	    	WebElement btnclk=driver.findElement(By.xpath("//*[@id='commonmenu']/div/menucontent/ion-content/div[2]/ion-list/ion-item/div[1]/div"));
	    	btnclk.click();
	    }

	    @Then("save the chart style.")
	    public void save_the_chart_style() {
	    	System.out.println("saved successfully");
	    }

	    @Given("click the language button.")
	    public void click_the_language_button() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver);
	    	Thread.sleep(5000);
	    	Base.btnclick(rp.getLanguage());
	    	Thread.sleep(7000);
	    	WebElement lang=driver.findElement(By.xpath("//*[@id='commonmenu']/div/menucontent/ion-header/ion-searchbar/div/input"));
	    	lang.sendKeys("Tamil");
	    }

	    @Then("select any one of the language")
	    public void select_any_one_of_the_language() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver);
	    	Thread.sleep(7000);
	    	WebElement btnclk=driver.findElement(By.xpath("//*[@id='commonmenu']/div/menucontent/ion-content/div[2]/ion-list/ion-item/div[1]/div"));
	    	btnclk.click();
	    }

	    @Then("save the language.")
	    public void save_the_language() {
	    	System.out.println("language saved successfully");
	    }

	    @Then("click the generate horoscope button")
	    public void click_the_generate_horoscope_button() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver);
	    	Thread.sleep(5000);
	    	Base.btnclick(rp.getHoroscopegenerate());
	    	Thread.sleep(5000);
	    	try {
				driver.findElement(By.xpath("/html/body/ion-app/ion-alert/div/div[3]/button/span")).click();
			} catch (Exception e) {
				System.out.println("no popup");
			}
	    	
	    	
	    	*/
	    	
	    } 
	    
	    @Given("select a profile in Horoscope matches")
	    public void select_a_profile_in_Horoscope_matches() throws InterruptedException {
	    	
	    	HoroscopePOM rp=new HoroscopePOM(driver);
	    	Thread.sleep(80000);
	    	// WebElement matches=driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-matches[2]/ion-content/div[2]/ion-list/ion-row/ion-grid[3]/div[1]/ion-row[1]"));
	    //	matches.click();
	       
	    }

	    @Then("shortlist the profile and send interest")
	    public void shortlist_the_profile_and_send_interest() throws InterruptedException {
	    	HoroscopePOM rp=new HoroscopePOM(driver);
	    	Thread.sleep(5000);
	    	Base.btnclick(rp.getShortlist());
	        
	    }

	    @Then("Go to recently viewad section and check whether the profile is displayed")
	    public void go_to_recently_viewad_section_and_check_whether_the_profile_is_displayed() {
	        // Write code here that turns the phrase above into concrete actions
	        throw new cucumber.api.PendingException();
	    }

	    @Then("goto shortlisted and check whether that profile is displayed.")
	    public void goto_shortlisted_and_check_whether_that_profile_is_displayed() {
	        // Write code here that turns the phrase above into concrete actions
	        throw new cucumber.api.PendingException();
	    }

	    @Then("goto mailbox and check in sendbox whether the request is sent.")
	    public void goto_mailbox_and_check_in_sendbox_whether_the_request_is_sent() {
	        // Write code here that turns the phrase above into concrete actions
	        throw new cucumber.api.PendingException();
	    }

	    @Then("Check whether the profiles in HM hroscope percent is more than and equal to {int}% profile are only displayed")
	    public void check_whether_the_profiles_in_HM_hroscope_percent_is_more_than_and_equal_to_profile_are_only_displayed(Integer int1) {
	        // Write code here that turns the phrase above into concrete actions
	        throw new cucumber.api.PendingException();
	    }


	  
	    
	     
	    


}
