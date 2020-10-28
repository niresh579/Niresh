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

public class MatchesPhoto {
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
        MatchesPhotoPOM rp = new MatchesPhotoPOM(driver);
      
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
	 driver.findElement(By.xpath("//*[@id='menusegment']/ion-segment-button[2]")).click();
	 
	//Thread.sleep(5000);
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
	//	  WebElement edit= driver.findElement(By.xpath("//img[@src='https://imgs.ezhavamatrimony.com/cbsimages/avatarfoto_requestmob_f.jpg']"));
	//	  	  js.executeScript("arguments[0].scrollIntoView(true);",edit);
	 
	 Thread.sleep(4000);
	 List<WebElement> ref = driver.findElements(By.xpath("//img[@src='https://imgs.ezhavamatrimony.com/cbsimages/avatarfoto_requestmob_f.jpg']"));	
	  System.out.println("requestphoto : "+ ref.size());
	  
	 
	 
	 
	 
	 
	 
	 
	 
}
}