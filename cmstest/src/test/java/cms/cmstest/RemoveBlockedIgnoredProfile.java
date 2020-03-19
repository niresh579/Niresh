package cms.cmstest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import org.openqa.selenium.By;
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

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class RemoveBlockedIgnoredProfile extends Base {
	public static WebDriver driver;
	String  driverExecutablePath = "C:\\\\Users\\\\CBS Testing\\\\workspace\\\\Niresh\\\\cmstest\\\\drivernew\\\\chromedriver.exe";
	  ExtentReports report;
      ExtentTest logger;
        @BeforeMethod
        public void setUp1() throws MalformedURLException {
            System.setProperty("webdriver.chrome.driver", driverExecutablePath);
            Map<String, String> mobileEmulation = new HashMap<>();
            mobileEmulation.put("deviceName", "Pixel 2");

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
            chromeOptions.addArguments("--disable-notifications");
            driver = new ChromeDriver(chromeOptions);
           
            
//            ExtentReports report;
//            ExtentTest logger;
//            private String reportDirectory = "reports";
//            private String reportFormat = "xml";
//            private String testName = "Untitled";
//            protected AndroidDriver<AndroidElement> driver = null;
//
//            DesiredCapabilities dc = new DesiredCapabilities();
//            
//            @BeforeTest
//            public void setUp() throws MalformedURLException {
//            	   dc.setCapability("reportDirectory", reportDirectory);
//                   dc.setCapability("reportFormat", reportFormat);
//                   dc.setCapability("testName", testName);
//                   dc.setCapability(MobileCapabilityType.UDID, "ZDHUTW49BMOZAU8T");
//                   dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
//                   dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
//                   driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
//                   driver.setLogLevel(Level.INFO);


            
        }
        
        @Test
        public void testUntitled() throws InterruptedException { 
         IgnoredProfilePOM rp = new IgnoredProfilePOM(driver);
         driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
		    driver.manage().window().maximize();
		    
        
		    
		    //login
		    Thread.sleep(3000);
		    Base.btnclick(rp.getUsername());
		    Actions a=new Actions(driver);
			Thread.sleep(4000);
			a.sendKeys("IYR242926").build().perform();
		    
		    Thread.sleep(4000);
		    Base.btnclick(rp.getPassword());
		    Thread.sleep(4000);
			Actions b=new Actions(driver);
			Thread.sleep(4000);
			b.sendKeys("cbstest").build().perform();
		    
		  Thread.sleep(4000);
		  Base.btnclick(rp.getLogin());
		  
		  try {
			  Thread.sleep(5000);
				driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
				 
		} catch (Exception e) {
			
		}
		 
		  try {
			  Thread.sleep(4000);
				driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a")).click();
				
		} catch (Exception e) {
			
		}
		
		  try {
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//span[@class='ficon icon-menu'])[2]")).click();
			  
		} catch (Exception e) {
		}
		  
		  Thread.sleep(4000);
		  Base.btnclick(rp.getSetting());
		  
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list/ion-item[1]")).click();
		  
		  List<WebElement> demo=driver.findElements(By.xpath("//ion-icon[@class='posabsolute right0 icon icon-md']"));
		  System.out.println("Total number of blocked profiles" +demo.size());
		  
		  for (int i = 1; i < demo.size(); i++) {
			
			  driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-shortlisted/ion-content/div[2]/ion-list/ion-row["+i+"]/ion-grid/ion-row[1]/ion-col[2]/div[3]/ion-row/ion-col/ion-icon"));
			  Thread.sleep(4000);
			  demo.get(i).click();
			  
			  
			  Thread.sleep(4000);
			  driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-shortlisted/ion-content/div[2]/ion-list/ion-row/ion-grid/ion-row[1]/ion-col[2]/div[3]/ion-row/ion-col[2]/ion-list/button")).click();

		}
		  
		  
		  
		  
//		  Thread.sleep(4000);
//		  driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-shortlisted/ion-content/div[2]/ion-list/ion-row/ion-grid/ion-row[1]/ion-col[2]/div[3]/ion-row/ion-col[2]/ion-icon")).click();
//
//		  
		  
		  
		  
		  
		  
		  
}
}