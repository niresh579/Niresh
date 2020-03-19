	package Logic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import pom.PrivacySettingPom;
import pom.SearchPom;

public class PrivacySetting extends BaseTest {
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\Negative\\drivernew\\chromedriver.exe"; 
	 ExtentReports report;
     ExtentTest logger;
       @BeforeMethod
       public void setUp1() throws MalformedURLException {
           System.setProperty("webdriver.chrome.driver", driverExecutablePath);
           Map<String, String> mobileEmulation = new HashMap<String, String>();
           mobileEmulation.put("deviceName", "Pixel 2");

           ChromeOptions chromeOptions = new ChromeOptions();
           chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
           chromeOptions.addArguments("--disable-notifications");
           driver = new ChromeDriver(chromeOptions);
          
           
//           ExtentReports report;
//           ExtentTest logger;
//           private String reportDirectory = "reports";
//           private String reportFormat = "xml";
//           private String testName = "Untitled";
//           protected AndroidDriver<AndroidElement> driver = null;
//
//           DesiredCapabilities dc = new DesiredCapabilities();
//           
//           @BeforeTest
//           public void setUp() throws MalformedURLException {
//           	   dc.setCapability("reportDirectory", reportDirectory);
//                  dc.setCapability("reportFormat", reportFormat);
//                  dc.setCapability("testName", testName);
//                  dc.setCapability(MobileCapabilityType.UDID, "ZDHUTW49BMOZAU8T");
//                  dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
//                  dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
//                  driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
//                  driver.setLogLevel(Level.INFO);


           
           
       }
       
       @Test
       public void testUntitled() throws Throwable {
       	
    	   PrivacySettingPom rp= new PrivacySettingPom(driver);
       	Thread.sleep(5000);
		    driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    
		    //login
		    WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
			Actions a=new Actions(driver);
			Thread.sleep(4000);
			a.sendKeys(e,"AGR451052").build().perform();
		    
		    Thread.sleep(4000);
		    
		    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
		    Thread.sleep(4000);
			Actions b=new Actions(driver);
			Thread.sleep(4000);
			b.sendKeys(d,"cbstest").build().perform();
		    
		  Thread.sleep(4000);
		BaseTest.click(rp.getLogin()); 
          
        Thread.sleep(6000);
        driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
  
        Thread.sleep(4000);
        BaseTest.click(rp.getSetting());
        
        //privacy setting
        
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list/ion-item[5]")).click();
        
        
      //photo privacy
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-grid[2]/ion-row/ion-col/ion-list/ion-item[1]")).click();
        
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-grid[2]/ion-row/ion-col/ion-list/ion-item[2]")).click();
        
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//span[contains(text(),'VIEW LIST')])[1]")).click();
        
        //horoscope privacy
        
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-grid[3]/ion-row/ion-col/ion-list/ion-item[1]")).click();
        
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-grid[3]/ion-row/ion-col/ion-list/ion-item[2]")).click();
        
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//span[contains(text(),'VIEW LIST')])[2]")).click();
        
        
        //phone number privacy
        
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-grid[4]/ion-row/ion-col/ion-list/ion-item[1]")).click();
        
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-grid[4]/ion-row/ion-col/ion-list/ion-item[2]")).click();
        
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//span[contains(text(),'VIEW LIST')])[3]")).click();
        
        
        //profile view setting 
//        Thread.sleep(8000);
//	   	JavascriptExecutor js2 = (JavascriptExecutor)driver;
//	   	  WebElement edi2= driver.findElement(By.xpath("(//div[@class='toggle-icon'])[1]"));
//		  	  js2.executeScript("arguments[0].scrollIntoView(true);",edi2);
        
        try {
        	 Thread.sleep(4000);
             driver.findElement(By.xpath("(//button[@aria-checked='false'])[4]")).click();
             
		} catch (Exception e2) {
			// TODO: handle exception
		}
       
        try {
       	 Thread.sleep(4000);
            driver.findElement(By.xpath("(//button[@aria-checked='false'])[5]")).click();
            
		} catch (Exception e2) {
			// TODO: handle exception
		}
        
        try {
       	 Thread.sleep(4000);
            driver.findElement(By.xpath("(//button[@aria-checked='true'])[4]")).click();
            
		} catch (Exception e2) {
			// TODO: handle exception
		}
      
       try {
      	 Thread.sleep(4000);
           driver.findElement(By.xpath("(//button[@aria-checked='true'])[5]")).click();
           
		} catch (Exception e2) {
			// TODO: handle exception
		}
        
        
      
       
}
}