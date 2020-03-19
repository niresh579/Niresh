package Logic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
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
import pom.EditPPPOM;

public class WcsmEditPP extends BaseTest{
	 int maleagenumber ;
	 int maleagenumberfromwcsm ;
	 int maleagenumbertowcsm ;
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
       	
       	EditPPPOM rp= new EditPPPOM(driver);
       	Thread.sleep(5000);
        driver.get("https://mstage.communitymatrimony.com/cbsmob/login.php");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
	    //login
	    WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
		Actions a=new Actions(driver);
		Thread.sleep(4000);
		a.sendKeys(e,"AGR102859").build().perform();
	    
		    Thread.sleep(4000);
		    
		    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
		    Thread.sleep(4000);
			Actions b=new Actions(driver);
			Thread.sleep(4000);
			b.sendKeys(d,"cbstest").build().perform();
		    
		  Thread.sleep(4000);
		BaseTest.click(rp.getLogin());
		  
		try {
			Thread.sleep(8000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
			
			
		} catch (Exception e2) {
			System.out.println("no element 1");
		}
		
		try {
			Thread.sleep(8000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a")).click();
			
			
		} catch (Exception e2) {
			System.out.println("no element 2");
		}
		
		try {
			Thread.sleep(8000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a/span")).click();
			
			
		} catch (Exception e2) {
			System.out.println("no element 3");
		}
		
		Thread.sleep(4000);
		BaseTest.click(rp.getEditpp());

		System.out.println("Partner Preference Information before editing");
		
		///before editing////
		
		 Thread.sleep(4000);
		  WebElement marital212=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[1]/div[2]"));
		  String partner212=marital212.getText();
		  System.out.println("Marital Status :"+partner212);
		  
		  try {
			  Thread.sleep(4000);
			  WebElement havechild12=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[2]/div[2]"));
			  String child12=havechild12.getText();
			  System.out.println("Have children  :"+child12);
			  
		} catch (Exception e2) {
			System.out.println("no child");
		}
		  
		  Thread.sleep(4000);
		  WebElement age141=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[3]/div[2]"));
		  String ppa141=age141.getText();
		  System.out.println("Age :"+ppa141);
//		  String[] split=ppa.split(" - ");
//		 System.out.println("startage:"+split[0]);
//		 int ppstartage=Integer.parseInt(split[0]);
//	  String[] split1=ppa.split(" - ");
//		  String[] split2=split1[1].split(" Yrs");
//		  System.out.println("endage:"+split2[0]);
//		  int ppendage=Integer.parseInt(split2[0]);
//		  String ppage=(split[0]+"-"+split2[0]);
//		  System.out.println("final pp age:"+ppage);
//		  
		  Thread.sleep(4000);
		  WebElement height141=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[4]/div[2]"));
		  String ppheight141=height141.getText();
		  System.out.println("Height :"+ppheight141);
		  
		  Thread.sleep(4000);
		  WebElement mother141=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[5]/div[2]/span"));
		  String tongue141=mother141.getText();
		  System.out.println("Mother Tongue :"+tongue141);

		  Thread.sleep(4000);
		  WebElement physical121=driver.findElement(By.xpath("(//div[contains(text(),'Physical Status')]//following::div[1])[2]"));
		  String physicalstatus121=physical121.getText();
		  System.out.println("Physical Status:"+physicalstatus121);

		  Thread.sleep(4000);
		  WebElement eating=driver.findElement(By.xpath("//div[contains(text(),'Eating Habits')]//following::div[1]"));
		  String eatinghabits=eating.getText();
		  System.out.println("EatingHabits:"+eatinghabits);

		  Thread.sleep(4000);
		  WebElement drinking=driver.findElement(By.xpath("//div[contains(text(),'Drinking Habits')]//following::div[1]"));
		  String drinkinghabits=drinking.getText();
		  System.out.println("DrinkingHabits :"+drinkinghabits);

		  Thread.sleep(4000);
		  WebElement smoking=driver.findElement(By.xpath("//div[contains(text(),'Smoking Habits')]//following::div[1]"));
		  String smokinghabits=smoking.getText();
		  System.out.println("SmokingHabits :"+smokinghabits);

		  Thread.sleep(4000);
		  WebElement rel=driver.findElement(By.xpath("(//div[contains(text(),'Religion')]//following::div[1])[2]"));
		  String religion=rel.getText();
		  System.out.println("Religion :"+religion);

		  Thread.sleep(4000);
		  WebElement sub123=driver.findElement(By.xpath("//div[contains(text(),'Subcaste')]//following::div[1]"));
		  String subcaste123=sub123.getText();
		  System.out.println("Subcaste :"+subcaste123);

		  Thread.sleep(4000);
		  WebElement dosh141=driver.findElement(By.xpath("(//div[contains(text(),'Dosham')]//following::div[1])[2]"));
		  String dosham141=dosh141.getText();
		  System.out.println("Dosham:"+dosham141);
try {
	Thread.sleep(4000);
	  WebElement sta=driver.findElement(By.xpath("(//div[contains(text(),'Star')]//following::div[1])[2]"));
	  star=sta.getText();
	  System.out.println("Star :"+ star);
} catch (Exception e2) {
	System.out.println("star value not edited.....");
}
		  

		  Thread.sleep(4000);
		  WebElement edu56=driver.findElement(By.xpath("(//div[contains(text(),'Education')]//following::div[1])[2]"));
		  String edu156=edu56.getText();
		  System.out.println("Education :"+edu156);

		    
		  Thread.sleep(4000);
		  WebElement occ141=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[5]/div[2]/ul/li[2]/div[2]"));
		  String occpp141=occ141.getText();
		  System.out.println("Occupation :"+occpp141);
		  
		  
		  Thread.sleep(4000);
		  WebElement income132=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[5]/div[2]/ul/li[3]/div[2]"));
		  String incomepp141=income132.getText();
		  System.out.println("Income :"+incomepp141);
		  
		  WebElement country141=driver.findElement(By.xpath("(//div[contains(text(),'Country')]//following::div[1])[2]"));
		  String country14=country141.getText();
		  System.out.println("Country :"+country14);
		  
		  WebElement citizen141=driver.findElement(By.xpath("(//div[contains(text(),'Citizenship')]//following::div[1])[2]"));
		  String citizenship141=citizen141.getText();
		  System.out.println("Citizenship :"+citizenship141);
		  
		  
		
		
		  Thread.sleep(8000);
			JavascriptExecutor js3 = (JavascriptExecutor)driver;
			  WebElement edi3= driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[1]/div[2]"));
		  	  js3.executeScript("arguments[0].scrollIntoView(false);",edi3);
		
		Thread.sleep(4000);
		BaseTest.click(rp.getBasicdetails());

		Thread.sleep(4000);
		BaseTest.click(rp.getMaritalstatus());
    
		Thread.sleep(4000);
		WebElement marital=driver.findElement(By.xpath("//*[@id='chkbox4']"));
		if (marital.isEnabled()) {
			System.out.println("älready selected");
		}
		else {
			marital.click();
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		
		
		Thread.sleep(4000);
		BaseTest.click(rp.getHavechildren());
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		
		Thread.sleep(4000);
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("pp", 1, 2)+"')]")));
		
		Thread.sleep(4000);
		BaseTest.click(rp.getHeightfrom());
		
		Thread.sleep(4000);
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData1("pp", 1, 3)+"')]")));
		
		Thread.sleep(4000);
		BaseTest.click(rp.getHeightto());
		
		Thread.sleep(4000);
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData1("pp", 1, 4)+"')]")));
		
		Thread.sleep(4000);
		BaseTest.click(rp.getMothertongue());
		
		Thread.sleep(4000);
		WebElement lang=driver.findElement(By.xpath("//*[@id='chkbox17_1']"));
		if (lang.isEnabled()) {
			System.out.println("älready selected");
		}
		else {
			lang.click();
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		
		Thread.sleep(4000);
		BaseTest.click(rp.getPhyscialstatus());

		Thread.sleep(4000);
		WebElement lang1=driver.findElement(By.xpath("//*[@id='chkbox0']"));
		if (lang1.isEnabled()) {
			System.out.println("älready selected");
		}
		else {
			lang1.click();
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		
		Thread.sleep(4000);
		BaseTest.click(rp.getEatinghabit());
		Thread.sleep(4000);
		WebElement lang2=driver.findElement(By.xpath("//*[@id='chkbox2']"));
		if (lang2.isEnabled()) {
			System.out.println("älready selected");
		}
		else {
			lang2.click();
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		
		Thread.sleep(4000);
		BaseTest.click(rp.getDrinkinghabit());
		Thread.sleep(4000);
		WebElement lang3=driver.findElement(By.xpath("//*[@id='chkbox2']"));
		if (lang3.isEnabled()) {
			System.out.println("älready selected");
		}
		else {
			lang3.click();
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		
		
		Thread.sleep(3000);
	   	JavascriptExecutor js = (JavascriptExecutor)driver;
	   	  WebElement edit= driver.findElement(By.xpath("//*[@id='wap-edit-profile']/div/div[2]/form/fieldset[11]/div[2]"));
		  	  js.executeScript("arguments[0].scrollIntoView(true);",edit);
		Thread.sleep(4000);
		BaseTest.click(rp.getSmokinghabit());
		Thread.sleep(4000);
		WebElement lang4=driver.findElement(By.xpath("//*[@id='chkbox1']"));
		if (lang4.isEnabled()) {
			System.out.println("älready selected");
		}
		else {
			lang4.click();
		}
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		
		Thread.sleep(3000);
	   	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	   	  WebElement edit1= driver.findElement(By.xpath("//*[@id='edit-prof_footer']/div[2]"));
		  	  js1.executeScript("arguments[0].scrollIntoView(true);",edit1);
		
		Thread.sleep(4000);
		BaseTest.click(rp.getSave());
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click();
		
		
		//religious information//
	 
		Thread.sleep(4000);
		BaseTest.click(rp.getReligiousinformation());
		
		Thread.sleep(4000);
		BaseTest.click(rp.getReligion());
		Thread.sleep(4000);
		WebElement relig=driver.findElement(By.xpath("//span[@class='left-cnt']//following::input[1]"));
		if (relig.isEnabled()) {
			System.out.println("älready selected");
		}
		else {
			relig.click();
		}
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='Icon_tick']")).click();
		
		Thread.sleep(4000);
			BaseTest.click(rp.getSubcaste());
		Thread.sleep(4000);
		WebElement caste=driver.findElement(By.xpath("(//span[@class='left-cnt']//following::input[1])[1]"));
		if (caste.isEnabled()) {
			System.out.println("älready selected");
		}
		else {
			caste.click();
		}
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='Icon_tick']")).click();
		
		
		Thread.sleep(4000);
		BaseTest.click(rp.getDosham());
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		
		Thread.sleep(4000);
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("pp", 4, 2)+"')]")));
		
			
		Thread.sleep(4000);
		BaseTest.click(rp.getStar());
		Thread.sleep(4000);
		WebElement star=driver.findElement(By.xpath("//*[@id='chkbox4']"));
		if (star.isEnabled()) {
			System.out.println("älready selected");
		}
		else {
			star.click();
		}
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='Icon_tick']")).click();
		
		Thread.sleep(4000);
		BaseTest.click(rp.getSave2());
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click();
		
		////3rd///
		
		Thread.sleep(3000);
	   	JavascriptExecutor js11 = (JavascriptExecutor)driver;
	   	  WebElement edit11= driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[5]/div[1]/div[2]"));
		  	  js11.executeScript("arguments[0].scrollIntoView(true);",edit11);
		
		 Thread.sleep(4000);
	BaseTest.click(rp.getProfessionalinformation());
		 
		  
		  Thread.sleep(6000);
		  BaseTest.click(rp.getEducation());
		  Thread.sleep(4000);
		  WebElement star1=driver.findElement(By.xpath("//*[@id='chkboxid']"));
		   star1.click();
			
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='Icon_delete']/span")).click();
			
			Thread.sleep(6000);
			BaseTest.click(rp.getOccupation());
			Thread.sleep(4000);
			WebElement occu=driver.findElement(By.xpath("//*[@id='chkbox102_120']"));
			if (occu.isEnabled()) {
				System.out.println("älready selected");
			}
			else {
				occu.click();
			}
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
			
			
		  Thread.sleep(4000);
		BaseTest.click(rp.getAnnualincomefrom());
		 Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		  Thread.sleep(4000);
		  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("pp", 7, 3)+"')]")));
		  
		  Thread.sleep(4000);
		BaseTest.click(rp.getAnnualincomefrom());
			 Thread.sleep(4000);
			  driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();	
			  Thread.sleep(4000);
		
			  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("pp", 7, 4)+"')]")));
			
			  Thread.sleep(4000);
			  BaseTest.click(rp.getSave2());
		  
			  Thread.sleep(4000);
			  try {
				driver.findElement(By.xpath("//*[@id='ValidationError_Popup']/img")).click();
			} catch (Exception e2) {
				System.out.println("no elements");
			}
			  
		  Thread.sleep(4000);
		 BaseTest.click(rp.getAnnualincometo());
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		  Thread.sleep(4000);
	
		  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("pp", 7, 5)+"')]")));
		 
		  Thread.sleep(4000);
		  BaseTest.click(rp.getSave2());
	  
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click();  
		  
		  //Location
		  Thread.sleep(3000);
		   	JavascriptExecutor js12 = (JavascriptExecutor)driver;
		   	  WebElement edit12= driver.findElement(By.xpath("//*[@id='wap-edit-profile']/div[3]/div[9]/div[1]/div[2]"));
			  	  js12.executeScript("arguments[0].scrollIntoView(true);",edit12);
			
		  
		  Thread.sleep(4000);
	  BaseTest.click(rp.getLocationpreference());
		
		
		
		
