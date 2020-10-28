package logic;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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

import Base.BaseTest;
import pom.GmailPOM;


public class Gmail {
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\cmstest\\driver\\chromedriver.exe"; 

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
       public void testUntitled() throws Throwable {
      GmailPOM rp= new GmailPOM(driver);	
      Thread.sleep(5000);
	    driver.get("https://mail.google.com/");
	    driver.manage().window().maximize();
	    
	  //  Thread.sleep(4000);
	  //  BaseTest.click(rp.getUseanotheraccount());
	    
	    Thread.sleep(4000);
	   WebElement name= driver.findElement(By.xpath("//*[@id='identifierId']"));
	   name.sendKeys("nireshk750@gmail.com");
	   
	   Thread.sleep(4000);
	   BaseTest.click(rp.getNext());
	   
	   Thread.sleep(4000);
	   WebElement pass= driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
	   pass.sendKeys("9176800869");
	   
	   Thread.sleep(4000);
	   BaseTest.click(rp.getPasswordnext());
	
	  Thread.sleep(4000);
	   try {
		   Thread.sleep(3000);
		   	JavascriptExecutor js = (JavascriptExecutor)driver;
		   	  WebElement edit= driver.findElement(By.xpath("(//*[@id='th_16d059253aa62343']//following::div[@class='Wl'])[1]"));
			  	  js.executeScript("arguments[0].scrollIntoView(true);",edit);
			  	  Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@id='th_16d059253aa62343']//following::div[@class='Wl'])[1]")).click();
	} catch (Exception e) {
		System.out.println("element1");
	}
	   try { 	
		   Thread.sleep(3000);
		   	JavascriptExecutor js = (JavascriptExecutor)driver;
		   	  WebElement edit= driver.findElement(By.xpath("//*[@id='th_16d059253aa62343']"));
			  	  js.executeScript("arguments[0].scrollIntoView(true);",edit);
			  	  Thread.sleep(4000);
			  driver.findElement(By.xpath("//*[@id='th_16d059253aa62343']")).click();
	} catch (Exception e) {
		System.out.println("no element2");
	}
	   
	   Thread.sleep(4000);
	   try {
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   	  WebElement edit= driver.findElement(By.xpath("//*[@id='th_16d059253aa62343']/div[1]"));
			  	  js.executeScript("arguments[0].scrollIntoView(true);",edit);
			  	  Thread.sleep(4000);
			  driver.findElement(By.xpath("//*[@id='th_16d059253aa62343']/div[1]")).click();
	} catch (Exception e) {
		System.out.println("no element3");
	}
	  
	  
	 Thread.sleep(7000); 
	 
	   
//	Actions b=new Actions(driver);
//		Thread.sleep(4000);
//	 b.click(d).build().perform();
//	 
//////	Thread.sleep(4000);   
////Robot r=new Robot();
////r.keyPress(KeyEvent.VK_DOWN);
////r.keyRelease(KeyEvent.VK_DOWN);
////r.keyPress(KeyEvent.VK_DOWN);
////r.keyRelease(KeyEvent.VK_DOWN);
////r.keyPress(KeyEvent.VK_ENTER);
////r.keyRelease(KeyEvent.VK_ENTER);
//	   
//	
	   Thread.sleep(3000);
   	JavascriptExecutor js = (JavascriptExecutor)driver;
   	  WebElement edit= driver.findElement(By.xpath("//a[contains(text(),'Vikram (MUT151656)')]"));
	  	  js.executeScript("arguments[0].scrollIntoView(true);",edit);
	  	  
	   WebElement gmailmatriid=driver.findElement(By.xpath("//a[contains(text(),'Vikram (MUT151656)')]"));
		  String ref =gmailmatriid.getText();
		  System.out.println("matriid :"+ref);   
   
		 
		  
	   Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id='cvcmsgbod_16d059253aa62343']/div[1]/div[1]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/table[2]/tbody/tr[2]/td/table/tbody/tr[1]/td[3]/a/table/tbody/tr[1]/td[2]/a")).click();
	  
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("(//div[@class='fixed-content'])[2]")).click();
	  
		 Thread.sleep(4000);
		 WebElement gmailmatch=driver.findElement(By.xpath("//span[@class='pos_btm2']"));
		 String ref1 =gmailmatch.getText();
		  System.out.println("matrimatriid :"+ref1);
