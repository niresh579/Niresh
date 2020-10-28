package napalimatrimony.copy;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.MalformedURLException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Basepack.Base1;
import PomPack.AddonpackPom;

import PomPack.NagativepaymentPOM;
import PomPack.RandomidcheckPOM;
import PomPack.StarwithmothertounghPPPom2;
import PomPack.StarwithmothertounghPom;
import PomPack.UpgrateexcelPom;
import PomPack.WhoviewmyprofilePOM;
import PomPack.WhoviewshotlistedmePOM;
import groovyjarjarantlr.ParserSharedInputState;
import groovyjarjarantlr.debug.TraceAdapter;

public class WCSMMale extends Base1{
	private static final String Data = null;
	public static WebDriver driver; 
	String driverExecutablePath = "C:\\Users\\CBSTEsting\\eclipse-workspace\\ArtifMatrimony\\driver\\chromedriver.exe";
	ExtentReports report;
    ExtentTest logger; 
    
   @BeforeMethod
  public void setUp1() throws MalformedURLException { 
	  System.setProperty("webdriver.chrome.driver", driverExecutablePath); 
	  ChromeOptions options = new ChromeOptions();
	   options.addArguments("--disable-notifications");
	  driver = new ChromeDriver(options);
	  
      
  
  }
  @Test
  public void setUp2()throws Throwable  {
	  WhoviewshotlistedmePOM np = new WhoviewshotlistedmePOM(driver); 
	  driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	    sk1(np.getUsername(),"NAR375118");
		Thread.sleep(4000);
		WebElement e1=driver.findElement(By.xpath("//*[@id='passwordClear1']"));
        Actions a1=new Actions(driver);
        a1.sendKeys(e1,"cbstest").build().perform();
        Thread.sleep(6000);
        click(np.getLogin1());
		Thread.sleep(10000);
		         
		try {
//			WebElement skip = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
//			skip.click();
		click(np.getSkip());
		} catch (Exception e) {
			 System.out.println("ok");
			 }
		Thread.sleep(15000);
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(4000);
			WebElement popup = driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img"));
			popup.click();
	     	} catch (Exception e) {
           System.out.println("pop up ok");		}
		
		      	Thread.sleep(8000);
		      	WebElement menuclick = driver.findElement(By.xpath("//*[@id='topnav-login-menu']/div[3]/div[2]/div[1]/a/img"));
		      	Actions acc = new Actions(driver);
		      	acc.moveToElement(menuclick).perform();
		      	Thread.sleep(3000);
       	        driver.findElement(By.xpath("//*[@id='userpop']/div[2]/div/div[1]/a/span[1]")).click();
       	Thread.sleep(3000);
       	String parentwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		for (String id : allwindow) {
			if (!parentwindow.equals(id)) {
			driver.switchTo().window(id);
			}
		}
		Thread.sleep(6000);
//		try {
//		 WebElement malepro =	driver.findElement(By.xpath("//span[text()='Male']"));
//			String male = malepro.getText();
//		} 
		WebElement age = driver.findElement(By.xpath("//*[@id='loadProfileValue']/div[2]/div[1]/div[2]"));
		String age1 = age.getText();
		String age2 = age1.substring(0, 2);
		int maleagenumber = Integer.parseInt(age2);
		int one = 1;
		int second = 2;
		int third = 3;
		int four = 4;
		int ten = 10;
		int fifteen = 15;
		int a = 18;
		int b = 29;
		int c = 39;
		int d = 49;
		int e = 59;
		int f = 60;
		int g = 66;
		if (maleagenumber>a && maleagenumber<b)
		{
			
			System.out.println("Female profile age is = From 18 to " + (maleagenumber+one) );
			
		}else if (maleagenumber>b && maleagenumber<c) {
			
			System.out.println("Female profile age is = From " + (maleagenumber-ten) + " To " + (maleagenumber+second) );
		}else if (maleagenumber>c && maleagenumber<d) {
			
			System.out.println("Female profile age is = From " +  (maleagenumber-ten)  + " To " +(maleagenumber+third) );
		
			}else if (maleagenumber>d && maleagenumber<e) {
				
				System.out.println("Female profile age is = From " + (maleagenumber-fifteen) +  " To " + (maleagenumber+four)  );
			  			
			}else if (maleagenumber>f && maleagenumber<g) {
				
				System.out.println("Female profile age is = From " + (maleagenumber-fifteen) +  " To " + (maleagenumber+four)  );
			}else if (maleagenumber>g) {
					
					System.out.println("Female profile age is = From " + (maleagenumber-fifteen) +  " To 70" );
			}	
		
  }
  
  
  
}  				
					
					
					
					
				
			
      
			            		
	
				
					
					
				
				
				

			
		
       	
       	
       	
       	
  	
  

		
      
		
			
		
  
  
	
			
		
	
  
  
