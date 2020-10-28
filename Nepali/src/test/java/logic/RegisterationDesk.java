package logic;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pom.BaseTest;
import pom.RegisterationDeskPOM;




public class RegisterationDesk extends BaseTest {

	
	
	
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
			   RegisterationDeskPOM rp = new RegisterationDeskPOM(driver);
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
					
					 @AfterMethod
					 
					 public void smsTest(ITestResult result) throws Throwable {
					   		
						 // Create object of SimpleDateFormat class and decide the format
						 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
						 
						 //get current date time with Date()
						 Date date = new Date();
						 
						 // Now format the date
						 String date1= dateFormat.format(date);
						 
						 // Print the Date
						 System.out.println(date1);
						 
						 
						 
					   		status = result.getName();
					   			
					   		if (result.getStatus()==2) {			
					   			logger.log(LogStatus.FAIL,  "Test Case Failed is "+result.getName());			
					   			logger.log(LogStatus.FAIL, "Script Failed due to  below reason : " +"\n"+ result.getThrowable());				
					   			//String screenshotPath =PayMentTest.getScreenshot(driver, result.getName());			
					   			//logger.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
					   		 }else if(result.getStatus() == ITestResult.SKIP){
					   			logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());			 
					   		 }
					   		
					   		

					   		if (result.getStatus() == 2) {
					   			String url = driver.getCurrentUrl();
					   			System.out.println(url);
					   			
					   			
					   			 try {
					   			String[] splt = url.split(".php?");
					   			String a = splt[0].toString();
					   			System.out.println(a);

					   			String[] b = a.split("://");
					   			String c = b[1].toString();
					   			System.out.println(c);

					   			String[] d = c.split("/");
					   			domain = d[0].toString();
					   			System.out.println(domain);
					   			
					   		//	error = result.getName();

					   			try {
					   				error = d[2].toString();
					   				System.out.println(error);
					   	} catch (Exception e) {
					   		error = d[1].toString();
					   		System.out.println(error);
					   	}		
					   			
					   			
					   			
					   			
					   			
					   	Thread.sleep(2000);
					   				try {
					   					if (error.contains("index")) {						
					   						error = "HomePage"; 						
					   					} else if (error.contains("logincheck")) {						
					   						error = "Login Page";						
					   					} else if (error.contains("cbslogincheck")) {					
					   						error = "Login Page";						
					   					}  else if (error.contains("register_payment_upgrade")) {						
					   						error = "Payment Page(PayUbiz)";						
					   					} else if (error.contains("?error=1")) {						
					   						error = "Login Page";						
					   					} else if (error.contains("setcookie")) {						
					   						error = "Login page";
					   					}  
					   				} catch (Exception e) {				
					   				}
					   	
					   				
					   			try {
					   				if (error.isEmpty()) {
					   					error = " Page Loading Timeout Error ";
					   				} else {
					   					error = "Page Loading Timeout Error";
					   				}
					   			} catch (Exception e) {
					   				// TODO: handle exception
					   			}
					      
					   			
					   			String  exception = result.getThrowable().getMessage();
					   			System.out.println("1 :  " +exception);
					   			/*Throwable exceptio = result.getThrowable();
					   			String exception = exceptio.getMessage();
					   			System.out.println(exception);

					   			String except = exception.toString();
					   			System.out.println(except);*/

					   			String[] ex = exception.split(":");
					   			 exp = ex[0].toString();
					   			System.out.println("1" + exp);
					   			 expt = ex[1].toString().trim();
					   			System.out.println("2" + expt);
					   			
					   			try {
					   				if (expt.contains("Unable to locate element")) {					
					   					expt = "Requested Page is not displayed due to loading time";					
					   				} else if (expt.contains("")) {					
					   				}
					   			} catch (Exception e) {

					   			}

					   			try {
					   				if (error.contains("?error=1")) {					
					   					expt="Facing Technical Difficulty to login";					
					   				} else {
					   				}
					   			} catch (Exception e) {
					   			}
					   			
					   			String expti = ex[2].toString();
					   			String exptio = ex[3].toString();
					   			System.out.println(expti + " : " + exptio);
					   			
					   			Thread.sleep(3000);	
					   			try {		
					   							if (driver.findElement(By.xpath("//*[@id=\"main-message\"]/h1")).isDisplayed()) {					
					   							expt = driver.findElement(By.xpath("//*[@id=\"main-message\"]/h1")).getText();
					   							System.out.println(expt);							
					   							} else {
					   							}
					   						} catch (Exception e) {
					   						}
					   			
					   			
					   			Thread.sleep(3000);	
					   			try {	
					   							if (driver.findElement(By.id("main-message")).isDisplayed()) {															
					   							expt = driver.findElement(By.id("main-message")).getText();
					   							System.out.println(expt);							
					   							} else {
					   							}
					   						} catch (Exception e) {						
					   							
					   							// TODO: handle exception
					   						}
					   			
					   			try {
					   				if (expt.isEmpty()) {					
					   					//expt = " Page Load timeout / Internal Server Error ";					
					   					URL url1 = new URL(driver.getCurrentUrl());
					   					 String a1 = url1.toString();
					   					driver.get(a1);
					   					//URL url = new URL(Url1);
					   					HttpURLConnection connection = (HttpURLConnection) url1.openConnection();
					   					connection.setRequestMethod("GET");
					   					connection.connect();
					   					int code = connection.getResponseCode();
					   					System.out.println("Response code of the object is " + code);
					   					try {
					   					if (code == 200 | code <= 200) {
					   					System.out.println("Success");
					   					} else if (code == 300 | code <= 300) {
					   					System.out.println("Redirecting");
					   					} else if (code == 400 | code <= 400) {
					   					System.out.println("Client Error");
					   					} else if (code == 500 | code <= 500) {
					   					System.out.println("Server Error");
					   					expt = "Internal Server Error";
					   					}
					   					} catch (Exception e) {
					   						expt = " Page Load timeout ";
					   					}
					   				}  else {
					   					//expt = " Page Load timeout ";
					   				}
					   			} catch (Exception e) {
					   				expt = " Error on launching Browser -"+" Internal Server Error - Read ";
					   			}
					   	
					       } catch (Exception e) {	
					   	}
					   		} else {
					   		}

					   		
					   		////    Level 1   /////
					   		if (result.getStatus() == 2) {
					   			BaseTest.sendVFSmsreg1(error, expt, date1);
					   		//	BaseTest.reportflush(domain, error, expt);
					   		} else if (result.getStatus() == 1) {
					   			String pass = BaseTest.getExcelData("REG", 1, 1);
					   			System.out.println(pass);
					   			if (pass.equals("2")) {
					   				BaseTest.sendVFSmsreg(date1);
					   			//	BaseTest.reportflush2();
					   			}
					   		} else {
					   		}
					   		
					   		
					   		
					   		
					   		////  Level  2
					   		if (result.getStatus() == 2) {
					   			String fail = BaseTest.getExcelData("REG", 1, 1);
					   			System.out.println(fail);
					   			if (fail.equals("2")) {		
					   			 	BaseTest.sendVFSmsregfail2(error, expt, date1);
					   		//		BaseTest.reportflush1(domain, error, expt);
					   			}
					   			}else if (result.getStatus() == 1) {
					   				String pass = BaseTest.getExcelData("REG", 2, 1);
					   				if (pass.equals("2")) {
					   			 		BaseTest.sendVFSmsreg2(date1);
					   		//			BaseTest.reportflush3();					
					   				}		
					   		} else {
					   		}
					   		
					   		
					   		
					   		
					   		
