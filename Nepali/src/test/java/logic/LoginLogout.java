package logic;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pom.BaseTest;
import pom.Horoscope;
import pom.Inbox;
import pom.LoginLogoutPOM;


public class LoginLogout extends BaseTest{
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali\\driver\\chromedriver.exe"; 

	
       @BeforeMethod
       public void setUp() {
   		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali2\\drivernew\\chromedriver.exe");
   		ChromeOptions options = new ChromeOptions();
   		options.addArguments("--disable-notifications");
   		 driver = new ChromeDriver(options);
   }
           
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

    
       
       @Test
       public void testUntitled() throws Throwable {
    	   Inbox i = new Inbox(driver);
    	   Horoscope h = new Horoscope(driver);
    	   logger =  report.startTest("Pakistani Login Test"); 
    	   driver.get("https://www.Pakistanimatrimony.com");
    	   logger.log(LogStatus.PASS, "URL Launched Successfully"); 
    	   driver.manage().window().maximize();
    	   Thread.sleep(3000);
    	   BaseTest.click(i.getMatriId());
    	   BaseTest.typeData(i.getMatriId(), "Pak852749");
    	   logger.log(LogStatus.PASS, "Matri Id entered Successfully"); 
    	   BaseTest.click(i.getPaswwordclr());		
    	   
    	    //BaseTest.typeData(i.getPassword(), "cbstest");
    	   logger.log(LogStatus.PASS, "Password entered Successfully"); 
    	    BaseTest.click(i.getLoginbtn());
    	   logger.log(LogStatus.PASS, "Login Successfully with this Matriid Nep140549"); 
    	   System.out.println("logged in Successfully");
    	   try {
    			WebElement photo_add = driver.findElement(By.xpath("/html/body/div[2]/a"));
    			if (photo_add.isDisplayed()) {
    				photo_add.click();
    				driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
    				driver.findElement(By.xpath("//*[@id=\"reason3\"]")).click();
    				driver.findElement(By.xpath("//*[@id=\"skipphotoclick\"]")).click();
    				
    			}
    			
    		} catch (Exception e) {
    			System.out.println("Photo Page Skipped");
    		}
    		
    		
    		try {
    			WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
    			if (skip_matches.isDisplayed()) {
    				skip_matches.click();
    				
    			}
    		} catch (Exception e) {
    			System.out.println("Intermediate pages handled");
    		}
    		
    		try {
    			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
    			if (element.isDisplayed()) {
    				element.click();
    				
    			}
    		} catch (Exception e) {
    			System.out.println("Intermediate pages handled");
    		}
    		//////////////////////  New ly Added  ///////////////////////////////
    		try {
    			WebElement skip_to_matriony = driver.findElement(By.xpath("/html/body/header/div/div/div/a"));
    			if (skip_to_matriony.isDisplayed()) {
    				skip_to_matriony.click();
    			}
    		} catch (Exception e) {
    			System.out.println("Intermediate pages handled");
    		}
    		
    		
    		try {
    			WebElement skip_to_matrimony1 = driver.findElement(By.xpath("/html/body/div[3]/a"));
    			if (skip_to_matrimony1.isDisplayed()) {
    				skip_to_matrimony1.click();
    			}
    		} catch (Exception e) {
    			System.out.println("Intermediate pages handled");
    		}
    		
    		
    		////////////////////////////////////////////////////////////////////////////////////
    		
    		try {
    			WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
    			if (divorcee_intermediate_skip.isDisplayed()) {
    				divorcee_intermediate_skip.click();
    				
    			}
    		} catch (Exception e) {
    			System.out.println("Intermediate pages handled");
    		}
    		
    		
    		try {
    			
    			WebElement horoscope = driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]"));
    			if (horoscope.isDisplayed()) {
    				horoscope.click();
    			}
    		} catch (Exception e) {
    			System.out.println("Intermediate pages handled");
    		}
    		
    		try {
    			driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
    		} catch (Exception e) {
    			System.out.println("No Intermediate pages");
    		}
    		
    		// AD Pages
    		 
    		 try {
    			 driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
    		} catch (Exception e) {
    			System.out.println("ADs Closed Successfully");
    		}
    		 
    		 logger.log(LogStatus.PASS, "Intermediate page handled Successfully");
    		 
    		 try {
    			 driver.findElement(By.xpath("//*[@id='special_offer_lightpic1']/div[1]/div/a/img")).click();

    		} catch (Exception e) {
    			// TODO: handle exception
    		}

    		 
    		 ///////////////////   MOuse Action to click on Edit Profile  //////////////
    		
