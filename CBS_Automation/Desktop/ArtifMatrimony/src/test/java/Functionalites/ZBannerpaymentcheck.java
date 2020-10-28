package Functionalites;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


import Basepacknew.Base3;
import PomPack.NagativepaymentPOM;

public class ZBannerpaymentcheck extends Base3{
	private static final String Data = null;
	public static WebDriver driver; 
	String driverExecutablePath = "C:\\Users\\CBSTEsting\\eclipse-workspace\\ArtifMatrimony\\driver\\chromedriver.exe";
	ExtentReports report;
    ExtentTest logger; 
    
    String lastFourDigits; 
    String lastFourDigits1;
    
    
	
  @BeforeMethod
  public void setUp1() throws MalformedURLException { 
	  System.setProperty("webdriver.chrome.driver", driverExecutablePath); 
	  ChromeOptions options = new ChromeOptions();
	   options.addArguments("--disable-notifications");
	  driver = new ChromeDriver(options);
	  
	  
      
  
  }
  @Test
  public void setUp2()throws Throwable  {
	  NagativepaymentPOM np = new NagativepaymentPOM(driver); 
	  driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	    sk1(np.getUsername(),"EZH556542");
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
			try {
				WebElement skip1 = driver.findElement(By.xpath("//a[@class='clr7']"));
				skip1.click();
			
			} catch (Exception e) {
				 System.out.println("ok");
				 }
			
		click(np.getPopup());
		} catch (Exception e) {
           System.out.println("ok");		}
		try {
			WebElement skip = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a[2]"));
			skip.click();
		
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
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(4000);
			WebElement popup = driver.findElement(By.xpath("//*[@id='strategicComm']/div/div[2]/a/img"));
			popup.click();
	     	} catch (Exception e) {
           System.out.println("ok");		}
		
       	Thread.sleep(4000);
       	try {
       		WebElement Topplacement = driver.findElement(By.xpath("//*[@id=\"lp-container\"]/div[4]/a/div/div/span/span"));
    		Topplacement.click();
    		String topplacment1200 = Topplacement.getText();
    		String input = topplacment1200;
    		String lastFourDigits = "";
		} catch (Exception e) {
			System.out.println("Banneramount = "+lastFourDigits );
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
			WebElement transanctionfailedshow = driver.findElement(By.xpath("//*[@id=\"retry\"]/div[1]/div[2]/h4/span"));
			String transf = transanctionfailedshow.getText();
			System.out.println(transf);
		
			System.out.println("Final match amount "+ lastFourDigits + "=" + lastFourDigits1 );
				      
  }
  @AfterMethod
  public void setUp3()throws Throwable  {
  
	  
	  
		}
}
		
        
		
			
		
  
  
	
			
		
	
  
  
