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
import java.util.List;
import java.util.Random;
import java.util.logging.Level;

public class Refine_test {
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
				BaseTest.typeData(l.getEnter_Matrid(), "RDY485145");
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
		b.click(p.getMatches());
		Thread.sleep(5000);
		b.click(driver.findElement(By.xpath("//*[@id='fabes']")));
		Thread.sleep(15000);
		List<AndroidElement> employee_details12 = driver.findElements(By.xpath(
				"(//*[@id='recy_refine']/*/*/*/*[@id='txt_title' and @height>0 and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@height>0]]]])"));
		for (int i = 1; i < employee_details12.size(); i++) {
			Thread.sleep(5000);
			employee_details12.get(i).click();

			Thread.sleep(15000);
			List<AndroidElement> employee_details1 = driver
					.findElements(By.xpath("(//*[@id='refine_listView']/*/*[@id='refine_adapter_checkBox'])"));
			Thread.sleep(5000);
			for (int j = 1;j < employee_details1.size();i++) {
				Thread.sleep(10000);
				employee_details1.get(new Random(j).nextInt(employee_details1.size())).click();
				Thread.sleep(1000);
				b.click(p1.getSelect_ok_btn());
				Thread.sleep(10000);
				//List<AndroidElement> values = driver.findElements(By.xpath(
					//	"(//*[@id='recy_refine']/*/*/*/*[@id='txt_title' and @height>0 and ./parent::*[./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@height>0]]]])"));
				//Thread.sleep(5000);
				//for (int k = 1; k < values.size(); j++) {
					//Thread.sleep(5000);
					//String s1 = values.get(k).getText();
					//System.out.println("values" + s1);
					i++;
				}

			}
		}

	/*
	@AfterTest
	public void tearDown() {
		driver.resetApp();
		driver.quit();
		reports.endTest(test);
		reports.flush();
		// driver.resetApp();
		// driver.quit();

		// test.log(LogStatus.PASS, "Application Closed Succesfull");
		// reports.endTest(test);

	}*/














}
