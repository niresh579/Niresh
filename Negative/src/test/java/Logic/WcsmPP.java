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
import pom.EditPPPOM;
import pom.WcsmPPPOM;

public class WcsmPP extends BaseTest{
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
       	
       	WcsmPPPOM rp= new WcsmPPPOM(driver);
       	Thread.sleep(4000);

		for (int k = 1; k <=1; k++) {
			String MatriID = BaseTest.getExcelData("Sheet5", k, 0);
			//System.err.println(MatriID);
			
       	Thread.sleep(5000);
		    driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
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
		  
//		  try {
//			  Thread.sleep(4000);
//			  WebElement havechild=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[2]/div[2]"));
//			  String child=havechild.getText();
//			  System.out.println("Have children :"+child);
//			  
//		} catch (Exception e2) {
//			System.out.println("no child");
//		}
		  
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
		  
		  
		  
//		  try {
//			  Thread.sleep(4000);
//			  WebElement rel=driver.findElement(By.xpath("(//div[contains(text(),'Sect')]//following::div[1])[1]"));
//			  String religion=rel.getText();
//			  System.out.println("Religion :"+religion);
//
//		} catch (Exception e2) {
//			
//		}
		  
		  
		  
		  
		 
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
		  
//			try {
//				Thread.sleep(4000);
//				if (MatriID.startsWith("AGR")) {
//					Thread.sleep(2000);
//					driver.get("https://mobilestage.agarwalmatrimony.com/#/wcsm");
//				} else {
//
//				}
//				
//				
//			} catch (Exception e2) {
//				
//			}
//			
//			try {
//				Thread.sleep(4000);
//				if (MatriID.startsWith("CHR")) {
//					Thread.sleep(2000);
//					driver.get("https://mobilestage.christianmatrimony.com/#/wcsm");
//				} else {
//
//				}
//				
//				
//			} catch (Exception e2) {
//				
//			}
//			
//			
//			try {
//				Thread.sleep(4000);
//				if (MatriID.startsWith("BRH")) {
//					Thread.sleep(2000);
//					driver.get("https://mobilestage.brahminmatrimony.com/#/wcsm");
//				} else {
//
//				}
//				
//				
//			} catch (Exception e2) {
//				
//			}
//			try {
//				Thread.sleep(4000);
//				if (MatriID.startsWith("NAR")) {
//					Thread.sleep(2000);
//					driver.get("https://mobilestage.nairmatrimony.com/#/wcsm");
//				} else {
//
//				}
//				
//				
//			} catch (Exception e2) {
//				
//			}
//			try {
//				Thread.sleep(4000);
//				if (MatriID.startsWith("MUS")) {
//					Thread.sleep(2000);
//					driver.get("https://mobilestage.muslimmatrimony.com/#/wcsm");
//				} else {
//
//				}
//				
//				
//			} catch (Exception e2) {
//				
//			}
//			
			
			
			
			
			
			
			
			
			
			
			
		Thread.sleep(4000);
		BaseTest.click(rp.getSetting());
		
		///Privacy setting
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list/ion-item[5]")).click();
		
		//edit
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-grid[1]/ion-row/ion-col/ion-list/ion-item/div[1]/button/span")).click();
		
		
		
//		Thread.sleep(4000);
//		BaseTest.click(rp.getWhocanseeme());
//		  
			System.out.println("Who Can See Me Informations:");
			
		 Thread.sleep(4000);
		  WebElement agefrom=driver.findElement(By.xpath("(//div[@class='frmto'])[1]"));
		  String wcagefrom=agefrom.getText();
		  System.out.println("Age From = "+wcagefrom);
		  String[] split3=wcagefrom.split(" years");
		  //System.out.println("wcsmstartage:"+split3[0]);
		  int wcsmfromage=Integer.parseInt(split3[0]);
		  
		  if (wcsmfromage <= ppstartage) {
				System.out.println("PP & WCSM From Age is Matched" );
			}
			  
			else {
				System.err.println("PP & WCSM Age From is Not Matched");
			} 
			 
		  
		  
		  
		  Thread.sleep(4000);
		  WebElement ageto=driver.findElement(By.xpath("(//div[@class='frmto'])[2]"));
		  String wcageto=ageto.getText();
		  System.out.println("Age To = "+wcageto);
		  String[] split4=wcageto.split(" years");
		  //System.out.println("wcsmendage:"+split4[0]);
		  int wcsmtoage=Integer.parseInt(split4[0]);
		  
		  if (wcsmtoage >= ppendage) {
			  System.out.println("PP & WCSM To Age is Matched" );
			
		}else
			
			System.err.println("PP & WCSM Age To is Not Matched");
		  
		  
		  
		  WebElement marital=driver.findElement(By.xpath("(//div[@class='openPopUp_values no-break_line'])[1]"));
		  String maritalwcsm=marital.getText();
		  System.out.println("Marital Status = "+maritalwcsm);
		  
		  if (maritalwcsm.equals("Any")) {
				System.out.println("PP & WCSM Marital Status is Matched");
				} else if (partner.contains(maritalwcsm)) {
					System.out.println("PP & WCSM Marital Status is Matched");
				}else{
		System.err.println("PP & WCSM Marital Status is Not Matched");
				}
		  
		  	 
		  WebElement edu2=driver.findElement(By.xpath("//ion-label[contains(text(),'Education')]//following::div[1]"));
		  String edu21=edu2.getText();
		  System.out.println("Education  :"+edu21);
		  	 
		  if (edu21.equals("Any")) {
				System.out.println("PP & WCSM Education is Matched");
				} else if (edu1.contains(edu21)) {
					System.out.println("PP & WCSM Education is Matched");
				}else{
		System.err.println("PP & WCSM Education is Not Matched");
				}
		  
		  
		  
		  
		  Thread.sleep(4000);	
		  WebElement income3=driver.findElement(By.xpath("//ion-label[contains(text(),'Annual Income')]//following::div[1]"));
		  String incomewcsm=income3.getText();
		  System.out.println("Income = "+incomewcsm);
		  
		  
			Thread.sleep(4000);
			try {
				WebElement cd1 = driver.findElement(By.xpath("//div[contains(text(),'Occupation')]//following::div[1]"));
				String occupation = cd1.getText();
				System.out.println("Occupation = " + occupation);
			} catch (Exception cn) {
		System.out.println("occupation is Not specified");
			}
			
			Thread.sleep(4000);
			
			try {
				if (driver.findElement(By.xpath("//ion-label[contains(text(),'Annual Income')]//following::div[1]")).isDisplayed()) {
					Thread.sleep(4000);
					WebElement annualinc = driver.findElement(By.xpath("//ion-label[contains(text(),'Annual Income')]//following::div[1]"));
					String finalincomewcsm = income3.getText();
					System.out.println("Income = " + finalincomewcsm);
					
					if ((incomewcsm.contains("Any"))) {
						System.out.println("PP & WCSM Annualincome is Matched");

					}
					else {
						System.out.println("PP & WCSM Annualincome not updated as per PI....");
					}
					
				}
				
			} catch (Exception df) {
				 if (driver.findElement(By.xpath("(//div[contains(text(),'Rs.')])[1]")).isDisplayed()) {
						Thread.sleep(4000);
						WebElement income31 = driver.findElement(By.xpath("(//div[contains(text(),'Rs.')])[1]"));
						String incomewcsm1 = income31.getText();
						System.out.println("Income = " + incomewcsm1);

						String[] split7 = incomewcsm1.split(" Lakh");
						//System.out.println("inc wcsm1:" + split7[0]);
//						int incomewcsm=Integer.parseInt(split7[0]);
						

						String[] split8 = split7[0].split("Rs.");
						//System.out.println("inc wcsm1:" + split8[1]);

						int finalwcsmincome = Integer.parseInt(split8[1]);
						//System.out.println("finalwcsmincome:" + finalwcsmincome);
				 }}	
		  
			
			  
			  if (finalincomepp>=annualinc) {
				System.out.println("PP & WCSM Income is Matched");
			}
			  else {
					System.err.println("PP & WCSM Income is Not Matched");
				}
			
			
			
		  Thread.sleep(4000);
		  BaseTest.click(rp.getMorepreference());
		  
		  Thread.sleep(4000);
		  WebElement height3=driver.findElement(By.xpath("//ion-label[contains(text(),'Height')]//following::div[1]"));
		  String heightfrom=height3.getText();
		  System.out.println("Height From = "+heightfrom);
		  
		  if (heightfrom.equals("4ft")) {
			  System.out.println("PP & WCSM From Height is Matched");	
		}
		  else {
			System.err.println("PP & WCSM From Height is Not Matched");
		}
		  
  
		
		  
		  Thread.sleep(4000);
		  WebElement height4=driver.findElement(By.xpath("//ion-label[contains(text(),'Height')]//following::div[3]"));
		  String heightto=height4.getText();
		  System.out.println("Height To = "+heightto);
		  
		  if (heightto.equals("7ft 11in")) {
			  System.out.println("PP & WCSM To Height is Matched");	
			  
		}
		  else {
			System.err.println("PP & WCSM To Height is Not Matched");
		}
		  
		  Thread.sleep(4000);
		  WebElement mother1=driver.findElement(By.xpath("//ion-label[contains(text(),'Mother Tongue')]//following::div[1]"));
		  String tongue1=mother1.getText();
		  System.out.println("Mother Tongue = "+tongue1);
		  
		  if (tongue1.equals("Any")) {
				System.out.println("PP & WCSM Mother Tongue is Matched");
				} else if (tongue.contains(tongue1)) {
					System.out.println("PP & WCSM Mother Tongue is Matched");
				}else{
		System.err.println("PP & WCSM Mother Tongue is Not Matched");
				}
		

		  Thread.sleep(4000);
		  WebElement physical12=driver.findElement(By.xpath("//ion-label[contains(text(),'Physical Status')]//following::div[1]"));
		  String physicalstatus12=physical12.getText();
		  System.out.println("Physicalstatus = "+physicalstatus12);

		  Thread.sleep(4000);
		  if (physicalstatus12.equals("Doesn't Matter")) {
				System.out.println("PP & WCSM  Physical Status is Matched");
				} else if (physicalstatus.contains(physicalstatus12)) {
					System.out.println("PP & WCSM  Physical Status is Matched");
				}else if (physicalstatus.equals("Normal")) {
					System.out.println("PP & WCSM  Physical Status is Matched");
				}
				else{
		System.err.println("PP & WCSM  Physical Status is Not Matched");
				}
		  
		  Thread.sleep(4000);
		  WebElement eating12=driver.findElement(By.xpath("//ion-label[contains(text(),'Eating')]//following::div[1]"));
		  String eatinghabits12=eating12.getText();
		  System.out.println("Eatinghabits = "+eatinghabits12);
		  
		  if (eatinghabits12.equals("Doesn't Matter")) {
				System.out.println("PP & WCSM Eating Habit is Matched");
				} else if (eatinghabits.contains(eatinghabits12)) {
					System.out.println("PP & WCSM Eating Habit is Matched");
				}else{
		System.err.println("PP & WCSM Eating Habit is Not Matched");
				}

		  Thread.sleep(4000);
		  WebElement drinking12=driver.findElement(By.xpath("//ion-label[contains(text(),'Drinking')]//following::div[1]"));
		  String drinkinghabits12=drinking12.getText();
		  System.out.println("Drinkinghabits = "+drinkinghabits12);

		  if (drinkinghabits12.equals("Doesn't Matter")) {
				System.out.println("PP & WCSM Drinking Habit is Matched");
				} else if (drinkinghabits.contains(drinkinghabits12)) {
					System.out.println("PP & WCSM Drinking Habit is Matched");
				}else{
		System.err.println("PP & WCSM Drinking Habit is Not Matched");
				}
		  
		  Thread.sleep(4000);
		  WebElement smoking12=driver.findElement(By.xpath("//ion-label[contains(text(),'Smoking')]//following::div[1]"));
		  String smokinghabits12=smoking12.getText();
		  System.out.println("Smokinghabits = "+smokinghabits12);

		  
		  if (smokinghabits12.equals("Doesn't Matter")) {
				System.out.println("PP & WCSM Smoking Habit is Matched");
				} else if (smokinghabits.contains(smokinghabits12)) {
					System.out.println("PP & WCSM Smoking Habit is Matched");
				}else{
		System.err.println("PP & WCSM Smoking Habit is Not Matched");
				}
		  
		  
		  
		  try {
			  Thread.sleep(4000);
			  WebElement rel12=driver.findElement(By.xpath("(//ion-label[contains(text(),'Religion')]//following::div[1])[2]"));
			  String religion12=rel12.getText();
			  System.out.println("Religion = "+religion12);

			  Thread.sleep(4000);
			  if (religion12.equals("Any")) {
					System.out.println("PP & WCSM Religion is Matched");
					} else if (religion.contains(religion12)) {
						System.out.println("PP & WCSM Religion is Matched");
					}else{
			System.err.println("PP & WCSM Religion is Not Matched");
					}
		} catch (Exception e2) {
		}
		  
		  
		  
		  
		  try {
				Thread.sleep(4000);
				WebElement acig111 = driver.findElement(By.xpath("(//ion-label[contains(text(),'Denomination')]//following::div[1])[3]"));
				String denomination1 = acig111.getText();
				System.out.println("Denomination = " + denomination1);
				
				Thread.sleep(4000);
				  if (denomination1.equals("Any")) {
						System.out.println("PP & WCSM  Denomination is Matched");
						} else if (denomination.contains(denomination1)) {
							System.out.println("PP & WCSM  Denomination is Matched");
						}else{
				System.err.println("PP & WCSM  Denomination is Not Matched");
						}
			} catch (Exception e) {
			}
		  
		  
		 
		  try {
			  Thread.sleep(4000);
			  WebElement sub12=driver.findElement(By.xpath("//ion-label[contains(text(),'Subcaste')]//following::div[1]"));
			  String subcaste12=sub12.getText();
			  System.out.println("Subcaste = "+subcaste12);
			  if (subcaste12.equals("Any")) {
					System.out.println("PP & WCSM Subcaste is Matched");
					} else if (subcaste.contains(subcaste12)) {
						System.out.println("PP & WCSM Subcaste is Matched");
					}else{
			System.err.println("PP & WCSM Subcaste is Not Matched");
					}
		} catch (Exception e2) {
		}
		  
		  
		  try {
			  Thread.sleep(4000);
			  WebElement dosh12=driver.findElement(By.xpath("//ion-label[contains(text(),'Manglik')]//following::div[1]"));
			  String dosham12=dosh12.getText();
			  System.out.println("Dosham = "+dosham12);
			  if (dosham12.equals("Doesn't matter")) {
					System.out.println("PP & WCSM Dosham is Matched");
					} else if (dosham.contains(dosham12)) {
						System.out.println("PP & WCSM Dosham is Matched");
					}else{
			System.err.println("PP & WCSM Dosham is Not Matched");
					}
		} catch (Exception e2) {
			System.out.println("PP & WCSM Dosham is Matched");
		}
		  
		  try {
			  Thread.sleep(4000);
			  WebElement dosh12=driver.findElement(By.xpath("//ion-label[contains(text(),'Chevvai')]//following::div[1]"));
			  String dosham12=dosh12.getText();
			  System.out.println("Dosham = "+dosham12);
			  if (dosham12.equals("Doesn't matter")) {
					System.out.println("PP & WCSM Dosham is Matched");
					} else if (dosham.contains(dosham12)) {
						System.out.println("PP & WCSM Dosham is Matched");
					}else{
			System.err.println("PP & WCSM Dosham is Not Matched");
					}
		} catch (Exception e2) {
		}
		  
		  
		  try {
			  Thread.sleep(4000);
			  WebElement sta12=driver.findElement(By.xpath("//ion-label[contains(text(),'Star')]//following::div[1]"));
			  String star12=sta12.getText();
			  System.out.println("Star = "+star12);

			  Thread.sleep(4000);
			  if (star12.equals("Any")) {
					System.out.println("PP & WCSM Star is Matched");
					} else if (star.contains(star12)) {
						System.out.println("PP & WCSM Star is Matched");
					}else{
			System.err.println("PP & WCSM Star is Not Matched");
					}
		} catch (Exception e) {
			System.out.println("No star present");
		}
		  
		    
		  Thread.sleep(4000);
		  WebElement occ12=driver.findElement(By.xpath("//ion-label[contains(text(),'Occupation')]//following::div[1]"));
		  String occpp12=occ12.getText();
		  System.out.println("Occupation = "+occpp12);
		  
		  if (occpp12.equals("Any")) {
				System.out.println("PP & WCSM Occupation is Matched");
				} else if (occpp.contains(occpp12)) {
					System.out.println("PP & WCSM Occupation is Matched");
				}else{
		System.err.println("PP & WCSM Occupation is Not Matched");
				}
		  
		  
		  WebElement country12=driver.findElement(By.xpath("//ion-label[contains(text(),'Country')]//following::div[1]"));
		  String country121=country12.getText();
		  System.out.println("Country  = "+country121);
		  
		   
		  if (country121.equals("Any")) {
				System.out.println("PP & WCSM Country is Matched");
				} else if (country1.contains(country121)) {
					System.out.println("PP & WCSM Country is Matched");
				}else{
		System.err.println("PP & WCSM Country is Not Matched");
				}
		    
		  
		  WebElement citizen12=driver.findElement(By.xpath("//ion-label[contains(text(),'Citizenship')]//following::div[1]"));
		  String citizenship12=citizen12.getText();
		  System.out.println("Citizenship  = "+citizenship12);  
		  
		  if (citizenship12.equals("Any")) {
				System.out.println("PP & WCSM Citizenship is Matched");
				} else if (citizenship.contains(citizenship12)) {
					System.out.println("PP & WCSM Citizenship is Matched");
				}else{
		System.err.println("PP & WCSM Citizenship is Not Matched");
				}
		 
			
		 
				
		
			
		  
		 
			
		
		  
		  
	  
		  
		
		 
			  
		 
		    
		
		  
		 
		  
		  
		
		  
		 
}
}
}   
