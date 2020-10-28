package TestScripts;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import Base.BaseTest;
import POM.Delete_POM;
import POM.Edit_Profile_Pom;
import POM.Login_Pom;
import POM.Matches_Pom;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;

public class Photo_Upload {
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
		Edit_Profile_Pom p1 = new Edit_Profile_Pom(driver);
		Matches_Pom p = new Matches_Pom(driver);
		BaseTest b = new BaseTest();
		Login_Pom l = new Login_Pom(driver);
		Delete_POM d = new Delete_POM(driver);
		
		for (int i = 0; i <= 0; i++) {
			try {
				Thread.sleep(2000);

				BaseTest.click(l.getLogin_skip_btn());
				Thread.sleep(2000);
				BaseTest.click(l.getLogin_btn());

				// BaseTest.click(l.getEnter_Matrid());
				Thread.sleep(2000);
				BaseTest.typeData(l.getEnter_Matrid(), "IYR242926");
				Thread.sleep(2000);
				BaseTest.typeData(l.getEnter_passwrd(), "cbstest");
				Thread.sleep(2000);
				BaseTest.click(l.getEnter_Login());

			} catch (Exception e) {
				System.out.println("Already Login.................");
			}
		}
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

		try {
			if (driver.findElement(By.xpath("//*[@text='Add Photo']")).isDisplayed()) {

				b.click(driver.findElement(By.xpath("//*[@text='Add Photo']")));
				Thread.sleep(5000);
				b.click(driver.findElement(By.xpath("//*[@text='Add Photo']")));
				Thread.sleep(5000);
			}
			b.click(driver.findElement(By.xpath("//*[@text='Choose from Gallery']")));
			Thread.sleep(5000);
			b.click(driver.findElement(By.xpath(
					"//*[@id='icon' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Gallery']]]")));
			Thread.sleep(5000);
			//b.click(driver.findElement(By.xpath("(//*[@id='tabs']/*[./*[@id='indicator_text']])[1]")));
			Thread.sleep(5000);
			// b.click(driver.findElement(By.xpath("//*[@text='Recent']")));
			// Thread.sleep(5000);
			/*
			 * List<AndroidElement> photos =
			 * driver.findElements(By.xpath("// *[@id='micro_thumb']"));
			 * Thread.sleep(15000); for (int i = 0; i <= photos.size(); i++) {
			 * Thread.sleep(5000); int ps = photos.size(); System.out.println("photos size:"
			 * + ps);
			 */
			Thread.sleep(15000);
			// driver.findElement(By.xpath("// *[@id='micro_thumb']")).click();
			List<AndroidElement> links = driver
					.findElements(By.xpath("//*[@resource-id='com.sec.android.gallery3d:id/thumbnail']"));

			// List<AndroidElement> links = driver.findElements(By.xpath("//
			// *[@id='micro_thumb']"));
			List<WebElement> visited = new ArrayList<WebElement>();
			WebElement random = links.get(new Random().nextInt(links.size()));
			String randomId = random.getText();
			System.out.println("No.of Photo's.. " + links.size());
			if (!visited.contains(random)) {
				random.click();
				// visited.add(random);
				// driver.navigate().back();
			}
			Thread.sleep(10000);
			b.click(p.getBack_btn());
			b.click(p.getMenu_btn());
			driver.swipe(0, 800, 0, 0, 1000);
			driver.swipe(0, 800, 0, 0, 1000);
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@id='appversion']")).click();
			Thread.sleep(5000);
			String appversion = driver.findElement(By.xpath("//*[@id='appversion']")).getText();
			System.out.println("The tested " + appversion);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='accountsLayout']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='logoutLayout']")).click();
			System.out.println("PHOTO UPLOAD SCENARIO PASSED FROM DASHBOARD");
		} catch (Exception e) {
			Thread.sleep(5000);
			b.click(p.getMenu_btn());
			Thread.sleep(5000);
			b.click(driver.findElement(By.xpath("//*[@id='selfImageView']")));
			Thread.sleep(15000);
			b.click(driver.findElement(By.xpath("//*[@text='Add Photo']")));
			Thread.sleep(5000);
			b.click(driver.findElement(By.xpath("//*[@text='Choose from Gallery']")));
			Thread.sleep(5000);
			b.click(driver.findElement(By.xpath(
					"//*[@id='icon' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Gallery']]]")));
			Thread.sleep(5000);
			//b.click(driver.findElement(By.xpath("(//*[@id='tabs']/*[./*[@id='indicator_text']])[1]")));
			Thread.sleep(5000);
			// b.click(driver.findElement(By.xpath("//*[@text='Recent']")));
			// Thread.sleep(5000);
			/*
			 * List<AndroidElement> photos =
			 * driver.findElements(By.xpath("// *[@id='micro_thumb']"));
			 * Thread.sleep(15000); for (int i = 0; i <= photos.size(); i++) {
			 * Thread.sleep(5000); int ps = photos.size(); System.out.println("photos size:"
			 * + ps);
			 */
			Thread.sleep(15000);
			// driver.findElement(By.xpath("// *[@id='micro_thumb']")).click();
			List<AndroidElement> links = driver
					.findElements(By.xpath("//*[@resource-id='com.sec.android.gallery3d:id/thumbnail']"));

			// sList<AndroidElement> links = driver.findElements(By.xpath("//
			// *[@id='micro_thumb']"));
			List<WebElement> visited = new ArrayList<WebElement>();
			WebElement random = links.get(new Random().nextInt(links.size()));
			String randomId = random.getText();
			System.out.println("No.of ID's.. " + links.size());
			if (!visited.contains(random)) {
				random.click();
				// visited.add(random);
				// driver.navigate().back();
			}
			Thread.sleep(10000);
			b.click(p.getBack_btn());
			Thread.sleep(5000);
			driver.swipe(0, 800, 0, 0, 1000);
			driver.swipe(0, 800, 0, 0, 1000);
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@id='appversion']")).click();
			Thread.sleep(5000);
			String appversion = driver.findElement(By.xpath("//*[@id='appversion']")).getText();
			System.out.println("The tested " + appversion);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='accountsLayout']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='logoutLayout']")).click();
			System.out.println("PHOTO UPLOAD SCENARIO PASSED FROM PROFILE MENU");
		}

		// b.click(driver.findElement(By.xpath(
		// "//*[@id='micro_thumb' and ./parent::*[@contentDescription='Photo taken on 9
		// January, 2019 18:49:34. Location: India, Tamil Nadu, Chennai, Adyar, LB
		// Road18115.']]")));

		// b.click(driver.findElement(By.xpath("//*[@text='ADD PHOTO']")));

		// *[@id='micro_thumb']

	}

	/*@AfterTest
	public void tearDown() {
		// driver.resetApp();
		driver.quit();
		reports.endTest(test);
		reports.flush();
		// driver.resetApp();
		// driver.quit();

		// test.log(LogStatus.PASS, "Application Closed Succesfull");
		// reports.endTest(test);

	}*/

}
