package napalimatrimony.copy;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import PomPack.UpgrateexcelEuroPom2;
import PomPack.UpgrateexcelPom;

public class UpgrateExcelEuro2 extends Base1{
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
	  UpgrateexcelEuroPom2 np = new UpgrateexcelEuroPom2(driver); 
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
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
			r.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(4000);
			
//			WebElement popup = driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img"));
//			popup.click();
			
		click(np.getPopup());
		} catch (Exception e) {
           System.out.println("ok");		}
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
           System.out.println("ok");		}
       	Thread.sleep(6000);
       	try {
       		WebElement Upgrate = driver.findElement(By.xpath("//*[@id='topnav-login-menu']/div[2]/div[6]/a"));
       		Upgrate.click();
		} catch (Exception e) {
            System.out.println("upgrate ok");
}
		
		Thread.sleep(12000);
		String title = driver.getCurrentUrl();
		System.out.println(title);
		
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		for (String id : allwindow) {
			if (!parentwindow.equals(id)) {
			driver.switchTo().window(id);
			}
			
		}
			String title2 = driver.getCurrentUrl();
			String title3=title2+"&countryCode=21";
			driver.navigate().to(title3);
			
			System.out.println(title3);
			Thread.sleep(8000);
			
			WebElement ss = driver.findElement(By.xpath("//*[@id='pay_member_package']/div[1]/div[1]/div[2]/label[1]/div/div[2]/label/span[1]"));
		    String ss2 = ss.getText();
		    String ss2s = ss2.substring(4);
		    String aaa = Base1.setExcelData("Sheet1", 1, 1, ss2s);
		    
		    WebElement ss1 = driver.findElement(By.xpath("//*[@id='pay_member_package']/div[1]/div[1]/div[2]/label[2]/div/div[2]/label/span[1]"));
		    String ss3 = ss1.getText();
		    String ss3s = ss3.substring(4);
		    String aa1 = Base1.setExcelData("Sheet1", 1, 2, ss3s);
		    try {
		    	 WebElement ss4 = driver.findElement(By.xpath("//*[@id='pay_member_package']/div[1]/div[1]/div[3]/label[1]/div/div[3]/label/span[1]"));
				    String ss5 = ss4.getText();
				    String ss4s = ss5.substring(0,3);
				    String aa2 = Base1.setExcelData("Sheet1", 2, 1, ss4s);
			} catch (Exception e) {
              System.out.println("ok");
}
		   
		    
		    WebElement ss6 = driver.findElement(By.xpath("//*[@id='pay_member_package']/div[1]/div[1]/div[3]/label[2]/div/div[2]/label/span[1]"));
		    String ss7 = ss6.getText();
		    String ss6s = ss7.substring(4);
		    String aa4 = Base1.setExcelData("Sheet1", 2, 2, ss6s);
		    
		    WebElement ss8 = driver.findElement(By.xpath("//*[@id='pay_member_package']/div[1]/div[1]/div[4]/label[1]/div/div[2]/label/span[1]"));
		    String ss9 = ss8.getText();
		    String ss8s = ss9.substring(4);
		    String aa7 = Base1.setExcelData("Sheet1", 3, 1, ss8s);
		    
		    WebElement ss10 = driver.findElement(By.xpath("//*[@id='pay_member_package']/div[1]/div[1]/div[4]/label[2]/div/div[2]/label/span[1]"));
		    String ss11 = ss10.getText();
		    String ss11s = ss11.substring(4);
		    String aa10 = Base1.setExcelData("Sheet1", 3, 2, ss11s);
		    
		    WebElement ss22 = driver.findElement(By.xpath("//*[@id='pay_member_package']/div[1]/div[3]/div/label/div[1]/div[2]/label/span[1]/span[2]"));
		    String ss20 = ss22.getText();
		    String ss12s = ss20.substring(4);
		    String aa15 = Base1.setExcelData("Sheet1", 4, 1, ss12s);
		    
		    Thread.sleep(4000);
		    click(np.getPersonalclick());
		    WebElement ss25 = driver.findElement(By.xpath("//*[@id='memb-plan-assisted1']/label/div[1]/div[3]"));
		    String ss40 = ss25.getText();
		    String aa19 = Base1.setExcelData("Sheet1", 6, 1, ss40);
		    
		    WebElement ss28 = driver.findElement(By.xpath("//*[@id='memb-plan-assisted2']/label/div[1]/div[3]"));
		    String ss47 = ss28.getText();
		    String aa29 = Base1.setExcelData("Sheet1", 6, 2, ss47);
		    
		    
		      
  }	
  
}
		
      
		
			
		
  
  
	
			
		
	
  
  
