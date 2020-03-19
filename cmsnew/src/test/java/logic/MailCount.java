package logic;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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
import pom.MailCountPOM;


public class MailCount {
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
      MailCountPOM rp= new MailCountPOM(driver);	
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

	  
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[2]/a")).click();
	  
	  
	  Thread.sleep(4000);
	  try {
		  BaseTest.click(rp.getGotit());
	} catch (Exception e2) {
		System.out.println("no exception");
	}
	  Thread.sleep(4000);
	  BaseTest.click(rp.getAccepted());
	  
	  //accepted
	  Thread.sleep(4000);
	  List <WebElement> edit= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
for (WebElement web : edit) {
	 JavascriptExecutor js =(JavascriptExecutor)driver;		 
	  js.executeScript("arguments[0].scrollIntoView(true);",web);
}
	
		
	  
	  Thread.sleep(4000); 
	  List <WebElement> ref= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
	int count=ref.size();
	  System.out.println("accepted1 :"+count);
	 
	  Thread.sleep(4000); 
	  List <WebElement> ref1= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
	int count1=ref1.size();
	  System.out.println("accepted1 blocked :"+count1);
	  
	  //declined
	  BaseTest.click(rp.getDeclined());
	  
	  Thread.sleep(10000);
	  List <WebElement> edit1= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
for (WebElement web : edit1) {
	 JavascriptExecutor js =(JavascriptExecutor)driver;		 
	  js.executeScript("arguments[0].scrollIntoView(true);",web);
} 
	  
	  Thread.sleep(6000); 
	  List <WebElement> ref2= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
	int count2=ref2.size();
	  System.out.println("declined1 :"+count2);
	 
	  Thread.sleep(6000); 
	  List <WebElement> ref3= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
	int count3=ref3.size();
	  System.out.println("declined1 blocked :"+count3);
	  
	  //Replied

BaseTest.click(rp.getReplied());

Thread.sleep(4000);
List <WebElement> edit2= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
for (WebElement web : edit2) {
JavascriptExecutor js =(JavascriptExecutor)driver;		 
js.executeScript("arguments[0].scrollIntoView(true);",web);
} 

Thread.sleep(4000); 
List <WebElement> ref4= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
int count4=ref4.size();
System.out.println("replied1 :"+count4);

Thread.sleep(4000); 
List <WebElement> ref5= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
int count5=ref5.size();
System.out.println("replied1 blocked :"+count5);

