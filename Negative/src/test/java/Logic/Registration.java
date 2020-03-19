package Logic;

import static org.testng.Assert.assertEquals;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import pom.RegistrationPOM;

public class Registration extends BaseTest{
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\Negative\\drivernew\\chromedriver.exe"; 

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
          
           
//           ExtentReports report;
//           ExtentTest logger;
//           private String reportDirectory = "reports";
//           private String reportFormat = "xml";
//           private String testName = "Untitled";
//           protected AndroidDriver<AndroidElement> driver = null;
//
//           DesiredCapabilities dc = new DesiredCapabilities();
//           
//           @BeforeTest
//           public void setUp() throws MalformedURLException {
//           	   dc.setCapability("reportDirectory", reportDirectory);
//                  dc.setCapability("reportFormat", reportFormat);
//                  dc.setCapability("testName", testName);
//                  dc.setCapability(MobileCapabilityType.UDID, "ZDHUTW49BMOZAU8T");
//                  dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
//                  dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
//                  driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
//                  driver.setLogLevel(Level.INFO);

           
           
       }
	
	@Test
	public void test() throws Throwable {
		RegistrationPOM rp=new RegistrationPOM(driver);
		Thread.sleep(4000);
		driver.get("https://m.communitymatrimony.com/");
		Thread.sleep(4000);	
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement createaccount=driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
		String a23=createaccount.getText();
		System.out.println(a23);
		

		WebElement log=driver.findElement(By.xpath("//span[@id='login-btn']"));
		String login=log.getText();
		System.out.println(login);
		
		WebElement suita=driver.findElement(By.xpath("//h3[contains(text(),'Find Your Suitable Match!')]"));
		String suitamatch=suita.getText();
		System.out.println(suitamatch);
		
		
		String community=driver.findElement(By.xpath("//label[contains(text(),'Select your community to start off')]")).getText();
		assertEquals("Select your community to start off",community, "Passed");
		
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		WebElement community1=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[1]/label"));
		String a=community1.getText();
		System.out.println(a);
		BaseTest.getScreenshot(driver, "select community");		
		
		Thread.sleep(4000);
		BaseTest.click(rp.getCommunity());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		Thread.sleep(4000);
		 BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 0)+"')]")));
		
		
		String profile=driver.findElement(By.xpath("//span[contains(text(),'Select who is creating profile')]")).getText();
		assertEquals("Select who is creating profile",profile, "Passed");
		
		String gender=driver.findElement(By.xpath("//span[contains(text(),'Gender of the bride / groom')]")).getText();
		assertEquals("Gender of the bride / groom",gender, "Passed");
		
		String name=driver.findElement(By.xpath("//label[contains(text(),'Enter the name of bride / groom')]")).getText();
		assertEquals("Enter the name of bride / groom",name, "Passed");
		
		String dob=driver.findElement(By.xpath("//label[contains(text(),'Date of birth of the bride / groom')]")).getText();
		assertEquals("Date of birth of the bride / groom",dob, "Passed");
		
		String gmail=driver.findElement(By.xpath("//label[contains(text(),'This will be used to send all communication')]")).getText();
		assertEquals("This will be used to send all communication",gmail, "Passed");
		
		String pass2=driver.findElement(By.xpath("//label[contains(text(),'Enter a password to keep your account secure')]")).getText();
		assertEquals("Enter a password to keep your account secure",pass2, "Passed");
		
		String mob=driver.findElement(By.xpath("//label[contains(text(),'Interested matches will contact you in this number')]")).getText();
		assertEquals("Interested matches will contact you in this number",mob, "Passed");
		
		String mothers=driver.findElement(By.xpath("//label[contains(text(),'Select mother tongue to find the one who speaks your language')]")).getText();
		assertEquals("Select mother tongue to find the one who speaks your language",mothers, "Passed");
		
//		try {
//			String sub=driver.findElement(By.xpath("//label[contains(text(),'Select subcaste to find compatible matches')]")).getText();
//			assertEquals("Select subcaste to find compatible matches",sub, "Passed");
//			
//		} catch (Exception e) {
//			
//		}
		
		try {
			String denom=driver.findElement(By.xpath("//label[contains(text(),'Select denomination to find compatabile matches')]")).getText();
			assertEquals("Select denomination to find compatabile matches",denom, "Passed");
			
		} catch (Exception e) {
			
		}
		
		try {
			String div=driver.findElement(By.xpath("//label[contains(text(),'Select division to find compatible matches')]")).getText();
			assertEquals("Select division to find compatible matches",div, "Passed");
			
		} catch (Exception e) {
			
		}
		
		try {
			String sect=driver.findElement(By.xpath("//label[contains(text(),'Select division to find compatible matches')]")).getText();
			assertEquals("Select division to find compatible matches",sect, "Passed");
			
		} catch (Exception e) {
			
		}
		
