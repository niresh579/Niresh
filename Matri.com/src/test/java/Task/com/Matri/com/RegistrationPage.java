package Task.com.Matri.com;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class RegistrationPage extends  Base  {
	
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    ExtentReports report;
 	  ExtentTest logger;
   
    @BeforeTest
    public void setUp() throws MalformedURLException {

    	 dc.setCapability("reportDirectory", reportDirectory);
         dc.setCapability("reportFormat", reportFormat);
         dc.setCapability("testName", testName);
         dc.setCapability(MobileCapabilityType.UDID, "52002d9953d2748d");
         dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
         dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
         driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
         driver.setLogLevel(Level.INFO);
  }
    
    
    @Test
    public void testUntitled() throws InterruptedException {
    	report = new ExtentReports("C:\\Users\\Admin\\workspace\\PwaApp\\test-output\\Register.html", true);
		logger =  report.startTest("Register");
		 Random rand= new Random();
		    int low=10000;
		    int high=90000;
		    int  nn = rand.nextInt(high-low) + low;
		
		PomRegistration rp=new PomRegistration(driver);
    	 Base.btnclick(rp.getMenub());
  		Thread.sleep(500);
  		Base.btnclick(rp.getHistory());
  		Thread.sleep(500);
          Base.btnclick(rp.getClearbrowserdata());
          Thread.sleep(500);
          Base.btnclick(rp.getCleardata());
          Thread.sleep(500);
          Base.btnclick(rp.getClear());
          Thread.sleep(1000);
       driver.get("https://www.bharatmatrimony.com");
        //  driver.get("https://stgwap.tamilmatrimony.com/mobwap/registration/register.php");
       logger.log(LogStatus.PASS, "Successfully entered the Bharatmatimony");
      // driver.findElementByXPath("//*[@text=' REGISTER    ']").click();
       Thread.sleep(5000);
      // for (int i = 1; i <=60; i++) {
       for (int i = 1; i <=1; i++) {
       Base.btnclick(rp.getProfilefor());
       driver.findElement(By.xpath("//*[@text='Son' and @nodeName='LI']")).click();
       Base.btnclick(rp.getName());
       Base.setText(rp.getName(),"priya");
       driver.swipe(0, 900, 0, 0, 1000);
       Base.btnclick(rp.getDay());
       Base.btnclick(rp.getMonth());
       Base.btnclick(rp.getYear());
       Base.btnclick(rp.getCountrycode());
       driver.findElement(By.xpath("(//*/*[@nodeName='LI'])[2]")).click();
       Base.btnclick(rp.getMobileno());
       Base.setText(rp.getMobileno(),"70101"+nn);
       Base.btnclick(rp.getPassword());
       Base.setText(rp.getPassword(),"test4bm");
       Base.btnclick(rp.getReligion());
       driver.findElement(By.xpath("//*[@text='Hindu' and @nodeName='LI']")).click();
       driver.swipe(0, 900, 0, 0, 1000);
       Base.btnclick(rp.getMothertongue());
       driver.findElementByXPath("//*[@name='selection_filter']").clear();
       driver.findElementByXPath("//*[@name='selection_filter']").sendKeys(BaseCaste.readValueFromExcelSheet().get(i).get("Mothertnouge"));
       driver.findElement(By.xpath("//*[@nodeName='LI']")).click();
       Base.btnclick(rp.getContinuebutton());
       logger.log(LogStatus.PASS, "First Page details where entered successfully");
       Thread.sleep(2000);
       Base.setText(rp.getEmail(),"bmtestemails"+nn+"@gmail.com");
       Base.btnclick(rp.getCaste());
       
       try {
		driver.findElementByXPath("//*[@name='selection_filter']").clear();
		   driver.findElementByXPath("//*[@name='selection_filter']").sendKeys(BaseCaste.readValueFromExcelSheet().get(i).get("Caste"));
		   Thread.sleep(2000);
		   int size =  driver.findElementsByXPath("//*[@nodeName='LI']").size();
		   List<AndroidElement> input = driver.findElementsByXPath("//*[@nodeName='LI']");
		  
		   
		  for (int j = 0; j <size; j++) {
			if (BaseCaste.readValueFromExcelSheet().get(i).get("Caste").equals(input.get(j).getText())) {
				input.get(j).click();
			}
		}
		   
	} catch (NullPointerException e) {
		System.out.println("no caste: "+i+": "+BaseCaste.readValueFromExcelSheet().get(i).get("Caste"));
	}
       Thread.sleep(3000);
       if(!BaseCaste.readValueFromExcelSheet().get(i).get("subcaste").equals("null")){
       Base.btnclick(rp.getSubcaste());
       try {
		driver.findElementByXPath("//*[@name='selection_filter']").clear();
		   driver.findElementByXPath("//*[@name='selection_filter']").sendKeys(BaseCaste.readValueFromExcelSheet().get(i).get("subcaste"));
		   int size =  driver.findElementsByXPath("//*[@nodeName='LI']").size();
		   List<AndroidElement> input = driver.findElementsByXPath("//*[@nodeName='LI']");
		  
		   
		  for (int j = 0; j <size; j++) {
			if (BaseCaste.readValueFromExcelSheet().get(i).get("Caste").equals(input.get(j).getText())) {
				input.get(j).click();
			}
		  }
	
	} catch (NullPointerException e) {
		System.out.println("no subcaste: "+i+": "+BaseCaste.readValueFromExcelSheet().get(i).get("subcaste"));
	}
     // driver.navigate().refresh();
       }
       }
       Base.btnclick(rp.getDoshno());
      driver.swipe(0, 900, 0, 0, 1000);
       Base.btnclick(rp.getMatritalstatus());
       Base.btnclick(rp.getNevermarried());
       Base.btnclick(rp.getFamilystatus());
       Base.btnclick(rp.getRich());
       Base.btnclick(rp.getFamilytype());
       Base.btnclick(rp.getNuclear());
       Base.btnclick(rp.getFamilyvalue());
       Base.btnclick(rp.getModerate());
       driver.swipe(0, 900, 0, 0, 1000);
       Base.btnclick(rp.getContinuebutton());
       Thread.sleep(5000);
       logger.log(LogStatus.PASS, "Second Page details where entered successfully");
       Base.btnclick(rp.getHeight());
       Base.btnclick(rp.getFivefeet());
       //===============================================================================
       
      
       //for (int k = 1; k <=2; k++) {
      /* for (int k = 1; k <=1; k++) {
       try {
    	   Base.btnclick(rp.getEducation());
   		driver.findElementByXPath("//*[@name='selection_filter']").clear();
   		   driver.findElementByXPath("//*[@name='selection_filter']").sendKeys(BaseEducation.readValueFromExcelSheet().get(k).get("Education"));
   		   Thread.sleep(2000);
   		   int size =  driver.findElementsByXPath("//*[@nodeName='LI']").size();
   		   List<AndroidElement> input = driver.findElementsByXPath("//*[@nodeName='LI']");
   		  
   		   
   		  for (int j = 0; j <size; j++) {
   			if (BaseEducation.readValueFromExcelSheet().get(k).get("Education").equals(input.get(j).getText())) {
   				input.get(j).click();
   			}
   		}
   		   
   	} catch (NullPointerException e) {
   		System.out.println("no caste: "+k+": "+BaseEducation.readValueFromExcelSheet().get(k).get("Education"));
   	}
       }*/
       Base.btnclick(rp.getEducation());
       Base.btnclick(rp.getEducationbe());
       Base.btnclick(rp.getEmployedin());
       Base.btnclick(rp.getPrivateemp());
      //=============================================================================================================== 
     
       //for (int a = 1; a <=5; a++) {
       /*for (int a = 1; a <=1; a++) {
    	   Base.btnclick(rp.getOccupation());
           try {
       		driver.findElementByXPath("//*[@name='selection_filter']").clear();
       		   driver.findElementByXPath("//*[@name='selection_filter']").sendKeys(BaseOccupation.readValueFromExcelSheet().get(a).get("Occupation"));
       		   Thread.sleep(2000);
       		   int size =  driver.findElementsByXPath("//*[@nodeName='LI']").size();
       		   List<AndroidElement> input = driver.findElementsByXPath("//*[@nodeName='LI']");
       		  
       		   
       		  for (int j = 0; j <size; j++) {
       			if (BaseOccupation.readValueFromExcelSheet().get(a).get("Occupation").equals(input.get(j).getText())) {
       				input.get(j).click();
       			}
       		}
       		   
       	} catch (NullPointerException e) {
       		System.out.println("no occupation: "+a+": "+BaseOccupation.readValueFromExcelSheet().get(a).get("Occupation"));
       	}
           }*/
       Base.btnclick(rp.getOccupation());
       Base.btnclick(rp.getManager());
       driver.swipe(0, 900, 0, 0, 1000);
       Base.btnclick(rp.getIncome());
       Base.btnclick(rp.getLakhs());
       Base.btnclick(rp.getCountrywork());
       Base.btnclick(rp.getPlaceofwork());
       driver.swipe(0, 900, 0, 0, 1000);
       for (int b = 34; b <=288; b++) {
       Base.btnclick(rp.getRegstate());
       try {
      		driver.findElementByXPath("//*[@name='selection_filter']").clear();
      		   driver.findElementByXPath("//*[@name='selection_filter']").sendKeys(Base.readValueFromExcelSheet().get(b).get("State1"));
      		   Thread.sleep(2000);
      		   int size =  driver.findElementsByXPath("//*[@nodeName='LI']").size();
      		   List<AndroidElement> input = driver.findElementsByXPath("//*[@nodeName='LI']");
      		  for (int j = 0; j <size; j++) {
      			if (Base.readValueFromExcelSheet().get(b).get("State1").equals(input.get(j).getText())) {
      				input.get(j).click();
      			}
      		}
      		   
      	} catch (NullPointerException e) {
      		System.out.println("no state: "+b+": "+Base.readValueFromExcelSheet().get(b).get("State1"));
      	}
          
      Thread.sleep(3000);
       Base.btnclick(rp.getCity());
       try {
     		driver.findElementByXPath("//*[@name='selection_filter']").clear();
     		   driver.findElementByXPath("//*[@name='selection_filter']").sendKeys(Base.readValueFromExcelSheet().get(b).get("City1"));
     		   Thread.sleep(2000);
     		   int size =  driver.findElementsByXPath("//*[@nodeName='LI']").size();
     		   List<AndroidElement> input = driver.findElementsByXPath("//*[@nodeName='LI']");
     		  
     		   
     		  for (int j = 0; j <size; j++) {
     			if (Base.readValueFromExcelSheet().get(b).get("City1").equals(input.get(j).getText())) {
     				input.get(j).click();
     			}
     		}
     		   
     	} catch (NullPointerException e) {
     		System.out.println("no city: "+b+": "+Base.readValueFromExcelSheet().get(b).get("City1"));
     	}
       
       }
      /* Base.setText(rp.getComments(),"this a good profile");
       driver.swipe(0, 900, 0, 0, 1000);
       Base.btnclick(rp.getContinuebutton());
       Thread.sleep(5000);
       logger.log(LogStatus.PASS, "Third Page details where entered successfully");
       String gettext = Base.gettext(rp.getMatrixid());
       System.out.println(gettext);
       logger.log(LogStatus.PASS, "Got the MatriId successfully");*/
}
    @AfterMethod
     public void takeScreenShotOnFailure(ITestResult testResult) throws IOException, InterruptedException {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println(testResult.getStatus());
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("C:\\Users\\Admin\\workspace\\PwaApp\\screenshot\\Register.png"));
			System.out.println("sadfhgh");
		String capture = logger.addScreenCapture("C:\\Users\\Admin\\workspace\\PwaApp\\screenshot\\Register.png");
	
		logger.log(LogStatus.FAIL, "negative methoed fail",capture);
		 
       
    
		
   }
		
		report.endTest(logger);
		report.flush();
		
	    //driver.quit();

}

}
