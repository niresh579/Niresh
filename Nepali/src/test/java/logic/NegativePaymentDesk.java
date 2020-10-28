package logic;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pom.BaseTest;
import pom.Horoscope;
import pom.Inbox;




public class NegativePaymentDesk extends BaseTest {
	WebDriver driver;
	
	
	
	@BeforeMethod
	   public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali2\\drivernew\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		 driver = new ChromeDriver(options);
}


@Test

public void testCase() throws InterruptedException {
	   
	Inbox i = new Inbox(driver);
	   Horoscope h = new Horoscope(driver);
	   logger =  report.startTest("Pakistani Login Test"); 
	   driver.get("https://www.Pakistanimatrimony.com");
	   logger.log(LogStatus.PASS, "URL Launched Successfully"); 
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	   BaseTest.click(i.getMatriId());
	   BaseTest.typeData(i.getMatriId(), "Pak852749");
	   logger.log(LogStatus.PASS, "Matri Id entered Successfully"); 
	   BaseTest.click(i.getPaswwordclr());
	   
	   BaseTest.typeData(i.getPassword(), "cbstest");
	   logger.log(LogStatus.PASS, "Password entered Successfully"); 
	   BaseTest.click(i.getLoginbtn());
	   logger.log(LogStatus.PASS, "Login Successfully with this Matriid Nep140549"); 
	   System.out.println("logged in Successfully");
	   try {
			WebElement photo_add = driver.findElement(By.xpath("/html/body/div[2]/a"));
			if (photo_add.isDisplayed()) {
				photo_add.click();
				driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
				driver.findElement(By.xpath("//*[@id=\"reason3\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"skipphotoclick\"]")).click();
				
			}
			
		} catch (Exception e) {
			System.out.println("Photo Page Skipped");
		}
		
		
		try {
			WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
			if (skip_matches.isDisplayed()) {
				skip_matches.click();
				
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		
		try {
			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
			if (element.isDisplayed()) {
				element.click();
				
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		//////////////////////  New ly Added  ///////////////////////////////
		try {
			WebElement skip_to_matriony = driver.findElement(By.xpath("/html/body/header/div/div/div/a"));
			if (skip_to_matriony.isDisplayed()) {
				skip_to_matriony.click();
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		
		
		try {
			WebElement skip_to_matrimony1 = driver.findElement(By.xpath("/html/body/div[3]/a"));
			if (skip_to_matrimony1.isDisplayed()) {
				skip_to_matrimony1.click();
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		
		
		////////////////////////////////////////////////////////////////////////////////////
		
		try {
			WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
			if (divorcee_intermediate_skip.isDisplayed()) {
				divorcee_intermediate_skip.click();
				
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		
		
		try {
			
			WebElement horoscope = driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]"));
			if (horoscope.isDisplayed()) {
				horoscope.click();
			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled");
		}
		
		try {
			driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
		} catch (Exception e) {
			System.out.println("No Intermediate pages");
		}
		
		// AD Pages
		 
		 try {
			 driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
		} catch (Exception e) {
			System.out.println("ADs Closed Successfully");
		}
		 
		 try {
			 driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
		} catch (Exception e) {
			System.out.println("ADs Closed Successfully");
		}
		 
		 
		 ///////////////////   MOuse Action to click on Edit Profile  //////////////
//		 try {
//				Robot r = new Robot();
//				r.keyPress(KeyEvent.VK_ESCAPE);
//				r.keyRelease(KeyEvent.VK_ESCAPE);
//				Thread.sleep(4000);
//				
////				WebElement popup = driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img"));
////				popup.click();
//		
//		 }catch (Exception e) {
//	           System.out.println("ok");		}
//			Thread.sleep(15000);
//			try {
//				Robot r1 = new Robot();
//				r1.keyPress(KeyEvent.VK_ESCAPE);
//			r1.keyRelease(KeyEvent.VK_ESCAPE);
//				Thread.sleep(4000);
//				WebElement popup = driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img"));
//				popup.click();
//		     	} catch (Exception e) {
//	           System.out.println("ok");		}
//	       	Thread.sleep(6000);
//	       	try {
//	       		WebElement Bannerclick = driver.findElement(By.xpath("//*[@id=\"lp-container\"]/div[4]/a/div/div/div[1]"));
//	    		Bannerclick.click();
//			} catch (Exception e) {
//	            System.out.println("ip-container1");
//	}
//			
//	       	try {
//	       		WebElement Bannerclick1 = driver.findElement(By.xpath("//*[@id=\"lp-container\"]/div[4]/a/div/div/span"));
//	    		Bannerclick1.click();
//			} catch (Exception e) {
//	            System.out.println("ip-container2");
//	}
		 
		 Actions acc = new Actions(driver);
			
		 Thread.sleep(7000);
		 Thread.sleep(5000);
		         
				acc.moveToElement(h.getMenu_mouse_action()).build().perform();
				Thread.sleep(5000);
				
				try {
					acc.moveToElement(h.getMenu_mouse_action1()).build().perform();
				} catch (Exception e) {
					// TODO: handle exception
				}
		 
		 Thread.sleep(6000);
         driver.findElement(By.xpath("(//a[text()='Upgrade Account'])[1]")).click();
		 
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
				

		        Thread.sleep(6000);
                driver.findElement(By.xpath("//div[contains(text(),'upgrade NOW ')]")).click();
		    
				Thread.sleep(6000);
				 WebElement getcc = driver.findElement(By.xpath("//*[@id='visaNri_vpc_CardNum']"));
			        getcc.sendKeys("4111111111111111");
				Thread.sleep(4000);	
				WebElement expiredate = driver.findElement(By.xpath("(//*[@name='cardExpiryMonth'])[1]"));
				Select s = new Select(expiredate);
				Thread.sleep(4000);
				s.selectByIndex(2);
				WebElement expireyear = driver.findElement(By.xpath("(//*[@name='cardExpiryYear'])[1]"));
				Select s1 = new Select(expireyear);
				s1.selectByIndex(2);
				Thread.sleep(4000);
				 WebElement getccv = driver.findElement(By.xpath("//input[@name='vpc_CardSecurityCode'][1]"));
			        getccv.sendKeys("456");
			        Thread.sleep(4000);
			        driver.findElement(By.xpath("(//*[@name='SubButL'])[1]")).click();		
			        Thread.sleep(11000);
			        WebElement payfail = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[1]/span[1]"));
			        String paymentfail  = payfail.getText();
			        System.out.println("Payment status = " + paymentfail);
			        
//		        driver.findElement(By.xpath("//*[@id='try-again-button']")).click();	
//		        WebElement paymentfailed = driver.findElement(By.xpath("//span[@class='disblk padb5']"));
//                String paymentfailed2 = paymentfailed.getText();
//                System.out.println("Payment info = " + paymentfailed2);
//				 Thread.sleep(9000);
//				 WebElement Yourtotal2 = driver.findElement(By.xpath("//*[@id='totalAmount']"));
//			        Yourtotal2.click();
//			        String yourtotalamount2 = Yourtotal2.getText();
//			        System.out.println("your total amount try again payment page "+ yourtotalamount2 );
//			         String show1 = yourtotalamount2.substring(0, 4);
//			        System.out.println("second page amount " + show1);
//			        System.out.println("The final amount match "+show +" = "+ yourtotalamount2);
//			        
		 }
   

@AfterMethod
public void mailReport(ITestResult status) throws Throwable {
      Thread.sleep(4000);

 try {
      failedstatus=status.getThrowable().getMessage();
      String[] failedstatus1=failedstatus.split("(Session");
      failedstatus=failedstatus1[0].toString();
 } catch (Exception e) {

 }


 // System.out.println(failedstatus);



  // System.out.println("failedresults"+failedstatus1[0]);



          // Create object of SimpleDateFormat class and decide the format
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

          //get current date time with Date()
          Date date = new Date();

          // Now format the date
          String date1= dateFormat.format(date);

          // Print the Date
          System.out.println(date1);

          if (status.getStatus()==2) {

       String url=driver.getCurrentUrl();
       System.out.println(url);

       String[] a = url.split("://");
       String b = a[1].toString();
       System.out.println("Split 1 : "+b);

       String[] c = b.split("/");
        domain = c[0].toString();
       System.out.println("Domain : " + domain);

       // Error_on = c[2].toString();
       System.out.println("Error : "+Error_on);
}
   //error msg
//       String Exception=status.getThrowable().getMessage();
//       System.out.println("ecception result"+Exception);

          if (status.getStatus()==1) {
   		   
      		if (BaseTest.getExcelData("SMS", 1, 2).equals("2")) {
      			BaseTest.reportflush();
      		    BaseTest.sendVFSmsnegative(domain, Error_on, date1);	
      		    int a1 = status.getStatus();  
      		    String aa1 = Integer.toString(a1);
         			BaseTest.setExcelData("SMS", 1, 2, aa1);
      		}		
      				
      		} else if (status.getStatus()==2) {
      			 BaseTest.reportflush1();       
      		        BaseTest.sendVFSmsnegative1(domain, Error_on, date1, failedstatus);
      		        int a2 = status.getStatus();
      		        String aa2 = Integer.toString(a2);
      				BaseTest.setExcelData("SMS", 1, 3, aa2);
      			
      		} 




/////////////////////////////////////////////////////////////////////////////////////////////////////






} 
}