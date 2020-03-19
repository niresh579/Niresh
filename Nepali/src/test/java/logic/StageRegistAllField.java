package logic;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pom.BaseTest;
import pom.StageRegistAllFieldPOM;

public class StageRegistAllField extends BaseTest {
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
       
//      ExtentReports report;
//      ExtentTest logger;
//      private String reportDirectory = "reports";
//      private String reportFormat = "xml";
//      private String testName = "Untitled";
//      protected AndroidDriver<AndroidElement> driver = null;
//
//      DesiredCapabilities dc = new DesiredCapabilities();
//      
//      @BeforeTest
//      public void setUp() throws MalformedURLException {
//      	   dc.setCapability("reportDirectory", reportDirectory);
//             dc.setCapability("reportFormat", reportFormat);
//             dc.setCapability("testName", testName);
//             dc.setCapability(MobileCapabilityType.UDID, "ZDHUTW49BMOZAU8T");
//             dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
//             dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
//             driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
//             driver.setLogLevel(Level.INFO);

        
	}
	
	@Test
	public void test() throws Throwable {
		StageRegistAllFieldPOM rp=new StageRegistAllFieldPOM(driver);
		Thread.sleep(4000);
		 logger =  report.startTest("Nepali Registration");
		driver.get("https://m.nepalimatrimony.com/cbsmob/registration/register.php");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		 logger.log(LogStatus.PASS, "URL Launched Successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			
		
//		Thread.sleep(4000);
//		BaseTest.click(rp.getCommunity());
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//		Thread.sleep(4000);
//		 BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 0)+"')]")));
//		
		 
		Thread.sleep(4000);
		BaseTest.click(rp.getProfilecreatedfor());
		logger.log(LogStatus.PASS, " Entered Profilecreatedfor");
		
		Thread.sleep(4000);
		WebElement e111=driver.findElement(By.xpath("//*[@id='USERNAME1']"));
		Actions a111=new Actions(driver);
		Thread.sleep(4000);
		a111.sendKeys(e111,"Lalli").build().perform();
	   
		Thread.sleep(4000);
		BaseTest.click(rp.getGender());
		logger.log(LogStatus.PASS, " Entered Gender");
		
		Thread.sleep(4000);
		BaseTest.click(rp.getDob());
		Thread.sleep(4000);
		//BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData1("Sheet3", 1, 25)+"')]")));
		logger.log(LogStatus.PASS, " Entered DOB");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[1]")).click();
		

		Thread.sleep(4000);
		WebElement pass111=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
		pass111.clear();
		pass111.sendKeys("cbstest");
		
		logger.log(LogStatus.PASS, " Entered Password");
		
//		Thread.sleep(4000);
//		Actions acc1 = new Actions(driver);
//		WebElement mail1=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
//		acc1.doubleClick(mail1).perform();
//		Thread.sleep(4000);
//		WebElement mail=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
//		mail.sendKeys("st"+ (Math.floor(Math.random() * 1478) + "@gmail.com"));
//		
		
		
		Thread.sleep(4000);
		BaseTest.click(rp.getIsdcode());
		logger.log(LogStatus.PASS, " Entered ISD Code");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		Thread.sleep(4000);
		 BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 6)+"')]")));
		
			
			Thread.sleep(4000);
			WebElement mobile=driver.findElement(By.xpath("//*[@id='CONTACTNO']"));
			mobile.sendKeys("8015766715");
			logger.log(LogStatus.PASS, " Entered Contact Number");
			Thread.sleep(5000);
			BaseTest.click(rp.getMothertongue());
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 8)+"')]")));
			
			
//			Thread.sleep(7000);
//			BaseTest.click(rp.getReligion());
//		
		try {
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 9)+"')]")));
	
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		try {
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 10)+"')]")));
	
		} catch (Exception e) {
			// TODO: handle exception
		}
		logger.log(LogStatus.PASS, " Entered Religion");
		
