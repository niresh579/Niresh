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

public class RegIntermediatePage extends  Base  {
	
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
       //driver.get("https://www.bharatmatrimony.com");
          driver.get("https://stgwap.tamilmatrimony.com/mobwap/registration/register.php");
       logger.log(LogStatus.PASS, "Successfully entered the Bharatmatimony");
      // driver.findElementByXPath("//*[@text=' REGISTER    ']").click();
       Thread.sleep(5000);
       Base.btnclick(rp.getProfilefor());
       driver.findElement(By.xpath("//*[@text='Son' and @nodeName='LI']")).click();
       Base.btnclick(rp.getName());
       Base.setText(rp.getName(),"raj");
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
       driver.findElement(By.xpath("//*[@text='Tamil' and @nodeName='LI']")).click();
       Base.btnclick(rp.getContinuebutton());
       logger.log(LogStatus.PASS, "First Page details where entered successfully");
       Thread.sleep(2000);
       Base.setText(rp.getEmail(),"bmtestemails"+nn+"@gmail.com");
       Base.btnclick(rp.getCaste());
       driver.findElement(By.xpath("//*[@text='Ahirwar' and @nodeName='LI']")).click();
       Base.btnclick(rp.getSubcaste());
      // driver.findElement(By.xpath("//*[@text='Bisa']")).click();
       Base.setText(rp.getSubcaste(),"Don't know");
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
       Base.btnclick(rp.getEducation());
       Base.btnclick(rp.getEducationbe());
       Base.btnclick(rp.getEmployedin());
       Base.btnclick(rp.getPrivateemp());
       Base.btnclick(rp.getOccupation());
       Base.btnclick(rp.getManager());
       driver.swipe(0, 900, 0, 0, 1000);
       Base.btnclick(rp.getIncome());
       Base.btnclick(rp.getLakhs());
       Base.btnclick(rp.getCountrywork());
       Base.btnclick(rp.getPlaceofwork());
       driver.swipe(0, 900, 0, 0, 1000);
       Base.btnclick(rp.getRegstate());
       Base.btnclick(rp.getAndhra());
       Base.btnclick(rp.getCity());
       Base.btnclick(rp.getCityplace());
       Base.setText(rp.getComments(),"my son is a good and nice looking boy who earns wwell and well settel family");
       driver.swipe(0, 900, 0, 0, 1000);
       Base.btnclick(rp.getContinuebutton());
       Thread.sleep(5000);
       logger.log(LogStatus.PASS, "Third Page details where entered successfully");
       String gettext = Base.gettext(rp.getMatrixid());
       System.out.println(gettext);
       logger.log(LogStatus.PASS, "Got the MatriId successfully");
       driver.findElementByXPath("//*[@id='skiplink' and @nodeName='A']").click();
       Thread.sleep(2000);
       
       
       
       
       
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