//		try {
//			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select caste / division to find compatible matches')]")).getText();
//			assertEquals("Select caste / division to find compatible matches",casdiv, "Passed");
//			
//		} catch (Exception e) {
//			
//		}
		
		
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		WebElement profile1=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[2]/div[1]/legend/label/span"));
		String b=profile1.getText();
		System.out.println(b);
		BaseTest.getScreenshot(driver, "select community");
		Thread.sleep(4000);
		BaseTest.getScreenshot(driver, "profile created by");
		 
		Thread.sleep(4000);
		BaseTest.click(rp.getProfilecreatedfor());
		

		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		
		WebElement gender1=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[3]/div[1]/legend/label/span"));
		String d=gender1.getText();
		System.out.println(d);	
		Thread.sleep(4000);
		BaseTest.getScreenshot(driver, "gender popup");
		
		Thread.sleep(4000);
		BaseTest.click(rp.getGender());
		
		try {
			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Enter the name of groom')]")).getText();
			assertEquals("Enter the name of groom",casdiv, "Passed");
			
		} catch (Exception e) {
			
		}
		

		try {
			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Enter the name of bride')]")).getText();
			assertEquals("Enter the name of bride",casdiv, "Passed");
			
		} catch (Exception e) {
			
		}
		
		try {
			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Date of birth of the groom')]")).getText();
			assertEquals("Date of birth of the groom",casdiv, "Passed");
			
		} catch (Exception e) {
			
		}
		
		try {
			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Date of birth of the bride')]")).getText();
			assertEquals("Date of birth of the bride",casdiv, "Passed");
			
		} catch (Exception e) {
			
		}
		
		
		
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		WebElement name1=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[4]/label"));
		String c=name1.getText();
		System.out.println(c);
		
		
		Thread.sleep(4000);
		BaseTest.getScreenshot(driver, "name popup");
		
		
		Thread.sleep(4000);
		WebElement e1=driver.findElement(By.xpath("//*[@id='USERNAME1']"));
		Actions a1=new Actions(driver);
		Thread.sleep(4000);
		a1.sendKeys(e1,"@#$%^*(^$%").build().perform();
	   
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
         
		Thread.sleep(4000);
		WebElement e11=driver.findElement(By.xpath("//*[@id='USERNAME1']"));
		Actions a11=new Actions(driver);
		Thread.sleep(4000);
		a11.sendKeys(e11,"12345678").build().perform();
	   

		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		
		Thread.sleep(4000);
		WebElement e111=driver.findElement(By.xpath("//*[@id='USERNAME1']"));
		Actions a111=new Actions(driver);
		Thread.sleep(4000);
		a111.sendKeys(e111,"Lalli").build().perform();
	   
		
		Thread.sleep(4000);
		BaseTest.click(rp.getDob());
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[1]")).click();
		
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		
		WebElement mal=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[6]/label"));
		String g=mal.getText();
		System.out.println(g);		
		Thread.sleep(4000);
		BaseTest.getScreenshot(driver, "mail popup");
		
		
		WebElement validmail=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
		validmail.sendKeys("gihgjgog");
		BaseTest.click(rp.getContinuebutton2());
		WebElement mail23=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[6]/label"));
		String m2=mail23.getText();
		System.out.println(m2);	
		BaseTest.getScreenshot(driver, "valid email popup");
		
		
		Thread.sleep(4000);
		Actions acc1 = new Actions(driver);
		WebElement mail1=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
		acc1.doubleClick(mail1).perform();
		Thread.sleep(4000);
		WebElement mail=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
		mail.sendKeys("st"+ (Math.floor(Math.random() * 1478) + "@gmail.com"));
		
		
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		
		
	
		WebElement password=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[7]/label"));
		String g1=password.getText();
		System.out.println(g1);		
		Thread.sleep(4000);
		BaseTest.getScreenshot(driver, "password popup");
		
		
		Thread.sleep(4000);
		WebElement pass=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
		pass.sendKeys("cbst");
		
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		
		WebElement passwordlen=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[7]/label"));
		String h=passwordlen.getText();
	    System.out.println(h);		
		Thread.sleep(4000);
		BaseTest.getScreenshot(driver, "password character popup");
		
		
		Thread.sleep(4000);
		WebElement pass1=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
		pass1.clear();
		pass1.sendKeys("123456789446");
		
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		
		WebElement passwordlen1=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[7]/label"));
		String h1=passwordlen1.getText();
	    System.out.println(h1);		
		Thread.sleep(4000);
		BaseTest.getScreenshot(driver, "password character popup");
		
//		Thread.sleep(4000);
//		WebElement pass11=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
//		pass11.clear();
//		pass11.sendKeys("1234567894467858456555");
//		
//		Thread.sleep(4000);
//		BaseTest.click(rp.getContinuebutton());
		
//		WebElement passwordlen11=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[7]/label"));
//		String h11=passwordlen11.getText();
//	    System.out.println(h11);		
//		Thread.sleep(4000);
//		BaseTest.getScreenshot(driver, "password character popup");
//		
		
		Thread.sleep(4000);
		WebElement pass111=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
		pass111.clear();
		pass111.sendKeys("cbstest");
		
