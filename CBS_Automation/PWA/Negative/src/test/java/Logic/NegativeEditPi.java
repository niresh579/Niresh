package Logic;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import pom.NegativeEditPiPOM;


public class NegativeEditPi extends BaseTest{
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\Negative\\driver\\chromedriver.exe";
	
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
     
      
  }   
  
  @Test
  public void testUntitled() throws Throwable  {
	  NegativeEditPiPOM rp= new NegativeEditPiPOM(driver);
	      
	  Thread.sleep(5000);
	    driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
	    driver.manage().window().maximize();
	    
	    //login
	    WebElement e=driver.findElement(By.xpath("//*[@id='idEmail']"));
		Actions a=new Actions(driver);
		Thread.sleep(4000);
		a.sendKeys(e,"IYR263592").build().perform();
	    
	    Thread.sleep(4000);
	    
	    WebElement d=driver.findElement(By.xpath("//*[@id='password1']"));
	    Thread.sleep(4000);
		Actions b=new Actions(driver);
		Thread.sleep(4000);
		b.sendKeys(d,"cbstest").build().perform();
	    
	  Thread.sleep(4000);
	  BaseTest.click(rp.getLogin());
	  
	  try {
		  Thread.sleep(6000);
			 driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();
			  
	} catch (Exception e2) {
		System.out.println("no element1");
	}
	  
	 try {
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a")).click();
		  
	} catch (Exception e2) {
		System.out.println("no element2");
	}
	 
	  Thread.sleep(4000);
	  BaseTest.click(rp.getEditpi());
	  
	  //basic details
	  
	  Thread.sleep(4000);
	  BaseTest.click(rp.getBasicdetails());


	  Thread.sleep(6000);
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
	driver.findElement(By.xpath("//*[@id='User_name']")).clear();
	
	Thread.sleep(4000);
	BaseTest.click(rp.getBasicdetailsave());
	WebElement ref=driver.findElement(By.xpath("//*[@id='Val_MsgText']"));
	String a1=ref.getText();
	System.out.println(a);
	
	BaseTest.getScreenshot(driver, "Name");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id='ValidationError_Popup']/img")).click();
	
	Thread.sleep(4000);
	WebElement name=driver.findElement(By.xpath("//*[@id='User_name']"));
	name.sendKeys("idffkb");
	
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id='dobspan']")).click();
	driver.findElement(By.xpath("//span[@class='dwbw dwb-s']")).click();
	
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
     
	try {
		Thread.sleep(4000);
		BaseTest.click(rp.getNoofchild());			
		 Thread.sleep(4000);
		driver.findElement(By.xpath("(//li[contains(text(),'2')])[1]")).click();
	
	     
	} catch (Exception e2) {
		System.out.println("no child");
	}
	try {
		Thread.sleep(4000);
		BaseTest.click(rp.getChildrenlivingwith());
		 Thread.sleep(4000);
			driver.findElement(By.id("RegPanelSearchvalue")).click();
			
		Thread.sleep(2000);
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 1, 11)+"')]")));
	     
	} catch (Exception e2) {
		System.out.println("no child");
	}
	
	
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
	
	Thread.sleep(4000);
	BaseTest.click(rp.getSubcaste());
	Thread.sleep(4000);
	BaseTest.click(rp.getSearchbar());
	Thread.sleep(3000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 4, 1)+"')]")));
	
	Thread.sleep(4000);
	BaseTest.click(rp.getGothram());
	Thread.sleep(4000);
	BaseTest.click(rp.getSearchbar());
	Thread.sleep(3000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 4, 2)+"')]")));
	
	
	Thread.sleep(4000);
	BaseTest.click(rp.getStar());
	Thread.sleep(4000);
	BaseTest.click(rp.getSearchbar());
	Thread.sleep(3000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 4, 3)+"')]")));
	
	Thread.sleep(4000);
	BaseTest.click(rp.getRaasi());
	Thread.sleep(4000);
	BaseTest.click(rp.getSearchbar());
	Thread.sleep(3000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 4, 4)+"')]")));
	
	Thread.sleep(4000);
	BaseTest.click(rp.getSuddhajadhagam());
	Thread.sleep(4000);
	BaseTest.click(rp.getSearchbar());
	Thread.sleep(3000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 4, 7)+"')]")));
	
	
	Thread.sleep(4000);
	BaseTest.click(rp.getSuddhajadhagam());
	Thread.sleep(4000);
	BaseTest.click(rp.getSearchbar());
	Thread.sleep(3000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 4, 5)+"')]")));
	

	
	try {
		Thread.sleep(4000);
		WebElement ref1=driver.findElement(By.xpath("//*[@id='Val_MsgText']"));
		String a11=ref1.getText();
		System.out.println(a11);
		
		
		Thread.sleep(4000);
		BaseTest.getScreenshot(driver, "specified dhosham");
		
	} catch (Exception e2) {
		System.out.println("no exception");
	}
	
	try {
		Thread.sleep(4000);
		BaseTest.click(rp.getSpecifieddhosham());
		
		Thread.sleep(3000);
		WebElement sudda=driver.findElement(By.xpath("//*[@id='chkbox20']"));
		if (sudda.isEnabled()) {
			System.out.println("already selected");
		}
		else
		{
			sudda.click();
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='Icon_tick']/span/span[2]")).click();
		
	} catch (Exception e2) {
		System.out.println("no exception");
	}

	

	
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
	
