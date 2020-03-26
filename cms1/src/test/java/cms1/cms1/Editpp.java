package cms1.cms1;

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

import cms1.cms.Base;




public class Editpp extends Base {
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\cmstest\\driver\\chromedriver.exe"; 

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
       public void testUntitled() throws InterruptedException {
       	
       	EditppPOM rp= new EditppPOM(driver);
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
		  Base.btnclick(rp.getLogin());
		  
		  Thread.sleep(4000);
		  Base.btnclick(rp.getMenu());
		  
		  Thread.sleep(4000);
		  Base.btnclick(rp.getEditpp());
		  
		  Thread.sleep(4000);
		  Base.btnclick(rp.getEditBasic());
		  
		  Thread.sleep(4000);
		  Base.btnclick(rp.getPartnerlooking());
		  
		  Thread.sleep(4000);
		 
			
		
		  
		
		  
		 

}
}