//		  Thread.sleep(3000);
//		 BaseTest.click(rp.getCountry());
//		  Thread.sleep(4000);
//		  WebElement country=driver.findElement(By.xpath("//*[@id='chkbox0']"));
//			if (country.isSelected()) {
//				System.out.println("älready selected");
//			}
//			else {
//				country.click();
//			}
//		  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
//		 
//		  
//		  Thread.sleep(4000);
//			BaseTest.click(rp.getCitizenship());
//			 Thread.sleep(4000);
//			  WebElement citizen=driver.findElement(By.xpath("//*[@id='chkbox0']"));
//				if (citizen.isSelected()) {
//					System.out.println("älready selected");
//				}
//				else {
//					citizen.click();
//				}
//			  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
//			 
		  Thread.sleep(4000);
			  BaseTest.click(rp.getCountry());
			  Thread.sleep(4000);
			  WebElement country1=driver.findElement(By.xpath("//*[@id='chkbox99']"));
				if (country1.isSelected()) {
					System.out.println("älready selected");
				}
				else {
					country1.click();
				}
			  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
			 
			  
			try {
				Thread.sleep(3000);
			   	JavascriptExecutor js123 = (JavascriptExecutor)driver;
			   	  WebElement edit123= driver.findElement(By.xpath("//*[@id='PP_Residing_Indian_State']"));
				  	  js123.executeScript("arguments[0].scrollIntoView(true);",edit123);
				
				  Thread.sleep(7000);
					 BaseTest.click(rp.getState());
					 Thread.sleep(4000);
					 WebElement state=driver.findElement(By.xpath("//*[@id='chkbox31']"));
						if (state.isSelected()) {
							System.out.println("älready selected");
						}
						else {
							state.click();
						}
					 
					  Thread.sleep(4000);
					  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
					  
			} catch (Exception e2) {
				System.out.println("no state 1");
			}  
			
			try {
				Thread.sleep(3000);
			   	JavascriptExecutor js123 = (JavascriptExecutor)driver;
			   	  WebElement edit123= driver.findElement(By.xpath("//*[@id='PP_Indian_state_display']/div[2]"));
				  	  js123.executeScript("arguments[0].scrollIntoView(true);",edit123);
				
				  Thread.sleep(7000);
				driver.findElement(By.xpath("//*[@id='PP_Indian_state_display']/div[2]")).click();
					 Thread.sleep(4000);
					 WebElement state=driver.findElement(By.xpath("//*[@id='chkbox31']"));
						if (state.isSelected()) {
							System.out.println("älready selected");
						}
						else {
							state.click();
						}
					 
					  Thread.sleep(4000);
					  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
					  
			} catch (Exception e2) {
				System.out.println("no state 1");
			}  
			
			try {
				Thread.sleep(3000);
			   	JavascriptExecutor js123 = (JavascriptExecutor)driver;
			   	  WebElement edit123= driver.findElement(By.xpath("//*[@id='PP_Indian_state_display']/div[2]/div"));
				  	  js123.executeScript("arguments[0].scrollIntoView(true);",edit123);
				
				  Thread.sleep(7000);
				driver.findElement(By.xpath("//*[@id='PP_Indian_state_display']/div[2]/div")).click();
					 Thread.sleep(4000);
					 WebElement state=driver.findElement(By.xpath("//*[@id='chkbox31']"));
						if (state.isSelected()) {
							System.out.println("älready selected");
						}
						else {
							state.click();
						}
					 
					  Thread.sleep(4000);
					  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
					  
			} catch (Exception e2) {
				System.out.println("no state 1");
			}  
			
		  Thread.sleep(7000);
		 BaseTest.click(rp.getState());
		 Thread.sleep(4000);
		 WebElement state=driver.findElement(By.xpath("//*[@id='chkbox31']"));
			if (state.isSelected()) {
				System.out.println("älready selected");
			}
			else {
				state.click();
			}
		 
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		  
		  Thread.sleep(7000);
		 BaseTest.click(rp.getCity());
		 Thread.sleep(4000);
		 WebElement city=driver.findElement(By.xpath("//*[@id='chkbox472']"));
			if (city.isSelected()) {
				System.out.println("älready selected");
			}
			else {
				city.click();
			}
		 
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		  
		  Thread.sleep(4000);
		BaseTest.click(rp.getCitizenship());
		 Thread.sleep(4000);
		  WebElement citizenship=driver.findElement(By.xpath("//*[@id='chkbox30']"));
			if (citizenship.isEnabled()) {
				System.out.println("älready selected");
			}
			else {
				citizenship.click();
			}
		  driver.findElement(By.xpath("//*[@id='Icon_tick']/span")).click();
		 
		  Thread.sleep(4000);
		 BaseTest.click(rp.getSave());
		 
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click(); 
		  
		//Professional Preference After editing:
		  
		///pp check/////
		  Thread.sleep(4000);
		  WebElement marital2=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[1]/div[2]"));
		  String partner=marital2.getText();
		  System.out.println("Marital Status :"+partner);
		  
		  try {
			  Thread.sleep(4000);
			  WebElement havechild=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[2]/div[2]"));
			  String child=havechild.getText();
			  System.out.println("Have children :"+child);
			  
		} catch (Exception e2) {
			System.out.println("no child");
		}
		  
		  Thread.sleep(4000);
		  WebElement age=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[3]/div[2]"));
		  String ppa=age.getText();
		  System.out.println("Age:"+ppa);
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
		  WebElement height=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[4]/div[2]"));
		  String ppheight=height.getText();
		  System.out.println("Height :"+ppheight);
		  
		  Thread.sleep(4000);
		  WebElement mother=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[5]/div[2]/span"));
		  String tongue=mother.getText();
		  System.out.println("Mother Tongue :"+tongue);

		  Thread.sleep(4000);
		  WebElement physical=driver.findElement(By.xpath("(//div[contains(text(),'Physical Status')]//following::div[1])[2]"));
		  String physicalstatus=physical.getText();
		  System.out.println("PhysicalStatus  :"+physicalstatus);

		  Thread.sleep(4000);
		  WebElement eating1=driver.findElement(By.xpath("//div[contains(text(),'Eating Habits')]//following::div[1]"));
		  String eatinghabits1=eating1.getText();
		  System.out.println("Eatinghabits :"+eatinghabits1);

		  Thread.sleep(4000);
		  WebElement drinking1=driver.findElement(By.xpath("//div[contains(text(),'Drinking Habits')]//following::div[1]"));
		  String drinkinghabits1=drinking1.getText();
		  System.out.println("Drinkinghabits :"+drinkinghabits1);

		  Thread.sleep(4000);
		  WebElement smoking1=driver.findElement(By.xpath("//div[contains(text(),'Smoking Habits')]//following::div[1]"));
		  String smokinghabits1=smoking1.getText();
		  System.out.println("Smokinghabits :"+smokinghabits1);

		  Thread.sleep(4000);
		  WebElement rel1=driver.findElement(By.xpath("(//div[contains(text(),'Religion')]//following::div[1])[2]"));
		  String religion1=rel1.getText();
		  System.out.println("Religion :"+religion1);

		  Thread.sleep(4000);
		  WebElement sub=driver.findElement(By.xpath("//div[contains(text(),'Subcaste')]//following::div[1]"));
		  String subcaste=sub.getText();
		  System.out.println("Subcaste :"+subcaste);

		  Thread.sleep(4000);
		  WebElement dosh=driver.findElement(By.xpath("(//div[contains(text(),'Dosham')]//following::div[1])[2]"));
		  String dosham=dosh.getText();
		  System.out.println("Dosham :"+dosham);
