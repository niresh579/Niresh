package logic;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BaseTest;
import test.srilanka.SendInterestmatchesPOM;


public class SendInterestMatches extends BaseTest {
	public static WebDriver driver;
    String driverExecutablePath = "C:\\\\Users\\\\CBS Testing\\\\workspace\\\\Niresh\\\\cmstest\\\\drivernew\\\\chromedriver.exe";

     
      @BeforeMethod
      public void setUp1() throws MalformedURLException {
          System.setProperty("webdriver.chrome.driver", driverExecutablePath);
          Map<String, String> mobileEmulation = new HashMap<String, String>();
          mobileEmulation.put("deviceName", "Pixel 2");

          ChromeOptions chromeOptions = new ChromeOptions();
          chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
          chromeOptions.addArguments("--disable-notifications");
          driver = new ChromeDriver(chromeOptions);
         
          
//        ExtentReports report;
//        ExtentTest logger;
//        private String reportDirectory = "reports";
//        private String reportFormat = "xml";
//        private String testName = "Untitled";
//        protected AndroidDriver<AndroidElement> driver = null;
//
//        DesiredCapabilities dc = new DesiredCapabilities();
//        
//        @BeforeTest
//        public void setUp() throws MalformedURLException {
//        	   dc.setCapability("reportDirectory", reportDirectory);
//               dc.setCapability("reportFormat", reportFormat);
//               dc.setCapability("testName", testName);
//               dc.setCapability(MobileCapabilityType.UDID, "ZDHUTW49BMOZAU8T");
//               dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
//               dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
//               driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
//               driver.setLogLevel(Level.INFO);

        }
        
        @Test
        public void testUntitled() throws InterruptedException {
        	SendInterestmatchesPOM rp=new SendInterestmatchesPOM(driver);
        	logger =  report.startTest("Srilankan Send Interest Matches Test");
     	   Thread.sleep(5000);
 		    driver.get("https://mobile.srilankanmatrimony.com/#/login");
 		    logger.log(LogStatus.PASS, "URL Launched Successfully");
 		    driver.manage().window().maximize();
 		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		    
 		    
 		    //login
 		    WebElement e=driver.findElement(By.xpath("//ion-input[@formcontrolname='idEmail']"));
 			Actions a=new Actions(driver);
 			Thread.sleep(4000);
 			a.sendKeys(e,"LKA750006").build().perform();
 			 logger.log(LogStatus.PASS, "Matri Id entered Successfully");
 		    Thread.sleep(4000);
 		    
 		    WebElement d=driver.findElement(By.xpath("//ion-input[@formcontrolname='password']"));
 		    Thread.sleep(4000);
 			Actions b=new Actions(driver);
 			Thread.sleep(4000);
 			b.sendKeys(d,"cbstest").build().perform();
 			logger.log(LogStatus.PASS, "Password entered Successfully");
 		  Thread.sleep(4000);
 		BaseTest.click(rp.getLogin());
 		logger.log(LogStatus.PASS, "Login Successfully with this Matriid LKA750006");
  		try {
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-intermediatesegment/ion-content/div[2]/span")).click();
		} catch (Exception e2) {
		}
  		
		  Thread.sleep(6000);
		  BaseTest.click(rp.getMatches());
		  logger.log(LogStatus.PASS, "Handling Intermediate Pages");	
			 
		  //scenarios
		  logger.log(LogStatus.PASS, "Validation");
		  List<WebElement> name= driver.findElements(By.xpath("//span[@class='matriid_txt']"));
		 // System.out.println("users :" +name.size());
		  for (int i = 1; i < name.size(); i++) {
			Thread.sleep(4000);
			name.get(i).click();
		}
		  
		 //send interest
		  
		  
		 	 Thread.sleep(4000);
			 List<WebElement> ref3 = driver.findElements(By.xpath("//span[contains(text(),'Send Interest')]"));
			  System.out.println("Total users : "+ ref3.size());
			  for (int j = 0; j < ref3.size(); j++) {
		     Thread.sleep(4000);
		     
			ref3.get(j).click();
			
			//send mail
			Thread.sleep(5000);
			ref3.get(j).click();
			
			Thread.sleep(4000);
			WebElement upgrade = driver.findElement(By.xpath("(//span[contains(text(),'Upgrade Now')])[3]"));
			String verify=	upgrade.getText();
	
			if (verify.equals("Upgrade Now")) {
				System.out.println("matched");
			}
			else {
				System.out.println("Not matched");
			}
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/mailpopup/ion-content/div[2]/div/div/span/button")).click();
			
			  }
			  
		    
			  logger.log(LogStatus.PASS, "Logout Succesfully");
	      	   
	    	  report.endTest(logger);
	    	   	
	    	   	report.flush();
	          
        	
        	
        	
        	
        	
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}