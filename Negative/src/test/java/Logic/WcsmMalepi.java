package Logic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import org.openqa.selenium.By;
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
import pom.NegativeEditPiPOM;
import pom.WcsmPIPom;
import pom.WcsmPOM;

public class WcsmMalepi {
	int maleagenumber;
	int maleagenumberfromwcsm;
	int maleagenumbertowcsm;
	int finalincomepi;
	int annualinc;
	String religionpi;
	String annualinocmename, notworking;
	String annualinocFROMwcsm;
	int annualinc1;
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

		Thread.sleep(5000);
		driver.get("https://mstage.communitymatrimony.com/cbsmob/login.php");
		driver.manage().window().maximize();

		// login
		WebElement e123 = driver.findElement(By.xpath("//*[@id='idEmail']"));
		Actions a11 = new Actions(driver);
		Thread.sleep(4000);
		a11.sendKeys(e123, "AGR755075").build().perform();

		Thread.sleep(4000);

		WebElement d123 = driver.findElement(By.xpath("//*[@id='password1']"));
		Thread.sleep(4000);
		Actions bcd11 = new Actions(driver);
		Thread.sleep(4000);
		bcd11.sendKeys(d123, "cbstest").build().perform();

		Thread.sleep(4000);
		BaseTest.click(rp.getLogin());

		
		
		
		try {
			Thread.sleep(6000);
			driver.findElement(By.xpath(
					"/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]"))
					.click();

		} catch (Exception e2) {
			System.out.println("no element1");
		}

		try {
			Thread.sleep(6000);
			driver.findElement(By.xpath(
					"/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a"))
					.click();

		} catch (Exception e2) {
			System.out.println("no element2");
		}

		Thread.sleep(4000);
		BaseTest.click(rp.getEditpi());
		
		
		

		Thread.sleep(4000);
		WebElement ab = driver.findElement(By.xpath("//div[contains(text(),'Gender')]//following::div[1]"));
		String gender = ab.getText();
		System.out.println("gender in pi:" + gender);

		Thread.sleep(4000);
		WebElement ab1 = driver.findElement(By.xpath("//*[@id='linktobasic_details']/div[2]/ul/li[4]/div[2]"));
		String age = ab1.getText();
		System.out.println("age in pi:" + age);

		String[] split = age.split(" Years");
		System.out.println("age :" + split[0]);
		int agepi = Integer.parseInt(split[0]);
		System.out.println("finalage:" + agepi);

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
		f = 60;
		e= 59;
		g=66;
		seventy = 70;

		//female
		
	
		
		///male
		
		if (maleagenumber>a && maleagenumber<b)
        {

            System.out.println("Female profile should be = From 18 to " + (maleagenumber+one) );

        }else if (maleagenumber>b && maleagenumber<c) {

            System.out.println("Female profile should be = From " + (maleagenumber-ten) + " To " + (maleagenumber+second) );
        }else if (maleagenumber>c && maleagenumber<d) {

            System.out.println("Female profile should be = From " + (maleagenumber-ten)  + " To " +(maleagenumber+third) );

            }else if (maleagenumber>d && maleagenumber<e) {

                System.out.println("Female profile should be = From " + (maleagenumber-fifteen) +  " To " + (maleagenumber+four)  );

            }else if (maleagenumber>f && maleagenumber<g) {

                System.out.println("Female profile should be = From " + (maleagenumber-fifteen) +  " To " + (maleagenumber+four)  );
            }else if (maleagenumber>g) {

                    System.out.println("Female profile should be = From " + (maleagenumber-fifteen) +  " To 70" );
            } 

		Thread.sleep(4000);
		WebElement bc = driver.findElement(By.xpath("//*[@id='linktobasic_details']/div[2]/ul/li[7]/div[2]"));
		String marital = bc.getText();
		System.out.println("marital status in pi:" + marital);

		Thread.sleep(4000);
		WebElement cd = driver.findElement(By.xpath("(//div[contains(text(),'Education')]//following::div[1])[1]"));
		String education = cd.getText();
		System.out.println("education in pi:" + education);