//	Thread.sleep(4000);
//	BaseTest.click(rp.getAdditionaldegree());
//	Thread.sleep(3000);
//	BaseTest.click(rp.getSearchbar());
//	Thread.sleep(4000);
//	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 7, 2)+"')]")));
//	
	
	
	Thread.sleep(4000);
	WebElement ref1= driver.findElement(By.xpath("//*[@id='Education_detail']"));
	ref1.sendKeys(BaseTest.getExcelData("Data", 7, 3));
	
	Thread.sleep(4000);
	WebElement ref11= driver.findElement(By.xpath("//*[@id='College_Institution']"));
	Thread.sleep(3000);
	ref11.sendKeys(BaseTest.getExcelData("Data", 7, 4)); 
	
	Thread.sleep(4000);
	BaseTest.click(rp.getEmployedin());
	Thread.sleep(3000);
	BaseTest.click(rp.getSearchbar());
	Thread.sleep(4000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 7, 5)+"')]")));
	
	Thread.sleep(4000);
	BaseTest.click(rp.getOccupation());
	Thread.sleep(3000);
	BaseTest.click(rp.getSearchbar());
	Thread.sleep(4000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 7, 6)+"')]")));

	Thread.sleep(4000);
	BaseTest.click(rp.getEmployedin());
	Thread.sleep(3000);
	BaseTest.click(rp.getSearchbar());
	Thread.sleep(4000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 7, 7)+"')]")));
	
	Thread.sleep(4000);
	BaseTest.click(rp.getOccupation());
	Thread.sleep(3000);
	BaseTest.click(rp.getSearchbar());
	Thread.sleep(4000);
	BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 7, 8)+"')]")));

	try {
		Thread.sleep(4000);
		WebElement ref3= driver.findElement(By.xpath("//*[@id='Occupation_detail']"));
		Thread.sleep(3000);
		ref3.sendKeys(BaseTest.getExcelData("Data", 7, 9));
		
	} catch (Exception e2) {
		System.out.println("no elements");
	}
	
	try {
		Thread.sleep(4000);
		BaseTest.click(rp.getCurrencytype());
		Thread.sleep(4000);
		BaseTest.click(rp.getSearchbar());
		Thread.sleep(4000);
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 7, 10)+"')]")));

	} catch (Exception e2) {
		System.out.println("no currency");
	}
	
	
	WebElement annual=driver.findElement(By.xpath("(//*[@id='Annual_income'])[1]"));
	annual.sendKeys(BaseTest.getExcelData("Data", 7, 11));
	
	
//	try {
//		Thread.sleep(4000);
//		BaseTest.click(rp.getAnnualincome());
//		Thread.sleep(4000);
//		BaseTest.click(rp.getSearchbar());
//		Thread.sleep(4000);
//		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 7, 11)+"')]")));
//		
//	} catch (Exception e2) {
//		System.out.println("not in excel");
//	}
//	
//	try {
//		Thread.sleep(4000);
//		BaseTest.click(rp.getAnnualincome());
//		WebElement inc=driver.findElement(By.xpath("(//*[@id='Annual_income'])[2]"));
//		inc.sendKeys("500000");
//	} catch (Exception e2) {
//		System.out.println("no exception");
//	}
	
	/////other states money///
	try {
		Thread.sleep(4000);
		BaseTest.click(rp.getCurrencytype());
		Thread.sleep(4000);
		BaseTest.click(rp.getSearchbar());
		Thread.sleep(4000);
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 7, 12)+"')]")));

	} catch (Exception e2) {
		System.out.println("no currency");
	}
	
	
	
	Thread.sleep(4000);
	WebElement ref111= driver.findElement(By.xpath("(//*[@id='Annual_income'])[2]"));
	Thread.sleep(3000);
	ref111.sendKeys("12455"); 
	
