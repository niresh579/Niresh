package logic;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
import pom.PcsPOM;

public class Pcs extends BaseTest {
	public static WebDriver driver;
	String driverExecutablePath ="C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\drivernew2\\chromedriver.exe";
	

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
         
//        ExtentReports report;
//        ExtentTest logger;
//        private String reportDirectory = "reports";
//        private String reportFormat = "xml";
//        private String testName = "Untitled";
//        protected AndroidDriver<AndroidElement> driver = null;
//
//        DesiredCapabilities dc = new DesiredCapabilities();
//        
//        @BeforeTest
//        public void setUp() throws MalformedURLException {
//        	   dc.setCapability("reportDirectory", reportDirectory);
//               dc.setCapability("reportFormat", reportFormat);
//               dc.setCapability("testName", testName);
//               dc.setCapability(MobileCapabilityType.UDID, "ZDHUTW49BMOZAU8T");
//               dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
//               dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
//               driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
//               driver.setLogLevel(Level.INFO);

          
      }
      
      @Test
      public void testUntitled() throws Throwable {
      PcsPOM rp= new PcsPOM(driver);	
      Thread.sleep(4000);
      driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
      driver.manage().window().maximize();
      
      
      Thread.sleep(4000);
      TakesScreenshot d=(TakesScreenshot)driver;
      File src=d.getScreenshotAs(OutputType.FILE);
      File Destination=new File("C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\screenshots\\"+".png");
      FileUtils.copyFile(src, Destination);
    	  
    	//login
      Thread.sleep(4000);
      Actions a=new Actions(driver);
      WebElement ref =driver.findElement(By.xpath("//*[@id='idEmail']"));
      a.sendKeys(ref, "IYR242926").build().perform();
      
      Thread.sleep(4000);
      Actions b=new Actions(driver);
      WebElement ref1=driver.findElement(By.xpath("//*[@id='password1']"));
  b.sendKeys(ref1, "cbstest").build().perform();
      
     Thread.sleep(4000);
     BaseTest.click(rp.getLogin());
     
    
       	  
       
    Thread.sleep(8000);
    JavascriptExecutor js= (JavascriptExecutor)driver;
    WebElement scr=driver.findElement(By.xpath("(//span[contains(text(),'Add')])[1]"));
    js.executeScript("arguments[0].scrollIntoView(true);", scr);
    

//   Thread.sleep(4000);
//    Robot r=new Robot();
//    r.keyPress(KeyEvent.VK_RIGHT);
//    r.keyRelease(KeyEvent.VK_RIGHT);
//   	  
// Thread.sleep(7000);
//  driver.findElement(By.xpath("(//span[contains(text(),'Add')])[2]")).click();  	  
//    	  
//   Thread.sleep(4000);
//   driver.findElement(By.xpath("//*[@id='generate_btn']/div/input")).click();
//    	  
//    	  
    	  
    	  
   WebElement photo=driver.findElement(By.xpath("(//span[contains(text(),'Add')])[1]"));
   photo.click();
   
   Thread.sleep(4000);
   driver.findElement(By.xpath("(//*[@id='clicknotification'])[1]")).click();
   
   Thread.sleep(4000);
 WebElement abc =  driver.findElement(By.xpath("//a[contains(text(),'Select from Gallery')]"));
 abc.click();
// abc.sendKeys("img");
 
//  .sendKeys("C:\\Users\\CBS Testing\\Downloads\\New Doc 2019-10-01 12.21.43_1.jpg");
  
  Thread.sleep(4000);
  Robot r=new Robot();
  r.keyPress(KeyEvent.VK_I);
  r.keyRelease(KeyEvent.VK_I);
  
  r.keyPress(KeyEvent.VK_M);
  r.keyRelease(KeyEvent.VK_M);
  		
  r.keyPress(KeyEvent.VK_G);
  r.keyRelease(KeyEvent.VK_G);
  
 Thread.sleep(2000);
  r.keyPress(KeyEvent.VK_ENTER);
  r.keyRelease(KeyEvent.VK_ENTER);	  

  Thread.sleep(4000);
  driver.findElement(By.xpath("//*[@id='after_capture']/div[3]")).click();
	
  
  TakesScreenshot bn=(TakesScreenshot) driver;
  File src1=bn.getScreenshotAs(OutputType.FILE);
  File des=new File("C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\screenshots");
  FileUtils.copyFile(src1, des);
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  

}
}