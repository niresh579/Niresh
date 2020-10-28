package napalimatrimony.copy;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.MalformedURLException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Basepack.Base3;
import PomPack.AddonpackPom;

import PomPack.NagativepaymentPOM;
import PomPack.PPandeditsearchPOM;
import PomPack.RandomidcheckPOM;
import PomPack.StarwithmothertounghPPPom2;
import PomPack.StarwithmothertounghPom;
import PomPack.UpgrateexcelPom;

public class PPandeditsearch extends Base3{
	private static final String Data = null;
	public static WebDriver driver; 
	String driverExecutablePath = "C:\\Users\\CBSTEsting\\eclipse-workspace\\ArtifMatrimony\\driver\\chromedriver.exe";
	ExtentReports report;
    ExtentTest logger; 
    
   @BeforeMethod
  public void setUp1() throws MalformedURLException { 
	  System.setProperty("webdriver.chrome.driver", driverExecutablePath); 
	  ChromeOptions options = new ChromeOptions();
	   options.addArguments("--disable-notifications");
	  driver = new ChromeDriver(options);
	  
      
  
  }
  @Test
  public void setUp2()throws Throwable  {
	  PPandeditsearchPOM np = new PPandeditsearchPOM(driver); 
	  driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	    sk1(np.getUsername(),"NEP137204");
		Thread.sleep(4000);
		WebElement e1=driver.findElement(By.xpath("//*[@id='passwordClear1']"));
        Actions a1=new Actions(driver);
        a1.sendKeys(e1,"cbstest").build().perform();
        Thread.sleep(6000);
        click(np.getLogin1());
		Thread.sleep(10000);
		         
		try {
			WebElement skip = driver.findElement(By.xpath("//a[@class='clr7']"));
			skip.click();
		click(np.getSkip());
		} catch (Exception e) {
			 System.out.println("ok");
			 }
		Thread.sleep(15000);
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(4000);
			WebElement popup = driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img"));
			popup.click();
	     	} catch (Exception e) {
           System.out.println("ok");		}
		
       	Thread.sleep(8000);
       	click(np.getProfileclick());
       	click(np.getProfileclick1());
       	
		WebElement Maritialstatus = driver.findElement(By.xpath("//*[@id='strictflag']/div[2]/div[1]/span[2]"));
        String Maritialstatusis = Maritialstatus.getText();
        
        System.out.println("Marritial status pp =  " + Maritialstatusis );
        
        
        WebElement Age = driver.findElement(By.xpath("//*[@id='strictflag']/div[4]/div[1]/span[2]"));
        String Ageis = Age.getText();
        
        System.out.println("Age is pp =  " + Ageis );
        
                
        WebElement Height = driver.findElement(By.xpath("//*[@id='strictflag']/div[6]/div[1]/span[2]"));
        String Heightis = Height.getText();
        System.out.println("Height pp = " + Heightis);
        
             
        Thread.sleep(3000);
        WebElement Mothertoungue = driver.findElement(By.xpath("//*[@id='strictflag']/div[8]/div[1]/span[2]"));
        String Mothertoungueis = Mothertoungue.getText();
               
        System.out.println("Mothertoungue pp = " + Mothertoungueis);
        
        
        WebElement Physicalstatus = driver.findElement(By.xpath("//*[@id='strictflag']/div[10]/div[1]/span[2]"));
        String Physicalstatusis = Physicalstatus.getText();
        
        System.out.println("Physicalstatus pp  = " + Physicalstatusis);
        
        
        
        WebElement Eatinghabit = driver.findElement(By.xpath("//*[@id='strictflag']/div[12]/div[1]/span[2]"));
        String Eatinghabitis = Eatinghabit.getText();
        
        System.out.println("Eatinghabitis pp = "  + Eatinghabitis);
        
       
        
        WebElement Drinkinghabit = driver.findElement(By.xpath("//*[@id='strictflag']/div[14]/div[1]/span[2]"));
        String Drinkinghabitis = Drinkinghabit.getText();
        
        System.out.println("Drinkinghabitis PP" + Drinkinghabitis);
       
        
        WebElement Smokehabit = driver.findElement(By.xpath("//*[@id='strictflag']/div[16]/div[1]/span[2]"));
        String Smokehabitis = Smokehabit.getText();
        
        System.out.println("Smokehabit PP" +Smokehabitis);
        
        WebElement manglik = driver.findElement(By.xpath("//*[@id='strictflag']/div[18]/div[1]/span[2]"));
        String Kujudoshamis = manglik.getText();
        
        System.out.println("manglik pp = " + Kujudoshamis);
        
        WebElement Eudcation = driver.findElement(By.xpath("//*[@id='strictflag']/div[20]/div[1]/span[2]"));
        String Eudcationis = Eudcation.getText();
        
