package logic;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTest;
import pom.RegistrationRaasiPOM;

public class RegistrationRaasi extends BaseTest {
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
		RegistrationRaasiPOM rp= new RegistrationRaasiPOM(driver);
		Thread.sleep(4000);
		driver.get("https://mstage.agarwalmatrimony.com/cbsmob/registration/register.php");
		driver.manage().window().maximize();
		
		//////Page 1 ////////
		Thread.sleep(4000);
		BaseTest.click(rp.getProfilecreatedfor());
		
		Thread.sleep(4000);
		WebElement e=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[2]/div/label"));
		Actions a=new Actions(driver);
		Thread.sleep(4000);
		a.sendKeys(e,"darling").build().perform();
	   
		Thread.sleep(4000);
		BaseTest.click(rp.getGender());
		
		Thread.sleep(3000);
	   	JavascriptExecutor js = (JavascriptExecutor)driver;
	   	  WebElement edit= driver.findElement(By.xpath("//label[contains(text(),'Date of Birth')]"));
		  	  js.executeScript("arguments[0].scrollIntoView(true);",edit);
		  	  
		  	 Thread.sleep(4000);
		  	// BaseTest.click(rp.getDob());
		Thread.sleep(4000);
		Actions acc = new Actions(driver);
		WebElement dob=driver.findElement(By.xpath("//label[contains(text(),'Date of Birth')]"));
		acc.doubleClick(dob).perform();
		
//////		Thread.sleep(3000);
//////	   	JavascriptExecutor js5 = (JavascriptExecutor)driver;
//////	   	  WebElement edit5= driver.findElement(By.xpath("(//div[@class='dwwc dwrc']//following::div)[13]"));
//////		  	  js5.executeScript("arguments[0].scrollIntoView(true);",edit5);
//////		  	  
//////		  	  
//////		Thread.sleep(4000);
//////		driver.findElement(By.xpath("(//div[@class='dwwc dwrc']//following::div)[13]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[1]")).click();
		
//////		Thread.sleep(3000);
//////	   	JavascriptExecutor js1 = (JavascriptExecutor)driver;
//////	   	  WebElement edit1= driver.findElement(By.xpath("//label[contains(text(),'Email')]"));
//////		  	  js1.executeScript("arguments[0].scrollIntoView(true);",edit1);
//////		 
		Thread.sleep(4000);
		Actions acc1 = new Actions(driver);
		WebElement mail1=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
		acc1.doubleClick(mail1).perform();
		Thread.sleep(4000);
		WebElement mail=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
		mail.sendKeys("iresh30@gmail.com");
		
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
		Thread.sleep(4000);
		WebElement phone=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
		phone.sendKeys("india");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='list_view_detail']/li[1]")).click();
		
		Thread.sleep(4000);
		Actions acc4 = new Actions(driver);
		WebElement pass4=driver.findElement(By.xpath("//*[@id='CONTACTNO']"));
		acc4.doubleClick(pass4).perform();
		
		Thread.sleep(4000);
		WebElement phone1=driver.findElement(By.xpath("//*[@id='CONTACTNO']"));
		phone1.sendKeys("7338988910");
		
		Thread.sleep(4000);
		Actions acc41 = new Actions(driver);
		WebElement mail2=driver.findElement(By.xpath("//*[@id='RELIGION']"));
		acc41.doubleClick(mail2).perform();
	
		WebElement releg=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
		releg.sendKeys("Hindu");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='list_view_detail']/li[1]")).click();
		
		Thread.sleep(4000);
		BaseTest.click(rp.getSubcaste());
		
		Thread.sleep(4000);
		Actions acc5 = new Actions(driver);
		WebElement pas=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
		acc5.doubleClick(pas).perform();
		
		Thread.sleep(4000);
		WebElement subcaste=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
		subcaste.sendKeys("Bisa");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='list_view_detail']/li[1]")).click();
		
		Thread.sleep(4000);
		Actions ac = new Actions(driver);
		WebElement mail5=driver.findElement(By.xpath("//*[@id='MOTHERTONGUE']"));
		ac.doubleClick(mail5).perform();
		
		Thread.sleep(4000);
		BaseTest.click(rp.getSearch());;
		
       Thread.sleep(6000);
		int mot_tng = BaseTest.getCellCount("Sheet1");
		
	for (int i = 0; i < mot_tng; i++) {
		
				 BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet1", 0, i)+"')]")));
			
			try {
				Thread.sleep(4000);
				 Thread.sleep(8000);
				   	JavascriptExecutor js5 = (JavascriptExecutor)driver;
				   	  WebElement edi25= driver.findElement(By.xpath("//span[contains(text(),'Continue')]"));
					  	  js5.executeScript("arguments[0].scrollIntoView(true);",edi25);
				  	  
					
					  	Thread.sleep(4000);  
					  	WebDriverWait wais = new WebDriverWait(driver,120);
					  	wais.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Continue')]")));
					  			  
			} catch (Exception e2) {
				System.out.println("no element");
			}
				
			try {
				Thread.sleep(8000);
			   	JavascriptExecutor js9 = (JavascriptExecutor)driver;
			   	  WebElement edi29= driver.findElement(By.xpath("//*[@id='continuebutton']"));
				  	  js9.executeScript("arguments[0].scrollIntoView(true);",edi29);
			 
				  	  Thread.sleep(4000);
				  	  WebDriverWait waits = new WebDriverWait(driver,120);
				  	waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='continuebutton']")));
				  			  
				  	  
////				  	    Thread.sleep(4000);
////					    Actions hl=new Actions(driver);
////					    WebElement gl=driver.findElement(By.xpath("//*[@id='continuebutton']"));
////						Thread.sleep(4000);
////				        hl.doubleClick(gl).perform();
////				        
			} catch (Exception e2) {
				System.out.println("no element");
			}		  			  
			
