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

public class Request extends BaseTest {
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
	        dc.setCapability(MobileCapabilityType.UDID, "32002b32ee5b451f");
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
				Thread.sleep(5000);

				BaseTest.click(l1.getLogin_skip_btn());
				Thread.sleep(2000);
				BaseTest.click(l1.getLogin_btn());

				// BaseTest.click(l.getEnter_Matrid());
				Thread.sleep(2000);
				BaseTest.typeData(l1.getEnter_Matrid(), "KAP267709");
				Thread.sleep(2000);
				BaseTest.typeData(l1.getEnter_passwrd(), "cbstest");
				Thread.sleep(2000);
				BaseTest.click(l1.getEnter_Login());

				// BaseTest.login123("SOU143878", "cbstest");
				System.out.println("login succesffully completed.....");
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
		Thread.sleep(5000);

		BaseTest.click(driver.findElement(By.xpath("//*[@text='MATCHES']")));

		Thread.sleep(5000);
		String send_Request_id = driver.findElement(By.xpath("(//*[@id='profileMatriId'])[1]")).getText();

		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("(//*[@class='android.widget.RelativeLayout' and ./*[@id='lldateSupport']])[1]")));
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("//*[@id='send_yes_interest_btn' and @width>0]")).click();
		} catch (Exception e) {
			System.out.println("Interest Accepted");
		}
		Thread.sleep(5000);
		List<AndroidElement> req1 = driver.findElements(By.xpath("//*[@text='Request']"));

		System.out.println(req1.size());

		int req2 = (req1.size() / 2) - 1;

		System.out.println(req2);

		for (int i = 1; i < req2; i++) {

			
			Thread.sleep(5000);

			//driver.scrollToExact("Request").click();

			// Thread.sleep(5000);

		}

		try {
			Thread.sleep(5000);
			driver.scrollToExact("His Religious Information");
			Thread.sleep(5000);
			if (driver.findElement(By.xpath("//*[@text='Request Horoscope']")).isDisplayed()) {
				Thread.sleep(5000);
				driver.findElement(By.xpath("//*[@text='Request Horoscope']")).click();
			} else {
				System.out.println("Request Was Already Sent");

			}
		} catch (Exception e) {
			System.out.println("Religious Information Was not Displayed");
		}

		Thread.sleep(5000);
		if (l.getSkip_membership_package().isDisplayed()) {
			Thread.sleep(5000);
			BaseTest.click(l.getSkip_membership_package());
		} else {
			driver.findElement(By.xpath("//*[@contentDescription='Navigate up' and @width>0]")).click();
		}

		Thread.sleep(5000);
		BaseTest.click(l.getMenu_mailbox());
		try {
			driver.findElement(By.xpath("//*[@id='txtGotIt']")).click();
		} catch (Exception e) {
			System.out.println("no got it is displayed");
		}
		Thread.sleep(5000);
		try {
			if (l.getFilter().isDisplayed()) {
				Thread.sleep(5000);
				BaseTest.click(l.getFilter());

			}
		} catch (Exception e) {
			System.out.println("There is No Pop Up to Handle");
		}

		Thread.sleep(5000);
		BaseTest.click(l.getMailbox_sent_btn());
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id='imgFilter']")));
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@text='REQUEST SENT']")));
		Thread.sleep(5000);
		BaseTest.click(driver.findElement(By.xpath("//*[@id='btnApplyFilter']")));
		Thread.sleep(5000);

		Thread.sleep(5000);
		if (driver.findElement(By.xpath("(//*[@id='profileMatriId'])[1]")).isDisplayed()) {

			String send_Request_id1 = driver.findElement(By.xpath("(//*[@id='profileMatriId'])[1]")).getText();
			Thread.sleep(5000);
			BaseTest.click(driver.findElement(By.xpath("(//*[@id='profileLayout'])[1]")));
			Thread.sleep(5000);
			BaseTest.click(driver.findElement(By.xpath("//*[@text='+ More Conversations' and @width>0]")));
			Thread.sleep(5000);
			List<AndroidElement> Req_deatils = driver.findElements(By.xpath("//*[@id='txt_req_comm_title']"));
			Thread.sleep(5000);
			for (int j = 0; j < Req_deatils.size(); j++) {
				Thread.sleep(5000);
				String deatils = Req_deatils.get(j).getText();

				System.out.println(deatils);

			}

		} else {
			System.out.println("There is No Matri ID to check the Request Sent");
		}

		Thread.sleep(5000);
		if (l.getSkip_membership_package().isDisplayed()) {
			Thread.sleep(5000);
			BaseTest.click(l.getSkip_membership_package());
		} else {
			driver.findElement(By.xpath("//*[@contentDescription='Navigate up' and @width>0]")).click();
		}

		Thread.sleep(5000);
		if (l.getSkip_membership_package().isDisplayed()) {
			Thread.sleep(5000);
			BaseTest.click(l.getSkip_membership_package());
		} else {
			driver.findElement(By.xpath("//*[@contentDescription='Navigate up' and @width>0]")).click();
		}

		Thread.sleep(5000);
		if (l.getSkip_membership_package().isDisplayed()) {
			Thread.sleep(5000);
			BaseTest.click(l.getSkip_membership_package());
		} else {
			driver.findElement(By.xpath("//*[@contentDescription='Navigate up' and @width>0]")).click();
		}

		Thread.sleep(5000);
		BaseTest.click(l.getMenu_button());
		Thread.sleep(5000);
		driver.swipe(0, 1000, 0, 0, 1000);
		BaseTest.click(l.getAccount_settings());
		Thread.sleep(5000);
		BaseTest.click(l.getLogout_btn());

	}

	/*@AfterTest
	public void tearDown() {
		driver.resetApp();
		driver.quit();
		// reports.endTest(test);
		// reports.flush();
	}*/
}
