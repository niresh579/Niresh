package logic;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

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

import Base.BaseTest;
import pom.EditPpPOM;



public class EditPp extends BaseTest {
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
       	
       	EditPpPOM rp= new EditPpPOM(driver);
       	Thread.sleep(5000);
		    driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
		    driver.manage().window().maximize();
		    
		    //login
		    WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
			Actions a=new Actions(driver);
			Thread.sleep(4000);
			a.sendKeys(e,"EZH556542").build().perform();
		    
		    Thread.sleep(4000);
		    
		    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
		    Thread.sleep(4000);
			Actions b=new Actions(driver);
			Thread.sleep(4000);
			b.sendKeys(d,"cbstest").build().perform();
		    
		  Thread.sleep(4000);
		BaseTest.click(rp.getLogin());
		  
		  Thread.sleep(9000);
		  driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
		  
		  Thread.sleep(4000);
		  BaseTest.click(rp.getEditpp());
		  
//		  Thread.sleep(4000);
//		  driver.findElement(By.xpath("//*[@id=\"editpp-pwa\"]/div[1]/div/div[2]")).click();
//		  Thread.sleep(4000);
//		  WebElement e1=driver.findElement(By.xpath("(//a[@aria-valuenow='0'])[1]"));
//		  if (e1.isEnabled()) {
//			  System.out.println("true");
//			
//		}
//		  else {
//			System.out.println("false");
//		}
//		  
//		  Thread.sleep(8000);
//		   	JavascriptExecutor js3 = (JavascriptExecutor)driver;
//		   	  WebElement edi3= driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[1]/div[2]/a/img"));
//			  	  js3.executeScript("arguments[0].scrollIntoView(true);",edi3);
		
	  Thread.sleep(4000);
		  BaseTest.click(rp.getEditBasic());
		  
		  Thread.sleep(4000);	
		  BaseTest.click(rp.getPartnerlooking());
		  
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		  Thread.sleep(4000);
		  BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+getExcelData("Sheet2", 1, 1)+"')]")));
			Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		  
//		  Thread.sleep(4000);
//		  BaseTest.click(rp.getAgefrom());
		  
//		  Thread.sleep(4000);
//		  driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//		  Thread.sleep(4000);
//		  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet2", 1, 2)+"')]")));
//		  
//		  Thread.sleep(3000);
//		  BaseTest.click(rp.getAgeto());
//		  Thread.sleep(4000);
//		  driver.findElement(By.xpath("//*[@id=\"RegPanelSearchvalue\"]")).click();
//		  Thread.sleep(4000);
//		  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet2", 1, 3)+"')]")));
//		  
		  Thread.sleep(4000);
		  BaseTest.click(rp.getHeightfrom());
		  Thread.sleep(4000);
				  driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				  Thread.sleep(4000);
			
				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet2", 1, 4)+"')]")));
		  Thread.sleep(4000);
		  BaseTest.click(rp.getHeightto());
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		  Thread.sleep(4000);
	
		  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet2", 1, 5)+"')]")));
		  
		  Thread.sleep(4000);
		  BaseTest.click(rp.getMothertongue());
//		  Thread.sleep(4000);
//		  driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//		  Thread.sleep(4000);
//	      BaseTest.click(driver.findElement(By.xpath(" "+getExcelData("Sheet2", 1, 6)+"')]")));
	      Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id='chkbox2_4']")).click();
	  
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		  
		  Thread.sleep(4000);
		  BaseTest.click(rp.getPhyscialstatus());
//		  Thread.sleep(4000);
//		  driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//		  Thread.sleep(4000);
//	
//		  BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+getExcelData("Sheet2", 1, 7)+"')]")));
	 
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='chkbox0']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		  
		  Thread.sleep(3000);
		  BaseTest.click(rp.getEatinghabit());
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='chkbox0']")).click();

		//  driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//		  Thread.sleep(4000);
//	
//		  BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+getExcelData("Sheet2", 1, 8)+"')]")));
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		  
		  Thread.sleep(4000);
		  BaseTest.click(rp.getDrinkinghabit());
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='chkbox0']")).click();