//		   /////// page2  ///////
//			 
			Thread.sleep(4000);
			BaseTest.click(rp.getMaritalstatus());
			
			Thread.sleep(4000);
			BaseTest.click(rp.getCountryliving());
			
			Thread.sleep(4000);
			Actions acc51 = new Actions(driver);
			WebElement mai=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			acc51.doubleClick(mai).perform();
			
			Thread.sleep(4000);
			WebElement country=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			country.sendKeys("India");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[1]")).click();
			
			Thread.sleep(4000);
			BaseTest.click(rp.getState());

			Thread.sleep(4000);
			Actions acc61 = new Actions(driver);
			WebElement mai1=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			acc61.doubleClick(mai1).perform();
			
			Thread.sleep(4000);
			WebElement state=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			country.sendKeys("Tamil Nadu");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[31]")).click();
			
			Thread.sleep(4000);
			BaseTest.click(rp.getCity());
			
			Thread.sleep(4000);
			Actions acc71 = new Actions(driver);
			WebElement mai2=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			acc71.doubleClick(mai2).perform();
			
			Thread.sleep(4000);
			WebElement city=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			city.sendKeys("Chennai");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[98]")).click();
			
		try {
			Thread.sleep(8000);
		   	JavascriptExecutor js9 = (JavascriptExecutor)driver;
		   	  WebElement edi29= driver.findElement(By.xpath("//*[@id='continuebutton']"));
			  	  js9.executeScript("arguments[0].scrollIntoView(true);",edi29);
		 
			  	  Thread.sleep(4000);
			  	  WebDriverWait waits = new WebDriverWait(driver,120);
			  	waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='continuebutton']")));
			  			  
			  	  
