package Functionalites;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
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

import Basepacknew.Base3;
import PomPack.AddonpackPom;

import PomPack.NagativepaymentPOM;
import PomPack.ProfilecompletedPom;
import PomPack.RandomidcheckPOM;
import PomPack.StarwithmothertounghPPPom2;
import PomPack.StarwithmothertounghPom;
import PomPack.UpgrateexcelPom;

public class horoscopewitheditprofile extends Base3{
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
	  ProfilecompletedPom np = new ProfilecompletedPom(driver); 
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
           System.out.println("ok");		}
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
		WebElement menu = driver.findElement(By.xpath("//*[@id='topnav-login-menu']/div[3]/div[2]/div[1]/a"));
        Actions acc = new Actions(driver);
        acc.moveToElement(menu).perform();
	driver.findElement(By.xpath("//*[@id='userpop']/div[2]/div/div[3]/div[1]/ul/li[1]/a")).click();
       
       	
       	

		Thread.sleep(8000);
		WebElement addonjs = driver.findElement(By.xpath("//*[@id='container7']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);",addonjs);
        Thread.sleep(3000);
//        try {
//        	driver.findElement(By.xpath("//*[@id='lp-container']/div/div/center/div[1]/div[1]/div[2]/ul/li[3]/div[2]/div[2]/div[2]/a")).click();
//        	
//		} catch (Exception e) {
//			System.out.println("generate horoscope");
//		}
        Thread.sleep(5000);
        try {
        	
        	boolean genhor = driver.findElement(By.xpath("//*[@id='lp-container']/div/div/center/div[1]/div[1]/div[2]/ul/li[3]/div[2]/div[2]/div[2]/a")).isDisplayed();
        	if (genhor==true) {
        		driver.findElement(By.xpath("//*[@id='lp-container']/div/div/center/div[1]/div[1]/div[2]/ul/li[3]/div[2]/div[2]/div[2]/a")).click();
				
			}else {
				System.out.println("already horoscope generated");
			}
        	
		} catch (Exception e) {
			System.out.println("horoscope status");
			driver.quit();
		}
        

		Thread.sleep(5000);
		WebElement TBDate = driver.findElement(By.xpath("//*[@id='hours']"));
		Select scc1 = new Select(TBDate);
		scc1.selectByIndex(2);
		WebElement TBmonth = driver.findElement(By.xpath("//*[@id='mins']"));
		Select scc2 = new Select(TBmonth);
		scc2.selectByIndex(2);
		WebElement TBam = driver.findElement(By.xpath("//*[@id='meridiem']"));
		Select scc3 = new Select(TBam);
		scc3.selectByIndex(2);
		Thread.sleep(5000);
		WebElement countryofbirth = driver.findElement(By.xpath("//*[@id='country']"));
		Select scc4 = new Select(countryofbirth);
		scc4.selectByIndex(3);
		Thread.sleep(5000);
		WebElement stateofbirth = driver.findElement(By.xpath("//*[@id='state']"));
		Select scc5 = new Select(stateofbirth);
		scc5.selectByIndex(5);
		Thread.sleep(5000);
		WebElement cityofbirth = driver.findElement(By.xpath("//*[@id='city']"));
		Select scc6 = new Select(cityofbirth);
		scc6.selectByIndex(3);
		WebElement chartStyle = driver.findElement(By.xpath("//*[@id='chartStyle']"));
		Select scc7 = new Select(chartStyle);
		scc7.selectByIndex(3);
		WebElement language = driver.findElement(By.xpath("//*[@id='language']"));
		Select scc9 = new Select(language);
		scc9.selectByIndex(3);
		WebElement addonjss = driver.findElement(By.xpath("//*[@id='language']"));
        JavascriptExecutor jss = (JavascriptExecutor)driver;
        jss.executeScript("arguments[0].scrollIntoView(true);",addonjss);
		WebElement generate = driver.findElement(By.xpath("//input[@value='Generate']"));
		generate.click();
		
		Thread.sleep(5000);
		System.out.println("Generate Horoscope Completed");
		 String Parent = driver.getWindowHandle();
		 System.out.println("Parent Window ID is  " + Parent);
			Thread.sleep(3000);
		 
			 Set<String> winHandles = driver.getWindowHandles();
				int count = winHandles.size();
				System.out.println("Window Count is : " + count);
				for (String winHandle : winHandles) {
					if (Parent.contains(winHandle)) {
						Thread.sleep(3000);
						driver.switchTo().window(winHandle);
					}

					System.out.println("window Handle Id :" + winHandle);

				}
				Thread.sleep(6000);
				driver.navigate().refresh();
				 Robot robot = new Robot();	
				 robot.keyPress(KeyEvent.VK_F5);
				 robot.keyRelease(KeyEvent.VK_F5);
				
				System.out.println("Horoscope generated");	
                
                try {
				Thread.sleep(6000);
				WebElement menu1 = driver.findElement(By.xpath("//*[@id='topnav-login-menu']/div[3]/div[2]/div[1]/span"));
		        Actions acc1 = new Actions(driver);
		        acc1.moveToElement(menu1).perform();
				WebElement profilecomplete = driver.findElement(By.xpath("//*[@id='userpop']/div[2]/div/div[2]/div[2]/div/a/div/div[2]/div[1]"));
				profilecomplete.click();
				Thread.sleep(5000);
		       	String parentwindow = driver.getWindowHandle();
				Set<String> allwindow = driver.getWindowHandles();
				for (String id : allwindow) {
					if (!parentwindow.equals(id)) {
					driver.switchTo().window(id);
					}
				}
				Thread.sleep(7000);
					   WebElement Generatehoroscope = driver.findElement(By.xpath("//a[text()='Generate Horoscope']"));
		    	   Generatehoroscope.click();
		    	   Thread.sleep(5000);
		   		WebElement TBDate1 = driver.findElement(By.xpath("//*[@id='hours']"));
		   		Select scc11 = new Select(TBDate1);
		   		scc11.selectByIndex(2);
		   		WebElement TBmonth1 = driver.findElement(By.xpath("//*[@id='mins']"));
		   		Select scc21 = new Select(TBmonth1);
		   		scc21.selectByIndex(2);
		   		WebElement TBam1 = driver.findElement(By.xpath("//*[@id='meridiem']"));
		   		Select scc31 = new Select(TBam1);
		   		scc31.selectByIndex(2);
		   		Thread.sleep(5000);
		   		WebElement countryofbirth1 = driver.findElement(By.xpath("//*[@id='country']"));
		   		Select scc41 = new Select(countryofbirth1);
		   		scc41.selectByIndex(3);
		   		Thread.sleep(5000);
		   		WebElement stateofbirth1 = driver.findElement(By.xpath("//*[@id='state']"));
		   		Select scc51 = new Select(stateofbirth1);
		   		scc51.selectByIndex(5);
		   		Thread.sleep(5000);
		   		WebElement cityofbirth1 = driver.findElement(By.xpath("//*[@id='city']"));
		   		Select scc61 = new Select(cityofbirth);
		   		scc61.selectByIndex(3);
		   		WebElement chartStyle1 = driver.findElement(By.xpath("//*[@id='chartStyle']"));
		   		Select scc71 = new Select(chartStyle1);
		   		scc71.selectByIndex(3);
		   		WebElement language1 = driver.findElement(By.xpath("//*[@id='language']"));
		   		Select scc91 = new Select(language1);
		   		scc91.selectByIndex(3);
		   		WebElement addonjss1 = driver.findElement(By.xpath("//*[@id='language']"));
		           JavascriptExecutor jss1 = (JavascriptExecutor)driver;
		           jss1.executeScript("arguments[0].scrollIntoView(true);",addonjss1);
		   		WebElement generate1 = driver.findElement(By.xpath("//input[@value='Generate']"));
		   		generate1.click();
		   		
		   		Thread.sleep(5000);
		   		System.out.println("Generate Horoscope Completed");
		    	   
			} catch (Exception e) {
				System.out.println("horoscope generated");
				
			}
		       	
                Thread.sleep(5000);
                WebElement menu1 = driver.findElement(By.xpath("//*[@id='topnav-login-menu']/div[2]/div[4]/a"));
                Actions acc1 = new Actions(driver);
                acc1.moveToElement(menu1).perform();
                Thread.sleep(5000);
                WebElement idsearch = driver.findElement(By.xpath("//*[@id='id']"));
                idsearch.sendKeys("EZH556542");
                Thread.sleep(5000);
                WebElement searchclick = driver.findElement(By.xpath("//input[@class='searchbox_submit']"));
                searchclick.click();
                String parentwindow1 = driver.getWindowHandle();
                Set<String> allwindow1 = driver.getWindowHandles();
				for (String id : allwindow1) {
					if (!parentwindow1.equals(id)) {
					driver.switchTo().window(id);
										}
				}
				
				WebElement viewhoroscope = driver.findElement(By.xpath("//a[@title='View Horoscope']"));
				viewhoroscope.click();
                driver.close();
                WebElement addonjs2 = driver.findElement(By.xpath("//*[@id='newloadProfileValue']/div[1]/div/div[1]/div[7]/div[17]/div[1]"));
                JavascriptExecutor js2 = (JavascriptExecutor)driver;
                js2.executeScript("arguments[0].scrollIntoView(true);",addonjs2);
                
				WebElement viewhoroscope2 = driver.findElement(By.xpath("//*[@id='newloadProfileValue']/div[1]/div/div[1]/div[7]/div[17]/div[2]/div/div[2]/div/a"));
				viewhoroscope2.click();
  }		
				
}

       	
       	
       	
       	
  	
  

		
      
		
			
		
  
  
	
			
		
	
  
  
