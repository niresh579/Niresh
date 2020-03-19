package Logic;

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

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import pom.StageRegistrationPom;

public class StageRegistration extends BaseTest {
	public static WebDriver driver;
	String driverExecutablePath= "C:\\Users\\CBS Testing\\workspace\\Niresh\\Negative\\drivernew\\chromedriver.exe";

	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		Map<String, String> mobileEmulation= new HashMap<String,String>();
		mobileEmulation.put("deviceName", "Pixel 2");
		
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        chromeOptions.addArguments("--disable-notifications");
        driver = new ChromeDriver(chromeOptions);
       
        
//        ExtentReports report;
//        ExtentTest logger;
//        private String reportDirectory = "reports";
//        private String reportFormat = "xml";
//        private String testName = "Untitled";
//        protected AndroidDriver<AndroidElement> driver = null;
//
//        DesiredCapabilities dc = new DesiredCapabilities();
//        
//        @BeforeTest
//        public void setUp() throws MalformedURLException {
//        	   dc.setCapability("reportDirectory", reportDirectory);
//               dc.setCapability("reportFormat", reportFormat);
//               dc.setCapability("testName", testName);
//               dc.setCapability(MobileCapabilityType.UDID, "ZDHUTW49BMOZAU8T");
//               dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
//               dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
//               driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
//               driver.setLogLevel(Level.INFO);


        
	}
	
	@Test
	public void test() throws Throwable {
		StageRegistrationPom rp=new StageRegistrationPom(driver);
		Thread.sleep(4000);
		driver.get("https://mstage.communitymatrimony.com/cbsmob/registration/register.php");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			
		
		Thread.sleep(4000);
		BaseTest.click(rp.getCommunity());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		Thread.sleep(4000);
		 BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 0)+"')]")));
		
		 
		Thread.sleep(4000);
		BaseTest.click(rp.getProfilecreatedfor());
		
		Thread.sleep(4000);
		BaseTest.click(rp.getGender());

		
		Thread.sleep(4000);
		WebElement e111=driver.findElement(By.xpath("//*[@id='USERNAME1']"));
		Actions a111=new Actions(driver);
		Thread.sleep(4000);
		a111.sendKeys(e111,"Lalli").build().perform();
	   
		Thread.sleep(4000);
		BaseTest.click(rp.getDob());
		Thread.sleep(4000);
		//BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData1("Sheet3", 1, 25)+"')]")));
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[1]")).click();
		
		
		Thread.sleep(4000);
		Actions acc1 = new Actions(driver);
		WebElement mail1=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
		acc1.doubleClick(mail1).perform();	
		
		Thread.sleep(4000);
		WebElement mail=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
		mail.sendKeys("st"+ (Math.floor(Math.random() * 1478) + "@gmail.com"));
		
		
		Thread.sleep(4000);
		WebElement pass111=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
		pass111.clear();
		pass111.sendKeys("cbstest");
		
		
		Thread.sleep(4000);
		BaseTest.click(rp.getIsdcode());
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		Thread.sleep(4000);
		 BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 1)+"')]")));
		
			
			Thread.sleep(4000);
			WebElement mobile=driver.findElement(By.xpath("//*[@id='CONTACTNO']"));
			mobile.sendKeys("9176800869");
			
			Thread.sleep(5000);
			BaseTest.click(rp.getMothertongue());
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 4)+"')]")));
			
			
//			Thread.sleep(7000);
//			BaseTest.click(rp.getReligion());
//		
		
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 2)+"')]")));
			
			 
			Thread.sleep(4000);
			try {
				 Thread.sleep(8000);
				   	JavascriptExecutor js41 = (JavascriptExecutor)driver;
				   	  WebElement edi41= driver.findElement(By.xpath("//*[@id='subcastesleect']"));
					  	  js41.executeScript("arguments[0].scrollIntoView(true);",edi41);
				BaseTest.click(rp.getSubcaste());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 3)+"')]")));
			} catch (Exception e) {
				System.out.println("no element1");
			}
			Thread.sleep(4000);
			try {
				 Thread.sleep(8000);
				   	JavascriptExecutor js41 = (JavascriptExecutor)driver;
				   	  WebElement edi41= driver.findElement(By.xpath("(//*[@id='SUBCASTE'])[1]"));
					  	  js41.executeScript("arguments[0].scrollIntoView(true);",edi41);
//				driver.findElement(By.xpath("(//*[@id='SUBCASTE'])[1]")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 3)+"')]")));
			} catch (Exception e) {
				System.out.println("no element 2");
			}
			
			 
			Thread.sleep(8000);
		   	JavascriptExecutor js41 = (JavascriptExecutor)driver;
		   	  WebElement edi41= driver.findElement(By.xpath("//*[@id='continuebutton']"));
			  	  js41.executeScript("arguments[0].scrollIntoView(true);",edi41);
			 
			  	  Thread.sleep(4000);
			BaseTest.click(rp.getContinuebutton());
			
			/////////page2////////////
			

			Thread.sleep(4000);
			BaseTest.click(rp.getMaritalstatus());
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getNoofchild());
				
			} catch (Exception e) {
				System.out.println("no child");
			}
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getChildlivingwith());
			
			} catch (Exception e) {
				System.out.println("no living status");
			}
			
