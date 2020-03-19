package logic;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

import Base.BaseTest;

import pom.EditPiPOM;

public class EditPi extends BaseTest{
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\drivernew2\\chromedriver.exe";
	
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
     
    
//    ExtentReports report;
//    ExtentTest logger;
//    private String reportDirectory = "reports";
//    private String reportFormat = "xml";
//    private String testName = "Untitled";
//    protected AndroidDriver<AndroidElement> driver = null;
//
//    DesiredCapabilities dc = new DesiredCapabilities();
//    
//    @BeforeTest
//    public void setUp() throws MalformedURLException {
//    	   dc.setCapability("reportDirectory", reportDirectory);
//           dc.setCapability("reportFormat", reportFormat);
//           dc.setCapability("testName", testName);
//           dc.setCapability(MobileCapabilityType.UDID, "ZDHUTW49BMOZAU8T");
//           dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
//           dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
//           driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
//           driver.setLogLevel(Level.INFO);

  }   
  
  @Test
  public void testUntitled() throws Throwable  {
	  EditPiPOM rp= new EditPiPOM(driver);
	  
//	  File loc=new File("C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\excel\\Data.xlsx");
//	  FileInputStream f=new FileInputStream(loc);
//	  Workbook w=new XSSFWorkbook(f);
//	  Sheet s=w.getSheet("Data");
//	  Row r=s.getRow(1);
//	  Cell c=r.getCell(1);
//	  System.out.println(c);
//	  
	  
	  
	    
	  Thread.sleep(5000);
	    driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
	    driver.manage().window().maximize();
	    
	    //login
	    WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
		Actions a=new Actions(driver);
		Thread.sleep(4000);
		a.sendKeys(e,"IYR242926").build().perform();
	    
	    Thread.sleep(4000);
	    
	    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
	    Thread.sleep(4000);
		Actions b=new Actions(driver);
		Thread.sleep(4000);
		b.sendKeys(d,"cbstest").build().perform();
	    
	  Thread.sleep(4000);
	  BaseTest.click(rp.getLogin());
	  
	  Thread.sleep(6000);
	 driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
	  
	  Thread.sleep(4000);
	  BaseTest.click(rp.getEditpi());
	  
	  //basic details
	  
	  Thread.sleep(4000);
	  BaseTest.click(rp.getBasicdetails());
	  

	  Thread.sleep(4000);
	driver.findElement(By.id("PCF")).click();
	//RegPanelSearchvalue
	
	 Thread.sleep(4000);
	driver.findElement(By.id("RegPanelSearchvalue")).click();
	
	Thread.sleep(4000);
	//BaseTest.select_string(driver.findElement(By.id("RegPanelSearchvalue")), BaseTest.getExcelData("Data", 1, 1));
	Thread.sleep(2000);
	
  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 1, 1)+"')]")));
	Thread.sleep(3000);
	
	Thread.sleep(4000);
	BaseTest.click(rp.getHeight());
	Thread.sleep(2000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 1, 2)+"')]")));
	
	Thread.sleep(2000);
	BaseTest.click(rp.getWeight());
	Thread.sleep(2000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 1, 3)+"')]")));
     
	Thread.sleep(4000);
	BaseTest.click(rp.getMaritalstatus());
	Thread.sleep(2000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 1, 4)+"')]")));
     
	Thread.sleep(3000);
	BaseTest.click(rp.getMothertongue());
	Thread.sleep(2000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 1, 5)+"')]")));
     
	Thread.sleep(3000);
	BaseTest.click(rp.getBodytype());
	Thread.sleep(2000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 1, 6)+"')]")));
     
	
	
	Thread.sleep(3000);
	BaseTest.click(rp.getComplexion());
	Thread.sleep(2000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 1, 7)+"')]")));
     
	Thread.sleep(2000);
	BaseTest.click(rp.getPhyscialstatus());
	Thread.sleep(2000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 1, 8)+"')]")));
     
	Thread.sleep(4000);
	BaseTest.click(rp.getLanguageknown());
	Thread.sleep(2000);
	BaseTest.click(driver.findElement(By.xpath("//span[contains(text(),'"+getExcelData("Data", 1, 9)+"')]")));
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
	
	Thread.sleep(4000);
	BaseTest.click(rp.getBasicdetailsave());
	
	Thread.sleep(4000);
	BaseTest.getScreenshot(driver, "PI Basic details popup");
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click();
	
	//Religious information
	Thread.sleep(4000);
	BaseTest.click(rp.getReligiousinformation());
