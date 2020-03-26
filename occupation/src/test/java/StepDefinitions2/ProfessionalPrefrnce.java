package StepDefinitions2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucu.occupation.Base;
import cucu.occupation.ProfessionalPreferncepom;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class ProfessionalPrefrnce {
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
	    public void the_user_enter_the_username(DataTable username) throws InterruptedException {
	    	ProfessionalPreferncepom rp=new ProfessionalPreferncepom(driver); 
	    	Map<String, String> asMap = username.asMap(String.class,String.class);
	    	Thread.sleep(5000);
	    	
	    	Base.btnclick(rp.getUsername());
	    	Thread.sleep(5000);
	    	Base.setText(rp.getUsername(),asMap.get("username"));
	    }

	    @When("The user enter the password")
	    public void the_user_enter_the_password(DataTable password) throws InterruptedException {
	    	ProfessionalPreferncepom rp=new ProfessionalPreferncepom(driver); 
	    	Map<String, String> asMap = password.asMap(String.class,String.class);
	    	Thread.sleep(5000);
	    	Base.btnclick(rp.getPassword());
	    	Thread.sleep(5000);
	    	Base.setText(rp.getPassword(), asMap.get("password"));
	    	
	    }
	

	    @Then("User click on login button")
	    public void user_click_on_login_button() throws InterruptedException {
	    	ProfessionalPreferncepom rp=new ProfessionalPreferncepom(driver); 
	    	 Thread.sleep(8000);
	            Base.btnclick(rp.getLogin());
	            Thread.sleep(8000);
		    	try {
					driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-equality/ion-content/div[2]/div[2]/photo/div/ion-thumbnail/img")).click();
				} catch (Exception e) {
					System.out.println("no element");
				}
		    	Thread.sleep(8000);
		    	try {
		    		driver.findElement(By.xpath("//*[@id=\'close\']/img")).click();
		    		
		    	} catch (Exception e) {
		    		System.out.println("no popup");
		    	}
		    	Thread.sleep(8000);
		    	try {
		    		driver.findElement(By.xpath("//*[@id=\'close\']/img")).click();
		    		
		    	} catch (Exception e) {
		    		System.out.println("no popup");
		    	}
	    }

	    @Given("click the menu in home page")
	    public void click_the_menu_in_home_page() throws InterruptedException {
	    	ProfessionalPreferncepom rp=new ProfessionalPreferncepom(driver); 
	    	Thread.sleep(8000);
	    	Base.btnclick(rp.getMenu());
	    }
	    
	    @When("click the edit pp.")
	    public void click_the_edit_pp() throws InterruptedException {
	    	ProfessionalPreferncepom rp=new ProfessionalPreferncepom(driver); 
	      Thread.sleep(3000);
	    	JavascriptExecutor js = (JavascriptExecutor)driver;
		  	  WebElement edit= driver.findElement(By.xpath("//*[@id='rightmenu']/ion-row[17]/ion-col"));
		  	  js.executeScript("arguments[0].scrollIntoView(true);",edit);
	    	Thread.sleep(3000);
	    	Base.btnclick(rp.getEditpp());
	    }

	    @Then("The user to click the professional preference in patner preference field.")
	    public void the_user_to_click_the_professional_preference_in_patner_preference_field() throws InterruptedException {
	    	ProfessionalPreferncepom rp=new ProfessionalPreferncepom(driver); 
	    	Thread.sleep(3000);
	    	Base.btnclick(rp.getSubpp());
	    }

	    @Then("User to click the occupation field.")
	    public void user_to_click_the_occupation_field() throws InterruptedException {
	    	ProfessionalPreferncepom rp=new ProfessionalPreferncepom(driver); 
	    	Thread.sleep(3000);
	    	Base.btnclick(rp.getClickoccupation());
	    }

	    @Then("Verify the list of occupation with existing criteria")
	    public void verify_the_list_of_occupation_with_existing_criteria() throws InterruptedException {
	    	ProfessionalPreferncepom rp=new ProfessionalPreferncepom(driver); 
	    	Thread.sleep(3000);
	    	 for (int i = 1; i <=138; i++) {
		        	try {
						
						Thread.sleep(5000);
						driver.findElement(By.xpath("//*[@id='commonmenu']/div/menucontent/ion-content/div[2]/ion-grid/ion-row/ion-col[1]/ion-searchbar/div/input")).sendKeys(Base.readValueFromExcelSheet().get(i).get("Type"));
						
						Thread.sleep(7000);
					List<WebElement> ref = driver.findElements(By.xpath("//*[@id='checkfliter[]']"));
					 for(WebElement element : ref) {
					        element.click();
					    }
					
						Thread.sleep(5000);
						driver.findElement(By.xpath("//*[@id='commonmenu']/div/menucontent/ion-content/div[2]/ion-grid/ion-row/ion-col[2]")).click();
						Thread.sleep(5000);
						Base.btnclick(rp.getClickoccupation());
	                         } catch (Exception e) {
						System.out.println(i +":  no Occupation:  "+Base.readValueFromExcelSheet().get(i).get("Type"));
					}
				
		        	
		        }  
		       
		    }
	    }




