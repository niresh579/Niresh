package com.testscripts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Base;
import com.pom.Inbox;
import com.pom.ProfileViewNotContacted;

public class ShortlistedMeScroll extends Base {
	
	WebDriver driver;
	
	@BeforeTest
	public void startUp() {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\CBSTEsting\\eclipse-workspace\\ArtifMatrimony\\driver\\chromedriver.exe");
         ChromeOptions options = new ChromeOptions();
         options.addArguments("--disable-notifications");
         driver = new ChromeDriver(options);
         
	}
	
	
	@Test
	public void whoShortlistedMeScrollTest() throws Exception {
		
		Inbox i  =  new Inbox(driver);
		ProfileViewNotContacted p = new ProfileViewNotContacted(driver);
		Actions acc = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		
		Base.click(i.getMatriId());
		Base.typeData(i.getMatriId(), "EZH556542");
		
		Base.click(i.getPaswwordclr());
		Base.typeData(i.getPassword(), "cbstest");
		Thread.sleep(1000);
		
		Base.click(i.getLoginbtn());
		
		////////////////////////////////  Intermediate Pages    /////////////////////////////
	
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
			
			try {
				WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
				if (divorcee_intermediate_skip.isDisplayed()) {
					divorcee_intermediate_skip.click();
					
				}
			} catch (Exception e) {
				System.out.println("Intermediate pages handled");
			}
			try {
				WebElement skip1 = driver.findElement(By.xpath("//a[@class='clr7']"));
				skip1.click();
			
			} catch (Exception e) {
				 System.out.println("ok");
				 }
			try {
				driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
			} catch (Exception e) {
				System.out.println("No Intermediate pages");
			}
			
			// AD Pages
			try {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_ESCAPE);
			r.keyRelease(KeyEvent.VK_ESCAPE);
				Thread.sleep(4000);
				WebElement popup = driver.findElement(By.xpath("//*[@id='strategicComm']/div/div[2]/a/img"));
				popup.click();
		     	} catch (Exception e) {
	           System.out.println("ok");		}
			
			 
			 try {
				 driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
			} catch (Exception e) {
				System.out.println("ADs Closed Successfully");
			}
			 
			 
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			 Thread.sleep(3000);
			 acc.moveToElement(p.getMy_home()).build().perform();
			 acc.moveToElement(p.getProfile_shortlisted_my_me()).build().perform();
			 Thread.sleep(3000);
			 Base.click(p.getProfile_shortlisted_my_me());
			 Thread.sleep(3000);
			 
			 ///////////////////////////////////////////////////
		
		
			 String a = driver.findElement(By.id("dispidListCnt")).getText();
			 System.out.println(a);
			 Integer b = Integer.parseInt(a);
			 System.out.println(b);
			 int count = (b/10);
			 System.out.println(count);
			 
			 //////////////////////////////////////////////////////////////////////////////////////////
			 
			 if (count>10) {
				  for (int j = 0; j <=count-1; j++) {
					  
					  for (int k = 0; k <=11; k++) {
						  Thread.sleep(1000);
						  js.executeScript("window.scrollBy(0,350)");
						
					}
					  
					  try {
						Thread.sleep(2000);
						Base.click(p.getNext());
					} catch (Exception e) {
						e.getMessage();
					}
					
				}
				
			} else {
                    System.out.println("Scroll is not needed because profile is less than 10");
			}
			 
			Thread.sleep(15000);
             driver.findElement(By.xpath("//*[@id='result0']")).click();		
			
			String parent = driver.getWindowHandle();
			System.out.println(parent);
			
			Set<String> child = driver.getWindowHandles();
			for (String handle : child) {
				if (parent.equals(child)) {
					driver.switchTo().window(handle);
					Thread.sleep(5000);
					driver.close();
					
				}
				driver.switchTo().window(parent);
				
				
			}
			
			//////////////////////////////////////   Logout
			
			
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}

}
