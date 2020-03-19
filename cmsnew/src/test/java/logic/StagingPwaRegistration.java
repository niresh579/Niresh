package logic;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTest;

import pom.StagingPwaRegistrationPOM;

public class StagingPwaRegistration extends BaseTest {
	public static WebDriver driver;
	String driverExecutablePath= "C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\drivernew2\\chromedriver.exe";

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
		StagingPwaRegistrationPOM rp= new StagingPwaRegistrationPOM(driver);
		Thread.sleep(4000);
		driver.get("https://mstage.communitymatrimony.com/cbsmob/registration/register.php");
		driver.manage().window().maximize();
		
	       	  	
		
		//////Page 1 ////////
		for (int i = 3; i <=3; i++) {

						
		Thread.sleep(4000);
		BaseTest.click(rp.getSelectcommunity());
		
//		Thread.sleep(4000);
//		BaseTest.click(rp.getSearch());
//		
		Thread.sleep(2000);
		  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 0)+"')]")));
		
		
		Thread.sleep(4000);
		BaseTest.click(rp.getProfilecreatedfor());
		
		Thread.sleep(4000);
		WebElement e=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[3]"));
		Actions a=new Actions(driver);
		Thread.sleep(4000);
		a.sendKeys(e,"Banu").build().perform();
	   
		Thread.sleep(4000);
		BaseTest.click(rp.getGender());
		
		
		
		Thread.sleep(3000);
	   	JavascriptExecutor js = (JavascriptExecutor)driver;
	   	  WebElement edit= driver.findElement(By.xpath("//*[@id='dobspan']"));
		  	  js.executeScript("arguments[0].scrollIntoView(true);",edit);
		  	  
			  
			  	 Thread.sleep(4000);
			  	// BaseTest.click(rp.getDob());
			Thread.sleep(4000);
			Actions acc = new Actions(driver);
			WebElement dob=driver.findElement(By.xpath("//*[@id='dobspan']"));
			dob.click();
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[1]")).click();
//			
//			Thread.sleep(4000);
//			Actions acc1 = new Actions(driver);
//			WebElement mail1=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
//			acc1.doubleClick(mail1).perform();
//			Thread.sleep(4000);
//			WebElement mail=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
//			mail.sendKeys("st"+ (Math.floor(Math.random() * 1478) + "@gmail.com"));
//			
			Thread.sleep(4000);
			Actions acc2 = new Actions(driver);
			WebElement pass2=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
			acc2.doubleClick(pass2).perform();
			Thread.sleep(4000);
			WebElement pass=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
			pass.sendKeys("cbstest");
			
			Thread.sleep(4000);
			BaseTest.click(rp.getPhonecode());
			
			Thread.sleep(4000);
			Actions acc3 = new Actions(driver);
			WebElement pass3=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			acc3.doubleClick(pass3).perform();

			Thread.sleep(2000);
			  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 1)+"')]")));
			
			
			Thread.sleep(4000);
			Actions acc4 = new Actions(driver);
			WebElement pass4=driver.findElement(By.xpath("//*[@id='CONTACTNO']"));
			acc4.doubleClick(pass4).perform();
			
			Thread.sleep(4000);
			WebElement phone1=driver.findElement(By.xpath("//*[@id='CONTACTNO']"));
			phone1.sendKeys("8015766"+(Math.floor(Math.random() * 1478)));
			
			//denomitation
			try {
				Thread.sleep(4000);
				Actions acc33 = new Actions(driver);
				WebElement pass33=driver.findElement(By.xpath("//*[@id='denomination_display']/fieldset/div"));
				acc33.doubleClick(pass33).perform();
			
			Thread.sleep(4000);
			Actions acc32 = new Actions(driver);
			WebElement pass32=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			acc32.doubleClick(pass32).perform();
			
			Thread.sleep(2000);
			  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 2)+"')]")));
				
				
			} catch (Exception e2) {
				System.out.println("no denomination");
			}
			
			///Religion
			try {
				Thread.sleep(4000);
				Actions acc7 = new Actions(driver);
			driver.findElement(By.xpath("//*[@id='religion_display']/fieldset/div")).click();
			
			Thread.sleep(4000);
			Actions acc32 = new Actions(driver);
			WebElement pass32=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			acc32.doubleClick(pass32).perform();
				
				Thread.sleep(2000);
				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 2)+"')]")));
				
				} catch (Exception e2) {	
					System.out.println("no Religion");
				}
				
			///division or subCaste
			
			try {
				Thread.sleep(6000);
				Actions acc8= new Actions(driver);
			driver.findElement(By.xpath("//*[@id='casteselect']")).click();
			
			Thread.sleep(4000);
			Actions acc32 = new Actions(driver);
			WebElement pass32=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			acc32.doubleClick(pass32).perform();
				
				Thread.sleep(2000);
				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 3)+"')]")));
				
				
			} catch (Exception e2) {
				System.out.println("no subcaste");
			}
			
			try {
				Thread.sleep(4000);
				Actions acc33 = new Actions(driver);
				WebElement pass33=driver.findElement(By.xpath("//*[@id='subcastesleect']/div"));
				acc33.doubleClick(pass33).perform();
			
				Thread.sleep(4000);
				Actions acc32 = new Actions(driver);
				WebElement pass32=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
				acc32.doubleClick(pass32).perform();
				
				Thread.sleep(2000);
				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 3)+"')]")));
				
				
			} catch (Exception e2) {
				System.out.println("no division");
			}
			
			try {
				Thread.sleep(4000);
				Actions acc33 = new Actions(driver);
				WebElement pass33=driver.findElement(By.xpath("//*[@id='SUBCASTE']"));
				acc33.doubleClick(pass33).perform();
			
				Thread.sleep(4000);
				Actions acc32 = new Actions(driver);
				WebElement pass32=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
				acc32.doubleClick(pass32).perform();
				
				Thread.sleep(2000);
				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 3)+"')]")));
				
				
			} catch (Exception e2) {
				System.out.println("no subcaste iyengar");
			}
			
			//mother tongue
			Thread.sleep(6000);
			Actions acc8= new Actions(driver);
			WebElement search8=driver.findElement(By.xpath("//*[@id='MOTHERTONGUE']"));
			acc8.click(search8).perform();
			Thread.sleep(2000);
			  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 4)+"')]")));
			
			Thread.sleep(6000);
			BaseTest.click(rp.getContinuebutton());
			
			Thread.sleep(4000);
			BaseTest.click(rp.getMaritalstatus());
			
			
			try {
				Thread.sleep(4000);
			Actions acc1 = new Actions(driver);
				WebElement mail1=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
				acc1.doubleClick(mail1).perform();
				Thread.sleep(4000);
				WebElement mail=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
				mail.sendKeys("st"+ (Math.floor(Math.random() * 1478) + "@gmail.com"));
				
			} catch (Exception e2) {
				System.out.println("no mail");
			}
			
			
			TakesScreenshot screen=(TakesScreenshot)driver;
			File live=screen.getScreenshotAs(OutputType.FILE);
			String destination= "C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\screenshots\\"+".png";
			File Finaldes=new File(destination);
			FileUtils.copyFile(live, Finaldes);
		
			
			Thread.sleep(4000);
			BaseTest.click(rp.getCountryliving());
			
			try {
				Thread.sleep(4000);
				driver.switchTo().alert().accept();
			} catch (Exception e2) {
				System.out.println("no exception");
			}
			
			try {
				Thread.sleep(4000);
				driver.switchTo().alert().accept();
			} catch (Exception e2) {
				System.out.println("no exception");
			}
			
			Thread.sleep(4000);
			Actions acc31 = new Actions(driver);
			WebElement pass31=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			acc31.doubleClick(pass31).perform();
			
			Thread.sleep(4000);
			  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 5)+"')]")));
			
			Thread.sleep(4000);
			BaseTest.click(rp.getResidingstate());
			
			try {
				Thread.sleep(4000);
				driver.switchTo().alert().accept();
			} catch (Exception e2) {
				System.out.println("no exception");
			}
			
			try {
				Thread.sleep(4000);
				driver.switchTo().alert().accept();
			} catch (Exception e2) {
				System.out.println("no exception");
			}
			
			Thread.sleep(4000);
			Actions acc32 = new Actions(driver);
			WebElement pass32=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			acc32.doubleClick(pass32).perform();
			
			Thread.sleep(4000);
			  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 6)+"')]")));
			
			  try {
				  Thread.sleep(4000);
					BaseTest.click(rp.getResidingcity());
					
					try {
						Thread.sleep(4000);
						driver.switchTo().alert().accept();
					} catch (Exception e2) {
						System.out.println("no exception");
					}
					
					try {
						Thread.sleep(4000);
						driver.switchTo().alert().accept();
					} catch (Exception e2) {
						System.out.println("no exception");
					}
					
					Thread.sleep(4000);
					Actions acc33 = new Actions(driver);
					WebElement pass33=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
					acc33.doubleClick(pass33).perform();
					
					Thread.sleep(4000);
					  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 7)+"')]")));
					
			} catch (Exception e2) {
				System.out.println("No Residing City");
			}
			  