//try {
//	Thread.sleep(4000);
//	  WebElement sta=driver.findElement(By.xpath("(//div[contains(text(),'Star')]//following::div[1])[2]"));
//	  star=sta.getText();
//	  System.out.println("star in pp :"+ star);
//} catch (Exception e2) {
//	System.out.println("star value not edited.....");
//}
		  

		  Thread.sleep(4000);
		  WebElement edu=driver.findElement(By.xpath("(//div[contains(text(),'Education')]//following::div[1])[2]"));
		  String edu1=edu.getText();
		  System.out.println("Education :"+edu1);

		    
		  Thread.sleep(4000);
		  WebElement occ=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[5]/div[2]/ul/li[2]/div[2]"));
		  String occpp=occ.getText();
		  System.out.println("Occupation :"+occpp);
		  
		  
		  Thread.sleep(4000);
		  WebElement income=driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[5]/div[2]/ul/li[3]/div[2]"));
		  String incomepp=income.getText();
		  System.out.println("Income :"+incomepp);
		  
		  WebElement country=driver.findElement(By.xpath("(//div[contains(text(),'Country')]//following::div[1])[2]"));
		  String country11=country.getText();
		  System.out.println("Country :"+country11);
		  
		  WebElement citizen=driver.findElement(By.xpath("(//div[contains(text(),'Citizenship')]//following::div[1])[2]"));
		  String citizenship1=citizen.getText();
		  System.out.println("Citizenship :"+citizenship1);
		  
		  
		  
		  
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
		  
		Thread.sleep(4000);
		BaseTest.click(rp.getSetting());
		
		///Privacy setting
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list/ion-item[5]")).click();
		
		//edit
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-grid[1]/ion-row/ion-col/ion-list/ion-item/div[1]/button/span")).click();
		
		
		System.out.println("Who Can See Me :");
