package test.WFM;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import BaseTest.BaseTest;


public class SendInterestLastMatches {
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
           
            
//             


            
        }
        
        @Test
        public void testUntitled() throws Exception {
        	SendInterestmatchesPOM rp=new SendInterestmatchesPOM(driver);
        	driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
		    driver.manage().window().maximize();
		    
		    //login
		    Thread.sleep(3000);
		    BaseTest.click(rp.getUsername());
		    Actions a=new Actions(driver);
			Thread.sleep(4000);
			a.sendKeys("IYR242926").build().perform();
		    
		    Thread.sleep(4000);
		    BaseTest.click(rp.getPassword());
		    Thread.sleep(4000);
			Actions b=new Actions(driver);
			Thread.sleep(4000);
			b.sendKeys("cbstest").build().perform();
		    
		  Thread.sleep(6000);
		  BaseTest.click(rp.getLogin());
		  
		  Thread.sleep(7000);
		  BaseTest.click(rp.getLastmatches());
		  
		  //scenarios
		  
		  List<WebElement> name= driver.findElements(By.xpath("//span[@class='matriid_txt']"));
		  //System.out.println("users :" +name.size());
		  for (int i = 1; i < name.size(); i++) {
			Thread.sleep(4000);
			name.get(i).click();
		}
		  
 //send interest
		  
		  try {
			  Thread.sleep(4000);
				 List<WebElement> ref3 = driver.findElements(By.xpath("//span[contains(text(),'Send Interest')]"));
				  System.out.println("Total users : "+ ref3.size());
				  for (int j = 0; j < ref3.size(); j++) {
			     Thread.sleep(4000);
				ref3.get(j).click();
				Thread.sleep(5000);
				ref3.get(j).click();
				
				Thread.sleep(4000);
				WebElement upgrade = driver.findElement(By.xpath("(//span[contains(text(),'Upgrade Now')])[3]"));
				String verify=	upgrade.getText();
		
				if (verify.equals("Upgrade Now")) {			
					System.out.println("matched");
				}
				else {
					System.out.println("Not matched");
				}
				Thread.sleep(4000);
				driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/mailpopup/ion-content/div[2]/div/div/span/button")).click();
				
				  }
				  
		} catch (Exception e) {
			// TODO: handle exception
		}
		  
		  try {
			
			  Thread.sleep(4000);
				 List<WebElement> ref3 = driver.findElements(By.xpath("//span[contains(text(),'Send Mail')]"));
				  System.out.println("Total users : "+ ref3.size());
				  for (int j = 0; j < ref3.size(); j++) {
			     Thread.sleep(4000);
				ref3.get(j).click();
				
				
				Thread.sleep(4000);
				WebElement upgrade = driver.findElement(By.xpath("(//span[contains(text(),'Upgrade Now')])[3]"));
				String verify=	upgrade.getText();
		
				if (verify.equals("Upgrade Now")) {			
					System.out.println("matched");
				}
				else {
					System.out.println("Not matched");
				}
				Thread.sleep(4000);
				driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/mailpopup/ion-content/div[2]/div/div/span/button")).click();
				
				  }
			  
			  
		} catch (Exception e) {
			// TODO: handle exception
		}
		 	 
        	
        	
        	
}
        
        
        
        

}
