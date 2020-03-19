package logic;

import java.net.MalformedURLException;
import java.util.HashMap;
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
import pom.PasswordCheckPOM;



public class PasswordCheck extends BaseTest{

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
      PasswordCheckPOM rp= new PasswordCheckPOM(driver);	
      Thread.sleep(5000);
      logger =  report.startTest("Nepali Password Test");
	   driver.get("https://m.nepalimatrimony.com/cbsmob/login.php");
	   logger.log(LogStatus.PASS, "URL Launched Successfully");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	    
	    
	    //login
	    WebElement e=driver.findElement(By.xpath("//ion-input[@formcontrolname='idEmail']"));
		Actions a=new Actions(driver);
		Thread.sleep(4000);
		a.sendKeys(e,"Nep140549").build().perform();
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
	logger.log(LogStatus.PASS, "Login Successfully with this Matriid Nep140549");
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
	  Thread.sleep(6000);
	 BaseTest.click(rp.getSetting());
	 logger.log(LogStatus.PASS, "Handling Intermediate Pages");	
	 Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list/ion-item[6]")).click();
	
	 WebElement e1=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-changepassword/ion-content/div[2]/div/form/ion-item[1]/div[1]/div/ion-input/div"));
		Actions a1=new Actions(driver);
		Thread.sleep(4000);			
		a1.sendKeys(e1,"cbstest").build().perform();
	 
       ///NewPassword////  11111//////
		 WebElement e11=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-changepassword/ion-content/div[2]/div/form/ion-item[2]/div[1]/div/ion-input/div"));
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

logger.log(LogStatus.PASS, "Logout Succesfully");

report.endTest(logger);
 	
 	report.flush();







}
}