	  //SENT

Thread.sleep(6000);
driver.findElement(By.xpath("//span[contains(text(),'SENT')]")).click();

Thread.sleep(6000);
BaseTest.click(rp.getAccepted()); 

Thread.sleep(6000);
List <WebElement> edit3= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
for (WebElement web : edit3) {
JavascriptExecutor js =(JavascriptExecutor)driver;		 
js.executeScript("arguments[0].scrollIntoView(true);",web);
} 

Thread.sleep(6000); 
List <WebElement> ref6= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
int count6=ref6.size();
System.out.println("sent accepted :"+count6);

Thread.sleep(6000); 
try {
	List <WebElement> ref7= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
	int count7=ref7.size();
	System.out.println("sent accepted blocked :"+count7);
} catch (Exception e2) {
	System.out.println("no element");
}


//declined   //ion-grid[@class='list_item grid']  //ion-row[@class='row']	

Thread.sleep(6000);
BaseTest.click(rp.getDeclined());

Thread.sleep(5000);
List <WebElement> edit4= driver.findElements(By.xpath("(//div//ion-row[@class='row'])[90]"));
for (WebElement web : edit4) {
JavascriptExecutor js =(JavascriptExecutor)driver;		 
js.executeScript("arguments[0].scrollIntoView(true);",web);
} 

Thread.sleep(5000); 
List <WebElement> ref8= driver.findElements(By.xpath("//div//ion-row[@class='row']"));
int count8=ref8.size();
System.out.println("sent declined :"+count8);


Thread.sleep(7000);
List <WebElement> edit9= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
for (WebElement web : edit9) {
JavascriptExecutor js =(JavascriptExecutor)driver;		 
js.executeScript("arguments[0].scrollIntoView(true);",web);
} 

Thread.sleep(5000); 
try {
	List <WebElement> ref9= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
	int count9=ref9.size();
	System.out.println("sent declined blocked :"+count9);

} catch (Exception e2) {
	System.out.println("no element");
}

//Replied
Thread.sleep(5000);
BaseTest.click(rp.getReplied());

Thread.sleep(10000);
List <WebElement> edit5= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
for (WebElement web : edit5) {
JavascriptExecutor js =(JavascriptExecutor)driver;		 
js.executeScript("arguments[0].scrollIntoView(true);",web);
} 

Thread.sleep(6000); 
List <WebElement> ref10= driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
int count10=ref10.size();
System.out.println("sent replied :"+count10);

Thread.sleep(6000);
try {
	 
	List <WebElement> ref11= driver.findElements(By.xpath("//ion-grid[@class='list_item res_txt paddtb10 clra3 white_bg grid']"));
	int count11=ref11.size();
	System.out.println("sent replied blocked :"+count11);

} catch (Exception e2) {
	System.out.println("no element");
}


/////////////Filter ////////////
//	  Thread.sleep(4000);
//      driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-mailbox/ion-header/div[1]/ion-row/div")).click();
//       
//     // Thread.sleep(4000);
//     // BaseTest.click(rp.getAll());
//
//      Thread.sleep(4000);
//      BaseTest.click(rp.getApply());
//      
//      Thread.sleep(4000);
//      List<WebElement> demo = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
//      for (WebElement web : demo) {
//    	  JavascriptExecutor js = (JavascriptExecutor) driver;
//    	  js.executeScript("arguments[0].scrollIntoView(true);", web);
//		
//	}
//      
//      Thread.sleep(4000);
//      List<WebElement> demo1 = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
//      int total = demo1.size();
//      System.out.println("all :"+total);
//      
//      Thread.sleep(4000);
//      driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-mailbox/ion-header/div[1]/ion-row/div")).click();
//      
//      Thread.sleep(4000);
//      BaseTest.click(rp.getInterestreceived());
//      
//      Thread.sleep(4000);
//      BaseTest.click(rp.getApply());
// 
//      Thread.sleep(4000);
//      List<WebElement> demo2 = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
//      for (WebElement web : demo2) {
//    	  JavascriptExecutor js = (JavascriptExecutor) driver;
//    	  js.executeScript("arguments[0].scrollIntoView(true);", web);
//		
//	}
//      
//      Thread.sleep(4000);
//      List<WebElement> demo3 = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
//      int total1 = demo3.size();
//      System.out.println("Interest received :"+total1);
//      
//      Thread.sleep(4000);
//      driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-mailbox/ion-header/div[1]/ion-row/div")).click();
//      
//      Thread.sleep(4000);
//      BaseTest.click(rp.getMessagereceived());
//      
//   Thread.sleep(4000);
//   BaseTest.click(rp.getInterestreceived());
//    
//    Thread.sleep(4000);
//    BaseTest.click(rp.getApply());
//    
//    Thread.sleep(4000);
//    List<WebElement> demo4 = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
//    for (WebElement web : demo4) {	
//  	  JavascriptExecutor js = (JavascriptExecutor) driver;
//  	  js.executeScript("arguments[0].scrollIntoView(true);", web);
//		
//	}
//    
//    Thread.sleep(4000);
//    List<WebElement> demo5 = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
//    int total2 = demo5.size();
//    System.out.println("message received :"+total2);
//    
//    
//    
//    Thread.sleep(4000);
//    driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-mailbox/ion-header/div[1]/ion-row/div")).click();
//    
//    Thread.sleep(4000);
//    BaseTest.click(rp.getRequestreceived());
//    
//    Thread.sleep(4000);
//    BaseTest.click(rp.getRequestreceived());
//    
//    Thread.sleep(4000);
//    BaseTest.click(rp.getApply());
//    
//    
//    Thread.sleep(4000);
//    List<WebElement> demo6 = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
//    for (WebElement web : demo6) {
//  	  JavascriptExecutor js = (JavascriptExecutor) driver;
//  	  js.executeScript("arguments[0].scrollIntoView(true);", web);
//		
//	}
//    
//    Thread.sleep(4000);
//    List<WebElement> demo7 = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
//    int total3 = demo7.size();
//    System.out.println("request received :"+total3);
//    
//    
//    Thread.sleep(4000);
//    driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-mailbox/ion-header/div[1]/ion-row/div")).click();
//    
//    Thread.sleep(4000);
//    BaseTest.click(rp.getShowfilteredmessage());
//    
//    Thread.sleep(4000);
//    BaseTest.click(rp.getRequestreceived());
//    
//    Thread.sleep(4000);
//    BaseTest.click(rp.getApply());
//    
//    Thread.sleep(4000);
//    List<WebElement> demo8 = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
//    for (WebElement web : demo8) {
//  	  JavascriptExecutor js = (JavascriptExecutor) driver;
//  	  js.executeScript("arguments[0].scrollIntoView(true);", web);
//		
//	}
//    
//    Thread.sleep(4000);
//    List<WebElement> demo9 = driver.findElements(By.xpath("//div[@class='id-name paddt5']"));
//    int total4 = demo9.size();
//    System.out.println("getshow filtered message :"+total4);
//    
    
    
    
    
    
}
}