//			  try {
//				  Thread.sleep(4000);
//					BaseTest.click(rp.getResidingcity());
//					Thread.sleep(4000);
//					Actions acc33 = new Actions(driver);
//					WebElement pass33=driver.findElement(By.xpath("//*[@id='RESIDINGCITYTEXT']"));
//					pass33.sendKeys("Others");
//					
//			} catch (Exception e2) {
//				System.out.println("No Residing City");
//			}
			
			  try {
					Thread.sleep(6000);
					Actions acc18= new Actions(driver);
					WebElement search18=driver.findElement(By.xpath("//*[@id='CITIZENSHIP']"));
					acc18.click(search18).perform();
					Thread.sleep(4000);
					Actions acc34 = new Actions(driver);
					WebElement pass34=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
					acc34.doubleClick(pass34).perform();
					
					Thread.sleep(2000);
					  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 8)+"')]")));
					
					
				} catch (Exception e2) {
					System.out.println("no citizenship");
				}
			  
			  try {
					Thread.sleep(6000);
					Actions acc18= new Actions(driver);
					WebElement search18=driver.findElement(By.xpath("//*[@id='RESIDENTSTATUS']"));
					acc18.click(search18).perform();
					
					
					
					try {
						Thread.sleep(4000);
						driver.switchTo().alert().accept();
					} catch (Exception e2) {
						System.out.println("no exception");
					}
					
					try {
						Thread.sleep(4000);
						driver.switchTo().alert().accept();
					} catch (Exception e2) {
						System.out.println("no exception");
					}
					
					Thread.sleep(4000);
					Actions acc34 = new Actions(driver);
					WebElement pass34=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
					acc34.doubleClick(pass34).perform();
					
					Thread.sleep(4000);
					  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 9)+"')]")));
					
					
				} catch (Exception e2) {
					System.out.println("no resident status");
				}
			
			  Thread.sleep(8000);
			   	JavascriptExecutor js9 = (JavascriptExecutor)driver;
			   	  WebElement edi29= driver.findElement(By.xpath("//*[@id='continuebutton']"));
				  	  js9.executeScript("arguments[0].scrollIntoView(true);",edi29);
			 
			Thread.sleep(4000);
			BaseTest.click(rp.getContinuebutton());
			
			try {
				Thread.sleep(4000);
				driver.switchTo().alert().accept();
			} catch (Exception e2) {
				System.out.println("no exception");
			}
			
			try {
				Thread.sleep(4000);
				driver.switchTo().alert().accept();
			} catch (Exception e2) {
				System.out.println("no exception");
			}
			
			Thread.sleep(4000);
			BaseTest.click(rp.getHeight());
			
			Thread.sleep(5000);
	        List<WebElement> heigt = driver.findElements(By.xpath("//div[@class='dww dwrc']//ul//li"));
	        int z = heigt.size();
	        System.out.println(a);

	        for (int k = 0; k <=22; k++) {

	        //    heigt.get(i).sendKeys("4 ft 2 in / 127 cm");
    Actions mn= new Actions(driver);
	mn.moveToElement(heigt.get(k)).click().build().perform();
	                Thread.sleep(1000);
	           /*    actions.click();
	        //      actions.sendKeys(" ");
	                actions.build().perform();*/

	        } 
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[1]")).click();
			
			Thread.sleep(4000);
			BaseTest.click(rp.getPhyscialstatus());
			
			Thread.sleep(4000);
			BaseTest.click(rp.getEducation());
			
			try {
				Thread.sleep(4000);
				driver.switchTo().alert().accept();
			} catch (Exception e2) {
				System.out.println("no exception");
			}
			
			try {
				Thread.sleep(4000);
				driver.switchTo().alert().accept();
			} catch (Exception e2) {
				System.out.println("no exception");
			}
			
			Thread.sleep(4000);
			Actions acc34 = new Actions(driver);
			WebElement pass34=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			acc34.doubleClick(pass34).perform();
			
			Thread.sleep(6000);
			
			  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 10)+"')]")));
			
			
			Thread.sleep(4000);
			BaseTest.click(rp.getEmployedin());
			
			Thread.sleep(4000);
			BaseTest.click(rp.getOccupation());
			
			try {
				Thread.sleep(4000);
				driver.switchTo().alert().accept();
			} catch (Exception e2) {
				System.out.println("no exception");
			}
			
			try {
				Thread.sleep(4000);
				driver.switchTo().alert().accept();
			} catch (Exception e2) {
				System.out.println("no exception");
			}
			

			Thread.sleep(4000);
			Actions acc95 = new Actions(driver);
			WebElement ma6=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			acc95.doubleClick(ma6).perform();
			Thread.sleep(6000);
			
			  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 11)+"')]")));
			
			
			Thread.sleep(4000);
			BaseTest.click(rp.getRs());
			
			
			try {
				Thread.sleep(4000);
				driver.switchTo().alert().accept();
			} catch (Exception e2) {
				System.out.println("no exception");
			}
			
			try {
				Thread.sleep(4000);
				driver.switchTo().alert().accept();
			} catch (Exception e2) {
				System.out.println("no exception");
			}
			
			
			Thread.sleep(4000);
			Actions acc91 = new Actions(driver);
			WebElement ma3=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			acc91.doubleClick(ma3).perform();
			Thread.sleep(6000);
			
			  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 12)+"')]")));
			  
			  Thread.sleep(4000);
			  WebElement income= driver.findElement(By.xpath("(//*[@id='INCOMETEXT'])[2]"));
			  income.sendKeys("656936");
			  
			
