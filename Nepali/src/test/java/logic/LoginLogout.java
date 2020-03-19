package logic;

import java.net.MalformedURLException;
import java.util.HashMap;
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

import com.relevantcodes.extentreports.LogStatus;

import pom.BaseTest;
import pom.LoginLogoutPOM;


public class LoginLogout extends BaseTest{
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali\\drivernew\\chromedriver.exe"; 

	
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
    	   logger =  report.startTest("Nepali Login Logout Test");
    	   driver.get("https://m.nepalimatrimony.com/cbsmob/login.php");
    	   logger.log(LogStatus.PASS, "URL Launched Successfully");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		    
		    
		    //login
		    WebElement e=driver.findElement(By.xpath("//ion-input[@formcontrolname='idEmail']"));
			Actions a=new Actions(driver);
			Thread.sleep(4000);
			a.sendKeys(e,"Nep140549").build().perform();
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
		logger.log(LogStatus.PASS, "Login Successfully with this Matriid Nep140549");
	   	
   	Thread.sleep(4000);
   	driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
   	
   	Thread.sleep(4000);
   	BaseTest.click(rp.getSetting());
   	logger.log(LogStatus.PASS, "Intermediate page handled Successfully");
   	
   	Thread.sleep(4000);
   	BaseTest.click(rp.getLogout());
   	logger.log(LogStatus.PASS, "Logout Succesfully");
    
    report.endTest(logger);
     	
     	report.flush();	 
      	 
	 
   	
}
}