//		Thread.sleep(4000);
//		BaseTest.click(rp.getWhocanseeme());
//		  
		 Thread.sleep(4000);
		  WebElement agefrom=driver.findElement(By.xpath("(//div[@class='frmto'])[1]"));
		  String wcagefrom=agefrom.getText();
		  System.out.println("Age from :"+wcagefrom);
		  String[] split3=wcagefrom.split(" years");
		 // System.out.println("wcsmstartage:"+split3[0]);
		  int wcsmfromage=Integer.parseInt(split3[0]);
		  
		  
		  Thread.sleep(4000);
		  WebElement ageto=driver.findElement(By.xpath("(//div[@class='frmto'])[2]"));
		  String wcageto=ageto.getText();
		  System.out.println("Age to:"+wcageto);
		  String[] split4=wcageto.split(" years");
		 // System.out.println("wcsmendage:"+split4[0]);
		  int wcsmtoage=Integer.parseInt(split4[0]);
		  
		  
		  WebElement marital1=driver.findElement(By.xpath("(//div[@class='openPopUp_values no-break_line'])[1]"));
		  String maritalwcsm=marital1.getText();
		  System.out.println("Marital status  :"+maritalwcsm);
		  	 
		  WebElement edu2=driver.findElement(By.xpath("//ion-label[contains(text(),'Education')]//following::div[1]"));
		  String edu21=edu2.getText();
		  System.out.println("Education :"+edu21);
		  	 
		  
		  
		  Thread.sleep(4000);	
		  WebElement income3=driver.findElement(By.xpath("//ion-label[contains(text(),'Annual Income')]//following::div[1]"));
		  String incomewcsm=income3.getText();
		  System.out.println("Income :"+incomewcsm);
		  
		  Thread.sleep(4000);
		  BaseTest.click(rp.getMorepreference());
		  
		  Thread.sleep(4000);
		  WebElement height3=driver.findElement(By.xpath("//ion-label[contains(text(),'Height')]//following::div[1]"));
		  String heightfrom=height3.getText();
		  System.out.println("Height from :"+heightfrom);
		  
		  Thread.sleep(4000);
		  WebElement height4=driver.findElement(By.xpath("//ion-label[contains(text(),'Height')]//following::div[3]"));
		  String heightto=height4.getText();
		  System.out.println("Height to  :"+heightto);
		  
		  
		  Thread.sleep(4000);
		  WebElement mother1=driver.findElement(By.xpath("//ion-label[contains(text(),'Mother Tongue')]//following::div[1]"));
		  String tongue1=mother1.getText();
		  System.out.println("Mother tongue :"+tongue1);

		  Thread.sleep(4000);
		  WebElement physical12=driver.findElement(By.xpath("//ion-label[contains(text(),'Physical Status')]//following::div[1]"));
		  String physicalstatus12=physical12.getText();
		  System.out.println("Physicalstatus :"+physicalstatus12);

		  Thread.sleep(4000);
		  WebElement eating12=driver.findElement(By.xpath("//ion-label[contains(text(),'Eating')]//following::div[1]"));
		  String eatinghabits12=eating12.getText();
		  System.out.println("Eatinghabits :"+eatinghabits12);

		  Thread.sleep(4000);
		  WebElement drinking12=driver.findElement(By.xpath("//ion-label[contains(text(),'Drinking')]//following::div[1]"));
		  String drinkinghabits12=drinking12.getText();
		  System.out.println("Drinkinghabits  :"+drinkinghabits12);

		  Thread.sleep(4000);
		  WebElement smoking12=driver.findElement(By.xpath("//ion-label[contains(text(),'Smoking')]//following::div[1]"));
		  String smokinghabits12=smoking12.getText();
		  System.out.println("Smokinghabits :"+smokinghabits12);

		  Thread.sleep(4000);
		  WebElement rel12=driver.findElement(By.xpath("(//ion-label[contains(text(),'Religion')]//following::div[1])[2]"));
		  String religion12=rel12.getText();
		  System.out.println("Religion :"+religion12);

		  Thread.sleep(4000);
		  WebElement sub12=driver.findElement(By.xpath("//ion-label[contains(text(),'Subcaste')]//following::div[1]"));
		  String subcaste12=sub12.getText();
		  System.out.println("Subcaste :"+subcaste12);

		  Thread.sleep(4000);
		  WebElement dosh12=driver.findElement(By.xpath("//ion-label[contains(text(),'Dosham')]//following::div[1]"));
		  String dosham12=dosh12.getText();
		  System.out.println("Dosham  :"+dosham12);

		  Thread.sleep(4000);
		  WebElement sta12=driver.findElement(By.xpath("//ion-label[contains(text(),'Star')]//following::div[1]"));
		  String star12=sta12.getText();
		  System.out.println("Star :"+star12);

		    
		  Thread.sleep(4000);
		  WebElement occ12=driver.findElement(By.xpath("//ion-label[contains(text(),'Occupation')]//following::div[1]"));
		  String occpp12=occ12.getText();
		  System.out.println("Occupation :"+occpp12);
		  
		  WebElement country12=driver.findElement(By.xpath("//ion-label[contains(text(),'Country')]//following::div[1]"));
		  String country121=country12.getText();
		  System.out.println("Country :"+country121);
		  
		  WebElement citizen12=driver.findElement(By.xpath("//ion-label[contains(text(),'Citizenship')]//following::div[1]"));
		  String citizenship12=citizen12.getText();
		  System.out.println("Citizenship :"+citizenship12);  
		  
		  
		  
		  if (maritalwcsm.equals("Any")) {
				System.out.println("marital status is Any");
				} else if (partner.contains(maritalwcsm)) {
					System.out.println("marital status is matched");
				}else{
		System.out.println("marital status is not matched");
				}
			
		  if (tongue1.equals("Any")) {
				System.out.println("mother tongue is Any");
				} else if (tongue.contains(tongue1)) {
					System.out.println("mother tongue is matched");
				}else{
		System.out.println("mother tongue is not matched");
				}
		
				
		  
		  if (physicalstatus12.equals("Doesn't Matter")) {
				System.out.println("physicalstatus is Doesn't Matter");
				} else if (physicalstatus.contains(physicalstatus12)) {
					System.out.println("physicalstatus is matched");
				}else{
		System.out.println("physicalstatus is not matched");
				}
			
		  
		  if (eatinghabits12.equals("Doesn't Matter")) {
				System.out.println("eatinghabits is Doesn't Matter");
				} else if (eatinghabits1.contains(eatinghabits12)) {
					System.out.println("eatinghabits is matched");
				}else{
		System.out.println("eatinghabits is not matched");
				}
			
		  
		  if (smokinghabits12.equals("Doesn't Matter")) {
				System.out.println("smokinghabits is Doesn't Matter");
				} else if (smokinghabits1.contains(smokinghabits12)) {
					System.out.println("smokinghabits is matched");
				}else{
		System.out.println("smokinghabits is not matched");
				}
		  
		  if (drinkinghabits12.equals("Doesn't Matter")) {
				System.out.println("drinkinghabits is Doesn't Matter");
				} else if (drinkinghabits1.contains(drinkinghabits12)) {
					System.out.println("drinkinghabits is matched");
				}else{
		System.out.println("drinkinghabits is not matched");
				}
		  
		  
		  if (religion12.equals("Any")) {
				System.out.println("religion is Any");
				} else if (religion1.contains(religion12)) {
					System.out.println("religion is matched");
				}else{
		System.out.println("religion is not matched");
				}
		  
		  if (subcaste12.equals("Any")) {
				System.out.println("subcaste is Any");
				} else if (subcaste.contains(subcaste12)) {
					System.out.println("subcaste is matched");
				}else{
		System.out.println("subcaste is not matched");
				}
		  

		  if (dosham12.equals("Doesn't Matter")) {
				System.out.println("dosham is Doesn't Matter");
				} else if (dosham.contains(dosham12)) {
					System.out.println("dosham is matched");
				}else{
		System.out.println("dosham is not matched");
				}
		  
