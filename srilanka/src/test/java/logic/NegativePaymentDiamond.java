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

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.BaseTest;
import test.srilanka.NegativePaymentPOM;




public class NegativePaymentDiamond extends BaseTest{
	
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\Negative\\drivernew\\chromedriver.exe"; 

	
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
    	   NegativePaymentPOM rp=new NegativePaymentPOM(driver);
    	   Thread.sleep(5000);
    	   logger =  report.startTest("Srilankan Negative Payment Diamond");
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
    		  
    		try {
    			Thread.sleep(8000);
    			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
    			
    			
    		} catch (Exception e2) {
    			//System.out.println("no element 1");
    		}
    		
    		try {
    			Thread.sleep(8000);
    			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a")).click();
    			
    			
    		} catch (Exception e2) {
    			//System.out.println("no element 2");
    		}
    		
    		try {
    			Thread.sleep(8000);
    			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a/span")).click();
    			
    			
    		} catch (Exception e2) {
    			//System.out.println("no element 3");
    		}
    		logger.log(LogStatus.PASS, "Handling Intermediate Pages");	 
    	   	
    		logger.log(LogStatus.PASS, "Handling Three Month Diamond Packages");	
   	  Thread.sleep(4000);
   	  BaseTest.click(rp.getUpgradenow());
   	  
 	 Thread.sleep(8000);
  	  driver.findElement(By.xpath("//*[@id='newuipaynowurl']")).click();
  	  
     Thread.sleep(4000);
     driver.findElement(By.xpath("//*[@id='credit-debit-link8']")).click();
   	  
     try {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='gmg_chat_arrow']")).click();
	} catch (Exception e2) {
		System.out.println("no exception");
	}
     
//     Thread.sleep(4000);
//    WebElement name= driver.findElement(By.xpath("//*[@id='vpc_CardNum']"));
//    name.sendKeys("Lokeshkhan");
//    
    Thread.sleep(4000);
    WebElement card= driver.findElement(By.xpath("//*[@id='vpc_CardNum']"));
    card.sendKeys("4111111111111111");
    
    Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id='cardExpiryMonthDisplay']")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("/html/body/div[4]/div/ul[2]/li[1]/a")).click();
    
    Thread.sleep(4000);
    WebElement cvv= driver.findElement(By.xpath("//*[@id='vpc_CardSecurityCode']"));
    cvv.sendKeys("012");
      
     Thread.sleep(4000);
     driver.findElement(By.xpath("//*[@id='debit-card-submit']")).click();
     		
//     Thread.sleep(4000);
//     driver.findElement(By.xpath("//div[@class='mobipick-date-formatted']")).click();
//     
//     Thread.sleep(4000);
//     driver.findElement(By.xpath("/html/body/div[4]/div/ul[2]/li[1]/a")).click();
//     
//     Thread.sleep(4000);
//     driver.findElement(By.xpath("//*[@id='debit-card-submit']")).click();
     
     /////back////
//     Thread.sleep(4000);
//     driver.findElement(By.xpath("(//*[@id='RetryButton'])[1]")).click();
//     
//     Thread.sleep(4000);
//     driver.findElement(By.xpath("/html/body/header/section/a[1]/i")).click();
//    
    /// popup////
//     Thread.sleep(4000);
//     driver.switchTo().alert().accept();
//     
     Thread.sleep(4000);
     BaseTest.click(rp.getEditpackages());
     logger.log(LogStatus.PASS, "Handling Six Month Diamond Packages");	
     try {
    	 Thread.sleep(4000);
         BaseTest.click(rp.getSixmonthdiamond());
         
	} catch (Exception e2) {
	}
     
     try {
    	 Thread.sleep(4000);
         BaseTest.click(rp.getThreemonthdiamond());
         
	} catch (Exception e2) {
	}
     
    
    Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id='credit-debit-link8']")).click();
  	  
     try {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='gmg_chat_arrow']")).click();
	} catch (Exception e2) {
		System.out.println("no exception");
	}
     
     Thread.sleep(4000);
     WebElement card1= driver.findElement(By.xpath("//*[@id='vpc_CardNum']"));
     card1.sendKeys("4111111111111111");
     
     Thread.sleep(4000);
     driver.findElement(By.xpath("//*[@id='cardExpiryMonthDisplay']")).click();
     Thread.sleep(4000);
     driver.findElement(By.xpath("/html/body/div[4]/div/ul[2]/li[1]/a")).click();
     
     Thread.sleep(4000);
     WebElement cvv1= driver.findElement(By.xpath("//*[@id='vpc_CardSecurityCode']"));
     cvv1.sendKeys("012");
       
      Thread.sleep(4000);
      driver.findElement(By.xpath("//*[@id='debit-card-submit']")).click();
      		
     
///////till u marry////
 /////back////
     
    /// popup////
//     Thread.sleep(4000);
//     driver.switchTo().alert().accept();
//     
     Thread.sleep(4000);
     BaseTest.click(rp.getEditpackages());
     
     Thread.sleep(4000);
     BaseTest.click(rp.getTiilumarry());
     logger.log(LogStatus.PASS, "Handling Till You Marriage Diamond Package");
     Thread.sleep(4000);
     driver.findElement(By.xpath("//*[@id='credit-debit-link8']")).click();
     
     Thread.sleep(4000);
     WebElement card11= driver.findElement(By.xpath("//*[@id='vpc_CardNum']"));
     card11.sendKeys("4111111111111111");
     
     Thread.sleep(4000);
     driver.findElement(By.xpath("//*[@id='cardExpiryMonthDisplay']")).click();
     Thread.sleep(4000);
     driver.findElement(By.xpath("/html/body/div[4]/div/ul[2]/li[1]/a")).click();
     
     Thread.sleep(4000);
     WebElement cvv11= driver.findElement(By.xpath("//*[@id='vpc_CardSecurityCode']"));
     cvv11.sendKeys("012");
       
      Thread.sleep(4000);
      driver.findElement(By.xpath("//*[@id='debit-card-submit']")).click();
      		
      logger.log(LogStatus.PASS, "Logout Succesfully");
	   
	  report.endTest(logger);
	   	
	   	report.flush();  
     
     
}
}