//		  Thread.sleep(4000);
//		  driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//		  Thread.sleep(4000);
//		  BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+getExcelData("Sheet2", 1, 9)+"')]")));
	      Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		  
		
		  Thread.sleep(3000);
		  BaseTest.click(rp.getSmokinghabit());
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='chkbox0']")).click();

//		  Thread.sleep(4000);
//		  driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//		  Thread.sleep(4000);
//		  BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+getExcelData("Sheet2", 1, 10)+"')]")));
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click(); 
		  
		  Thread.sleep(4000);
		  BaseTest.click(rp.getSave());
		  
		  Thread.sleep(4000);
		  BaseTest.getScreenshot(driver, "PP Basic Details");
		  
		  
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click();
		  
		  Thread.sleep(13000);
		  
		  //religiousinformation
		  Thread.sleep(4000);
		  BaseTest.click(rp.getReligiousinformation());
		  Thread.sleep(4000);
		  BaseTest.click(rp.getSubcaste());
//		  Thread.sleep(4000);
//		  driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//		  Thread.sleep(4000);
//		  BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+getExcelData("Sheet2", 4, 1)+"')]")));
  
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='chkbox0_0']")).click();

		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		  
		  Thread.sleep(4000);
		  click(rp.getDhosam());
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		  Thread.sleep(4000);
           BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet2", 4, 2)+"')]")));
		  
		  Thread.sleep(4000);
		  click(rp.getStar());
		 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id='chkbox0']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		  
		  Thread.sleep(4000);
		  click(rp.getSave());
		  
		  Thread.sleep(4000);
		  BaseTest.getScreenshot(driver, "PP Religious Information Popup");
		  
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click();  
	
		  Thread.sleep(4000);
		  click(rp.getProffesionalinformation());
		  
		  Thread.sleep(4000);
			 BaseTest.click(rp.getEducation());
			  
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id='chkbox0_0']")).click();
				 driver.findElement(By.xpath("//*[@id='Icon_delete']/span")).click();
				 
		  
		  Thread.sleep(4000);
		  BaseTest.click(rp.getOccupation());
		  
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='chkbox0_0']")).click();
		  Thread.sleep(4000);
		 driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		 
		 
		  Thread.sleep(4000);
		 click(rp.getAnnualincomefrom());
		 Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		  Thread.sleep(4000);
	
		  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet2", 7, 3)+"')]")));
		 
		  Thread.sleep(4000);
		  click(rp.getAnnualincometo());
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		  Thread.sleep(4000);
	
		  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet2", 7, 4)+"')]")));
		 
		  Thread.sleep(4000);
		  click(rp.getSave());
		  
		  Thread.sleep(4000);
		  BaseTest.getScreenshot(driver, "PP Professional Information Popup");
		  
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click();  
		  
		  //Location
		  Thread.sleep(4000);
		  click(rp.getLocationpreference());
		  Thread.sleep(3000);
		  click(rp.getCountry());
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='chkbox0']")).click();
//		  Thread.sleep(4000);
//		  driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//		  Thread.sleep(4000);
//	       BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+getExcelData("Sheet2", 10, 1)+"')]")));
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		 
		  Thread.sleep(4000);
		  click(rp.getState());
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='chkbox0']")).click();
//		  Thread.sleep(4000);
//	       BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+getExcelData("Sheet2", 10, 2)+"')]")));
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		  
		  Thread.sleep(4000);
		  click(rp.getCity());
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='chkbox0']")).click();
//		  Thread.sleep(4000);
//	       BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+getExcelData("Sheet2", 10, 3)+"')]")));
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		  
		  Thread.sleep(4000);
		  click(rp.getCitizenship());
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='chkbox0']")).click();
//		  Thread.sleep(4000);
//	       BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+getExcelData("Sheet2", 10, 4)+"')]")));
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		  
		  Thread.sleep(4000);
		  click(rp.getSave());
		  Thread.sleep(4000);
		  BaseTest.getScreenshot(driver, "PP Location");
		  
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click();
		  
		  
}
}