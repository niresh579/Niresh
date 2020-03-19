package logic;



import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import Base.BaseTest;

import pom.RasiiValidationPOM;

public class RasiiValidation extends BaseTest{
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
      RasiiValidationPOM rp= new RasiiValidationPOM(driver);	
//      Thread.sleep(5000);
//	    driver.get("https://mstage.communitymatrimony.com/cbsmob/login.php");
//	    driver.manage().window().maximize();
//	    
//	    //login
//	    WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
//		Actions a=new Actions(driver);
//		Thread.sleep(4000);
//		a.sendKeys(e,"AGR602073").build().perform();
//	    
//	    Thread.sleep(4000); 
//	    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
//	    Thread.sleep(4000);
//		Actions b=new Actions(driver);
//		Thread.sleep(4000);
//		b.sendKeys(d,"cbstest").build().perform();
//	    
//	  Thread.sleep(4000);
//	BaseTest.click(rp.getLogin());
//	
//	Thread.sleep(4000);
//	try {
//		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-intermediatesegment/ion-content/div[2]/span")).click();
//	} catch (Exception e2) {
//		System.out.println("no popup");
//	}
//
//	Thread.sleep(4000);
//	try {
//		driver.findElement(By.xpath("/html/body/ion-app/ion-popover/div/div[2]/div/quickresponse/span")).click();
//	} catch (Exception e2) {
//		System.out.println("no popup");
//	}
//	
//	Thread.sleep(6000);
//	driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
//	
//	Thread.sleep(4000);
//	BaseTest.click(rp.getEditprofile());
//	
//	int mot_tng = BaseTest.getCellCount("Sheet1");
//	
//	for (int i = 0; i < mot_tng; i++) {
//		Thread.sleep(4000);
//		BaseTest.click(rp.getBasicdetails());
//		
//		Thread.sleep(4000);
//		BaseTest.click(rp.getMothertongue());
//		
//		Thread.sleep(4000);
//		BaseTest.click(rp.getSearch());
//		
//		Thread.sleep(4000);
//		 BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet1", 0, i)+"')]")));
//		
//		
//   	Thread.sleep(4000);
//	BaseTest.click(rp.getSave());
//	
//	Thread.sleep(4000);
//	driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click();
//	
//	Thread.sleep(4000);
//	BaseTest.click(rp.getReligiousinformation());
//	
//	Thread.sleep(4000);
//	BaseTest.click(rp.getRaasi());
//	
//	//ul[@id='list_view_detail']//li
//	//Thread.sleep(4000);
//	//driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//	Thread.sleep(4000);
//	//List<WebElement> ref2= driver.findElements(By.xpath("//ul[@id='list_view_detail']//li"));
//	int ref=BaseTest.getRowCount("sheet1");
//	System.out.println("total raasi:"+ref);
//	for (int j = 1; j < ref; j++) {
//		
//		WebElement demo=driver.findElement(By.xpath("//*[@id='list_view_detail']/li["+j+"]"));
//	String b1=demo.getText();
//	System.out.println("raasi in web:"+b1);
//	
//	String B = getExcelData("Sheet1", j, i);
//	System.out.println("raasi in excel:"+B);
//	
//	if (b1.equalsIgnoreCase(B)) {
//		System.out.println("matched");
//	} else {
//
//		System.out.println("not matched");
//	}
//				
//	
//		
//		
//	}
//	Thread.sleep(4000);
//    BaseTest.click(rp.getDeleteicon());
//    
//    Thread.sleep(4000);
//    BaseTest.click(rp.getBackhistory());
//    
//	Thread.sleep(6000);
//	driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
//	
//	Thread.sleep(4000);
//	BaseTest.click(rp.getEditprofile());
//	
//	
//	}
//	
//	
//	
//	
//	
      /////Live//////////
      
      
      Thread.sleep(5000);
	    driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
	    driver.manage().window().maximize();
	    
	    //login
	    WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
		Actions a=new Actions(driver);
		Thread.sleep(4000);
		a.sendKeys(e,"BRH2524677").build().perform();
	    
	    Thread.sleep(4000); 
	    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
	    Thread.sleep(4000);
		Actions b=new Actions(driver);
		Thread.sleep(4000);
		b.sendKeys(d,"cbstest").build().perform();
	    
	  Thread.sleep(4000);
	BaseTest.click(rp.getLogin());
	
	Thread.sleep(4000);
	try {
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-intermediatesegment/ion-content/div[2]/span")).click();
	} catch (Exception e2) {
		System.out.println("no popup");
	}

	Thread.sleep(4000);
	try {
		driver.findElement(By.xpath("/html/body/ion-app/ion-popover/div/div[2]/div/quickresponse/span")).click();
	} catch (Exception e2) {
		System.out.println("no popup");
	}
	
	Thread.sleep(6000);
	driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
	
	Thread.sleep(4000);
	BaseTest.click(rp.getEditprofile());
	
	int mot_tng = BaseTest.getCellCount("Sheet1");
	
	for (int i = 0; i < mot_tng; i++) {
		Thread.sleep(4000);
		BaseTest.click(rp.getBasicdetails());
		
		Thread.sleep(4000);
		BaseTest.click(rp.getMothertongue());
		
		Thread.sleep(4000);
		BaseTest.click(rp.getSearch());
		
		Thread.sleep(4000);
		 BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet1", 0, i)+"')]")));
		
		
 	Thread.sleep(4000);
	BaseTest.click(rp.getSave());
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click();
	
	Thread.sleep(4000);
	BaseTest.click(rp.getReligiousinformation());
	
	Thread.sleep(4000);
	BaseTest.click(rp.getRaasi());
	
	//ul[@id='list_view_detail']//li
	//Thread.sleep(4000);
	//driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
	Thread.sleep(4000);
	//List<WebElement> ref2= driver.findElements(By.xpath("//ul[@id='list_view_detail']//li"));
	int ref=BaseTest.getRowCount("sheet1");
	System.out.println("total raasi:"+ref);
	for (int j = 1; j < ref; j++) {
		
		WebElement demo=driver.findElement(By.xpath("//*[@id='list_view_detail']/li["+j+"]"));
	String b1=demo.getText();
	System.out.println("raasi in web:"+b1);
	
	String B = getExcelData("Sheet1", j, i);
	System.out.println("raasi in excel:"+B);
	
	if (b1.equalsIgnoreCase(B)) {
		System.out.println("not matched");
	} else {

		System.out.println("matched matched");
	}
				
	
		
		
	}
	Thread.sleep(4000);
  BaseTest.click(rp.getDeleteicon());
  
  Thread.sleep(4000);
  BaseTest.click(rp.getBackhistory());
  
	Thread.sleep(6000);
	driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
	
	Thread.sleep(4000);
	BaseTest.click(rp.getEditprofile());
	
	
	}
	
	
	
	
	
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}
}