        System.out.println("Eudcation PP = " + Eudcationis);
        
        WebElement Annualincome = driver.findElement(By.xpath("//*[@id='strictflag']/div[24]/div[1]/span[2]"));
        String Annualincomeis = Annualincome.getText();
        
        System.out.println("Annualincome PP = " + Annualincomeis);
        
        
        WebElement Citizenship = driver.findElement(By.xpath("//*[@id='strictflag']/div[26]/div[1]/span[2]"));
        String Citizenshipis = Citizenship.getText();
        
        System.out.println("Citizenship = " + Citizenshipis);
        
          
        WebElement Country = driver.findElement(By.xpath("//*[@id='strictflag']/div[28]/div[1]/span[2]"));
        String Countryis = Country.getText();
        
        System.out.println("Country PP = " + Countryis);
        

       
       
       
             
        Thread.sleep(10000);
        WebElement searchclick = driver.findElement(By.xpath("//*[@id='topnav-login-menu']/div[2]/div[4]/a"));
        searchclick.click();
        
        
        Thread.sleep(8000);
      
        WebElement Advanceclick = driver.findElement(By.xpath("//a[text()='Advanced']"));
        Advanceclick.click();
        
        
        Thread.sleep(3000);
        
        WebElement Maritialstatusad = driver.findElement(By.xpath("//*[@id='Maritalvalidation']/div[3]/span/label"));
        String Maritialstatusisad = Maritialstatusad.getText();
        
        System.out.println("Marritial status pp =  " + Maritialstatusis +  " & "  + "Marritial status advancesearch =  " + Maritialstatusisad );
        System.out.println( );
        
        WebElement Ageadfrom = driver.findElement(By.xpath("//*[@id='ageFrom']/option[6]"));
        String Ageisadfrom = Ageadfrom.getText();
        
        WebElement Ageadto = driver.findElement(By.xpath("//*[@id='ageTo']/option[14]"));
        String Ageisadto = Ageadto.getText();
       
        System.out.println("Age is pp =  " + Ageis +  " & "  + "Ageis advancesearch =  " + Ageisadfrom + " to " + Ageisadto + "Yrs" );
      
        
        WebElement Hieghtadfrom = driver.findElement(By.xpath("//*[@id='heightFrom']/option[1]"));
        String Hieghtadisfrom = Hieghtadfrom.getText();
        
        WebElement Hieghtadto = driver.findElement(By.xpath("//*[@id='heightFrom']/option[1]"));
       String Hieghtadisto = Hieghtadto.getText();
        
        
       System.out.println("Height pp = " + Heightis +  " & "  +"Height advancesearch =  " + Hieghtadisfrom + " to " + Hieghtadisto + "inches" );
        Thread.sleep(3000);
                    
        System.out.println("Mothertoungue pp = " + Mothertoungueis +  " & "  +"Mothertoungue advancesearch = Any ");
        
        Thread.sleep(3000);
        
        WebElement Physicalstatusad = driver.findElement(By.xpath("//*[@id='physicalStatus2']"));
        String Physicalstatusisad = Physicalstatusad.getText();
        
        
        System.out.println("Physicalstatus pp  = " + Physicalstatusis+  " & "  +"Physicalstatus advancesearch  = " + Physicalstatusisad);
       
        
        System.out.println("Eatinghabitis pp = "  + Eatinghabitis+  " & "  +"Eatinghabitis advancesearch = No selected ");
        
        System.out.println("Drinkinghabitis PP" + Drinkinghabitis+  " & "  +"Drinkinghabitis advancesearch = No selected ");
        
        System.out.println("Smokehabit PP" +Smokehabitis+  " & "  +"Smokehabitis advancesearch = No selected ");
        
               
        System.out.println("Manglik pp = " + Kujudoshamis+  " & "  +"Manglik advancesearch = No tab like Kujudoshamis if chevvaidosham is same, then the value is Doesnt matter ");

        
        System.out.println("Eudcation PP = " + Eudcationis+  " & "  +"Eudcation advancesearch =  all education selected");
        
        

        WebElement Annualincomead = driver.findElement(By.xpath("//*[@id=\"annualIncome\"]/option[1]"));
        String Annualincomeisad = Annualincomead.getText();
        
        System.out.println("Annualincome PP = " + Annualincomeis+  " & "  +"Annualincome advancesearch = " + Annualincomeisad);
        
        
        System.out.println("Citizenship = " + Citizenshipis+  " & "  +"Citizenship advancesearch =  No citizenship mentioned if resident status is same then no selected any item"  );

        WebElement Countryad = driver.findElement(By.xpath("//*[@id='countryTemp']/option[1]"));
        String Countryisad = Countryad.getText();
        
        System.out.println("Country PP = " + Countryis+  " & "  +"Country advancesearch = " + Countryisad);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
  }    	
  }       

			
		
	
  
  
