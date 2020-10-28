package cms.cmstest;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.List;
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

public class RequestLastMatches extends Base {
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
        	RequestLastmatchesPOM rp= new RequestLastmatchesPOM(driver);
        	driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
		    driver.manage().window().maximize();
		    
		    //login
		    Base.btnclick(rp.getUsername());
		    Actions a=new Actions(driver);
			Thread.sleep(4000);
			a.sendKeys("IYR263592").build().perform();
		    
		    Thread.sleep(4000);
		    
		  Base.btnclick(rp.getPassword());
		    Thread.sleep(4000);
			Actions b=new Actions(driver);
			Thread.sleep(4000);
			b.sendKeys("cbstest").build().perform();
		    
		  Thread.sleep(6000);
		  
	Base.btnclick(rp.getLogin());
	
	//lastmatches
	
	Thread.sleep(5000);
	Base.btnclick(rp.getLastmatches());
		   

 	 Thread.sleep(3000);
	 List<WebElement> ref = driver.findElements(By.xpath("//div[@class='id-name']"));
	  System.out.println("aaa 1 : "+ ref.size());
	  for (int i = 1; i <ref.size(); i++) {
		  Thread.sleep(3000);

ref.get(i).click();

	
	
	

	 
	//scenario 1
	 
 	 Thread.sleep(4000);
	 List<WebElement> ref3 = driver.findElements(By.xpath("//span[contains(text(),'Request')]"));
	  System.out.println("bbb 1 : "+ ref3.size());
	  for (int j = 0; j < ref3.size(); j++) {
		  
		  
		
	
	  Thread.sleep(4000);
	
	  ref3.get(j).click();
	  }
	  
	
	
	
	 
	 //back cursor
	  Thread.sleep(3000);	  
	  driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-viewprofile/ion-content/div[1]/div/ion-row/ion-col[1]/span[1]")).click();
	   
	
	 
	  }	  
	  Thread.sleep(5000);
		 driver.navigate().refresh();
	 

}
}
