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

public class VerifyMail {
	public static WebDriver driver;
    String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\cmstest\\drivernew\\chromedriver.exe";

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
        	VerifyMailPOM rp = new VerifyMailPOM(driver);
        	driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
		    driver.manage().window().maximize();
		    
		    //login
		    Thread.sleep(3000);
		    Base.btnclick(rp.getUsername());
		    Actions a=new Actions(driver);
			Thread.sleep(4000);
			a.sendKeys("chy410863").build().perform();
		    
		    Thread.sleep(4000);
		    Base.btnclick(rp.getPassword());
		    Thread.sleep(4000);
			Actions b=new Actions(driver);
			Thread.sleep(4000);
			b.sendKeys("cbstest").build().perform();
		    
		  Thread.sleep(6000);
		  Base.btnclick(rp.getLogin());
        	
        	
		  Thread.sleep(6000);
        	Thread.sleep(4000);
        	Base.btnclick(rp.getMatches());
        	
        	 Thread.sleep(4000);
   		  String b1 = driver.findElement(By.xpath("(//div[@tabindex='0'])[3]")).getText();
           System.out.println("1 "+b1);
           
           Thread.sleep(4000);
           driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row[2]/ion-grid/ion-row[2]/ion-col[3]")).click();
           
           Thread.sleep(4000);
        	Base.btnclick(rp.getMail());
        	
        	Thread.sleep(4000);
        	try {
				driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-mailbox/div/div[2]/div")).click();
			} catch (Exception e) {
				System.out.println("no popup");
			}
        	
        	Thread.sleep(4000);
        	Base.btnclick(rp.getSent());
        	
        	Thread.sleep(4000);
   		 String b2 = driver.findElement(By.xpath("(//div[@class='id-name paddt5'])[1]")).getText();
   	        System.out.println("2 "+b2);
   		
   	        Thread.sleep(3000);
   	        if (b2.contains(b1)) {
   				System.out.println(b2);
   			} 
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        }       	
        	
}
