package cms.cmstest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class MatchesPhoto {
	public static WebDriver driver;
    String driverExecutablePath = "C:\\\\Users\\\\CBS Testing\\\\workspace\\\\Niresh\\\\cmstest\\\\drivernew\\\\chromedriver.exe";

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
        MatchesPhotoPOM rp = new MatchesPhotoPOM(driver);
      
    	Thread.sleep(5000);
	    driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
	    driver.manage().window().maximize();
	    
	    //login
	    WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
		Actions a=new Actions(driver);
		Thread.sleep(4000);
		a.sendKeys(e,"NEP137104").build().perform();
	    
	    Thread.sleep(4000);
	    
	    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
	    Thread.sleep(4000);
		Actions b=new Actions(driver);
		Thread.sleep(4000);
		b.sendKeys(d,"cbstest").build().perform();
	    
	  Thread.sleep(4000);
	  Base.btnclick(rp.getLogin());
	  
	  //matches
	  Thread.sleep(6000);
	 driver.findElement(By.xpath("//*[@id='menusegment']/ion-segment-button[2]")).click();
	 
	//Thread.sleep(5000);
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
	//	  WebElement edit= driver.findElement(By.xpath("//img[@src='https://imgs.ezhavamatrimony.com/cbsimages/avatarfoto_requestmob_f.jpg']"));
	//	  	  js.executeScript("arguments[0].scrollIntoView(true);",edit);
	 
	 Thread.sleep(4000);
	 List<WebElement> ref = driver.findElements(By.xpath("//img[@src='https://imgs.ezhavamatrimony.com/cbsimages/avatarfoto_requestmob_f.jpg']"));	
	  System.out.println("requestphoto : "+ ref.size());
	  
	 
	 
	 
	 
	 
	 
	 
	 
}
}