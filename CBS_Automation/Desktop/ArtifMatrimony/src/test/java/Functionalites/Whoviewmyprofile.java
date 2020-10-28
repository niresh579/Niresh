package Functionalites;

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

import Basepack.Base3;
import PomPack.AddonpackPom;

import PomPack.NagativepaymentPOM;
import PomPack.RandomidcheckPOM;
import PomPack.StarwithmothertounghPPPom2;
import PomPack.StarwithmothertounghPom;
import PomPack.UpgrateexcelPom;
import PomPack.WhoviewmyprofilePOM;
import groovyjarjarantlr.ParserSharedInputState;
import groovyjarjarantlr.debug.TraceAdapter;

public class Whoviewmyprofile extends Base3{
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
	  WhoviewmyprofilePOM np = new WhoviewmyprofilePOM(driver); 
	  driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	    sk1(np.getUsername(),"EZH556542");
		Thread.sleep(4000);
		WebElement e1=driver.findElement(By.xpath("//*[@id='passwordClear1']"));
        Actions a1=new Actions(driver);
        a1.sendKeys(e1,"cbstest").build().perform();
        Thread.sleep(6000);
        click(np.getLogin1());
		Thread.sleep(10000);
		try {
			WebElement skip1 = driver.findElement(By.xpath("//a[@class='clr7']"));
			skip1.click();
		
		} catch (Exception e) {
			 System.out.println("ok");
			 } 
		         
		try {
			WebElement skip = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a[2]"));
			skip.click();
		//click(np.getSkip());
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
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(4000);
			WebElement popup = driver.findElement(By.xpath("//*[@id='strategicComm']/div/div[2]/a/img"));
			popup.click();
	     	} catch (Exception e) {
           System.out.println("ok");		}
		
		
		      	Thread.sleep(8000);
		      	WebElement menuclick = driver.findElement(By.xpath("//*[@id='topnav-login-menu']/div[2]/div[1]"));
		      	Actions acc = new Actions(driver);
		      	acc.moveToElement(menuclick).perform();
		      	Thread.sleep(3000);
       	click(np.getWhoviewclick());
       	Thread.sleep(3000);
       	WebElement howmanymembers = driver.findElement(By.xpath("//*[@id='total_div']/span[2]"));
       	String howmany = howmanymembers.getText();
       	  int ad = Integer.parseInt(howmany);
       	float aa = (ad/10+1);

       	float ab = (float) Math.ceil(aa);
       	
       	int ac = (int) (ab+0);
       	  
      	System.out.println(ac);
 

     	for (int i = 0; i < 1; i++) {
			
		  
       	
       	for (int j = 0; j < ac ; j++) {
       		Thread.sleep(3000);
       		try {
       			WebElement addonjs = driver.findElement(By.xpath("//*[@id='paginationBottomStrip']/div[1]"));
	       		JavascriptExecutor jss = (JavascriptExecutor)driver;
		        jss.executeScript("arguments[0].scrollIntoView(true);",addonjs);
		        Thread.sleep(3000);
				click(np.getClicknext());
			} catch (Exception e) {
				System.out.println(" menu click");
			}
       		Thread.sleep(3000);
       		List <WebElement> demos = driver.findElements(By.xpath("//a[@class='clr6 font14  boldtxt']"));
			for (WebElement allmembersid : demos) {
				String at = allmembersid.getText();
				System.out.println("members id " + at);
				Thread.sleep(3000);
			 
			
			}
			}
   			
		}
  }
     					}
					
					
					
					
				
			
      
			            		
	
				
					
					
				
				
				

			
		
       	
       	
       	
       	
  	
  

		
      
		
			
		
  
  
	
			
		
	
  
  
