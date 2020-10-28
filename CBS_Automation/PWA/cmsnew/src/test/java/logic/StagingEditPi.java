package logic;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

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
import pom.StagingEditPiPOM;

public class StagingEditPi extends BaseTest{
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\drivernew\\chromedriver.exe"; 

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
	  StagingEditPiPOM rp =new StagingEditPiPOM(driver);
	  Thread.sleep(5000);
	    driver.get("https://mstage.communitymatrimony.com/cbsmob/login.php");
	    driver.manage().window().maximize();
	    
	    //login
	    WebElement e=driver.findElement(By.xpath("//*[@id='loginpage']/div[1]/div[2]/div/form/div[1]"));
		Actions a=new Actions(driver);
		Thread.sleep(4000);
		a.sendKeys(e,"agr602037").build().perform();
	    
	    Thread.sleep(4000);
	    
	    WebElement d=driver.findElement(By.xpath("//*[@id='matripassword1']"));
	    Thread.sleep(4000);
		Actions b=new Actions(driver);
		Thread.sleep(4000);
		b.sendKeys(d,"cbstest").build().perform();
	    
	  Thread.sleep(4000);
	  BaseTest.click(rp.getLogin());
	
	  Thread.sleep(8000);
		 driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
		  
		  Thread.sleep(4000);
		  BaseTest.click(rp.getEditpi());
		  
		  Thread.sleep(4000);
		  BaseTest.click(rp.getBasicdetails());
		  
		  Thread.sleep(4000);
			driver.findElement(By.id("PCF")).click();
			//RegPanelSearchvalue
			
			 Thread.sleep(4000);
			driver.findElement(By.id("RegPanelSearchvalue")).click();
			
			Thread.sleep(4000);
			//BaseTest.select_string(driver.findElement(By.id("RegPanelSearchvalue")), BaseTest.getExcelData("Data", 1, 1));
			Thread.sleep(2000);
			
		  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 1, 1)+"')]")));
			Thread.sleep(3000);
			
			Thread.sleep(4000);
			BaseTest.click(rp.getHeight());
			Thread.sleep(2000);
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 1, 2)+"')]")));
			
			Thread.sleep(2000);
			BaseTest.click(rp.getWeight());
			Thread.sleep(2000);
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 1, 3)+"')]")));
		     
			Thread.sleep(4000);
			BaseTest.click(rp.getMaritalstatus());
			Thread.sleep(2000);
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 1, 4)+"')]")));
		     
			Thread.sleep(3000);
			BaseTest.click(rp.getMothertongue());
			Thread.sleep(2000);
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 1, 5)+"')]")));
		     
			Thread.sleep(3000);
			BaseTest.click(rp.getBodytype());
			Thread.sleep(2000);
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 1, 6)+"')]")));
		     
			
			
			Thread.sleep(3000);
			BaseTest.click(rp.getComplexion());
			Thread.sleep(2000);
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 1, 7)+"')]")));
		     
			Thread.sleep(2000);
			BaseTest.click(rp.getPhyscialstatus());
			Thread.sleep(2000);
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 1, 8)+"')]")));
		     
			Thread.sleep(4000);
			BaseTest.click(rp.getLanguageknown());
			Thread.sleep(2000);
			BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+getExcelData("Data", 1, 9)+"')]")));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
			
			
		}

}
