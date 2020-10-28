
package com.app.Android_App;


import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseTestAgarwal;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class Shortlisted extends BaseTest {
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
		Matches_Pom p = new Matches_Pom(driver);
		Edit_Profile_Pom p1 = new Edit_Profile_Pom(driver);
		BaseTest b = new BaseTest();
		//Edit_Profile_Pom p1 = new Edit_Profile_Pom(driver);
		Thread.sleep(5000);
		// b.click(p.getMain_Login());

		try {
			driver.findElement(By.xpath("//*[@text='LOGIN']")).click();
		} catch (Exception e) {
			System.out.println("no login button");
		}
		try {
			b.click(p1.getEnter_matri_Id1());
			b.typeData(p1.getEnter_matri_Id1(), BaseTest.readValueFromExcelSheet().get(1).get("Username"));
			Thread.sleep(5000);
			b.typeData(p1.getEnter_password1(), BaseTest.readValueFromExcelSheet().get(1).get("Password"));
			Thread.sleep(5000);
			b.click(p1.getEnter_Login1());
		} catch (Exception e) {
			System.out.println("Already login");
		}
		Thread.sleep(10000);

		try {
			WebElement allow = driver.findElement(By.xpath("//*[@text='ALLOW']"));
			if (allow.isDisplayed()) {
				allow.click();
			}
		} catch (Exception e) {
			System.out.println("No photo page");

		}
		try {
			WebElement skip = driver.findElement(By.xpath("//*[@id='skip']"));
			if (skip.isDisplayed()) {
				skip.click();

			}
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			WebElement popup = driver.findElement(By.xpath("//*[@id='popup_close_btn']"));
			if (popup.isDisplayed()) {
				popup.click();
			}
		} catch (Exception e) {
			e.getMessage();
		}

		// driver.findElement(By.xpath("//*[@id='skip']")).click();
		Thread.sleep(5000);
		try {
			AndroidElement photo_skip = driver.findElement(By.xpath("//*[@id='doitlater']"));
			if (photo_skip.isDisplayed()) {
				photo_skip.click();
			}
		} catch (Exception e) {

			e.getMessage();
		}
		Thread.sleep(5000);
	//	b.click(driver.findElement(By.xpath("//*[@text='LATEST MATCHES']")));
		//Thread.sleep(5000);
		b.click(p.getMatches());
		Thread.sleep(5000);
		b.click(driver.findElement(By.xpath("//*[@id='shorlist_or_deleteButton']")));
		Thread.sleep(5000);
		
		b.click(driver.findElement(By.xpath("//*[@id='btn_send_interest']")));
		Thread.sleep(5000);
	
	    try {
	    	AndroidElement sent_pop_up = driver.findElement(By.xpath("//*[@id='ei_message']"));
	    	Thread.sleep(5000);
	    	if (sent_pop_up.isDisplayed()) {
	    		Thread.sleep(5000);
	    		String text1 = sent_pop_up.getText();
	    		Thread.sleep(5000);
	    		System.out.println(text1);
			}
		} catch (Exception e) {
			System.out.println("no pop up printed");
		}
		
		
		Thread.sleep(5000);
		String shortlisted_id = driver.findElement(By.xpath("//*[@id='profileMatriId']")).getText();
		System.out.println(shortlisted_id);
		Thread.sleep(5000);
		Dimension size = driver.manage().window().getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println(width);
		int y = (int) (height * 0.15);
		int startx = (int) (width * 0.75);
		int endx = (int) (width * 0.35);

		driver.swipe(startx, y, endx, y, 4000);
		driver.swipe(startx, y, endx, y, 4000);
		driver.swipe(startx, y, endx, y, 4000);
		// driver.swipe(startx, y, endx, y, 4000);
		// ScrollTabs();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='SHORTLISTED']")).click();
		Thread.sleep(5000);

		// Thread.sleep(5000);
		String View_1 = driver.findElement(By.xpath("//*[@id='profileMatriId']")).getText();
		System.out.println(View_1);

		if (shortlisted_id.equals(View_1)) {
			System.out.println("shortlisted id verified");
		} else {
			System.out.println("no id verified");
		}

		Thread.sleep(5000);

		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='profileUsername']")).click();
		Thread.sleep(5000);
		String Id = driver.findElement(By.xpath("(//*[@class='android.widget.TextView'])[5]")).getText();
		System.out.println(Id);
		Thread.sleep(5000);
		if (View_1.equals(Id)) {
			System.out.println("view Profile verified");

		} else {
			System.out.println("no profile verified");
		}

		driver.findElement(By.xpath("(//*[@class='android.widget.ImageButton'])[1]")).click();
		Thread.sleep(5000);

		try {
			// Thread.sleep(5000);
			b.click(driver.findElement(By.xpath("(//*[@id='send_interestButton'])[1]")));
			Thread.sleep(5000);
			b.click(driver.findElement(By.xpath("//*[@class='android.widget.ImageButton']")));
			Thread.sleep(5000);
			b.click(driver.findElement(By.xpath("//*[@id='btnPayNotnow']")));
			System.out.println("landed on shortlisted page");
		} catch (Exception e) {
			System.out.println("no send intrest button displayed");
		}
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("//*[@id='layUpgradeOption']")).getText();
		} catch (Exception e) {
			// TODO: handle exception
		}
		Thread.sleep(5000);
		String upgradetext = driver.findElement(By.xpath("//*[@text='Upgrade Now']")).getText();
		// System.out.println("*" + upgradetext);
		Thread.sleep(5000);
		String upgradetext1 = driver.findElement(By.xpath("//*[@id='tvUpgradeTo']")).getText();
		Thread.sleep(5000);
		System.out.println("*" + upgradetext + upgradetext1);
		Thread.sleep(5000);
		b.click(driver.findElement(By.xpath("//*[@text='Upgrade Now']")));
		Thread.sleep(5000);
		b.click(p.getBack_btn());
		Thread.sleep(5000);
		try {
			b.click(p.getNot_now_btn());
		} catch (Exception e) {
			System.out.println("no not now btn dispalyed");
		}
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id='shorlist_or_deleteLayout']")).click();
		Thread.sleep(5000);
		b.click(p.getV_shortlisted_btn());
		b.click(p.getPopup_close());
		System.out.println("Removed id from shortlisted module");
		Thread.sleep(5000);
		b.click(p.getMenu_btn());
		// To Scroll
		Thread.sleep(5000);
		driver.swipe(0, 800, 0, 0, 1000);
		driver.swipe(0, 800, 0, 0, 1000);
		driver.swipe(0, 800, 0, 0, 1000);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='appversion']")).click();
		Thread.sleep(5000);
		String appversion = driver.findElement(By.xpath("//*[@id='appversion']")).getText();
		System.out.println("The tested " + appversion);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='accountsLayout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='logoutLayout']")).click();

		/*
		 * if
		 * (driver.findElement(By.xpath("(//*[@id='profileMatriId'])[1]")).isDisplayed()
		 * ) { String s1 =
		 * driver.findElement(By.xpath("(//*[@id='profileMatriId'])[1]")).getText();
		 * System.out.println(s1); } else {
		 * System.out.println("no one shortlisted ur profile"); }
		 */
	}
//	}

	@AfterTest
	public void tearDown() {
		driver.resetApp();
		driver.quit();
		reports.endTest(test);
		// reports.flush();
	}
}