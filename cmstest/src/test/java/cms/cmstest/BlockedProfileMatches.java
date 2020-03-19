package cms.cmstest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
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

public class BlockedProfileMatches extends Base{
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
       public void testUntitled() throws InterruptedException {
       	
       	BlockedProfilePOM rp= new BlockedProfilePOM(driver);
       	Thread.sleep(5000);
		    driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
		    driver.manage().window().maximize();
		    
		    //login
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
		  Base.btnclick(rp.getLogin());
		  
		  //matches
		  Thread.sleep(6000);
		Base.btnclick(rp.getMatches());
		
		 Thread.sleep(4000);
		  String b1 = driver.findElement(By.xpath("(//span[@class='matriid_txt'])[1]")).getText();
       System.out.println("id "+b1);
//       Thread.sleep(4000);
//       driver.findElement(By.xpath("(//span[@class='clr36 font10'])[1]")).click();
//       
//       Thread.sleep(4000);
//       driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-viewprofile/ion-content/div[1]/div/ion-row/ion-col[1]/span[1]")).click();
//       
       Thread.sleep(5000);
       driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row[1]/ion-grid/ion-row[1]/ion-col[2]/div[3]/ion-row/ion-col/ion-icon/span")).click();
      
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row[1]/ion-grid/ion-row[1]/ion-col[2]/div[3]/ion-row/ion-col/ion-list/button[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
		//menu//
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
		
		
		Thread.sleep(4000);
		Base.btnclick(rp.getSetting());
		
		Thread.sleep(4000);
		Base.btnclick(rp.getBlocked());
		
		Thread.sleep(4000);
		 String b2 = driver.findElement(By.xpath("(//span[@class='matriid_txt'])[1]")).getText();
	        System.out.println(b2);
		
	        Thread.sleep(3000);
	        if (b2.contains(b1)) {
				System.out.println("Matched");
			} else {
                System.out.println("Not matched");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}