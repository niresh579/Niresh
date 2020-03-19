package logic;

import java.net.MalformedURLException;
import java.util.HashMap;
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
import pom.StagingEditPpPom;

public class StagingEditPp extends BaseTest{
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
    	   StagingEditPpPom rp =new StagingEditPpPom(driver);
    	   Thread.sleep(5000);
   	    driver.get("https://mstage.communitymatrimony.com/cbsmob/login.php");
   	    driver.manage().window().maximize();
   	    
   	    //login
   	    WebElement e=driver.findElement(By.xpath("//*[@id='loginpage']/div[1]/div[2]/div/form/div[1]"));
   		Actions a=new Actions(driver);
   		Thread.sleep(4000);
   		a.sendKeys(e,"AGR7").build().perform();
   	    
   	    Thread.sleep(4000);
   	    
   	    WebElement d=driver.findElement(By.xpath("//*[@id='matripassword1']"));
   	    Thread.sleep(4000);
   		Actions b=new Actions(driver);
   		Thread.sleep(4000);
   		b.sendKeys(d,"cbstest").build().perform();
   	    
   	  Thread.sleep(4000);
   	  BaseTest.click(rp.getLogin());
   	
   	  Thread.sleep(8000);
   		 driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
   		  
   	  Thread.sleep(4000);
	  BaseTest.click(rp.getEditpp());
	  
	  Thread.sleep(4000);
	  BaseTest.click(rp.getEditBasic());
	  
	  Thread.sleep(4000);
	  BaseTest.click(rp.getPartnerlooking());
	  
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"RegPanelSearchvalue\"]")).click();
	  Thread.sleep(4000);
	  BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+getExcelData("Sheet2", 1, 1)+"')]")));
		Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
	  
	//  Thread.sleep(4000);
	//  BaseTest.click(rp.getAgefrom());
	  
//	  Thread.sleep(4000);
//	  driver.findElement(By.xpath("//*[@id=\"RegPanelSearchvalue\"]")).click();
//	  Thread.sleep(4000);
//	  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet2", 1, 2)+"')]")));
	  
//	  Thread.sleep(3000);
//	  BaseTest.click(rp.getAgeto());
//	  Thread.sleep(4000);
//	  driver.findElement(By.xpath("//*[@id=\"RegPanelSearchvalue\"]")).click();
//	  Thread.sleep(4000);
//	  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet2", 1, 3)+"')]")));
	  
	  Thread.sleep(4000);
	  BaseTest.click(rp.getHeightfrom());
	  Thread.sleep(4000);
			  driver.findElement(By.xpath("//*[@id=\"RegPanelSearchvalue\"]")).click();
			  Thread.sleep(4000);
		
			  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet2", 1, 4)+"')]")));
	  Thread.sleep(4000);
	  BaseTest.click(rp.getHeightto());
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"RegPanelSearchvalue\"]")).click();
	  Thread.sleep(4000);

	  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet2", 1, 5)+"')]")));
	  
	  Thread.sleep(4000);
	  BaseTest.click(rp.getMothertongue());
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"RegPanelSearchvalue\"]")).click();
	  Thread.sleep(4000);
      BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+getExcelData("Sheet2", 1, 6)+"')]")));
      Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
	  
	  Thread.sleep(4000);
	  BaseTest.click(rp.getPhyscialstatus());
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"RegPanelSearchvalue\"]")).click();
	  Thread.sleep(4000);

	  BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+getExcelData("Sheet2", 1, 7)+"')]")));
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
	  
	  Thread.sleep(3000);
	  BaseTest.click(rp.getEatinghabit());
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"RegPanelSearchvalue\"]")).click();
	  Thread.sleep(4000);

	  BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+getExcelData("Sheet2", 1, 8)+"')]")));
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
	  
	  Thread.sleep(4000);
	  BaseTest.click(rp.getDrinkinghabit());
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"RegPanelSearchvalue\"]")).click();
	  Thread.sleep(4000);

	  BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+getExcelData("Sheet2", 1, 9)+"')]")));
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
	  
	  Thread.sleep(3000);
	  BaseTest.click(rp.getSmokinghabit());
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id=\"RegPanelSearchvalue\"]")).click();
	  Thread.sleep(4000);

	  BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+getExcelData("Sheet2", 1, 10)+"')]")));
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
	  
	  

}

}
