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

import org.apache.commons.io.FileUtils;
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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

public class Memberswhohaveviewedyourprofile extends Base3{
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
	    sk1(np.getUsername(),"KCM454443");
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
//			WebElement skip = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
//			skip.click();
		click(np.getSkip());
		} catch (Exception e) {
			 System.out.println("ok");
			 }
		Thread.sleep(20000);
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(4000);
			Base3.takeSnapShot(driver, "fileWithPath");
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
//       	WebElement howmanymembers = driver.findElement(By.xpath("//*[@id='total_div']/span[2]"));
//       	String howmany = howmanymembers.getText();
//       	  int ad = Integer.parseInt(howmany);
//       	float aa = (ad/10+1);
//
//       	float ab = (float) Math.ceil(aa);
//       	
//       	int ac = (int) (ab+0);
//       	  
//      	System.out.println(ac);
// 
//
//     	for (int i = 0; i < 1; i++) {
//			
//		  
//       	
//       	for (int j = 0; j < ac ; j++) {
//       		Thread.sleep(3000);
//       		try {
//       			WebElement addonjs = driver.findElement(By.xpath("//*[@id='paginationBottomStrip']/div[1]"));
//	       		JavascriptExecutor jss = (JavascriptExecutor)driver;
//		        jss.executeScript("arguments[0].scrollIntoView(true);",addonjs);
//		        Thread.sleep(3000);
//				click(np.getClicknext());
//			} catch (Exception e) {
//				System.out.println(" menu click");
//			}
//       		Thread.sleep(3000);
//       		List <WebElement> demos = driver.findElements(By.xpath("//a[@class='clr6 font14  boldtxt']"));
//			for (WebElement allmembersid : demos) {
//				String at = allmembersid.getText();
//				System.out.println("members id " + at);
//				Thread.sleep(3000);
//			 
//			
//			}
//			
			//////lopa completed
       	    WebElement shortlistreference = driver.findElement(By.xpath("(//span[@class='shortlistIcon-off'])[1]"));
			boolean shortlist = driver.findElement(By.xpath("(//span[@class='shortlistIcon-off'])[1]")).isSelected();
			if (shortlist==true) {
				shortlistreference.click();
				System.out.println("selected");
			}else {
				System.out.println(" already selected");
				
			}
			/////////shorlisted
			WebElement firststprofileshortlistreference = driver.findElement(By.xpath("(//a[@class='clr6 font14  boldtxt'])[1]"));
			String firstprofile  = firststprofileshortlistreference.getText();
			System.out.println("firstprofile = " + firstprofile);
			Thread.sleep(5000);
			WebElement shortlistbutton = driver.findElement(By.xpath("//*[@id='acitvity']/ul/li[3]/a/span[1]"));
			shortlistbutton.click();
			String parentwindows = driver.getWindowHandle();
			Set<String> allwindows = driver.getWindowHandles();
			for (String id : allwindows) {
				if (parentwindows.equals(id)) {
				driver.switchTo().window(id);
				String curl1 = driver.getCurrentUrl();
		       	 System.out.println("current url " + curl1);
		       	WebElement nextwindowfirststprofileshortlistreference = driver.findElement(By.xpath("(//a[@class='clr6 font14  boldtxt'])[1]"));
				String nextwindowfirstprofile  = nextwindowfirststprofileshortlistreference.getText();
				Thread.sleep(4000);
				System.out.println("nextwindowfirstprofile = " + nextwindowfirstprofile);
				System.out.println("firstprofile = " + firstprofile + "=" + nextwindowfirstprofile + "nextwindowfirstprofile = ");
									
				}
				}
			/////mobile
