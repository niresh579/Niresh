package napalimatrimony.copy;

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
	    sk1(np.getUsername(),"NEP137204");
		Thread.sleep(4000);
		WebElement e1=driver.findElement(By.xpath("//*[@id='passwordClear1']"));
        Actions a1=new Actions(driver);
        a1.sendKeys(e1,"cbstest").build().perform();
        Thread.sleep(6000);
        click(np.getLogin1());
		Thread.sleep(10000);
		         
		try {
     //	click(np.getSkip());
			WebElement skip5 = driver.findElement(By.xpath("//a[@class='clr7']"));
			skip5.click();
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
       
			WebElement addonjs = driver.findElement(By.xpath("//*[@id='lp-container']/div[5]/div[4]/div[1]/span[1]"));
       		JavascriptExecutor jss = (JavascriptExecutor)driver;
	        jss.executeScript("arguments[0].scrollIntoView(true);",addonjs);
			//WebElement click5 = driver.findElement(By.xpath("//*[@id=\"frmPartner\"]/div/dl[16]/dd/div[1]/span/span[1]/span/ul/li/input"));
   			//click5.click();
   			Thread.sleep(5000);
			System.out.println("picking weblist");
			Thread.sleep(5000);
     	WebElement genhoroscope = driver.findElement(By.xpath("//*[@id='lp-container']/div[5]/div[4]/div[2]/a[2]"));
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
		WebElement generate = driver.findElement(By.xpath("//*[@id='frm']/div[1]/input"));
		
		generate.click();
		Thread.sleep(50000);
		
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
    WebElement profilecompletetwo = driver.findElement(By.xpath("//*[@id='userpop']/div[2]/div/div[2]/div[2]/div/a/div/div[2]/div[1]"));
    Thread.sleep(5000);
    String percent2 = profilecompletetwo.getText();
    System.out.println("2nd time profilecompletepercentage = " + percent2);
    Thread.sleep(5000);
   
		
  }		
				
}

       	
       	
       	
       	
  	
  

		
      
		
			
		
  
  
	
			
		
	
  
  