					   	//   Level   3     
					   		
					   	///////   Level   3  //////
					   		
					   			if (result.getStatus() == 2) {
					   				String fail = BaseTest.getExcelData("REG", 2, 1);
					   				System.out.println(fail);
					   				if (fail.equals("2")) {
					   			 		BaseTest.sendVFSmsregfail3(error, expt, date1);
					   			//	BaseTest.reportflush_Fail3(domain, error, expt);		
					   				}
					   				}else if (result.getStatus() == 1) {
					   					String pass = BaseTest.getExcelData("REG", 3, 1);
					   					if (pass.equals("2")) {
					   			 		BaseTest.sendVFSmsreg3(date1);
					   			//		BaseTest.reportflush_pass3();					
					   					}
					   			} else {
					   			}
					   			

					   			//////////
					   			Thread.sleep(1000);	
					   	if (BaseTest.getExcelData("REG", 2, 1).equals("2")) {
					   				int a2 = result.getStatus();
					   				String Status_2 = Integer.toString(a2);
					   				BaseTest.setExcelData("REG", 3, 1, Status_2);
					   			} else {
					   			}
					   			
					   	
					   	Thread.sleep(1000);	
					   	if (BaseTest.getExcelData("REG", 1, 1).equals("2")) {
					   				int a2 = result.getStatus();
					   				String Status_2 = Integer.toString(a2);
					   				BaseTest.setExcelData("REG", 2, 1, Status_2);
					   			} else {
					   			}
					   	