//		Thread.sleep(4000);
//		BaseTest.click(rp.getContinuebutton());
//		WebElement mobileno=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[6]/div[2]"));
//		String i=mobileno.getText();
//		System.out.println(i);		
//		Thread.sleep(4000);
//		BaseTest.getScreenshot(driver, "mobile number popup");
//		
		Thread.sleep(4000);	
		BaseTest.click(rp.getIsdcode());
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		Thread.sleep(4000);
		 BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 1)+"')]")));
		
			
			Thread.sleep(4000);
			WebElement mobile=driver.findElement(By.xpath("//*[@id='CONTACTNO']"));
			mobile.sendKeys("8015766715");
			Thread.sleep(4000);

			BaseTest.click(rp.getContinuebutton());
			WebElement mothertongue=driver.findElement(By.xpath("//*[@id='mothertongue_display']/fieldset/label"));
			String m=mothertongue.getText();
			System.out.println(m);	
			BaseTest.getScreenshot(driver, "mothertongue popup");
			
		//	BaseTest.click(rp.getMothertongue());
		//	driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 4)+"')]")));
			
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			 Thread.sleep(8000);
			   	JavascriptExecutor js2 = (JavascriptExecutor)driver;
			   	  WebElement edi2= driver.findElement(By.xpath("//*[@id='continuebutton']"));
				  	  js2.executeScript("arguments[0].scrollIntoView(true);",edi2);
				  	BaseTest.click(rp.getContinuebutton());
			
			WebElement religion=driver.findElement(By.xpath("//*[@id='religion_display']/fieldset/label"));
			String k=religion.getText();
			System.out.println(k);	
			
			BaseTest.getScreenshot(driver, "religion popup");
			
			Thread.sleep(4000);
			BaseTest.click(rp.getReligion());
		
		
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 2)+"')]")));
	
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			
			  Thread.sleep(8000);
			   	JavascriptExecutor js9 = (JavascriptExecutor)driver;
			   	  WebElement edi29= driver.findElement(By.xpath("//*[@id='continuebutton']"));
				  	  js9.executeScript("arguments[0].scrollIntoView(true);",edi29);
			 
			BaseTest.click(rp.getContinuebutton());
			WebElement subcaste=driver.findElement(By.xpath("//*[@id='subcaste_display']/fieldset/label"));
			String l=subcaste.getText();
			System.out.println(l);	
			
			BaseTest.getScreenshot(driver, "subcaste popup");
			
			Thread.sleep(4000);
			try {
				BaseTest.click(rp.getSubcaste());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 3)+"')]")));
			} catch (Exception e) {
				//System.out.println("no element1");
			}
			Thread.sleep(4000);
			try {
				driver.findElement(By.xpath("(//*[@id='SUBCASTE'])[1]")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 3)+"')]")));
			} catch (Exception e) {
				//System.out.println("no element 2");
			}
			
			  Thread.sleep(8000);
			   	JavascriptExecutor js1 = (JavascriptExecutor)driver;
			   	  WebElement edi1= driver.findElement(By.xpath("//*[@id='continuebutton']"));
				  	  js1.executeScript("arguments[0].scrollIntoView(true);",edi1);
			 
			
			 
			BaseTest.click(rp.getContinuebutton());
			
			
			/////////page2////////////
			
			WebElement createaccount1=driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
			String a231=createaccount1.getText();
			System.out.println(a231);
			
			
			WebElement page2=driver.findElement(By.xpath("//div[@class='fl-rgt12 step-info']"));
			String page=page2.getText();
			System.out.println(page);
			
			try {
				String marit=driver.findElement(By.xpath("//span[contains(text(),'Marital status of the bride')]")).getText();
				assertEquals("Marital status of the bride",marit, "Passed");
				
			} catch (Exception e) {
					
			}
			
			try {
				String marit=driver.findElement(By.xpath("//span[contains(text(),'Marital status of the groom')]")).getText();
				assertEquals("Marital status of the groom",marit, "Passed");
				
			} catch (Exception e) {
			
			}
			
			try {
				String count=driver.findElement(By.xpath("//label[contains(text(),'Country of residence of the bride')]")).getText();
				assertEquals("Country of residence of the bride",count, "Passed");
				
			} catch (Exception e) {
				
			}
			try {
				String count=driver.findElement(By.xpath("//label[contains(text(),'Country of residence of the groom')]")).getText();
				assertEquals("Country of residence of the bride",count, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String count=driver.findElement(By.xpath("(//label[contains(text(),'Residing state of the bride')])[2]")).getText();
				assertEquals("Residing state of the bride",count, "Passed");
				
			} catch (Exception e) {
				
			}
			try {
				String count=driver.findElement(By.xpath("(//label[contains(text(),'Residing state of the groom')])[2]")).getText();
				assertEquals("Residing state of the groom",count, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String count=driver.findElement(By.xpath("(//label[contains(text(),'Residing city of the bride')])[2]")).getText();
				assertEquals("Residing city of the bride",count, "Passed");
				
			} catch (Exception e) {
				
			}
			try {
				String count=driver.findElement(By.xpath("(//label[contains(text(),'Residing city of the groom')])[2]")).getText();
				assertEquals("Residing city of the groom",count, "Passed");
				
			} catch (Exception e) {
				
			}
			
//			try {
//				String count=driver.findElement(By.xpath("//label[contains(text(),'Citizenship of the bride')]")).getText();
//				assertEquals("Citizenship of the bride",count, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			try {
//				String count=driver.findElement(By.xpath("//label[contains(text(),'Citizenship of the groom')]")).getText();
//				assertEquals("Citizenship of the groom",count, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			
//			try {
//				String count=driver.findElement(By.xpath("//label[contains(text(),'Resident of the bride')]")).getText();
//				assertEquals("Resident of the bride",count, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
//			try {
//				String count=driver.findElement(By.xpath("//label[contains(text(),'Resident of the groom')]")).getText();
//				assertEquals("Resident of the groom",count, "Passed");
//				
//			} catch (Exception e) {
//				
//			}
			
					
			BaseTest.click(rp.getContinuebutton2());
//			WebElement marital=driver.findElement(By.xpath("//div[@class='matritalerror error_display']"));
//			String n=marital.getText();
//			System.out.println(n);	
			BaseTest.getScreenshot(driver, "marital status popup");
			
			Thread.sleep(4000);
			BaseTest.click(rp.getMaritalstatusdivorced());
			
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			BaseTest.click(rp.getContinuebutton2());
			
			WebElement maritalnoofchild=driver.findElement(By.xpath("//*[@id='no_child_section']/fieldset/label"));
			String m1=maritalnoofchild.getText();
			System.out.println(m1);		
			BaseTest.getScreenshot(driver, "no of child popup");
			
			BaseTest.click(rp.getNoofchild());
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[3]")).click();
			
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			
			
			BaseTest.click(rp.getContinuebutton2());
			WebElement childlivingwith=driver.findElement(By.xpath("//*[@id='child_living_section']/fieldset/label"));
			String m11=childlivingwith.getText();
			System.out.println(m11);	
			
			BaseTest.click(rp.getChildlivingwith());
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[1]")).click();
			
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			
		
			BaseTest.click(rp.getContinuebutton2());
			WebElement countr=driver.findElement(By.xpath("//*[@id='CBSRegistration2']/fieldset[3]/label"));
			String o1=countr.getText();
			System.out.println(o1);	
			BaseTest.getScreenshot(driver, "countryliving popup");
			
		
			try {
				driver.findElement(By.xpath("//*[@id='COUNTRYLIVING']")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 5)+"')]")));
				
			} catch (Exception e) {
				//System.out.println("no element");
			}
			