//			Thread.sleep(4000);
//			BaseTest.click(rp.getIncome());
//			
//			Thread.sleep(4000);
//			Actions acc92 = new Actions(driver);
//			WebElement ma4=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//			acc92.doubleClick(ma4).perform();
////			
//			Thread.sleep(6000);
//			
//			  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 13)+"')]")));
//			
			Thread.sleep(4000);
			BaseTest.click(rp.getFamilystatus());
			
			Thread.sleep(4000);
			BaseTest.click(rp.getFamilytype());
			
			Thread.sleep(4000);
			BaseTest.click(rp.getFamilyvalue());
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getEthinicity());
				
				Thread.sleep(4000);
				Actions acc921 = new Actions(driver);
				WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
				acc921.doubleClick(ma41).perform();

				Thread.sleep(6000);
				
				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 14)+"')]")));
				
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
				
				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 15)+"')]")));
				
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
			
			try {
				Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='GOTHRAM']")).click();
			Thread.sleep(4000);
			Actions acc921 = new Actions(driver);
			WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			acc921.doubleClick(ma41).perform();
			
			Thread.sleep(6000);
			
			  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 22)+"')]")));
			
				
			} catch (Exception e2) {
				System.out.println("no gothram");
			}
			
			Thread.sleep(8000);
		   	JavascriptExecutor js10 = (JavascriptExecutor)driver;
		   	  WebElement edi30= driver.findElement(By.xpath("//*[@id='continuebutton']"));
			  	  js10.executeScript("arguments[0].scrollIntoView(true);",edi30);
		 
			
			Thread.sleep(4000);
			BaseTest.click(rp.getContinuebutton());
			
			try {
				Thread.sleep(4000);
				driver.switchTo().alert().accept();
			} catch (Exception e2) {
				System.out.println("no exception");
			}
			
			try {
				Thread.sleep(4000);
				driver.switchTo().alert().accept();
			} catch (Exception e2) {
				System.out.println("no exception");
			}
			
			/////4th page
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getStars());
				
				Thread.sleep(4000);
				Actions acc921 = new Actions(driver);
				WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
				acc921.doubleClick(ma41).perform();
				
				Thread.sleep(6000);
				
				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 16)+"')]")));
				
			} catch (Exception e2) {
				System.out.println("no star");
			}
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getRaasii());
				
				Thread.sleep(4000);
				Actions acc921 = new Actions(driver);
				WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
				acc921.doubleClick(ma41).perform();
				
				Thread.sleep(6000);
				
				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 17)+"')]")));
				
			} catch (Exception e2) {
				System.out.println("no raasi");
			}
			
			
			try {
				Thread.sleep(4000);
				WebElement gothra= driver.findElement(By.xpath("//*[@id='GOTHRA_TXT']"));
				gothra.sendKeys("siva");
			} catch (Exception e2) {
				System.out.println("no gothra");
			}
			
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getDhosham());
				Thread.sleep(8000);
			
				Actions acc11 = new Actions(driver);
				WebElement dob11=driver.findElement(By.xpath("//*[@id='DOSHAM_SEL']"));
				acc11.doubleClick(dob11).perform();
				
			
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id='Manglik']")).click();
			    driver.findElement(By.xpath("//*[@id='Sarpa Dosh']")).click();
				driver.findElement(By.xpath("//*[@id='Kala Sarpa Dosh']")).click();
				driver.findElement(By.xpath("//*[@id='Rahu Dosh']")).click();
			    driver.findElement(By.xpath("//*[@id='Kethu Dosh']")).click();
				driver.findElement(By.xpath("//*[@id='Kalathra Dosh']")).click();
				Thread.sleep(4000);
                driver.findElement(By.xpath("//*[@id='RegPanel']/div[1]/a/span")).click();
				
			} catch (Exception e2) {
				System.out.println("no dosham");
			}
			
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getTimeofbirth());
				Thread.sleep(4000);
				driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[1]")).click();
			} catch (Exception e2) {
				System.out.println("no time of birth");
			}
			
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getCountryofbirth());
				Thread.sleep(4000);
				Actions acc921 = new Actions(driver);
				WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
				acc921.doubleClick(ma41).perform();
				
				Thread.sleep(6000);
				
				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 18)+"')]")));
				
				
			} catch (Exception e2) {
				System.out.println("no country of birth");
			}
			
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getStateofbirth());
				
				Thread.sleep(4000);
				Actions acc921 = new Actions(driver);
				WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
				acc921.doubleClick(ma41).perform();
				
				Thread.sleep(6000);
				
				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 19)+"')]")));
				
			} catch (Exception e2) {
				System.out.println("state of birth");
			}
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getCityofbirth());
				
				Thread.sleep(4000);
				Actions acc921 = new Actions(driver);
				WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
				acc921.doubleClick(ma41).perform();
				
				Thread.sleep(6000);
				
				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 20)+"')]")));
				
				
			} catch (Exception e2) {
				System.out.println("no city of birth");
			}
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getChartstyle());
				
				Thread.sleep(4000);
				Actions acc921 = new Actions(driver);
				WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
				acc921.doubleClick(ma41).perform();
				
				Thread.sleep(6000);
				
				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", i, 21)+"')]")));
				
			} catch (Exception e2) {
				System.out.println("no chartstyle");
			}
			
			try {
				Thread.sleep(8000);
			   	JavascriptExecutor js12 = (JavascriptExecutor)driver;
			   	  WebElement edi12= driver.findElement(By.xpath("//span[contains(text(),'Done')]"));
				  	  js12.executeScript("arguments[0].scrollIntoView(true);",edi12);
			 
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("//span[contains(text(),'Done')]")).click();
			} catch (Exception e2) {
				System.out.println("no continue");
			}
			
			

			try {
				Thread.sleep(8000);
			   	JavascriptExecutor js12 = (JavascriptExecutor)driver;
			   	  WebElement edi12= driver.findElement(By.xpath("//*[@id='home-footer']/div[3]"));
				  	  js12.executeScript("arguments[0].scrollIntoView(true);",edi12);
			 
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id='home-footer']/div[3]")).click();
			} catch (Exception e2) {
				System.out.println("no continue");
			}
			

			try {
				Thread.sleep(8000);
			   	JavascriptExecutor js12 = (JavascriptExecutor)driver;
			   	  WebElement edi12= driver.findElement(By.xpath("//*[@id='home-footer']/div[3]/div"));
				  	  js12.executeScript("arguments[0].scrollIntoView(true);",edi12);
			 
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id='home-footer']/div[3]/div")).click();
			} catch (Exception e2) {
				System.out.println("no continue");
			}
			
			try {
				Thread.sleep(8000);
			   	JavascriptExecutor js12 = (JavascriptExecutor)driver;
			   	  WebElement edi12= driver.findElement(By.xpath("//*[@id='continuebutton']"));
				  	  js12.executeScript("arguments[0].scrollIntoView(true);",edi12);
			 
				
				Thread.sleep(8000);
				driver.findElement(By.xpath("//*[@id='continuebutton']")).click();
			} catch (Exception e2) {
				System.out.println("no continue");
			}
			
			try {
				Thread.sleep(8000);
			   	JavascriptExecutor js12 = (JavascriptExecutor)driver;
			   	  WebElement edi12= driver.findElement(By.xpath("//*[@id='home-footer']/div[3]/div/span"));
				  	  js12.executeScript("arguments[0].scrollIntoView(true);",edi12);
			 
				
				Thread.sleep(8000);
				driver.findElement(By.xpath("//*[@id='home-footer']/div[3]/div/span")).click();
			} catch (Exception e2) {
				System.out.println("no continue");
			}
			
			Thread.sleep(4000);
			WebElement left=driver.findElement(By.xpath("//B[contains(text(),'BRH')]"));
			String b1=left.getText();
			System.out.println("Matri id :"+b1);
			
			String [] split=b1.split(":");
			System.out.println("matri id new :"+split[1]);
			String matri=split[1].toString().trim();
			System.out.println("final matri id:"+matri);
			
			Thread.sleep(3000);
	        String parent = driver.getWindowHandle();

	        Robot rr = new Robot();

	        Thread.sleep(3000);
	        rr.keyPress(KeyEvent.VK_CONTROL);
	        rr.keyPress(KeyEvent.VK_N);
	        rr.keyRelease(KeyEvent.VK_N);
	        rr.keyRelease(KeyEvent.VK_CONTROL);

	         Set<String> child  = driver.getWindowHandles();

	          for (String hanlde : child) {
	            if (!parent.contains(hanlde)) {
	                Thread.sleep(2000);
	                driver.switchTo().window(hanlde);
	            }
	        } 
			
