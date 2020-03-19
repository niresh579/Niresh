package Logic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
import pom.EditPPPOM;
import pom.SearchPom;

public class Search extends BaseTest {
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\Negative\\drivernew\\chromedriver.exe"; 

	 
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
       public void testUntitled() throws Throwable {
       	
    	   SearchPom rp= new SearchPom(driver);
       	Thread.sleep(5000);
		    driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    
		    
		    //login
		    WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
			Actions a=new Actions(driver);
			Thread.sleep(4000);
			a.sendKeys(e,"AGR451052").build().perform();
		    
		    Thread.sleep(4000);
		    
		    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
		    Thread.sleep(4000);
			Actions b=new Actions(driver);
			Thread.sleep(4000);
			b.sendKeys(d,"cbstest").build().perform();
		    
		  Thread.sleep(4000);
		BaseTest.click(rp.getLogin());
        Thread.sleep(8000);
		
		Thread.sleep(4000);
		BaseTest.click(rp.getSearch1());
		
//		FileInputStream fis = new FileInputStream("E:\\Book1.xls");
//		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		 XSSFSheet sheet = workbook.getSheet("Sheet1");
//		 Row row = sheet.createRow(1);
//		 Cell cell = row.createCell(1);
//		 cell.setCellType(cell.CELL_TYPE_STRING);
//		 cell.setCellValue("SoftwareTestingMaterial.com");
//		 FileOutputStream fos = new FileOutputStream("E:\\Book1.xls");
//		 workbook.write(fos);
//		 fos.close();
//		 System.out.println("END OF WRITING DATA IN EXCEL");
//		
		
		
		
	//	Thread.sleep(4000);
	//	BaseTest.click(rp.getId());
		
	//	Thread.sleep(4000);  
	//	BaseTest.getExcelData1("search", 1, 1);
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Search By Id']")).sendKeys(String.valueOf(BaseTest.getExcelData1("search", 1, 1)));
	
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='search_icon']")).click();
		
	try {
		Thread.sleep(4000);
		String text=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-viewprofile/ion-content/div[2]/ion-grid[2]/ion-row[1]/ion-col/p")).getText();
		System.out.println(text);
		
	} catch (Exception e2) {
	
	}
	
	
	try {
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-viewprofile/ion-content/div[2]/ion-grid[1]/ion-row[2]/ion-col[1]")).click();
		
	} catch (Exception e2) {
		
	}
		
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[@class='ficon icon-back font14']")).click();
		
	//keyword search
	//edit
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[@class='clrlblue pos_t5 font12']")).click();
	
	//age
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[1]/ion-row[1]/ion-col/form/div[2]/ion-list[1]/ion-item[1]")).click();
		
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[@ion-button='item-cover'])[17]")).click();
		
	Thread.sleep(4000);	
	driver.findElement(By.xpath("(//span[@class='button-inner'])[31]")).click();
		
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[@ion-button='item-cover'])[18]")).click();
			
	Thread.sleep(4000);	
	driver.findElement(By.xpath("(//span[@class='button-inner'])[45]")).click();
		
	Thread.sleep(4000);
	BaseTest.click(rp.getTick());
		
//height
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[1]/ion-row[1]/ion-col/form/div[2]/ion-list[1]/ion-item[2]/div[1]")).click();
		
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[@ion-button='item-cover'])[17]")).click();
		
	Thread.sleep(4000);	
	driver.findElement(By.xpath("(//span[@class='button-inner'])[31]")).click();
		
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[@ion-button='item-cover'])[18]")).click();
			
	Thread.sleep(4000);	
	driver.findElement(By.xpath("(//span[@class='button-inner'])[45]")).click();
		
	Thread.sleep(4000);
	BaseTest.click(rp.getTick());	
	
	//marital status
		
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[1]/ion-list/ion-item[3]/div[1]/div")).click();
		
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='button-inner'])[26]")).click();
	
	Thread.sleep(4000);
	BaseTest.click(rp.getTick());
		
	//Dosham
	
	Thread.sleep(4000);	
	driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[1]/ion-row[1]/ion-col/form/div[2]/ion-list[2]/ion-item/div[1]")).click();
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='button-inner'])[26]")).click();
	
	Thread.sleep(4000);
	BaseTest.click(rp.getTick());
	
	//show profile and don't show profile	
		
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='button-inner'])[7]")).click();
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='button-inner'])[8]")).click();
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='button-inner'])[9]")).click();
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='button-inner'])[10]")).click();
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='button-inner'])[11]")).click();
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//span[@class='button-inner'])[12]")).click();
	
	//keyword search button
	
	Thread.sleep(4000);
	WebElement srch=driver.findElement(By.xpath("(//input[@class='searchbar-input'])[2]"));
	srch.sendKeys("Tamilnadu");
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[contains(text(),'GO')]")).click();
		
	try {
		Thread.sleep(4000);
		WebElement txt=driver.findElement(By.xpath("(//span[@class='matriid_txt'])[1]"));
		String keysearch=txt.getText();
		System.out.println(keysearch);
	} catch (Exception e2) {
	}
	
	
	try {
		Thread.sleep(4000);
		WebElement txt=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/page-matches/ion-content/div[2]/div/div"));
		String keysearch=txt.getText();
		System.out.println(keysearch);
	} catch (Exception e2) {
	}
		
	Thread.sleep(4000);
	driver.findElement(By.xpath("//span[@class='ficon icon-back font14 paddr10']")).click();
	
