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
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.relevantcodes.extentreports.LogStatus;

import pom.BaseTest;
import pom.LoginLogoutPOM;



public class LoginLogout extends BaseTest{
	public static WebDriver driver;

	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali2\\drivernew\\chromedriver.exe"; 

	
       @BeforeMethod
       public void setUp1() throws MalformedURLException {
           System.setProperty("webdriver.chrome.driver", driverExecutablePath);
           Map<String, String> mobileEmulation = new HashMap<String, String>();
           mobileEmulation.put("deviceName", "Pixel 2");

           ChromeOptions chromeOptions = new ChromeOptions();
           chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
           chromeOptions.addArguments("--disable-notifications");
           driver = new ChromeDriver(chromeOptions);
    	
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

           
       }
       
       @Test
       public void testUntitled() throws Throwable {
    	   LoginLogoutPOM rp=new LoginLogoutPOM(driver);
    	   Thread.sleep(5000);
    	   logger =  report.startTest("Pakistani Login Test");
   	    driver.get("https://m.pakistanimatrimony.com/cbsmob/login.php");
   	    logger.log(LogStatus.PASS, "URL Launched Successfully");
   	    driver.manage().window().maximize();
   	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	    
   	    WebElement e=driver.findElement(By.xpath("//input[@formcontrolname='idEmail']"));
   		Actions a=new Actions(driver);	
   		Thread.sleep(4000);
   		a.sendKeys(e,"PAK755447").build().perform();
   	   
   	 logger.log(LogStatus.PASS, "Matri Id entered Successfully");
   	    Thread.sleep(4000); 
   	    
   	    WebElement d=driver.findElement(By.xpath("//input[@formcontrolname='password']"));
   	    Thread.sleep(4000);
   		Actions b=new Actions(driver);
   		Thread.sleep(4000);
   		b.sendKeys(d,"testpass").build().perform();
   		logger.log(LogStatus.PASS, "Password entered Successfully");
   		
   		
   	  Thread.sleep(4000);
   	BaseTest.click(rp.getLogin());
   	logger.log(LogStatus.PASS, "Login Successfully with this Matriid PAK755447");
   	
   	try {
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-intermediatesegment/ion-content/div[2]/span")).click();
	} catch (Exception e2) {
	}
   	
   	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
   	
   	Thread.sleep(4000);
   	BaseTest.click(rp.getSetting());
   	logger.log(LogStatus.PASS, "Intermediate page handled Successfully");
   	
   	Thread.sleep(4000);
   	BaseTest.click(rp.getLogout());
   	
   	logger.log(LogStatus.PASS, "Logout Successfully");
   	report.endTest(logger);
   	
   	
   	report.flush();
 
   	//mail
   	Thread.sleep(4000);
	BaseTest.reportflush(); 
	 
   	
}
       
       @AfterMethod
       public void mailReport(ITestResult status) throws Throwable {
    	   Thread.sleep(4000);
    	   BaseTest.getScreenshot(driver, "Loginlogout");
    	   
    		Thread.sleep(4000);
   
//		try {
//			 failedstatus=status.getThrowable().getMessage();
//			 String[] failedstatus1=failedstatus.split("(Session");
//	    	 failedstatus=failedstatus1[0].toString();
//		} catch (Exception e) {
//			
//		}
		 	
    	
    		
    		
    		
    		
    		
    		
    		
    		
    		
    			 
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

			 try {
			String[] splt = url.split("https://mobile.pakistanimatrimony.com/#/");
			 Error_on = splt[1].toString();
			System.out.println(Error_on);

//			String[] b = a.split("://");
//			String c = b[1].toString();
//			System.out.println(c);
//
//			String[] d = c.split("/");
//			domain = d[0].toString();
//			System.out.println(domain);
//			
//		//	error = result.getName();
//
//			error = d[2].toString();
//			System.out.println(error);
  
			Throwable exceptio = status.getThrowable();
			String exception = exceptio.getMessage();
			// System.out.println(exception);

			/*String except = exception.toString();
			System.out.println(except);*/

			String[] ex = exception.split(":");
			 expt = ex[0].toString();
			System.out.println(expt);

//			String exp = ex[1].toString().trim();
//			System.out.println("2" + exp);
//
//			String expti = ex[2].toString();
//
//			String exptio = ex[3].toString();
//			System.out.println(expti + " : " + exptio);
			
   } catch (Exception e) {
		
	}

    			 }
      		
    	   if (status.getStatus()==1) {
    		   
		if (BaseTest.getExcelData("SMS", 1, 1).equals("2")) {
			BaseTest.reportflush();
		    BaseTest.sendVFSms(domain, Error_on, date1);	
		    int a1 = status.getStatus();  
		    String aa1 = Integer.toString(a1);
   			BaseTest.setExcelData("SMS", 1, 1, aa1);
		}		
				
		} else if (status.getStatus()==2) {
			 BaseTest.reportflush1();       
		        BaseTest.sendVFSms1(Error_on, date1,expt);
		        int a2 = status.getStatus();
		        String aa2 = Integer.toString(a2);
				BaseTest.setExcelData("SMS", 1, 1, aa2);
			
		} 
    	   
    	   
    	   
    	   
    	   
 /////////////////////////////////////////////////////////////////////////////////////////////////////   	  
    
    	   
    	   
    	   

	}
}