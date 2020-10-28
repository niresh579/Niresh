package Logic;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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
import pom.LoginLogoutPOM;


public class LoginLogout {
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\Negative\\driver\\chromedriver.exe"; 

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
          
       }
       
       @Test
       public void testUntitled() throws Throwable {
    	   LoginLogoutPOM rp=new LoginLogoutPOM(driver);
    	   Thread.sleep(5000);
   	    driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
   	    driver.manage().window().maximize();
   	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   	    
//   	    WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
//   		Actions a=new Actions(driver);
//   		Thread.sleep(4000);
//   		a.sendKeys(e,"IYR242926").build().perform();
//   	    	
//   	    Thread.sleep(4000); 
//   	    
//   	    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
//   	    Thread.sleep(4000);
//   		Actions b=new Actions(driver);
//   		Thread.sleep(4000);
//   		b.sendKeys(d,"cbstest").build().perform();
//   	    
//   	  Thread.sleep(4000);
//   	BaseTest.click(rp.getLogin());
//   	
//   	Thread.sleep(4000);
//   	driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
//   	
//   	Thread.sleep(4000);
//   	BaseTest.click(rp.getSetting());
//   	
//   	Thread.sleep(4000);
//   	BaseTest.click(rp.getLogout());
   	
   	/// my height is 5 female
   	/// so gents height should be 5.1 to 7.11
   	
   	
   	//WebElement myheight=driver.findElement(By.xpath("//*[XXX']"));
   	String myheightfrom = ("4ft - 7 ft 8 in");
   	System.out.println("Age in pp:"+myheightfrom);
	  String[] split=myheightfrom.split("ft - 7 ft 8 in");
	 System.out.println("1234"+split[0]);
	 
//	  String[] split1=myheightfrom.split("18 - ");
//	
//	  String[] split2=split1[1].split(" Yrs");
//	  
//	  String ppage=(split[0]+"-"+split2[0]);
//	  System.out.println("final pp age:"+ppage);
//   	
 
	 String a3=("4ft - 7 ft 8 in");
		System.out.println("Height :" +a3);
		String[] split4=a3.split("-");
		
		
		System.out.println("height1 "+split4[0]);
		System.out.println("heightto :"+split4[1]);
		Thread.sleep(4000);
		try {
			
			
			String[] split5=split4[0].split(" in");
				System.out.println("value0 :"+split5[0]);
			String[] split6=split5[0].split(" ft ");
			System.out.println("value1 :"+split6[0]);
			System.out.println("value2 :"+split6[1]);
			
			String abs=split6[0]+"."+split6[1];
//			heightfrom = Float.parseFloat(abs);
//			System.out.println(heightfrom);
//			
		} catch (Exception e2) {
			String[] split7=split4[0].split(" ft");
			System.out.println("value3 :"+split7[0]);
			String bcs=split7[0];
//			 heightfrom =Float.parseFloat(bcs); 
//			 System.out.println(heightfrom);
		}
		
		
		
	try {
			
			String[] split5=split4[1].split(" in");
				System.out.println("value0 :"+split5[0]);
			String[] split6=split5[0].split(" ft ");
			System.out.println("value1 :"+split6[0]);
			System.out.println("value2 :"+split6[1]);
			
			String abs=split6[0]+"."+split6[1];
//			heightto = Float.parseFloat(abs);
//			System.out.println(heightto);
			
		} catch (Exception e2) {
			String[] split7=split4[0].split(" ft");
			System.out.println("value3 :"+split7[0]);
			String bcs=split7[0];
//			 heightto =Float.parseFloat(bcs);
//			 System.out.println(heightto);
		}
		
	 
	 
   	
}
}