//			 
//			Thread.sleep(4000);
//			try {
//				 Thread.sleep(8000);
//				   	JavascriptExecutor js41 = (JavascriptExecutor)driver;
//				   	  WebElement edi41= driver.findElement(By.xpath("//*[@id='subcastesleect']"));
//					  	  js41.executeScript("arguments[0].scrollIntoView(true);",edi41);
//				BaseTest.click(rp.getSubcaste());
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 10)+"')]")));
//			} catch (Exception e) {
//				System.out.println("no element1");
//			}		
//			Thread.sleep(4000);
//			try {
//				 Thread.sleep(8000);
//				   	JavascriptExecutor js41 = (JavascriptExecutor)driver;
//				   	  WebElement edi41= driver.findElement(By.xpath("(//*[@id='SUBCASTE'])[1]"));
//					  	  js41.executeScript("arguments[0].scrollIntoView(true);",edi41);
////				driver.findElement(By.xpath("(//*[@id='SUBCASTE'])[1]")).click();
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 10)+"')]")));
//			} catch (Exception e) {
//				System.out.println("no element 2");
//			}
			
			 
			Thread.sleep(8000);
		   	JavascriptExecutor js41 = (JavascriptExecutor)driver;
		   	  WebElement edi41= driver.findElement(By.xpath("//*[@id='continuebutton']"));
			  	  js41.executeScript("arguments[0].scrollIntoView(true);",edi41);
			 
			  	  Thread.sleep(4000);
			BaseTest.click(rp.getContinuebutton());
			
			
			
		try {
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='details-button']")).click();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='proceed-link']")).click();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			//////page2////////////
			

			Thread.sleep(4000);
			BaseTest.click(rp.getMaritalstatusdivorced());
			logger.log(LogStatus.PASS, " Entered Marital Status");
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
//			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[3]")).click();
//			
//			
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[1]")).click();

			
			
					
					Thread.sleep(4000);
					Actions acc11 = new Actions(driver);
					WebElement mail11=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
					acc11.doubleClick(mail11).perform();
					Thread.sleep(4000);
					WebElement mail111=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
					mail111.sendKeys("st"+ (Math.floor(Math.random() * 1478) + "@gmail.com"));
					
			
				driver.findElement(By.xpath("//*[@id='COUNTRYLIVING']")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 14)+"')]")));
				
			
				logger.log(LogStatus.PASS, " Entered Country Living");
			
		try {
			Thread.sleep(4000);

		BaseTest.click(rp.getResidingstate());
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 15)+"')]")));
		} catch (Exception e) {
			System.out.println("no exception");
		}
		logger.log(LogStatus.PASS, " Entered Residing State");
//			try {
//				Thread.sleep(4000);
//				WebElement ref=driver.findElement(By.xpath("//*[@id='RESIDINGSTATETXT']"));
//				ref.sendKeys(BaseTest.getExcelData("Sheet3", 1, 6));
//			} catch (Exception e) {
//				System.out.println("no exceptions");
//			}
//			
			
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getResidingcity());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 16)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no exception");
			}
			logger.log(LogStatus.PASS, " Entered Residing City");
//			try {	
//				Thread.sleep(4000);
//				WebElement ref1=driver.findElement(By.xpath("//*[@id='RESIDINGCITYTEXT']"));
//				ref1.sendKeys(BaseTest.getExcelData("Sheet3", 1, 7));
//				
//			} catch (Exception e) {
//				System.out.println("no exception");
//			}
			
			//citizenship
			
//			try {
//				Thread.sleep(4000);
//
//				BaseTest.click(rp.getCitizenship());
//			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 8)+"')]")));
//			} catch (Exception e) {
//				System.out.println("no exception");
//			}
//			//residing status
//			try {
//				 Thread.sleep(8000);
//				   	JavascriptExecutor js411 = (JavascriptExecutor)driver;
//				   	  WebElement edi411= driver.findElement(By.xpath("//*[@id='home-footer']/div[1]"));
//					  	  js411.executeScript("arguments[0].scrollIntoView(true);",edi411);
//				BaseTest.click(rp.getContinuebutton2());
//				WebElement residingcity1=driver.findElement(By.xpath("//*[@id='Resident_status']/fieldset/div[2]"));
//				String p1=residingcity1.getText();
//				System.out.println(p1);	
//				
//			} catch (Exception e) {
//				System.out.println("no residing status");
//			}
//			
			try {
				Thread.sleep(4000);

				BaseTest.click(rp.getResidingstatus());
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"list_view_detail\"]/li[2]")).click();
		
