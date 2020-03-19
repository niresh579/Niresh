package logic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Base.BaseTest;
import pom.RandomPOM;

public class Random {
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\drivernew2\\chromedriver.exe"; 

	 ExtentReports report;
     ExtentTest logger;
       @BeforeMethod
       public void setUp1() throws MalformedURLException {
    	   
           System.setProperty("webdriver.chrome.driver", driverExecutablePath);
         driver = new ChromeDriver();
          
       }
       
       @Test
       public void testUntitled() throws Throwable {
     RandomPOM rp= new RandomPOM(driver);	
      Thread.sleep(5000);
	    driver.get("https://www.communitymatrimony.com ");
	    driver.manage().window().maximize();
	    
	    //login
	    WebElement e=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/form/div[1]/input"));
		Actions a=new Actions(driver);
		Thread.sleep(4000);
		a.sendKeys(e,"nireshk750@gmail.com").build().perform();
	    
	    Thread.sleep(4000); 
	    
	    WebElement d=driver.findElement(By.xpath("//*[@id='passwordClear1']"));
	    Thread.sleep(4000);
		Actions b=new Actions(driver);
		Thread.sleep(4000);
		b.sendKeys(d,"cbstest").build().perform();
		
		Thread.sleep(4000);
		BaseTest.click(rp.getLogin());
       }
       
		@AfterMethod
	    public void Randommethod() throws InterruptedException, AWTException { 
			
		Random ran=new Random();
			 List<WebElement> li = driver.findElements(By.xpath("//dd[@class='fleft padb5 mediumhdrtxt domainlist']"));
		        Thread.sleep(4000);
		       int randprod = ran.nextInt(li.size()); 
	        Thread.sleep(4000);	
	    li.get(randprod).click();
	  
	    
	    
	    
		 
	    try {
	    	
	    		Thread.sleep(4000);    
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/a")).click();
		} catch (Exception e) {
			System.out.println("No element");
		}
	    
	    Thread.sleep(4000);
	    try {
	    	Thread.sleep(8000);
	    	   Robot r=new Robot();
	    		r.keyPress(KeyEvent.VK_ESCAPE);	
	    		r.keyRelease(KeyEvent.VK_ESCAPE);
			driver.findElement(By.xpath("//*[@id='special_offer_lightpic1']/div[1]/div/a/img")).click();
		} catch (Exception e) {
			System.out.println("no popup");
		}
	    
	    Thread.sleep(4000);
	    Actions acc = new Actions(driver);
	    WebElement menu = driver.findElement(By.xpath("//*[@id='topnav-login-menu']/div[3]/div[2]/div[1]"));
	    acc.moveToElement(menu).perform();
	    Thread.sleep(4000);
	    Actions acc1 = new Actions(driver);
	    WebElement log = driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[2]/ul/li[3]"));
	    acc1.moveToElement(log).perform();
	    Thread.sleep(4000);
	    log.click();
	 
		
				
}

		private int nextInt(int size) {
			// TODO Auto-generated method stub
			return 0;
		}

		
}