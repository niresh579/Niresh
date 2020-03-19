	package logic;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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

import pom.BaseTest;
import pom.VerifyAgeppPOM;



public class VerifyAgepp extends BaseTest {
	
	float heightfrom;
	float   heightto;
	float ch;
					
	
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\drivernew2\\chromedriver.exe"; 

	 
       @BeforeMethod
       public void setUp1() throws MalformedURLException {
           System.setProperty("webdriver.chrome.driver", driverExecutablePath);
           Map<String, String> mobileEmulation = new HashMap<String, String>();
           mobileEmulation.put("deviceName", "Pixel 2");

           ChromeOptions chromeOptions = new ChromeOptions();
           chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
           chromeOptions.addArguments("--disable-notifications");
           driver = new ChromeDriver(chromeOptions);
          
           
//         ExtentReports report;
//         ExtentTest logger;
//         private String reportDirectory = "reports";
//         private String reportFormat = "xml";
//         private String testName = "Untitled";
//         protected AndroidDriver<AndroidElement> driver = null;
//
//         DesiredCapabilities dc = new DesiredCapabilities();
//         
//         @BeforeTest
//         public void setUp() throws MalformedURLException {
//         	   dc.setCapability("reportDirectory", reportDirectory);
//                dc.setCapability("reportFormat", reportFormat);
//                dc.setCapability("testName", testName);
//                dc.setCapability(MobileCapabilityType.UDID, "ZDHUTW49BMOZAU8T");
//                dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
//                dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
//                driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
//                driver.setLogLevel(Level.INFO);

           
       }
       