//	
//	try {
//		Thread.sleep(4000);
//		BaseTest.click(rp.getAnnualincome());
//		WebElement inc=driver.findElement(By.xpath("(//*[@id='Annual_income'])[2]"));
//		inc.sendKeys("500000");
//	} catch (Exception e2) {
//		System.out.println("no exception");
//	}
//	
	
	
	
	
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
	
	
		Thread.sleep(8000);
		BaseTest.click(rp.getCitizenship());
		Thread.sleep(4000);
		BaseTest.click(rp.getSearchbar());
		Thread.sleep(4000);
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 10, 5)+"')]")));
		
		//other states///
		 Thread.sleep(4000);
		  BaseTest.click(rp.getCountry());
		  Thread.sleep(4000);
			BaseTest.click(rp.getSearchbar());
			Thread.sleep(4000);
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 10, 6)+"')]")));
			
try {
	Thread.sleep(4000);
	WebElement state= driver.findElement(By.xpath("//*[@id='Residing_state_text']"));
	Thread.sleep(3000);
	state.sendKeys(BaseTest.getExcelData("Data", 10, 7)); 
	
} catch (Exception e2) {
	System.out.println("no elements");
}
try {
	Thread.sleep(4000);
	WebElement city= driver.findElement(By.xpath("//*[@id='Residing_city_text']"));
	Thread.sleep(3000);
	city.sendKeys(BaseTest.getExcelData("Data", 10, 8)); 
	
} catch (Exception e2) {
	System.out.println("no elements");
}
	
try {
	Thread.sleep(4000);
	WebElement pob= driver.findElement(By.xpath("//*[@id='Place_of_birth']"));
	Thread.sleep(3000);
	pob.sendKeys(BaseTest.getExcelData("Data", 10, 9)); 
	
} catch (Exception e2) {
	System.out.println("no elements");
}


Thread.sleep(15000);

//try {
//	Thread.sleep(8000);
//	JavascriptExecutor js3 = (JavascriptExecutor)driver;
//	  WebElement edi3= driver.findElement(By.xpath("//*[@id='ResidentStatus_display']/div[2]"));
//  	  js3.executeScript("arguments[0].scrollIntoView(true);",edi3);
//	Thread.sleep(8000);
//	WebElement residentstatus= driver.findElement(By.xpath("//*[@id='ResidentStatus_display']/div[2]"));
//	residentstatus.click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id='list_view_detail']/li[1]")).click();
//	
//} catch (Exception e2) {
//	System.out.println("no resident1");
//}

try {
	Thread.sleep(8000);
	JavascriptExecutor js3 = (JavascriptExecutor)driver;
	  WebElement edi3= driver.findElement(By.xpath("//*[@id='Resident_status']"));
  	  js3.executeScript("arguments[0].scrollIntoView(true);",edi3);
	Thread.sleep(8000);
driver.findElement(By.xpath("//*[@id='Resident_status']")).click();

	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='list_view_detail']/li[1]")).click();
	

} catch (Exception e2) {
	System.out.println("no resident2");
	}


//try {
//	Thread.sleep(8000);
//	JavascriptExecutor js3 = (JavascriptExecutor)driver;
//	  WebElement edi3= driver.findElement(By.xpath("(//div[@class='formfields select-list'])[4]"));
//  	  js3.executeScript("arguments[0].scrollIntoView(true);",edi3);
//	Thread.sleep(8000);
//	WebElement residentstatus= driver.findElement(By.xpath("(//div[@class='formfields select-list'])[4]"));
//	residentstatus.click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//*[@id='list_view_detail']/li[1]")).click();
//	
//} catch (Exception e2) {
//	System.out.println("no resident3");
//}




//Thread.sleep(8000);
//BaseTest.click(rp.getCitizenship());
//Thread.sleep(4000);
//BaseTest.click(rp.getSearchbar());
//Thread.sleep(4000);
//BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 10, 5)+"')]")));


