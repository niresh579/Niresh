package test.WFM;

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

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import BaseTest.BaseTest;



public class CallPreference extends BaseTest {
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\drivernew2\\chromedriver.exe"; 

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
    	   CallPreferencePOM rp=new CallPreferencePOM(driver);
    	   Thread.sleep(5000);
   	    driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
   	    driver.manage().window().maximize();
   	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	    
   	    WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
   		Actions a=new Actions(driver);
   		Thread.sleep(4000);
   		a.sendKeys(e,"IYR242926").build().perform();
   	    	
   	    Thread.sleep(4000); 
   	    
   	    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
   	    Thread.sleep(4000);
   		Actions b=new Actions(driver);
   		Thread.sleep(4000);
   		b.sendKeys(d,"cbstest").build().perform();
   	    
   	  Thread.sleep(4000);
   	BaseTest.click(rp.getLogin());
   	    
   	 Thread.sleep(8000);
   	  driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
   	  
   	  Thread.sleep(6000);
   	 BaseTest.click(rp.getSetting());
   	 
      Thread.sleep(4000);
      BaseTest.click(rp.getCallpreference());
   	 
   	 Thread.sleep(4000);
   	 driver.findElement(By.xpath("(//button[@role='radio'])[1]")).click();
   	 
   	 Thread.sleep(4000);
   	 driver.findElement(By.xpath("(//button[@role='radio'])[2]")).click();
   	 
   	 
   	 Thread.sleep(4000);
   	 driver.findElement(By.xpath("(//button[@role='radio'])[3]")).click();
   	 
   	 
   	 Thread.sleep(4000);
   	 driver.findElement(By.xpath("(//button[@role='radio'])[4]")).click();
	 
   	Thread.sleep(4000);
  	 driver.findElement(By.xpath("(//button[@role='radio'])[5]")).click();
	 		
   	//cancel//
  	 Thread.sleep(4000);
  	 driver.findElement(By.xpath("/html/body/ion-app/ion-modal[2]/div/mailpopup/ion-content/div[2]/div/ion-row/ion-col/div/button[1]/span")).click();		
   	 
  	 Thread.sleep(4000);
   WebElement wb=driver.findElement(By.xpath("(//button[@role='radio'])[4]"));
   if (wb.isEnabled()) {
	   System.out.println("true");
	
}
   else {	
	System.out.println("false");
} 	 
   	 
}
}