package cms.cmstest;

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

public class blockedProfileviewmyprofile {
	public static WebDriver driver;
	String driverExecutablePath = "C:\\\\Users\\\\CBS Testing\\\\workspace\\\\Niresh\\\\cmstest\\\\drivernew\\\\chromedriver.exe"; 

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
       	
       	BlockedProfilePOM rp= new BlockedProfilePOM(driver);
       	Thread.sleep(5000);
		    driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
		    driver.manage().window().maximize();
		    
		    //login
		    WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
			Actions a=new Actions(driver);
			Thread.sleep(4000);
			a.sendKeys(e,"NEP137104").build().perform();
		    
		    Thread.sleep(4000);
		    
		    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
		    Thread.sleep(4000);
			Actions b=new Actions(driver);
			Thread.sleep(4000);
			b.sendKeys(d,"cbstest").build().perform();
		    
		  Thread.sleep(4000);
		  Base.btnclick(rp.getLogin());
		  
		  //matches
		  Thread.sleep(6000);
		Base.btnclick(rp.getViewedmyprofile());
		
		 Thread.sleep(4000);
		  String b1 = driver.findElement(By.xpath("(//span[@class='clr36 font10'])[1]")).getText();
        System.out.println("1 "+b1);
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row[1]/ion-grid/ion-row[1]/ion-col[2]/div[3]/ion-row/ion-col/ion-icon")).click();
        Thread.sleep(4000);
		Actions c=new Actions(driver);
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row[1]/ion-grid/ion-row[1]/ion-col[2]/div[3]/ion-row/ion-col/ion-list/button[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ion-alert/div/div[3]/button[2]/span")).click(); 
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
		
		Thread.sleep(4000);
		Base.btnclick(rp.getSetting());
		
		Thread.sleep(4000);
		Base.btnclick(rp.getBlocked());
		
		Thread.sleep(4000);
		 String b2 = driver.findElement(By.xpath("(//span[@class='clr36 font10'])[1]")).getText();
	        System.out.println("2 "+b2);
		
	        Thread.sleep(3000);
	        if (b2.contains(b1)) {
				System.out.println("4  "+b2+"Matched");
			} else {
                 System.out.println("Not matched");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