//			Thread.sleep(6000);
//			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[1]")).click();
			
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			        Thread.sleep(4000);
				  	BaseTest.click(rp.getContinuebutton2());	
				  	
				  	Thread.sleep(4000);
					WebElement residing=driver.findElement(By.xpath("//*[@id='StateSelectDisplay']/fieldset/label"));
					String o=residing.getText();
					System.out.println(o);	
					BaseTest.getScreenshot(driver, "residing state popup");
					
			
			
		try {		
			Thread.sleep(4000);

			BaseTest.click(rp.getResidingstate());
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 6)+"')]")));
		} catch (Exception e) {
			//System.out.println("no exception");
		}
		
			
			try {
				Thread.sleep(4000);
				WebElement ref=driver.findElement(By.xpath("//*[@id='RESIDINGSTATETXT']"));
				ref.sendKeys(BaseTest.getExcelData("Sheet3", 1, 6));
			} catch (Exception e) {
				//System.out.println("no exceptions");
			}
			
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[1]")).click();
		
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			
			
			 Thread.sleep(8000);
			   	JavascriptExecutor js4 = (JavascriptExecutor)driver;
			   	  WebElement edi4= driver.findElement(By.xpath("//*[@id='home-footer']/div[1]"));
				  	  js4.executeScript("arguments[0].scrollIntoView(true);",edi4);
			BaseTest.click(rp.getContinuebutton2());
			WebElement residingcity=driver.findElement(By.xpath("//*[@id='CitySelectBox']/fieldset/label"));
			String p=residingcity.getText();
			System.out.println(p);	
			
			BaseTest.getScreenshot(driver, "residing city popup");
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getResidingcity());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 7)+"')]")));
				
			} catch (Exception e) {
				//System.out.println("no exception");
			}
			
			try {	
				Thread.sleep(4000);
				WebElement ref1=driver.findElement(By.xpath("//*[@id='RESIDINGCITYTEXT']"));
				ref1.sendKeys(BaseTest.getExcelData("Sheet3", 1, 7));
				
			} catch (Exception e) {
			//	System.out.println("no exception");
			}
			
			//citizenship
			
			try {
				Thread.sleep(4000);

				BaseTest.click(rp.getCitizenship());
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 8)+"')]")));
			} catch (Exception e) {
				///System.out.println("no exception");
			}
			//residing status
			try {
				 Thread.sleep(8000);
				   	JavascriptExecutor js41 = (JavascriptExecutor)driver;
				   	  WebElement edi41= driver.findElement(By.xpath("//*[@id='home-footer']/div[1]"));
					  	  js41.executeScript("arguments[0].scrollIntoView(true);",edi41);
				BaseTest.click(rp.getContinuebutton2());
				WebElement residingcity1=driver.findElement(By.xpath("//*[@id='Resident_status']/fieldset/div[2]"));
				String p1=residingcity1.getText();
				System.out.println(p1);	
				
			} catch (Exception e) {
				//System.out.println("no residing status");
			}
			
			try {
				Thread.sleep(4000);

				BaseTest.click(rp.getResidingstatus());
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 9)+"')]")));
			} catch (Exception e) {
				//System.out.println("no exception");
			}
			
			 Thread.sleep(8000);
			   	JavascriptExecutor js5 = (JavascriptExecutor)driver;
			   	  WebElement edi5= driver.findElement(By.xpath("//*[@id='home-footer']/div[1]"));
				  	  js5.executeScript("arguments[0].scrollIntoView(true);",edi5);
		
			
			////////////page3///////////
				  	  
		    Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[2]")).click();	  	  
				  	  
				  	  
			Thread.sleep(8000);
		   	JavascriptExecutor js6 = (JavascriptExecutor)driver;
		   	  WebElement edi6= driver.findElement(By.xpath("//*[@id='continuebutton']"));
			  	  js6.executeScript("arguments[0].scrollIntoView(true);",edi6);
			  	  Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton3());	
		
		 Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[2]")).click();	  	  
			
			WebElement createaccount11=driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
			String a2311=createaccount11.getText();
			System.out.println(a2311);
			
			
			WebElement step3=driver.findElement(By.xpath("//div[@class='fl-rgt12 step-info']"));
			String b123=step3.getText();
			System.out.println(b123);
			
			
			try {
				String hieg=driver.findElement(By.xpath("//label[contains(text(),'Height of the bride')]")).getText();
				assertEquals("Height of the bride",hieg, "Passed");
				
			} catch (Exception e) {
				
			}
			
			
				
			//div[@class='fl-rgt12 step-info']
			
			

			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Height of the groom')]")).getText();
				assertEquals("Height of the groom",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Highest educational degree of the bride')]")).getText();
				assertEquals("Highest educational degree of the bride",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Highest educational degree of the groom')]")).getText();
				assertEquals("Highest educational degree of the groom",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Work industry of the bride')]")).getText();
				assertEquals("Work industry of the bride",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Work industry of the groom')]")).getText();
				assertEquals("Work industry of the groom",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			
			WebElement height=driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[1]/label"));
			String q=height.getText();
			System.out.println(q);	
			BaseTest.getScreenshot(driver, "height popup");
					
			BaseTest.click(rp.getHeight());
			Thread.sleep(5000);
	        List<WebElement> heigt = driver.findElements(By.xpath("//div[@class='dww dwrc']//ul//li"));
	        int z = heigt.size();
	        //System.out.println(a);

	        for (int x = 0; x <=22; x++) {

	        //    heigt.get(i).sendKeys("4 ft 2 in / 127 cm");
    Actions mn= new Actions(driver);
	mn.moveToElement(heigt.get(x)).click().build().perform();
	                Thread.sleep(1000);
	           /*    actions.click();
	        //      actions.sendKeys(" ");
	                actions.build().perform();*/

	        } 
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[1]")).click();
			
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			
			Thread.sleep(4000);
			JavascriptExecutor js12 = (JavascriptExecutor)driver;
		   	  WebElement edi12= driver.findElement(By.xpath("//*[@id='continuebutton']"));
			  	  js12.executeScript("arguments[0].scrollIntoView(true);",edi12);	
			  	  Thread.sleep(4000);
			BaseTest.click(rp.getContinuebutton3());
			WebElement education=driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[2]/label"));
			String s=education.getText();
			System.out.println(s);	
			BaseTest.getScreenshot(driver, "education popup");
			
			BaseTest.click(rp.getEducation());
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 10)+"')]")));
			
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			
			Thread.sleep(4000);
			JavascriptExecutor js13 = (JavascriptExecutor)driver;
		   	  WebElement edi13= driver.findElement(By.xpath("//*[@id='continuebutton']"));
			  	  js13.executeScript("arguments[0].scrollIntoView(true);",edi13);
			BaseTest.click(rp.getContinuebutton3());
			WebElement employedin=driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[3]/label"));
			String t=employedin.getText();
			System.out.println(t);	
			BaseTest.getScreenshot(driver, "employedin popup");
			
				
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getEmployedin());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 11)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no exception");
			}
			
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			try {
				String hieg=driver.findElement(By.xpath("//label[contains(text(),'Occupation of the bride')]")).getText();
				assertEquals("Occupation of the bride",hieg, "Passed");
				
			} catch (Exception e) {
				
			}
			

			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Occupation of the groom')]")).getText();
				assertEquals("Occupation of the groom",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String hieg=driver.findElement(By.xpath("//label[contains(text(),'Income of the bride')]")).getText();
				assertEquals("Income of the bride",hieg, "Passed");
				
			} catch (Exception e) {
				
			}
			

			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Income of the groom')]")).getText();
				assertEquals("Income of the groom",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}

			BaseTest.click(rp.getContinuebutton3());
			WebElement occupation=driver.findElement(By.xpath("//*[@id='fieldOccupation']/label"));
			String u=occupation.getText();
			System.out.println(u);	
			BaseTest.getScreenshot(driver, "occupation popup");
			
				
				BaseTest.click(rp.getOccupation());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 12)+"')]")));
				
