package logic;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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
import com.relevantcodes.extentreports.LogStatus;

import base.BaseTest;
import test.srilanka.ProfilePreviewPOM;



public class ProfilePreview extends BaseTest{
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali\\drivernew\\chromedriver.exe"; 

	
       @BeforeMethod
       public void setUp1() throws MalformedURLException {
           System.setProperty("webdriver.chrome.driver", driverExecutablePath);
           Map<String, String> mobileEmulation = new HashMap<String, String>();
           mobileEmulation.put("deviceName", "Pixel 2");

           ChromeOptions chromeOptions = new ChromeOptions();
           chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
           chromeOptions.addArguments("--disable-notifications");
           driver = new ChromeDriver(chromeOptions);
          
//         ExtentReports report;
//         ExtentTest logger;
//         private String reportDirectory = "reports";
//         private String reportFormat = "xml";
//         private String testName = "Untitled";
//         protected AndroidDriver<AndroidElement> driver = null;
//
//         DesiredCapabilities dc = new DesiredCapabilities();
//         
//         @BeforeTest
//         public void setUp() throws MalformedURLException {
//         	   dc.setCapability("reportDirectory", reportDirectory);
//                dc.setCapability("reportFormat", reportFormat);
//                dc.setCapability("testName", testName);
//                dc.setCapability(MobileCapabilityType.UDID, "ZDHUTW49BMOZAU8T");
//                dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
//                dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
//                driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
//                driver.setLogLevel(Level.INFO);

           
       }
       
