package logic;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import test.srilanka.GlobalRegisterationPOM;


public class GlobalRegistration {
	private static final String Data = null;
	private static final boolean False = false;
		public static WebDriver driver; 
		String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\srilanka\\drivernew\\chromedriver.exe";
		
		
		 @BeforeMethod
		  public void setUp1() throws MalformedURLException { 
			   
			  
			  System.setProperty("webdriver.chrome.driver", driverExecutablePath); 
			  ChromeOptions options = new ChromeOptions();
			   options.addArguments("--disable-notifications");
			  driver = new ChromeDriver(options);
			  
		      
		  
		  }
		   
		   @Test
		   public void testCase() throws Throwable {
			   GlobalRegisterationPOM rp = new GlobalRegisterationPOM(driver);
			   Thread.sleep(3000);
			     driver.get("https://www.Pakistanimatrimony.com");
			    // logger.log(LogStatus.PASS, "URL Launched Successfully");
				  driver.manage().window().maximize();
			   
//profile created
				  Thread.sleep(4000);
				  driver.findElement(By.xpath("//*[@id='profile']")).click();
                  Thread.sleep(4000);
                  driver.findElement(By.xpath("//*[@id='profile']/option[2]")).click();
                  
  //NAME
                  Thread.sleep(4000);
                  WebElement name=driver.findElement(By.xpath("//*[@id='name']"));
                  name.sendKeys("latha");
                  
 //gender
                  Thread.sleep(4000);
                  BaseTest.click(rp.getGender());                  
//Dob
                  Thread.sleep(4000);
                  WebElement dob = driver.findElement(By.id("dobDay"));
		          Thread.sleep(4000);
				   Select sdob = new Select(dob);
				   sdob.selectByIndex(5);
                  
				   WebElement dom = driver.findElement(By.id("dobMonth"));
			       Thread.sleep(4000);
				   Select sdom = new Select(dom);
				   sdom.selectByIndex(5);
					   
				   WebElement doy = driver.findElement(By.id("dobYear"));
				   Thread.sleep(4000);
				   Select sdoy = new Select(doy);
				   sdoy.selectByIndex(7);
						   
//Marital status
				  Thread.sleep(4000);
				  BaseTest.click(rp.getMarital());
   
//Religion
						  
				  Thread.sleep(4000);
			      WebElement reli = driver.findElement(By.id("religion"));
				  Thread.sleep(4000);
				  Select reli1 = new Select(reli);
				  reli1.selectByVisibleText("Muslim - Shia");;
//sect		                  
				  Thread.sleep(4000);
                  WebElement cast = driver.findElement(By.id("caste"));
		          Thread.sleep(4000);
				   Select cast1 = new Select(cast);
				   cast1.selectByVisibleText("Jat");;         
    
//mothertongue
				   
                  
				   Thread.sleep(4000);
	                WebElement mother = driver.findElement(By.id("motherTongue"));
			        Thread.sleep(4000);
					Select mother1 = new Select(mother);
					mother1.selectByVisibleText("Urdu");;         
	                
//country
					Thread.sleep(4000);
	                WebElement count = driver.findElement(By.id("country"));
			        Thread.sleep(4000);
					Select count1 = new Select(count);
					count1.selectByVisibleText("India");;         
	                					
//mobile no
					Thread.sleep(4000);
	                WebElement mob = driver.findElement(By.id("mobileNo"));		
	                mob.sendKeys("9176800869");
//pass
	                Thread.sleep(4000);
	                WebElement pass = driver.findElement(By.id("password"));		
	                pass.sendKeys("cbstest");
                  	                
 //registernow
	                Thread.sleep(4000);
	                BaseTest.click(rp.getRegisternow());
                  
                  
//2page
//email
	                Thread.sleep(4000);
					Actions acc11 = new Actions(driver);
					WebElement mail11=driver.findElement(By.xpath("//*[@id='email']"));
					acc11.doubleClick(mail11).perform();
					Thread.sleep(4000);
					WebElement mail111=driver.findElement(By.xpath("//*[@id='email']"));
					mail111.sendKeys("st"+ (Math.floor(Math.random() * 1478) + "@gmail.com"));	
                  
                  
//height
					Thread.sleep(4000);
	                WebElement height = driver.findElement(By.id("select2-heightFeet-container"));
	                height.click();
			        Thread.sleep(4000);
					driver.findElement(By.xpath("//li[@title='4 feet 7 inches']")).click();
					    			
                  
//physcial
					 Thread.sleep(4000);					 
                     BaseTest.click(rp.getPhysicalstatus());
                  
//country
//                     Thread.sleep(4000);
// 	                WebElement country = driver.findElement(By.id("select2-country-container"));
// 			        Thread.sleep(4000);
// 					 Select country1 = new Select(country);
// 					country1.selectByVisibleText("India");
                  
//State
                    Thread.sleep(4000);
	                WebElement state = driver.findElement(By.id("select2-residingState-container"));
	                state.click();
			        Thread.sleep(4000);
			        driver.findElement(By.xpath("//li[@title='Andhra Pradesh']")).click();
 					
//city
	                 Thread.sleep(4000);
		             WebElement city = driver.findElement(By.id("select2-residingCityMainDistId-container"));
		             city.click();
				     Thread.sleep(4000);
				     driver.findElement(By.xpath("//li[@title='Chittoor']")).click();
					 
//Religious value
					 Thread.sleep(4000);
		             WebElement religival = driver.findElement(By.id("select2-religious-container"));
		             religival.click();
				     Thread.sleep(4000);
				     driver.findElement(By.xpath("//li[@title='Very Islamic ']")).click();
//education	
	                 Thread.sleep(4000);
		             WebElement edu = driver.findElement(By.id("select2-educationCategory-container"));
		             edu.click();
				     Thread.sleep(4000);
				     driver.findElement(By.xpath("//li[contains(text(),'Ph.D.')]")).click();				 
					
//employed in
					 Thread.sleep(4000);
					 BaseTest.click(rp.getEmployedin());
		
//occupation
					 Thread.sleep(4000);
					 WebElement occ = driver.findElement(By.id("select2-occupation-container"));
					 occ.click();
				     Thread.sleep(4000);
				     driver.findElement(By.xpath("//li[contains(text(),'Beautician')]")).click();	
				     
//Income
					 Thread.sleep(4000);
					 WebElement income = driver.findElement(By.id("select2-annualIncome-container"));
					 income.click();
				     Thread.sleep(4000);
				     driver.findElement(By.xpath("//li[contains(text(),'1 - 2 Lakhs')]")).click();					     
					
//ethinicity
					 Thread.sleep(4000);
		             WebElement ethini = driver.findElement(By.id("select2-ethnicity-container"));
		             ethini.click();
				     Thread.sleep(4000);
				     driver.findElement(By.xpath("//li[@title='Urdu']")).click();		
					
//complete Registeration
					 Thread.sleep(4000);
					 BaseTest.click(rp.getCompliteregisteration());

}
}