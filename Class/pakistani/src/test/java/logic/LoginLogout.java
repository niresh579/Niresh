package logic;

import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pom.BaseTest;
import pom.Horoscope;
import pom.Inbox;
import pom.LoginLogoutPOM;


public class LoginLogout extends BaseTest{
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali\\driver\\chromedriver.exe"; 

	
       @BeforeMethod
       public void setUp() {
   		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali2\\drivernew\\chromedriver.exe");
   		ChromeOptions options = new ChromeOptions();
   		options.addArguments("--disable-notifications");
   		 driver = new ChromeDriver(options);
   }
           
//         ExtentReports report;
//         ExtentTest logger;
//         private String reportDirectory = "reports";
//         private String reportFormat = "xml";
//         private String testName = "Untitled";
//         protected AndroidDriver<AndroidElement> driver = null;
//
//         DesiredCapabilities dc = new DesiredCapabilities();
//         
//         @BeforeTest
//         public void setUp() throws MalformedURLException {
//         	   dc.setCapability("reportDirectory", reportDirectory);
//                dc.setCapability("reportFormat", reportFormat);
//                dc.setCapability("testName", testName);
//                dc.setCapability(MobileCapabilityType.UDID, "ZDHUTW49BMOZAU8T");
//                dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
//                dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
//                driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
//                driver.setLogLevel(Level.INFO);

    
       
       @Test
       public void testUntitled() throws Throwable {
    	   Inbox i = new Inbox(driver);
    	   Horoscope h = new Horoscope(driver);
    	   logger =  report.startTest("Pakistani Login Test"); 
    	   driver.get("https://www.Pakistanimatrimony.com");
    	   logger.log(LogStatus.PASS, "URL Launched Successfully"); 
    	   driver.manage().window().maximize();
    	   Thread.sleep(3000);
    	   BaseTest.click(i.getMatriId());
    	   BaseTest.typeData(i.getMatriId(), "Pak852749");
    	   logger.log(LogStatus.PASS, "Matri Id entered Successfully"); 
    	   BaseTest.click(i.getPaswwordclr());		
    	   
    	   BaseTest.typeData(i.getPassword(), "cbstest");
    	   logger.log(LogStatus.PASS, "Password entered Successfully"); 
    	    BaseTest.click(i.getLoginbtn());
    	   logger.log(LogStatus.PASS, "Login Successfully with this Matriid Nep140549"); 
    	   System.out.println("logged in Successfully");
    	   try {
    			WebElement photo_add = driver.findElement(By.xpath("/html/body/div[2]/a"));
    			if (photo_add.isDisplayed()) {
    				photo_add.click();
    				driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
    				driver.findElement(By.xpath("//*[@id=\"reason3\"]")).click();
    				driver.findElement(By.xpath("//*[@id=\"skipphotoclick\"]")).click();
    				
    			}
    			
    		} catch (Exception e) {
    			System.out.println("Photo Page Skipped");
    		}
    		
    		
    		try {
    			WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
    			if (skip_matches.isDisplayed()) {
    				skip_matches.click();
    				
    			}
    		} catch (Exception e) {
    			System.out.println("Intermediate pages handled");
    		}
    		
    		try {
    			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
    			if (element.isDisplayed()) {
    				element.click();
    				
    			}
    		} catch (Exception e) {
    			System.out.println("Intermediate pages handled");
    		}
    		//////////////////////  New ly Added  ///////////////////////////////
    		try {
    			WebElement skip_to_matriony = driver.findElement(By.xpath("/html/body/header/div/div/div/a"));
    			if (skip_to_matriony.isDisplayed()) {
    				skip_to_matriony.click();
    			}
    		} catch (Exception e) {
    			System.out.println("Intermediate pages handled");
    		}
    		
    		
    		try {
    			WebElement skip_to_matrimony1 = driver.findElement(By.xpath("/html/body/div[3]/a"));
    			if (skip_to_matrimony1.isDisplayed()) {
    				skip_to_matrimony1.click();
    			}
    		} catch (Exception e) {
    			System.out.println("Intermediate pages handled");
    		}
    		
    		
    		////////////////////////////////////////////////////////////////////////////////////
    		
    		try {
    			WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
    			if (divorcee_intermediate_skip.isDisplayed()) {
    				divorcee_intermediate_skip.click();
    				
    			}
    		} catch (Exception e) {
    			System.out.println("Intermediate pages handled");
    		}
    		
    		
    		try {
    			
    			WebElement horoscope = driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]"));
    			if (horoscope.isDisplayed()) {
    				horoscope.click();
    			}
    		} catch (Exception e) {
    			System.out.println("Intermediate pages handled");
    		}
    		
