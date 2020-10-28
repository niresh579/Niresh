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
import POM.Login;
import POM.Login_Pom;

import java.net.URL;
import java.awt.AWTException;
import java.net.MalformedURLException;
import java.util.List;
import java.util.logging.Level;

public class LatestMatches2 extends BaseTest {
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
		dc.setCapability(MobileCapabilityType.UDID, "330063acdba724f5");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.community.matrimony");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.domaininstance.ui.activities.Splash");
		driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
		driver.setLogLevel(Level.INFO);

	}

	@Test
	public void testUntitled() throws InterruptedException {
		Login l = new Login(driver);
		Login_Pom l1 = new Login_Pom(driver);
		for (int i = 0; i <= 0; i++) {
			try {
				Thread.sleep(2000);

				BaseTest.click(l1.getLogin_skip_btn());
				Thread.sleep(2000);
				BaseTest.click(l1.getLogin_btn());

				// BaseTest.click(l.getEnter_Matrid());
				Thread.sleep(2000);
				BaseTest.typeData(l1.getEnter_Matrid(), "MRT860437");
				Thread.sleep(2000);
				BaseTest.typeData(l1.getEnter_passwrd(), "cbstest");
				Thread.sleep(2000);
				BaseTest.click(l1.getEnter_Login());

			} catch (Exception e) {
				System.out.println("Already Login.................");
			}
		}
		try {

			Thread.sleep(4000);
			BaseTest.click(l1.getQuickrespnse_clse_btn());
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
			BaseTest.click(l1.getInter_close());
			System.out.println("intermediate page Handled......");

		} catch (Exception e) {
			System.out.println("no intermediate page displayed.....");
		}

		Thread.sleep(5000);
		try {
			BaseTest.click(l.getNotification_access_later());
		} catch (Exception e) {
			System.out.println("Notification handled");
		}

		// Thread.sleep(5000);
		Thread.sleep(5000);
		// BaseTest.click(l.getMenu_button());

		Thread.sleep(5000);
		BaseTest.click(l.getLatest_matches());

		Thread.sleep(5000);
		if (l.getSend_interest().isDisplayed()) {
			String send_interest_id = driver.findElement(By.xpath("(//*[@id='profileMatriId'])[1]")).getText();

			List<AndroidElement> List_matrids = driver.findElements(By.xpath("(//*[@id='profileMatriId'])"));
			System.out.println(List_matrids.size());

			BaseTest.click(l.getSend_interest());
			Thread.sleep(2000);
			System.out.println("Intrest sent to matrID: " + send_interest_id);
			// Thread.sleep(2000);
			Thread.sleep(5000);
			String text1 = driver.findElement(By.xpath("//*[@id='ei_message']")).getText();
			System.out.println(text1);
			// BaseTest.click(l.getSend_interest());
		} else {
			System.out.println("There is no latest matches to send interest");
		}

		Thread.sleep(5000);
		if (l.getSend_mail().isDisplayed()) {
			String send_mail_id = driver.findElement(By.xpath("(//*[@id='profileMatriId'])[1]")).getText();
			System.out.println("Intrest sent to matrID: " + send_mail_id);
			Thread.sleep(2000);
			BaseTest.click(l.getSend_interest());
			Thread.sleep(2000);
			String text1 = driver.findElement(By.xpath("//*[@id='ei_message']")).getText();
			System.out.println(text1);

			// BaseTest.click(l.getSend_mail());

		} else {
			System.out.println("There is no latest matches to send mail");
		}

		Thread.sleep(5000);
		if (l.getSkip_membership_package().isDisplayed()) {
			BaseTest.click(l.getSkip_membership_package());
			BaseTest.click(l.getMembership_call_skip());
			System.out.println("Upgrade Membership Package");
		} else {
			System.out.println("Package already Upgraded");
		}

		Thread.sleep(5000);
		/*
		 * if (l.getIgnore_block_dropdown().isDisplayed()) {
		 * BaseTest.click(l.getIgnore_block_dropdown());
		 * //BaseTest.click(l.getMark_as_viewed());
		 * 
		 * } else { System.out.println("There is no profile to view"); }
		 */

		/*
		 * Thread.sleep(5000); if (l.getIgnore_block_dropdown().isDisplayed()) { String
		 * ignore_id =
		 * driver.findElement(By.xpath("(//*[@id='profileMatriId'])[1]")).getText();
		 * System.out.println(ignore_id); BaseTest.click(l.getIgnore_block_dropdown());
		 * //BaseTest.click(l.getIgnore()); Thread.sleep(5000);
		 * //BaseTest.click(l.getConfirm_ignore_block()); } else {
		 * System.out.println("There is no profile to Ignore"); }
		 */
		Thread.sleep(5000);
		if (l.getIgnore_block_dropdown().isDisplayed()) {
			String Block_id = driver.findElement(By.xpath("(//*[@id='profileMatriId'])[1]")).getText();
			System.out.println(Block_id);
			BaseTest.click(l.getIgnore_block_dropdown());
			BaseTest.click(l.getBlock());
			Thread.sleep(5000);
			BaseTest.click(l.getConfirm_ignore_block());
		} else {
			System.out.println("There is no profile to Block");
		}

	}

	/*
	 * @Test public void ignoreVerify() {
	 * 
	 * 
	 * }
	 * 
	 * 
	 */

	@AfterTest
	public void tearDown() {
		driver.resetApp();
		driver.quit();
		// reports.endTest(test);
		// reports.flush();
	}
}
