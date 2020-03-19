package logic;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTest;
import pom.DashboardValidationPOM;


public class DashboardValidation {
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
		DashboardValidationPOM rp= new DashboardValidationPOM(driver);
		Thread.sleep(4000);
		driver.get("https://mstage.communitymatrimony.com/cbsmob/login.php");
		driver.manage().window().maximize();
		
		 WebElement e=driver.findElement(By.xpath("//*[@id='loginpage']/div[1]/div[2]/div/form/div[1]"));
			Actions a=new Actions(driver);
			Thread.sleep(4000);
			a.sendKeys(e,"agr754132").build().perform();
		    
		    Thread.sleep(4000);
		    
		    WebElement d=driver.findElement(By.xpath("//*[@id='matripassword1']"));
		    Thread.sleep(4000);
			Actions b=new Actions(driver);
			Thread.sleep(4000);
			b.sendKeys(d,"cbstest").build().perform();
		    
		    Thread.sleep(4000);
		    BaseTest.click(rp.getLogin());
		try {
		    
			Thread.sleep(8000);
			WebElement member =driver.findElement(By.xpath("//h2[@class='pos_t5']"));      
			String a1=member.getText();
			System.out.println("member :"+a1);    //ion-label[@class='label label-md']//h2[contains(text(),'Diamond Member')]
			                                      //h2[contains(text(),'Diamond Member')]
		} catch (Exception e2) {
			System.out.println("not a paid member");
		}
		    
//		Thread.sleep(8000);
//		WebElement member =driver.findElement(By.xpath("//h2[contains(text(),'Diamond Member')]"));      
//		String a1=member.getText();
//		System.out.println("member :"+a1);    //ion-label[@class='label label-md']//h2[contains(text(),'Diamond Member')]
//		
		try {
			Thread.sleep(4000);
			WebElement left=driver.findElement(By.xpath("(//ion-label[@class='label label-md'])[16]"));
			String b1=left.getText();
			System.out.println("day left :"+b1);
			
		} catch (Exception e2) {
			System.out.println("no day left");
		}
		
		try {
			Thread.sleep(4000);
			WebElement left=driver.findElement(By.xpath("(//ion-label[@class='label label-md'])[15]"));
			String b1=left.getText();
			System.out.println("day left :"+b1);
			
		} catch (Exception e2) {
			System.out.println("no day left");
		}
		
		try {
			Thread.sleep(4000);
			WebElement interest=driver.findElement(By.xpath("(//ion-item[@class='odd_evenbg no-line posrelative item item-block item-md']//span[@class])[1]"));
			String c1=interest.getText();
			System.out.println("interest received :"+c1);
			
		} catch (Exception e2) {
			System.out.println("no interest received");
		}
		
		try {
			Thread.sleep(4000);
			WebElement pending=driver.findElement(By.xpath("//ion-segment-button[@value='PENDING']"));
			String f1=pending.getText();
			System.out.println("pending :"+f1);
			
		} catch (Exception e2) {
			System.out.println("no pending");
		}

//		
//		try {
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//div[contains(text(),'GOT IT')]")).click();
//			
//		} catch (Exception e2) {
//			System.out.println("no exception");
//		}
//		
//		try {
//			Thread.sleep(4000);
//			driver.findElement(By.xpath("//div[@class='okgotit']")).click();
//			
//		} catch (Exception e2) {
//			System.out.println("no exception");
//		}
		
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//div[contains(text(),'GOT IT')]")).click();
//		
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[1]")).click();
//		
		try {
			Thread.sleep(4000);
			WebElement profile=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-content/div[2]/ion-grid[1]/ion-row/ion-col/ion-list/div/ion-item[2]"));
			String d1=profile.getText();
			System.out.println("profile viewed :"+d1);
			
		} catch (Exception e2) {
			System.out.println("no profile viewed");
		}
		try {

			Thread.sleep(4000);
			WebElement respond=driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-content/div[2]/ion-grid[1]/ion-row/ion-col/ion-list/div/ion-item[3]"));
			String e1=respond.getText();
			System.out.println("Members yet to respond :"+e1);
			
		} catch (Exception e2) {
			System.out.println("no members yet to respond");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}