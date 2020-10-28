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
import pom.NegativeEditPiPOM;
import pom.WcsmPOM;

public class WcsmMale {
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
		a.sendKeys(e,"IYR263592").build().perform();
	    
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
	 int femaleage=Integer.parseInt(split[0]);
	 
	 
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
	 
	 
	if (femaleage>a1&&femaleage<one) {
		System.out.println("female age is=from 18 to"+femaleage+one);
	}else if (femaleage>c1&&femaleage<d1) {
		System.out.println("female age is from"+(femaleage-ten)+"to"+(femaleage+two));	
	}else if (femaleage>d1&&femaleage<e1) {
		System.out.println("female age is from"+(femaleage-ten)+"to"+(femaleage+three));
	}else if (femaleage>e1&&femaleage<f1&&femaleage>f1&&femaleage<g1) {
		System.out.println("female age is from"+(femaleage-fifteen)+"to"+(femaleage+four));
	}else if (femaleage>g1) {
		System.out.println("female age is from"+(femaleage-fifteen)+"to 70");
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
}
}