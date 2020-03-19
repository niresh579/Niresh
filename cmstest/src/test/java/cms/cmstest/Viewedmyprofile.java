package cms.cmstest;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
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

public class Viewedmyprofile extends Base{
	public static WebDriver driver;
	String driverExecutablePath = "C:\\\\\\\\Users\\\\\\\\CBS Testing\\\\\\\\workspace\\\\\\\\Niresh\\\\\\\\cmstest\\\\\\\\drivernew\\\\\\\\chromedriver.exe";

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
	  public void testUntitled() throws InterruptedException {
		  ViewednotcontactedPOM rp= new ViewednotcontactedPOM(driver);
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
		  
		  Thread.sleep(4000);
		  JavascriptExecutor gh = (JavascriptExecutor)driver;
    	  WebElement edit1= driver.findElement(By.xpath("//span[contains(text(),'VIEWED MY PROFILE')]"));
	  	  gh.executeScript("arguments[0].scrollIntoView(true);",edit1);
		  Thread.sleep(4000);
		 // driver.findElement(By.xpath("//*[@id='menusegment']/ion-segment-button[6]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'VIEWED MY PROFILE')]")).click();
		  //shortlist
			 Thread.sleep(4000);
			 
				  List<WebElement> ref = driver.findElements(By.xpath("//span[contains(text(),'Shortlist')]"));
				  System.out.println("aaa 1 : "+ ref.size());
				  for (int i = 1; i <ref.size(); i++) {
			 	driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row["+i+"]/ion-grid/ion-row[1]/ion-col[2]/div[1]/div/span"));
					  Thread.sleep(4000); 
					  ref.get(i).click();
				  Thread.sleep(3000);
				  }	  
				  Thread.sleep(4000);
				WebElement element = driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row[1]/ion-grid/ion-row[1]/ion-col[2]/div[1]/div/span"));
					
				String ab= element.getText();
					
					 
			  
			 Thread.sleep(3000);
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	  WebElement edit= driver.findElement(By.xpath("(//span[@class='clr36 font10'])[1]"));
			  	  js.executeScript("arguments[0].scrollIntoView(true);",edit);
			  	  
			 Thread.sleep(4000);
			  String b1 = driver.findElement(By.xpath("(//span[@class='clr36 font10'])[1]")).getText();
	      System.out.println("2 "+b1);
	      String[] split = b1.split("|");
	     System.out.println("3 "+split[0]);
					    	 
			  Thread.sleep(4000);
			 
		      Base.btnclick(rp.getShortlisted());
			  
			  Thread.sleep(3000);
			  
			  List<WebElement> ref2 = driver.findElements(By.xpath("//span[@class='clr36 font10']"));
			  System.out.println("aaa 2 : "+ ref2.size());
			  for (int i = 1; i <ref2.size(); i++) {
				  
		 Thread.sleep(3000);		 
		String b23=	ref2.get(i).getText();
		
			
			
			Thread.sleep(3000);
				  if (b23.contains(ab)) {
					System.out.println("4  "+b23+  "Matched");
				} else {
	              System.out.println("Not matched");
				}
			
			  }
			  
			  
			  
					  		  
	}
					



}