		Thread.sleep(4000);
		try {
			WebElement cd1 = driver.findElement(By.xpath("//div[contains(text(),'Occupation')]//following::div[1]"));
			String occupation = cd1.getText();
			System.out.println("occupation in pi:" + occupation);
		} catch (Exception e) {
	System.out.println("occupation is not specified");
		}
		

		Thread.sleep(4000);
		WebElement cd11 = driver.findElement(By.xpath("(//div[contains(text(),'Income')]//following::div[1])[1]"));
		String income = cd11.getText();
		System.out.println("income in pi:" + income);
		try {
			String[] aaa = income.split(" - ");
			String aab = aaa[0].toString().trim();
			String[] aac = aab.split("Rs. ");
			String aad = aac[1].toString().trim();
			int annualinc = Integer.parseInt(aad);
			System.out.println("PI income from is = " + annualinc);

			String[] split5 = income.split(" - ");
			System.out.println("income1:" + split5[1]);
			String[] split6 = split5[1].split(" Lakhs");
			System.out.println("final income in pi:" + split6[0]);
			int finalincomepi = Integer.parseInt(split6[0]);
			System.out.println("incomepi :" + finalincomepi);
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
			System.out.println("Religion:" + religionpi);

		} catch (Exception e) {
		}
		
		
		
		Thread.sleep(4000);
		WebElement de121 = driver.findElement(By.xpath("(//div[contains(text(),'Eating Habits')]//following::div[1])[1]"));
		String eating = de121.getText();
		System.out.println("Eating Habits:" + eating);

		Thread.sleep(4000);
		WebElement e121 = driver.findElement(By.xpath("(//div[contains(text(),'Drinking Habits')]//following::div[1])[1]"));
		String drinking = e121.getText();
		System.out.println("Drinking Habits:" + drinking);

		Thread.sleep(4000);
		WebElement de2121 = driver.findElement(By.xpath("(//div[contains(text(),'Smoking Habits')]//following::div[1])[1]"));
		String smoking = de2121.getText();
		System.out.println("Smoking Habits:" + smoking);

		 WebElement country=driver.findElement(By.xpath("(//div[contains(text(),'Country')]//following::div[1])[1]"));
		  String country1=country.getText();
		  System.out.println("Country  :"+country1);
		  
		  WebElement citizen1=driver.findElement(By.xpath("(//div[contains(text(),'Citizenship')]//following::div[1])[1]"));
		  String citizenship1=citizen1.getText();
		  System.out.println("Citizenship  :"+citizenship1);  
		  

