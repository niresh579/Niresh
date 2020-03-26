package Task.com.Matri.com;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Editpp extends  Base  {
	
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
        dc.setCapability(MobileCapabilityType.UDID, "d643ce6d");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);



     }
    @Test
    public void testUntitled() throws InterruptedException, IOException {
    	report = new ExtentReports("C:\\Users\\Admin\\workspace\\PwaApp\\test-output\\editprofilepi.html", true);
		logger =  report.startTest("Login");
		
		PomEditPP lp=new PomEditPP(driver);
		Base.btnclick(lp.getMenub());
		Thread.sleep(1000);
		Base.btnclick(lp.getHistory());
		Thread.sleep(2000);
        Base.btnclick(lp.getClearbrowserdata());
        Thread.sleep(2000);
        Base.btnclick(lp.getCleardata());
        Thread.sleep(2000);
        Base.btnclick(lp.getClear());
        Thread.sleep(2000);
    	 
       driver.get("https://devmobile.tamilmatrimony.com");
       logger.log(LogStatus.PASS, "Successfully entered the Bharatmatimony");
       Thread.sleep(8000);
        /*Base.btnclick(lp.getLoginbutton());
        logger.log(LogStatus.PASS, "Successfully clicked on login button");
        Thread.sleep(8000);*/
       Base.setText(lp.getUsername(),"M990603");
        logger.log(LogStatus.PASS, "Successfully entered the username");
        Thread.sleep(8000);
        Base.setText(lp.getPassword(),"test4bm");
        logger.log(LogStatus.PASS, "Successfully entered the password");
        Thread.sleep(1000);
        Base.btnclick(lp.getLogin());
        logger.log(LogStatus.PASS, "Successfully clicked the login button");
        Thread.sleep(50000);
        try {
        	Thread.sleep(3000);
			driver.findElementByXPath("//*[@text=' Skip ']").click();
		} catch (Exception e) {
			System.out.println("no popup");
		}
        try {
			driver.findElementByXPath("//*[@nodeName='IMG' and ./parent::*[@id='close']]").click();
		} catch (Exception e) {
			System.out.println("no popup");
		}
        Thread.sleep(15000);
        //Base.btnclick(lp.getMenu());
        Thread.sleep(2000);
        Base.btnclick(lp.getMenu());
        Thread.sleep(5000);
        driver.swipe(0,900,0,0,1000);
        Base.btnclick(lp.getEditprofile());
        logger.log(LogStatus.PASS, "Successfully clicked edit profile");
        Thread.sleep(20000);
        driver.swipe(0,800,0,0,1000);
        driver.swipe(0,800,0,0,1000);
        driver.swipe(0,800,0,0,1000);
        driver.swipe(0,800,0,0,1000);
        System.out.println(Base.gettext(driver.findElementByXPath("//*[@text=' Partner Preference']")));
        //Mothertongue ,caste and subcaste check
        //==========================================================================
        //driver.swipe(0,800,0,0,1000);
        //System.out.println(Base.gettext(driver.findElementByXPath("//*[@text='Religious Preference']")));
       // Thread.sleep(5000);
       //driver.findElementByXPath("//*[@nodeName='ION-ICON' and ./parent::*[@text='                            ' and (./preceding-sibling::* | ./following-sibling::*)[@text='                ' and ./*[@text='Religious Preference']]]]").click();
      
       //for (int i = 1; i <=60; i++){
  		 // try {
  			 //Thread.sleep(8000);
  			//driver.findElementByXPath("(//*/*/*/*/*[@nodeName='ION-LABEL'])[2]").click();
  			//Thread.sleep(1000);
  			//Base.setText(driver.findElementByXPath("//*[@nodeName='INPUT']"),"Any");
  			//Thread.sleep(1000);
  			//driver.findElementByXPath("//*[@class='input-wrapper']").click();
  		//	Thread.sleep(1000);
  			//Base.cleartextbox(driver.findElementByXPath("//*[@nodeName='INPUT']"));
  			//Thread.sleep(1000);
  			//driver.findElementByXPath("//*[@nodeName='INPUT']").sendKeys(BaseCaste.readValueFromExcelSheet().get(i).get("Mothertnouge"));
  			//Thread.sleep(1000);
  			//driver.findElementByXPath("//*[@class='input-wrapper']").click();
  			//Thread.sleep(1000);
  			//driver.findElementByXPath("(//*[@text='                                            ' and @nodeName='ION-ROW']/*/*[@nodeName='ION-ICON' and ./parent::*[@text='                            ']])[2]").click();
		//} catch (Exception e) {
			//System.out.println("no mothertongue:"+i+": "+BaseCaste.readValueFromExcelSheet().get(i).get("Mothertnouge"));
		//}
  		  //try {
  			 //Thread.sleep(8000);
  			 
  			//driver.findElementByXPath("(//*/*/*/*/*[@nodeName='ION-LABEL'])[3]").click();
  			//Thread.sleep(1000);
  			//Base.setText(driver.findElementByXPath("//*[@nodeName='INPUT']"),"Any");
  			//Thread.sleep(1000);
  			//driver.findElementByXPath("//*[@class='input-wrapper']").click();
  			//Thread.sleep(1000);
  			//Base.cleartextbox(driver.findElementByXPath("//*[@nodeName='INPUT']"));
  			//Thread.sleep(1000);
  			//driver.findElementByXPath("//*[@nodeName='INPUT']").sendKeys(BaseCaste.readValueFromExcelSheet().get(i).get("Caste"));
  			//Thread.sleep(1000);
  			//driver.findElementByXPath("//*[@class='input-wrapper']").click();
  			//Thread.sleep(1000);
  			//driver.findElementByXPath("(//*[@text='                                            ' and @nodeName='ION-ROW']/*/*[@nodeName='ION-ICON' and ./parent::*[@text='                            ']])[2]").click();
		//} catch (Exception e) {
			//System.out.println("no Caste:"+i+": "+BaseCaste.readValueFromExcelSheet().get(i).get("Caste"));
		//}
  		 //if(!BaseCaste.readValueFromExcelSheet().get(i).get("subcaste").equals("null")){
		   		//Thread.sleep(8000);
		   		//try {
		   		
		   			//driver.findElementByXPath("(//*/*/*/*/*/*[@nodeName='ION-LABEL' and ./parent::*[./parent::*[./parent::*[./parent::*[@nodeName='DIV']]]]])[1]").click();
		  		//	Thread.sleep(1000);
		  			//Base.setText(driver.findElementByXPath("//*[@nodeName='INPUT']"),"Any");
		  			//Thread.sleep(1000);
		  			//driver.findElementByXPath("//*[@class='input-wrapper']").click();
		  			//Thread.sleep(1000);
		  			//Base.cleartextbox(driver.findElementByXPath("//*[@nodeName='INPUT']"));
		  			//Thread.sleep(1000);
		  			//driver.findElementByXPath("//*[@nodeName='INPUT']").sendKeys(BaseCaste.readValueFromExcelSheet().get(i).get("subcaste"));
		  			//Thread.sleep(1000);
		  			//driver.findElementByXPath("//*[@class='input-wrapper']").click();
		  			//Thread.sleep(1000);
		  			//driver.findElementByXPath("(//*[@text='                                            ' and @nodeName='ION-ROW']/*/*[@nodeName='ION-ICON' and ./parent::*[@text='                            ']])[2]").click();
				//} catch (Exception e) {
					//System.out.println("no subcaste:"+i+": "+BaseCaste.readValueFromExcelSheet().get(i).get("subcaste"));
				//}
  		 //}
    //}
  	//Eduction check	  
     //=======================================================================================================================
        //driver.swipe(0,800,0,0,1000);
        //System.out.println(Base.gettext(driver.findElementByXPath("//*[@text='Professional Preference']")));
       //Thread.sleep(5000);
       //driver.findElementByXPath("//*[@nodeName='ION-ICON' and ./parent::*[@text='                            ' and (./preceding-sibling::* | ./following-sibling::*)[@text='                 ' and ./*[@text='Professional Preference']]]]").click();
       //Thread.sleep(5000);
       //for (int i = 1; i <=2; i++) {
    	   
    	  // try {
			//driver.findElementByXPath("(//*/*/*/*/*[@nodeName='ION-LABEL'])[1]").click();
			   //Thread.sleep(1000);
			  // Base.setText(driver.findElementByXPath("//*[@nodeName='INPUT']"),"Any");
				//Thread.sleep(1000);
				//driver.findElementByXPath("//*[@class='checkbox-icon']").click();
				//Thread.sleep(1000);
				//Base.cleartextbox(driver.findElementByXPath("//*[@nodeName='INPUT']"));
				//Thread.sleep(1000);
				//driver.findElementByXPath("//*[@nodeName='INPUT']").sendKeys(BaseEducation.readValueFromExcelSheet().get(i).get("Education"));
				//Thread.sleep(1000);
				//driver.findElementByXPath("//*[@class='checkbox-icon']").click();
			//Thread.sleep(2000);
				//driver.findElementByXPath("(//*[@text='                                            ']/*/*[@nodeName='ION-ICON' and ./parent::*[@text='                            ']])[2]").click();
		//} catch (NullPointerException e) {
			//System.out.println("no education: "+i+": "+BaseEducation.readValueFromExcelSheet().get(i).get("Education"));
    	  // }
     //  }
       //occupation check
       //=========================================================================================================================
      // driver.swipe(0,800,0,0,1000);
       //System.out.println(Base.gettext(driver.findElementByXPath("//*[@text='Professional Preference']")));
     // Thread.sleep(5000);
      ///driver.findElementByXPath("//*[@nodeName='ION-ICON' and ./parent::*[@text='                            ' and (./preceding-sibling::* | ./following-sibling::*)[@text='                 ' and ./*[@text='Professional Preference']]]]").click();
      //Thread.sleep(5000);
       //for (int j = 1; j <=5; j++) {
    	   //try {
			//driver.findElementByXPath("(//*/*/*/*/*[@nodeName='ION-LABEL'])[2]").click();
			 //  Thread.sleep(1000);
			  // Base.setText(driver.findElementByXPath("//*[@nodeName='INPUT']"),"Any");
				//Thread.sleep(1000);
				//driver.findElementByXPath("//*[@class='checkbox-icon']").click();
				//Thread.sleep(1000);
				//Base.cleartextbox(driver.findElementByXPath("//*[@nodeName='INPUT']"));
				//Thread.sleep(1000);
				//driver.findElementByXPath("//*[@nodeName='INPUT']").sendKeys(BaseOccupation.readValueFromExcelSheet().get(j).get("Occupation"));
				//Thread.sleep(1000);
				//driver.findElementByXPath("//*[@class='checkbox-icon']").click();
			//Thread.sleep(2000);
				//driver.findElementByXPath("(//*[@text='                                            ']/*/*[@nodeName='ION-ICON' and ./parent::*[@text='                            ']])[2]").click();
		//} catch (NullPointerException e) {
			//System.out.println("no education: "+j+": "+BaseOccupation.readValueFromExcelSheet().get(j).get("Occupation"));

		//}
    	  // }
        
        //Location State and city
        //======================================================================================================
        driver.swipe(0,800,0,0,1000);
        driver.swipe(0,200,0,0,1000);
        System.out.println(Base.gettext(driver.findElementByXPath("//*[@text='Location Preference']")));
        Thread.sleep(2000);
        driver.findElementByXPath("//*[@nodeName='ION-ICON' and ./parent::*[@text='                            ' and (./preceding-sibling::* | ./following-sibling::*)[@text='                ' and ./*[@text='Location Preference']]]]").click();
        Thread.sleep(5000);
        driver.findElementByXPath("//*[@nodeName='ION-LABEL' and ./parent::*[./parent::*[./parent::*[./parent::*[@nodeName='ION-GRID']]]]]").click();
        Thread.sleep(2000);
        Base.setText(driver.findElementByXPath("//*[@nodeName='INPUT']"),"Any");
        Thread.sleep(1000);
		driver.findElementByXPath("//*[@class='checkbox-icon']").click();
		Thread.sleep(1000);
		Base.cleartextbox(driver.findElementByXPath("//*[@nodeName='INPUT']"));
		Thread.sleep(1000);
		 Base.setText(driver.findElementByXPath("//*[@nodeName='INPUT']"),"India");
		 Thread.sleep(1000);
		 driver.findElementByXPath("//*[@class='checkbox-icon']").click();
		 Thread.sleep(2000);
	     driver.findElementByXPath("(//*[@text='                                            ']/*/*[@nodeName='ION-ICON' and ./parent::*[@text='                            ']])[2]").click();
		 
        for (int i = 1; i <=288; i++) {
        try {
			driver.findElementByXPath("(//*/*/*/*/*/*[@nodeName='ION-LABEL' and ./parent::*[./parent::*[./parent::*[./parent::*[@nodeName='DIV']]]]])[1]").click();
			Thread.sleep(2000);
	        Base.setText(driver.findElementByXPath("//*[@nodeName='INPUT']"),"Any");
	        Thread.sleep(1000);
			driver.findElementByXPath("//*[@class='checkbox-icon']").click();
			Thread.sleep(1000);
			Base.cleartextbox(driver.findElementByXPath("//*[@nodeName='INPUT']"));
			Thread.sleep(1000);
			 Base.setText(driver.findElementByXPath("//*[@nodeName='INPUT']"),Base.readValueFromExcelSheet().get(i).get("State1"));
			 Thread.sleep(1000);
			 driver.findElementByXPath("//*[@class='checkbox-icon']").click();
			 Thread.sleep(2000);
		     driver.findElementByXPath("(//*[@text='                                            ']/*/*[@nodeName='ION-ICON' and ./parent::*[@text='                            ']])[2]").click();
		} catch (Exception e) {
			System.out.println("No state: "+i+": "+Base.readValueFromExcelSheet().get(i).get("State1"));
		}
        try {
			driver.findElementByXPath("(//*/*/*/*/*/*[@nodeName='ION-LABEL' and ./parent::*[./parent::*[./parent::*[./parent::*[@nodeName='DIV']]]]])[2]").click();
			Thread.sleep(2000);
	        Base.setText(driver.findElementByXPath("//*[@nodeName='INPUT']"),"Any");
	        Thread.sleep(1000);
			driver.findElementByXPath("//*[@class='checkbox-icon']").click();
			Thread.sleep(1000);
			Base.cleartextbox(driver.findElementByXPath("//*[@nodeName='INPUT']"));
			Thread.sleep(1000);
			 Base.setText(driver.findElementByXPath("//*[@nodeName='INPUT']"),Base.readValueFromExcelSheet().get(i).get("City1"));
			 Thread.sleep(1000);
			 driver.findElementByXPath("//*[@class='checkbox-icon']").click();
			 Thread.sleep(2000);
		     driver.findElementByXPath("(//*[@text='                                            ']/*/*[@nodeName='ION-ICON' and ./parent::*[@text='                            ']])[2]").click();
		} catch (Exception e) {
			System.out.println("No state: "+i+": "+Base.readValueFromExcelSheet().get(i).get("City1"));
		}
        	
        	
        	
        	
        	
        }
       
       
       
       
       
       
    }	
}	  
  		  
  		  
  		  
  		  
  	  
  
    

        
        

