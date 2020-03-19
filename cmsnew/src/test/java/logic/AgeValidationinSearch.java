package logic;

import java.io.File;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

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
import pom.AgeValidationinSearchPOM;
import pom.VerifyAgeppPOM;

public class AgeValidationinSearch {
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
      AgeValidationinSearchPOM rp= new AgeValidationinSearchPOM(driver);	
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
	BaseTest.click(rp.getLogin());	
	
	//Menu
	
	try {
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a")).click();
		  
	} catch (Exception e2) {
		System.out.println("no exception");
	}
	
	try {
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
		
	} catch (Exception e2) {
		System.out.println("no exception");
	}
	
	Thread.sleep(4000);
	BaseTest.click(rp.getEditpp());
	
	Thread.sleep(3000);
   	JavascriptExecutor js = (JavascriptExecutor)driver;
   	  WebElement edit= driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[1]/div[2]/a"));
	  	  js.executeScript("arguments[0].scrollIntoView(true);",edit);
	
	Thread.sleep(4000);
	WebElement ref = driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[3]/div[2]"));
	String a1=ref.getText();
	System.out.println("partner prefernce age :"+a1);
	String [] split2=a1.split("-");
	System.out.println("pp age1 :"+split2[0]);
	String spl=split2[0].toString().trim();
	int ppstartage=Integer.parseInt(spl);
	System.out.println("ppstartage :"+ppstartage);
	
	
	String [] split3=a1.split(" - ");
	System.out.println("pp age2 :"+split3[0]);
	String [] split4=split3[1].split(" Yrs");
	System.out.println("pp age 3 :"+split4[0]);
	String split5=split4[0].toString().trim();
	int ppendage=Integer.parseInt(split5);
	System.out.println("ppendage :"+ppendage);
	
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	
	Thread.sleep(4000);
	BaseTest.click(rp.getBackhistory());
	
	//searchmain
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[4]")).click();
	
	//search
	Thread.sleep(3000);
   	JavascriptExecutor js1 = (JavascriptExecutor)driver;
   	  WebElement edit1= driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-footer/ion-toolbar/div[2]/ion-grid/ion-row/ion-col[3]"));
	  	  js1.executeScript("arguments[0].scrollIntoView(true);",edit1);
	
	  	  
	Thread.sleep(4000);
	driver.findElement(By.xpath("	")).click();
	

	Thread.sleep(4000);
	WebElement ref1 = driver.findElement(By.xpath("(//div[@class='id-name'])[2]"));
	String a2=ref1.getText();
	System.out.println("Name :"+a2);
	
	Thread.sleep(4000);
	WebElement ref2 = driver.findElement(By.xpath("(//div[@class='address paddt5'])[1]"));
	String a3=ref2.getText();
	System.out.println("Age :"+a3);
	
String [] split =a3.split(",");
System.out.println("Age :"+split[0]);
String [] split1 = split[0].split("yrs");
System.out.println("search age Final:"+split1[0]);	
String spli = split1[0].toString().trim();
int userage = Integer.parseInt(spli);
System.out.println("userage :"+userage);

if (ppstartage==userage || ppendage>=userage) {
	System.out.println("Äge MATCHED");
}
	else {
		System.out.println("Not Matched");
	}
		


}
}