///regular search
	
	//age
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[1]/ion-list/ion-item[1]/div[1]/div")).click();
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='button-inner'])[20]")).click();
			
		Thread.sleep(4000);	
		driver.findElement(By.xpath("(//span[@class='button-inner'])[32]")).click();
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='button-inner'])[21]")).click();
				
		Thread.sleep(4000);	
		driver.findElement(By.xpath("(//span[@class='button-inner'])[46]")).click();
			
		Thread.sleep(4000);
		BaseTest.click(rp.getTick());
			
	//height
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[1]/ion-list/ion-item[2]/div[1]/div")).click();
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='button-inner'])[20]")).click();
			
		Thread.sleep(4000);	
		driver.findElement(By.xpath("(//span[@class='button-inner'])[32]")).click();
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='button-inner'])[21]")).click();
				
		Thread.sleep(4000);	
		driver.findElement(By.xpath("(//span[@class='button-inner'])[46]")).click();
			
		Thread.sleep(4000);
		BaseTest.click(rp.getTick());	
		
		//marital status
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[1]/ion-list/ion-item[3]/div[1]/div")).click();
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='button-inner'])[20]")).click();
		
		Thread.sleep(4000);
		BaseTest.click(rp.getTick());
			
	//subcaste
	
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[1]/div[1]/div")).click();
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='button-inner'])[20]")).click();
		
		Thread.sleep(4000);
		BaseTest.click(rp.getTick());
			
	//mothertongue
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[2]/div[1]/div")).click();
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='button-inner'])[24]")).click();
		
		Thread.sleep(4000);
		BaseTest.click(rp.getTick());
			
	//star
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[3]/div[1]/div")).click();
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='button-inner'])[22]")).click();
		
		Thread.sleep(4000);
		BaseTest.click(rp.getTick());
			
	//gothra
	
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[4]/div[1]/div")).click();
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='button-inner'])[22]")).click();
		
		Thread.sleep(4000);
		BaseTest.click(rp.getTick()); 
			
	//dosham	
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[5]/div[1]/div")).click();
			
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='button-inner'])[20]")).click();
		
		Thread.sleep(4000);
		BaseTest.click(rp.getTick());
			
		//country	
		
		Thread.sleep(8000);
	   	JavascriptExecutor js2 = (JavascriptExecutor)driver;
	   	  WebElement edi2= driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[6]/div[1]/div"));
		  	  js2.executeScript("arguments[0].scrollIntoView(true);",edi2);
		
				Thread.sleep(4000);
				driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[6]/div[1]/div")).click();
					
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[@class='button-inner'])[24]")).click();
				
				Thread.sleep(4000);
				BaseTest.click(rp.getTick());
					
		//education
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[7]/div[1]/div")).click();
					
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[@class='button-inner'])[23]")).click();
				
				Thread.sleep(4000);
				BaseTest.click(rp.getTick());
		
		//occupation
		
				Thread.sleep(4000);
				driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[9]/div[1]/div")).click();
					
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[@class='button-inner'])[23]")).click();
				
				Thread.sleep(4000);
				BaseTest.click(rp.getTick());
		
		//annual income
		
				Thread.sleep(4000);
				driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/ion-grid[2]/ion-row/ion-col/form/div[2]/ion-list/ion-item[10]/div[1]/div")).click();
					
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[@class='button-inner'])[20]")).click();
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[@class='button-inner'])[24]")).click();
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[@class='button-inner'])[21]")).click();
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[@class='button-inner'])[25]")).click();
				
				
				Thread.sleep(4000);
				BaseTest.click(rp.getTick());
		
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[@class='button-inner'])[9]")).click();
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[@class='button-inner'])[10]")).click();
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[@class='button-inner'])[11]")).click();
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[@class='button-inner'])[12]")).click();
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[@class='button-inner'])[13]")).click();
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[@class='button-inner'])[14]")).click();
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[@class='button-inner'])[15]")).click();
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[@class='button-inner'])[16]")).click();
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[@class='button-inner'])[17]")).click();
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//span[@class='button-inner'])[18]")).click();
				
		//search now
				Thread.sleep(4000);
				driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-footer/ion-toolbar/div[2]/ion-grid/ion-row/ion-col[3]")).click();
				
				try {
					Thread.sleep(4000);
					WebElement txt=driver.findElement(By.xpath("(//span[@class='matriid_txt'])[1]"));
					String keysearch=txt.getText();
					System.out.println(keysearch);
				} catch (Exception e2) {
				}
				
				
				try {
					Thread.sleep(4000);
					WebElement txt=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-search/ion-content/div[2]/page-matches/ion-content/div[2]/div/div"));
					String keysearch=txt.getText();
					System.out.println(keysearch);
				} catch (Exception e2) {
				}
		
		
		
		
		
}
}






