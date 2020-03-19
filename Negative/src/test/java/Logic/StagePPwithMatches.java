package Logic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
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
import pom.StagePPwithMatchesPom;


public class StagePPwithMatches extends BaseTest {
	
		String incomewcsm1;
		String dosham;
		String subcaste;
		String religion;
		String dosham12;
		String subcaste12;
		String denomination;
		String denomination1;
		String wcsmfromage;
		String wcsmtoage;
		String ppstartage;
		String ppsendage;
		String physicalstatus;
	    int	finalincomepp;
		int annualinc;
		 int maleagenumber ;
		 int maleagenumberfromwcsm ;
		 int maleagenumbertowcsm ;
		 String religion12;
			int one  ;
			int second ;
			int third ;
			int four ;
			int ten ;
			int fifteen;
			int a ;
			int b1;
			int b ;
			int c ;
			int d ;
			int e ;
			int f;
			int seventy;
			
			String Unmarried;
			String WidoworWidower;
			String Divorced;
			String Separated;
			String Doesntmatter,star;
		private static final String Data = null;
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
	          
	           
	           
//	           ExtentReports report;
//	           ExtentTest logger;
//	           private String reportDirectory = "reports";
//	           private String reportFormat = "xml";
//	           private String testName = "Untitled";
//	           protected AndroidDriver<AndroidElement> driver = null;
//
//	           DesiredCapabilities dc = new DesiredCapabilities();
//	           
//	           @BeforeTest
//	           public void setUp() throws MalformedURLException {
//	           	   dc.setCapability("reportDirectory", reportDirectory);
//	                  dc.setCapability("reportFormat", reportFormat);
//	                  dc.setCapability("testName", testName);
//	                  dc.setCapability(MobileCapabilityType.UDID, "ZDHUTW49BMOZAU8T");
//	                  dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
//	                  dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
//	                  driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
//	                  driver.setLogLevel(Level.INFO);


	           
	       }
	       
	       @Test
	       public void testUntitled() throws Throwable {
	       	
	    	   StagePPwithMatchesPom rp= new StagePPwithMatchesPom(driver);
	       	Thread.sleep(4000);

			for (int k = 1; k <=1; k++) {
				String MatriID = BaseTest.getExcelData("Sheet5", k, 0);
				//System.err.println(MatriID);
				
	       	Thread.sleep(5000);
			    driver.get("https://mstage.communitymatrimony.com/cbsmob/login.php");
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
			    
			    //login
			    WebElement e123 = driver.findElement(By.xpath("//*[@id='idEmail']"));
				Actions a11 = new Actions(driver);
				Thread.sleep(4000);
				a11.sendKeys(e123, MatriID).build().perform();
				
				
			    
			    Thread.sleep(4000);
			    
			    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
			    Thread.sleep(4000);
				Actions b=new Actions(driver);
				Thread.sleep(4000);
				b.sendKeys(d,"cbstest").build().perform();
			    
			  Thread.sleep(4000);
			BaseTest.click(rp.getLogin());
			  
			
			
	Thread.sleep(4000);
			
			try {
				String title1=driver.getTitle();
				  System.out.println("Matrimony ID  :"+MatriID);
				  
			} catch (Exception e) {
				
			}
			
			try {
				Thread.sleep(8000);
				driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
				
				
			} catch (Exception e2) {
				//System.out.println("no element 1");
			}
			
			try {
				Thread.sleep(8000);
				driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a")).click();
				
				
			} catch (Exception e2) {
				//System.out.println("no element 2");
			}
			
			try {
				Thread.sleep(8000);
				driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a/span")).click();
				
				
			} catch (Exception e2) {
				//System.out.println("no element 3");
			}
			
			Thread.sleep(8000);
			BaseTest.click(rp.getEditpp());
			
			System.out.println("PP Informations:");
			
			 Thread.sleep(4000);
			  WebElement marital2=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[1]/div[2]"));
			  String partner=marital2.getText();
			  System.out.println("Marital Status = "+partner);
			  
//			  try {
//				  Thread.sleep(4000);
//				  WebElement havechild=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[2]/div[2]"));
//				  String child=havechild.getText();
//				  System.out.println("Have children :"+child);
//				  
//			} catch (Exception e2) {
//				System.out.println("no child");
//			}
			  
			  Thread.sleep(4000);
			  WebElement age=driver.findElement(By.xpath("(//div[contains(text(),'Age')]//following::div[1])[2]"));
			  String ppa=age.getText();
			  System.out.println("Age = "+ppa);
			  String[] split=ppa.split(" - ");
			// System.out.println("startage:"+split[0]);
			 int ppstartage=Integer.parseInt(split[0]);
		  String[] split1=ppa.split(" - ");
			  String[] split2=split1[1].split(" Yrs");
			  //System.out.println("endage:"+split2[0]);
			  int ppendage=Integer.parseInt(split2[0]);
			  String ppage=(split[0]+"-"+split2[0]);
			  //System.out.println("final pp age:"+ppage);
			  
			  Thread.sleep(4000);
			  WebElement height=driver.findElement(By.xpath("(//div[contains(text(),'Height')]//following::div[1])[2]"));
			  String ppheight=height.getText();
			  System.out.println("Height = "+ppheight);
			  
			  Thread.sleep(4000);
			  WebElement mother=driver.findElement(By.xpath("(//div[contains(text(),'Mother Tongue')]//following::div[1])[2]"));
			  String tongue=mother.getText();
			  System.out.println("Mother Tongue = "+tongue);

			  Thread.sleep(4000);
			  WebElement physical=driver.findElement(By.xpath("//div[contains(text(),'Physical Status')]//following::div[1]"));
			  String physicalstatus=physical.getText();
			  System.out.println("PhysicalStatus = "+physicalstatus);

			  Thread.sleep(4000);
			  WebElement eating=driver.findElement(By.xpath("//div[contains(text(),'Eating Habits')]//following::div[1]"));
			  String eatinghabits=eating.getText();
			  System.out.println("EatingHabits = "+eatinghabits);

			  Thread.sleep(4000);
			  WebElement drinking=driver.findElement(By.xpath("//div[contains(text(),'Drinking Habits')]//following::div[1]"));
			  String drinkinghabits=drinking.getText();
			  System.out.println("DrinkingHabits = "+drinkinghabits);

			  Thread.sleep(4000);
			  WebElement smoking=driver.findElement(By.xpath("//div[contains(text(),'Smoking Habits')]//following::div[1]"));
			  String smokinghabits=smoking.getText();
			  System.out.println("SmokingHabits = "+smokinghabits);

			  
			  try {
				  Thread.sleep(4000);
				  WebElement rel=driver.findElement(By.xpath("(//div[contains(text(),'Denomination')]//following::div[1])[2]"));
				  String denomination=rel.getText();
				  System.out.println("Denomination = "+denomination);

			} catch (Exception e2) {
				
			}
			  
			  
			  try {
				  Thread.sleep(4000);
				  WebElement rel=driver.findElement(By.xpath("(//div[contains(text(),'Division')]//following::div[1])[2]"));
				  String division=rel.getText();
				  System.out.println("Division = "+division);

			} catch (Exception e2) {
				
			}
			  
			  
			  try {
				  Thread.sleep(4000);
				  WebElement rel=driver.findElement(By.xpath("(//div[contains(text(),'Religion')]//following::div[1])[2]"));
				  String religion=rel.getText();
				  System.out.println("Religion = "+religion);

			} catch (Exception e2) {
				
			}
			  
			  
			  
//			  try {
//				  Thread.sleep(4000);
//				  WebElement rel=driver.findElement(By.xpath("(//div[contains(text(),'Sect')]//following::div[1])[1]"));
//				  String religion=rel.getText();
//				  System.out.println("Religion :"+religion);
	//
//			} catch (Exception e2) {
//				
//			}
			  
			  
			  
			  
			 
			  try {
				  Thread.sleep(4000);
				  WebElement sub=driver.findElement(By.xpath("//div[contains(text(),'Subcaste')]//following::div[1]"));
				  String subcaste=sub.getText();
				  System.out.println("Subcaste = "+subcaste);

			} catch (Exception e2) {
				
			}
			  
			  try {
				  Thread.sleep(4000);
				  WebElement dosh=driver.findElement(By.xpath("(//div[contains(text(),'Dosham')]//following::div[1])[2]"));
				  String dosham=dosh.getText();
				  System.out.println("Dosham = "+dosham);
			} catch (Exception e2) {
				
			}
			  
	try {
		Thread.sleep(4000);
		  WebElement sta=driver.findElement(By.xpath("(//div[contains(text(),'Star')]//following::div[1])[2]"));
		  star=sta.getText();
		  System.out.println("Star ="+ star);
	} catch (Exception e2) {
		System.out.println("star value not edited.....");
	}
			  

	try {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[5]/div[2]/ul/li[1]/div[2]/span/span[2]")).click();
	} catch (Exception e2) {
		///System.out.println("no more fields");
	}

			  Thread.sleep(4000);
			  WebElement edu=driver.findElement(By.xpath("(//div[contains(text(),'Education')]//following::div[1])[2]"));
			  String edu1=edu.getText();
			  System.out.println("Education = "+edu1);

			    
			  Thread.sleep(4000);
			  WebElement occ=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[5]/div[2]/ul/li[2]/div[2]"));
			  String occpp=occ.getText();
			  System.out.println("Occupation = "+occpp);
			  
			  
			  Thread.sleep(4000);
			  WebElement income=driver.findElement(By.xpath("(//div[contains(text(),'Annual Income')]//following::div[1])[2]"));
			  String incomepp=income.getText();
			  System.out.println("Income = "+incomepp);
			  
			  try {
					String[] split11 = incomepp.split(" to");
					//System.out.println("split1:"+split11[0]);
					String[] split12 = split11[0].split(" Lakh");
					String[] split13=split12[0].split("Rs.");
					//System.out.println("income in pp:" + split13[1]);
					int finalincomepp = Integer.parseInt(split13[1]);
					//System.out.println("final income in pp :" + finalincomepp);

				} catch (Exception en) {
					System.out.println("Annual income is not specified....");
				}
			  
			  
			  
			  WebElement country=driver.findElement(By.xpath("(//div[contains(text(),'Country')]//following::div[1])[2]"));
			  String country1=country.getText();
			  System.out.println("Country = "+country1);
			  
			  WebElement citizen=driver.findElement(By.xpath("(//div[contains(text(),'Citizenship')]//following::div[1])[2]"));
			  String citizenship=citizen.getText();
			  System.out.println("Citizenship = "+citizenship);

			  //BACK CRUSOR///
			  Thread.sleep(4000);
			  driver.findElement(By.xpath("//*[@id='historyBack']")).click();
			  
			  Thread.sleep(4000);
			  BaseTest.click(rp.getMatches());
			  
			  Thread.sleep(4000);
			  driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row[1]/ion-grid/ion-row[1]/ion-col[2]/div[1]")).click();
			  
			  
			  Thread.sleep(4000);
			  WebElement age1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Age')]//following::ion-col[1])[1]"));
			  String matchage=age1.getText();
			  System.out.println("Age = "+matchage);
			  
			  
			  Thread.sleep(4000);
			  WebElement height1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Height')]//following::ion-col[1])[1]"));
			  String matchheight=height1.getText();
			  System.out.println("Height = "+matchheight);
			  
			  Thread.sleep(4000);
			  WebElement marital1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Marital Status')]//following::ion-col[1])"));
			  String matchmarital=marital1.getText();
			  System.out.println("Marital Status = "+matchmarital);
			  
			  Thread.sleep(4000);
			  WebElement mother1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Mother Tongue')]//following::ion-col[1])[1]"));
			  String matchmother=mother1.getText();
			  System.out.println("Mother Tongue = "+matchmother);

			  Thread.sleep(4000);
			  WebElement physical1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Physical Status')]//following::ion-col[1])[1]"));
			  String matchphysical=physical1.getText();
			  System.out.println("PhysicalStatus = "+matchphysical);

			  Thread.sleep(4000);
			  WebElement dosham1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Dosham')]//following::ion-col[1])[1]"));
			  String matchdosham=dosham1.getText();
			  System.out.println("Dosham = "+matchdosham);

			  Thread.sleep(4000);
			  WebElement religion1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Religion')]//following::ion-col[1])[1]"));
			  String matchreligion=religion1.getText();
			  System.out.println("Religion = "+matchreligion);

			  Thread.sleep(4000);
			  WebElement star1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Star')]//following::ion-col[1])[1]"));
			  String matchstar=star1.getText();
			  System.out.println("Star = "+matchstar);

			  Thread.sleep(4000);
			  WebElement Subcaste1=driver.findElement(By.xpath("(//ion-col[contains(text(),'Subcaste')]//following::ion-col[1])[1]"));
			  String matchSubcaste=Subcaste1.getText();
			  System.out.println("Subcaste = "+matchSubcaste);

			  
			  Thread.sleep(4000);
			  WebElement education1=driver.findElement(By.xpath("(//div[contains(text(),'Education')]//following::div[1])[2]"));
			  String matcheducation=edu.getText();
			  System.out.println("Education = "+matcheducation);

			    
			  Thread.sleep(4000);
			  WebElement occupation1=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[5]/div[2]/ul/li[2]/div[2]"));
			  String matchoccupation=occupation1.getText();
			  System.out.println("Occupation = "+matchoccupation);
			  
			  
			  Thread.sleep(4000);
			  WebElement income1=driver.findElement(By.xpath("(//div[contains(text(),'Annual Income')]//following::div[1])[2]"));
			  String matchincome=income1.getText();
			  System.out.println("Income = "+matchincome);
			  
			  try {
					String[] split11 = incomepp.split(" to");
					//System.out.println("split1:"+split11[0]);
					String[] split12 = split11[0].split(" Lakh");
					String[] split13=split12[0].split("Rs.");
					//System.out.println("income in pp:" + split13[1]);
					int finalincomepp = Integer.parseInt(split13[1]);
					//System.out.println("final income in pp :" + finalincomepp);

				} catch (Exception en) {
					System.out.println("Annual income is not specified....");
				}
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			}  }
	       }