//			
//		       Thread.sleep(5000);
//		       driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
//		                  System.out.println("New tab opened");
	                  Thread.sleep(9000);
		       driver.navigate().to("https://admin:lRqW6WNT@communitymatrimony.com/api/webservicecall.php?filename=getSmsPin&MatriId="+matri);
		       //https://admin:lRqW6WNT@communitymatrimony.com/api/webservicecall.php?filename=getSmsPin&MatriId="+matriid
		                   //driver.navigate().back();
		                   Thread.sleep(5000);
		                   WebElement element = driver.findElement(By.xpath("/html/body/pre"));
		                   String pinnotext = element.getText();
		                   driver.navigate().back();
		                   System.out.println("PIN : "+pinnotext);
		                   System.out.println("Success...");
//		                   test.pass("Mobile Activation Started.....");
		                  Thread.sleep(1000);
		                   String pinNum=pinnotext.substring(24,31);
		                   System.out.println(pinNum);
//		                   test.pass("Mobile Recivied PIN Number is :  ****** ");
		                   Thread.sleep(1000);
		                   driver.close();
		                   driver.switchTo().window(parent);
		                   
		                   Thread.sleep(5000);
		    //   driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL+"w");
		                  // driver.switchTo().window(pwh);
		                  // driver.navigate().back();
		                 try {
		                	 Thread.sleep(3000);
			                  	JavascriptExecutor js20 = (JavascriptExecutor)driver;
			                  	  WebElement edit20= driver.findElement(By.xpath("//input[@placeholder='Enter Verification PIN']"));
			               	  	  js20.executeScript("arguments[0].scrollIntoView(true);",edit20);
			                   
			                   Thread.sleep(4000);
			                   WebElement pinno=driver.findElement(By.xpath("//input[@placeholder='Enter Verification PIN']"));
			                  Thread.sleep(4000);
				             pinno.sendKeys(pinNum);
						} catch (Exception e2) {
							System.out.println("no sms pin1");
						}  
		                 
		                 try {
		                	 Thread.sleep(3000);
			                  	JavascriptExecutor js20 = (JavascriptExecutor)driver;
			                  	  WebElement edit20= driver.findElement(By.xpath("//*[@id='skipotppopup']/div[2]"));
			               	  	  js20.executeScript("arguments[0].scrollIntoView(true);",edit20);
			                   
			                   Thread.sleep(4000);
			                   WebElement pinno=driver.findElement(By.xpath("//*[@id='skipotppopup']/div[2]"));
			                  Thread.sleep(4000);
				             pinno.sendKeys(pinNum);
						} catch (Exception e2) {
							System.out.println("no sms pin2");
						}  
		                 
		                 try {
		                	 Thread.sleep(3000);
			                  	JavascriptExecutor js20 = (JavascriptExecutor)driver;
			                  	  WebElement edit20= driver.findElement(By.xpath("//*[@id='skipotppopup']/div[2]"));
			               	  	  js20.executeScript("arguments[0].scrollIntoView(true);",edit20);
			                   
			                   Thread.sleep(4000);
			                   WebElement pinno=driver.findElement(By.xpath("//*[@id='skipotppopup']/div[2]"));
			                  Thread.sleep(4000);
				             pinno.sendKeys(pinNum);
						} catch (Exception e2) {
							System.out.println("no sms pin3");
						}   
		                 
