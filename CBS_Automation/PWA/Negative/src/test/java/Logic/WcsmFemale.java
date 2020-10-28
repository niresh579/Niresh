package Logic;

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
import pom.WcsmPOM;

public class WcsmFemale {
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
	  WcsmPOM rp= new WcsmPOM(driver);
	      
	  Thread.sleep(5000);
	    driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
	    driver.manage().window().maximize();
	    
	    //login
	    WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
		Actions a=new Actions(driver);
		Thread.sleep(4000);
		a.sendKeys(e,"DVM1653935").build().perform();
	    
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
	 driver.findElement(By.xpath("//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-list/ion-item/div[1]/div/ion-label/span[1]/div[1]")).click();
	 
	 Thread.sleep(6000);
	 WebElement age=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-viewprofile/ion-content/div[2]/ion-grid[4]/ion-row[2]/ion-col[2]"));    //ion-col[contains(text(),'yrs')]
     String agenew=age.getText();
     System.out.println(agenew);
	 
	 String[] split=agenew.split(" yrs");
	 System.out.println("age :"+split[0]);
	 int maleage=Integer.parseInt(split[0]);
	 
	 
	 int one = 1;
     int second = 2;
     int third = 3;
     int four = 4;
     int ten = 10;
     int fifteen = 15;
     int a1 = 18;
     int b1 = 21;
     int b11 = 29;		
     int c = 39;
     int d1 = 49;
     int e1 = 59;
     int f = 60; 
     
	 if (maleage>=a1 && maleage<=b11)
     {

         System.out.println("Male profile age is = From 21 to 31");

     }else if (maleage>b11 && maleage<b11) {

         System.out.println("Male profile age is = From " + (maleage-one) + " To " + (maleage+ten) );
     }else if (maleage>b11 && maleage<c) {

         System.out.println("Male profile age is = From " + (maleage-second)  + " To " +(maleage+ten) );

         }else if (maleage>c && maleage<d1) {

             System.out.println("Male profile age is = From " + (maleage-third) +  " To " + (maleage+ten)  );
         }else if (maleage>d1 && maleage<e1) {

                 System.out.println("Male profile age is = From " + (maleage-four) +  " To " + (maleage+fifteen)  );
         }    else if (maleage>f ) {

                     System.out.println("Male profile age is = From " + (maleage-four) +  " To 70"   );
  }
	 
	 
	 
	 

}
}