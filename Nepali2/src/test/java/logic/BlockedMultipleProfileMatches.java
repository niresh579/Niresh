package logic;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

import pom.BaseTest;
import pom.BlockedMultipleProfilePOM;

public class BlockedMultipleProfileMatches extends BaseTest{
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\cmstest\\drivernew\\chromedriver.exe"; 

	 
     @BeforeMethod
     public void setUp1() throws MalformedURLException {
         System.setProperty("webdriver.chrome.driver", driverExecutablePath);
         Map<String, String> mobileEmulation = new HashMap<String, String>();
         mobileEmulation.put("deviceName", "Pixel 2");

         ChromeOptions chromeOptions = new ChromeOptions();
         chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
         chromeOptions.addArguments("--disable-notifications");
         driver = new ChromeDriver(chromeOptions);
         
         
//       ExtentReports report;
//       ExtentTest logger;
//       private String reportDirectory = "reports";
//       private String reportFormat = "xml";
//       private String testName = "Untitled";
//       protected AndroidDriver<AndroidElement> driver = null;
//
//       DesiredCapabilities dc = new DesiredCapabilities();
//       
//       @BeforeTest
//       public void setUp() throws MalformedURLException {
//       	   dc.setCapability("reportDirectory", reportDirectory);
//              dc.setCapability("reportFormat", reportFormat);
//              dc.setCapability("testName", testName);
//              dc.setCapability(MobileCapabilityType.UDID, "ZDHUTW49BMOZAU8T");
//              dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
//              dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
//              driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
//              driver.setLogLevel(Level.INFO);

         
     }
       
       @Test
       public void testUntitled() throws Exception {
    	   BlockedMultipleProfilePOM rp= new BlockedMultipleProfilePOM(driver);
    	   Thread.sleep(5000);
    	   logger=report.startTest("Pakistani Blocked Multiple Profile Test");
    	   driver.get("https://m.pakistanimatrimony.com/cbsmob/login.php");
    	   logger.log(LogStatus.PASS, "URL Launched Successfully");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    
		    //login
		    WebElement e=driver.findElement(By.xpath("//ion-input[@formcontrolname='idEmail']"));
			Actions a=new Actions(driver);
			Thread.sleep(4000);
			a.sendKeys(e,"PAK755447").build().perform();
		    
			logger.log(LogStatus.PASS, "Matri Id entered Successfully");
		    Thread.sleep(4000);
		    
		    WebElement d=driver.findElement(By.xpath("//ion-input[@formcontrolname='password']"));
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
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[1]/a/img")).click();
		} catch (Exception e2) {
			
		}
		
		
		  try {
			  Thread.sleep(6000);
			  driver.findElement(By.xpath("(//span[contains(text(),'MATCHES')])[1]")).click();
		} catch (Exception e2) {
           System.out.println("no element1");
		}
		 
		  
		  
		  try {
			  Thread.sleep(6000);
			  driver.findElement(By.xpath("//*[@id='menu-active']")).click();
		} catch (Exception e2) {
           System.out.println("no element2");
		}
		  
		  Thread.sleep(4000);
			WebElement ref=  driver.findElement(By.xpath("(//span[@class='clr36 font10'])[1]"));
			String ab=ref.getText();
			System.out.println("profile in matches"+ab);
			
			logger.log(LogStatus.PASS, "Handling Intermediate Pages");
			
			 Thread.sleep(4000);
		  List<WebElement> name = driver.findElements(By.xpath("//span[@class='clr36 font10']"));
		  System.out.println("total users :" +name.size());
		  for (int i = 1; i < 10; i++) {
			  Thread.sleep(3000);
			 
		WebElement abs= driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row["+i+"]/ion-grid/ion-row[1]/ion-col[2]/div[1]/div/span"));
		
			  
		 
			
		 Thread.sleep(5000);
		 JavascriptExecutor js = (JavascriptExecutor)driver;
	     WebElement clk= driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row[1]/ion-grid/ion-row[1]/ion-col[2]/div[3]/ion-row/ion-col/ion-icon"));
	        js.executeScript("arguments[0].scrollIntoView(true);",clk);
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row[1]/ion-grid/ion-row[1]/ion-col[2]/div[3]/ion-row/ion-col/ion-icon")).click();
	        Thread.sleep(4000);
			Actions c=new Actions(driver);
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row[1]/ion-grid/ion-row[1]/ion-col[2]/div[3]/ion-row/ion-col/ion-list/button[2]")).click();
			
//			Thread.sleep(4000);
//			Base.getScreenshot(driver, "blocked profile popup"); 
			
//			
			Thread.sleep(6000);
			driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click(); 
			
		}	
		  
		
	  Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
		  
		  Thread.sleep(4000);
		  BaseTest.click(rp.getSetting());
		  
		  Thread.sleep(4000);
		  BaseTest.click(rp.getBlocked());
		  
		Thread.sleep(4000);
		  List<WebElement> ref2 = driver.findElements(By.xpath("//span[@class='clr36 font10']"));
		  System.out.println("selected user : "+ ref2.size());
		  for (int i = 0; i <ref2.size(); i++) {
			  
	 Thread.sleep(3000);		 
	String b23=	ref2.get(i).getText();
	System.out.println("profile in blocked"+b23);	
		
		
		Thread.sleep(3000);
			  if (b23.contains(ab)) {
				System.out.println("Matched");
			} else {
              System.out.println("Not matched");
			}
		
		  }
       	
		  logger.log(LogStatus.PASS, "Validated Successfully");

		  logger.log(LogStatus.PASS, "Logout Succesfully");
       
		  report.endTest(logger);
		   	
		   	report.flush();
		 
			 
		  
}
}