//			} catch (Exception e) {
//				System.out.println("no exception");
//			}
			
			
//			WebElement rs=driver.findElement(By.xpath("//*[@id='fieldCurrencyType']/div[2]"));
//			String w=rs.getText();
//			System.out.println(w);	
//			BaseTest.getScreenshot(driver, "rs popup");
//			
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			Thread.sleep(4000);
			JavascriptExecutor js22 = (JavascriptExecutor)driver;
		   	  WebElement edi22= driver.findElement(By.xpath("//*[@id='continuebutton']"));
		   	js22.executeScript("arguments[0].scrollIntoView(true);",edi22);
			BaseTest.click(rp.getContinuebutton3());
			
			
			try {
//				Thread.sleep(4000);
//				BaseTest.click(rp.getRs());
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 13)+"')]")));
				
				
				
				Thread.sleep(4000);
				WebElement ref=driver.findElement(By.xpath("//*[@id='fieldCurrencyType']/label"));
				String abc=ref.getText();
				System.out.println(abc);
				BaseTest.getScreenshot(driver, "income popup");
				
				
				Thread.sleep(4000);
				BaseTest.click(rp.getIncome());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 14)+"')]")));
					

			} catch (Exception e) {
				//System.out.println("no exception");
			}
			
			Thread.sleep(4000);
			JavascriptExecutor js221 = (JavascriptExecutor)driver;
		   	  WebElement edi221= driver.findElement(By.xpath("//*[@id='continuebutton']"));
		   	js221.executeScript("arguments[0].scrollIntoView(true);",edi221);
			BaseTest.click(rp.getContinuebutton3());
			WebElement physicalstatus=driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[7]/div[1]/legend/label/span"));
			String y2=physicalstatus.getText();
			System.out.println(y2);	
			BaseTest.getScreenshot(driver, "physicalstatus popup");
			
		Thread.sleep(4000);
		BaseTest.click(rp.getPhysicalstatus());
			
			
			
			
//			try {
//			
//				Thread.sleep(4000);
//				BaseTest.click(rp.getRs());
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 15)+"')]")));
//				
//			} catch (Exception e) {
//				System.out.println("no exceptions");
//			}
//			try {
//
//				Thread.sleep(4000);
//				WebElement ref1=driver.findElement(By.xpath("//input[@placeholder='Enter Salary']"));
//				Thread.sleep(4000);
//				ref1.sendKeys("54545");
//				
//			
//			} catch (Exception e) {
//				System.out.println("no exception");
//			}
			
			Thread.sleep(4000);
			JavascriptExecutor js20 = (JavascriptExecutor)driver;
		   	  WebElement edi20= driver.findElement(By.xpath("//*[@id='continuebutton']"));
		   	js20.executeScript("arguments[0].scrollIntoView(true);",edi20);
			BaseTest.click(rp.getContinuebutton3());
				
//			Thread.sleep(4000);
//			WebElement ref=driver.findElement(By.xpath("//*[@id='INCOMETEXTVALUES']"));
//			String abc=ref.getText();
//			System.out.println(abc);
//			BaseTest.getScreenshot(driver, "Rs permonth popup");
//			Thread.sleep(4000);
//			JavascriptExecutor js201 = (JavascriptExecutor)driver;
//		   	  WebElement edi201= driver.findElement(By.xpath("//*[@id='continuebutton']"));
//		   	js201.executeScript("arguments[0].scrollIntoView(true);",edi201);
//			BaseTest.click(rp.getContinuebutton3());
			WebElement familystatus=driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[8]/div[1]/legend/label/span"));
			String x=familystatus.getText();
			System.out.println(x);	
			BaseTest.getScreenshot(driver, "familystatus popup");
			
			BaseTest.click(rp.getFamilystatus());
			
			Thread.sleep(4000);
			JavascriptExecutor js21 = (JavascriptExecutor)driver;
		   	  WebElement edi21= driver.findElement(By.xpath("//*[@id='continuebutton']"));
		   	js21.executeScript("arguments[0].scrollIntoView(true);",edi21);
			BaseTest.click(rp.getContinuebutton3());
			
			WebElement familytype=driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[9]/div[1]/legend/label/span"));
			String y=familytype.getText();
			System.out.println(y);	
			BaseTest.getScreenshot(driver, "familytype popup");
			BaseTest.click(rp.getFamilytype());
			
		
			
			
			Thread.sleep(4000);
			JavascriptExecutor js23 = (JavascriptExecutor)driver;
		   	  WebElement edi23= driver.findElement(By.xpath("//*[@id='continuebutton']"));
		   	js23.executeScript("arguments[0].scrollIntoView(true);",edi23);
		   	
		   	///muslim matri
		   	
		   	try {
				Thread.sleep(4000);
				BaseTest.click(rp.getEthinicity());
				
				Thread.sleep(4000);
				Actions acc921 = new Actions(driver);
				WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
				acc921.doubleClick(ma41).perform();

				Thread.sleep(6000);
				
				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 16)+"')]")));
				
			} catch (Exception e2) {
				//System.out.println("no ethinicity");
			}

			try {
				Thread.sleep(4000);
			    BaseTest.click(rp.getReligiousvalue());
				
				Thread.sleep(4000);
				Actions acc921 = new Actions(driver);
				WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
				acc921.doubleClick(ma41).perform();
				
				Thread.sleep(6000);
				
				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 17)+"')]")));
				
			} catch (Exception e2) {
				//System.out.println("no religiousvalue");
			}
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getDressofmodestry());
			} catch (Exception e2) {
				//System.out.println("no dress of modestry");
			}
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getReadquran());
			} catch (Exception e2) {
				//System.out.println("no Read quran");
			}
			
