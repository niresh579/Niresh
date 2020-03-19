	package Logic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
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

import Base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import pom.NegativePaymentPOM;

public class NegativePaymentPlatinum {
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
    	   NegativePaymentPOM rp=new NegativePaymentPOM(driver);
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
   	  

   	  Thread.sleep(4000);
   	  BaseTest.click(rp.getUpgradenow());
   	  
   	  Thread.sleep(4000);
   	  BaseTest.click(rp.getPlatiniumtab());
   	  
   	 Thread.sleep(8000);
 	  driver.findElement(By.xpath("//*[@id='newuipaynowurl']")).click();
 	  
    Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id='credit-debit-link1']")).click();
  	  
    try {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='gmg_chat_arrow']")).click();
	} catch (Exception e2) {
		System.out.println("no exception");
	}
    
    Thread.sleep(4000);
   WebElement name= driver.findElement(By.xpath("//input[@placeholder='Card Holder Name']"));
   name.sendKeys("Lokeshkhan");
   
   Thread.sleep(4000);
   WebElement card= driver.findElement(By.xpath("//input[@placeholder='Card Number']"));
   card.sendKeys("4111111111111111");
   
   try {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='gmg_chat_arrow']")).click();
	} catch (Exception e2) {
		System.out.println("no exception");
	}
   
   Thread.sleep(4000);
   WebElement cvv= driver.findElement(By.xpath("//input[@placeholder='CVV']"));
   cvv.sendKeys("012");
     
    Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id='debit-card-submit']")).click();
    		
    Thread.sleep(4000);
    driver.findElement(By.xpath("//div[@class='mobipick-date-formatted']")).click();
    
    Thread.sleep(4000);
    driver.findElement(By.xpath("/html/body/div[4]/div/ul[2]/li[1]/a")).click();
    
    Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id='debit-card-submit']")).click();
    
    /////back////
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//*[@id='RetryButton'])[1]")).click();
    
    Thread.sleep(4000);
    driver.findElement(By.xpath("/html/body/header/section/a[1]/i")).click();
   
   /// popup////
    Thread.sleep(4000);
    driver.switchTo().alert().accept();
    
    Thread.sleep(4000);
    BaseTest.click(rp.getEditpackages());
    
    Thread.sleep(4000);
    BaseTest.click(rp.getSixmonthplatinum());
    
    Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id='credit-debit-link1']")).click();
  	  
    try {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='gmg_chat_head']")).click();
	} catch (Exception e2) {
		System.out.println("no exception");
	}
    
    Thread.sleep(4000);
   WebElement name1= driver.findElement(By.xpath("//input[@placeholder='Card Holder Name']"));
   name1.sendKeys("Lokeshkhan");
   
   Thread.sleep(4000);
   WebElement card1= driver.findElement(By.xpath("//input[@placeholder='Card Number']"));
   card1.sendKeys("4111111111111111");
   try {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='gmg_chat_head']")).click();
	} catch (Exception e2) {
		System.out.println("no exception");
	}
   
   Thread.sleep(4000);
   WebElement cvv1= driver.findElement(By.xpath("//input[@placeholder='CVV']"));
   cvv1.sendKeys("012");
     
    Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id='debit-card-submit']")).click();
    		
    Thread.sleep(4000);
    driver.findElement(By.xpath("//div[@class='mobipick-date-formatted']")).click();
    
    Thread.sleep(4000);
    driver.findElement(By.xpath("/html/body/div[4]/div/ul[2]/li[1]/a")).click();
    
    Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id='debit-card-submit']")).click();
    
    //////till u marry/////
/////back////
    Thread.sleep(4000);
    driver.findElement(By.xpath("(//*[@id='RetryButton'])[1]")).click();
    
    Thread.sleep(4000);
    driver.findElement(By.xpath("/html/body/header/section/a[1]/i")).click();
   
   /// popup////
    Thread.sleep(4000);
    driver.switchTo().alert().accept();
    
    Thread.sleep(4000);
    BaseTest.click(rp.getEditpackages());
    
    Thread.sleep(4000);
    BaseTest.click(rp.getTiilumarry());
    
    Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id='credit-debit-link1']")).click();
  	  
    try {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='gmg_chat_head']")).click();
	} catch (Exception e2) {
		System.out.println("no exception");
	}
    
    Thread.sleep(4000);
   WebElement name2= driver.findElement(By.xpath("//input[@placeholder='Card Holder Name']"));
   name2.sendKeys("Lokeshkhan");
   
   Thread.sleep(4000);
   WebElement card2= driver.findElement(By.xpath("//input[@placeholder='Card Number']"));
   card2.sendKeys("4111111111111111");
   try {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='gmg_chat_head']")).click();
	} catch (Exception e2) {
		System.out.println("no exception");
	}
   
   Thread.sleep(4000);
   WebElement cvv2= driver.findElement(By.xpath("//input[@placeholder='CVV']"));
   cvv2.sendKeys("012");
     
    Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id='debit-card-submit']")).click();
    		
    Thread.sleep(4000);
    driver.findElement(By.xpath("//div[@class='mobipick-date-formatted']")).click();
    
    Thread.sleep(4000);
    driver.findElement(By.xpath("/html/body/div[4]/div/ul[2]/li[1]/a")).click();
    
    Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id='debit-card-submit']")).click();
    
   	  
   	  
   	  
   	  
       }
}
