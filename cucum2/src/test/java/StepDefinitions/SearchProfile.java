package StepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.base.cucum2.Base;
import com.base.cucum2.SearchProfilePOM;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class SearchProfile{
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\cucum2\\driver\\chromedriver.exe";

	    @Given("user in the login page")
	    public void user_in_the_login_page() throws InterruptedException {
	    	System.setProperty("webdriver.chrome.driver", driverExecutablePath);
            Map<String, String> mobileEmulation = new HashMap();
            mobileEmulation.put("deviceName", "Pixel 2");

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
            chromeOptions.addArguments("--disable-notifications");
            driver = new ChromeDriver(chromeOptions);


			driver.get("https://devmobile.tamilmatrimony.com/july/staging/qa2/");
			Thread.sleep(5000);
    }	    

	    @When("The user enter the username")
	    public void the_user_enter_the_username(DataTable username)throws InterruptedException {
	    	 
	    	SearchProfilePOM rp=new SearchProfilePOM(driver); 
	    	Map<String, String> asMap = username.asMap(String.class,String.class);
	    	Thread.sleep(10000);
	    	
	    	Base.btnclick(rp.getUsername());
	    	Thread.sleep(1000);
	    	Base.setText(rp.getUsername(),asMap.get("username"));	    	
	    }


	    @When("The user enter the password")
	    public void the_user_enter_the_password(DataTable password) throws InterruptedException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);    
	    	Map<String, String> asMap = password.asMap(String.class,String.class);
	    	Thread.sleep(1000);
	    	Base.btnclick(rp.getPassword());
	    	Thread.sleep(1000);
	    	Base.setText(rp.getPassword(), asMap.get("password"));
	    	
	    }
	    
	    @Then("User click on login button")
	    public void user_click_on_login_button() throws InterruptedException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);  
	    	Thread.sleep(5000);
	    	
	    	try {
				driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-login/ion-content/div[2]/form/ion-grid/ion-row[4]/ion-col")).click();
			} catch (Exception e) {
				System.out.println("no element");
			}
	    	Thread.sleep(5000);
	    	try {
	    		driver.findElement(By.xpath("//*[@id=\'close\']/img")).click();
	    		
	    	} catch (Exception e) {
	    		System.out.println("no popup");
	    	}
    }
	   

	    @Given("click the search button in the page")
	    public void click_the_search_button_in_the_page() throws InterruptedException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);  
	    	Thread.sleep(10000);
	    	try {
	    		driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-equality/ion-content/div[2]/div[2]/photo/div/ion-thumbnail/img")).click();
	    		
	    	} catch (Exception e) {
	    		System.out.println("no popup");
	    	}
	    	Thread.sleep(5000);
	    	try {
				driver.findElement(By.xpath("//*[@id='close']/img")).click();
			} catch (Exception e) {
				System.out.println("no popup");
			}
	    	Thread.sleep(5000);
	    	Base.btnclick(rp.getSearch());
	       
	    }

	    @Given("verify the user in search page.")
	    public void verify_the_user_in_search_page() {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);
	    	System.out.println("success");
	       
	    }

	    @Given("click the caste button in the page")
	    public void click_the_caste_button_in_the_page() throws InterruptedException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);
	    	Thread.sleep(5000);
	    	try {
				driver.findElement(By.xpath("//*[@id='close']/img")).click();
			} catch (Exception e) {
				System.out.println("no popup");
			}
	    	Thread.sleep(3000);
	        Base.btnclick(rp.getCaste());
	    }

	    @When("After click the caste verify the list of subcaste present or not.")
	    public void after_click_the_caste_verify_the_list_of_subcaste_present_or_not() throws InterruptedException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);
	    	System.out.println("success");
	    	Thread.sleep(5000);
	    	try {
				driver.findElement(By.xpath("/html/body/ion-app/ion-popover/div/div[2]/div/page-popmessagebox/div/div[2]")).click();
			} catch (Exception e) {
				System.out.println("no popup");
			}
	    	
	    }

	    @When("click the any of the caste")
	    public void click_the_any_of_the_caste() throws InterruptedException {
	    	
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);
	    	Thread.sleep(5000);
	    	try {
				driver.findElement(By.xpath("/html/body/ion-app/ion-popover/div/div[2]/div/page-popmessagebox/div/div[2]")).click();
			} catch (Exception e) {
				System.out.println("no popup");
			}
	    	Thread.sleep(3000);
	    	
	    		driver.findElement(By.xpath("//*[@id='checkbox-5-0']/span")).click();
		    	Thread.sleep(3000);
		    	
		    	//photo validation
		    	Thread.sleep(5000);
		    	try {
					driver.findElement(By.xpath("/html/body/ion-app/ion-popover/div/div[2]/div/page-popmessagebox/div/div[2]")).click();
				} catch (Exception e) {
					System.out.println("no popup");
				}
			
				
	    	
	    	
	    	
	    }

	    @When("save the selected caste")
	    public void save_the_selected_caste() throws InterruptedException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);
	    	Thread.sleep(3000);
	    	Base.btnclick(rp.getSavecaste());
	    	
	    }

	    @When("click the gotharam\\(stars).")
	    public void click_the_gotharam_stars() throws InterruptedException {
	    	
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);
	    	Thread.sleep(3000);
	    	Base.btnclick(rp.getStars());
	        
	    }

	    @When("verify the list of stars")
	    public void verify_the_list_of_stars() {
	       System.out.println("success");
	    }

	    @When("select any one of the stars from the list")
	    public void select_any_one_of_the_stars_from_the_list() throws InterruptedException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);
	    	Thread.sleep(5000);
	    	try {
	    		 driver.findElement(By.xpath("//*[@id='checkbox-356-0']/span")).click();
		    	
			} catch (Exception e) {
				System.out.println("selected succesfully");
			}	    }

	    @When("save the selected star.")
	    public void save_the_selected_star() throws InterruptedException, AWTException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver); 
	    	Thread.sleep(3000);
	    	Base.btnclick(rp.getSavesubstars());
	    	Thread.sleep(8000);
	    	JavascriptExecutor js = (JavascriptExecutor)driver;
	  WebElement physcial= driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-searchform/ion-content/div[2]/ion-grid/div/ion-row[11]"));
	  js.executeScript("arguments[0].scrollIntoView(true);",physcial);
	    }

	    @When("click the Physical status in the page")
	    public void click_the_Physical_status_in_the_page() throws InterruptedException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver); 
	    	Thread.sleep(8000);
	    	Base.btnclick(rp.getPhysicalstatus());
	    }

	    @Then("verify the list of physical status")
	    public void verify_the_list_of_physical_status() {
	       System.out.println("success");
	    }

	    @Given("select any one of the status from the list")
	    public void select_any_one_of_the_status_from_the_list() throws InterruptedException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver); 
	    	Thread.sleep(5000);
	    	try {
	    		driver.findElement(By.xpath("//*[@id='commonmenu']/div/menucontent/ion-content/div[2]/ion-list/ion-item[1]/div[1]/div")).click();
			} catch (Exception e) {
				System.out.println("selected succesfully");
			}
	    	
	    }

	    @Given("save the selected physical status in the page")
	    public void save_the_selected_physical_status_in_the_page() {
	        System.out.println("saved");
	    }

	    @Given("click the Eating habits in the page.")
	    public void click_the_Eating_habits_in_the_page() throws InterruptedException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);
	    	Thread.sleep(5000);
	    	Base.btnclick(rp.getEatinghabits());
	        
	    }

	    @Then("verify the list of eating habits in the page")
	    public void verify_the_list_of_eating_habits_in_the_page() {
	       System.out.println("verified");
	    }

	    @Then("select any one of the eating habits from the list.")
	    public void select_any_one_of_the_eating_habits_from_the_list() throws InterruptedException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);
	    	Thread.sleep(5000);
	    	try {
	    		driver.findElement(By.xpath("//*[@id='checkbox-192-0']/span")).click();
			} catch (Exception e) {
				System.out.println("selected succesfully");
			}
	    }

	    @Then("save the selected eating habits.")
	    public void save_the_selected_eating_habits() throws InterruptedException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);
	    	Thread.sleep(5000);
	       Base.btnclick(rp.getSaveeatinghabits());
	    }
	    
	    @Given("click the smoking habits")
	    public void click_the_smoking_habits() throws InterruptedException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);
	    	Thread.sleep(3000);
	    	Base.btnclick(rp.getSmokinghabits());
	    }

	    @Then("verify the list of smoking habits")
	    public void verify_the_list_of_smoking_habits() throws InterruptedException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);
	    	Thread.sleep(5000);
	    	try {
	    		driver.findElement(By.xpath("//*[@id='checkbox-192-0']/span")).click();
			} catch (Exception e) {
				System.out.println("selected succesfully");
			}
	    }


	    @Then("save the selected smoking habits in the list")
	    public void save_the_selected_smoking_habits_in_the_list() throws InterruptedException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);
	    	Thread.sleep(3000);
	       Base.btnclick(rp.getSavesmokinghabits());
	    }
	    

	    @Then("click the drinking habits.")
	    public void click_the_drinking_habits() throws InterruptedException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);
	    	Thread.sleep(5000);
	    	try {
	    		Base.btnclick(rp.getDrinkinghabits());
			} catch (Exception e) {
				System.out.println("selected succesfully");
			}
	    	
	        
	    }

	    @Then("verify the list of drinking habits")
	    public void verify_the_list_of_drinking_habits() {
	        System.out.println("verified");
	    }

	    @Given("select any one of the habits from the list")
	    public void select_any_one_of_the_habits_from_the_list() throws InterruptedException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);
	    	Thread.sleep(5000);
	    	try {
	    		driver.findElement(By.xpath("//*[@id='checkbox-203-0']/span")).click();
			} catch (Exception e) {
				System.out.println("selected succesfully");
			}
	    }

	    @Given("save the selected habits in the list.")
	    public void save_the_selected_habits_in_the_list() throws InterruptedException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);
	    	Thread.sleep(3000);
	    	Base.btnclick(rp.getSavedrinkinghabits());
	    }

	   
	    
	    @Then("click the search profile")
	    public void click_the_search_profile() throws InterruptedException {
	    	SearchProfilePOM rp=new SearchProfilePOM(driver);
	    	Thread.sleep(3000);
	        Base.btnclick(rp.getSearchprofile());
	    }
}

