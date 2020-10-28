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
import pom.DailyMatchesPOM;

public class DailyMatches {
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
       public void testUntitled() throws Throwable {
      DailyMatchesPOM rp= new DailyMatchesPOM(driver);	
      Thread.sleep(5000);
	    driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
	    driver.manage().window().maximize();
	    
	    //login
	    WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
		Actions a=new Actions(driver);
		Thread.sleep(4000);
		a.sendKeys(e,"IYR352685").build().perform();
	    
	    Thread.sleep(4000); 
	    
	    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
	    Thread.sleep(4000);
		Actions b=new Actions(driver);
		Thread.sleep(4000);
		b.sendKeys(d,"cbstest").build().perform();
	    
	  Thread.sleep(4000);
	BaseTest.click(rp.getLogin());		
	
	Thread.sleep(6000);
    driver.findElement(By.xpath("(//span[@class='ficon icon-daily-matches'])[3]")).click();
    
    Thread.sleep(4000);
    driver.findElement(By.xpath("//*[@id='d7guide']")).click();
    
//    Thread.sleep(4000);
//    WebElement gh=driver.findElement(By.xpath("(//span[@class='button-inner']/following::span[@class='button-inner font18'])[2]"));
//    Thread.sleep(4000);
//	Actions hi=new Actions(driver);
//	Thread.sleep(4000);
//	hi.click(gh).build().perform();
//   
//	 Thread.sleep(4000);
//	    WebElement hg=driver.findElement(By.xpath("(//span[@class='button-inner']/following::span[@class='button-inner font18'])[1]"));
//	    Thread.sleep(4000);
//		Actions ih=new Actions(driver);
//		Thread.sleep(4000);
//		ih.click(hg).build().perform();
	
	Thread.sleep(4000);
	Actions acc=new Actions(driver);
	Thread.sleep(3000);
    WebElement src=driver.findElement(By.xpath("(//div[@class='profile_img posrelative'])[1]"));
    Thread.sleep(4000);
   WebElement des=driver.findElement(By.xpath("(//div[@class='prof_footer padd0'])[1]"));
Thread.sleep(3000);
acc.dragAndDrop(src, des).build().perform();
    //Thread.sleep(6000);	
    //driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();
     
    
}
}       