		  try {
			  Thread.sleep(4000);
				WebElement de12 = driver.findElement(By.xpath("(//div[contains(text(),'Religion')]//following::div[1])[1]"));
				String religionpi = de12.getText();
				System.out.println("Religion in PI:" + religionpi);

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// back
		driver.findElement(By.xpath("//*[@id='historyBack']")).click();

		try {
			Thread.sleep(6000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]")).click();

		} catch (Exception e2) {
			System.out.println("no element1");
		}

		try {
			Thread.sleep(6000);
			driver.findElement(By.xpath("/html/body/ion-app/ng-component/page-dashboard/ion-header/header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a")).click();

		} catch (Exception e2) {
			System.out.println("no element2");
		}

//		Thread.sleep(4000);
//		BaseTest.click(rp.getSetting());

		Thread.sleep(4000);
		driver.get("https://mobilestage.agarwalmatrimony.com/#/wcsm");
		
		
		/// Privacy setting
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//ion-label[contains(text(),'Privacy Settings')]")).click();
//
//		// edit
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//span[contains(text(),'EDIT')]")).click();

//	Thread.sleep(4000);
//	BaseTest.click(rp.getWhocanseeme());

		Thread.sleep(4000);
		WebElement agefrom = driver.findElement(By.xpath("(//div[@class='frmto'])[1]"));
		String wcagefrom = agefrom.getText();
		System.out.println("Age from in wcsm:" + wcagefrom);
		String[] split3 = wcagefrom.split(" years");
		int maleagenumberfromwcsm = Integer.parseInt(split3[0]);
		System.out.println("wcsmstartage:" + maleagenumberfromwcsm);

		Thread.sleep(4000);
		WebElement ageto = driver.findElement(By.xpath("(//div[@class='frmto'])[2]"));
		String wcageto = ageto.getText();
		System.out.println("Age to in wcsm:" + wcageto);
		String[] split4 = wcageto.split(" years");
		System.out.println("wcsmendage:" + split4[0]);
		int maleagenumbertowcsm = Integer.parseInt(split4[0]);

	
				
			
		
		/////male/////
		
		if (agepi>=a && agepi<=b) {
            if (agepi>=a && agepi<=b && maleagenumberfromwcsm==18) {
            System.out.println(" Female profile should be = 18 to 28 male matched");

            }
            else {
                System.out.println("Female profile should be = 18 to 28 male not matched");
            }
        } else if (agepi>=b && agepi<=c  ){
            if (agepi>=b && agepi<=c && agepi+one==maleagenumberfromwcsm &&agepi-ten==maleagenumbertowcsm ) {
                System.out.println("Female profile should be = 29 to 39 male  matched");

                }
                else {
                    System.out.println("Female profile should be = 29 to 39 male not matched");
                }

        }else if (agepi>=c && agepi<=d ){
            if (agepi>=c && agepi<=d && agepi+second==maleagenumberfromwcsm &&agepi-ten==maleagenumbertowcsm ) {
                System.out.println("Female profile should be = = age from 39 to 49 male matched");

                }
                else {
                    System.out.println("Female profile should be = = age from 39 to 49 male not matched");
                }

        }else if (agepi>=d && agepi<=e ){

            if (agepi>=d && agepi<=e && agepi+third==maleagenumberfromwcsm &&agepi-ten==maleagenumbertowcsm) {
                System.out.println("Female profile should be = age from 49 to 59 male matched");

                }
                else {
                    System.out.println("Female profile should be = age from 49 to 59 male not matched");
                }

        }else if (agepi>=f && agepi<=g ){
            if (agepi>=f && agepi<=g && agepi+four==maleagenumberfromwcsm &&agepi-fifteen==maleagenumbertowcsm ) {
                System.out.println("Female profile should be = age from 60 to 66 male matched");

                }
                else {
                    System.out.println("Female profile should be = age from 60 to 66 male not matched");
                }

        }else if (agepi>g ){
            if (agepi>g && agepi-four==maleagenumberfromwcsm && maleagenumbertowcsm==70) {
                System.out.println("Female profile above 66 male matched");

                }
                else {
                    System.out.println("Female profile above 66 male not matched");
                }
   
			 
				
		
			}
	
		
		
		Thread.sleep(4000);
		WebElement marital1 = driver.findElement(By.xpath("(//div[@class='openPopUp_values no-break_line'])[1]"));
		String maritalwcsm = marital1.getText();
		System.out.println("marital status in wcsm :" + maritalwcsm);

		boolean Unmarriedwcsm = driver.findElement(By.xpath("(//div[@class='openPopUp_values no-break_line'])[1]"))
				.isSelected();
		boolean Unmarriedwcsmfalse = driver.findElement(By.xpath("(//div[@class='openPopUp_values no-break_line'])[1]"))
				.isSelected();
		if (Unmarriedwcsm == true) {

			System.out.println("wcsm unmarried selected");
			try {
				boolean wcsmHaveChildren = driver.findElement(By.id("select2-wcsmHaveChildren-container"))
						.isDisplayed();
				if (wcsmHaveChildren == true) {
					System.out.println("Wcsm unmarried shown have children and its error");
				}
			} catch (Exception e) {
				System.out.println("have children button is not showning so ok");
			}

			if (Unmarriedwcsm == true && marital.equalsIgnoreCase("Unmarried")) {

				System.out.println("wcsm unmarried and PI unmarried selected so ok matched");

			} else {

				System.out.println("wcsm unmarried and PI unmarried not selected so unmatched");
			}

			//

		} else if (Unmarriedwcsmfalse == false) {

			System.out.println("wcsm unmarried not selected");
			try {
				boolean wcsmHaveChildren = driver.findElement(By.id("wcsmHaveChildren")).isDisplayed();
				if (wcsmHaveChildren == true) {
					System.out.println("Having childrens");
				}
			} catch (Exception e) {
				System.out.println("wcsm not married have children button is not showning so its not ok");
			}

		}
		if (Unmarriedwcsmfalse == false && marital.equalsIgnoreCase("Divorced") | marital.equalsIgnoreCase("Seprated")
				| marital.equalsIgnoreCase("Widow / Widower")) {

			System.out.println("wcsm non unmarried and PI non unmarried selected ");

		} else {

			System.out.println("wcsm non unmarried and PI non unmarried not selected so its error");
		}

		/////// income///////

		Thread.sleep(4000);
		
		
		if (driver.findElement(By.xpath("//ion-label[contains(text(),'Annual Income')]//following::div[1]")).isDisplayed()) {
			Thread.sleep(4000);
			WebElement income3 = driver.findElement(By.xpath("//ion-label[contains(text(),'Annual Income')]//following::div[1]"));
			String incomewcsm = income3.getText();
			System.out.println("income in wcsm :" + incomewcsm);
			
			if ((incomewcsm.contains("Any"))) {
				System.out.println("Annualincome in  Wcsm has Any...");

			}
			else {
				System.out.println("Annualincome not updated as per PI....");
			}
			
		}
		

		 if (driver.findElement(By.xpath("(//div[contains(text(),'Rs.')])[1]")).isDisplayed()) {
				Thread.sleep(4000);
				WebElement income31 = driver.findElement(By.xpath("(//div[contains(text(),'Rs.')])[1]"));
				String incomewcsm1 = income31.getText();
				System.out.println("income in wcsm :" + incomewcsm1);

				String[] split7 = incomewcsm1.split(" Lakh");
				System.out.println("inc wcsm1:" + split7[0]);
//				int incomewcsm=Integer.parseInt(split7[0]);
				

				String[] split8 = split7[0].split("Rs.");
				System.out.println("inc wcsm1:" + split8[1]);

				int finalwcsmincome = Integer.parseInt(split8[1]);
				System.out.println("finalwcsmincome:" + finalwcsmincome);
				
				if ((finalincomepi - 2) == finalwcsmincome) {
					System.out.println("Annualincome matched");

				}

				else {
					System.out.println("Annualincome not matched");
				}

			}

		Thread.sleep(4000);
		BaseTest.click(rp.getMorepreference());

		Thread.sleep(4000);
		WebElement height3 = driver.findElement(By.xpath("//ion-label[contains(text(),'Height')]//following::div[1]"));
		String heightfrom = height3.getText();

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

		Thread.sleep(4000);
		WebElement height4 = driver.findElement(By.xpath("//ion-label[contains(text(),'Height')]//following::div[3]"));
		String heighttowcsm = height4.getText();
		System.out.println("Height in pp :" + heighttowcsm);

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
		WebElement cd12 = driver
				.findElement(By.xpath("(//ion-label[contains(text(),'Education')]//following::div[1])[1]"));
		String educationwcsm = cd12.getText();
		System.out.println("education in wcsm:" + educationwcsm);

		Thread.sleep(4000);
		WebElement de1 = driver
				.findElement(By.xpath("(//ion-label[contains(text(),'Religion')]//following::div[1])[2]"));
		String religionwcsm = de1.getText();

		if (religionwcsm.equals("Any")) {
			System.out.println("religion is Any");
		} else if (religionpi.contains(religionwcsm)) {
			System.out.println("religion is matched");
		} else {
			System.out.println("religion is not matched");
		}

		if (heightfrom.equals("4ft")) {
			System.out.println("from height is matched");
		} else {
			System.out.println("from height is not matched");
		}

		if (heighttowcsm.equals("7ft 11in")) {
			System.out.println("to height is matched");

		} else {
			System.out.println("to height is not matched");
		}

	}
}