////			  	    Thread.sleep(4000);
////				    Actions hl=new Actions(driver);
////				    WebElement gl=driver.findElement(By.xpath("//*[@id='continuebutton']"));
////					Thread.sleep(4000);
////			        hl.doubleClick(gl).perform();
////			        
		} catch (Exception e2) {
			System.out.println("no element");
		}
		
		
		try {
			Thread.sleep(8000);
		   	JavascriptExecutor js9 = (JavascriptExecutor)driver;
		   	  WebElement edi29= driver.findElement(By.xpath("//span[contains(text(),'Continue')]"));
			  	  js9.executeScript("arguments[0].scrollIntoView(true);",edi29);
		 
			  	    Thread.sleep(4000);

				  	  Thread.sleep(4000);
				  	  WebDriverWait waits = new WebDriverWait(driver,120);
				  	waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Continue')]")));
				  			  
				  	  
		} catch (Exception e2) {
			System.out.println("no element2");
		}
			 

		try {
			Thread.sleep(8000);
		   	JavascriptExecutor js9 = (JavascriptExecutor)driver;
		   	  WebElement edi29= driver.findElement(By.xpath("//*[@id='home-footer']"));
			  	  js9.executeScript("arguments[0].scrollIntoView(true);",edi29);
		 
			  	    Thread.sleep(4000);
				    Actions hl=new Actions(driver);
				    WebElement gl=driver.findElement(By.xpath("//*[@id='home-footer']"));
					Thread.sleep(4000);
			        hl.doubleClick(gl).perform();
			        
		} catch (Exception e2) {
			System.out.println("no element3");
		}
		
		try {
			Thread.sleep(8000);
		   	JavascriptExecutor js9 = (JavascriptExecutor)driver;
		   	  WebElement edi29= driver.findElement(By.xpath("//*[@id='continuebutton']"));
			  	  js9.executeScript("arguments[0].scrollIntoView(true);",edi29);
		 
			  	 WebDriverWait waits = new WebDriverWait(driver,120);
				  	waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='continuebutton']")));
				  			  
			        
		} catch (Exception e2) {
			System.out.println("no element4");
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
			
			
			Thread.sleep(4000);
			Actions acc81 = new Actions(driver);
			WebElement ma2=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			acc81.doubleClick(ma2).perform();
			
			Thread.sleep(4000);
			WebElement educate=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			educate.sendKeys("BFA");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[8]")).click();
			
			Thread.sleep(4000);
			BaseTest.click(rp.getEmployedin());
			
			Thread.sleep(6000);//*[@id='CBSRegistration3']/fieldset[10]/div[2]/div/div/div[3]/label/span
			BaseTest.click(rp.getOccupation());
			
			Thread.sleep(4000);
			Actions acc95 = new Actions(driver);
			WebElement ma6=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			acc95.doubleClick(ma6).perform();
			
			Thread.sleep(4000);
			WebElement occu2=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			occu2.sendKeys("Clerk");
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[3]")).click();
			
			
			Thread.sleep(4000);
			BaseTest.click(rp.getRs());
			
			Thread.sleep(4000);
			Actions acc91 = new Actions(driver);
			WebElement ma3=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			acc91.doubleClick(ma3).perform();
			
			Thread.sleep(4000);
			WebElement occu=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			occu.sendKeys("india");
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[98]")).click();
			
			Thread.sleep(4000);
			BaseTest.click(rp.getIncome());
			
			Thread.sleep(4000);
			Actions acc92 = new Actions(driver);
			WebElement ma4=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			acc92.doubleClick(ma4).perform();
			
			Thread.sleep(4000);
			WebElement income=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
			income.sendKeys("4 - 5 lakhs");
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[5]")).click();
			
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File scr=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\screenshots\\"+".png");
			FileUtils.copyFile(scr, dest);
			
			Thread.sleep(4000);
			BaseTest.click(rp.getFamilystatus());
			
			Thread.sleep(4000);
			BaseTest.click(rp.getFamilytype());
			
			Thread.sleep(4000);
			BaseTest.click(rp.getFamilyvalue());
			
			
			  	Thread.sleep(4000);
				 Thread.sleep(8000);
				   	JavascriptExecutor js10 = (JavascriptExecutor)driver;
				   	  WebElement edi30= driver.findElement(By.xpath("//span[contains(text(),'Continue')]"));
					  	  js10.executeScript("arguments[0].scrollIntoView(true);",edi30);
					  	 
					  	  Thread.sleep(4000);
					  	 WebDriverWait waits = new WebDriverWait(driver,120);
						  	waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Continue')]")));
						  			  
////		Thread.sleep(4000);
////		BaseTest.click(rp.getStar());
//		
//					        Thread.sleep(8000);
//						   	JavascriptExecutor js11 = (JavascriptExecutor)driver;
//						   	  WebElement edi31= driver.findElement(By.xpath("//*[@id='RAASI']"));
//							  	  js11.executeScript("arguments[0].scrollIntoView(true);",edi31);
//							  	  
//							  	  Thread.sleep(4000);
//							  	  Actions hi5=new Actions(driver);
//								    WebElement gk5=driver.findElement(By.xpath("//*[@id='RAASI']"));
//									Thread.sleep(4000);
//							        hi5.doubleClick(gk5).perform();
//			
//			int ref=BaseTest.getRowCount("sheet1");
//			System.out.println("total raasi:"+ref);
//			for (int j = 1; j < ref; j++) {
//				
//				WebElement demo=driver.findElement(By.xpath("//*[@id='list_view_detail']/li["+j+"]"));
//			String b1=demo.getText();
//			System.out.println("raasi in web:"+b1);
//			
//			
//			
//			
//			
//			}	
//	}	
		
		/////////////Live//////////////////
		
//	Thread.sleep(4000);
//		driver.get("https://m.communitymatrimony.com/cbsmob/registration/register.php");
//		driver.manage().window().maximize();
//		
//		//////Page 1 ////////
//		Thread.sleep(4000);
//		BaseTest.click(rp.getProfilecreatedfor());
//		
//		Thread.sleep(4000);
//		WebElement e1=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[2]/div/label"));
//		Actions a1=new Actions(driver);
//		Thread.sleep(4000);
//		a1.sendKeys(e1,"darling").build().perform();
//	   
//		Thread.sleep(4000);
//		BaseTest.click(rp.getGender());
//		
//		Thread.sleep(3000);
//	   	JavascriptExecutor js1 = (JavascriptExecutor)driver;
//	   	  WebElement edit1= driver.findElement(By.xpath("//label[contains(text(),'Date of Birth')]"));
//		  	  js1.executeScript("arguments[0].scrollIntoView(true);",edit1);
//		  	  
//		  	 Thread.sleep(4000);
//		  	// BaseTest.click(rp.getDob());
//		Thread.sleep(4000);
//		Actions acc = new Actions(driver);
//		WebElement dob=driver.findElement(By.xpath("//label[contains(text(),'Date of Birth')]"));
//		acc.doubleClick(dob).perform();
//		
//////		Thread.sleep(3000);
//////	   	JavascriptExecutor js5 = (JavascriptExecutor)driver;
//////	   	  WebElement edit5= driver.findElement(By.xpath("(//div[@class='dwwc dwrc']//following::div)[13]"));
//////		  	  js5.executeScript("arguments[0].scrollIntoView(true);",edit5);
//////		  	  
//////		  	  
//////		Thread.sleep(4000);
//////		driver.findElement(By.xpath("(//div[@class='dwwc dwrc']//following::div)[13]")).click();
//		
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[1]")).click();
//		
//////		Thread.sleep(3000);
//////	   	JavascriptExecutor js1 = (JavascriptExecutor)driver;
//////	   	  WebElement edit1= driver.findElement(By.xpath("//label[contains(text(),'Email')]"));
//////		  	  js1.executeScript("arguments[0].scrollIntoView(true);",edit1);
//////		 
//		Thread.sleep(4000);
//		Actions acc1 = new Actions(driver);
//		WebElement mail1=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
//		acc1.doubleClick(mail1).perform();
//		Thread.sleep(4000);
//		WebElement mail=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
//		mail.sendKeys("esh30@gmail.com");
//		
//		Thread.sleep(4000);
//		Actions acc2 = new Actions(driver);
//		WebElement pass2=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
//		acc2.doubleClick(pass2).perform();
//		Thread.sleep(4000);
//		WebElement pass=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
//		pass.sendKeys("cbstest");
//		
//		Thread.sleep(4000);
//	BaseTest.click(rp.getPhonecode());
//		
//		Thread.sleep(4000);
//		Actions acc3 = new Actions(driver);
//		WebElement pass3=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//		acc3.doubleClick(pass3).perform();
//		Thread.sleep(4000);
//		WebElement phone=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//		phone.sendKeys("india");
//		
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id='list_view_detail']/li[1]")).click();
//		
//		Thread.sleep(4000);
//		Actions acc4 = new Actions(driver);
//		WebElement pass4=driver.findElement(By.xpath("//*[@id='CONTACTNO']"));
//		acc4.doubleClick(pass4).perform();
//		
//		Thread.sleep(4000);
//		WebElement phone1=driver.findElement(By.xpath("//*[@id='CONTACTNO']"));
//		phone1.sendKeys("7338988910");
//		
//		Thread.sleep(4000);
//		Actions acc41 = new Actions(driver);
//		WebElement mail2=driver.findElement(By.xpath("//*[@id='RELIGION']"));
//		acc41.doubleClick(mail2).perform();
//
//		WebElement releg=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//		releg.sendKeys("Hindu");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id='list_view_detail']/li[1]")).click();
//		
//		Thread.sleep(4000);
//		BaseTest.click(rp.getSubcaste());
//		
//		Thread.sleep(4000);
//		Actions acc5 = new Actions(driver);
//		WebElement pas=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//		acc5.doubleClick(pas).perform();
//		
//		Thread.sleep(4000);
//		WebElement subcaste=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//		subcaste.sendKeys("Bisa");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id='list_view_detail']/li[1]")).click();
//		
//		Thread.sleep(4000);
//		Actions ac = new Actions(driver);
//		WebElement mail5=driver.findElement(By.xpath("//*[@id='MOTHERTONGUE']"));
//		ac.doubleClick(mail5).perform();
//		
//		Thread.sleep(4000);
//		BaseTest.click(rp.getSearch());
//		
//       Thread.sleep(6000);
//		int mot_tng = BaseTest.getCellCount("Sheet1");
//		
//	for (int i = 0; i < mot_tng; i++) {
//		
//				 BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet1", 0, i)+"')]")));
//			
//			try {
//				Thread.sleep(4000);
//				 Thread.sleep(8000);
//				   	JavascriptExecutor js5 = (JavascriptExecutor)driver;
//				   	  WebElement edi25= driver.findElement(By.xpath("//span[contains(text(),'Continue')]"));
//					  	  js5.executeScript("arguments[0].scrollIntoView(true);",edi25);
//				  	  
//					
//					  	Thread.sleep(4000);  
//					  	WebDriverWait wais = new WebDriverWait(driver,120);
//					  	wais.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Continue')]")));
//					  			  
//			} catch (Exception e2) {
//				System.out.println("no element");
//			}
//				
//			try {
//				Thread.sleep(8000);
//			   	JavascriptExecutor js9 = (JavascriptExecutor)driver;
//			   	  WebElement edi29= driver.findElement(By.xpath("//*[@id='continuebutton']"));
//				  	  js9.executeScript("arguments[0].scrollIntoView(true);",edi29);
//			 
//				  	  Thread.sleep(4000);
//				  	  WebDriverWait waits = new WebDriverWait(driver,120);
//				  	waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='continuebutton']")));
//				  			  
//				  	  
//////				  	    Thread.sleep(4000);
//////					    Actions hl=new Actions(driver);
//////					    WebElement gl=driver.findElement(By.xpath("//*[@id='continuebutton']"));
//////						Thread.sleep(4000);
//////				        hl.doubleClick(gl).perform();
//////				        
//			} catch (Exception e2) {
//				System.out.println("no element");
//			}		  			  
//			
//		   /////// page2  ///////
//			 
//			Thread.sleep(4000);
//			BaseTest.click(rp.getMaritalstatus());
//			
//			Thread.sleep(4000);
//			BaseTest.click(rp.getCountryliving());
//			
//			Thread.sleep(4000);
//			Actions acc51 = new Actions(driver);
//			WebElement mai=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//			acc51.doubleClick(mai).perform();
//			
//			Thread.sleep(4000);
//			WebElement country=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//			country.sendKeys("India");
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[1]")).click();
//			
//			Thread.sleep(4000);
//			BaseTest.click(rp.getState());
//
//			Thread.sleep(4000);
//			Actions acc61 = new Actions(driver);
//			WebElement mai1=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//			acc61.doubleClick(mai1).perform();
//			
//			Thread.sleep(4000);
//			WebElement state=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//			country.sendKeys("Tamil Nadu");
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[31]")).click();
//			
//			Thread.sleep(4000);
//			BaseTest.click(rp.getCity());
//			
//			Thread.sleep(4000);
//			Actions acc71 = new Actions(driver);
//			WebElement mai2=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//			acc71.doubleClick(mai2).perform();
//			
//			Thread.sleep(4000);
//			WebElement city=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//			city.sendKeys("Chennai");
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[98]")).click();
//			
//		try {
//			Thread.sleep(8000);
//		   	JavascriptExecutor js9 = (JavascriptExecutor)driver;
//		   	  WebElement edi29= driver.findElement(By.xpath("//*[@id='continuebutton']"));
//			  	  js9.executeScript("arguments[0].scrollIntoView(true);",edi29);
//		 
//			  	  Thread.sleep(4000);
//			  	  WebDriverWait waits = new WebDriverWait(driver,120);
//			  	waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='continuebutton']")));
//			  			  
//			  	  
//////			  	    Thread.sleep(4000);
//////				    Actions hl=new Actions(driver);
//////				    WebElement gl=driver.findElement(By.xpath("//*[@id='continuebutton']"));
//////					Thread.sleep(4000);
//////			        hl.doubleClick(gl).perform();
//////			        
//		} catch (Exception e2) {
//			System.out.println("no element");
//		}
//		
//		
//		try {
//			Thread.sleep(8000);
//		   	JavascriptExecutor js9 = (JavascriptExecutor)driver;
//		   	  WebElement edi29= driver.findElement(By.xpath("//span[contains(text(),'Continue')]"));
//			  	  js9.executeScript("arguments[0].scrollIntoView(true);",edi29);
//		 
//			  	    Thread.sleep(4000);
//
//				  	  Thread.sleep(4000);
//				  	  WebDriverWait waits = new WebDriverWait(driver,120);
//				  	waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Continue')]")));
//				  			  
//				  	  
//		} catch (Exception e2) {
//			System.out.println("no element2");
//		}
//			 
//
//		try {
//			Thread.sleep(8000);
//		   	JavascriptExecutor js9 = (JavascriptExecutor)driver;
//		   	  WebElement edi29= driver.findElement(By.xpath("//*[@id='home-footer']"));
//			  	  js9.executeScript("arguments[0].scrollIntoView(true);",edi29);
//		 
//			  	    Thread.sleep(4000);
//				    Actions hl=new Actions(driver);
//				    WebElement gl=driver.findElement(By.xpath("//*[@id='home-footer']"));
//					Thread.sleep(4000);
//			        hl.doubleClick(gl).perform();
//			        
//		} catch (Exception e2) {
//			System.out.println("no element3");
//		}
//		
//		try {
//			Thread.sleep(8000);
//		   	JavascriptExecutor js9 = (JavascriptExecutor)driver;
//		   	  WebElement edi29= driver.findElement(By.xpath("//*[@id='continuebutton']"));
//			  	  js9.executeScript("arguments[0].scrollIntoView(true);",edi29);
//		 
//			  	 WebDriverWait waits = new WebDriverWait(driver,120);
//				  	waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='continuebutton']")));
//				  			  
//			        
//		} catch (Exception e2) {
//			System.out.println("no element4");
//		}
//		
//			Thread.sleep(4000);
//			BaseTest.click(rp.getHeight());
//			
//			Thread.sleep(5000);
//
//	        List<WebElement> heigt = driver.findElements(By.xpath("//div[@class='dww dwrc']//ul//li"));
//	        int z = heigt.size();
//	        System.out.println(z);
//
//	        for (int k = 0; k <=22; k++) {
//
//	        //    heigt.get(i).sendKeys("4 ft 2 in / 127 cm");
//    Actions mn= new Actions(driver);
//	mn.moveToElement(heigt.get(k)).click().build().perform();
//	                Thread.sleep(1000);
//	           /*    actions.click();
//	        //      actions.sendKeys(" ");
//	                actions.build().perform();*/
//
//	        } 
//			
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[1]")).click();
//			
//			
//			Thread.sleep(4000);
//			BaseTest.click(rp.getPhyscialstatus());
//			 
//			Thread.sleep(4000);
//			BaseTest.click(rp.getEducation());
//			
//			
//			Thread.sleep(4000);
//			Actions acc81 = new Actions(driver);
//			WebElement ma2=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//			acc81.doubleClick(ma2).perform();
//			
//			Thread.sleep(4000);
//			WebElement educate=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//			educate.sendKeys("BFA");
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[8]")).click();
//			
//			Thread.sleep(4000);
//			BaseTest.click(rp.getEmployedin());
//			
//			Thread.sleep(6000);//*[@id='CBSRegistration3']/fieldset[10]/div[2]/div/div/div[3]/label/span
//			BaseTest.click(rp.getOccupation());
//			
//			Thread.sleep(4000);
//			Actions acc95 = new Actions(driver);
//			WebElement ma6=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//			acc95.doubleClick(ma6).perform();
//			
//			Thread.sleep(4000);
//			WebElement occu2=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//			occu2.sendKeys("Clerk");
//			
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[3]")).click();
//			
//			
//			Thread.sleep(4000);
//			BaseTest.click(rp.getRs());
//			
//			Thread.sleep(4000);
//			Actions acc91 = new Actions(driver);
//			WebElement ma3=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//			acc91.doubleClick(ma3).perform();
//			
//			Thread.sleep(4000);
//			WebElement occu=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//			occu.sendKeys("india");
//			
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[98]")).click();
//			
//			Thread.sleep(4000);
//			BaseTest.click(rp.getIncome());
//			
//			Thread.sleep(4000);
//			Actions acc92 = new Actions(driver);
//			WebElement ma4=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//			acc92.doubleClick(ma4).perform();
//			
//			Thread.sleep(4000);
//			WebElement income=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//			income.sendKeys("4 - 5 lakhs");
//			
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='list_view_detail']/li[5]")).click();
//			
//			
//			Thread.sleep(4000);
//			BaseTest.click(rp.getFamilystatus());
//			
//			Thread.sleep(4000);
//			BaseTest.click(rp.getFamilytype());
//			
//			Thread.sleep(4000);
//			BaseTest.click(rp.getFamilyvalue());
//			
//			
//			  	Thread.sleep(4000);
//				 Thread.sleep(8000);
//				   	JavascriptExecutor js10 = (JavascriptExecutor)driver;
//				   	  WebElement edi30= driver.findElement(By.xpath("//span[contains(text(),'Continue')]"));
//					  	  js10.executeScript("arguments[0].scrollIntoView(true);",edi30);
//					  	 
//					  	  Thread.sleep(4000);
//					  	 WebDriverWait waits = new WebDriverWait(driver,120);
//						  	waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Continue')]")));
//						  			  
//////		Thread.sleep(4000);
//////		BaseTest.click(rp.getStar());
//////		
//////					        Thread.sleep(8000);
//////						   	JavascriptExecutor js11 = (JavascriptExecutor)driver;
//////						   	  WebElement edi31= driver.findElement(By.xpath("//*[@id='RAASI']"));
//////							  	  js11.executeScript("arguments[0].scrollIntoView(true);",edi31);
//////							  	  
//////							  	  Thread.sleep(4000);
//////							  	  Actions hi5=new Actions(driver);
//////								    WebElement gk5=driver.findElement(By.xpath("//*[@id='RAASI']"));
//////									Thread.sleep(4000);
//////							        hi5.doubleClick(gk5).perform();
//////			
//////			int ref=BaseTest.getRowCount("sheet1");
//////			System.out.println("total raasi:"+ref);
//////			for (int j = 1; j < ref; j++) {
//////				
//////				WebElement demo=driver.findElement(By.xpath("//*[@id='list_view_detail']/li["+j+"]"));
//////			String b1=demo.getText();
//////			System.out.println("raasi in web:"+b1);
//////			
////			
//			
////			
////			
////			}	
////	}	
	}
	
		
		
	}}