//	  
////	  
////	  
////	  Thread.sleep(3000);
////	  try {
////		  JavascriptExecutor js1 = (JavascriptExecutor)driver;
////	   	  WebElement edit1= driver.findElement(By.xpath("(//span[@class='ficon icon-back font14']//following::span[@class='paddl10'])[1]"));
////		  	  js1.executeScript("arguments[0].scrollIntoView(true);",edit1);
////		  	 Thread.sleep(4000);
////	  WebElement matriid=driver.findElement(By.xpath("(//span[@class='ficon icon-back font14']//following::span[@class='paddl10'])[1]"));
////	  String abc =matriid.getText();
////	  System.out.println("matriid :"+abc);
////	} catch (Exception e) {
////		System.out.println("no element5");
////	}
////	   	
////	  try {
////		  Thread.sleep(4000);
////		  JavascriptExecutor js1 = (JavascriptExecutor)driver;
////	   	  WebElement edit1= driver.findElement(By.xpath("//span[starts-with(text(),'MUT')]"));
////		  	  js1.executeScript("arguments[0].scrollIntoView(true);",edit1);
////		  	 Thread.sleep(4000);
////	  WebElement matriid=driver.findElement(By.xpath("//span[starts-with(text(),'MUT')]"));
////	  String abc =matriid.getText();
////	  System.out.println("matriid :"+abc);
////	} catch (Exception e) {
////		System.out.println("no element6");
////	}
////	  
////	  try {
////		  Thread.sleep(4000);
////		  JavascriptExecutor js1 = (JavascriptExecutor)driver;
////	   	  WebElement edit1= driver.findElement(By.xpath("//span[text()='MUT151656']"));
////		  	  js1.executeScript("arguments[0].scrollIntoView(true);",edit1);
////		  	 Thread.sleep(4000);
////	  WebElement matriid=driver.findElement(By.xpath("//span[text()='MUT151656']"));
////	  String abc =matriid.getText();
////	  System.out.println("matriid :"+abc);
////	} catch (Exception e) {
////		System.out.println("no element7");
////	}
////	  
////	  try {
////		  Thread.sleep(4000);
////		  JavascriptExecutor js1 = (JavascriptExecutor)driver;
////	   	  WebElement edit1= driver.findElement(By.xpath("//span[@class='ficon icon-back font14']//following-sibling::span[@class='paddl10']"));
////		  	  js1.executeScript("arguments[0].scrollIntoView(true);",edit1);
////		  	  Thread.sleep(4000);
////	  WebElement matriid=driver.findElement(By.xpath("//span[@class='ficon icon-back font14']//following-sibling::span[@class='paddl10']"));
////	  String abc =matriid.getText();
////	  System.out.println("matriid :"+abc);
////	} catch (Exception e) {
////		System.out.println("no element8");
////	}
//	   
	   
//	   try {
//		   Thread.sleep(4000);
//			  driver.findElement(By.xpath("(//div[@class='M j T b hc Rm  Om'])[1]")).click();
//	} catch (Exception e) {
//		System.out.println("no element1");
//		
//		Thread.sleep(4000);
//		try {
//			driver.findElement(By.xpath("//div[@class='M j T b hc Rm  Om']//child::div[@class='V j Ad']")).click();
//		} catch (Exception e2) {
//			System.out.println("no elememt2");
//		}
//	}
//	  Thread.sleep(4000);
//	  driver.findElement(By.xpath("(//div[@class='M j T b hc Rm  Om'])[1]")).click();
//	  
//	
//	  
//	  Thread.sleep(4000);
//	  driver.findElement(By.xpath("//*[@id='mn_']/div[2]/div/div[1]/div[14]")).click();
//	  
//	  
//	  List<WebElement> list= driver.findElements(By.xpath("//div[@class='lm']"));	
//	  
//	  
//	  
//	  List<WebElement> list1= driver.findElements(By.xpath("//div[@class='Eh sm']"));	
//	  
//	  
//	  WebElement ref3= driver.findElement(By.xpath("(//td//following::td[contains(text(),'likes you')])[1]"));
//	  String name2 = ref3.getText();
//	  System.out.println("interest name:"+name2);
//	  
//	  
	  
	  
	  
}
}
