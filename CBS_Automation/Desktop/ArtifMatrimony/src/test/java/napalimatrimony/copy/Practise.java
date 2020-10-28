package napalimatrimony.copy;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
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

import javax.imageio.ImageIO;

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
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import Basepack.Base3;
import PomPack.AddonpackPom;

import PomPack.NagativepaymentPOM;
import PomPack.PPandeditsearchPOM;
import PomPack.RandomidcheckPOM;
import PomPack.StarwithmothertounghPPPom2;
import PomPack.StarwithmothertounghPom;
import PomPack.UpgrateexcelPom;

public class Practise extends Base3{
	private static final String Data = null;
	public static WebDriver driver; 
	String driverExecutablePath = "C:\\Users\\CBSTEsting\\eclipse-workspace\\ArtifMatrimony\\driver\\chromedriver.exe";
	
    
   @BeforeMethod
  public void setUp1() throws MalformedURLException { 
	  System.setProperty("webdriver.chrome.driver", driverExecutablePath); 
	  ChromeOptions options = new ChromeOptions();
	   options.addArguments("--disable-notifications");
	  driver = new ChromeDriver(options);
	  
      
  
  }
  @Test
  public void setUp2()throws Throwable  {
//	  PPandeditsearchPOM np = new PPandeditsearchPOM(driver); 
//	  driver.get("https://www.communitymatrimony.com");
//	  WebElement firstimg = driver.findElement(By.xpath("//*[@id='domain_title']"));	  
//        
      int a = 27;
      int b = 1;
      System.out.println("age" + (a+b) );
	  
  }
     

      
//  Shutterbug.shootPage(driver).save("D:\\");
//  File image = new File("D:\\photo1.jpg");
//  BufferedImage  expectedImage = ImageIO.read(image);
//  boolean status =  Shutterbug.shootPage(driver,ScrollStrategy.WHOLE_PAGE,500,true).withName("Actual").equals(expectedImage,0.1);
//  Assert.assertTrue(status); 
//  driver.quit();
        
        
        
        
        
        
        
        
        
        
        
        
  }    	
         

			
		
	
  
  
