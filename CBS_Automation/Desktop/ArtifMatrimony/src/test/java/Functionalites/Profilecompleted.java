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

import Basepack.Base3;
import PomPack.AddonpackPom;

import PomPack.NagativepaymentPOM;
import PomPack.ProfilecompletedPom;
import PomPack.RandomidcheckPOM;
import PomPack.StarwithmothertounghPPPom2;
import PomPack.StarwithmothertounghPom;
import PomPack.UpgrateexcelPom;

public class Profilecompleted extends Base3{
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
	    sk1(np.getUsername(),"RDY485145");
		Thread.sleep(4000);
		WebElement e1=driver.findElement(By.xpath("//*[@id='passwordClear1']"));
        Actions a1=new Actions(driver);
        a1.sendKeys(e1,"cbstest").build().perform();
        Thread.sleep(6000);
        click(np.getLogin1());
		Thread.sleep(10000);
		         
		try {
     	driver.findElement(By.xpath("/html/body/div[1]/div[2]/a[2]")).click();
		} catch (Exception e) {
			 System.out.println("ok");
			 }
		Thread.sleep(15000);
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(4000);
			Base3.takeSnapShot(driver, "Homescreenbeforepopup");
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
		WebElement menu = driver.findElement(By.xpath("//*[@id='topnav-login-menu']/div[3]/div[2]/div[1]/span"));
        Actions acc = new Actions(driver);
        acc.moveToElement(menu).perform();
		WebElement profilecomplete = driver.findElement(By.xpath("//*[@id='userpop']/div[2]/div/div[2]/div[2]/div/a/div/div[2]/div[1]"));
        String profilecompletepercentage = profilecomplete.getText();
        System.out.println("1st time profilecompletepercentage = " + profilecompletepercentage);
       	click(np.getCompleteprofile());
       	
       	
       	Thread.sleep(5000);
       	String parentwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		for (String id : allwindow) {
			if (!parentwindow.equals(id)) {
			driver.switchTo().window(id);
			}
			
		}
		Thread.sleep(8000);
		String curl = driver.getCurrentUrl();
       	 System.out.println("current url " + curl);
       	 try {
       		WebElement click3 = driver.findElement(By.xpath("//*[@id='strategicComm']/div/div[2]/a/img"));
       		click3.click();
	} catch (Exception e) {
			System.out.println("click 3 ok ");		}
       	Thread.sleep(8000);
       
			
   			
     	WebElement genhoroscope = driver.findElement(By.xpath("//*[@id='lp-container']/div[5]/div[3]/div[2]/a[2]"));
        genhoroscope.click();
    	Thread.sleep(5000);
       	String parentwindow2 = driver.getWindowHandle();
		Set<String> allwindow2 = driver.getWindowHandles();
		for (String id : allwindow2) {
			if (!parentwindow2.equals(id)) {
			driver.switchTo().window(id);
			}
			
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
		WebElement addonjs = driver.findElement(By.xpath("//*[@id='language']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);",addonjs);
		WebElement generate = driver.findElement(By.xpath("//input[@value='Generate']"));
		generate.click();
		Thread.sleep(30000);
		
       	String parentwindows = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		for (String id : allwindows) {
			if (parentwindow.equals(id)) {
			driver.switchTo().window(id);
			String curl1 = driver.getCurrentUrl();
	       	 System.out.println("current url " + curl1);
			}
			
		}
		
	
		 Thread.sleep(5000);
    driver.navigate().refresh();
    try {
    	click(np.getProfileclick());
    	WebElement profilecomplete3 = driver.findElement(By.xpath("//div[@class='font']"));
    	Thread.sleep(5000);
        String percent1 = profilecomplete3.getText();
        System.out.println("2nd time profilecompletepercentage = " + percent1);
    
    } catch (Exception e) {
		System.out.println("ok");
	}
    
    try {
    	click(np.getProfileclick());
    	WebElement profilecomplete4 = driver.findElement(By.xpath("//div[@class='numbers']"));
    	Thread.sleep(5000);
        String percent2 = profilecomplete4.getText();
        System.out.println("2nd time profilecompletepercentage = " + percent2);
    
    } catch (Exception e) {
		System.out.println("ok");
	}
    
    Thread.sleep(5000);
    click(np.getProfileclick());
   	click(np.getProfileclick1());
   	Thread.sleep(10000);
   	WebElement addonjss = driver.findElement(By.xpath("//div[text()='Contact Details']"));
    JavascriptExecutor jss = (JavascriptExecutor)driver;
    jss.executeScript("arguments[0].scrollIntoView(true);",addonjss);
   	WebElement genhoroscope2 = driver.findElement(By.xpath("(//a[@class='title-link'])[10]"));
    genhoroscope2.click();
    WebElement horoscopedelete = driver.findElement(By.xpath("//input[@value='Delete']"));
    horoscopedelete.click();
    driver.switchTo().alert().accept();
    driver.navigate().back();
    driver.navigate().back();
    driver.navigate().back();
    driver.navigate().refresh();
		
		
    Thread.sleep(5000);
    driver.navigate().refresh();
    try {
    	click(np.getProfileclick());
    	WebElement profilecomplete9 = driver.findElement(By.xpath("//div[@class='font']"));
    	Thread.sleep(5000);
        String percent9 = profilecomplete9.getText();
        System.out.println("3rd time profilecompletepercentage = " + percent9);
    
    } catch (Exception e) {
		System.out.println("ok");
	}
    
    try {
    	click(np.getProfileclick());
    	WebElement profilecomplete5 = driver.findElement(By.xpath("//div[@class='numbers']"));
    	Thread.sleep(5000);
        String percent5 = profilecomplete5.getText();
        System.out.println("3rd time profilecompletepercentage = " + percent5);
    
    } catch (Exception e) {
		System.out.println("ok");
	}
    try {
    click(np.getProfileclick());
    WebElement profilecomplete7 = driver.findElement(By.xpath("//*[@id='userpop']/div[2]/div/div[2]/div[2]/div/a/div/div[2]/div[1]"));
    Thread.sleep(5000);
    String percent7 = profilecomplete7.getText();
    System.out.println("3rd time profilecompletepercentage = " + percent7);
    } catch (Exception e) {
		System.out.println("ok");
	}	
		
		
	
    
		
  }		
				
}

       	
       	
       	
       	
  	
  

		
      
		
			
		
  
  
	
			
		
	
  
  