//			try {
//				Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='GOTHRAM']")).click();
//			Thread.sleep(4000);
//			Actions acc921 = new Actions(driver);
//			WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//			acc921.doubleClick(ma41).perform();
//			
//			Thread.sleep(6000);
//			
//			  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 12)+"')]")));
//			
//				
//			} catch (Exception e2) {
//				System.out.println("no gothram");
//			}
			//////muslim matri/////////
		   	
		   	try {
		   
		   		Thread.sleep(4000);
				JavascriptExecutor js231 = (JavascriptExecutor)driver;
			   	  WebElement edi231= driver.findElement(By.id("ABOUTME"));
			   	js231.executeScript("arguments[0].scrollIntoView(true);",edi231);
			   	
//		   		Thread.sleep(4000);
//			   	WebElement aboutme=driver.findElement(By.id("ABOUTME"));
//				String y21 = aboutme.getText();
//			System.out.println(y21);
//				
//				System.out.println(y21);
			} catch (Exception e) {
				//System.out.println("no element1");
			}
		   		
			try {
				Thread.sleep(4000);
				JavascriptExecutor js231 = (JavascriptExecutor)driver;
			   	  WebElement edi231= driver.findElement(By.xpath("//*[@id='fieldabtme']/div[2]"));
			   	js231.executeScript("arguments[0].scrollIntoView(true);",edi231);
			   	
		   		Thread.sleep(4000);
			   	WebElement aboutme=driver.findElement(By.xpath("//*[@id='fieldabtme']/div[2]"));
				//String y21=aboutme.getText();
				//System.out.println(y21);
			} catch (Exception e) {
				//System.out.println("no element2");
			}
			
		 	try {
		 		Thread.sleep(4000);
				JavascriptExecutor js231 = (JavascriptExecutor)driver;
			   	  WebElement edi231= driver.findElement(By.xpath("//*[@id='fieldabtme']"));
			   	js231.executeScript("arguments[0].scrollIntoView(true);",edi231);
			   	
//		   		Thread.sleep(4000);
//			   	WebElement aboutme=driver.findElement(By.xpath("//*[@id='fieldabtme']"));
//				String y21=aboutme.getText();
//				System.out.println(y21);
			} catch (Exception e) {
				//System.out.println("no element3");
			}
			
			Thread.sleep(4000);
			BaseTest.click(rp.getContinuebutton3());
			
			Thread.sleep(13000);
			
			//bodytype
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select body type of the bride')]")).getText();
				assertEquals("Select body type of the bride",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select body type of the groom')]")).getText();
				assertEquals("Select body type of the groom",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			//weight
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select weight of the bride')]")).getText();
				assertEquals("Select weight of the bride",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select weight of the groom')]")).getText();
				assertEquals("Select weight of the groom",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			//complexion
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select complexion of the bride')]")).getText();
				assertEquals("Select complexion of the bride",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select complexion of the groom')]")).getText();
				assertEquals("Select complexion of the groom",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			//college/institution
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Enter college / institution the bride attended')]")).getText();
				assertEquals("Enter college / institution the bride attended",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Enter college / institution the groom attended')]")).getText();
				assertEquals("Enter college / institution the groom attended",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			//star
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select star of the bride')]")).getText();
				assertEquals("Select star of the bride",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select star of the groom')]")).getText();
				assertEquals("Select star of the groom",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			//raasi
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select raasi of the bride')]")).getText();
				assertEquals("Select raasi of the bride",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select raasi of the groom')]")).getText();
				assertEquals("Select raasi of the groom",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			//gothram
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Enter gothram of the bride')]")).getText();
				assertEquals("Enter gothram of the bride",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Enter gothram of the groom')]")).getText();
				assertEquals("Enter gothram of the groom",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			//dosham
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select dosham of the bride')]")).getText();
				assertEquals("Select dosham of the bride",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select dosham of the groom')]")).getText();
				assertEquals("Select dosham of the groom",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			//time of  birth
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select bride's time of birth')]")).getText();
				assertEquals("Select bride's time of birth",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select groom's time of birth')]")).getText();
				assertEquals("Select groom's time of birth",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			//country of birth
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select bride's country of birth')]")).getText();
				assertEquals("Select bride's country of birth",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select groom's country of birth')]")).getText();
				assertEquals("Select groom's country of birth",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			//state of birth
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select bride's state of birth')]")).getText();
				assertEquals("Select bride's state of birth",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select groom's state of birth')]")).getText();
				assertEquals("Select groom's state of birth",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			//city of birth
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select bride's city of birth')]")).getText();
				assertEquals("Select bride's city of birth",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select groom's city of birth')]")).getText();
				assertEquals("Select groom's city of birth",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			//chart style
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select chart style preference')]")).getText();
				assertEquals("Select chart style preference",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='BODYTYPE']")).click();
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 23)+"')]")));
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 24)+"')]")));
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 25)+"')]")));
//			
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 26)+"')]")));
//			
			
			
			
			//college///
			Thread.sleep(4000);
			WebElement coll=driver.findElement(By.xpath("//*[@id='COLLEGEINSTITUTION']"));
			coll.sendKeys("anna university");
		
		
			Thread.sleep(4000);
			BaseTest.click(rp.getEatinghabit());
			
			Thread.sleep(4000);
			BaseTest.click(rp.getDrinkinghabit());
			
			Thread.sleep(4000);
			BaseTest.click(rp.getSmokinghabit());
			
			
			
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 30)+"')]")));
	
		
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 31)+"')]")));
	
