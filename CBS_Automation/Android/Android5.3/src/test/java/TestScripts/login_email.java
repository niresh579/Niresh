package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseTest;
import POM.Delete_POM;
import POM.Login_Pom;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class login_email extends BaseTest {

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
	public void testUntitled() throws Throwable {

		Login_Pom l = new Login_Pom(driver);
		Delete_POM d = new Delete_POM(driver);
		for (int i = 0; i <= 3; i++) {
			try {
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@text='Skip']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@text='Skip']")).click();
				Thread.sleep(2000);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@text='Login']")).click();
				Thread.sleep(2000);

				Thread.sleep(2000);
				String username = BaseTest.readValueFromExcelSheet().get(i).get("bmtest201@gmail.com");
				String password = BaseTest.readValueFromExcelSheet().get(i).get("cbstest");
				// BaseTest.click(l.getEnter_Matrid());
				Thread.sleep(2000);

				BaseTest.typeData(l.getEnter_Matrid(), username);

				Thread.sleep(2000);
				BaseTest.typeData(l.getEnter_passwrd(), password);

				Thread.sleep(2000);
				BaseTest.click(l.getEnter_Login());

			} catch (Exception e) {
				System.out.println("Already Login.................");
			}
		}

	}}