    		try {
    			driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
    		} catch (Exception e) {
    			System.out.println("No Intermediate pages");
    		}
    		
    		// AD Pages
    		 
    		 try {
    			 driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
    		} catch (Exception e) {
    			System.out.println("ADs Closed Successfully");
    		}
    		 
    		 logger.log(LogStatus.PASS, "Intermediate page handled Successfully");
    		 
    		 try {
    			 driver.findElement(By.xpath("//*[@id='special_offer_lightpic1']/div[1]/div/a/img")).click();

    		} catch (Exception e) {
    			// TODO: handle exception
    		}

    		 
    		 ///////////////////   MOuse Action to click on Edit Profile  //////////////
    		
    		 Actions acc = new Actions(driver);
    	
    		 Thread.sleep(7000);
    		 Thread.sleep(5000);
    		         
    				acc.moveToElement(h.getMenu_mouse_action()).build().perform();
    				Thread.sleep(5000);
    				
    				try {
    					acc.moveToElement(h.getMenu_mouse_action1()).build().perform();
    				} catch (Exception e) {
    					// TODO: handle exception
    				}
    				
    				try {
    					driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();

    				} catch (Exception e) {
    					// TODO: handle exception
    				}
    				try {
    					driver.findElement(By.xpath("//*[@id='userpop']/div[2]/div/div[3]/div[2]/ul/li[4]/a")).click();
    				} catch (Exception e) {
    					// TODO: handle exception
    				}
    				
    				Thread.sleep(3000);
    				logger.log(LogStatus.PASS, "Logout Successfully");
    			       report.endTest(logger);
    			       //report.flush();

    				System.out.println("Logged out successfully");
    		 

    }

       @AfterMethod
       public void mailReport(ITestResult status) throws Throwable {
  		 Thread.sleep(4000);
  		 BaseTest.getScreenshot(driver, "Registration");
    	 	
  		 Thread.sleep(4000);
  		try {
  			 failedstatus=status.getThrowable().getMessage();
  			 String[] failedstatus1=failedstatus.split("(Session");
  	    	 failedstatus=failedstatus1[0].toString();
  		} catch (Exception e) {
  			
  		}
  		 	
    	 
    	// System.out.println(failedstatus); 
    	 
    	
    	
    	 // System.out.println("failedresults"+failedstatus1[0]);
    	 
    	 
    			 
    			 // Create object of SimpleDateFormat class and decide the format
    			 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    			 
    			 //get current date time with Date()
    			 Date date = new Date();
    			 
    			 // Now format the date
    			 String date1= dateFormat.format(date);
    			 
    			 // Print the Date
    			 System.out.println(date1);
    			 
    			 if (status.getStatus()==2) {			
    	 	
    	 	 String url=driver.getCurrentUrl();
      		System.out.println(url);
      		
      		String[] a = url.split("://");
      		String b = a[1].toString();
      		System.out.println("Split 1 : "+b);
      		
      		String[] c = b.split("/");
      		 domain = c[0].toString();
      		System.out.println("Domain : " + domain);
      		
//      		 Error_on = c[2].toString();
//      		System.out.println("Error : "+Error_on);
    }  		
      	//error msg
//      		String Exception=status.getThrowable().getMessage();
//      		System.out.println("ecception result"+Exception);
      		
    	   if (status.getStatus()==1) {
    		   
  		if (BaseTest.getExcelData("SMS", 1, 3).equals("2")) {
  			BaseTest.reportflush();
  		    BaseTest.sendVFSms(domain, Error_on, date1);	
  		    int a1 = status.getStatus();  
  		    String aa1 = Integer.toString(a1);
   			BaseTest.setExcelData("SMS", 1, 3, aa1);
  		}		
  				
  		} else if (status.getStatus()==2) {
  			 BaseTest.reportflush1();       
  		        BaseTest.sendVFSms1(domain, Error_on, date1, failedstatus);
  		        int a2 = status.getStatus();
  		        String aa2 = Integer.toString(a2);
  				BaseTest.setExcelData("SMS", 1, 3, aa2);
  			
  		} 
    	   
  	    	   

    /////////////////////////////////////////////////////////////////////////////////////////////////////






    } 
    }