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
import pom.PasswordCheckPOM;



public class PasswordCheck {

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
      PasswordCheckPOM rp= new PasswordCheckPOM(driver);	
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
	driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list/ion-item[6]")).click();
	
	 WebElement e1=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-changepassword/ion-content/div[2]/div/form/ion-item[1]"));
		Actions a1=new Actions(driver);
		Thread.sleep(4000);			
		a1.sendKeys(e1,"cbstest").build().perform();
	 
       ///NewPassword////  11111//////
		 WebElement e11=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-changepassword/ion-content/div[2]/div/form/ion-item[2]/div[1]/div"));
			Actions a11=new Actions(driver);
			Thread.sleep(4000);
			a11.sendKeys(e11,"1234").build().perform();
		 Thread.sleep(6000);
	   driver.findElement(By.xpath("//span[contains(text(),'SUBMIT')]")).click();
	    
	 Thread.sleep(4000);
	 WebElement gh=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-changepassword/ion-content/div[2]/div/form/ion-item[3]/div[1]/div/ion-label/div"));
	String character= gh.getText();
	System.out.println(character);    
////////////222222///////////	    
	 WebElement e111=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-changepassword/ion-content/div[2]/div/form/ion-item[2]/div[1]/div"));
		Actions a111=new Actions(driver);
		Thread.sleep(4000);
		a111.sendKeys(e111,"absdefghijklmnopqrstuvwxyz").build().perform();
	 Thread.sleep(6000);
driver.findElement(By.xpath("//span[contains(text(),'SUBMIT')]")).click();   
	    
Thread.sleep(4000);
WebElement gh1=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-changepassword/ion-content/div[2]/div/form/ion-item[3]/div[1]/div/ion-label/div"));
String longcharacter= gh1.getText();
System.out.println(longcharacter); 	    

/////////333333333333//////////

WebElement e1111=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-changepassword/ion-content/div[2]/div/form/ion-item[2]/div[1]/div"));
Actions a1111=new Actions(driver);
Thread.sleep(4000);
a1111.sendKeys(e1111,"ABC@!#$").build().perform();
Thread.sleep(6000);
driver.findElement(By.xpath("//span[contains(text(),'SUBMIT')]")).click();   

WebElement b1=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-changepassword/ion-content/div[2]/div/form/ion-item[3]/div[1]/div/ion-label/div"));
String specialcharacter=b1.getText();
System.out.println(specialcharacter);

WebElement e11111=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-changepassword/ion-content/div[2]/div/form/ion-item[2]/div[1]/div"));
Actions a11111=new Actions(driver);
Thread.sleep(4000);
a11111.sendKeys(e11111,"cbstest").build().perform();	

Thread.sleep(6000);
driver.findElement(By.xpath("//span[contains(text(),'SUBMIT')]")).click();  

WebElement b11=driver.findElement(By.xpath("//div[@class='font10 error']"));
String conformpass=b11.getText();
System.out.println(conformpass);

WebElement n11111=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-changepassword/ion-content/div[2]/div/form/ion-item[3]/div[1]/div/ion-input/div"));
Actions l11111=new Actions(driver);
Thread.sleep(4000);
l11111.sendKeys(n11111,"CBSTEST").build().perform();	

Thread.sleep(6000);
driver.findElement(By.xpath("//span[contains(text(),'SUBMIT')]")).click();  

WebElement b111=driver.findElement(By.xpath("//div[@class='font10 error']"));
String passmismatch=b111.getText();
System.out.println(passmismatch);

WebElement n111111=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-changepassword/ion-content/div[2]/div/form/ion-item[3]/div[1]/div/ion-input/div"));
Actions l111111=new Actions(driver);
Thread.sleep(4000);
l111111.sendKeys(n111111,"cbstest").build().perform();	

Thread.sleep(6000);
driver.findElement(By.xpath("//span[contains(text(),'SUBMIT')]")).click();  

//back
Thread.sleep(4000);
driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-changepassword/ion-header/ion-title/div/span")).click();

//menu
Thread.sleep(4000);
driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();

Thread.sleep(4000);
BaseTest.click(rp.getSetting());

Thread.sleep(4000);
BaseTest.click(rp.getLogout());









}
}