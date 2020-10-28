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

public class BlockedMultipleProfileMatches extends Base{
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\cmstest\\drivernew\\chromedriver.exe"; 

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
       public void testUntitled() throws Exception {
    	   BlockedMultipleProfilePOM rp= new BlockedMultipleProfilePOM(driver);
    	   Thread.sleep(5000);
		    driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
		    driver.manage().window().maximize();
		    
		    //login
		    WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
			Actions a=new Actions(driver);;
			Thread.sleep(4000);
			a.sendKeys(e,"IYR2635920").build().perform();
		    
		    Thread.sleep(4000);
		    
		    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
		    Thread.sleep(4000);
			Actions b=new Actions(driver);
			Thread.sleep(4000);
			b.sendKeys(d,"cbstest").build().perform();
		    
		  Thread.sleep(4000);
		  Base.btnclick(rp.getLogin());
		  
		  try {
			  Thread.sleep(6000);
			  driver.findElement(By.xpath("//*[@id=\"menusegment\"]/ion-segment-button[2]/span")).click();
		} catch (Exception e2) {
           System.out.println("no element1");
		}
		 
		  
		  
		  try {
			  Thread.sleep(6000);
			  driver.findElement(By.xpath("//*[@id=\"menusegment\"]/ion-segment-button[2]")).click();
		} catch (Exception e2) {
           System.out.println("no element2");
		}
		  
		  Thread.sleep(4000);
			WebElement ref=  driver.findElement(By.xpath("(//span[@class='clr36 font10'])[1]"));
			String ab=ref.getText();
			System.out.println(ab);
			
			
			 Thread.sleep(4000);
		  List<WebElement> name = driver.findElements(By.xpath("//span[@class='ficon icon-down-arrow font12']"));
		  System.out.println("total users :" +name.size());
		  for (int i = 1; i < 10; i++) {
			  Thread.sleep(3000);
		    	
		WebElement abs= driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row["+i+"]/ion-grid/ion-row[1]/ion-col[2]/div[3]/ion-row/ion-col/ion-icon/span"));
		
		 
		 
		
		 Thread.sleep(5000);
		 JavascriptExecutor js = (JavascriptExecutor)driver;
	     WebElement clk= driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row[1]/ion-grid/ion-row[1]/ion-col[2]/div[3]/ion-row/ion-col/ion-icon"));
	        js.executeScript("arguments[0].scrollIntoView(true);",clk);
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row[1]/ion-grid/ion-row[1]/ion-col[2]/div[3]/ion-row/ion-col/ion-icon")).click();
	        Thread.sleep(4000);
			Actions c=new Actions(driver);
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row[1]/ion-grid/ion-row[1]/ion-col[2]/div[3]/ion-row/ion-col/ion-list/button[2]")).click();
			
			Thread.sleep(4000);
			Base.getScreenshot(driver, "blocked profile popup");
			
			Thread.sleep(6000);
			driver.findElement(By.xpath("/html/body/ion-app/ion-alert/div/div[3]/button[2]/span")).click(); 
			
		}	
		  
		
		  Thread.sleep(6000);
		driver.findElement(By.xpath("(//span[@class='ficon icon-menu'])[2]")).click();
		  
		  Thread.sleep(4000);
		  Base.btnclick(rp.getSetting());
		  
		  Thread.sleep(4000);
		  Base.btnclick(rp.getBlocked());
		  
		Thread.sleep(4000);
		  List<WebElement> ref2 = driver.findElements(By.xpath("//span[@class='clr36 font10']"));
		  System.out.println("selected user : "+ ref2.size());
		  for (int i = 1; i <ref2.size(); i++) {
			  
	 Thread.sleep(3000);		 
	String b23=	ref2.get(i).getText();
	
		
		
		Thread.sleep(3000);
			  if (b23.contains(ab)) {
				System.out.println("Final : "+b23+  "Matched");
			} else {
              System.out.println("Not matched");
			}
		
		  }
       	
	

}
}