//			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 2, 9)+"')]")));
			} catch (Exception e) {
				System.out.println("no exception");
			}
			
			 Thread.sleep(8000);
			   	JavascriptExecutor js5 = (JavascriptExecutor)driver;
			   	  WebElement edi5= driver.findElement(By.xpath("//*[@id=\"continuebutton\"]"));
				  	  js5.executeScript("arguments[0].scrollIntoView(true);",edi5);
			BaseTest.click(rp.getContinuebutton2());
			
			////////////page3///////////
			
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
			logger.log(LogStatus.PASS, " Entered Height");
			Thread.sleep(4000);
			BaseTest.click(rp.getPhysicalstatus());
			
			
			Thread.sleep(4000);
			BaseTest.click(rp.getEducation());
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 18)+"')]")));
			logger.log(LogStatus.PASS, " Entered Education");
			
			Thread.sleep(8000);
		   	JavascriptExecutor js51 = (JavascriptExecutor)driver;
		   	  WebElement edi51= driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[4]/div[2]/div/div/div[2]/label"));
			  	  js51.executeScript("arguments[0].scrollIntoView(true);",edi51);
			
			
			driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[4]/div[2]/div/div/div[2]/label")).click();
//			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 19)+"')]")));
//			
			
			
			
			Thread.sleep(8000);
		   	JavascriptExecutor js511 = (JavascriptExecutor)driver;
		   	  WebElement edi511= driver.findElement(By.xpath("//*[@id='OCCUPATION']"));
			  	  js511.executeScript("arguments[0].scrollIntoView(true);",edi511);
//			Thread.sleep(4000);
//			BaseTest.click(rp.getEmployedinworking());
//			
		
				Thread.sleep(4000);
				//BaseTest.click(rp.getEmployedin());
				
				BaseTest.click(rp.getOccupation());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 20)+"')]")));
				logger.log(LogStatus.PASS, " Entered Occupation");
			
			
//			try {
//				Thread.sleep(4000);
//				//BaseTest.click(rp.getEmployedinworking());
//				
//				//BaseTest.click(rp.getOccupation());
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 12)+"')]")));
//				
//			} catch (Exception e) {
//				System.out.println("no exception");
//			}
			
			
//		
//				Thread.sleep(4000);
//				//BaseTest.click(rp.getRs());
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 13)+"')]")));
				
				Thread.sleep(4000);
				BaseTest.click(rp.getIncome());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 22)+"')]")));
					
				logger.log(LogStatus.PASS, " Entered Income");
			
			
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
				
			
				logger.log(LogStatus.PASS, " Handliong Other Intermediate Subtasks");	
			Thread.sleep(5000);
			BaseTest.click(rp.getFamilystatus());		
			Thread.sleep(5000);
			BaseTest.click(rp.getFamilytype());
			
			Thread.sleep(5000);
			BaseTest.click(rp.getFamilyvalues());
			
			