//			
//			Thread.sleep(4000);
//			Actions acc11 = new Actions(driver);
//			WebElement mail11=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
//			acc11.doubleClick(mail11).perform();
//			Thread.sleep(4000);
//			WebElement mail111=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
//			mail111.sendKeys("st"+ (Math.floor(Math.random() * 1478) + "@gmail.com"));
//			
			
//				driver.findElement(By.xpath("//*[@id='COUNTRYLIVING']")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 5)+"')]")));
				
			
			
			
		try {
			Thread.sleep(4000);

		//BaseTest.click(rp.getResidingstate());
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 6)+"')]")));
		} catch (Exception e) {
			System.out.println("no exception");
		}
			
			try {
				Thread.sleep(4000);
				WebElement ref=driver.findElement(By.xpath("//*[@id='RESIDINGSTATETXT']"));
				ref.sendKeys(BaseTest.getExcelData("Sheet3", 1, 6));
			} catch (Exception e) {
				System.out.println("no exceptions");
			}
			
			
			
			try {
				Thread.sleep(4000);
				//BaseTest.click(rp.getResidingcity());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 7)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no exception");
			}
			
			try {	
				Thread.sleep(4000);
				WebElement ref1=driver.findElement(By.xpath("//*[@id='RESIDINGCITYTEXT']"));
				ref1.sendKeys(BaseTest.getExcelData("Sheet3", 1, 7));
				
			} catch (Exception e) {
				System.out.println("no exception");
			}
			
			//citizenship
			
			try {
				Thread.sleep(4000);

				BaseTest.click(rp.getCitizenship());
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 8)+"')]")));
			} catch (Exception e) {
				System.out.println("no exception");
			}
			//residing status
			try {
				 Thread.sleep(8000);
				   	JavascriptExecutor js411 = (JavascriptExecutor)driver;
				   	  WebElement edi411= driver.findElement(By.xpath("//*[@id='home-footer']/div[1]"));
					  	  js411.executeScript("arguments[0].scrollIntoView(true);",edi411);
				BaseTest.click(rp.getContinuebutton2());
				WebElement residingcity1=driver.findElement(By.xpath("//*[@id='Resident_status']/fieldset/div[2]"));
				String p1=residingcity1.getText();
				System.out.println(p1);	
				
			} catch (Exception e) {
				System.out.println("no residing status");
			}
			
			try {
				Thread.sleep(4000);

				BaseTest.click(rp.getResidingstatus());
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 9)+"')]")));
			} catch (Exception e) {
				System.out.println("no exception");
			}
			
//			 Thread.sleep(8000);
//			   	JavascriptExecutor js5 = (JavascriptExecutor)driver;
//			   	  WebElement edi5= driver.findElement(By.xpath("//*[@id='home-footer']/div[1]"));
//				  	  js5.executeScript("arguments[0].scrollIntoView(true);",edi5);
//			BaseTest.click(rp.getContinuebutton2());
//			
			////////////page3///////////
			
			
//			Thread.sleep(4000);
//			BaseTest.click(rp.getHeight());
//			Thread.sleep(5000);
//	        List<WebElement> heigt = driver.findElements(By.xpath("//div[@class='dww dwrc']//ul//li"));
//	        int z = heigt.size();
//	        System.out.println(z);
//
//	        for (int x = 0; x <=22; x++) {
//
//	        //    heigt.get(i).sendKeys("4 ft 2 in / 127 cm");
//    Actions mn= new Actions(driver);
//	mn.moveToElement(heigt.get(x)).click().build().perform();
//	                Thread.sleep(1000);
//	           /*    actions.click();
//	        //      actions.sendKeys(" ");
//	                actions.build().perform();*/
//
//	        } 
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[1]")).click();
			
			
			
			Thread.sleep(4000);
		//	BaseTest.click(rp.getEducation());
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 10)+"')]")));
			
			
			Thread.sleep(4000);
			//BaseTest.click(rp.getEmployedinworking());
			
			
			try {
				Thread.sleep(4000);
				//BaseTest.click(rp.getEmployedin());
				
				//BaseTest.click(rp.getOccupation());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 11)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no exception");
			}
			
			try {
				Thread.sleep(4000);
				//BaseTest.click(rp.getEmployedinworking());
				
				//BaseTest.click(rp.getOccupation());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 12)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no exception");
			}
			
			
