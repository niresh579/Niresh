package Logic;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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

import Base.BaseTest;
import pom.EditPPPOM;
import pom.WcsmPPPOM;

public class WcsmPP {
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\drivernew1\\chromedriver.exe"; 

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
       	
       	WcsmPPPOM rp= new WcsmPPPOM(driver);
       	Thread.sleep(5000);
		    driver.get("https://mstage.communitymatrimony.com/cbsmob/login.php");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    
		    //login
		    WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
			Actions a=new Actions(driver);
			Thread.sleep(4000);
			a.sendKeys(e,"AGR159").build().perform();
		    
		    Thread.sleep(4000);
		    
		    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
		    Thread.sleep(4000);
			Actions b=new Actions(driver);
			Thread.sleep(4000);
			b.sendKeys(d,"cbstest").build().perform();
		    
		  Thread.sleep(4000);
		BaseTest.click(rp.getLogin());
		  
		try {
			Thread.sleep(8000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
			
			
		} catch (Exception e2) {
			System.out.println("no element 1");
		}
		
		try {
			Thread.sleep(8000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a")).click();
			
			
		} catch (Exception e2) {
			System.out.println("no element 2");
		}
		
		try {
			Thread.sleep(8000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a/span")).click();
			
			
		} catch (Exception e2) {
			System.out.println("no element 3");
		}
		
		Thread.sleep(4000);
		BaseTest.click(rp.getEditpp());
		
		 Thread.sleep(4000);
		  WebElement marital2=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[1]/div[2]"));
		  String partner=marital2.getText();
		  System.out.println("marital status :"+partner);
		  
		  try {
			  Thread.sleep(4000);
			  WebElement havechild=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[2]/div[2]"));
			  String child=havechild.getText();
			  System.out.println("have children :"+child);
			  
		} catch (Exception e2) {
			System.out.println("no child");
		}
		  
		  Thread.sleep(4000);
		  WebElement age=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[3]/div[2]"));
		  String ppa=age.getText();
		  System.out.println("Age in pp:"+ppa);
		  String[] split=ppa.split(" - 30 Yrs");
		 System.out.println("startage:"+split[0]);
	  String[] split1=ppa.split("24 - ");
		  String[] split2=split1[1].split(" Yrs");
		  System.out.println("endage:"+split2[0]);
//		  String ppage=(split[0]+"-"+split2[0]);
//		  System.out.println("final pp age:"+ppage);
//		  
		  Thread.sleep(4000);
		  WebElement height=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[4]/div[2]"));
		  String ppheight=height.getText();
		  System.out.println("Height in pp :"+ppheight);
		  
		  Thread.sleep(4000);
		  WebElement mother=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[5]/div[2]/span"));
		  String tongue=mother.getText();
		  System.out.println("mother tongue in pp :"+tongue);

		  Thread.sleep(4000);
		  WebElement occ=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[5]/div[2]/ul/li[2]/div[2]"));
		  String occpp=occ.getText();
		  System.out.println("occupation in pp :"+occpp);
		  
		  
		  Thread.sleep(4000);
		  WebElement income=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[5]/div[2]/ul/li[3]/div[2]"));
		  String incomepp=income.getText();
		  System.out.println("income in pp :"+incomepp);
		  
		  //BACK CRUSOR///
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='historyBack']")).click();
		  
			try {
				Thread.sleep(8000);
				driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
				
				
			} catch (Exception e2) {
				System.out.println("no element 1");
			}
			
			try {
				Thread.sleep(8000);
				driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a")).click();
				
				
			} catch (Exception e2) {
				System.out.println("no element 2");
			}
			
			try {
				Thread.sleep(8000);
				driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a/span")).click();
				
				
			} catch (Exception e2) {
				System.out.println("no element 3");
			}
		  
		Thread.sleep(4000);
		BaseTest.click(rp.getSetting());
		
		Thread.sleep(4000);
		BaseTest.click(rp.getWhocanseeme());
		  
		 Thread.sleep(4000);
		  WebElement agefrom=driver.findElement(By.xpath("(//div[@class='frmto'])[1]"));
		  String wcagefrom=agefrom.getText();
		  System.out.println("Age from in wcsm:"+wcagefrom);
		  String[] split3=wcagefrom.split(" years");
		  System.out.println("wcsmstartage:"+split3[0]);
		  
		  
		  
		  Thread.sleep(4000);
		  WebElement ageto=driver.findElement(By.xpath("(//div[@class='frmto'])[2]"));
		  String wcageto=ageto.getText();
		  System.out.println("Age to in wcsm:"+wcageto);
		  String[] split4=wcageto.split(" years");
		  System.out.println("wcsmendage:"+split4[0]);
		  
		  
		  WebElement marital=driver.findElement(By.xpath("(//div[@class='openPopUp_values no-break_line'])[1]"));
		  String maritalwcsm=marital.getText();
		  System.out.println("marital status in wcsm :"+maritalwcsm);
		  	 
		  
		  Thread.sleep(4000);
		  WebElement income3=driver.findElement(By.xpath("(//div[@class='openPopUp_values no-break_line'])[5]"));
		  String incomewcsm=income3.getText();
		  System.out.println("income in pp :"+incomewcsm);
		  
		  Thread.sleep(4000);
		  BaseTest.click(rp.getMorepreference());
		  
		  Thread.sleep(4000);
		  WebElement height3=driver.findElement(By.xpath("(//div[@class='frmto'])[3]"));
		  String heightfrom=height3.getText();
		  System.out.println("Height in pp :"+heightfrom);
		  
		  Thread.sleep(4000);
		  WebElement height4=driver.findElement(By.xpath("(//div[@class='frmto'])[4]"));
		  String heightto=height4.getText();
		  System.out.println("Height in pp :"+heightto);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
}
}
