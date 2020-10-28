package TestScripts;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseTest;
import POM.Delete_POM;
import POM.EdipPartnerPP;
import POM.Login_Pom;

import java.net.URL;
import java.awt.AWTException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.logging.Level;

public class MobileNumberCount {
	private String reportDirectory = "reports";
	private String reportFormat = "xml";
	private String testName = "Untitled";
	protected AndroidDriver<AndroidElement> driver = null;

	DesiredCapabilities dc = new DesiredCapabilities();

	@BeforeTest
	public void setUp() throws MalformedURLException {
	     dc.setCapability("reportDirectory", reportDirectory);
	        dc.setCapability("reportFormat", reportFormat);
	        dc.setCapability("testName", testName);
	        dc.setCapability(MobileCapabilityType.UDID, "ZY223K8H72");
	        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.community.matrimony");
	        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.domaininstance.ui.activities.Splash");
	        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
	        driver.setLogLevel(Level.INFO);


	}

	@BeforeMethod
	public void testUntitled() throws InterruptedException {

		Login_Pom l = new Login_Pom(driver);
		EdipPartnerPP p1 = new EdipPartnerPP(driver);
		Delete_POM d = new Delete_POM(driver);
		
			/*
			 * try { Thread.sleep(2000);
			 * //driver.findElement(By.xpath("//*[@id='tv_skip']")).click();
			 * //BaseTest.click(l.getLogin_skip_btn()); Thread.sleep(2000);
			 * BaseTest.click(l.getLogin_btn());
			 * 
			 * // BaseTest.click(l.getEnter_Matrid()); Thread.sleep(2000);
			 * BaseTest.typeData(l.getEnter_Matrid(), "IYR242926"); Thread.sleep(2000);
			 * BaseTest.typeData(l.getEnter_passwrd(), "cbstest"); Thread.sleep(2000);
			 * BaseTest.click(l.getEnter_Login());
			 * 
			 * } catch (Exception e) { System.out.println("Already Login.................");
			 * }
			 */
		Thread.sleep(4000);

		Login_Pom.loginApp(driver);
		try {

			Thread.sleep(4000);
			BaseTest.click(l.getQuickrespnse_clse_btn());
			System.out.println("quick Response page Handled......");

		} catch (Exception e) {
			System.out.println("no quick response page displayed.....");
		}

		Thread.sleep(2000);
		try {

			Thread.sleep(4000);
			BaseTest.click(driver.findElement(By.xpath("//*[@id='skip']")));
			System.out.println("Payment intermediate page Handled.....");

		} catch (Exception e) {
			System.out.println("no Payment intermediate page Handled .....");
		}

		try {

			Thread.sleep(4000);
			BaseTest.click(l.getInter_close());
			System.out.println("intermediate page Handled......");

		} catch (Exception e) {
			System.out.println("no intermediate page displayed.....");
		}
	}

	@Test
	public void mobileNumber() throws InterruptedException, AWTException {
		String s = "";
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@text='MATCHES']")).click();

		Thread.sleep(5000);
		String Matri_Id = driver.findElement(By.xpath("(//*[@id='profileMatriId'])[1]")).getText();
		System.out.println(Matri_Id);
		String Id = Matri_Id.substring(3, 9);
		System.out.println(Id);

		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@id='profileDesc'])[1]")).click();

		Thread.sleep(5000);
		driver.swipe(0, 500, 0, 0, 2000);
		Thread.sleep(5000);
		if (driver.findElement(By.xpath("//*[@id='vp_phone' and @width>0]")).isDisplayed()) {

			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='vp_phone' and @width>0]")).click();

			Thread.sleep(5000);
			String Number_Viewed_count = driver.findElement(By.xpath("//*[@id='mobileviewed']")).getText();
			System.out.println(Number_Viewed_count);
			String A = Number_Viewed_count.substring(23, 25);
			Integer View = Integer.parseInt(A);
			System.out.println(View);

			String Count_left = driver.findElement(By.xpath("//*[@id='countleft']")).getText();
			System.out.println(Count_left);
			String B = Count_left.substring(13, 16);
			Integer left = Integer.parseInt(B);
			System.out.println(left);

			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='view_btn']")).click();
			System.out.println("View Mobile Number");
			Thread.sleep(5000);
			try {
				if (driver.findElement(By.xpath("//*[@id='tvPrimaryMobNo']")
						).isDisplayed()) {
					String Mobile_number = driver.findElement(By.xpath("//*[@id='tvPrimaryMobNo']")).getText();
					System.out.println(Mobile_number);

				} else {
					driver.findElement(By.xpath("//*[@id='btnRequest']")).click();
				}
			} catch (Exception e) {
				System.out.println("Not able to view the Mobile Number");
			}
			/*
			 * Thread.sleep(5000); String Mobile_number =
			 * driver.findElement(By.xpath("//*[@id='tvPrimaryMobNo']")).getText();
			 * System.out.println(Mobile_number);
			 */

			Thread.sleep(5000);
			// driver.findElement(By.xpath("//*[@id='back']")).click();
			driver.navigate().back();

			//////////////////////////////

			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='vp_phone' and @width>0]")).click();

			Thread.sleep(5000);
			String Number_Viewed_count1 = driver.findElement(By.xpath("//*[@id='mobileviewed']")).getText();
			System.out.println(Number_Viewed_count1);
			String A1 = Number_Viewed_count1.substring(23,25);
			Integer View1 = Integer.parseInt(A1);
			System.out.println(View);

			String Count_left1 = driver.findElement(By.xpath("//*[@id='countleft']")).getText();
			System.out.println(Count_left1);
			String B1 = Count_left1.substring(13, 16);
			Integer left1 = Integer.parseInt(B1);
			System.out.println(left1);

			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='view_btn']")).click();
			System.out.println("View Mobile Number");

			try {
				Thread.sleep(5000);
				if (driver.findElement(By.xpath("//*[@id='tvPrimaryMobNo']")).isDisplayed()) {
					Thread.sleep(5000);
					String Mobile_number1 = driver.findElement(By.xpath("//*[@id='tvPrimaryMobNo']")).getText();
					System.out.println(Mobile_number1);

				} else {
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@id='btnRequest']")).click();
				}
			} catch (Exception e) {
				System.out.println("Not able to view the Mobile Number");
			}
			/*
			 * Thread.sleep(5000); String Mobile_number1 =
			 * driver.findElement(By.xpath("//*[@id='tvPrimaryMobNo']")).getText();
			 * System.out.println(Mobile_number1);
			 */

			Thread.sleep(5000);
			driver.navigate().back();

			if (View + 1 == View1) {
				System.out.println("Verified");

			} else {
				System.out.println("No Matched");
			}

			if (left - 1 == left1) {
				System.out.println("Verified");

			} else {
				System.out.println("No Matched");
			}