//		
//				Thread.sleep(4000);
//				//BaseTest.click(rp.getRs());
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 13)+"')]")));
				
				Thread.sleep(4000);
				///BaseTest.click(rp.getIncome());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 14)+"')]")));
					

			
			
//			try {
//			
//				Thread.sleep(4000);
//				//BaseTest.click(rp.getRs());
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
//			
			
			
			Thread.sleep(4000);
			BaseTest.click(rp.getPhysicalstatus());
			
			
			Thread.sleep(5000);
			BaseTest.click(rp.getFamilystatus());		
			Thread.sleep(5000);
			BaseTest.click(rp.getFamilytype());
			
//			Thread.sleep(5000);
//			BaseTest.click(rp.getFamilyvalues());
//			
			
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
				System.out.println("no ethinicity");
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
				System.out.println("no religiousvalue");
			}
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getDressofmodestry());
			} catch (Exception e2) {
				System.out.println("no dress of modestry");
			}
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getReadquran());
			} catch (Exception e2) {
				System.out.println("no Read quran");
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
			   	
		   		Thread.sleep(4000);
			   	WebElement aboutme=driver.findElement(By.id("ABOUTME"));
				String y21 = aboutme.getText();
			System.out.println(y21);
				
				System.out.println(y21);
			} catch (Exception e) {
				System.out.println("no element1");
			}
		   		
			try {
				Thread.sleep(4000);
				JavascriptExecutor js231 = (JavascriptExecutor)driver;
			   	  WebElement edi231= driver.findElement(By.xpath("//*[@id='fieldabtme']/div[2]"));
			   	js231.executeScript("arguments[0].scrollIntoView(true);",edi231);
			   	
		   		Thread.sleep(4000);
			   	WebElement aboutme=driver.findElement(By.xpath("//*[@id='fieldabtme']/div[2]"));
				String y21=aboutme.getText();
				System.out.println(y21);
			} catch (Exception e) {
				System.out.println("no element2");
			}
			
		 	try {
		 		Thread.sleep(4000);
				JavascriptExecutor js231 = (JavascriptExecutor)driver;
			   	  WebElement edi231= driver.findElement(By.xpath("//*[@id='fieldabtme']"));
			   	js231.executeScript("arguments[0].scrollIntoView(true);",edi231);
			   	
		   		Thread.sleep(4000);
			   	WebElement aboutme=driver.findElement(By.xpath("//*[@id='fieldabtme']"));
				String y21=aboutme.getText();
				System.out.println(y21);
			} catch (Exception e) {
				System.out.println("no element3");
			}
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getStar());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 19)+"')]")));
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='RAASI']"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
				Thread.sleep(4000);
				BaseTest.click(rp.getRaasi());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 20)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no Rassi 1");
			}
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='CBSRegistration4']/fieldset[2]/div"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
				driver.findElement(By.xpath("//*[@id='CBSRegistration4']/fieldset[2]/div")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 20)+"')]")));
			} catch (Exception e) {
				System.out.println("no raasi 2");
			}
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='CBSRegistration4']/fieldset[2]/div/div"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id='CBSRegistration4']/fieldset[2]/div/div")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 20)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no raasi3");
			}
			
			
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
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='BirthStateDisplay']/fieldset/div"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
				BaseTest.click(rp.getStateofbirth());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 22)+"')]")));
			} catch (Exception e) {
				System.out.println("no state1");
			}
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='BIRTHSTATE']"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
			   	driver.findElement(By.xpath("//*[@id='BIRTHSTATE']")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 22)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no state 2");
			}
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='BirthStateDisplay']/fieldset/div/div"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
				driver.findElement(By.xpath("//*[@id='BirthStateDisplay']/fieldset/div/div")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 22)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no state 3");
			}
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div)[1]"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
			   	BaseTest.click(rp.getCityofbirth());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 23)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no city 1");
			}
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div)[1]"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
			   	driver.findElement(By.xpath("//*[@id='BIRTHCITY']")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 23)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no city 2");
			}
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div/div)[1]"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
			   	driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div/div)[1]")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 23)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no city 3");
			}
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div)[2]"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
				BaseTest.click(rp.getChartstyle());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 24)+"')]")));
				
				
			} catch (Exception e) {
				System.out.println("no chartstyle1");
			}
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='chartstyle']"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
				driver.findElement(By.xpath("//*[@id='chartstyle']")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 24)+"')]")));
				
				
			} catch (Exception e) {
				System.out.println("no chartstyle2");
			}
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div)[2]"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
				driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div)[2]")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 24)+"')]")));
				
				
			} catch (Exception e) {
				System.out.println("no chartstyle3");
			}
			
			Thread.sleep(4000);
			BaseTest.click(rp.getContinuebutton());
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}}		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		