try {
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id='ValidationError_Popup']/img")).click();
} catch (Exception e2) {
	System.out.println("no alert");
}


			Thread.sleep(4000);
			BaseTest.click(rp.getBasicdetailsave());
		Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click(); 
			
			try {
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id='ValidationError_Popup']/img")).click();
			} catch (Exception e2) {
				System.out.println("no alert");
			}
			
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
	  driver.findElement(By.xpath("//*[@id='Brothers']")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id='list_view_detail']/li[2]")).click();
		try {
			Thread.sleep(4000);
			 driver.findElement(By.xpath("//*[@id='Brothers_Married']")).click();
			Thread.sleep(4000);
			  driver.findElement(By.xpath("//*[@id='list_view_detail']/li[2]")).click();
			
		} catch (Exception e2) {
			System.out.println("no elements");
		}	
		
		 Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='Sisters']")).click();
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//*[@id='list_view_detail']/li[2]")).click();
		  try {
				Thread.sleep(4000);
				 driver.findElement(By.xpath("//*[@id='Sisters_Married']")).click();
				Thread.sleep(4000);
				  driver.findElement(By.xpath("//*[@id='list_view_detail']/li[2]")).click();
				
			} catch (Exception e2) {
				System.out.println("no elements");
			}	
			
	  Thread.sleep(4000);
	  BaseTest.click(rp.getBasicdetailsave());
	 
	  
	  
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click();
	  
	  
	/////Life Style////  
	  
	  Thread.sleep(4000);
	  BaseTest.click(rp.getLifestyle());
	  
	  Thread.sleep(4000);
	  BaseTest.click(rp.getEatinghabit());
	  Thread.sleep(4000);
	  BaseTest.click(rp.getSearchbar());
	Thread.sleep(8000);
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 16, 1)+"')]")));
	  
	  
		 Thread.sleep(4000);
		  BaseTest.click(rp.getDrinkinghabit());
		  Thread.sleep(4000);
		  BaseTest.click(rp.getSearchbar());
		Thread.sleep(4000);
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 16, 2)+"')]")));
		  
			 Thread.sleep(4000);
			  BaseTest.click(rp.getSmokinghabit());
			  Thread.sleep(4000);
			  BaseTest.click(rp.getSearchbar());
			Thread.sleep(4000);
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Data", 16, 3)+"')]")));
			  
				 Thread.sleep(4000);
				  BaseTest.click(rp.getHobbiesandinterest());
				  Thread.sleep(4000);
				 driver.findElement(By.xpath("//*[@id='chkboxh-8']")).click();
				 Thread.sleep(4000);
				 driver.findElement(By.xpath("//*[@id='Icon_tick']/span/span[2]")).click();
	  
	  
	         Thread.sleep(4000);
	         WebElement hobbies=driver.findElement(By.xpath("//*[@id='Other_Hobbies']"));
	         hobbies.sendKeys(BaseTest.getExcelData("Data", 16, 5));
	  
	         Thread.sleep(4000);
			  BaseTest.click(rp.getMusic());
			  Thread.sleep(4000);
			WebElement demo= driver.findElement(By.xpath("//*[@id='chkbox4']"));
			if (demo.isEnabled()) {
				System.out.println("passed");
			}
			else {
				demo.click();
			}
			 Thread.sleep(4000);
			 driver.findElement(By.xpath("//*[@id='Icon_tick']/span/span[2]")).click();
 
			 Thread.sleep(4000);
	         WebElement music=driver.findElement(By.xpath("//*[@id='other_music']"));
	         music.sendKeys(BaseTest.getExcelData("Data", 16, 7));
	  
	         Thread.sleep(4000);
			  BaseTest.click(rp.getSports());
			  Thread.sleep(4000);
			  WebElement demo1=driver.findElement(By.xpath("//*[@id='chkbox7']"));
			  if (demo1.isEnabled()) {
					System.out.println("passed");
				}
				else {
					demo1.click();
				}
			 Thread.sleep(4000);
			 driver.findElement(By.xpath("//*[@id='Icon_tick']/span/span[2]")).click();

			 Thread.sleep(4000);
	         WebElement sports=driver.findElement(By.xpath("//*[@id='other_sports']"));
	         sports.sendKeys(BaseTest.getExcelData("Data", 16, 9));
	  
	  
	         Thread.sleep(4000);
			  BaseTest.click(rp.getFood());
			  Thread.sleep(4000);
			 WebElement demo2=driver.findElement(By.xpath("//*[@id='chkbox13']"));
			 if (demo2.isEnabled()) {
					System.out.println("passed");
				}
				else {
					demo2.click();
				}
			 Thread.sleep(4000);
			 driver.findElement(By.xpath("//*[@id='Icon_tick']/span/span[2]")).click();

			 Thread.sleep(4000);
	         WebElement food=driver.findElement(By.xpath("//*[@id='other_food']"));
	         food.sendKeys(BaseTest.getExcelData("Data", 16, 11));
	  
	  
	   	  Thread.sleep(4000);
	   	  BaseTest.click(rp.getBasicdetailsave());
	   	
	   	  Thread.sleep(4000);
	   	  driver.findElement(By.xpath("//*[@id='SucessPopupclose']/img")).click();
	   	  
	  
	  
	  
	  
	  
	  
		
}
}