//	
//	Thread.sleep(4000);
//	BaseTest.click(rp.getSubcaste());
//	Thread.sleep(4000);
//	BaseTest.click(rp.getSearchbar());
//	Thread.sleep(3000);
//	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 4, 1)+"')]")));
//	
	Thread.sleep(4000);
	BaseTest.click(rp.getStar());
	Thread.sleep(4000);
	BaseTest.click(rp.getSearchbar());
	Thread.sleep(3000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 4, 2)+"')]")));
	
	Thread.sleep(4000);
	BaseTest.click(rp.getRaasi());
	Thread.sleep(4000);
	BaseTest.click(rp.getSearchbar());
	Thread.sleep(3000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 4, 3)+"')]")));
	
	Thread.sleep(4000);
	BaseTest.click(rp.getSuddhajadhagam());
	Thread.sleep(4000);
	BaseTest.click(rp.getSearchbar());
	Thread.sleep(3000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 4, 4)+"')]")));
	
	Thread.sleep(4000);
	BaseTest.click(rp.getBasicdetailsave());
	Thread.sleep(4000);
	BaseTest.getScreenshot(driver, "PI Religious information popup");
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click(); 
	
	//Professional information
	Thread.sleep(4000);  
	BaseTest.click(rp.getProfessionalinformation());
	Thread.sleep(4000);
	BaseTest.click(rp.getEducation());
	Thread.sleep(3000);
	BaseTest.click(rp.getSearchbar());
	Thread.sleep(4000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 7, 1)+"')]")));
	
	Thread.sleep(4000);
	WebElement ref= driver.findElement(By.xpath("//*[@id='Education_detail']"));
	Thread.sleep(3000);
	ref.sendKeys("corporate secretary");
	
	Thread.sleep(4000);
	WebElement ref1= driver.findElement(By.xpath("//*[@id='College_Institution']"));
	Thread.sleep(3000);
	ref1.sendKeys("Madras University"); 
	
	Thread.sleep(4000);
	BaseTest.click(rp.getEmployedin());
	Thread.sleep(3000);
	BaseTest.click(rp.getSearchbar());
	Thread.sleep(4000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 7, 4)+"')]")));
	
	Thread.sleep(4000);
	BaseTest.click(rp.getOccupation());
	Thread.sleep(3000);
	BaseTest.click(rp.getSearchbar());
	Thread.sleep(4000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 7, 5)+"')]")));

	Thread.sleep(4000);
	WebElement ref3= driver.findElement(By.xpath("//*[@id='Occupation_detail']"));
	Thread.sleep(3000);
	ref3.sendKeys("All sec solutions");
	
	Thread.sleep(4000);
	BaseTest.click(rp.getCurrencytype());
	Thread.sleep(4000);
	BaseTest.click(rp.getSearchbar());
	Thread.sleep(4000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 7, 7)+"')]")));

	
	Thread.sleep(4000);
	BaseTest.click(rp.getAnnualincome());
	try {
		
		Thread.sleep(4000);
		BaseTest.click(rp.getSearchbar());
		Thread.sleep(4000);
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 7, 8)+"')]")));
		
	} catch (Exception e2) {
		System.out.println("not in excel");
	}
	
	try {
		WebElement inc=driver.findElement(By.xpath("(//*[@id='Annual_income'])[2]"));
		inc.sendKeys("500000");
	} catch (Exception e2) {
		System.out.println("no exception");
	}
	
	Thread.sleep(4000);
	BaseTest.click(rp.getBasicdetailsave());
	
	Thread.sleep(4000);
	BaseTest.getScreenshot(driver, "PI Professional Information popup");
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click(); 
	
	
	//location
	  
	  Thread.sleep(4000);
	  BaseTest.click(rp.getLocation());
	  
	  Thread.sleep(4000);
	  BaseTest.click(rp.getCountry());
	  Thread.sleep(4000);
		BaseTest.click(rp.getSearchbar());
		Thread.sleep(4000);
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 10, 1)+"')]")));
		
		Thread.sleep(4000);
		BaseTest.click(rp.getState());
		Thread.sleep(4000);
		BaseTest.click(rp.getSearchbar());
		Thread.sleep(4000);
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 10, 2)+"')]")));
	
	    Thread.sleep(4000);
	    BaseTest.click(rp.getCity());
	    Thread.sleep(4000);
		BaseTest.click(rp.getSearchbar());
		Thread.sleep(4000);
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 10, 3)+"')]")));
		 
	//	try {
		//	Thread.sleep(4000);
		//	BaseTest.click(rp.getResidentstatus());
			
	//	} catch (Exception e2) {
	//	System.out.println("no resident");
	//	}
	
		Thread.sleep(8000);
		BaseTest.click(rp.getCitizenship());
		Thread.sleep(4000);
		BaseTest.click(rp.getSearchbar());
		Thread.sleep(4000);
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 10, 5)+"')]")));
		
			
			Thread.sleep(4000);
			BaseTest.click(rp.getBasicdetailsave());
			
			Thread.sleep(4000);
			BaseTest.getScreenshot(driver, "PI Location popup");
				
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click(); 
			
			
	  //Family Details
	  
	  Thread.sleep(4000);
	  BaseTest.click(rp.getFamilydetails());
	  Thread.sleep(4000);
	  BaseTest.click(rp.getFamilyvalue());
	  Thread.sleep(4000);
	  BaseTest.click(rp.getSearchbar());
		Thread.sleep(4000);
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 13, 1)+"')]")));
		
	   Thread.sleep(4000);
	   BaseTest.click(rp.getFamilytype());
	   Thread.sleep(4000);
		  BaseTest.click(rp.getSearchbar());
			Thread.sleep(4000);
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 13, 2)+"')]")));
			
			Thread.sleep(4000);
			BaseTest.click(rp.getFamilystatus());
			Thread.sleep(4000);
			  BaseTest.click(rp.getSearchbar());
				Thread.sleep(4000);
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 13, 3)+"')]")));
	  
	  Thread.sleep(4000);
	  WebElement ref4=driver.findElement(By.xpath("//*[@id='Father_Occupation']"));
	  ref4.sendKeys("Doctor");
	  
	  Thread.sleep(4000);
	  WebElement ref5=driver.findElement(By.xpath("//*[@id='Mother_Occupation']"));
	  ref5.sendKeys("Housewife");
	  
	  Thread.sleep(4000);
	  WebElement ref6=driver.findElement(By.xpath("//*[@id='Family_Origin']"));
	  ref6.sendKeys("Chennai");
	  
	  Thread.sleep(4000);
	  BaseTest.click(rp.getNoofbrothers());
	  Thread.sleep(4000);
	  BaseTest.click(rp.getSearchbar());
		Thread.sleep(4000);
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 13, 7)+"')]")));
	  
		Thread.sleep(4000);
		BaseTest.click(rp.getNoofsisters());
		Thread.sleep(4000);
		  BaseTest.click(rp.getSearchbar());
			Thread.sleep(4000);
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 13, 8)+"')]")));
		  
	  Thread.sleep(4000);
	  BaseTest.click(rp.getBasicdetailsave());
	 
	  Thread.sleep(4000);
	  BaseTest.getScreenshot(driver, "PI Family Details Popup");
	  
	  
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		
}
}