    		 Actions acc = new Actions(driver);
    	
    		 Thread.sleep(7000);
    		 Thread.sleep(5000);
    		         
    				acc.moveToElement(h.getMenu_mouse_action()).build().perform();
    				Thread.sleep(5000);
    				
    				try {
    					acc.moveToElement(h.getMenu_mouse_action1()).build().perform();
    				} catch (Exception e) {
    					// TODO: handle exception
    				}
    				
    				try {
    					driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();

    				} catch (Exception e) {
    					// TODO: handle exception
    				}
    				try {
    					driver.findElement(By.xpath("//*[@id='userpop']/div[2]/div/div[3]/div[2]/ul/li[4]/a")).click();
    				} catch (Exception e) {
    					// TODO: handle exception
    				}
    				
    				Thread.sleep(3000);
    				logger.log(LogStatus.PASS, "Logout Successfully");
    			       report.endTest(logger);
    			       //report.flush();

    				System.out.println("Logged out successfully");
    		 

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
   			BaseTest.sendVFSms1(domain,Error_on, date1, failedstatus);
   		//	BaseTest.reportflush(domain, error, expt);
   		} else if (result.getStatus() == 1) {
   			String pass = BaseTest.getExcelData("SMS", 1, 1);
   			System.out.println(pass);
   			if (pass.equals("2")) {
   				BaseTest.sendVFSms(domain, error, expt);
   			//	BaseTest.reportflush2();
   			}
   		} else {
   		}
   		
   		
   		
   		
   		////  Level  2
   		if (result.getStatus() == 2) {
   			String fail = BaseTest.getExcelData("SMS", 1, 1);
   			System.out.println(fail);
   			if (fail.equals("2")) {		
   			 	BaseTest.sendVFSms2();
   		//		BaseTest.reportflush1(domain, error, expt);
   			}
   			}else if (result.getStatus() == 1) {
   				String pass = BaseTest.getExcelData("SMS", 2, 1);
   				if (pass.equals("2")) {
   			 		BaseTest.sendVFSms3();
   		//			BaseTest.reportflush3();					
   				}		
   		} else {
   		}
   		
   		
   		
   		
   		
   	//   Level   3     
   		
   	///////   Level   3  //////
   		
   			if (result.getStatus() == 2) {
   				String fail = BaseTest.getExcelData("SMS", 2, 1);
   				System.out.println(fail);
   				if (fail.equals("2")) {
   			 		BaseTest.sendVFSms_Fail3(domain, error, expt);
   			//	BaseTest.reportflush_Fail3(domain, error, expt);		
   				}
   				}else if (result.getStatus() == 1) {
   					String pass = BaseTest.getExcelData("SMS", 3, 1);
   					if (pass.equals("2")) {
   			 		BaseTest.sendVFSms3_Pass3();
   			//		BaseTest.reportflush_pass3();					
   					}
   			} else {
   			}
   			

   			//////////
   			Thread.sleep(1000);	
   	if (BaseTest.getExcelData("SMS", 2, 1).equals("2")) {
   				int a2 = result.getStatus();
   				String Status_2 = Integer.toString(a2);
   				BaseTest.setExcelData("SMS", 3, 1, Status_2);
   			} else {
   			}
   			
   	
   	Thread.sleep(1000);	
   	if (BaseTest.getExcelData("SMS", 1, 1).equals("2")) {
   				int a2 = result.getStatus();
   				String Status_2 = Integer.toString(a2);
   				BaseTest.setExcelData("SMS", 2, 1, Status_2);
   			} else {
   			}
   	
   	Thread.sleep(1000);	
   			int a1 = result.getStatus();
   			String status = Integer.toString(a1);
   			BaseTest.setExcelData("SMS", 1, 1, status);
   			System.out.println(result.getStatus());
   			
   			
   			
   			
   			////
   			
   			Thread.sleep(5000);		
   	driver.quit();
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
//       public void mailReport(ITestResult status) throws Throwable {
//  		 Thread.sleep(4000);
//  		 BaseTest.getScreenshot(driver, "Registration");
//    	 	
//  		 Thread.sleep(4000);
//  		try {
//  			 failedstatus=status.getThrowable().getMessage();
//  			 String[] failedstatus1=failedstatus.split("(Session");
//  	    	 failedstatus=failedstatus1[0].toString();
//  		} catch (Exception e) {
//  			
//  		}
//  		 	
//    	 
//    	// System.out.println(failedstatus); 
//    	 
//    	
//    	
//    	 // System.out.println("failedresults"+failedstatus1[0]);
//    	 
//    	 
//    			 
//    			 // Create object of SimpleDateFormat class and decide the format
//    			 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//    			 
//    			 //get current date time with Date()
//    			 Date date = new Date();
//    			 
//    			 // Now format the date
//    			 String date1= dateFormat.format(date);
//    			 
//    			 // Print the Date
//    			 System.out.println(date1);
//    			 
//    			 if (status.getStatus()==2) {			
//    	 	
//    	 	 String url=driver.getCurrentUrl();
//      		System.out.println(url);
//      		
//      		String[] a = url.split("://");
//      		String b = a[1].toString();
//      		System.out.println("Split 1 : "+b);
//      		
//      		String[] c = b.split("/");
//      		 domain = c[0].toString();
//      		System.out.println("Domain : " + domain);
//      		
////      		 Error_on = c[2].toString();
////      		System.out.println("Error : "+Error_on);
//    }  		
//      	//error msg
////      		String Exception=status.getThrowable().getMessage();
////      		System.out.println("ecception result"+Exception);
//      		
//    			 //level 1
//    	   if (status.getStatus()==1) {
//    		   
//  		if (BaseTest.getExcelData("SMS", 1, 1).equals("2")) {
//  			BaseTest.reportflush();
//  		    BaseTest.sendVFSms(domain, Error_on, date1);	
//  		    int a1 = status.getStatus();  
//  		    String aa1 = Integer.toString(a1);
//   			BaseTest.setExcelData("SMS", 1, 1, aa1);
//  		}		
//  				
//  		} else if (status.getStatus()==2) {
//  			 BaseTest.reportflush1();       
//  		        BaseTest.sendVFSms1(domain, Error_on, date1, failedstatus);
//  		        int a2 = status.getStatus();
//  		        String aa2 = Integer.toString(a2);
//  				BaseTest.setExcelData("SMS", 1, 1, aa2);
//  			
//  		} 
//    	   
//  	    	
//    	   //level 2
//    	   if (status.getStatus() == 2) {
//               String fail = BaseTest.getExcelData("SMS", 2, 1);
//               System.out.println(fail);
//               if (fail.equals("2")) {
//                       BaseTest.sendVFSms2();
//                       //BaseTest.reportflush1(domain, error, expt);
//               }
//               }else if (status.getStatus() == 1) {
//                       String pass = BaseTest.getExcelData("SMS", 3, 1);
//                       if (pass.equals("2")) {
//                               BaseTest.sendVFSms3();
//                              // BaseTest.reportflush3();
//                       }
//       } else {
//       }
//
//
//    	   ///////   Level   3  //////
//
//    	   if (status.getStatus() == 2) {
//               String fail = BaseTest.getExcelData("SMS", 3, 1);
//               System.out.println(fail);
//               if (fail.equals("2")) {
//                       BaseTest.sendVFSms_Fail3(domain, error, expt);
//              // BaseTest.reportflush_Fail3(domain, error, expt);
//               }
//               }else if (status.getStatus() == 1) {
//                       String pass = BaseTest.getExcelData("SMS", 4, 1);
//                       if (pass.equals("2")) {
//                               BaseTest.sendVFSms3_Pass3();
//                      // BaseTest.reportflush_pass3();
//                       }
//       } else {
//       }
//
//    /////////////////////////////////////////////////////////////////////////////////////////////////////
//
//   		Thread.sleep(1000);	
//   		if (BaseTest.getExcelData("SMS", 2, 0).equals("2")) {
//   					int a2 = status.getStatus();
//   					String Status_2 = Integer.toString(a2);
//   					BaseTest.setExcelData("SMS", 3, 0, Status_2);
//   				} else {
//   				}
//   				
//   		
//   		Thread.sleep(1000);	
//   		if (BaseTest.getExcelData("SMS", 1, 0).equals("2")) {
//   					int a2 = status.getStatus();
//   					String Status_2 = Integer.toString(a2);
//   					BaseTest.setExcelData("SMS", 2, 0, Status_2);
//   				} else {
//   				}
//   		
//   		Thread.sleep(1000);	
//   				int a1 = status.getStatus();
//   				String status123 = Integer.toString(a1);
//   				BaseTest.setExcelData("SMS", 1, 0, status123);
//   				System.out.println(status.getStatus());
//   				
   				




    } 
    }