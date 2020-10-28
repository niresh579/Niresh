package pages;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.BaseTest;
import utility.ExcelData;
import utility.WebDriverWaitLib;
/**
 * 
 * @author Thulasi
 *
 */
public class LoginPage2 extends  BaseTest{
	public static Properties properties;
	//************Login Page**********
	public  static WebElement userNameEdit1(){
		WebElement element=driver.findElement(By.xpath(properties.getProperty("userNameEdit1")));
		return element;
	}
	public  static WebElement passwordEdit1(){
		WebElement element=driver.findElement(By.xpath(properties.getProperty("passwordEdit1")));
		return element;
	}
	public  static WebElement loginButton1(){
		WebElement element=driver.findElement(By.xpath(properties.getProperty("loginButton1")));
		return element;
	}
	public  static WebElement userNameEdit2(){
		WebElement element=driver.findElement(By.id(properties.getProperty("userNameEdit2")));
		return element;
	}
	public  static WebElement passwordEdit2(){
		WebElement element=driver.findElement(By.id(properties.getProperty("passwordEdit2")));
		return element;
	}
	public  static WebElement loginButton2(){
		WebElement element=driver.findElement(By.id(properties.getProperty("loginButton2")));
		return element;
	}
	//***************InterMediate Page****************
	public  static WebElement skipToMyMatrimony_Popup(){
		WebElement element=driver.findElement(By.xpath(properties.getProperty("skipToMyMatrimony_Popup")));
		return element;
	}
	public  static WebElement skipToDailyMatches_Popup(){
		WebElement element=driver.findElement(By.xpath(properties.getProperty("skipToDailyMatches_Popup")));
		return element;
	}
	public  static WebElement strategic_Popup(){
		WebElement element=driver.findElement(By.xpath(properties.getProperty("strategic_Popup")));
		return element;
	}
	public  static WebElement upgrade_Popup(){
		WebElement element=driver.findElement(By.xpath(properties.getProperty("upgrade_Popup")));
		return element;
	}
	public  static WebElement upgrade_Popup1(){
		WebElement element=driver.findElement(By.xpath(properties.getProperty("upgrade_Popup1")));
		return element;
	}
	public  static WebElement addPhoto(){
		WebElement element=driver.findElement(By.linkText(properties.getProperty("addPhoto")));
		return element;
	}
	public  static WebElement areYousure_Popup(){
		WebElement element=driver.findElement(By.xpath(properties.getProperty("areYousure_Popup")));
		return element;
	}
	public  static WebElement reason3_Popup(){
		WebElement element=driver.findElement(By.xpath(properties.getProperty("reason3_Popup")));
		return element;
	}
	public  static WebElement submit_Popup(){
		WebElement element=driver.findElement(By.xpath(properties.getProperty("submit_Popup")));
		return element;
	}
	//**************Logout Page******************
	public  static WebElement logoutMenu(){
		WebElement element=driver.findElement(By.xpath(properties.getProperty("logoutMenu")));
		return element;
	}
	public  static WebElement logoutButton(){
		WebElement element=driver.findElement(By.xpath(properties.getProperty("logoutButton")));
		return element;
	}
	public  static WebElement logoutCompletly(){
		WebElement element=driver.findElement(By.xpath(properties.getProperty("logoutCompletly")));
		return element;
	}
	public static void loadProperties()throws Throwable{
		properties=new Properties();
    	FileInputStream fis = new FileInputStream(new File(".\\ObjectRepository\\Generic.properties"));
    	properties.load(fis);
	}
	 public static void login() throws Throwable {
	        loadProperties();
			test.info("Browser Launching...............");
			ExcelData eData=new ExcelData();
	    	int rowNum=eData.getExcelRandomRowNum("LoginTestData");
	    	String baseUrl=eData.getExcelData("LoginTestData",rowNum,0);
	    	String userName=eData.getExcelData("LoginTestData",rowNum,1);
	    	String password=eData.getExcelData("LoginTestData",rowNum,2);
	    	driver.get(baseUrl);
	    	driver.manage().window().maximize();
            WebDriverWaitLib.waitPageToLoad();
	    	test.pass("Browser launched Successfully with Baseurl: "+baseUrl);
	    	test.info("Login to the Application................");
	    	userNameEdit1().sendKeys(userName);
	    	driver.findElement(By.id("passwordClear1")).click();
	    //	driver.findElement(By.id("passwordClear1")).clear();
	    	   WebDriverWaitLib.waitPageToLoad();
	    	driver.findElement(By.id("password1")).sendKeys("cbstest");
	//       passwordEdit1().sendKeys(password);
	    	loginButton1().click();
	    	test.pass("Login successfully Completed with username: "+userName+" & password: "+password);
		}
		public static void login(String url,String userName,String password) throws Throwable{
			loadProperties();
			test.info("Browser Launching...............");
	    	driver.get(url);
	    	driver.manage().window().maximize();
	    	WebDriverWaitLib.waitPageToLoad();
	    	test.pass("Browser launched Successfully with Baseurl: "+url);
	    	test.info("Login to the Application................");
	    	userNameEdit2().sendKeys(userName);
	    	passwordEdit2().sendKeys(password);
	    	loginButton1().click();
	    	test.pass("Login successfully Completed with username: "+userName+" & password: *******");
		}
		public static void intermediate_Popups() throws Throwable{
			loadProperties();
			test.pass("Closing Intermediate Pages..............................");
	/*		try{
				WebDriverWaitLib.waitElementToPresent(skipToDailyMatches_Popup());
				skipToDailyMatches_Popup().click();
				test.pass("SkipTodailyMatches Popup is closed successfully");
			}catch(Exception e){e.getMessage();}
			try{
				skipToMyMatrimony_Popup().click();
				test.pass("SkipMyMatches Popup is closed successfully");	
				try{
					WebDriverWaitLib.waitElementToPresent(strategic_Popup());
					strategic_Popup().click();
					test.pass("Strategic Popup is closed");
				}catch(Exception e){e.getMessage();}
			}catch(Exception e){e.getMessage();}
			try{
				Thread.sleep(5000);
				addPhoto().click();
				WebDriverWaitLib.waitElementToPresent(areYousure_Popup());
				areYousure_Popup().click();
				try{
					WebDriverWaitLib.waitElementToPresent(reason3_Popup());
					reason3_Popup().click();
					WebDriverWaitLib.waitElementToPresent(submit_Popup());
					submit_Popup().click();
			        }catch(Exception e){e.getMessage();}
	    	}catch(Exception e){e.getMessage();}
			try{
				WebDriverWaitLib.waitElementToPresent(upgrade_Popup());
				upgrade_Popup().click();
				test.pass("Upgrade Popup is closed successfully");
			}catch(Exception e){e.getMessage();}
			try{
				Thread.sleep(5000);
				upgrade_Popup1().click();
				test.pass("Profile Highlighter Popup is closed successfully");	
			}catch(Exception e){e.getMessage();}
			try{
				Thread.sleep(5000);
				strategic_Popup().click();
				test.pass("Strategic Popup is closed");
			}catch(Exception e){e.getMessage();}  */
			
			///////////////////////////////////////////////////////////////////////////////////////////////////
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
				 
			
			
			
			////////////////////////////////////////////////////////////////////////////////////////////////////////
		}
			
	public static void logout() throws Throwable{
		loadProperties();
		test.pass("Logging out from the Application..........");
		Actions act=new Actions(driver);
		act.moveToElement(logoutMenu()).perform();
        act.moveToElement(logoutButton()).click().perform();
        test.pass("clicked on Logout Button");
        try{
        	WebDriverWaitLib.waitElementToPresent(logoutCompletly());
        	logoutCompletly().click();
        	test.pass("clicked on Logout Completly.");
        }catch(Exception e){e.getMessage();}
		test.pass("Applicatipon Logout Successfully");
	}
}






