package cms.cmstest;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
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

public class RequestMatches {
	public static WebDriver driver;
    String driverExecutablePath = "C:\\\\Users\\\\CBS Testing\\\\workspace\\\\Niresh\\\\cmstest\\\\drivernew\\\\chromedriver.exe";

      ExtentReports report;
      ExtentTest logger;
        @BeforeMethod
        public void setUp1() throws MalformedURLException {
            System.setProperty("webdriver.chrome.driver", driverExecutablePath);
            Map<String, String> mobileEmulation = new HashMap<>();
            mobileEmulation.put("deviceName", "Pixel 2");

            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
            chromeOptions.addArguments("--disable-notifications");
            driver = new ChromeDriver(chromeOptions);
           
        }
        
        @Test
        public void testUntitled() throws InterruptedException {
        	RequestMatchesPOM rp= new RequestMatchesPOM(driver);
        	driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
		    driver.manage().window().maximize();
		    
		    //login
		    WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
			Actions a=new Actions(driver);
			Thread.sleep(4000);
			a.sendKeys(e,"NEP137104").build().perform();
		    
		    Thread.sleep(4000);
		    
		    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
		    Thread.sleep(4000);
			Actions b=new Actions(driver);
			Thread.sleep(4000);
			b.sendKeys(d,"cbstest").build().perform();
		    
		  Thread.sleep(6000);
		  
		driver.findElement(By.xpath("//*[@id='login-button']")).click();
		   
		  
		  //matches
		  Thread.sleep(6000);
		 driver.findElement(By.xpath("//*[@id='menusegment']/ion-segment-button[2]")).click();
	
		
	  	 Thread.sleep(3000);
		 List<WebElement> ref = driver.findElements(By.xpath("//div[@class='id-name']"));
		  System.out.println("aaa 1 : "+ ref.size());
		  for (int i = 1; i <ref.size(); i++) {
			  Thread.sleep(3000);
  // driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row["+i+"]/ion-grid/ion-row[1]/ion-col[2]/div[1]/div/span"));
    ref.get(i).click();
	 
		
		
		
	
		 
	 	//scenario 1
	 	 
	  	 Thread.sleep(4000);
		 List<WebElement> ref3 = driver.findElements(By.xpath("//span[contains(text(),'Request')]"));
		  System.out.println("bbb 1 : "+ ref3.size());
		  for (int j = 0; j < ref3.size(); j++) {
			  
			  
			
		
	 	  Thread.sleep(4000);
	 	//  driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-viewprofile/ion-content/div[2]/ion-grid[4]/ion-row["+i+"]/ion-col[2]/span")).click();
	 	  ref3.get(j).click();
		  }
	 	  
	 	
		
		
	 	 
	 	 //back cursor
	 	  Thread.sleep(3000);	  
		  driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-viewprofile/ion-content/div[1]/div/ion-row/ion-col[1]/span[1]")).click();
		   
		 Thread.sleep(5000);
		 driver.navigate().refresh();
		 
		  }	  
		 
		 
		 
		
		 
		 
		 
		 

}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}