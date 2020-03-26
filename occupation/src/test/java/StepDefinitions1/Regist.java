package StepDefinitions1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucu.occupation.Base;
import cucu.occupation.RegistrationPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Regist {
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\occupation\\driver\\chromedriver.exe";
	    @Given("select any one of the categery in create profile for")
	    public void user_in_the_login_page() throws InterruptedException, AWTException {
	    	System.setProperty("webdriver.chrome.driver", driverExecutablePath);
            Map<String, String> mobileEmulation = new HashMap();
            mobileEmulation.put("deviceName", "Pixel 2");

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
            chromeOptions.addArguments("--disable-notifications");
            driver = new ChromeDriver(chromeOptions);


			driver.get("https://stgwap.tamilmatrimony.com/mobwap/registration/register.php");
			Thread.sleep(10000);  
	        RegistrationPOM rp= new RegistrationPOM(driver);
	       
	        driver.findElement(By.xpath("//*[@id='REGISPROFILECREATEDHASHEXT']")).click();
	        Thread.sleep(5000);
	        WebElement ref=driver.findElement(By.xpath("//*[@id=\'selection_filter\']"));
	        ref.sendKeys("Son");
	        Thread.sleep(5000);
	        Base.btnclick(rp.getPersonchoose());
	        
	    }

	    @Given("enter the user name")
	    public void enter_the_user_name(DataTable username) throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	        Thread.sleep(5000);
	        Map<String, String> asMap = username.asMap(String.class,String.class);
	    	Thread.sleep(5000);
	    	Base.btnclick(rp.getUsername());
	    	Thread.sleep(4000);
	    	Base.setText(rp.getUsername(),asMap.get("username"));
	    	
	        
	    }
	    @Given("select the gender")
	    public void select_the_gender() throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id=\"maleradio\"]")).click();
	    }
	    
	    @Given("user should select the date of birth")
	    public void user_should_select_the_date_of_birth() throws InterruptedException, AWTException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	        Thread.sleep(5000);
	        WebElement ref=driver.findElement(By.xpath("//*[@id='day']"));
	        ref.sendKeys("5");
	        Robot r= new Robot();
	        r.keyPress(KeyEvent.VK_ENTER);
	        r.keyRelease(KeyEvent.VK_ENTER);
	        Thread.sleep(5000);
	        WebElement ref1=driver.findElement(By.xpath("//*[@id='month']"));
	        ref1.sendKeys("Aug");
	        Robot r1= new Robot();
	        r1.keyPress(KeyEvent.VK_ENTER);
	        r1.keyRelease(KeyEvent.VK_ENTER);
	        Thread.sleep(5000);
	        WebElement ref2=driver.findElement(By.xpath("//*[@id='year']"));
	        ref2.sendKeys("1993");
	        Robot r2= new Robot();
	        r2.keyPress(KeyEvent.VK_ENTER);
	        r2.keyRelease(KeyEvent.VK_ENTER);
	        
	    }
	    @Then("Select the country code")
	    public void select_the_country_code() throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	        Thread.sleep(5000);
	        Base.btnclick(rp.getCountrycode());
	        Thread.sleep(5000);
	        WebElement ref=driver.findElement(By.xpath("//*[@id='selection_filter']"));
	        ref.sendKeys("india");
	        Thread.sleep(5000);
	        Base.btnclick(rp.getCountryselected());
	        }
    
	    @When("enter the mobile number")
	    public void enter_the_mobile_number(DataTable phonenumber) throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	        Thread.sleep(5000);
	        Map<String, String> asMap = phonenumber.asMap(String.class,String.class);
	        Thread.sleep(5000);
	        Base.btnclick(rp.getPhonenumber());
	        Thread.sleep(5000);
	        Base.setText(rp.getPhonenumber(),asMap.get("phonenumber"));
	    }
	    
	    @Then("enter the password")
	    public void enter_the_password(DataTable password) throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	        Thread.sleep(5000); 
	        Map<String, String> asMap = password.asMap(String.class,String.class);
	        Thread.sleep(5000);
	        Base.btnclick(rp.getPassword());
	        Thread.sleep(5000);
	        Base.setText(rp.getPassword(),asMap.get("password"));
	        
	    }
	   
	   

	    @Given("select the religion")
	    public void select_the_religion() throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	        Thread.sleep(5000);
	      Base.btnclick(rp.getReligion());
	      Thread.sleep(5000);
	        WebElement ref=driver.findElement(By.xpath("//*[@id='selection_filter']"));
	        ref.sendKeys("Hindu");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id='scroller']/ul/li[1]")).click();
	    }

	    @When("select the mother tongue")
	    public void select_the_mother_tongue() throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	        Thread.sleep(6000);
	    //    Base.btnclick(rp.getMothertongue());
	      //  Thread.sleep(5000);
	        //WebElement ref=driver.findElement(By.xpath("//*[@id='selection_filter']"));
	       // ref.sendKeys("Tamil");
	       // Thread.sleep(5000);
	       // driver.findElement(By.xpath("//*[@id='scroller']/ul/li[12]")).click();
	        
	    }

	    @Then("click the button register free")
	    public void click_the_button_register_free() throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	        Thread.sleep(5000);
	        Base.btnclick(rp.getRegister());
	    }
	   
	    @Given("Enter the valid email id")
	    public void enter_the_valid_email_id() throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	        Thread.sleep(5000); 
	        WebElement ref=driver.findElement(By.xpath("//*[@id='EMAIL']"));
	        ref.sendKeys("ashok95@gmail.com");
	    }

	    @Given("Select the caste")
	    public void select_the_caste() throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	        Thread.sleep(5000);
	        Base.btnclick(rp.getCaste());
	        Thread.sleep(4000);
	        WebElement ref=driver.findElement(By.xpath("//*[@id='selection_filter']"));
	        ref.sendKeys("Agarwal");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id='scroller']/ul/li[2]")).click();
	        
	        Thread.sleep(4000);
	        Base.btnclick(rp.getSubcaste());
	        Thread.sleep(4000);
	        WebElement ref2=driver.findElement(By.xpath("//*[@id='selection_filter']"));
	        ref2.sendKeys("Bisa");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id='scroller']/ul/li[1]")).click();
	        
	        
	      }

	    @Given("Select the dosham")
	    public void select_the_dosham() throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	        Thread.sleep(7000); 
	        driver.findElement(By.xpath("//*[@id='mangalik1']/fieldset/div/div[2]/label")).click();
	    }

	    @Then("Select the martial status")
	    public void select_the_martial_status() throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	        Thread.sleep(5000); 
	        Base.btnclick(rp.getMaritalstatus());
	        Thread.sleep(4000);
	        WebElement ref=driver.findElement(By.xpath("//*[@id='selection_filter']"));
	        ref.sendKeys("Never Married");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id='scroller']/ul/li[1]")).click();
	    }

	    @Then("select the family information")
	    public void select_the_family_information() throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	        Thread.sleep(5000); 
	        Base.btnclick(rp.getFamilystatus());
	        WebElement ref=driver.findElement(By.xpath("//*[@id='selection_filter']"));
	        ref.sendKeys("Rich");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id='scroller']/ul/li[3]")).click();
	        
	        
	        Thread.sleep(5000); 
	        Base.btnclick(rp.getFamilytype());
	        WebElement ref1=driver.findElement(By.xpath("//*[@id='selection_filter']"));
	        ref1.sendKeys("Joint");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id='scroller']/ul/li[1]")).click();
	        
	        Thread.sleep(5000);
	        JavascriptExecutor js = (JavascriptExecutor)driver;
		  	  WebElement family= driver.findElement(By.xpath("//*[@id='FAMILYVALUE']"));
		  	  js.executeScript("arguments[0].scrollIntoView(true);",family);
	        
	        Thread.sleep(5000); 
	        Base.btnclick(rp.getFamilyvalue());
	        WebElement ref2=driver.findElement(By.xpath("//*[@id='selection_filter']"));
	        ref2.sendKeys("Moderate");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id='scroller']/ul/li[3]")).click();
	        
	        //continue
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//*[@id='usamecaste']/div[8]/div/div/input")).click();	        
	        
	    }
	    
	    @Given("User should enter the height")
	    public void user_should_enter_the_height() throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	        Thread.sleep(5000); 
	        Base.btnclick(rp.getHeight());
	        Thread.sleep(5000);
	    	WebElement ref2=driver.findElement(By.xpath("//*[@id='selection_filter']"));
	        ref2.sendKeys("5ft 5in");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id='scroller']/ul/li[12]")).click();
	        
	        
	    }

	    @Given("Select any one of the physical status")
	    public void select_any_one_of_the_physical_status() throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	        Thread.sleep(5000); 
	        driver.findElement(By.xpath("//*[@id='uphysical']/fieldset/div/div[1]/div[1]/div/label")).click();
	        
	    }

	    @Given("Select any one of the education in the list")
	    public void select_any_one_of_the_education_in_the_list() throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	    	Thread.sleep(5000);
	    	Base.btnclick(rp.getEducation());
	        Thread.sleep(5000); 
	        WebElement ref2=driver.findElement(By.xpath("//*[@id='selection_filter']"));
	        ref2.sendKeys("BE");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id='scroller']/ul/li[5]")).click();
	    }

	    @Then("Select any one of the employed in the list")
	    public void select_any_one_of_the_employed_in_the_list() throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	    	 Thread.sleep(5000); 
	    	 Base.btnclick(rp.getEmployed());
	        Thread.sleep(5000); 
	        WebElement ref2=driver.findElement(By.xpath("//*[@id='selection_filter']"));
	        ref2.sendKeys("Private");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id='scroller']/ul/li[2]")).click();
	    }

	    @Then("select the occupation and verify all the occupation")
	    public void select_the_occupation_and_verify_all_the_occupation() throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	    	Thread.sleep(5000);
	    	Base.btnclick(rp.getOccupation());
	    	for (int i = 1; i <=138; i++) {
	        	try {
	        		Thread.sleep(4000);
	        		driver.findElement(By.xpath("//*[@id=\'selection_filter\']")).clear();
	    	    	
	        //		Thread.sleep(5000);	
	    	//        Robot r =new Robot();
	    	//        r.keyPress(KeyEvent.VK_CONTROL);
	    	//        r.keyPress(KeyEvent.VK_A);
	    	 //       r.keyPress(KeyEvent.VK_BACK_SPACE);
	    	//        r.keyRelease(KeyEvent.VK_CONTROL);
	    	//        r.keyRelease(KeyEvent.VK_A);
	    	//        r.keyRelease(KeyEvent.VK_BACK_SPACE);
	    				
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@id=\'selection_filter\']")).sendKeys(Base.readValueFromExcelSheet().get(i).get("Type"));
					
					Thread.sleep(7000);
				List<WebElement> ref = driver.findElements(By.xpath("//*[@id='scroller']/ul"));
				 for(WebElement element : ref) {
				        element.click();
				    }
				
					Thread.sleep(5000);
	    	Base.btnclick(rp.getOccupation());
	    	
	        Thread.sleep(5000); 
	        	} catch (Exception e) {
					System.out.println(i +":  no Occupation:  "+Base.readValueFromExcelSheet().get(i).get("Type"));
				}
	    	}
	    }

	    @Then("select the rupees and annual income")
	    public void select_the_rupees_and_annual_income() throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	    	Thread.sleep(3000);
	    	JavascriptExecutor js = (JavascriptExecutor)driver;
	    	  WebElement edit= driver.findElement(By.xpath("//*[@id=\\'INCOMECURRENCYHASH\\']"));
		  	  js.executeScript("arguments[0].scrollIntoView(true);",edit);
	    	
	    	
	    	
	    	Thread.sleep(5000);
	    	Base.btnclick(rp.getRs());
	    	Thread.sleep(5000);
	    	 WebElement ref2=driver.findElement(By.xpath("//*[@id='selection_filter']"));
		        ref2.sendKeys("Rs.");
		        Thread.sleep(5000);
		        driver.findElement(By.xpath("//*[@id='scroller']/ul/li[71]")).click();
		        
		        Thread.sleep(5000);
		        Base.btnclick(rp.getIncome());
		        
		        Thread.sleep(5000);
		    	 WebElement ref3=driver.findElement(By.xpath("//*[@id='selection_filter']"));
			        ref3.sendKeys("5 - 6 Lakhs");
			        Thread.sleep(5000);
			        driver.findElement(By.xpath("//*[@id='scroller']/ul/li[6]")).click();
	    }

	    @Then("select the work location and residing state")
	    public void select_the_work_location_and_residing_state() throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	    	Thread.sleep(5000);
	    	Base.btnclick(rp.getCountry());
	    	  Thread.sleep(5000);
		    	 WebElement ref3=driver.findElement(By.xpath("//*[@id='selection_filter']"));
			        ref3.sendKeys("India");
			        Thread.sleep(5000);
			        driver.findElement(By.xpath("//*[@id='scroller']/ul/li[110]")).click();
			        
			        Thread.sleep(5000);
			    	Base.btnclick(rp.getState());
			    	  Thread.sleep(5000);
				    	 WebElement ref4=driver.findElement(By.xpath("//*[@id='selection_filter']"));
					        ref4.sendKeys("Tamil Nadu");
					        Thread.sleep(5000);
					        driver.findElement(By.xpath("//*[@id='scroller']/ul/li[31]")).clear();
					        
					        Thread.sleep(5000);
					        Base.btnclick(rp.getCity());
					        Thread.sleep(5000);
					    	 WebElement ref5=driver.findElement(By.xpath("//*[@id='selection_filter']"));
						        ref5.sendKeys("Chennai");
						        Thread.sleep(5000);
						        driver.findElement(By.xpath("//*[@id='scroller']/ul/li[1]")).click();
						        
	    }

	    @Then("click the contine button")	
	    public void click_the_contine_button() throws InterruptedException {
	    	RegistrationPOM rp= new RegistrationPOM(driver);
	    	Thread.sleep(5000);
	    	Base.btnclick(rp.getSubmit());
	       
	    }





}