//		   	///muslim matri
//		   	
//		   	try {
//				Thread.sleep(4000);
//				BaseTest.click(rp.getEthinicity());
//				
//				Thread.sleep(4000);
//				Actions acc921 = new Actions(driver);
//				WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//				acc921.doubleClick(ma41).perform();
//
//				Thread.sleep(6000);
//				
//				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 16)+"')]")));
//				
//			} catch (Exception e2) {
//				System.out.println("no ethinicity");
//			}
//
//			try {
//				Thread.sleep(4000);
//			    BaseTest.click(rp.getReligiousvalue());
//				
//				Thread.sleep(4000);
//				Actions acc921 = new Actions(driver);
//				WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//				acc921.doubleClick(ma41).perform();
//				
//				Thread.sleep(6000);
//				
//				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 17)+"')]")));
//				
//			} catch (Exception e2) {
//				System.out.println("no religiousvalue");
//			}
//			
//			try {
//				Thread.sleep(4000);
//				BaseTest.click(rp.getDressofmodestry());
//			} catch (Exception e2) {
//				System.out.println("no dress of modestry");
//			}
//			
//			try {
//				Thread.sleep(4000);
//				BaseTest.click(rp.getReadquran());
//			} catch (Exception e2) {
//				System.out.println("no Read quran");
//			}
//			
////			try {
////				Thread.sleep(4000);
////			driver.findElement(By.xpath("//*[@id='GOTHRAM']")).click();
////			Thread.sleep(4000);
////			Actions acc921 = new Actions(driver);
////			WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
////			acc921.doubleClick(ma41).perform();
////			
////			Thread.sleep(6000);
////			
////			  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 12)+"')]")));
////			
////				
////			} catch (Exception e2) {
////				System.out.println("no gothram");
////			}
//			//////muslim matri/////////
//		   	
//		   	try {
//		   
//		   		Thread.sleep(4000);
//				JavascriptExecutor js231 = (JavascriptExecutor)driver;
//			   	  WebElement edi231= driver.findElement(By.id("ABOUTME"));
//			   	js231.executeScript("arguments[0].scrollIntoView(true);",edi231);
//			   	
//		   		Thread.sleep(4000);
//			   	WebElement aboutme=driver.findElement(By.id("ABOUTME"));
//				String y21 = aboutme.getText();
//			System.out.println(y21);
//				
//				System.out.println(y21);
//			} catch (Exception e) {
//				System.out.println("no element1");
//			}
//		   		
//			try {
//				Thread.sleep(4000);
//				JavascriptExecutor js231 = (JavascriptExecutor)driver;
//			   	  WebElement edi231= driver.findElement(By.xpath("//*[@id='fieldabtme']/div[2]"));
//			   	js231.executeScript("arguments[0].scrollIntoView(true);",edi231);
//			   	
//		   		Thread.sleep(4000);
//			   	WebElement aboutme=driver.findElement(By.xpath("//*[@id='fieldabtme']/div[2]"));
//				String y21=aboutme.getText();
//				System.out.println(y21);
//			} catch (Exception e) {
//				System.out.println("no element2");
//			}
//			
//		 	try {
//		 		Thread.sleep(4000);
//				JavascriptExecutor js231 = (JavascriptExecutor)driver;
//			   	  WebElement edi231= driver.findElement(By.xpath("//*[@id='fieldabtme']"));
//			   	js231.executeScript("arguments[0].scrollIntoView(true);",edi231);
//			   	
//		   		Thread.sleep(4000);
//			   	WebElement aboutme=driver.findElement(By.xpath("//*[@id='fieldabtme']"));
//				String y21=aboutme.getText();
//				System.out.println(y21);
//			} catch (Exception e) {
//				System.out.println("no element3");
//			}
			
			Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton3());			
		
		logger.log(LogStatus.PASS, " MatriId generated Successfully");
		report.endTest(logger);
	 	
	 	report.flush();
		
