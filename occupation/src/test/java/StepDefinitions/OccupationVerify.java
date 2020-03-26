package StepDefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import cucu.occupation.Base;
import cucu.occupation.OccupationPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class OccupationVerify {
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


			driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
			Thread.sleep(5000);
    }	 
	
	   
	    @When("The user enter the username")
	    public void the_user_enter_the_username(DataTable username) throws InterruptedException {
	    	OccupationPOM rp=new OccupationPOM(driver); 
	    	Map<String, String> asMap = username.asMap(String.class,String.class);
	    	Thread.sleep(7000);
	    	
	    	Base.btnclick(rp.getUsername());
	    	
	    	Base.setText(rp.getUsername(),asMap.get("username"));
	    	Thread.sleep(7000);
	    }

	    @When("The user enter the password")
	    public void the_user_enter_the_password(DataTable password) throws InterruptedException {
	    	OccupationPOM rp=new OccupationPOM(driver); 
	    	Map<String, String> asMap = password.asMap(String.class,String.class);
	    	Thread.sleep(7000);
	    	Base.btnclick(rp.getPassword());
	    	Thread.sleep(8000);
	    	Base.setText(rp.getPassword(), asMap.get("password"));
	    	
	    }
	

	    @Then("User click on login button")
	    public void user_click_on_login_button() throws InterruptedException {
	    	OccupationPOM rp=new OccupationPOM(driver); 
	    	  Thread.sleep(10000);
	            Base.btnclick(rp.getLogin());
	            Thread.sleep(8000);
		    	try {
					driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-equality/ion-content/div[2]/div[2]/photo/div/ion-thumbnail/img")).click();
				} catch (Exception e) {
					System.out.println("no element");
				}
		    	Thread.sleep(9000);
		    	try {
		    		driver.findElement(By.xpath("//*[@id='close']/img")).click();
		    		
		    	} catch (Exception e) {
		    		System.out.println("no popup");
		    	}
		    	Thread.sleep(9000);
		    	try {
		    		driver.findElement(By.xpath("//*[@id='close']/img")).click();
		    		
		    	} catch (Exception e) {
		    		System.out.println("no popup");
		    	}
	    }

	    @Given("click the menu in home page")
	    public void click_the_menu_in_home_page() throws InterruptedException {
	    	OccupationPOM rp=new OccupationPOM(driver);
	    	Thread.sleep(7000);
	    	Base.btnclick(rp.getMenu());
	    }

	    @When("Go to edit PI and click it")
	    public void go_to_edit_PI_and_click_it() throws InterruptedException {
	    	OccupationPOM rp=new OccupationPOM(driver);
	    	Thread.sleep(5000);
	    	JavascriptExecutor js = (JavascriptExecutor)driver;
	  	  WebElement edit= driver.findElement(By.xpath("//*[@id='rightmenu']/ion-row[16]/ion-col"));
	  	  js.executeScript("arguments[0].scrollIntoView(true);",edit);
	  	Thread.sleep(5000);
	  	Base.btnclick(rp.getEditprofile());
	  	Thread.sleep(4000);
	    }

	    @Then("Click the professional Information in edit PI.")
	    public void click_the_professional_Information_in_edit_PI() throws InterruptedException {
	    	OccupationPOM rp=new OccupationPOM(driver);
	    	Thread.sleep(5000);
	    //	JavascriptExecutor js = (JavascriptExecutor)driver;
		  //	  WebElement prof= driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-editprofile/ion-content/div[2]/ion-grid[11]"));
		  	//  js.executeScript("arguments[0].scrollIntoView(true);",prof);
		  	
		  	  
	    }

	    @Then("Go to occupation field")
	    public void go_to_occupation_field() throws InterruptedException {
	    	OccupationPOM rp=new OccupationPOM(driver);
	    	Thread.sleep(8000); 
	    	 WebElement prof1= driver.findElement(By.xpath("/html/body/ion-app/ng-component/ion-nav/page-editprofile/ion-content/div[2]/ion-grid[11]/ion-row[1]/ion-col[2]"));
	    	 prof1.click();
	    }

	    @Then("verify all the list of occupation with existing criteria")
	    public void verify_all_the_list_of_occupation_with_existing_criteria() throws InterruptedException {
	    	OccupationPOM rp=new OccupationPOM(driver);
	    	Thread.sleep(8000); 
	    	
	    	Base.btnclick(rp.getCurrentoccup());
	    	for (int i = 1; i <=138; i++) {
	        	try {
	        		Thread.sleep(4000);
	        		driver.findElement(By.xpath("//*[@id='commonmenu']/div/menucontent/ion-header/ion-searchbar/div/input"));
	        		Thread.sleep(5000);	
	    	        Robot r =new Robot();
	    	        r.keyPress(KeyEvent.VK_CONTROL);
	    	        r.keyPress(KeyEvent.VK_A);
	    	        r.keyPress(KeyEvent.VK_BACK_SPACE);
	    	        r.keyRelease(KeyEvent.VK_CONTROL);
	    	        r.keyRelease(KeyEvent.VK_A);
	    	        r.keyRelease(KeyEvent.VK_BACK_SPACE);
	    				
	        		Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id='commonmenu']/div/menucontent/ion-header/ion-searchbar/div/input")).sendKeys(Base.readValueFromExcelSheet().get(i).get("Type"));
					Thread.sleep(4000);
				
					List<WebElement> select =	driver.findElements(By.xpath("//*[@id='commonmenu']/div"));
					 for(WebElement element : select) {
					        element.click();
					    }
		        
				
			
					
				//	Thread.sleep(3000);
				//	driver.findElement(By.xpath("//*[@id='commonmenu']/div/menucontent/ion-header/ion-searchbar/div/input")).clear();
					Thread.sleep(3000);
					Base.btnclick(rp.getCurrentoccup());
				    } catch (Exception e) {
					
				}
			
	        	
	        }  
	      
	    }
	         
}