/////////////////////////////////////////////////////////////////////////////

			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@contentDescription='Navigate up' and @width>0]")).click();

			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@contentDescription='Profile']")).click();

			// driver.swipe(0, starty, endx, endy, duration);

			Thread.sleep(5000);
			
			driver.scrollToExact("Contact History").click();
			
			Thread.sleep(5000);
			String Matri_Id1 = driver.findElement(By.xpath("(//*[@id='profileMatriId'])[1]")).getText();
			System.out.println(Matri_Id1);
			String Id1 = Matri_Id1.substring(3, 9);
			System.out.println(Id1);

			Thread.sleep(5000);
			driver.findElement(By.xpath("(//*[@id='profileDesc'])[1]")).click();

			
			 /* Robot r = new Robot(); Thread.sleep(5000); r.keyPress(KeyEvent.VK_ENTER);
			 * r.keyRelease(KeyEvent.VK_ENTER);
			 */

			Thread.sleep(5000);
			driver.swipe(0, 500, 0, 0, 2000);
			Thread.sleep(5000);
			if (driver.findElement(By.xpath("//*[@id='vp_phone' and @width>0]")).isDisplayed()) {

				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id='vp_phone' and @width>0]")).click();

				Thread.sleep(5000);
				String Number_Viewed_count2 = driver.findElement(By.xpath("//*[@id='mobileviewed']")).getText();
				System.out.println(Number_Viewed_count2);
				String A2 = Number_Viewed_count2.substring(23, 25);
				Integer View2 = Integer.parseInt(A2);
				System.out.println(View2);

				String Count_left2 = driver.findElement(By.xpath("//*[@id='countleft']")).getText();
				System.out.println(Count_left2);
				String B2 = Count_left2.substring(13, 16);
				Integer left2 = Integer.parseInt(B2);
				System.out.println(left2);

				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@id='view_btn']")).click();
				System.out.println("View Mobile Number");
				try {
					Thread.sleep(5000);
					if (driver.findElement(By.xpath("//*[@id='tvPrimaryMobNo']")).isDisplayed()) {
						Thread.sleep(5000);
						String Mobile_number2 = driver.findElement(By.xpath("//*[@id='tvPrimaryMobNo']")).getText();
						Thread.sleep(5000);
						System.out.println(Mobile_number2);

					} else {
						driver.findElement(By.xpath("//*[@id='btnRequest']")).click();
					}
				} catch (Exception e) {
					System.out.println("Not able to view the Mobile Number");
				}
				Thread.sleep(5000);

				if (View2 == View1) {
					System.out.println("Verified");

				} else {
					System.out.println("No Matched");
				}
				Thread.sleep(5000);
				if (left2 == left1) {
					System.out.println("Verified");

				} else {
					System.out.println("No Matched");
				}
				Thread.sleep(5000);
				if (Matri_Id == Matri_Id1) {
					System.out.println("Id Matches");

				} else {
					System.out.println("ID Not Matched ");
				}

			} else {
				System.out.println("Call Now button is not displayed");

			}

///////////////////////////////////////////////////////
			///////////////////////////////////////////////

		}

		Thread.sleep(5000);
		driver.navigate().back();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@contentDescription='Navigate up' and @width>0]")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@contentDescription='Navigate up' and @width>0]")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@contentDescription='Profile']")).click();

		driver.swipe(0, 1000, 0, 0, 1000);

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='Account Settings']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='Logout']")).click();
	}

	@AfterTest
	public void tearDown() {
		driver.resetApp();
		driver.quit();
	//	reports.endTest(test);
		// reports.flush();
	}
}