//			Thread.sleep(4000);
//			WebElement mobilenumber = driver.findElement(By.xpath("//span[@class='mobileIcon'])[1]"));
//			mobilenumber.click();
//			Thread.sleep(4000);
//			WebElement viewmobilenumberbutton = driver.findElement(By.xpath("//a[@class='send-active-btn font15'])[2]"));
//			viewmobilenumberbutton.click();
//			Thread.sleep(4000);
//			WebElement viewmobilenumber = driver.findElement(By.xpath("//*[@id='lightpic']/div/div/div/div[11]"));
//			String mobilnum = viewmobilenumber.getText();
//			System.out.println("mobilenumber = " + mobilnum);
			click(np.getProfileclick());
			click(np.getProfileclick1());
			
			String parentwindows1 = driver.getWindowHandle();
			Set<String> allwindows1 = driver.getWindowHandles();
			for (String id : allwindows1) {
				if (parentwindows1.equals(id)) {
				driver.switchTo().window(id);
				String curl1 = driver.getCurrentUrl();
				
				}
  			}
			
			Thread.sleep(8000);
			WebElement age = driver.findElement(By.xpath("//*[@id='strictflag']/div[4]/div[1]/span[2]"));
			String ages = age.getText();
		System.out.println("age parameter = " + ages);
		
		WebElement height = driver.findElement(By.xpath("//*[@id='strictflag']/div[6]/div[1]/span[2]"));
		String heights = height.getText();
	System.out.println("heights parameter = " + heights);
		driver.navigate().back();
		Thread.sleep(8000);
		WebElement shortlistbutton1 = driver.findElement(By.xpath("//*[@id='acitvity']/ul/li[3]/a/span[1]"));
		shortlistbutton1.click();
		String parentwindows2 = driver.getWindowHandle();
		Set<String> allwindows2 = driver.getWindowHandles();
		for (String id : allwindows2) {
			if (parentwindows2.equals(id)) {
			driver.switchTo().window(id);
			String curl1 = driver.getCurrentUrl();
	       	 System.out.println("current url " + curl1);
  }			
}		
		Thread.sleep(10000);
		
		WebElement ageone = driver.findElement(By.xpath("//*[@id='result0']/div[1]/div[4]/div[3]/div[1]/ul/li[1]/span[2]"));
		String agesone = ageone.getText();
		System.out.println("age parameter shortlist = " + agesone);
		System.out.println("Partner perfernces age and height parameters should between = " + ages + "=" +" So shortlist candidate age and height is = " + agesone);
		Thread.sleep(5000);
		WebElement profileshorlitclickbutton = driver.findElement(By.xpath("//*[@id='chksr0']"));
		profileshorlitclickbutton.click();
		Thread.sleep(2000);
		WebElement profileshorlitclickbuttonsubmit = driver.findElement(By.xpath("//*[@id='search_div']/div[5]/div[3]/div/a"));
		profileshorlitclickbuttonsubmit.click();
		Thread.sleep(6000);
		WebElement shotlistpopup = driver.findElement(By.xpath("//*[@id='lightpic']/div/div/div/div[4]"));
		String shotlistpopupshows = shotlistpopup.getText();
		System.out.println(" shortlist status = " + shotlistpopupshows);
		WebElement closebutton = driver.findElement(By.xpath("(//a[@class='popupclose popup-close-off'])[4]"));
		closebutton.click();
		Thread.sleep(4000);
		WebElement lastonlinebutton = driver.findElement(By.xpath("//span[@class=\"shortlistIcon\" and @class=\"icon-bg\"]"));
			lastonlinebutton.click();	
		String parentwindows4 = driver.getWindowHandle();
		Set<String> allwindows4 = driver.getWindowHandles();
		for (String id : allwindows4) {
			if (parentwindows4.equals(id)) {
			driver.switchTo().window(id);
			String curl1 = driver.getCurrentUrl();
	       	 System.out.println("current url " + curl1);
  }			            		
}
		
			Thread.sleep(4000);
  			WebElement profilebuttondropdown = driver.findElement(By.xpath("(//span[@class='shortlistIcon']//following::span[2]"));
  			profilebuttondropdown.click();	
  			Thread.sleep(4000);
  	  			WebElement blcokbutton = driver.findElement(By.xpath("(//a[text()='Block'])[1]"));
  	  			blcokbutton.click();	
  	  			Thread.sleep(4000);
  	  			WebElement blcokokbutton = driver.findElement(By.xpath("(//a[@class='send-active-btn'])[2]"));
  	  			blcokokbutton.click();
  	  		driver.switchTo().defaultContent();
  	  	Thread.sleep(4000);
  	  	WebElement memberblocked = driver.findElement(By.xpath("(//span[text()='Members you have blocked']"));
  	  memberblocked.click();
  	Thread.sleep(4000);
  	String parentwindows5 = driver.getWindowHandle();
	Set<String> allwindows5 = driver.getWindowHandles();
	for (String id : allwindows5) {
		if (parentwindows5.equals(id)) {
		driver.switchTo().window(id);
		String curl1 = driver.getCurrentUrl();
       	 System.out.println("current url " + curl1);
         			
}				
				
}				
	Thread.sleep(4000);
	WebElement blockprofile = driver.findElement(By.xpath("//*[@id='hide_no_result']/div[1]/a"));
	String blockprofileid = blockprofile.getText();
	System.out.println("blocked profile id = " + blockprofileid);	

  }
}    	
       	
       	
       	
  	
  

		
      
		
			
		
  
  
	
			
		
	
  
  