//		                 
//		                 try {
//		                	 Thread.sleep(3000);
//			                  	JavascriptExecutor js20 = (JavascriptExecutor)driver;
//			                  	  WebElement edit20= driver.findElement(By.xpath("//*[@id='VERIFY']"));
//			               	  	  js20.executeScript("arguments[0].scrollIntoView(true);",edit20);
//			                   
//			                   Thread.sleep(4000);
//			                   WebElement pinno=driver.findElement(By.xpath("//*[@id='VERIFY']"));
//			                  Thread.sleep(4000);
//				             pinno.sendKeys(pinNum);
//						} catch (Exception e2) {
//							System.out.println("no sms pin4");
//						}   
//		                   
		                 try {
		                	 Thread.sleep(3000);
			                  	JavascriptExecutor js20 = (JavascriptExecutor)driver;
			                  	  WebElement edit20= driver.findElement(By.xpath("//*[@id='skipotppopup']/div[2]/div[1]"));
			               	  	  js20.executeScript("arguments[0].scrollIntoView(true);",edit20);
			                   
			                   Thread.sleep(4000);
			                   WebElement pinno=driver.findElement(By.xpath("//*[@id='skipotppopup']/div[2]/div[1]"));
			                  Thread.sleep(4000);
				             pinno.sendKeys(pinNum);
						} catch (Exception e2) {
							System.out.println("no sms pin5");
						}
		                 
		                 //verify
		                 
		                 try {
		                	 Thread.sleep(4000);
			                   driver.findElement(By.id("verify")).click(); 
				
						} catch (Exception e2) {
							System.out.println("no verify1");
						}
		                 
			               
		                 try {
		                	 Thread.sleep(4000);
			                   driver.findElement(By.xpath("//*[@id='skipotppopup']/div[3]")).click();
				
						} catch (Exception e2) {
							System.out.println("no verify2");
						}
			
			
		                 try {
		                	 Thread.sleep(4000);
			                   driver.findElement(By.xpath("(//a[contains(text(),'Verify')])[1]")).click();
				
						} catch (Exception e2) {
							System.out.println("no verify3");
						}
			
		                
		                 

		                 try {
		                	 Thread.sleep(4000);
			                   driver.findElement(By.xpath("//*[@id='add-photo-later']")).click();
				
						} catch (Exception e2) {
							System.out.println("no photo verification");
						}
			

		                 try {
		                	 Thread.sleep(4000);
			                   driver.findElement(By.xpath("//*[@id='add-photo-later']/a")).click();
				
						} catch (Exception e2) {
							System.out.println("no photo verification1");
						}
			
		                   
		                 
		}
			
}
}