//		  if (star12.equals("Any")) {
//				System.out.println("star is Any");
//				} else if (star.contains(star12)) {
//					System.out.println("star is matched");
//				}else{
//		System.out.println("star is not matched");
//				}
		  
		  if (occpp12.equals("Any")) {
				System.out.println("occupation is Any");
				} else if (occpp.contains(occpp12)) {
					System.out.println("occupation is matched");
				}else{
		System.out.println("occupation is not matched");
				}
		  
		  if (edu21.equals("Any")) {
				System.out.println("education is Any");
				} else if (edu1.contains(edu21)) {
					System.out.println("education is matched");
				}else{
		System.out.println("education is not matched");
				}
		    
		  if (country121.equals("Any")) {
				System.out.println("country is Any");
				} else if (country11.contains(country121)) {
					System.out.println("country is matched");
				}else{
		System.out.println("country is not matched");
				}
		    
			  
		  if (citizenship12.equals("Any")) {
				System.out.println("citizenship is Any");
				} else if (citizenship1.contains(citizenship12)) {
					System.out.println("citizenship is matched");
				}else{
		System.out.println("citizenship is not matched");
				}
		    
		  
		  if (heightfrom.equals("4ft")) {
			  System.out.println("from height is matched");	
		}
		  else {
			System.out.println("from height is not matched");
		}
		  
  
		  if (heightto.equals("7ft 11in")) {
			  System.out.println("to height is matched");	
			  
		}
		  else {
			System.out.println("to height is not matched");
		}
		  
		  
		if (wcsmfromage <= ppstartage) {
			System.out.println("wcsm from age is lessthan or equal to pp from age." + wcsmfromage +"="+ ppstartage);
		}
		  
		else {
			System.out.println("wcsm age is not matched");
		} 
		  if (wcsmtoage >= ppendage) {
			  System.out.println("wcsm to age is greater than or equal to pp to age...." + wcsmtoage+ "="+ ppendage );
			
		}else
			
			System.out.println("wcsm to age doesnot satisfy the condition with pp to age.....");
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
       }	  
		  
		  
}