//			Thread.sleep(4000);
//			BaseTest.click(rp.getGothra());
//			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 29)+"')]")));
//		
			
			Thread.sleep(4000);
			WebElement gothra=driver.findElement(By.xpath("//*[@id='GOTHRA_TXT']"));
			gothra.sendKeys("siva");
			
			
			Thread.sleep(4000);
			BaseTest.click(rp.getDosham());
		
			Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id='Sarpa Dosh']")).click();
			

			Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span/span[2]")).click();
			
            //horscope//
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id='dw_set']")).click();
            
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 35)+"')]")));
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 36)+"')]")));
			
			//chart style
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='chartstyle']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 37)+"')]")));
			
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 38)+"')]")));
			
			Thread.sleep(4000);
			BaseTest.click(rp.getContinuebutton3());
			

			//page 5
			//hobbies
			
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select the hobbies of the bride')]")).getText();
				assertEquals("Select the hobbies of the bride",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select the hobbies of the groom')]")).getText();
				assertEquals("Select the hobbies of the groom",casdiv, "Passed");
				
			} catch (Exception e) {
						
			}
			//interests
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select the interests of the bride')]")).getText();
				assertEquals("Select the interests of the bride",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select the interests of the groom')]")).getText();
				assertEquals("Select the interests of the groom",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			//preferred movies
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select the preferred movies genre of the bride')]")).getText();
				assertEquals("Select the preferred movies genre of the bride",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select the preferred movies genre of the groom')]")).getText();
				assertEquals("Select the preferred movies genre of the groom",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			//sport fitness activity
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select the fitness activity of the bride')]")).getText();
				assertEquals("Select the fitness activity of the bride",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select the fitness activity of the groom')]")).getText();
				assertEquals("Select the fitness activity of the groom",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			//favourite cuisine
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select the favourite cuisine of the bride')]")).getText();
				assertEquals("Select the favourite cuisine of the bride",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select the favourite cuisine of the groom')]")).getText();
				assertEquals("Select the favourite cuisine of the groom",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			//preferred dress style
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select the preferred dress style of the bride')]")).getText();
				assertEquals("Select the preferred dress style of the bride",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select the preferred dress style of the groom')]")).getText();
				assertEquals("Select the preferred dress style of the groom",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			//spoken languages
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select the languages spoken by the bride')]")).getText();
				assertEquals("Select the languages spoken by the bride",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			try {
				String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select the languages spoken by the groom')]")).getText();
				assertEquals("Select the languages spoken by the groom",casdiv, "Passed");
				
			} catch (Exception e) {
				
			}
			
			
			
			Thread.sleep(4000);
			BaseTest.click(rp.getHobbies());
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='Cooking']")).click();
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='Computer games']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='Comedy']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='Basketball']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='Arabic']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='Casual wear']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='English']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
			

		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		

		//page6--->family informations
		// father status
		
		try {
			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select occupation of the bride’s father')]")).getText();
			assertEquals("Select occupation of the bride’s father",casdiv, "Passed");
			
		} catch (Exception e) {
			
		}
		
		try {
			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select occupation of the groom’s father')]")).getText();
			assertEquals("Select occupation of the groom’s father",casdiv, "Passed");
			
		} catch (Exception e) {
			
		}
		
		//mother status
		
		try {
			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select the mother’s status of bride')]")).getText();
			assertEquals("Select the mother’s status of bride",casdiv, "Passed");
			
		} catch (Exception e) {
			
		}
		
		try {
			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select the mother’s status of groom')]")).getText();
			assertEquals("Select the mother’s status of groom",casdiv, "Passed");
			
		} catch (Exception e) {
			
		}
		
		//no of brothers
		
		try {
			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select no. of brothers the bride has')]")).getText();
			assertEquals("Select no. of brothers the bride has",casdiv, "Passed");
			
		} catch (Exception e) {
			
		}
		
		try {
			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select no. of brothers the groom has')]")).getText();
			assertEquals("Select no. of brothers the groom has",casdiv, "Passed");
			
		} catch (Exception e) {
			
		}
		
       //no of brother married
		
		try {
			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select no. of brothers married')]")).getText();
			assertEquals("Select no. of brothers married",casdiv, "Passed");
			
		} catch (Exception e) {
			
		}
		
		//No of sister
		
		try {
			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select no. of sisters the bride has')]")).getText();
			assertEquals("Select no. of sisters the bride has",casdiv, "Passed");
			
		} catch (Exception e) {
			
		}
		
		try {
			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select no. of sisters the groom has')]")).getText();
			assertEquals("Select no. of sisters the groom has",casdiv, "Passed");
			
		} catch (Exception e) {
			
		}
		
		//no of sister married 
		try {
			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Select no. of sisters married')]")).getText();
			assertEquals("Select no. of sisters married",casdiv, "Passed");
			
		} catch (Exception e) {
			
		}
		
		//parents contact detail
		
		try {
			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Enter contact details of the bride’s parents')]")).getText();
			assertEquals("Enter contact details of the bride’s parents",casdiv, "Passed");
			
		} catch (Exception e) {
			
		}
		
		try {
			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Enter contact details of the groom’s parents')]")).getText();
			assertEquals("Enter contact details of the groom’s parents",casdiv, "Passed");
			
		} catch (Exception e) {
			
		}
		
		//native
		
		try {
			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Enter the native place of the bride')]")).getText();
			assertEquals("Enter the native place of the bride",casdiv, "Passed");
			
		} catch (Exception e) {
			
		}
		
		try {
			String casdiv=driver.findElement(By.xpath("//label[contains(text(),'Enter the native place of the groom')]")).getText();
			assertEquals("Enter the native place of the groom",casdiv, "Passed");
			
		} catch (Exception e) {
			
		}
		
	
		
		Thread.sleep(4000);
		BaseTest.click(rp.getFatherstatus());
		
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 45)+"')]")));
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 46)+"')]")));
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData1("Sheet3", 1, 47)+"')]")));
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData1("Sheet3", 1, 48)+"')]")));
		
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData1("Sheet3", 1, 49)+"')]")));
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData1("Sheet3", 1, 50)+"')]")));
		
		
		Thread.sleep(4000);
		JavascriptExecutor js25 = (JavascriptExecutor)driver;
	   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='PARENTCONTACT']"));
	   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
		Thread.sleep(4000);
		WebElement parent=driver.findElement(By.xpath("//*[@id='PARENTCONTACT']"));
		parent.sendKeys("9176800869");
		
		
		Thread.sleep(4000);
		WebElement nativ=driver.findElement(By.xpath("//*[@id='FAMILYORIGIN']"));
		nativ.sendKeys("chennai");
		
		
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton3()); 
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			

