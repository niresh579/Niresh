package Logic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import pom.WcsmPIPom;

public class WcsmFemalePI extends BaseTest {
	

	
	int maleagenumber;
	int maleagenumberfromwcsm;
	int maleagenumbertowcsm;
	int finalincomepi;
	int annualinc;
	String dosham12;
	String denomination;
	String denomination1;
	String subcaste;
	String subcaste12	;
	String annualinocmename, notworking;
	String annualinocFROMwcsm;
	String incomewcsm1;
	String incomewcsm;
	String religionpi;
	String religionwcsm;
	
	int annualinc1;
	int finalwcsmincome;
	float heightpiinc;

	int one;
	int second;
	int third;
	int four;
	int ten;
	int fifteen;
	int a;
	int b1;
	int b;
	int c;
	int d;
	int e;
	int f;
	int seventy;
    int g;
	String marital;
	String Unmarried;
	String WidoworWidower;
	String Divorced;
	String Separated;
	String Doesntmatter;
	String dosham;
	private static final String Data = null;
	public static WebDriver driver;
	String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\Negative\\drivernew\\chromedriver.exe";

	ExtentReports report;
	ExtentTest logger;

	@BeforeMethod
	public void setUp1() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		Map<String, String> mobileEmulation = new HashMap<String, String>();
		mobileEmulation.put("deviceName", "Pixel 2");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
		chromeOptions.addArguments("--disable-notifications");
		driver = new ChromeDriver(chromeOptions);

		
//		ExtentReports report;
//	    ExtentTest logger;
//	    private String reportDirectory = "reports";
//	    private String reportFormat = "xml";
//	    private String testName = "Untitled";
//	    protected AndroidDriver<AndroidElement> driver = null;
//
//	    DesiredCapabilities dc = new DesiredCapabilities();
//	    
//	    @BeforeTest
//	    public void setUp() throws MalformedURLException {
//	    	   dc.setCapability("reportDirectory", reportDirectory);
//	           dc.setCapability("reportFormat", reportFormat);
//	           dc.setCapability("testName", testName);
//	           dc.setCapability(MobileCapabilityType.UDID, "ZDHUTW49BMOZAU8T");
//	           dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.chrome");
//	           dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.apps.chrome.Main");
//	           driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
//	           driver.setLogLevel(Level.INFO);


		
	}

	@Test
	public void testUntitled() throws Throwable {
		WcsmPIPom rp = new WcsmPIPom(driver);

		for (int k = 1; k <=1; k++) {
			
		String MatriID = BaseTest.getExcelData("Sheet5", k, 0);
		//System.out.println(MatriID);
		
		Thread.sleep(5000);
		driver.get("https://m.communitymatrimony.com/cbsmob/login.php");
		driver.manage().window().maximize();

		// login
		WebElement e123 = driver.findElement(By.xpath("//*[@id='idEmail']"));
		Actions a11 = new Actions(driver);
		Thread.sleep(4000);
		a11.sendKeys(e123, MatriID).build().perform();
		

		Thread.sleep(4000);

		WebElement d123 = driver.findElement(By.xpath("//*[@id='password1']"));
		Thread.sleep(4000);
		Actions bcd11 = new Actions(driver);
		Thread.sleep(4000);
		bcd11.sendKeys(d123, "cbstest").build().perform();

		Thread.sleep(4000);
		BaseTest.click(rp.getLogin());

		
		Thread.sleep(4000);
		
		try {
			String title1=driver.getTitle();
			  System.out.println("Matrimony ID :"+MatriID);
			  
		} catch (Exception e) {
			
		}
		  
		
		try {
			Thread.sleep(6000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();

		} catch (Exception e2) {
			
		}

		try {
			Thread.sleep(6000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a")).click();

		} catch (Exception e2) {
			
		}

		
		
		Thread.sleep(10000);
		BaseTest.click(rp.getEditpi());
		
		System.out.println("PI Informations:");
		

		Thread.sleep(4000);
		WebElement ab = driver.findElement(By.xpath("//div[contains(text(),'Gender')]//following::div[1]"));
		String gender = ab.getText();
		System.out.println("Gender = " + gender);

		Thread.sleep(4000);
		WebElement ab1 = driver.findElement(By.xpath("//*[@id='linktobasic_details']/div[2]/ul/li[4]/div[2]"));
		String age = ab1.getText();
		System.out.println("Age = " + age);

		String[] split = age.split(" Years");
		//System.out.println("age :" + split[0]);
		int agepi = Integer.parseInt(split[0]);
		//System.out.println("finalage:" + agepi);

		one = 1;
		second = 2;
		third = 3;
		four = 4;
		ten = 10;
		fifteen = 15;
		a = 18;
		b1 = 21;
		b = 29;
		c = 39;
		d = 49;
		e= 59;
		f = 60;
		
		g=66;
		seventy = 70;

		//female
		
		
		
		///male
		
//		if (maleagenumber>a && maleagenumber<b)
//        {
//
//            System.out.println("Female profile should be = From 18 to " + (maleagenumber+one) );
//
//        }else if (maleagenumber>b && maleagenumber<c) {
//
//            System.out.println("Female profile should be = From " + (maleagenumber-ten) + " To " + (maleagenumber+second) );
//        }else if (maleagenumber>c && maleagenumber<d) {
//
//            System.out.println("Female profile should be = From " + (maleagenumber-ten)  + " To " +(maleagenumber+third) );
//
//            }else if (maleagenumber>d && maleagenumber<e) {
//
//                System.out.println("Female profile should be = From " + (maleagenumber-fifteen) +  " To " + (maleagenumber+four)  );
//
//            }else if (maleagenumber>f && maleagenumber<g) {
//
//                System.out.println("Female profile should be = From " + (maleagenumber-fifteen) +  " To " + (maleagenumber+four)  );
//            }else if (maleagenumber>g) {
//
//                    System.out.println("Female profile should be = From " + (maleagenumber-fifteen) +  " To 70" );
//            } 

		Thread.sleep(4000);
		WebElement bc = driver.findElement(By.xpath("(//div[contains(text(),'Marital Status')]//following::div[1])[1]"));
		String marital = bc.getText();
		System.out.println("Marital Status = " + marital);
		
		Thread.sleep(4000);
		WebElement bc1 = driver.findElement(By.xpath("(//div[contains(text(),'Height')]//following::div[1])[1]"));
		String height = bc1.getText();
		System.out.println("Height = " + height);

		Thread.sleep(4000);
		WebElement bc11 = driver.findElement(By.xpath("(//div[contains(text(),'Mother Tongue')]//following::div[1])[1]"));
		String mother = bc11.getText();
		System.out.println("Mother Tongue = " + mother);

		Thread.sleep(4000);
		WebElement bc111 = driver.findElement(By.xpath("(//div[contains(text(),'Physical Status')]//following::div[1])[1]"));
		String physical = bc111.getText();
		System.out.println("Physcial Status = " + physical);

		try {
			Thread.sleep(4000);
			WebElement acig11 = driver.findElement(By.xpath("(//div[contains(text(),'Denomination')]//following::div[1])[1]"));
			String denomination = acig11.getText();
			System.out.println("Denomination = " + denomination);

		} catch (Exception e) {
		}
		
		
		
		try {
			Thread.sleep(4000);
			WebElement ac11 = driver.findElement(By.xpath("(//div[contains(text(),'Sub Caste')]//following::div[1])[1]"));
			String subcaste = ac11.getText();
			System.out.println("SubCaste = " + subcaste);

		} catch (Exception e) {
		}
		
		try {
			Thread.sleep(4000);
			WebElement ac11 = driver.findElement(By.xpath("(//div[contains(text(),'Division')]//following::div[1])[1]"));
			String subcaste = ac11.getText();
			System.out.println("SubCaste = " + subcaste);

		} catch (Exception e) {
		}
		
		try {
			Thread.sleep(4000);
			WebElement ac111 = driver.findElement(By.xpath("(//div[contains(text(),'Dosham')]//following::div[1])[1]"));
			String dosham = ac111.getText();
			System.out.println("Dosham = " + dosham);

		} catch (Exception e) {
		}
		
		
		Thread.sleep(4000);
		WebElement cd = driver.findElement(By.xpath("(//div[contains(text(),'Education')]//following::div[1])[1]"));
		String education = cd.getText();
		System.out.println("Education = " + education);

		Thread.sleep(4000);
		try {
			WebElement cd1 = driver.findElement(By.xpath("//div[contains(text(),'Occupation')]//following::div[1]"));
			String occupation = cd1.getText();
			System.out.println("Occupation = " + occupation);
		} catch (Exception e) {
	System.out.println("occupation  not specified");
		}
		

		Thread.sleep(4000);
		WebElement cd11 = driver.findElement(By.xpath("(//div[contains(text(),'Income')]//following::div[1])[1]"));
		String income = cd11.getText();
		System.out.println("Income = " + income);
		try {
			String[] aaa = income.split(" - ");
			String aab = aaa[0].toString().trim();
			String[] aac = aab.split("Rs. ");
			String aad = aac[1].toString().trim();
			int annualinc = Integer.parseInt(aad);
			//System.out.println("Pp income from is = " + annualinc);

			String[] split5 = income.split(" - ");
			//System.out.println("income1:" + split5[1]);
			String[] split6 = split5[1].split(" Lakhs");
			//System.out.println("final income in pi:" + split6[0]);
			int finalincomepi = Integer.parseInt(split6[0]);
			//System.out.println("incomepi :" + finalincomepi);
		} catch (Exception e) {
			System.out.println("Annual income is not specified....");
		}

		// height
//	  WebElement hei=driver.findElement(By.xpath("//*[@id='linktobasic_details']/div[2]/ul/li[5]/div[2]"));
//	  String hei1=hei.getText();
//	  System.out.println("height in pi:"+hei1);
//	  String[] split10=hei1.split(" ft");
//	  try {
//		  String[] split12=hei1.split("6 ft ");
//		  System.out.println("height in pi with inches:"+split12[0]);
//		  float heightpiinc=Integer.parseInt(split12[0]);
//	} catch (Exception e) {
//		System.out.println("no inches");
//	}
//	  
//	  
//	  int heightpi=Integer.parseInt(split10[0]);
//	  String finalheihhtpi=(heightpi+"."+heightpiinc);
//	  
//	  System.out.println("heightin pi:"+finalheihhtpi);
//	  

		// dosham
//	  Thread.sleep(4000);
//	  WebElement dos=driver.findElement(By.xpath("//*[@id='wap-edit-profile']/div[3]/div[3]/div[2]/ul/li[5]/div[2]"));
//	  String dosh=dos.getText();
//	  System.out.println("income in pi:"+dosh);
//	  
//	  

		try {
			Thread.sleep(4000);
			WebElement de12 = driver.findElement(By.xpath("(//div[contains(text(),'Religion')]//following::div[1])[1]"));
			String religionpi = de12.getText();
			System.out.println("Religion = " + religionpi);

		} catch (Exception e) {
		}
		
//		try {
//			Thread.sleep(4000);
//			WebElement de12 = driver.findElement(By.xpath("(//div[contains(text(),'Religious Value')]//following::div[1])[1]"));
//			String religionpi = de12.getText();
//			System.out.println("Religion:" + religionpi);
//
//		} catch (Exception e) {
//		}
//		
//		try {
//			Thread.sleep(4000);
//			WebElement de12 = driver.findElement(By.xpath("(//div[contains(text(),'Sect')]//following::div[1])[1]"));
//			String religionpi = de12.getText();
//			System.out.println("Religion:" + religionpi);
//
//		} catch (Exception e) {
//		}
		
		Thread.sleep(4000);
		WebElement de121 = driver.findElement(By.xpath("(//div[contains(text(),'Eating Habits')]//following::div[1])[1]"));
		String eating = de121.getText();
		System.out.println("Eating Habits = " + eating);

		Thread.sleep(4000);
		WebElement e121 = driver.findElement(By.xpath("(//div[contains(text(),'Drinking Habits')]//following::div[1])[1]"));
		String drinking = e121.getText();
		System.out.println("Drinking Habits = " + drinking);

		Thread.sleep(4000);
		WebElement de2121 = driver.findElement(By.xpath("(//div[contains(text(),'Smoking Habits')]//following::div[1])[1]"));
		String smoking = de2121.getText();
		System.out.println("Smoking Habits = " + smoking);

		 WebElement country=driver.findElement(By.xpath("(//div[contains(text(),'Country')]//following::div[1])[1]"));
		  String country1=country.getText();
		  System.out.println("Country = "+country1);
		  
		  WebElement citizen1=driver.findElement(By.xpath("(//div[contains(text(),'Citizenship')]//following::div[1])[1]"));
		  String citizenship1=citizen1.getText();
		  System.out.println("Citizenship = "+citizenship1);  
		  
		
		
		
		
		// back
		driver.findElement(By.xpath("//*[@id='historyBack']")).click();

		try {
			Thread.sleep(6000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();

		} catch (Exception e2) {
			//System.out.println("no element1");
		}

		try {
			Thread.sleep(6000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a")).click();

		} catch (Exception e2) {
			//System.out.println("no element2");
		}
		
		try {
			Thread.sleep(4000);
			if (MatriID.startsWith("AGR")) {
				Thread.sleep(2000);
				driver.get("https://mobile.agarwalmatrimony.com/#/wcsm");
			} else {

			}
			
			
		} catch (Exception e2) {
			
		}
			
		try {
			Thread.sleep(4000);
			if (MatriID.startsWith("CHR")) {
				Thread.sleep(2000);
				driver.get("https://mobile.christianmatrimony.com/#/wcsm");
			} else {

			}
			
			
		} catch (Exception e2) {
			
		}
		
		
		try {
			Thread.sleep(4000);
			if (MatriID.startsWith("BRH")) {
				Thread.sleep(2000);
				driver.get("https://mobile.brahminmatrimony.com/#/wcsm");
			} else {

			}
			
			
		} catch (Exception e2) {
			
		}
		try {
			Thread.sleep(4000);
			if (MatriID.startsWith("NAR")) {
				Thread.sleep(2000);
				driver.get("https://mobile.nairmatrimony.com/#/wcsm");
			} else {

			}
			
			
		} catch (Exception e2) {
			
		}
		try {
			Thread.sleep(4000);
			if (MatriID.startsWith("MUS")) {
				Thread.sleep(2000);
				driver.get("https://mobilestage.muslimmatrimony.com/#/wcsm");
			} else {

			}
			
			
		} catch (Exception e2) {
			
		}
		
			
		
		
	

		Thread.sleep(4000);
		BaseTest.click(rp.getSetting());

		/// Privacy setting
		Thread.sleep(4000);
		driver.findElement(By.xpath("//ion-label[contains(text(),'Privacy Settings')]")).click();

		// edit
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'EDIT')]")).click();

//	Thread.sleep(4000);	
//	BaseTest.click(rp.getWhocanseeme());

		
		System.out.println("Who Can See Me Details:");
		
		Thread.sleep(4000);
		WebElement agefrom = driver.findElement(By.xpath("(//div[@class='frmto'])[1]"));
		String wcagefrom = agefrom.getText();
		System.out.println("Age from = " + wcagefrom);
		String[] split3 = wcagefrom.split(" years");
		int maleagenumberfromwcsm = Integer.parseInt(split3[0]);
		//System.out.println("wcsmstartage:" + maleagenumberfromwcsm);

		Thread.sleep(4000);
		WebElement ageto = driver.findElement(By.xpath("(//div[@class='frmto'])[2]"));
		String wcageto = ageto.getText();
		System.out.println("Age to = " + wcageto);
		String[] split4 = wcageto.split(" years");
		//System.out.println("wcsmendage:" + split4[0]);
		int maleagenumbertowcsm = Integer.parseInt(split4[0]);

		 if (agepi >= a && agepi <= b1) {

				System.out.println("Male profile age should be = From 21 to 30");

			} else if (agepi > b1 && agepi < b) {

				System.out.println("Male profile age should be = From " + (agepi - one) + " To " + (agepi + ten));
				if ((agepi-one==maleagenumberfromwcsm)&&(agepi+ten==maleagenumbertowcsm)) {
					System.out.println("PI & WCSM Age is Matched");
				}
				else {
					System.err.println("PI & WCSM Age is Not Matched");
				}	
			} else if (agepi > b && agepi < c) {

				System.out.println("Male profile age should be = From " + (agepi - second) + " To " + (agepi + ten));

				if ((agepi-second==maleagenumberfromwcsm)&&(agepi+ten==maleagenumbertowcsm)) {
					System.out.println("PI & WCSM Age is Matched");
				}
				else {
					System.err.println("PI & WCSM Age is Not Matched");
				}	
				
			} else if (agepi > c && agepi < d) {

				System.out.println("Male profile age should be = From " + (agepi - third) + " To " + (agepi + ten));
				if ((agepi-third==maleagenumberfromwcsm)&&(agepi+ten==maleagenumbertowcsm)) {
					System.out.println("PI & WCSM Age is Matched");
				}
				else {
					System.err.println("PI & WCSM Age is Not Matched");
				}	
				
			} else if (agepi > d && agepi < e) {

				System.out.println("Male profile age should be = From " + (agepi - four) + " To " + (agepi + fifteen));
				if ((agepi-four==maleagenumberfromwcsm)&&(agepi+fifteen==maleagenumbertowcsm)) {
					System.out.println("PI & WCSM Age is Matched");
				}
				else {
					System.err.println("PI & WCSM Age is Not Matched");
				}	
			} else if (agepi >= f) {
				if ((agepi-four==maleagenumberfromwcsm)&&(maleagenumberfromwcsm<=70)) {
					System.out.println("PI & WCSM Age is Matched");
				}

				else {
					System.err.println("PI & WCSM Age is Not Matched");
				}	
			}
		
		
		
		
		
		/////female///
		
		Thread.sleep(8000);


		
		
		
				
//		
//		Thread.sleep(8000);
//		if (agepi >= a && agepi <= b1 && maleagenumberfromwcsm == 21) {
//			if (agepi >= a && agepi <= b1 && maleagenumberfromwcsm == 21) {
//				System.out.println("male profile is 18 to 21,so female is matched");
//
//			} else {
//				System.out.println("18 to 21 male not matched");
//			}
//		} else if (agepi >= b1 && agepi <= b) {
//			if (agepi >= b1 && agepi <= b && agepi - one == maleagenumberfromwcsm
//					&& agepi + ten == maleagenumbertowcsm) {
//				System.out.println("male profile is 21 to 29,so female is matched");
//
//			} else {
//				System.out.println("21 to 29 male not matched");
//			}
//
//		} else if (agepi >= b && agepi <= c) {
//			if (agepi >= b && agepi <= c && agepi - second == maleagenumberfromwcsm
//					&& agepi + ten == maleagenumbertowcsm) {
//				System.out.println("male age from 31 to 39,so female is matched");
//
//			} else {
//				System.out.println("age from 31 to 39 male not matched");
//			}
//
//		} else if (agepi >= c && agepi <= d) {
//
//			if (agepi >= c && agepi <= d) {
//				System.out.println("male age from 41 to 49,so female is matched");
//
//			} else {
//				System.out.println("age from 41 to 49 male not matched");
//			}
//
//			Thread.sleep(4000);
//		} else if (agepi >= d && agepi <= f) {
//			if (agepi >= d && agepi <= f && agepi - third == maleagenumberfromwcsm
//					&& agepi + fifteen == maleagenumbertowcsm) {
//				System.out.println("male age from 49 to 60 ,so female is matched");
//
//			} else {
//				System.out.println("age from  49 to 60 male not matched");
//			}
//
//		} else if (agepi > f) {
//			if (agepi > f && agepi - four == maleagenumberfromwcsm && maleagenumbertowcsm == 70) {
//				System.out.println("age over 70");
//
//			} else {
//				System.out.println("age over 70 not matched");
//			}
//
//		}

		
		
				
			
		
		/////male/////
		
//		if (agepi>=a && agepi<=b) {
//            if (agepi>=a && agepi<=b && maleagenumberfromwcsm==18) {
//            System.out.println(" Female profile should be = 18 to 28 male matched");
//
//            }
//            else {
//                System.out.println("Female profile should be = 18 to 28 male not matched");
//            }
//        } else if (agepi>=b && agepi<=c  ){
//            if (agepi>=b && agepi<=c && agepi+one==maleagenumberfromwcsm &&agepi-ten==maleagenumbertowcsm ) {
//                System.out.println("Female profile should be = 29 to 39 female minor matched");
//
//                }
//                else {
//                    System.out.println("Female profile should be = 29 to 39 female minor matched");
//                }
//
//        }else if (agepi>=c && agepi<=d ){
//            if (agepi>=c && agepi<=d && agepi+second==maleagenumberfromwcsm &&agepi-ten==maleagenumbertowcsm ) {
//                System.out.println("Female profile should be = = age from 39 to 49 matched");
//
//                }
//                else {
//                    System.out.println("Female profile should be = = age from 39 to 49 not matched");
//                }
//
//        }else if (agepi>=d && agepi<=e ){
//
//            if (agepi>=d && agepi<=e && agepi+third==maleagenumberfromwcsm &&agepi-ten==maleagenumbertowcsm) {
//                System.out.println("Female profile should be = age from 49 to 59 matched");
//
//                }
//                else {
//                    System.out.println("Female profile should be = age from 49 to 59 matched");
//                }
//
//        }else if (agepi>=f && agepi<=g ){
//            if (agepi>=f && agepi<=g && agepi+four==maleagenumberfromwcsm &&agepi-fifteen==maleagenumbertowcsm ) {
//                System.out.println("Female profile should be = age from 60 to 66 matched");
//
//                }
//                else {
//                    System.out.println("Female profile should be = age from 60 to 66 not matched");
//                }
//
//        }else if (agepi>g ){
//            if (agepi>g && agepi-four==maleagenumberfromwcsm && maleagenumbertowcsm==70) {
//                System.out.println("Female profile above 66 matched");
//
//                }
//                else {
//                    System.out.println("Female profile above 66 not matched");
//                }
//   
//			 
//				
//		
//			}
	
		
		
		Thread.sleep(4000);
		WebElement marital1 = driver.findElement(By.xpath("(//div[@class='openPopUp_values no-break_line'])[1]"));
		String maritalwcsm = marital1.getText();
		System.out.println("Marital Status = " + maritalwcsm);

		boolean Unmarriedwcsm = driver.findElement(By.xpath("(//div[@class='openPopUp_values no-break_line'])[1]"))
				.isSelected();
		boolean Unmarriedwcsmfalse = driver.findElement(By.xpath("(//div[@class='openPopUp_values no-break_line'])[1]"))
				.isSelected();
		if (Unmarriedwcsm == true) {

			//System.out.println("PI & WCSM Marital Status is Matched");
			try {
				boolean wcsmHaveChildren = driver.findElement(By.id("select2-wcsmHaveChildren-container"))
						.isDisplayed();
				if (wcsmHaveChildren == true) {
				//	System.out.println("PI & WCSM Marital Status is Not Matched");
				}
			} catch (Exception e) {
				//System.out.println("PI & WCSM Marital Status is Matched");
			}

			if (Unmarriedwcsm == true && marital.equalsIgnoreCase("Unmarried")) {

				//System.out.println("PI & WCSM Marital Status is Matched");

			} else {

				//System.out.println("PI & WCSM Marital Status is Not Matched");
			}

			//

		} else if (Unmarriedwcsmfalse == false) {

			//System.out.println("wcsm unmarried not selected");
			try {
				boolean wcsmHaveChildren = driver.findElement(By.id("wcsmHaveChildren")).isDisplayed();
				if (wcsmHaveChildren == true) {
					//System.out.println("Having childrens");
				}
			} catch (Exception e) {
				//System.out.println("wcsm not married have children button is not showning so its ok");
			}

		}
		if (Unmarriedwcsmfalse == false && marital.equalsIgnoreCase("Divorced") | marital.equalsIgnoreCase("Separated")
				| marital.equalsIgnoreCase("Widow / Widower")) {

			System.out.println("PI & WCSM Marital Status is Matched");

		} else {

			//System.out.println("wcsm non unmarried and PI non unmarried not selected so its ok");
		}
		

		boolean widower = driver.findElement(By.xpath("(//div[@class='openPopUp_values no-break_line'])[1]")).isSelected();
		
		
		
		 if (maritalwcsm.equals("Any")) {
				System.out.println("PI & WCSM Marital Status is Matched");
				} else if (marital.contains(maritalwcsm)) {
					System.out.println("PI & WCSM Marital Status is Matched");
				}else if (marital.equals("Divorced")||(maritalwcsm.equals("Widower, Divorced, Separated"))) {
					System.out.println("PI & WCSM Marital Status is Matched");	
				}else if (marital.equals("Widow")||(maritalwcsm.equals("Widower, Divorced, Separated"))) {
					System.out.println("PI & WCSM Marital Status is Matched");	
				}else if (marital.equals("Separated")||(maritalwcsm.equals("Widower, Divorced, Separated"))) {
					System.out.println("PI & WCSM Marital Status is Matched");	
							
				}else{
		System.err.println("PI & WCSM Marital Status is Not Matched");
				}
			

		/////// income///////
		
 
		Thread.sleep(4000);
		
	
			if (driver.findElement(By.xpath("//ion-label[contains(text(),'Annual Income')]//following::div[1]")).isDisplayed()) {
				Thread.sleep(4000);
				WebElement income3 = driver.findElement(By.xpath("//ion-label[contains(text(),'Annual Income')]//following::div[1]"));
				String incomewcsm = income3.getText();
				System.out.println("Income = " + incomewcsm);
				
				if ((incomewcsm.contains("Any"))) {
					System.out.println("PI & WCSM Annualincome is Matched");

				}
				else {
					System.out.println("Annualincome not updated as per PI....");
				}
				
			}
			
//	
//			 if (driver.findElement(By.xpath("(//div[contains(text(),'Rs.')])[1]")).isDisplayed()) {
//					Thread.sleep(4000);
//					WebElement income31 = driver.findElement(By.xpath("(//div[contains(text(),'Rs.')])[1]"));
//					String incomewcsm1 = income31.getText();
//					System.out.println("income in wcsm :" + incomewcsm1);
//
//					String[] split7 = incomewcsm1.split(" Lakh");
//					System.out.println("inc wcsm1:" + split7[0]);
////					int incomewcsm=Integer.parseInt(split7[0]);
//					
//
//					String[] split8 = split7[0].split("Rs.");
//					System.out.println("inc wcsm1:" + split8[1]);
//
//					int finalwcsmincome = Integer.parseInt(split8[1]);
//					System.out.println("finalwcsmincome:" + finalwcsmincome);
//					
//					if ((finalincomepi - 2) == finalwcsmincome) {
//						System.out.println("Annualincome matched");
//
//					}
//
//					else {
//						System.out.println("Annualincome not matched");
//					}
//
//				}
		
		
		
			
		
		Thread.sleep(4000);
		BaseTest.click(rp.getMorepreference());

		Thread.sleep(4000);
		WebElement height3 = driver.findElement(By.xpath("//ion-label[contains(text(),'Height')]//following::div[1]"));
		String heightfrom = height3.getText();
        System.out.println("From Height = "+heightfrom);
		
		

        if (heightfrom.equals("4ft")) {
			System.out.println("PI & WCSM From Height is Matched");
		} else {
			System.err.println("PI & WCSM From Height is Not Matched");
		}
	    
		
		
		
		
		
//	  String[] split11=heightfrom.split("ft");
//	  int heightfromwcsm=Integer.parseInt(split11[0]);
//	  System.out.println("height from:"+heightfromwcsm);
//	  
//	  if (heightfromwcsm>heightpi) {
//		System.out.println("height are matched");
//	}
//	  else {
//		System.out.println("height not matched");
//	}
//
		Thread.sleep(4000);
		WebElement height4 = driver.findElement(By.xpath("//ion-label[contains(text(),'Height')]//following::div[3]"));
		String heighttowcsm = height4.getText();
	    System.out.println("To Height = " + heighttowcsm);
		
	    
	    
	    
		if (heighttowcsm.equals("7ft 11in")) {
			System.out.println("PI & WCSM To Height is Matched");

		} else {
			System.err.println("PI & WCSM To Height is Not Matched");
		}

//	  Thread.sleep(4000);
//	  WebElement doswcsm=driver.findElement(By.xpath("(//div[@class='openPopUp_values no-break_line'])[12]"));
//	  String doshwcsm=doswcsm.getText();
//	  System.out.println("income in pi:"+doshwcsm);
//	  
//	  try {
//          if (doshwcsm.equals(dosh)) {
//               System.out.println("no dosham matches");
//           }else {
//               System.out.println("no dosham not matches");
//           }
//   } catch (Exception e) {
//       System.out.println("only for no dosham");
//   }
//
//      try {
//       if (doshwcsm.equalsIgnoreCase("Manglik")|doshwcsm.equalsIgnoreCase("Sarpa Dosh")|doshwcsm.equalsIgnoreCase("Kala Sarpa Dosh")|doshwcsm.equalsIgnoreCase("Rahu Dosh")|doshwcsm.equalsIgnoreCase("Kethu Dosh")|doshwcsm.equalsIgnoreCase("Kalathra Dosh")){
//           System.out.println(" dosham matches");
//       } else {
//           System.out.println(" dosham not matches");
//       }
//   } catch (Exception e) {
//       System.out.println("only for dosham");
//
//   }

		Thread.sleep(4000);
		WebElement cd12 = driver.findElement(By.xpath("(//ion-label[contains(text(),'Education')]//following::div[1])[1]"));
		String educationwcsm = cd12.getText();
		System.out.println("Education = " + educationwcsm);
		
		
		 Thread.sleep(8000);
		  if (educationwcsm.equals("Any")) {
				System.out.println("PI & WCSM Education is Matched");
				} else if (education.contains(educationwcsm)) {
					System.out.println("PI & WCSM Education is Matched");
				}else{
		System.err.println("PI & WCSM Education is Not Matched");
				}
		    
		////////RELIGION AND DENOMINATION

		try {
			Thread.sleep(4000);
			WebElement de1 = driver.findElement(By.xpath("(//ion-label[contains(text(),'Religion')]//following::div[1])[2]"));
			String religionwcsm = de1.getText();
			System.out.println("Religion = "+religionwcsm);
			Thread.sleep(4000);
			 if (religionwcsm.equals("Any")) {
					System.out.println("PI & WCSM Religion is Matched");
				} else if (religionpi.contains(religionwcsm)) {
					System.out.println("PI & WCSM Religion is Matched");
				} else {
					System.err.println("PI & WCSM Religion is Not Matched");
				}
		} catch (Exception e) {
			//System.out.println("No Religion Present");		
		}
		
		 try {
				Thread.sleep(4000);
				WebElement acig111 = driver.findElement(By.xpath("(//ion-label[contains(text(),'Denomination')]//following::div[1])[3]"));
				String denomination1 = acig111.getText();
				System.out.println("Denomination = " + denomination1);
				
				Thread.sleep(4000);
				  if (denomination1.equals("Any")) {
						System.out.println("PI & WCSM Denomination is Matched");
						} else if (denomination.contains(denomination1)) {
							System.out.println("PI & WCSM Denomination is Matched");
						}else{
				System.err.println("PI & WCSM Denomination is Not Matched");
						}
			} catch (Exception e) {
			}
		
		 
		 /////SUBCASTE AND DIVISION
		 try {
			  Thread.sleep(4000);
			  WebElement sub12=driver.findElement(By.xpath("//div[contains(text(),'Sub Caste')]//following::div[1]"));
			  String subcaste12=sub12.getText();
			  System.out.println("Subcaste = "+subcaste12);
			  Thread.sleep(4000);
			  if (subcaste12.equals("Any")) {
					System.out.println("PI & WCSM Subcaste is Matched");
					} else if (subcaste.contains(subcaste12)) {
						System.out.println("PI & WCSM Subcaste is Matched");
					}else{
			System.err.println("PI & WCSM Subcaste is Not Matched");
					}

		} catch (Exception e) {
		}
		 
		
		 
		
		  /////DOSHAM////
		  
		 try {
			 Thread.sleep(4000);
			  WebElement dosh12=driver.findElement(By.xpath("//ion-label[contains(text(),'Manglik')]//following::div[1]"));
			  String dosham12=dosh12.getText();
			  System.out.println("Dosham = "+dosham12);
			  Thread.sleep(7000);
			  if (dosham12.equals("Doesn't matter")) {
			  		System.out.println("PI & WCSM Dosham is Matched");
					} else if (dosham.contains(dosham12)) {
						System.out.println("PI & WCSM Dosham is Matched");
					}else{
			     System.err.println("PI & WCSM Dosham is Not Matched");
					}
		} catch (Exception e) {
		}
			  
		
		  
		try {
			Thread.sleep(4000);
			  WebElement dosh12=driver.findElement(By.xpath("//ion-label[contains(text(),'Chevvai ')]//following::div[1]"));
			  String dosham12=dosh12.getText();
			  System.out.println("Dosham = "+dosham12);
			  Thread.sleep(7000);
			  if (dosham12.equals("Doesn't matter")) {
			  		System.out.println("PI & WCSM Dosham is Matched");
					} else if (dosham.contains(dosham12)) {
						System.out.println("PI & WCSM Dosham is  Matched");
					}else{
			     System.err.println("PI & WCSM Dosham is Not Matched");
					}
		} catch (Exception e) {
			
		}
		  
		  
   Thread.sleep(4000);
	  WebElement mother1=driver.findElement(By.xpath("//ion-label[contains(text(),'Mother Tongue')]//following::div[1]"));
	  String tongue1=mother1.getText();
	  System.out.println("Mother Tongue = "+tongue1);
 
	  if (tongue1.equals("Any")) {
			System.out.println("PI & WCSM Mother Tongue is Matched");
			} else if (mother.contains(tongue1)) {
				System.out.println("PI & WCSM Mother Tongue is Matched");
			}else{
	System.err.println("PI & WCSM Mother Tongue is Not Matched");
			}
	  
		  
		
		  Thread.sleep(4000);
		  WebElement physical12=driver.findElement(By.xpath("//ion-label[contains(text(),'Physical Status')]//following::div[1]"));
		  String physicalstatus12=physical12.getText();
		  System.out.println("Physicalstatus = "+physicalstatus12);

		  Thread.sleep(4000);
		  
		  if (physicalstatus12.equals("Doesn't matter")) {
				System.out.println("PI & WCSM Physical Status is Matched");
				} else if (physical.contains(physicalstatus12)) {
					System.out.println("PI & WCSM Physical Status is Matched");
				}else if (physical.equals("Normal")) {
					System.out.println("PI & WCSM Physical Status is Matched");
				}else if (physical.equals("Physically Challenged")&&(physicalstatus12.equals("Doesn't matter"))) {
					System.out.println("PI & WCSM Physical Status is Matched");
				}
				else{
		System.err.println("PI & WCSM Physical Status is Not Matched");
				}
		  
		  Thread.sleep(4000);
		  WebElement eating12=driver.findElement(By.xpath("//ion-label[contains(text(),'Eating')]//following::div[1]"));
		  String eatinghabits12=eating12.getText();
		  System.out.println("Eatinghabits = "+eatinghabits12);
		  
Thread.sleep(4000);
		  if (eatinghabits12.equals("Doesn't Matter")) {
				System.out.println("PI & WCSM Eating Habits is Matched");
				} else if (eating.contains(eatinghabits12)) {
					System.out.println("PI & WCSM Eating Habits is Matched");
				}else{
		System.err.println("PI & WCSM Eating Habits is Not Matched");
				}
			

		  Thread.sleep(4000);
		  WebElement drinking12=driver.findElement(By.xpath("//ion-label[contains(text(),'Drinking')]//following::div[1]"));
		  String drinkinghabits12=drinking12.getText();
		  System.out.println("Drinkinghabits = "+drinkinghabits12);

		  if (drinkinghabits12.equals("Doesn't Matter")) {
				System.out.println("PI & WCSM Drinking Habits is Matched");
				} else if (drinking.contains(drinkinghabits12)) {
					System.out.println("PI & WCSM Drinking Habits is Matched");
				}else{
		System.err.println("PI & WCSM Drinking Habits is Not Matched");
				}
	
		  
		  Thread.sleep(4000);
		  WebElement smoking12=driver.findElement(By.xpath("//ion-label[contains(text(),'Smoking')]//following::div[1]"));
		  String smokinghabits12=smoking12.getText();
		  System.out.println("Smoking Habits = "+smokinghabits12);

		  if (smokinghabits12.equals("Doesn't Matter")) {
				System.out.println("PI & WCSM Smoking Habits is Matched");
				} else if (smoking.contains(smokinghabits12)) {
					System.out.println("PI & WCSM Smoking Habits is Matched");
				}else{
		System.err.println("PI & WCSM Smoking Habits is Not Matched");
				}
		   
		  
		  WebElement country12=driver.findElement(By.xpath("//ion-label[contains(text(),'Country')]//following::div[1]"));
		  String country121=country12.getText();
		  System.out.println("Country  = "+country121);
		  
		  
		  
		  if (country121.equals("Any")) {
				System.out.println("PI & WCSM Country is Matched");
				} else if (country1.contains(country121)) {
					System.out.println("PI & WCSM Country is Matched");
				}else{
		System.err.println("PI & WCSM Country is Not Matched");
				}
		    
		  
		  WebElement citizen12=driver.findElement(By.xpath("//ion-label[contains(text(),'Citizenship')]//following::div[1]"));
		  String citizenship12=citizen12.getText();
		  System.out.println("Citizenship  = "+citizenship12);  
		  
		  
		  if (citizenship12.equals("Any")) {
				System.out.println("PI & WCSM Citizenship is Matched");
				} else if (citizenship1.contains(citizenship12)) {
					System.out.println("PI & WCSM Citizenship is Matched");
				}else{
		System.err.println("PI & WCSM Citizenship is Not Matched");
				}
		
		  


		
		
		
		 
				
		  
		 
			
		  
		  
		  
		  
		  
		 

		  
		  
		  
		 
		
		 
			
		
		  
		 
		  

		
		
		
		
		

		}}}

