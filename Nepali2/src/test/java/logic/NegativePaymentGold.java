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

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pom.BaseTest;
import pom.NegativePaymentPOM;

public class NegativePaymentGold extends BaseTest {
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
      	   logger =  report.startTest("Pakistani Negative payment Gold");
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

	  Thread.sleep(4000);
	  BaseTest.click(rp.getUpgradenow());
	  
	  
	logger.log(LogStatus.PASS, "Handling Intermediate Pages");	 
	
logger.log(LogStatus.PASS, "Handling Three Month Diamond Packages");	 
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
 
// Thread.sleep(4000);
//WebElement name= driver.findElement(By.xpath("//*[@id='vpc_CardNum']"));
//name.sendKeys("Lokeshkhan");
//
 logger.log(LogStatus.PASS, "Entering invalid credential details");	 
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
 		
// Thread.sleep(4000);
// driver.findElement(By.xpath("//div[@class='mobipick-date-formatted']")).click();
// 
// Thread.sleep(4000);
// driver.findElement(By.xpath("/html/body/div[4]/div/ul[2]/li[1]/a")).click();
// 
// Thread.sleep(4000);
// driver.findElement(By.xpath("//*[@id='debit-card-submit']")).click();
 
 /////back////
// Thread.sleep(4000);
// driver.findElement(By.xpath("(//*[@id='RetryButton'])[1]")).click();
// 
// Thread.sleep(4000);
// driver.findElement(By.xpath("/html/body/header/section/a[1]/i")).click();
//
/// popup////
// Thread.sleep(4000);
// driver.switchTo().alert().accept();
// 
 Thread.sleep(4000);
 BaseTest.click(rp.getEditpackages());
 
