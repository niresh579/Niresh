package Functionalites;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.MalformedURLException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Basepack.Base3;
import PomPack.AddonpackPom;

import PomPack.NagativepaymentPOM;
import PomPack.ProfilecompletedPom;
import PomPack.RandomidcheckPOM;
import PomPack.StarwithmothertounghPPPom2;
import PomPack.StarwithmothertounghPom;
import PomPack.UpgrateexcelPom;

public class coummnicationsetting extends Base3{
	private static final String Data = null;
	public static WebDriver driver; 
	String driverExecutablePath = "C:\\Users\\CBSTEsting\\eclipse-workspace\\ArtifMatrimony\\driver\\chromedriver.exe";
	ExtentReports report;
    ExtentTest logger; 
    
   @BeforeMethod
  public void setUp1() throws MalformedURLException { 
	  System.setProperty("webdriver.chrome.driver", driverExecutablePath); 
	  ChromeOptions options = new ChromeOptions();
	   options.addArguments("--disable-notifications");
	  driver = new ChromeDriver(options);
	  
       
  
  }
  @Test
  public void setUp2()throws Throwable  {
	  ProfilecompletedPom np = new ProfilecompletedPom(driver); 
	  driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	    sk1(np.getUsername(),"EZH556542");
		Thread.sleep(4000);
		WebElement e1=driver.findElement(By.xpath("//*[@id='passwordClear1']"));
        Actions a1=new Actions(driver);
        a1.sendKeys(e1,"cbstest").build().perform();
        Thread.sleep(6000);
        click(np.getLogin1());
		Thread.sleep(10000);
		         
		try {
			WebElement skip1 = driver.findElement(By.xpath("//a[@class='clr7']"));
			skip1.click();
		
		} catch (Exception e) {
			 System.out.println("ok");
			 }
		try {
     	driver.findElement(By.xpath("/html/body/div[1]/div[2]/a[2]")).click();
		} catch (Exception e) {
			 System.out.println("ok");
			 }
		Thread.sleep(15000);
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(4000);
			Base3.takeSnapShot(driver, "Homescreenbeforepopup");
			WebElement popup = driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img"));
			popup.click();
	     	} catch (Exception e) {
           System.out.println("ok");		}
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(4000);
			WebElement popup = driver.findElement(By.xpath("//*[@id='strategicComm']/div/div[2]/a/img"));
			popup.click();
	     	} catch (Exception e) {
           System.out.println("ok");		}
		
		
       	Thread.sleep(8000);
		WebElement menu = driver.findElement(By.xpath("//*[@id='topnav-login-menu']/div[3]/div[2]/div[1]/span"));
        Actions acc = new Actions(driver);
        acc.moveToElement(menu).perform();
		WebElement csb = driver.findElement(By.xpath("//a[@class='settings-privacy comm_settings']"));
		csb.click();
		Thread.sleep(4000);
		boolean requestbox = driver.findElement(By.xpath("//*[@id='Request']")).isSelected();
		
						if (requestbox==true) {
				WebElement requestbox2 = driver.findElement(By.xpath("//*[@id='Request']"));
				requestbox2.click();
				System.out.println("Request box is unselected ");
				Thread.sleep(4000);
				try {
					WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
					cancel1.click();
				} catch (Exception e) {
					System.out.println("cancel ok");
				}
			} else {
				if (requestbox==false) {
					System.out.println("Request box Alerady unselected");
				}
			}
						
						boolean shortlist = driver.findElement(By.xpath("//*[@id='Shortlist']")).isSelected();
						if (shortlist==true) {
				WebElement requestbox2 = driver.findElement(By.xpath("//*[@id='Shortlist']"));
				requestbox2.click();
				System.out.println("Shortlist box is unselected ");
				Thread.sleep(4000);
				WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
				cancel1.click();
			} else {
				if (requestbox==false) {
					System.out.println("Shortlist box Alerady unselected");
				}
			}		Thread.sleep(4000);
						boolean ProfileViews = driver.findElement(By.xpath("//*[@id='ProfileViews']")).isSelected();
						if (ProfileViews==true) {
				WebElement ProfileViews1 = driver.findElement(By.xpath("//*[@id='ProfileViews']"));
				ProfileViews1.click();
				System.out.println("ProfileViews box is unselected ");
				Thread.sleep(4000);
				try {
					WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
					cancel1.click();
				} catch (Exception e) {
					System.out.println("cancel ok");
				}
				
			} else {
				if (requestbox==false) {
					System.out.println("ProfileViews box Alerady unselected");
				}
			}		
						Thread.sleep(4000);
						boolean InterestAcceptance = driver.findElement(By.xpath("//*[@id='InterestAcceptance']")).isSelected();
						if (InterestAcceptance==true) {
				WebElement InterestAcceptance1 = driver.findElement(By.xpath("//*[@id='InterestAcceptance']"));
				InterestAcceptance1.click();
				System.out.println("InterestAcceptance box is unselected ");
				Thread.sleep(4000);
				try {
					WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
					cancel1.click();
				} catch (Exception e) {
					System.out.println("cancel ok");
				}
			} else {
				if (requestbox==false) {
					System.out.println("InterestAcceptance box Alerady unselected");
				}
			}		
						Thread.sleep(4000);
					WebElement addonjs = driver.findElement(By.xpath("//*[@id='InterestAcceptance']"));
			        JavascriptExecutor js = (JavascriptExecutor)driver;
				        js.executeScript("arguments[0].scrollIntoView(true);",addonjs);
				        try {
				        	 WebElement emailalert = driver.findElement(By.xpath("//*[@id='toggle_more']"));
						        emailalert.click();
						        Thread.sleep(4000);
						} catch (Exception e) {
							System.out.println("ok");
							 try {
								 WebElement ir2 = driver.findElement(By.xpath("//*[@id='InterestReceived_2']"));
							        ir2.click();
							        Thread.sleep(4000);
							} catch (Exception e4) {
								System.out.println("ok");
				        
				       
				        boolean RecentlyJoined = driver.findElement(By.xpath("//*[@id='RecentlyJoined']")).isSelected();
						if (RecentlyJoined==true) {
				WebElement RecentlyJoined1 = driver.findElement(By.xpath("//*[@id='RecentlyJoined']"));
				RecentlyJoined1.click();
				System.out.println("RecentlyJoined box is unselected ");
				Thread.sleep(4000);
				try {
					WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
					cancel1.click();
				} catch (Exception e7) {
					System.out.println("cancel ok");
				}
			} else {
				if (requestbox==false) {
					System.out.println("RecentlyJoined box Alerady unselected");
				}
			}		
						boolean StarMatches = driver.findElement(By.xpath("//*[@id='StarMatches']")).isSelected();
						if (StarMatches==true) {
				WebElement StarMatches1 = driver.findElement(By.xpath("//*[@id='StarMatches']"));
				StarMatches1.click();
				System.out.println("StarMatches box is unselected ");
				Thread.sleep(4000);
				try {
					WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
					cancel1.click();
				} catch (Exception e8) {
					System.out.println("cancel ok");
				}
			} else {
				if (requestbox==false) {
					System.out.println("StarMatches box Alerady unselected");
				}
			}		
						boolean CityMatches = driver.findElement(By.xpath("//*[@id='CityMatches']")).isSelected();
						if (CityMatches==true) {
				WebElement CityMatches1 = driver.findElement(By.xpath("//*[@id='CityMatches']"));
				CityMatches1.click();
				System.out.println("CityMatches box is unselected ");
				Thread.sleep(4000);
				try {
					WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
					cancel1.click();
				} catch (Exception e9) {
					System.out.println("cancel ok");
				}
				
			} else {
				if (requestbox==false) {
					System.out.println("CityMatches box Alerady unselected");
				}
			}		
						boolean PhotoMatches = driver.findElement(By.xpath("//*[@id='PhotoMatches']")).isSelected();
						if (PhotoMatches==true) {
				WebElement PhotoMatches1 = driver.findElement(By.xpath("//*[@id='PhotoMatches']"));
				PhotoMatches1.click();
				System.out.println("PhotoMatches box is unselected ");
				Thread.sleep(4000);
				try {
					WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
					cancel1.click();
				} catch (Exception ei) {
					System.out.println("cancel ok");
				}
			} else {
				if (requestbox==false) {
					System.out.println("PhotoMatches box Alerady unselected");
				}
			}	
						boolean SimilarMatches = driver.findElement(By.xpath("//*[@id='SimilarMatches']")).isSelected();
						if (SimilarMatches==true) {
				WebElement SimilarMatches1 = driver.findElement(By.xpath("//*[@id='SimilarMatches']"));
				SimilarMatches1.click();
				System.out.println("SimilarMatches box is unselected ");
				Thread.sleep(4000);
				try {
					WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
					cancel1.click();
				} catch (Exception eh) {
					System.out.println("cancel ok");
				}
			} else {
				if (requestbox==false) {
					System.out.println("SimilarMatches box Alerady unselected");
				}
			}
				
				
			
						boolean Enable1 = driver.findElement(By.xpath("//*[@id='Enable_all']")).isDisplayed();
						
						if (Enable1==true) {
							System.out.println("Enable all button shown visible");
						}
						Thread.sleep(6000);
						WebElement menu1 = driver.findElement(By.xpath("//*[@id='topnav-login-menu']/div[3]/div[2]/div[1]/span"));
				        Actions acc1 = new Actions(driver);
				        acc.moveToElement(menu1).perform();
				        Thread.sleep(6000);
						WebElement csb1 = driver.findElement(By.xpath("//a[@class='settings-privacy comm_settings']"));
						csb1.click();
						
						Thread.sleep(6000);
						
WebElement chromenotification = driver.findElement(By.xpath("//a[text()='Chrome Notifications']"));
chromenotification.click();
Thread.sleep(4000);
boolean requestbox5 = driver.findElement(By.xpath("//*[@id='Request']")).isSelected();

				if (requestbox5==true) {
		WebElement requestbox2 = driver.findElement(By.xpath("//*[@id='Request']"));
		requestbox2.click();
		System.out.println("Request box is unselected ");
		Thread.sleep(4000);
		try {
			WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
			cancel1.click();
		} catch (Exception et) {
			System.out.println("cancel ok");
		}
	} else {
		if (requestbox==false) {
			System.out.println("Request box Alerady unselected");
		}
	}
				
				boolean shortlist5 = driver.findElement(By.xpath("//*[@id='Shortlist']")).isSelected();
				if (shortlist5==true) {
		WebElement shortlist6 = driver.findElement(By.xpath("//*[@id='Shortlist']"));
		shortlist6.click();
		System.out.println("Shortlist box is unselected ");
		Thread.sleep(4000);
		WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
		cancel1.click();
	} else {
		if (shortlist5==false) {
			System.out.println("Shortlist box Alerady unselected");
		}
	}		Thread.sleep(4000);
				boolean ProfileViews5 = driver.findElement(By.xpath("//*[@id='ProfileViews']")).isSelected();
				if (ProfileViews5==true) {
		WebElement ProfileViews1 = driver.findElement(By.xpath("//*[@id='ProfileViews']"));
		ProfileViews1.click();
		System.out.println("ProfileViews box is unselected ");
		Thread.sleep(4000);
		try {
			WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
			cancel1.click();
		} catch (Exception eg) {
			System.out.println("cancel ok");
		}
		
	} else {
		if (requestbox==false) {
			System.out.println("ProfileViews box Alerady unselected");
		}
	}		
				Thread.sleep(4000);
				boolean InterestAcceptance5 = driver.findElement(By.xpath("//*[@id='InterestAcceptance']")).isSelected();
				if (InterestAcceptance5==true) {
		WebElement InterestAcceptance1 = driver.findElement(By.xpath("//*[@id='InterestAcceptance']"));
		InterestAcceptance1.click();
		System.out.println("InterestAcceptance box is unselected ");
		Thread.sleep(4000);
		WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
		cancel1.click();
	} else {
		if (requestbox==false) {
			System.out.println("InterestAcceptance box Alerady unselected");
		}
	}		
				Thread.sleep(8000);
			WebElement addonjs7 = driver.findElement(By.xpath("//*[@id='InterestAcceptance']"));
	        JavascriptExecutor js5 = (JavascriptExecutor)driver;
		        js5.executeScript("arguments[0].scrollIntoView(true);",addonjs7);
	        	boolean RecentlyJoined5 = driver.findElement(By.xpath("//*[@id='RecentlyJoined']")).isSelected();
				if (RecentlyJoined5==true) {
		WebElement RecentlyJoined1 = driver.findElement(By.xpath("//*[@id='RecentlyJoined']"));
		RecentlyJoined1.click();
		System.out.println("RecentlyJoined box is unselected ");
		Thread.sleep(4000);
		WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
		cancel1.click();
	} else {
		if (requestbox==false) {
			System.out.println("RecentlyJoined box Alerady unselected");
		}
	}		
				boolean DailyMatches7 = driver.findElement(By.xpath("//*[@id='DailyMatches']")).isSelected();
				if (DailyMatches7==true) {
		WebElement StarMatches1 = driver.findElement(By.xpath("//*[@id='DailyMatches']"));
		StarMatches1.click();
		System.out.println("DailyMatches box is unselected ");
		Thread.sleep(4000);
		try {
			WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
			cancel1.click();
		} catch (Exception ef) {
			System.out.println("cancel ok");
		}
	} else {
		if (requestbox==false) {
			System.out.println("StarMatches box Alerady unselected");
		}
	}		
				boolean CityMatches5 = driver.findElement(By.xpath("//*[@id='CityMatches']")).isSelected();
				if (CityMatches5==true) {
		WebElement CityMatches1 = driver.findElement(By.xpath("//*[@id='CityMatches']"));
		CityMatches1.click();
		System.out.println("CityMatches box is unselected ");
		Thread.sleep(4000);
		try {
			WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
			cancel1.click();
		} catch (Exception ee) {
			System.out.println("cancel ok");
		}
		
	} else {
		if (requestbox==false) {
			System.out.println("CityMatches box Alerady unselected");
		}
	}		
				boolean PhotoMatches5 = driver.findElement(By.xpath("//*[@id='PhotoMatches']")).isSelected();
				if (PhotoMatches5==true) {
		WebElement PhotoMatches1 = driver.findElement(By.xpath("//*[@id='PhotoMatches']"));
		PhotoMatches1.click();
		System.out.println("PhotoMatches box is unselected ");
		Thread.sleep(4000);
		WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
		cancel1.click();
	} else {
		if (requestbox==false) {
			System.out.println("PhotoMatches box Alerady unselected");
		}
	}	
				boolean SimilarMatches5 = driver.findElement(By.xpath("//*[@id='SimilarMatches']")).isSelected();
				if (SimilarMatches5==true) {
		WebElement SimilarMatches1 = driver.findElement(By.xpath("//*[@id='SimilarMatches']"));
		SimilarMatches1.click();
		System.out.println("SimilarMatches box is unselected ");
		Thread.sleep(4000);
		try {
			WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
			cancel1.click();
		} catch (Exception ed) {
			System.out.println("cancel ok");
		}
	} else {
		if (requestbox==false) {
			System.out.println("SimilarMatches box Alerady unselected");
		}
	}
				
				boolean Enable15 = driver.findElement(By.xpath("//*[@id='Enable_all']")).isDisplayed();
				
				if (Enable1==true) {
					System.out.println("Enable all button shown visible");
				}
				///////////
				Thread.sleep(6000);
				WebElement menu9 = driver.findElement(By.xpath("//*[@id='topnav-login-menu']/div[3]/div[2]/div[1]/span"));
		        Actions acc9 = new Actions(driver);
		        acc.moveToElement(menu9).perform();
				WebElement csb9 = driver.findElement(By.xpath("//a[@class='settings-privacy comm_settings']"));
				csb9.click();
				
				Thread.sleep(6000);
				
WebElement SMS = driver.findElement(By.xpath("//a[text()='SMS']"));
SMS.click();
Thread.sleep(4000);
boolean shortlist9 = driver.findElement(By.xpath("//*[@id='Shortlist']")).isSelected();
if (shortlist9==true) {
WebElement shortlist8 = driver.findElement(By.xpath("//*[@id='Shortlist']"));
shortlist8.click();
System.out.println("Shortlist box is unselected ");
Thread.sleep(4000);
try {
	try {
		WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
		cancel1.click();
	} catch (Exception ex) {
		System.out.println("cancel ok");
	}
} catch (Exception ea) {
System.out.println("cancel ok");
}
try {
	WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
	cancel1.click();
} catch (Exception el) {
	System.out.println("cancel ok");
}
} else {
if (shortlist9==false) {
System.out.println("Shortlist box Alerady unselected");

}

}
    
		boolean ProfileViews6 = driver.findElement(By.xpath("//*[@id='ProfileViews']")).isSelected();
		if (ProfileViews5==true) {
WebElement ProfileViews2 = driver.findElement(By.xpath("//*[@id='ProfileViews']"));
ProfileViews2.click();
System.out.println("ProfileViews box is unselected ");


Thread.sleep(4000);
try {
	WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
	cancel1.click();
} catch (Exception ex) {
	System.out.println("cancel ok");
}

} else {
if (ProfileViews6==false) {
	System.out.println("ProfileViews box Alerady unselected");
}
}		
		Thread.sleep(4000);
		boolean InterestAcceptance7 = driver.findElement(By.xpath("//*[@id='InterestAcceptance']")).isSelected();
		if (InterestAcceptance5==true) {
WebElement InterestAcceptance1 = driver.findElement(By.xpath("//*[@id='InterestAcceptance']"));
InterestAcceptance1.click();
System.out.println("InterestAcceptance box is unselected ");
Thread.sleep(4000);
try {
	WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
	cancel1.click();
} catch (Exception ep) {
	System.out.println("cancel ok");
}
} else {
if (InterestAcceptance7==false) {
	System.out.println("InterestAcceptance box Alerady unselected");
}
}		
		
		boolean photomatches5 = driver.findElement(By.xpath("//*[@id='PhotoMatches']")).isSelected();
		if (InterestAcceptance5==true) {
WebElement photomatches1 = driver.findElement(By.xpath("//*[@id='PhotoMatches']"));
photomatches1.click();
System.out.println("photomatches box is unselected ");
Thread.sleep(4000);
WebElement cancel1 = driver.findElement(By.xpath("//*[@id='cancel_not_sett']"));
cancel1.click();
} else {
if (photomatches5==false) {
	System.out.println("photomatches box Alerady unselected");
}
		
		boolean Enable17 = driver.findElement(By.xpath("//*[@id='Enable_all']")).isDisplayed();
		
		if (Enable17==true) {
			System.out.println("Enable all button shown visible");
		}
}
}
}
}
}