package Task.com.Matri.com;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SearchPage extends  Base  {
	
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
		
		PomSearchPage lp=new PomSearchPage(driver);
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
        driver.findElementByXPath("//*[@nodeName='ION-ICON' and ./parent::*[@text='            '] and (./preceding-sibling::* | ./following-sibling::*)[@text='Search']]").click();
        Thread.sleep(5000);
        //Mothertongue and caste check
        //================================================================================
        //for (int i = 21; i <=60; i++) {
        	//try {
				//driver.findElementByXPath("(//*/*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./parent::*[@nodeName='DIV'] and ./*[./*[@nodeName='SPAN' and @width>0]]])[3]").click();
        		//Thread.sleep(5000);
        		//driver.findElementByXPath("//*[@nodeName='INPUT']").sendKeys("Any");
        		//Thread.sleep(1000);
        		//driver.findElementByXPath("//*[@class='checkbox-icon']").click();
        		//Thread.sleep(1000);
        		//Base.cleartextbox(driver.findElementByXPath("//*[@nodeName='INPUT']"));
        		//Thread.sleep(1000);
        		//driver.findElementByXPath("//*[@nodeName='INPUT']").sendKeys(BaseCaste.readValueFromExcelSheet().get(i).get("Mothertnouge"));
        		//Thread.sleep(1000);
        		//driver.findElementByXPath("//*[@class='checkbox-icon']").click();
        		//Thread.sleep(1000);
        		//driver.findElementByXPath("(//*[@text='                                            ' and ./parent::*[@text='            ']]/*/*[@nodeName='ION-ICON' and ./parent::*[@text='                            ']])[2]").click();
        		//} catch (Exception e) {
			//System.out.println("no mothertongue:"+i+": "+BaseCaste.readValueFromExcelSheet().get(i).get("Mothertnouge"));
			//}
        	//try {
				//driver.findElementByXPath("(//*/*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./parent::*[@nodeName='DIV'] and ./*[./*[@nodeName='SPAN' and @width>0]]])[4]").click();
        		//Thread.sleep(5000);
        		//driver.findElementByXPath("//*[@nodeName='INPUT']").sendKeys("Don't wish to specify");
        		//Thread.sleep(1000);
        		//driver.findElementByXPath("//*[@class='checkbox-icon']").click();
        		//Thread.sleep(1000);
        		//Base.cleartextbox(driver.findElementByXPath("//*[@nodeName='INPUT']"));
        		//Thread.sleep(1000);
        		//driver.findElementByXPath("//*[@nodeName='INPUT']").sendKeys(BaseCaste.readValueFromExcelSheet().get(i).get("Caste"));
        		//Thread.sleep(1000);
        		//driver.findElementByXPath("//*[@class='checkbox-icon']").click();
        		//Thread.sleep(1000);
        		//driver.findElementByXPath("(//*[@text='                                            ' and ./parent::*[@text='            ']]/*/*[@nodeName='ION-ICON' and ./parent::*[@text='                            ']])[2]").click();
        		//} catch (Exception e) {
			//System.out.println("no mothertongue:"+i+": "+BaseCaste.readValueFromExcelSheet().get(i).get("Caste"));
			//}
        	//if(!BaseCaste.readValueFromExcelSheet().get(i).get("subcaste").equals("null")){
		   		//Thread.sleep(8000);
		   		//try{
		   		//driver.findElementByXPath("(//*/*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./parent::*[@nodeName='DIV'] and ./*[./*[@nodeName='SPAN' and @width>0]]])[5]").click();
        		//

        		//} catch (Exception e) {
			//System.out.println("no mothertongue:"+i+": "+BaseCaste.readValueFromExcelSheet().get(i).get("subcaste"));
			//}
        //}
   // }
        		//education check
        		//=================================================================================================
        		// driver.swipe(0,800,0,0,1000);
        		 //for (int i = 1; i <=2; i++) {
					//try {
						//driver.findElementByXPath("(//*/*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./parent::*[@nodeName='DIV'] and ./*[./*[@nodeName='SPAN' and @width>0]]])[9]").click();
						//Thread.sleep(5000);
		        		//driver.findElementByXPath("//*[@nodeName='INPUT']").sendKeys("Any");
		        		//Thread.sleep(1000);
		        		//driver.findElementByXPath("//*[@class='checkbox-icon']").click();
		        		//Thread.sleep(1000);
		        		//Base.cleartextbox(driver.findElementByXPath("//*[@nodeName='INPUT']"));
		        		//Thread.sleep(1000);
		        		//driver.findElementByXPath("//*[@nodeName='INPUT']").sendKeys(BaseEducation.readValueFromExcelSheet().get(i).get("Education"));
		        		//Thread.sleep(1000);
		        		//driver.findElementByXPath("//*[@class='checkbox-icon']").click();
		        		//Thread.sleep(1000);
		        		//driver.findElementByXPath("(//*[@text='                                            ' and ./parent::*[@text='            ']]/*/*[@nodeName='ION-ICON' and ./parent::*[@text='                            ']])[2]").click();
	
					//} catch (Exception e) {
						//System.out.println("no Education:"+i+": "+BaseEducation.readValueFromExcelSheet().get(i).get("Education"));
				//}
        		// }
        //Occupation check
        //===========================================================================================================
        //driver.swipe(0,800,0,0,1000);
       // for (int j = 1; j <=5; j++) {
        	//try {
				//driver.findElementByXPath("(//*/*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./parent::*[@nodeName='DIV'] and ./*[./*[@nodeName='SPAN' and @width>0]]])[10]").click();
				//Thread.sleep(5000);
        		//driver.findElementByXPath("//*[@nodeName='INPUT']").sendKeys("Any");
        		//Thread.sleep(1000);
        		//driver.findElementByXPath("//*[@class='checkbox-icon']").click();
        		//Thread.sleep(1000);
        		//Base.cleartextbox(driver.findElementByXPath("//*[@nodeName='INPUT']"));
        		//Thread.sleep(1000);
        		//driver.findElementByXPath("//*[@nodeName='INPUT']").sendKeys(BaseOccupation.readValueFromExcelSheet().get(j).get("Occupation"));
        		//Thread.sleep(1000);
        		//driver.findElementByXPath("//*[@class='checkbox-icon']").click();
        		//Thread.sleep(1000);
        		//driver.findElementByXPath("(//*[@text='                                            ' and ./parent::*[@text='            ']]/*/*[@nodeName='ION-ICON' and ./parent::*[@text='                            ']])[2]").click();

			//} catch (Exception e) {
				//System.out.println("no Occupation:"+j+": "+BaseOccupation.readValueFromExcelSheet().get(j).get("Occupation"));
		//}
        //}
        //Location state and district
        //================================================================================================================
        driver.swipe(0,400,0,0,1000);
        driver.findElementByXPath("(//*/*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./parent::*[@nodeName='DIV'] and ./*[./*[@nodeName='SPAN' and @width>0]]])[6]").click();
        Thread.sleep(5000);
        driver.findElementByXPath("//*[@nodeName='INPUT']").sendKeys("Any");
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@class='checkbox-icon']").click();
        Thread.sleep(1000);
        Base.cleartextbox(driver.findElementByXPath("//*[@nodeName='INPUT']"));
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@nodeName='INPUT']").sendKeys("India");
        Thread.sleep(1000);
        driver.findElementByXPath("//*[@class='checkbox-icon']").click();
        Thread.sleep(1000);
        driver.findElementByXPath("(//*[@text='                                            ' and ./parent::*[@text='            ']]/*/*[@nodeName='ION-ICON' and ./parent::*[@text='                            ']])[2]").click();
        for (int i = 1; i <=45; i++) {
        	try {
        		 driver.findElementByXPath("(//*/*/*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./parent::*[@nodeName='DIV'] and ./*[./*[@nodeName='SPAN' and @width>0]]])[7]").click();
        	        Thread.sleep(5000);
        	        driver.findElementByXPath("//*[@nodeName='INPUT']").sendKeys("Any");
        	        Thread.sleep(1000);
        	        driver.findElementByXPath("//*[@class='checkbox-icon']").click();
        	        Thread.sleep(2000);
        	        Base.cleartextbox(driver.findElementByXPath("//*[@nodeName='INPUT']"));
        	        Thread.sleep(3000);
        	        driver.findElementByXPath("//*[@nodeName='INPUT']").sendKeys(Base.readValueFromExcelSheet1().get(i).get("State2"));
        	        Thread.sleep(1000);
        	        driver.findElementByXPath("//*[@class='checkbox-icon']").click();
        	        Thread.sleep(1000);
        	        driver.findElementByXPath("(//*[@text='                                            ' and ./parent::*[@text='            ']]/*/*[@nodeName='ION-ICON' and ./parent::*[@text='                            ']])[2]").click();
			} catch (Exception e) {
				System.out.println("No state:"+i+": "+Base.readValueFromExcelSheet1().get(i).get("State2"));
			}
        	try {
       		 driver.findElementByXPath("(//*/*/*/*/*/*[@text and @nodeName='DIV' and @width>0 and ./parent::*[@nodeName='DIV'] and ./*[./*[@nodeName='SPAN' and @width>0]]])[8]").click();
       	        Thread.sleep(5000);
       	        driver.findElementByXPath("//*[@nodeName='INPUT']").sendKeys("Any");
       	        Thread.sleep(1000);
       	        driver.findElementByXPath("//*[@class='checkbox-icon']").click();
       	        Thread.sleep(2000);
       	        Base.cleartextbox(driver.findElementByXPath("//*[@nodeName='INPUT']"));
       	        Thread.sleep(3000);
       	        driver.findElementByXPath("//*[@nodeName='INPUT']").sendKeys(Base.readValueFromExcelSheet1().get(i).get("Dist2"));
       	        Thread.sleep(1000);
       	        driver.findElementByXPath("//*[@class='checkbox-icon']").click();
       	        Thread.sleep(1000);
       	        driver.findElementByXPath("(//*[@text='                                            ' and ./parent::*[@text='            ']]/*/*[@nodeName='ION-ICON' and ./parent::*[@text='                            ']])[2]").click();
			} catch (Exception e) {
				System.out.println("No state:"+i+": "+Base.readValueFromExcelSheet1().get(i).get("Dist2"));
			}
        	}
                
        
    }
}