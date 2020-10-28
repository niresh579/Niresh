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
import Basepack.Base1;
import Basepack.Base2;
import PomPack.AddonpackPom;

import PomPack.NagativepaymentPOM;
import PomPack.RandomidcheckPOM;
import PomPack.StarwithmothertounghPPPom2;
import PomPack.StarwithmothertounghPom;
import PomPack.UpgrateexcelPom;

public class Starwithmothertoungefinal extends Base2{
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
	  StarwithmothertounghPPPom2 np = new StarwithmothertounghPPPom2(driver); 
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
		//click(np.getSkip());
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
       	
       	
       	Thread.sleep(5000);
       	String parentwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		for (String id : allwindow) {
			if (!parentwindow.equals(id)) {
			driver.switchTo().window(id);
			}
			
		}
		String curl = driver.getCurrentUrl();
       	click(np.getPPE());
       
       	System.out.println("current url " + curl);
       	
       	WebElement mt = driver.findElement(By.xpath("//*[@id='newloadProfileValue']/div[1]/div/div[1]/div[7]/div[5]/div[2]/div/div/ul/li[7]/span[3]"));
	    String st = mt.getText();
          	System.out.println("mt" + st);
          	click(np.getSearchclick());
       		click(np.getAdvancesearch());
          
          	File loc = new File("C:\\Users\\CBSTEsting\\eclipse-workspace\\ArtifMatrimony\\Excel\\Star.xlsx");
          	FileInputStream stream = new FileInputStream(loc);
          	Workbook w = new XSSFWorkbook(stream);
          	Sheet s = w.getSheet("sheet1");
          	Row r = s.getRow(0);
          	
          	for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) { //i=6
				Cell c = r.getCell(i);
				String name = c.getStringCellValue();
				System.out.println("first loop " + name);
				
				if (name.equals(st)) {
					for (int j = 1; j < s.getPhysicalNumberOfRows(); j++) {
						Row rs = s.getRow(j);//j=2
						Cell cs = rs.getCell(i);//i=6
						String a = cs.getStringCellValue();//Aswini
						System.out.println("Excel value of " + a);
						Thread.sleep(5000);
						try {
							WebElement addonjs = driver.findElement(By.xpath("//*[@id='srcform']/div[3]/dl[9]/dt"));
				       		JavascriptExecutor jss = (JavascriptExecutor)driver;
					        jss.executeScript("arguments[0].scrollIntoView(true);",addonjs);
							//WebElement click5 = driver.findElement(By.xpath("//*[@id=\"frmPartner\"]/div/dl[16]/dd/div[1]/span/span[1]/span/ul/li/input"));
			       			//click5.click();
			       			Thread.sleep(5000);
							
						} catch (Exception e) {
							System.out.println("picking weblist");
						}
						
		       			List <WebElement> demos = driver.findElements(By.xpath("//select[@id='starTemp']/option"));
						String at = demos.get(j).getText();// 
						System.out.println("list match" + at);//aswini
						
						if (a.equals(at)) {
							System.out.println(a + " matches " + at);
						}else {
							System.out.println(a + "Not matches" + at);
						}
					}
					
					System.out.println("All star matches");
					
				}
				
				
			
          	if (!name.equals(st)) {
				for (int j = 1; j < s.getPhysicalNumberOfRows(); j++) {
					Row rs = s.getRow(j);//j=2
					Cell cs = rs.getCell(15);//i=6
					String a = cs.getStringCellValue();//Aswini
					System.out.println("Excel value of " + a);
					Thread.sleep(5000);
					try {
						WebElement addonjs = driver.findElement(By.xpath("//*[@id='srcform']/div[3]/dl[9]/dt"));
			       		JavascriptExecutor jss = (JavascriptExecutor)driver;
				        jss.executeScript("arguments[0].scrollIntoView(true);",addonjs);
						//WebElement click5 = driver.findElement(By.xpath("//*[@id=\"frmPartner\"]/div/dl[16]/dd/div[1]/span/span[1]/span/ul/li/input"));
		       			//click5.click();
		       			Thread.sleep(5000);
						
					} catch (Exception e) {
						System.out.println("picking weblist");
					}
					
	       			List <WebElement> demos = driver.findElements(By.xpath("//select[@id='starTemp']/option"));
					String at = demos.get(j).getText();// 
					System.out.println("list match" + at);//aswini
					
					if (a.equals(at)) {
						System.out.println(a + " matches " + at);
					}else {
						System.out.println(a + "Not matches" + at);
					}
				}
				
				System.out.println("All star matches");
       		
			            }
       
			       
				}
}			
  		
						
}
					

				
					
					
				
				
				

			
		
       	
       	
       	
       	
  	
  

		
      
		
			
		
  
  
	
			
		
	
  
  
