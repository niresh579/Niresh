package napalimatrimony.copy;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

public class Addonpackcheck extends Base3{
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
	  AddonpackPom np = new AddonpackPom(driver); 
	  driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	    sk1(np.getUsername(),"NEP137204");
		Thread.sleep(4000);
		WebElement e1=driver.findElement(By.xpath("//*[@id='passwordClear1']"));
        Actions a1=new Actions(driver);
        a1.sendKeys(e1,"cbstest").build().perform();
        Thread.sleep(4000);
        click(np.getLogin1());
		Thread.sleep(20000);
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
			r.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(4000);
			
//			WebElement popup = driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img"));
//			popup.click();
			
		click(np.getPopup());
		} catch (Exception e) {
           System.out.println("ok");		}
		try {
			WebElement skip = driver.findElement(By.xpath("//a[@class='clr7']"));
			skip.click();
		click(np.getSkip());
		} catch (Exception e) {
			 System.out.println("ok");
			 }
		Thread.sleep(15000);
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(4000);
			WebElement popup = driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img"));
			popup.click();
	     	} catch (Exception e) {
           System.out.println("ok");		}
       	Thread.sleep(6000);
       	try {
       		WebElement Bannerclick = driver.findElement(By.xpath("//*[@id=\"lp-container\"]/div[4]/a/div/div/div[1]"));
    		Bannerclick.click();
		} catch (Exception e) {
            System.out.println("ip-container1");
}
		
       	try {
       		WebElement Bannerclick1 = driver.findElement(By.xpath("//*[@id=\"lp-container\"]/div[4]/a/div/div/span"));
    		Bannerclick1.click();
		} catch (Exception e) {
            System.out.println("ip-container2");
}
		Thread.sleep(12000);
		String title = driver.getCurrentUrl();
		System.out.println(title);
		
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		for (String id : allwindow) {
			if (!parentwindow.equals(id)) {
			driver.switchTo().window(id);
			}
			
		}
			String title2 = driver.getCurrentUrl();
			System.out.println(title2);
			Thread.sleep(12000);
			try {
				WebElement check1200 = driver.findElement(By.xpath("//*[@id='phPopup']/div/div/div[2]/div[1]/div[3]/span"));
		        check1200.click();
				String checkname1200 = check1200.getText();
				String input1 = checkname1200;
				String lastFourDigits1 = "";
				if (input1.length() > 4)
				{
				    lastFourDigits1 = input1.substring(input1.length() - 4);
				}
				else
				{
				    lastFourDigits1 = input1;
				}
				
		        System.out.println("Banneramount in paymentpage = "+lastFourDigits1 );
		       
		       
			} 
			
			catch (Exception e) {
				System.out.println("phpopup ok");
		       
						}
			try {
				
				WebElement astro1200 = driver.findElement(By.xpath("//*[@id='astroMatchPopup110']/div/div/div[2]/div[1]/div[4]/span"));
		        astro1200.click();
				String checkname1200 = astro1200.getText();
				String input1 = checkname1200;
				String lastFourDigits1 = "";
				if (input1.length() > 4)
				{
				    lastFourDigits1 = input1.substring(input1.length() - 4);
				}
				else
				{
				    lastFourDigits1 = input1;
				}
				
		        System.out.println("Banneramount in paymentpage = "+lastFourDigits1 );
		       
				
			} catch (Exception e) {
				System.out.println("Astromatch ok");
			}
			
			try {
				WebElement phone1200 = driver.findElement(By.xpath("//*[@id='TopListingPopup']/div/div/div[2]/div[1]/div[4]/span"));
				phone1200.click();
				String checkname1200 = phone1200.getText();
		        System.out.println("Banneramount in paymentpage = "+checkname1200 );
			} catch (Exception e) {
              System.out.println("toplistpopup ok");
}
			
	        Thread.sleep(15000);
	        
	        
	        try {
	        	click(np.getSkip2());
			} catch (Exception e) {
				System.out.println("skip2 ok ");
			}
	        try {
	        	click(np.getSkip4());
			} catch (Exception e) {
				System.out.println("skip4 ok");
			}
	        try {
	        	click(np.getSkip3());
			} catch (Exception e) {
				System.out.println("skip3 ok");
				
			}
	        Thread.sleep(10000);
	        WebElement addonjs = driver.findElement(By.xpath("//*[@id='Special_check_out_hide']/div[1]/span"));
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("arguments[0].scrollIntoView(true);",addonjs);
	        
	        Thread.sleep(10000);
	        click(np.getProfilehighclick());
	        Thread.sleep(4000);
	        click(np.getTopplacementclick());
	        Thread.sleep(4000);
	       // WebElement astromatch = driver.findElement(By.xpath("//*[@id='specialOffer111']"));
	      //  astromatch.click();
	       // click(np.getAstromatchclick());
	        WebElement Yourtotal = driver.findElement(By.xpath("//*[@id='spn_total_amt']"));
	        Yourtotal.click();
	        String yourtotalamount = Yourtotal.getText();
	        System.out.println("your total amount payment page "+ yourtotalamount );
	        String show = yourtotalamount.substring(4);
	        System.out.println(show);
			Thread.sleep(4000);
			
			sk1(np.getCC(),"4111111111111111");
			Thread.sleep(4000);
			WebElement expiredate = driver.findElement(By.xpath("//*[@id='cardExpiryMonth']"));
			Select s = new Select(expiredate);
			Thread.sleep(4000);
			s.selectByIndex(2);
			WebElement expireyear = driver.findElement(By.xpath("//*[@id='cardExpiryYear']"));
			Select s1 = new Select(expireyear);
			s1.selectByIndex(2);
			Thread.sleep(4000);
			sk1(np.getCvv(),"456");
			Thread.sleep(4000);
			click(np.getTransfailed());
			Thread.sleep(9000);
			 click(np.getTryagain());
			 Thread.sleep(9000);
			 WebElement Yourtotal2 = driver.findElement(By.xpath("//*[@id='totalAmount']"));
		        Yourtotal2.click();
		        String yourtotalamount2 = Yourtotal2.getText();
		        System.out.println("your total amount try again payment page "+ yourtotalamount2 );
		         String show1 = yourtotalamount2.substring(0, 4);
		        System.out.println("second page amount " + show1);
		        System.out.println("The final amount match "+show +" = "+ yourtotalamount2);
		        
  }
  @AfterMethod
  public void setUp3()throws Throwable  {
  
	  
	  
		}
}
		
        
		
			
		
  
  
	
			
		
	
  
  