 logger.log(LogStatus.PASS, "Handling Six Month Diamond Packages");	 
 Thread.sleep(4000);
 BaseTest.click(rp.getSixmonthdiamond());
 

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
// Thread.sleep(4000);
// driver.switchTo().alert().accept();
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
  		
     	
//    		try {
//    			Thread.sleep(4000);
//    			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-intermediatesegment/ion-content/div[2]/span")).click();
//    		} catch (Exception e2) {
//    		}
//    		  
//    		try {
//    			Thread.sleep(8000);
//    			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
//    			
//    			
//    		} catch (Exception e2) {
//    			//System.out.println("no element 1");
//    		}
//    		
//    		try {
//    			Thread.sleep(8000);
//    			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a")).click();
//    			
//    			
//    		} catch (Exception e2) {
//    			//System.out.println("no element 2");
//    		}
//    		
//    		try {
//    			Thread.sleep(8000);
//    			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a/span")).click();
//    			
//    			
//    		} catch (Exception e2) {
//    			//System.out.println("no element 3");
//    		}
//
//   	  Thread.sleep(4000);
//   	  BaseTest.click(rp.getUpgradenow());
//   	  
//   	logger.log(LogStatus.PASS, "Handling Intermediate Pages");	 
//   	
//    logger.log(LogStatus.PASS, "Handling three Month Gold Packages");	 
//   	  Thread.sleep(4000);
//   	try {
// 		Thread.sleep(8000);
// 		driver.findElement(By.xpath("//div[@class='gmg_chat_head']")).click();
// 	} catch (Exception e2) {
// 		//System.out.println("no exception");
// 	}
//   	  BaseTest.click(rp.getGoldtab());
//   	 try {
// 		Thread.sleep(8000);
// 		driver.findElement(By.xpath("//div[@class='gmg_chat_head']")).click();
// 	} catch (Exception e2) {
// 		//System.out.println("no exception");
// 	}
// 	 Thread.sleep(4000);
//  	  driver.findElement(By.xpath("//*[@id='newuipaynowurl']")).click();
//  	try {
// 		Thread.sleep(8000);
// 		driver.findElement(By.xpath("//div[@class='gmg_chat_head']")).click();
// 	} catch (Exception e2) {
// 		//System.out.println("no exception");
// 	}
//     Thread.sleep(4000);
//     driver.findElement(By.xpath("//*[@id='credit-debit-link8']")).click();
//   	  
//     try {
//		Thread.sleep(8000);
//		driver.findElement(By.xpath("//div[@class='gmg_chat_head']")).click();
//	} catch (Exception e2) {
//		System.out.println("no exception");
//	}
//     
////     Thread.sleep(4000);
////    WebElement name= driver.findElement(By.xpath("//*[@id='vpc_CardNum']"));
////    name.sendKeys("Lokeshkhan");
////    
//     
//     logger.log(LogStatus.PASS, "Entering invalid credential details");	 
//    Thread.sleep(4000);
//    WebElement card= driver.findElement(By.xpath("//*[@id='vpc_CardNum']"));
//    card.sendKeys("4111111111111111");
//    
//    Thread.sleep(4000);
//    driver.findElement(By.xpath("//*[@id='cardExpiryMonthDisplay']")).click();
//    Thread.sleep(4000);
//    driver.findElement(By.xpath("/html/body/div[4]/div/ul[2]/li[1]/a")).click();
//    
//    Thread.sleep(4000);
//    WebElement cvv= driver.findElement(By.xpath("//*[@id='vpc_CardSecurityCode']"));
//    cvv.sendKeys("012");
//      
//     Thread.sleep(4000);
//     driver.findElement(By.xpath("//*[@id='debit-card-submit']")).click();
//     		
////     Thread.sleep(4000);
////     driver.findElement(By.xpath("//div[@class='mobipick-date-formatted']")).click();
////     
////     Thread.sleep(4000);
////     driver.findElement(By.xpath("/html/body/div[4]/div/ul[2]/li[1]/a")).click();
////     
////     Thread.sleep(4000);
////     driver.findElement(By.xpath("//*[@id='debit-card-submit']")).click();
//     
//     /////back////
////     Thread.sleep(4000);
////     driver.findElement(By.xpath("(//*[@id='RetryButton'])[1]")).click();
////     
////     Thread.sleep(4000);
////     driver.findElement(By.xpath("/html/body/header/section/a[1]/i")).click();
////    
//    /// popup////
////     Thread.sleep(4000);
////     driver.switchTo().alert().accept();
////     
//     Thread.sleep(4000);
//     BaseTest.click(rp.getEditpackages());
//     
//     Thread.sleep(4000);
//     BaseTest.click(rp.getSixmonthgold());
//     logger.log(LogStatus.PASS, "Handling Six Month Gold Packages");
//    
//    Thread.sleep(4000);
//    driver.findElement(By.xpath("//*[@id='credit-debit-link8']")).click();
//  	  
//     try {
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//div[@class='gmg_chat_arrow']")).click();
//	} catch (Exception e2) {
//		System.out.println("no exception");
//	}
//     
//     Thread.sleep(4000);
//     WebElement card1= driver.findElement(By.xpath("//*[@id='vpc_CardNum']"));
//     card1.sendKeys("4111111111111111");
//     
//     Thread.sleep(4000);
//     driver.findElement(By.xpath("//*[@id='cardExpiryMonthDisplay']")).click();
//     Thread.sleep(4000);
//     driver.findElement(By.xpath("/html/body/div[4]/div/ul[2]/li[1]/a")).click();
//     
//     Thread.sleep(4000);
//     WebElement cvv1= driver.findElement(By.xpath("//*[@id='vpc_CardSecurityCode']"));
//     cvv1.sendKeys("012");
//       
//      Thread.sleep(4000);
//      driver.findElement(By.xpath("//*[@id='debit-card-submit']")).click();
//      		
//     
/////////till u marry////
// /////back////
//     
//    /// popup////
////     Thread.sleep(4000);
////     driver.switchTo().alert().accept(); 	 	
////     
//     Thread.sleep(4000);
//     BaseTest.click(rp.getEditpackages());
//     
//     Thread.sleep(4000);
//     BaseTest.click(rp.getTiilumarry());
//     logger.log(LogStatus.PASS, "Handling Till you marriage Gold Packages"); 
//     Thread.sleep(4000);	
//     driver.findElement(By.xpath("//*[@id='credit-debit-link8']")).click();
//     
//     Thread.sleep(4000);
//     WebElement card11= driver.findElement(By.xpath("//*[@id='vpc_CardNum']"));
//     card11.sendKeys("4111111111111111");
//     
//     Thread.sleep(4000);
//     driver.findElement(By.xpath("//*[@id='cardExpiryMonthDisplay']")).click();
//     Thread.sleep(4000);
//     driver.findElement(By.xpath("/html/body/div[4]/div/ul[2]/li[1]/a")).click();
//     
//     Thread.sleep(4000);
//     WebElement cvv11= driver.findElement(By.xpath("//*[@id='vpc_CardSecurityCode']"));
//     cvv11.sendKeys("012");
//       
//      Thread.sleep(4000);
//      driver.findElement(By.xpath("//*[@id='debit-card-submit']")).click();
//      		
//      logger.log(LogStatus.PASS, "Logout Succesfully");
//	   
//	  report.endTest(logger);
//	   	
	   	//report.flush();
   	  
  
  logger.log(LogStatus.PASS, "Logout Succesfully");
  
 report.endTest(logger);
  	
  	//report.flush();
       }
       @AfterMethod
       public void mailReport(ITestResult status) throws Throwable {
    	 	Thread.sleep(4000);
            BaseTest.getScreenshot(driver, "Negative Payment");

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
      		
      		 Error_on = c[2].toString();
      		System.out.println("Error : "+Error_on);
    }  		
      	//error msg
//      		String Exception=status.getThrowable().getMessage();
//      		System.out.println("ecception result"+Exception);
      		
    	   if (status.getStatus()==1) {
    		   
		if (BaseTest.getExcelData("SMS", 1, 2).equals("2")) {
			BaseTest.reportflush();
		    BaseTest.sendVFSmsnegative(domain, Error_on, date1);	
		    int a1 = status.getStatus();  
		    String aa1 = Integer.toString(a1);
   			BaseTest.setExcelData("SMS", 1, 2, aa1);
		}		
				
		} else if (status.getStatus()==2) {
			 BaseTest.reportflush1();       
		        BaseTest.sendVFSmsnegative1(domain, Error_on, date1, failedstatus);
		        int a2 = status.getStatus();
		        String aa2 = Integer.toString(a2);
				BaseTest.setExcelData("SMS", 1, 2, aa2);
			
		} 
    	   
   	  
   	  

}
}       
