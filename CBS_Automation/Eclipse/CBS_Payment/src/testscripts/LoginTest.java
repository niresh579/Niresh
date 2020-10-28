package testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.URL;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import businessFunctions.BussinessFunctions;
import utility.BaseTest;


public class LoginTest extends BaseTest {

	public static String baseurl;
	public static Properties properties;

	public LoginTest() throws Exception {

		properties = new Properties();
		FileInputStream fis = new FileInputStream(new File(
				"C:\\Users\\CBS\\eclipse-workspace\\CBS_Payment\\objectRepository\\Login.properties"));
		this.properties.load(fis);
	}
	/*
	 * @BeforeMethod public void startUp() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\amuthan\\eclipse-workspace\\CBSLogin\\lib\\chromedriver.exe");
	 * driver = new ChromeDriver(); }
	 */

	@Test
	public void loginTest() throws Exception {

		test = extent.createTest("Login Test");
		test.pass("Browser Opened ");

		FileInputStream file = new FileInputStream(
				new File("C:\\Users\\amuthan\\eclipse-workspace\\CBSLogin\\Resources\\LoginTestData_Mohan2222.xlsx"));
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheetAt(0);
		for (int i = 1; i <= 1; i++) {
			baseurl = sheet.getRow(i).getCell(0).getStringCellValue();
			driver.navigate().to(baseurl);
			test.pass("Application Launched Successfully");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			InetAddress ip = InetAddress.getByName(new URL(baseurl)
                    .getHost());
             System.out.println("Public IP Address of: " + ip);
             test.pass("Public IP Address of: " + ip); 
             System.out.println("Public IP Address of: \" + ip");
			String username = sheet.getRow(i).getCell(1).getStringCellValue();
			String password = sheet.getRow(i).getCell(2).getStringCellValue();
			test.info("Reading communitymatrimony UserName & Password from Test Data Repository");
			test.pass("UserName is Valid :" + username);
			test.pass("Password is Valid : *******");
			// communitymatrimony login ---------------
			BussinessFunctions.cmLogin(driver, properties, username, password);
			// direct community login--------------
			// BussinessFunctions.login(driver, properties, username, password);
			Thread.sleep(2000);
			test.pass("Login Button Clicked");
			System.out.println("Login Successfully...");

			String randomID = BussinessFunctions.randomSelection(driver);
		    System.out.println("Selected randomID : " + randomID);
			test.pass("Selected ID is : " + randomID);
			Thread.sleep(3000);
			test.pass("Randomaly Selected the Community ID");
			System.out.println("randomaly Selected");
			String domain = driver.getCurrentUrl();
			test.pass("Domain Name====>" + domain);
			System.out.println("====>" + domain);

			try {
				WebElement suspendid = driver.findElement(By.xpath("//*[@class='nomsg mediumtxt  pad10 ']"));

				if (suspendid.isDisplayed()) {
					test.pass("This ID was Blocked/Suspended");
					break;
				}
			} catch (Exception e) {
				e.getMessage();
			}
			try {
				WebElement mobile_verify=driver.findElement(By.xpath("(//a[@class='linkb font13'])[2]"));
				
				if (mobile_verify.isDisplayed()) {
					//test.pass("This ID need to verify Mobile Number");
					break;
					
				}
				
				
			} catch (Exception e) {
				e.getMessage();
			}

			// BussinessFunctions.intermidatePages(driver,properties);
			//Thread.sleep(3000);\\\
			
			
			/*try {
				WebElement skip_Daily_matches_page = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
				if (skip_Daily_matches_page.isDisplayed()){
					skip_Daily_matches_page.click();
					
				}
				
			} catch (Exception e) {
				e.getMessage();
			}*/
			
			try {
				WebElement photo_add = driver.findElement(By.xpath("/html/body/div[2]/a"));
				if (photo_add.isDisplayed()) {
					photo_add.click();
					driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
					driver.findElement(By.xpath("//*[@id=\"reason3\"]")).click();
					driver.findElement(By.xpath("//*[@id=\"skipphotoclick\"]")).click();
					
				}
				
			} catch (Exception e) {
				e.getMessage();
			}
			
			
			try {
				WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
				if (skip_matches.isDisplayed()) {
					skip_matches.click();
					
				}
			} catch (Exception e) {
				e.getMessage();
			}
			
			try {
				WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
				if (element.isDisplayed()) {
					element.click();
					
				}
			} catch (Exception e) {
				e.getMessage();
			}
			
			try {
				WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
				if (divorcee_intermediate_skip.isDisplayed()) {
					divorcee_intermediate_skip.click();
					
				}
			} catch (Exception e) {
				e.getMessage();
			} 
			

		/*	if (!driver.findElements(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]")).isEmpty()) {

				// clicking on button1
				WebDriverWait wait = new WebDriverWait(driver, 500);
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]")));

				// driver.findElement(By.xpath("//*[@id='product_container_1']/div[2]/div[2]/div[3]/div[2]/div/a/div")).click();
				WebElement Skip_to_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
				Skip_to_matches.click();

			}

			else if (driver.findElement(By.xpath("/html/body/div[1]/div[2]/a")).isDisplayed()) {

				// Clicking on button2, which appears when button1 is not present
				WebDriverWait wait = new WebDriverWait(driver, 500);
				wait.until(ExpectedConditions.presenceOfElementLocated(
						By.xpath("/html/body/div[1]/div[2]/a")));

				WebElement Logout = driver
						.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
				Logout.click();
			}
//			} else if (driver.findElement(By.xpath("/html/body/div[1]/div[2]/a")).isDisplayed()){
//				driver.findElement(By.xpath("/html/body/div[1]/div[2]/a")).click();
//			}
			else {
				
				System.out.println("No such button found");
			}  */

			// driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches
			// >>')]")).click();
			Thread.sleep(6000);
			test.pass("Intermidate Pages are closed...Successfully");
			System.out.println("Intermidate Pages are closed...");

			// Thread.sleep(3000);
//			BussinessFunctions.cmLogout(driver, properties);
//			Thread.sleep(4000);

			System.out.println("Logout Completed Successfully..");
			test.pass("Application LogedOut Successfully...");
		}
		driver.close();
	}
	/*
	 * @AfterMethod public void tearDown() { driver.close(); }
	 */

}