					   	Thread.sleep(1000);	
					   			int a1 = result.getStatus();
					   			String status = Integer.toString(a1);
					   			BaseTest.setExcelData("REG", 1, 1, status);
					   			System.out.println(result.getStatus());
					   			
					   			
					   			
					   			
					   			////
					   			
					   			Thread.sleep(5000);		
					   	driver.quit();
					       
					       		 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
					 
//				     public void mailReport(ITestResult status) throws Throwable {
//						 Thread.sleep(4000);
//						 BaseTest.getScreenshot(driver, "Registration");
//				  	 	
//						 Thread.sleep(4000);
//						try {
//							 failedstatus=status.getThrowable().getMessage();
//							 String[] failedstatus1=failedstatus.split("(Session");
//					    	 failedstatus=failedstatus1[0].toString();
//						} catch (Exception e) {
//							
//						}
//						 	
//				  	 
//				  	// System.out.println(failedstatus); 
//				  	 
//				  	
//				  	
//				  	 // System.out.println("failedresults"+failedstatus1[0]);
//				  	 
//				  	 
//				  			 
//				  			 // Create object of SimpleDateFormat class and decide the format
//				  			 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//				  			 
//				  			 //get current date time with Date()
//				  			 Date date = new Date();
//				  			 
//				  			 // Now format the date
//				  			 String date1= dateFormat.format(date);
//				  			 
//				  			 // Print the Date
//				  			 System.out.println(date1);
//				  			 
//				  			 if (status.getStatus()==2) {			
//				  	 	
//				  	 	 String url=driver.getCurrentUrl();
//				    		System.out.println(url);
//				    		
//				    		String[] a = url.split("://");
//				    		String b = a[1].toString();
//				    		System.out.println("Split 1 : "+b);
//				    		
//				    		String[] c = b.split("/");
//				    		 domain = c[0].toString();
//				    		System.out.println("Domain : " + domain);
//				    		
//				    //		 Error_on = c[2].toString();
//				    		System.out.println("Error : "+Error_on);
//				  }  		
//				    	//error msg
////				    		String Exception=status.getThrowable().getMessage();
////				    		System.out.println("ecception result"+Exception);
//				    		
//				  	   if (status.getStatus()==1) {
//				  		   
//						if (BaseTest.getExcelData("SMS", 1, 3).equals("2")) {
//							BaseTest.reportflush();
//						    BaseTest.sendVFSmsreg(domain, Error_on, date1);	
//						    int a1 = status.getStatus();  
//						    String aa1 = Integer.toString(a1);
//				 			BaseTest.setExcelData("SMS", 1, 3, aa1);
//						}		
//								
//						} else if (status.getStatus()==2) {
//							 BaseTest.reportflush1();       
//						        BaseTest.sendVFSmsreg1(domain, Error_on, date1, failedstatus);
//						        int a2 = status.getStatus();
//						        String aa2 = Integer.toString(a2);
//								BaseTest.setExcelData("SMS", 1, 3, aa2);
//							
//						} 
//				  	   
					    	   
					    	   
					    	   
					    	   
					    	   
					    	   
					    	   
					    	   
					    	   
					    	   
					    	   
					    	   
					    	   
					    	   
					    	   
					    	   
					    	   
					    	   				
					
					
					
					
					
					
					
					
					
					
					
					
					
} 
}