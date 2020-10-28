package cms.cmstest;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class RemoveBlockedIgnoredProfile extends Base {
	public static WebDriver driver;
	String  driverExecutablePath = "C:\\\\Users\\\\CBS Testing\\\\workspace\\\\Niresh\\\\cmstest\\\\drivernew\\\\chromedriver.exe";
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
           
        }
        
        @Test
        public void testUntitled() throws InterruptedException {
         IgnoredProfilePOM rp = new IgnoredProfilePOM(driver);
         driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
		    driver.manage().window().maximize();
		    
        
		    
		    //login
		    Thread.sleep(3000);
		    Base.btnclick(rp.getUsername());
		    Actions a=new Actions(driver);
			Thread.sleep(4000);
			a.sendKeys("IYR242926").build().perform();
		    
		    Thread.sleep(4000);
		    Base.btnclick(rp.getPassword());
		    Thread.sleep(4000);
			Actions b=new Actions(driver);
			Thread.sleep(4000);
			b.sendKeys("cbstest").build().perform();
		    
		  Thread.sleep(6000);
		  Base.btnclick(rp.getLogin());
		  
		  Thread.sleep(6000);
		  Base.btnclick(rp.getMenu());
		  
		  Thread.sleep(6000);
		  Base.btnclick(rp.getSetting());
		  
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list/ion-item[1]")).click();
		  
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-shortlisted/ion-content/div[2]/ion-list/ion-row/ion-grid/ion-row[1]/ion-col[2]/div[3]/ion-row/ion-col[2]/ion-icon")).click();

		  Thread.sleep(4000);
		  driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-shortlisted/ion-content/div[2]/ion-list/ion-row/ion-grid/ion-row[1]/ion-col[2]/div[3]/ion-row/ion-col[2]/ion-list/button")).click();

		  
		  
		  
		  
		  
		  
}
}