       @Test
       public void testUntitled() throws Throwable {
      VerifyAgeppPOM rp= new VerifyAgeppPOM(driver);	
      Thread.sleep(5000);
      driver.get("https://m.pakistanimatrimony.com/cbsmob/login.php");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    
	    //login
	    WebElement e=driver.findElement(By.xpath("//ion-input[@formcontrolname='idEmail']"));
		Actions a=new Actions(driver);
		Thread.sleep(4000);
		a.sendKeys(e,"PAK755447").build().perform();
	    
	    Thread.sleep(4000);
	    
	    WebElement d=driver.findElement(By.xpath("//ion-input[@formcontrolname='password']"));
	    Thread.sleep(4000);
		Actions b=new Actions(driver);
		Thread.sleep(4000);
		b.sendKeys(d,"testpass").build().perform();
	    
	  Thread.sleep(4000);
	BaseTest.click(rp.getLogin());
	try {
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-intermediatesegment/ion-content/div[2]/span")).click();
	} catch (Exception e2) {
	}
Thread.sleep(6000);
driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();

	  Thread.sleep(4000);
		WebElement name=  driver.findElement(By.xpath("//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-list/ion-item/div[1]/div/ion-label/span[1]/div[1]"));
		Thread.sleep(2000);
		String z=name.getText();
		System.out.println("Name :" +z);
	  
	  Thread.sleep(4000);
	  BaseTest.click(rp.getEditpp());
	  
	  Thread.sleep(4000);
		WebElement ref=  driver.findElement(By.xpath("//*[@id='editpp-pwa']/div[3]/div[2]/ul/li[1]/div[2]"));
		Thread.sleep(2000);
		String a1=ref.getText();
		System.out.println("status :" +a1);
	  
	  Thread.sleep(4000);
	WebElement ref1=  driver.findElement(By.xpath("(//div[contains(text(),'Age')]/following-sibling::div[@class='rg-cn'])[2]"));
	Thread.sleep(2000);
	String a2=ref1.getText();
	System.out.println("Age :" +a2);
	 String[] split = a2.split("-");    //split[0].g=18   str b= split[1]=37yrs  str b.spl"["Yrs"   ["ft in"] " "  =4 7 8  7.8
	 String split2 = split[0].toString().trim();
	 int finalstartage = Integer.parseInt(split2);
	 
	 String[] split3= split[1].split("Yrs");
	 String spli4 =split3[0].toString().trim();
	 int finalendage = Integer.parseInt(spli4);
     System.out.println("Age1 :"+split[0]);
    
     System.out.println("Age2 :"+split[1]);
     System.out.println("Age3 :"+split2);
     
     System.out.println("Age4 :"+split3[0]);
     System.out.println("finalstartage :"+finalstartage);
     System.out.println("finalendage :"+finalendage);
     
  /*   String minage = split[0];
     int minagefinal = Integer.parseInt(minage);
    String maxage = split3[0];
     int maxagefinal = Integer.parseInt(maxage); */
     
 	
 	//String a12 = split[0];
 	//String b12= a12.replaceAll("\\s", "");
 	 //int finalstartage=Integer.parseInt(b12);
		
	
	
	Thread.sleep(4000);
	WebElement ref2=  driver.findElement(By.xpath("(//div[contains(text(),'Height')]/following-sibling::div[@class='rg-cn'])[2]"));
	Thread.sleep(2000);
	String a3=ref2.getText();
	System.out.println("Height :" +a3);
	String[] split4=a3.split("-");
	
	
	System.out.println("height1 "+split4[0]);
	System.out.println("heightto :"+split4[1]);
	Thread.sleep(4000);
	try {
		
		
		String[] split5=split4[0].split(" in");
			System.out.println("value0 :"+split5[0]);
		String[] split6=split5[0].split(" ft ");
		System.out.println("value1 :"+split6[0]);
		System.out.println("value2 :"+split6[1]);
		
		String abs=split6[0]+"."+split6[1];
		heightfrom = Float.parseFloat(abs);
		System.out.println(heightfrom);
		
	} catch (Exception e2) {
		String[] split7=split4[0].split(" ft");
		System.out.println("value3 :"+split7[0]);
		String bcs=split7[0];
		 heightfrom =Float.parseFloat(bcs); 
		 System.out.println(heightfrom);
	}
	
	
	
try {
		
		String[] split5=split4[1].split(" in");
			System.out.println("value0 :"+split5[0]);
		String[] split6=split5[0].split(" ft ");
		System.out.println("value1 :"+split6[0]);
		System.out.println("value2 :"+split6[1]);
		
		String abs=split6[0]+"."+split6[1];
		heightto = Float.parseFloat(abs);
		System.out.println(heightto);
		
	} catch (Exception e2) {
		String[] split7=split4[0].split(" ft");
		System.out.println("value3 :"+split7[0]);
		String bcs=split7[0];
		 heightto =Float.parseFloat(bcs);
		 System.out.println(heightto);
	}
	
		
	Thread.sleep(4000);
    click(rp.getStrictfilter());
	
    Thread.sleep(4000);
// click(rp.getAgestrictfilter());
    
   
		
Thread.sleep(6000);	
	WebElement ageoff = driver.findElement(By.xpath("(//a[@aria-valuenow='1'])[1]"));
	if (ageoff.isEnabled()) {
		System.out.println("älready selected1");
	} else {
		Thread.sleep(4000);
		WebElement ageoff1=driver.findElement(By.xpath("(//a[@aria-valuenow='0'])[1]"));
		ageoff1.click();
	}
    
	

Thread.sleep(6000);	
WebElement ageoff1 = driver.findElement(By.xpath("(//a[@aria-valuenow='1'])[2]"));
if (ageoff1.isEnabled()) {
	System.out.println("älready selected2");
} else {
	Thread.sleep(4000);
	WebElement ageoff11=driver.findElement(By.xpath("(//a[@aria-valuenow='0'])[2]"));
	ageoff11.click();
}

WebElement ageoff11 = driver.findElement(By.xpath("(//a[@aria-valuenow='1'])[3]"));
if (ageoff11.isEnabled()) {
	System.out.println("älready selected3");
} else {
	Thread.sleep(4000);
	WebElement ageoff111=driver.findElement(By.xpath("(//a[@aria-valuenow='0'])[3]"));
	ageoff111.click();
}



//Thread.sleep(6000);	
//WebElement havechild = driver.findElement(By.xpath("(//a[@aria-valuenow='1'])[4]"));
//if (havechild.isEnabled()) {
//System.out.println("älready selected2");
//} else {
//Thread.sleep(4000);
//WebElement havechild1=driver.findElement(By.xpath("(//a[@aria-valuenow='0'])[4]"));
//havechild1.click();
//}
//
//WebElement mother = driver.findElement(By.xpath("(//a[@aria-valuenow='1'])[5]"));
//if (mother.isEnabled()) {
//System.out.println("älready selected3");
//} else {
//Thread.sleep(4000);
//WebElement mother1=driver.findElement(By.xpath("(//a[@aria-valuenow='0'])[5]"));
//mother1.click();
//}
//
//Thread.sleep(6000);	
//WebElement physical = driver.findElement(By.xpath("(//a[@aria-valuenow='1'])[6]"));
//if (physical.isEnabled()) {
//	System.out.println("älready selected1");
//} else {
//	Thread.sleep(4000);
//	WebElement physical1=driver.findElement(By.xpath("(//a[@aria-valuenow='0'])[6]"));
//	physical1.click();
//}
//
//
//Thread.sleep(6000);	
//WebElement eating = driver.findElement(By.xpath("(//a[@aria-valuenow='1'])[7]"));
//if (eating.isEnabled()) {
//	System.out.println("älready selected1");
//} else {
//	Thread.sleep(4000);
//	WebElement eating1=driver.findElement(By.xpath("(//a[@aria-valuenow='0'])[7]"));
//	eating1.click();
//}
//
//Thread.sleep(6000);	
//WebElement drinking = driver.findElement(By.xpath("(//a[@aria-valuenow='1'])[8]"));
//if (drinking.isEnabled()) {
//	System.out.println("älready selected1");
//} else {
//	Thread.sleep(4000);
//	WebElement drinking1=driver.findElement(By.xpath("(//a[@aria-valuenow='0'])[8]"));
//	drinking1.click();
//}
//
//
//Thread.sleep(6000);	
//WebElement smoking = driver.findElement(By.xpath("(//a[@aria-valuenow='1'])[9]"));
//if (smoking.isEnabled()) {
//	System.out.println("älready selected1");
//} else {
//	Thread.sleep(4000);
//	WebElement smoking1=driver.findElement(By.xpath("(//a[@aria-valuenow='0'])[9]"));
//	smoking1.click();
//}

//if (ageoff1==true) {
//	System.out.println("selecetd");
//}
//else {
//	ageoff.click();
//}
 
// Thread.sleep(6000);
// WebElement ageon=driver.findElement(By.xpath("(//a[@style='left: 100%;'])[1]"));
// ageon.click();
  
//Thread.sleep(6000);	
//WebElement heightoff = driver.findElement(By.xpath("(//a[@style='left: 0%;'])[1]"));
//Thread.sleep(4000);
//Boolean heightoff1=driver.findElement(By.xpath("(//a[@style='left: 100%;'])[1]")).isEnabled();
//if (heightoff1==true) {
//	System.out.println("selecetd2");
//}
//else {
//	heightoff.click();
//}
//// Thread.sleep(6000);
//// WebElement heighton=driver.findElement(By.xpath("(//a[@style='left: 100%;'])[2]"));
//// heighton.click();
// 
//Thread.sleep(6000);	
//WebElement statusoff = driver.findElement(By.xpath("//*[@id='linktobasic_details']/div[1]/ul[1]/li[3]/div[3]/div/div/a/span"));
//Thread.sleep(4000);
//Boolean statusoff1=driver.findElement(By.xpath("//*[@id='linktobasic_details']/div[1]/ul[1]/li[3]/div[3]/div/div/a/span")).isEnabled();
//if (statusoff1==true) {
//	System.out.println("selecetd1");
//}
//else {
//	statusoff.click();
//}
//// Thread.sleep(4000);
//// WebElement statuson=driver.findElement(By.xpath("(//a[@style='left: 100%;'])[3]"));
//// statuson.click();
// 
//  //  Thread.sleep(4000);
//  //  click(rp.getHeightstrictfilter());
//    
// //   Thread.sleep(4000);
//  //  click(rp.getStatusstrictfilter());
//    
    Thread.sleep(4000);
   driver.findElement(By.xpath("//*[@id='strictppflag']")).click();
    	
   BaseTest.getScreenshot(driver, "strict filter popup");
   
    
    Thread.sleep(4000);
    try {
    	driver.findElement(By.xpath("(//*[@id='ValidationError_Popup']/img)[2]")).click();
    	Thread.sleep(6000);
    	driver.findElement(By.xpath("//*[@id='head_panel']/a/span/span[1]")).click();
	} catch (Exception e2) {
		System.out.println("no popup");
	}
   
    


Thread.sleep(4000);
BaseTest.click(rp.getBackhistory());
	
	Thread.sleep(4000);
	BaseTest.click(rp.getMatches());
	
	
	//matches profile checking
	
	Thread.sleep(4000);
	WebElement g=  driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row[1]/ion-grid/ion-row[1]/ion-col[2]/div[1]/div"));
	Thread.sleep(2000);
	String ab=g.getText();
	System.out.println("Name :" +ab);  
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-matches/ion-content/div[2]/ion-list/ion-row[1]/ion-grid/ion-row[1]/ion-col[2]/div[1]/div")).click();
	
	  
	Thread.sleep(4000);
	WebElement gh=  driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-viewprofile/ion-content/div[2]/ion-grid[4]/ion-row[8]/ion-col[2]"));
	Thread.sleep(2000);
	String b1=gh.getText();
	System.out.println("status :" +b1); 
	  
	Thread.sleep(4000);
	WebElement gh1=  driver.findElement(By.xpath("//ion-col[contains(text(),'Age')]/following-sibling::ion-col[@class='col']"));
	Thread.sleep(2000);
	String b2=gh1.getText();
	System.out.println("Age :" +b2); 
	String[] convert=b2.split(" yrs");
	System.out.println("matches Age :"+convert[0]);
	
	String finalage = convert[0];
	int finalmatchesage=Integer.parseInt(finalage);
	
	   
	Thread.sleep(4000);
	WebElement gh2=  driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-viewprofile/ion-content/div[2]/ion-grid[4]/ion-row[6]/ion-col[2]"));
	Thread.sleep(2000);
	String b3=gh2.getText();
	
	Thread.sleep(4000);
	WebElement gh21=  driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-viewprofile/ion-content/div[2]/ion-grid[4]/ion-row[6]/ion-col[2]"));
	Thread.sleep(2000);
	String b31=gh21.getText();
	System.out.println("height:"+b31);
	
	
try {
		
		String[] split5=b31.split(" /");
			System.out.println("value0 :"+split5[0]);
		String[] split6=split5[0].split(" ft ");
		System.out.println("value1 :"+split6[0]);
		System.out.println("value2 :"+split6[1]);
		String[] split7=split6[1].split(" in");
		System.out.println("value4:"+split7[0]);
		
		String abs=split6[0]+"."+split7[0];
		ch = Float.parseFloat(abs);
		System.out.println(ch);
		
	} catch (Exception e2) {
		String[] split7=split4[0].split(" ft");
		System.out.println("value3 :"+split7[0]);
		String bcs=split7[0];
		 ch =Float.parseFloat(bcs);
		 System.out.println(ch);
	}

//try {
//	Thread.sleep(4000);
//	WebElement havechild1=  driver.findElement(By.xpath("(//ion-col[contains(text(),'Mother Tongue')]//following::ion-col[contains(text(),'Malayalam')])[1]"));
//	Thread.sleep(2000);
//	String havechild12=havechild1.getText();
//	System.out.println("HaveChildren :"+havechild12);
//
//} catch (Exception e2) {
//	// TODO: handle exception
//}
//
//Thread.sleep(4000);
//WebElement mothertonue=  driver.findElement(By.xpath("(//ion-col[contains(text(),'Mother Tongue')]//following::ion-col[contains(text(),'Malayalam')])[1]"));
//Thread.sleep(2000);
//String mothertongue3=mothertonue.getText();
//System.out.println("Mother Tongue :"+mothertongue3);


	

 if (heightfrom==ch || heightto>=ch) {
	System.out.println("height matched");
} else {
 System.out.println("height not matched");
}
  
 if (finalstartage==finalmatchesage || finalendage>=finalmatchesage) {
		System.out.println("Age matched");
	} else {
	 System.out.println("Age not matched");
	}  
  
 a1=b1;
 if (a1.equalsIgnoreCase(b1)) {
	 System.out.println("status matched");
	
}
 else {
	System.out.println("Status notmatched");
}
}
}