//		Thread.sleep(10000);
////	    driver.findElement(By.xpath("//*[@id='verify']")).click();
////		
//	    
//	    
//	    Thread.sleep(4000);
//		try {
//			  
//			   driver.findElement(By.xpath("//*[@id='add-photo-later']/a")).click();
//			    
//		} catch (Exception e) {
//		
//		}
//	 
//		 Thread.sleep(4000);
//			try {
//				  
//				   driver.findElement(By.xpath("//*[@id='add-photo-later']")).click();
//				    
//			} catch (Exception e) {
//			
//			}
//			
//			
//			Thread.sleep(4000);
//			try {
//				  
//				   driver.findElement(By.xpath("//*[@id='skip_pp']")).click();
//				    
//			} catch (Exception e) {
//			
//			}
//			
//			
//			 Thread.sleep(4000);
//				try {
//					  
//					   driver.findElement(By.xpath("//*[@id='wap-interm-reg']/div[4]/a")).click();
//					    
//				} catch (Exception e) {
//				
//				}
//				
//				
//				Thread.sleep(4000);
//				try {
//					  
//					   driver.findElement(By.xpath("//*[@id='wap-interm-reg']/div[4]")).click();
//					    
//				} catch (Exception e) {
//				
//				}
//			
//				
//				
//				try {
//					Thread.sleep(8000);
//					driver.findElement(By.xpath("//*[@id='details-button']")).click();
//					
//				} catch (Exception e) {
//					// TODO: handle exception
//				}
//				
//				try {
//					Thread.sleep(8000);
//					driver.findElement(By.xpath("//*[@id='proceed-link']")).click();
//					
//				} catch (Exception e) {
//					// TODO: handle exception
//				}
//				
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='BODYTYPE']")).click();
//				
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 23)+"')]")));
//				
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 24)+"')]")));
//				
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 25)+"')]")));
////				
////				Thread.sleep(4000);
////				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
////				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 26)+"')]")));
////				
//				
//				
//				
//				//college///
//				Thread.sleep(4000);
//				WebElement coll=driver.findElement(By.xpath("//*[@id='COLLEGEINSTITUTION']"));
//				coll.sendKeys("anna university");
//			
//			
//				Thread.sleep(4000);
//				BaseTest.click(rp.getEatinghabit());
//				
//				Thread.sleep(4000);
//				BaseTest.click(rp.getDrinkinghabit());
//				
//				Thread.sleep(4000);
//				BaseTest.click(rp.getSmokinghabit());
//				
//				
//				
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 30)+"')]")));
//		
//			
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 31)+"')]")));
//		
////				Thread.sleep(4000);
////				BaseTest.click(rp.getGothra());
////				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
////				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 29)+"')]")));
////			
//				
//				Thread.sleep(4000);
//				WebElement gothra=driver.findElement(By.xpath("//*[@id='GOTHRA_TXT']"));
//				gothra.sendKeys("siva");
//				
//				
//				Thread.sleep(4000);
//				BaseTest.click(rp.getDosham());
//			
//				Thread.sleep(4000);
//                driver.findElement(By.xpath("//*[@id='Sarpa Dosh']")).click();
//				
//
//				Thread.sleep(4000);
//                driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span/span[2]")).click();
//				
//                //horscope//
//                Thread.sleep(4000);
//                driver.findElement(By.xpath("//*[@id='dw_set']")).click();
//                
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 34)+"')]")));
//				
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 35)+"')]")));
//				
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 36)+"')]")));
//				
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 37)+"')]")));
//				
//				Thread.sleep(4000);
//				BaseTest.click(rp.getContinuebutton3());
//				
//				Thread.sleep(4000);
//				BaseTest.click(rp.getHobbies());
//				
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='Cooking']")).click();
//				
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
//				
//				
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='Computer games']")).click();
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
//				
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='Comedy']")).click();
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
//				
//				
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='Basketball']")).click();
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
//				
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='Arabic']")).click();
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
//				
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='Casual wear']")).click();
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
//				
//				
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='English']")).click();
//				Thread.sleep(4000);
//				driver.findElement(By.xpath("//*[@id='RegPanel']/div[2]/a/span")).click();
//				
//
//			Thread.sleep(4000);
//			BaseTest.click(rp.getContinuebutton());
//			
//			Thread.sleep(4000);
//			BaseTest.click(rp.getFatherstatus());
//			
//			
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 45)+"')]")));
//			
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("StageRegist", 1, 46)+"')]")));
//			
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData1("StageRegist", 1, 47)+"')]")));
//			
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData1("StageRegist", 1, 48)+"')]")));
//			
//			
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData1("StageRegist", 1, 49)+"')]")));
//			
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
//			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData1("StageRegist", 1, 50)+"')]")));
//			
//			
//			Thread.sleep(4000);
//			JavascriptExecutor js25 = (JavascriptExecutor)driver;
//		   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='PARENTCONTACT']"));
//		   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
//			Thread.sleep(4000);
//			WebElement parent=driver.findElement(By.xpath("//*[@id='PARENTCONTACT']"));
//			parent.sendKeys("9176800869");
//			
//			
//			Thread.sleep(4000);
//			WebElement nativ=driver.findElement(By.xpath("//*[@id='FAMILYORIGIN']"));
//			nativ.sendKeys("chennai");
//			
//			
//			Thread.sleep(4000);
//			BaseTest.click(rp.getContinuebutton3()); 
//			
//			
////			Thread.sleep(5000);
////		    driver.get("https://mstage.communitymatrimony.com/cbsmob/login.php");
////		    driver.manage().window().maximize();
////		    
////		    //login
////		    WebElement f=driver.findElement(By.xpath("//*[@id='idEmail']"));
////			Actions a=new Actions(driver);
////			Thread.sleep(4000);
////			a.sendKeys(f,"Agr755166").build().perform();
////		    
////		    Thread.sleep(4000);
////		    
////		    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
////		    Thread.sleep(4000);
////			Actions b=new Actions(driver);
////			Thread.sleep(4000);
////			b.sendKeys(d,"cbstest").build().perform();
////		    
////		  Thread.sleep(4000);
////		BaseTest.click(rp.getLogin());
//		  
//		
//			try {
//				Thread.sleep(8000);
//				driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
//				
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			
//			
//		
//		try {
//			Thread.sleep(8000);
//			driver.findElement(By.xpath("//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[4]")).click(); 
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//			
//		
//		
//			Thread.sleep(4000);
//			WebElement hvb = driver.findElement(By.xpath("//div[contains(text(),'Profile created')]//following::div[1]"));
//			String profile = hvb.getText();
//			System.out.println("profile created = " + profile);
//
//			Thread.sleep(4000);
//			WebElement ab123 = driver.findElement(By.xpath("//div[contains(text(),'Name')]//following::div[1]"));
//			String name = ab123.getText();
//			System.out.println("Name = " + name);
//
//			
//
//			Thread.sleep(4000);
//			WebElement ab = driver.findElement(By.xpath("//div[contains(text(),'Gender')]//following::div[1]"));
//			String gender = ab.getText();
//			System.out.println("Gender = " + gender);
//
//			Thread.sleep(4000);
//			WebElement ab1 = driver.findElement(By.xpath("//*[@id='linktobasic_details']/div[2]/ul/li[4]/div[2]"));
//			String age = ab1.getText();
//			System.out.println("Age = " + age);
//
//			Thread.sleep(4000);
//			WebElement bc1 = driver.findElement(By.xpath("(//div[contains(text(),'Height')]//following::div[1])[1]"));
//			String height = bc1.getText();
//			System.out.println("Height = " + height);
//
//			Thread.sleep(4000);
//			WebElement bc1bc = driver.findElement(By.xpath("(//div[contains(text(),'Weight')]//following::div[1])[1]"));
//			String weight = bc1bc.getText();
//			System.out.println("Weight = " + weight);
//
//			
//			Thread.sleep(4000);
//			WebElement bc = driver.findElement(By.xpath("(//div[contains(text(),'Marital Status')]//following::div[1])[1]"));
//			String marital = bc.getText();
//			System.out.println("Marital Status = " + marital);
//			
//			Thread.sleep(4000);
//			WebElement fff = driver.findElement(By.xpath("(//div[contains(text(),'No.of Children')]//following::div[1])[1]"));
//			String noofchild = fff.getText();
//			System.out.println("No of Children = " + noofchild);
//			
//			Thread.sleep(4000);
//			WebElement fwe = driver.findElement(By.xpath("(//div[contains(text(),'Children Living Status')]//following::div[1])[1]"));
//			String childlive = fwe.getText();
//			System.out.println("Children Living With = " + childlive);
//			
//			
//			
//			
//			Thread.sleep(4000);
//			WebElement bc11 = driver.findElement(By.xpath("(//div[contains(text(),'Mother Tongue')]//following::div[1])[1]"));
//			String mother = bc11.getText();
//			System.out.println("Mother Tongue = " + mother);
//
//			Thread.sleep(4000);
//			WebElement fgg = driver.findElement(By.xpath("(//div[contains(text(),'Body Type / Complexion')]//following::div[1])[1]"));
//			String body = fgg.getText();
//			System.out.println("Body Type= " + body);
//
//			
//			
//			
//			Thread.sleep(4000);
//			WebElement bc111 = driver.findElement(By.xpath("(//div[contains(text(),'Physical Status')]//following::div[1])[1]"));
//			String physical = bc111.getText();
//			System.out.println("Physcial Status = " + physical);
//			
//			
//			try {
//				Thread.sleep(4000);
//				WebElement acig11 = driver.findElement(By.xpath("(//div[contains(text(),'Denomination')]//following::div[1])[1]"));
//				String denomination = acig11.getText();
//				System.out.println("Denomination = " + denomination);
//
//			} catch (Exception e) {
//			}
//			
//			
//			
//			try {
//				Thread.sleep(4000);
//				WebElement ac11 = driver.findElement(By.xpath("(//div[contains(text(),'Sub Caste')]//following::div[1])[1]"));
//				String subcaste = ac11.getText();
//				System.out.println("SubCaste = " + subcaste);
//
//			} catch (Exception e) {
//			}
//			
//			try {
//				Thread.sleep(4000);
//				WebElement ac11 = driver.findElement(By.xpath("(//div[contains(text(),'Division')]//following::div[1])[1]"));
//				String subcaste = ac11.getText();
//				System.out.println("SubCaste = " + subcaste);
//
//			} catch (Exception e) {
//			}
//			
//			try {
//				Thread.sleep(4000);
//				WebElement ac111 = driver.findElement(By.xpath("(//div[contains(text(),'Dosham')]//following::div[1])[1]"));
//				String dosham = ac111.getText();
//				System.out.println("Dosham = " + dosham);
//
//			} catch (Exception e) {
//			}
//			
//			
//			Thread.sleep(4000);
//			WebElement cd = driver.findElement(By.xpath("(//div[contains(text(),'Education')]//following::div[1])[1]"));
//			String education = cd.getText();
//			System.out.println("Education = " + education);
//
//			Thread.sleep(4000);
//			WebElement dff = driver.findElement(By.xpath("(//div[contains(text(),'Employed In')]//following::div[1])[1]"));
//			String emplyedin = dff.getText();
//			System.out.println("Employed in = " + emplyedin);
//
//			
//			
//			
//			Thread.sleep(4000);
//			try {
//				WebElement cd1 = driver.findElement(By.xpath("//div[contains(text(),'Occupation')]//following::div[1]"));
//				String occupation = cd1.getText();
//				System.out.println("Occupation = " + occupation);
//			} catch (Exception e) {
//		System.out.println("occupation  not specified");
//			}
//			
//
//			Thread.sleep(4000);
//			WebElement cd11 = driver.findElement(By.xpath("(//div[contains(text(),'Income')]//following::div[1])[1]"));
//			String income = cd11.getText();
//			System.out.println("Income = " + income);
//			
//			try {
//				Thread.sleep(4000);
//				WebElement de12 = driver.findElement(By.xpath("(//div[contains(text(),'Religion')]//following::div[1])[1]"));
//				String religionpi = de12.getText();
//				System.out.println("Religion = " + religionpi);
//
//			} catch (Exception e) {
//			}
//			
//		
//			
//			Thread.sleep(4000);
//			 WebElement city=driver.findElement(By.xpath("(//div[contains(text(),'City')]//following::div[1])[1]"));
//			  String city1=city.getText();
//			  System.out.println("City = "+city1);
//			  
//			  Thread.sleep(4000);
//				 WebElement state=driver.findElement(By.xpath("(//div[contains(text(),'State')]//following::div[1])[1]"));
//				  String state1=state.getText();
//				  System.out.println("State = "+state1);
//				  
//			
//			
//			Thread.sleep(4000);
//			 WebElement country=driver.findElement(By.xpath("(//div[contains(text(),'Country')]//following::div[1])[1]"));
//			  String country1=country.getText();
//			  System.out.println("Country = "+country1);
//			  
//			  Thread.sleep(4000);
//			  WebElement citizen1=driver.findElement(By.xpath("(//div[contains(text(),'Citizenship')]//following::div[1])[1]"));
//			  String citizenship1=citizen1.getText();
//			  System.out.println("Citizenship = "+citizenship1);  
//			  
//			
//				
//				Thread.sleep(4000);
//				WebElement bb = driver.findElement(By.xpath("(//div[contains(text(),'Value')]//following::div[1])[1]"));
//				String fam = bb.getText();
//				System.out.println("Family Value = " + fam);
//
//				Thread.sleep(4000);
//				WebElement cc = driver.findElement(By.xpath("(//div[contains(text(),'Family Type')]//following::div[1])[1]"));
//				String cc1 = cc.getText();
//				System.out.println("Family Type = " + cc1);
//
//				Thread.sleep(4000);
//				WebElement dd = driver.findElement(By.xpath("(//div[contains(text(),'Family Status')]//following::div[1])[1]"));
//				String dd1 = dd.getText();
//				System.out.println("Family Status = " + dd1);
//
//			
//				
//				Thread.sleep(4000);
//				WebElement ee = driver.findElement(By.xpath("(//div[contains(text(),'Father')]//following::div[1])[1]"));
//				String ee1 = ee.getText();
//				System.out.println("Father Occupation = " + ee1);
//
//				Thread.sleep(4000);
//				WebElement ff = driver.findElement(By.xpath("(//div[contains(text(),'Occupation')]//following::div[1])[3]"));
//				String ff1 = ff.getText();
//				System.out.println("Mother Occupation = " + ff1);
//
//				Thread.sleep(4000);
//				WebElement gg = driver.findElement(By.xpath("(//div[contains(text(),'Native')]//following::div[1])"));
//				String gg1 = gg.getText();
//				System.out.println("Native Place = " + gg1);
//
//			
//				
//				Thread.sleep(4000);
//				WebElement hh = driver.findElement(By.xpath("(//div[contains(text(),'Brothers')]//following::div[1])"));
//				String hh1 = hh.getText();
//				System.out.println("No of Brothers = " + hh1);
//
//
//				Thread.sleep(4000);
//				WebElement hhq = driver.findElement(By.xpath("(//div[contains(text(),'Brothers Married')]//following::div[1])"));
//				String hh1q = hhq.getText();
//				System.out.println("Brothers Married = " + hh1q);
//				
//				
//				Thread.sleep(4000);
//				WebElement ii = driver.findElement(By.xpath("(//div[contains(text(),'Sisters')]//following::div[1])"));
//				String ii1 = ii.getText();
//				System.out.println("No of Sisters = " + ii1);
//
//				
//
//				Thread.sleep(4000);
//				WebElement lk = driver.findElement(By.xpath("(//div[contains(text(),'Sisters Married')]//following::div[1])"));
//				String lk1 = lk.getText();
//				System.out.println("Sister married = " + lk1);
//				
//			
//				
//				Thread.sleep(4000);
//				WebElement de121 = driver.findElement(By.xpath("(//div[contains(text(),'Eating Habits')]//following::div[1])[1]"));
//				String eating = de121.getText();
//				System.out.println("Eating Habits = " + eating);
//
//				Thread.sleep(4000);
//				WebElement e121 = driver.findElement(By.xpath("(//div[contains(text(),'Drinking Habits')]//following::div[1])[1]"));
//				String drinking = e121.getText();
//				System.out.println("Drinking Habits = " + drinking);
//
//				Thread.sleep(4000);
//				WebElement de2121 = driver.findElement(By.xpath("(//div[contains(text(),'Smoking Habits')]//following::div[1])[1]"));
//				String smoking = de2121.getText();
//				System.out.println("Smoking Habits = " + smoking);

			
			
			
			
	}}		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	

