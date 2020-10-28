package Logic;

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

import pom.WcsmPIPom;

public class WcsmPI extends BaseTest {
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\Negative\\driver\\chromedriver.exe";
	
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
  public void testUntitled() throws Throwable  {
	  WcsmPIPom rp= new WcsmPIPom(driver);
	      
	  Thread.sleep(5000);
	    driver.get("https://mstage.communitymatrimony.com/cbsmob/login.php");
	    driver.manage().window().maximize();
	    
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
		  Thread.sleep(6000);
			 driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
			  
	} catch (Exception e2) {
		System.out.println("no element1");
	}
	  
	 try {
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a")).click();
		  
	} catch (Exception e2) {
		System.out.println("no element2");
	}
	 
	  Thread.sleep(4000);
	  BaseTest.click(rp.getEditpi());
	  
  
	  Thread.sleep(4000);
	  WebElement ab=driver.findElement(By.xpath("//*[@id='linktobasic_details']/div[2]/ul/li[3]/div[2]"));
	  String gender=ab.getText();
	  System.out.println("gender in pi:"+gender);
	  
	  Thread.sleep(4000);
	  WebElement ab1=driver.findElement(By.xpath("//*[@id='linktobasic_details']/div[2]/ul/li[4]/div[2]"));
	  String age=ab1.getText();
	  System.out.println("age in pi:"+age);
	  
	  String[] split=age.split(" Years");
		 System.out.println("age :"+split[0]);
		 int agepi=Integer.parseInt(split[0]);
		 System.out.println("finalage:"+age);
	  
	  
	  Thread.sleep(4000);
	  WebElement bc=driver.findElement(By.xpath("//*[@id='linktobasic_details']/div[2]/ul/li[7]/div[2]"));
	  String marital=bc.getText();
	  System.out.println("marital status in pi:"+marital);
	  
	  
	  Thread.sleep(4000);
	  WebElement cd=driver.findElement(By.xpath("//*[@id='linktoeducation']/div[2]/ul/li[1]/div[2]"));
	  String education=cd.getText();
	  System.out.println("education in pi:"+education);
	  
	  Thread.sleep(4000);
	  WebElement cd1=driver.findElement(By.xpath("//*[@id='linktoeducation']/div[2]/ul/li[3]/div[2]"));
	  String occupation=cd1.getText();
	  System.out.println("occupation in pi:"+occupation);
	  
	  Thread.sleep(4000);
	  WebElement cd11=driver.findElement(By.xpath("//*[@id='linktoeducation']/div[2]/ul/li[4]/div[2]"));
	  String income=cd11.getText();
	  System.out.println("income in pi:"+income);
	 
	//back
	  driver.findElement(By.xpath("//*[@id='historyBack']")).click();
	  
	  try {
		  Thread.sleep(6000);
			 driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
			  
	} catch (Exception e2) {
		System.out.println("no element1");
	}
	  
	 try {
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a")).click();
		  
	} catch (Exception e2) {
		System.out.println("no element2");
	}
	 
	  
	  Thread.sleep(4000);
	  BaseTest.click(rp.getEditpp());
	  
	  Thread.sleep(4000);
	  WebElement bc1=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[1]/div[2]"));
	  String maritalpp=bc1.getText();
	  System.out.println("marital status in pp:"+maritalpp);
	  
	  Thread.sleep(4000);
	  WebElement ef=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[3]/div[2]"));
	  String agepp=ef.getText();
	  System.out.println("age in pp:"+agepp);
	  
	  
	  Thread.sleep(4000);
	  WebElement dc=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[5]/div[2]/ul/li[1]/div[2]/span"));
	  String educationpp=dc.getText();
	  System.out.println("education in pp:"+educationpp);
	  
	  Thread.sleep(4000);
	  WebElement d123=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[5]/div[2]/ul/li[2]/div[2]"));
	  String occupationpp=d123.getText();
	  System.out.println("occupation in pp:"+occupationpp);
	  
	  Thread.sleep(4000);
	  WebElement d11=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[5]/div[2]/ul/li[3]/div[2]"));
	  String incomepp=d11.getText();
	  System.out.println("income in pp:"+incomepp);
	 
	  
	  
	  
	  int a1=18;
		 int b1=21;
		 int c1= 29;
		 int d1=39;
		 int e1=49;
		 int f1=59;
		 int g1=60;
		 
		 int one=1;
		 int two=2;
		 int three=3;
		 int four=4;
		 int ten=10;
		 int fifteen=15;
		 
		 
		if (agepi>a1&&agepi<one) {	
			System.out.println("female age is=from 18 to"+agepi+one);
		}else if (agepi>c1&&agepi<d1) {
			System.out.println("female age is from"+(agepi-ten)+"to"+(agepi+two));	
		}else if (agepi>d1&&agepi<e1) {
			System.out.println("female age is from"+(agepi-ten)+"to"+(agepi+three));
		}else if (agepi>e1&&agepi<f1&&agepi>f1&&agepi<g1) {
			System.out.println("female age is from"+(agepi-fifteen)+"to"+(agepi+four));
		}else if (agepi>g1) {
			System.out.println("female age is from"+(agepi-fifteen)+"to 70");
		}
		 
		 
		 
	  
	  
	  
	  
	  
	  
	  
	  
  }
	  
}