       @Test
       public void testUntitled() throws Throwable {
    	   ProfilePreviewPOM rp=new ProfilePreviewPOM(driver);
    	   Thread.sleep(5000);
    	   logger =  report.startTest("Srilankan Profile Preview Test");
    	   Thread.sleep(5000);
		    driver.get("https://mobile.srilankanmatrimony.com/#/login");
		    logger.log(LogStatus.PASS, "URL Launched Successfully");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    
		    //login
		    WebElement e=driver.findElement(By.xpath("//ion-input[@formcontrolname='idEmail']"));
			Actions a=new Actions(driver);
			Thread.sleep(4000);
			a.sendKeys(e,"LKA750006").build().perform();
			 logger.log(LogStatus.PASS, "Matri Id entered Successfully");
		    Thread.sleep(4000);
		    
		    WebElement d=driver.findElement(By.xpath("//ion-input[@formcontrolname='password']"));
		    Thread.sleep(4000);
			Actions b=new Actions(driver);
			Thread.sleep(4000);
			b.sendKeys(d,"cbstest").build().perform();
			logger.log(LogStatus.PASS, "Password entered Successfully");
		  Thread.sleep(4000);
		BaseTest.click(rp.getLogin());
		logger.log(LogStatus.PASS, "Login Successfully with this Matriid LKA750006");
 		try {
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-intermediatesegment/ion-content/div[2]/span")).click();
		} catch (Exception e2) {
		}
	  Thread.sleep(6000);
	 driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
	  
	  Thread.sleep(4000);
	  BaseTest.click(rp.getEditpi());
	  logger.log(LogStatus.PASS, "Handling Intermediate Pages");	
		
		logger.log(LogStatus.PASS, "Validation");
	Thread.sleep(4000);
	WebElement profilecreated=driver.findElement(By.xpath("(//div[contains(text(),'Profile created for')]//following::div[1])[1]"));
    String profile=	profilecreated.getText();
    System.out.println("Profile Created by ="+profile);
	
    Thread.sleep(4000);
	WebElement name=driver.findElement(By.xpath("(//div[contains(text(),'Name')]//following::div[1])[1]"));
    String profilename=	name.getText();
    System.out.println("Name ="+profilename);
   
    	   
    Thread.sleep(4000);
	WebElement age=driver.findElement(By.xpath("(//div[contains(text(),'Age')]//following::div[1])[1]"));
    String profileage=	age.getText();
    System.out.println("Age ="+profileage);	  
   String[] split= profileage.split("Years");
   
   //System.out.println(split[0]);
   String splitage=split[0].toString().trim();
   int piage=Integer.parseInt(splitage);
    	   
    Thread.sleep(4000);
	WebElement height=driver.findElement(By.xpath("(//div[contains(text(),'Height')]//following::div[1])[1]"));
    String heig=height.getText();
    System.out.println("Height ="+heig);	  	   
    	
    try {
    	 Thread.sleep(4000);
    		WebElement weight=driver.findElement(By.xpath("(//div[contains(text(),'Weight')]//following::div[1])[1]"));
    	    String weigh=weight.getText();
    	    System.out.println("Weight ="+weigh);	   	   
    	    
	} catch (Exception e2) {
		
	}
   	   
    Thread.sleep(4000);
	WebElement marital=driver.findElement(By.xpath("(//div[contains(text(),'Marital Status')]//following::div[1])[1]"));
    String maritalstatus=marital.getText();
    System.out.println("Marital Status ="+maritalstatus);	 	   
    	   
//    Thread.sleep(4000);
//	WebElement star=driver.findElement(By.xpath("(//div[contains(text(),'Star')]//following::div[1])[1]"));
//    String starown=star.getText();
//    System.out.println("Star ="+starown);	   
//    	   
//    Thread.sleep(4000);
//	WebElement raasi=driver.findElement(By.xpath("(//div[contains(text(),'Raasi')]//following::div[1])[1]"));
//    String ownraasi=raasi.getText();
//    System.out.println("Raasi ="+ownraasi);	   
//    	   
    Thread.sleep(4000);
   	WebElement education=driver.findElement(By.xpath("(//div[contains(text(),'Education')]//following::div[1])[1]"));
       String owneducation=education.getText();
       System.out.println("Education ="+owneducation);		   
    	   
       Thread.sleep(4000);
   	WebElement occupation=driver.findElement(By.xpath("(//div[contains(text(),'Occupation')]//following::div[1])[1]"));
       String ownoccupation=occupation.getText();
       System.out.println("Occupation ="+ownoccupation);		   
    	   
       Thread.sleep(4000);
   	WebElement income=driver.findElement(By.xpath("(//div[contains(text(),'Annual Income')]//following::div[1])[1]"));
       String annualincome=income.getText();
       System.out.println("Annual Income ="+annualincome);		   
    	   
    	/////////profile preview//////
       
       System.out.println("Profile preview Informations:");
       
       Thread.sleep(4000);
       driver.findElement(By.xpath("//*[@id='headerTitle']/div/a")).click();
    	   
       WebElement profilecreated1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Profile created for')]//following::ion-col[1])[1]"));
       String profile1=	profilecreated1.getText();
       System.out.println("Profile Created by1 ="+profile1);
   	
       Thread.sleep(4000);
   	WebElement name1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Name')]//following::ion-col[1])[1]"));
       String profilename1=	name1.getText();
       System.out.println("Name ="+profilename1);
      
       	   
       Thread.sleep(4000);
   	WebElement age1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Age')]//following::ion-col[1])[1]"));
       String profileage1=	age1.getText();
       System.out.println("Age1 ="+profileage1);	 
       String[] split1=profileage1.split("yrs");
      // System.out.println(split1[0]);
       String splitage2=split1[0].toString().trim();
       int profilepreviewage=Integer.parseInt(splitage2);
    	   
       Thread.sleep(4000);
   	WebElement height1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Height')]//following::ion-col[1])[1]"));
       String heig1=height1.getText();
       System.out.println("Height1 ="+heig1);	  
       String[] split2=heig1.split("/ 154 cm");
      // System.out.println(split2[0]);
       	String heightnew=split2[0].toString().trim();
       	
       
//       Thread.sleep(4000);
//   	WebElement weight1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Weight')]//following::ion-col[1])[1]"));
//       String weigh1=weight1.getText();
//       System.out.println("Weight ="+weigh1);	  	   
       	   
       Thread.sleep(4000);
   	WebElement marital1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Marital')]//following::ion-col[1])[1]"));
       String maritalstatus1=marital1.getText();
       System.out.println("Marital Status ="+maritalstatus1);	 	   
       	   
//       Thread.sleep(4000);
//   	WebElement star1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Star')]//following::ion-col[1])[1]"));
//       String starown1=star1.getText();
//       System.out.println("Star ="+starown1);	   
//       	   
//       Thread.sleep(4000);	
//   	WebElement raasi1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Raasi')]//following::ion-col[1])[1]"));
//       String ownraasi1=raasi1.getText();
//       System.out.println("Raasi ="+ownraasi1);	      
//    	   
       Thread.sleep(4000);
      	WebElement education1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Education')]//following::ion-col[1])[1]"));
          String owneducation1=education1.getText();
          System.out.println("Education ="+owneducation1);		   
       	   
          Thread.sleep(4000);
      	WebElement occupation1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Occupation')]//following::ion-col[1])[1]"));
          String ownoccupation1=occupation1.getText();
          System.out.println("Occupation ="+ownoccupation1);		   
       	   
          Thread.sleep(4000);
      	WebElement income1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Annual')]//following::ion-col[1])[1]"));
          String annualincome1=income1.getText();
          System.out.println("Annual Income ="+annualincome1);	   
    	   
          logger.log(LogStatus.PASS, "Verification");
          if (profile.equalsIgnoreCase(profile1)) {
        	  System.out.println("Profile Created is Matched");
			
		}
          
          else {
			System.out.println("Profile Created is Not Matched");
		} 
          	
          if (profilename.equalsIgnoreCase(profilename1)) {
        	  System.out.println("Name is Matched");
			
		}
          
          else {
			System.out.println("Name is Not Matched");
		}   
          
         if (piage==profilepreviewage) {
			System.out.println("Age is Matched");
		}
			
		
          
          else {
			System.out.println("Age is Not Matched");
		}   
          
          if (heig.equalsIgnoreCase(heightnew)) {
        	  System.out.println("Height is Matched");
			
		}
          
          else {
			System.out.println("Height is Not matched");
		}    
    	   
//          if (weigh.equalsIgnoreCase(weigh1)) {
//        	  System.out.println("Weight is Matched");
//			
//		}
//          
//          else {
//			System.out.println("Weight is Not Matched");
//		}      
    	 
          
          if (maritalstatus.equalsIgnoreCase(maritalstatus1)) {
        	  System.out.println("Marital Status is Matched");
			
		}
          
          else {
			System.out.println("Marital Status is Not Matched");
		}      
          
        
          
          if (owneducation.equalsIgnoreCase(owneducation1)) {
        	  System.out.println("Education is Matched");
			
		}
          
          else {
			System.out.println("Education is Not Matched");
		}         
          
          
          if (ownoccupation.equalsIgnoreCase(ownoccupation1)) {
        	  System.out.println("Occupation is Matched");
			
		}
          
          else {
			System.out.println("Occupation is Not Matched");
		}         
          
          
          if (annualincome.equalsIgnoreCase(annualincome1)) {
        	  System.out.println("Income is Matched");
			
		}
          
          else {
			System.out.println("Income is Not Matched");
		}       
          
          
          logger.log(LogStatus.PASS, "Logout Succesfully");
      	   
    	  report.endTest(logger);
    	   	
    	   	report.flush();
          
          
          
          
          
          
          
          
          
          
}
}