//			Thread.sleep(4000);
//			BaseTest.click(rp.getStar());
//			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 19)+"')]")));
//			
//			try {
//				Thread.sleep(4000);
//				JavascriptExecutor js25 = (JavascriptExecutor)driver;
//			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='RAASI']"));
//			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
//				Thread.sleep(4000);
//				BaseTest.click(rp.getRaasi());
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 20)+"')]")));
//				
//			} catch (Exception e) {
//				//System.out.println("no Rassi 1");
//			}
//			
//			try {
//				Thread.sleep(4000);
//				JavascriptExecutor js25 = (JavascriptExecutor)driver;
//			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='CBSRegistration4']/fieldset[2]/div"));
//			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
//				driver.findElement(By.xpath("//*[@id='CBSRegistration4']/fieldset[2]/div")).click();
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 20)+"')]")));
//			} catch (Exception e) {
//				//System.out.println("no raasi 2");
//			}
//			
//			try {
//				Thread.sleep(4000);
//				JavascriptExecutor js25 = (JavascriptExecutor)driver;
//			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='CBSRegistration4']/fieldset[2]/div/div"));
//			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='CBSRegistration4']/fieldset[2]/div/div")).click();
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 20)+"')]")));
//				
//			} catch (Exception e) {
//				//System.out.println("no raasi3");
//			}
//			
//			
//			
//			Thread.sleep(4000);
//			WebElement gothra=driver.findElement(By.xpath("//*[@id='GOTHRA_TXT']"));
//			gothra.sendKeys("siva");
//			
//			BaseTest.click(rp.getDhosam());
//			
//			BaseTest.click(rp.getTimeofbirth());
//			driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[1]")).click();
//			
//			BaseTest.click(rp.getCountryofbirth());
//			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 21)+"')]")));
//			
//			try {
//				Thread.sleep(4000);
//				JavascriptExecutor js25 = (JavascriptExecutor)driver;
//			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='BirthStateDisplay']/fieldset/div"));
//			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
//				BaseTest.click(rp.getStateofbirth());
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 22)+"')]")));
//			} catch (Exception e) {
//				//System.out.println("no state1");
//			}
//			try {
//				Thread.sleep(4000);
//				JavascriptExecutor js25 = (JavascriptExecutor)driver;
//			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='BIRTHSTATE']"));
//			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
//			   	driver.findElement(By.xpath("//*[@id='BIRTHSTATE']")).click();
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 22)+"')]")));
//				
//			} catch (Exception e) {
//				//System.out.println("no state 2");
//			}
//			try {
//				Thread.sleep(4000);
//				JavascriptExecutor js25 = (JavascriptExecutor)driver;
//			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='BirthStateDisplay']/fieldset/div/div"));
//			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
//				driver.findElement(By.xpath("//*[@id='BirthStateDisplay']/fieldset/div/div")).click();
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 22)+"')]")));
//				
//			} catch (Exception e) {
//				//System.out.println("no state 3");
//			}
//			
//			try {
//				Thread.sleep(4000);
//				JavascriptExecutor js25 = (JavascriptExecutor)driver;
//			   	  WebElement edi25= driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div)[1]"));
//			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
//			   	BaseTest.click(rp.getCityofbirth());
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 23)+"')]")));
//				
//			} catch (Exception e) {
//				//System.out.println("no city 1");
//			}
//			
//			try {
//				Thread.sleep(4000);
//				JavascriptExecutor js25 = (JavascriptExecutor)driver;
//			   	  WebElement edi25= driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div)[1]"));
//			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
//			   	driver.findElement(By.xpath("//*[@id='BIRTHCITY']")).click();
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 23)+"')]")));
//				
//			} catch (Exception e) {
//				//System.out.println("no city 2");
//			}
//			
//			try {
//				Thread.sleep(4000);
//				JavascriptExecutor js25 = (JavascriptExecutor)driver;
//			   	  WebElement edi25= driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div/div)[1]"));
//			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
//			   	driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div/div)[1]")).click();
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 23)+"')]")));
//				
//			} catch (Exception e) {
//				//System.out.println("no city 3");
//			}
//			
//			try {
//				Thread.sleep(4000);
//				JavascriptExecutor js25 = (JavascriptExecutor)driver;
//			   	  WebElement edi25= driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div)[2]"));
//			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
//				BaseTest.click(rp.getChartstyle());
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 24)+"')]")));
//				
//				
//			} catch (Exception e) {
//				//System.out.println("no chartstyle1");
//			}
//			
//			try {
//				Thread.sleep(4000);
//				JavascriptExecutor js25 = (JavascriptExecutor)driver;
//			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='chartstyle']"));
//			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
//				driver.findElement(By.xpath("//*[@id='chartstyle']")).click();
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 24)+"')]")));
//				
//				
//			} catch (Exception e) {
//				//System.out.println("no chartstyle2");
//			}
//			
//			try {
//				Thread.sleep(4000);
//				JavascriptExecutor js25 = (JavascriptExecutor)driver;
//			   	  WebElement edi25= driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div)[2]"));
//			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
//				driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div)[2]")).click();
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 24)+"')]")));
//				
//				
//			} catch (Exception e) {
//				//System.out.println("no chartstyle3");
//			}
//			
//			Thread.sleep(4000);
//			BaseTest.click(rp.getContinuebutton());
//			
//			
//			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
	
	
	
	
	
	
	
	
}           