package TestScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.Base;
import Pom.LoginPom;

public class EditPartnerPreference extends Base {
	WebDriver driver;

	@BeforeMethod
	public void startUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Mohan\\chromedriver_win32\\chromedriver.exe");
		// driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amuthan\\eclipse-workspace\\Community_Edit\\Driver\\chromedriver.exe");
		driver = new ChromeDriver(options);

	}

	@Test
	public void loginEPP() throws InterruptedException, IOException {

		File ff = new File("C:\\Users\\amuthan\\eclipse-workspace\\Community_Edit\\Excel\\writeeditpp.xlsx");
		Workbook ww = new XSSFWorkbook();
		Sheet ss = ww.getSheet("sheet1");

		Row rr = ss.createRow(1);

		FileOutputStream out = new FileOutputStream(ff);
//		  Cell cc = rr.createCell(1);
		LoginPom p = new LoginPom(driver);
		driver.manage().window().maximize();

		driver.get("https://www.communitymatrimony.com");

		Base.typeData(p.getMatri_id(), Base.readValueFromExcelSheet().get(1).get("UserName"));

		Base.click(p.getPasswordclear());

		WebElement pass = driver.findElement(By.xpath("//*[@id='password1']"));
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOf(pass));
		Base.typeData(p.getPassword(), Base.readValueFromExcelSheet().get(1).get("Password"));

		Base.click(p.getLogin_button());
		
		
		
		

		try {
			Base.click(p.getIntermediate_dailymatch());
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			driver.findElement(By.xpath("/html/body/div[3]/a")).click();
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			driver.findElement(By.xpath("/html/body/header/div/div/div/a")).click();
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
		} catch (Exception e) {
			e.getMessage();
		}
		
	

		Actions ac = new Actions(driver);
		WebElement mouse_action = driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a"));
		Thread.sleep(1000);
		ac.moveToElement(mouse_action).perform();
		WebElement chat_hide = driver.findElement(By.id("chatbuddylistwin"));
		WebDriverWait waitchat = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOf(chat_hide));
		Thread.sleep(1000);
		ac.moveToElement(mouse_action).perform();

		WebElement mouse_action1 = driver
				.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[2]/a"));
		Thread.sleep(1000);
		ac.moveToElement(mouse_action1).click().build().perform();
		
		
		//*****************************************************
		try {
			String about_partner = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[1]")).getText();
			String about_partner_det=driver.findElement(By.xpath("//*[@id=\"strictflag\"]/span")).getText();
			System.out.println("About " + about_partner );
			System.out.println("Line :" + about_partner_det);
		} catch (Exception e) {
			e.getMessage();
		}
	

		// Getting PP Value
		// **************************************************************************************************
try {
	WebElement marital_Status = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[2]"));
	String marital = marital_Status.getText();
	String a = marital.substring(0, 26);
	System.out.println(a);
	Cell cc = rr.createCell(1);
	cc.setCellValue(a);
} catch (Exception e) {
	e.getMessage();
}
		/*WebElement marital_Status = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[2]"));
		String marital = marital_Status.getText();
		String a = marital.substring(0, 26);
		System.out.println(a);
		Cell cc = rr.createCell(1);
		cc.setCellValue(a);*/

		// Age from PP
		// ***************************************************************************************************************
try {
	WebElement Age = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[4]"));
	String AgeFrom = Age.getText();

	// Age From
	String b = AgeFrom.substring(6, 8);
	Cell c2c = rr.createCell(2);
	c2c.setCellValue(b);
	System.out.println("Age From : " + b);

	// Age TO
	String c = AgeFrom.substring(12, 14);
	Cell c3c = rr.createCell(3);
	c3c.setCellValue(c);
	System.out.println("Age To : " + c);
} catch (Exception e) {
	e.getMessage();
}	

/*WebElement Age = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[4]"));
		String AgeFrom = Age.getText();

		// Age From
		String b = AgeFrom.substring(6, 8);
		Cell c2c = rr.createCell(2);
		c2c.setCellValue(b);
		System.out.println("Age From : " + b);

		// Age TO
		String c = AgeFrom.substring(12, 14);
		Cell c3c = rr.createCell(3);
		c3c.setCellValue(c);
		System.out.println("Age To : " + c);
*/
		// Height From
		// PP******************************************************************************************************************
		WebElement Height = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[6]"));
		String Height1 = Height.getText();

		// Height From
		String d = Height1.substring(9, 13);
		Cell c4c = rr.createCell(4);
		c4c.setCellValue(d);
		System.out.println("Height From : " + d);

		// Height To
		String e = Height1.substring(17, 21);
		String eede = Height1.substring(17, 26);
		System.out.println("Height To : " + e);
		System.out.println("Height To : " + eede);
		Cell c5c = rr.createCell(5);
		c5c.setCellValue(e);

		// MOther Tongue
		// ***********************************************************************************************************

		WebElement Mother_Tongue = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[8]"));
		String Mother_tongue1 = Mother_Tongue.getText();
		String f = Mother_tongue1.substring(16, 19);
		System.out.println("Mother Tongue : " + f);
		Cell c6c = rr.createCell(6);
		c6c.setCellValue(f);

		// Physical Status
		// ***************************************************************************************************************
		WebElement Physical = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[10]"));
		String status = Physical.getText();
		String g = status.substring(18, 24);
		System.out.println("Physical Status : " + g);
		Cell c7c = rr.createCell(7);
		c7c.setCellValue(g);

		// Eating Habit
		// **************************************************************************************************************
		WebElement eating = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[12]"));
		String eati = eating.getText();
		String h = eati.substring(16, 30);
		System.out.println("Eating Habit : " + h);
		Cell c8c = rr.createCell(8);
		c8c.setCellValue(h);
 
		//
		WebElement Drinking = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[14]"));
		String Drink = Drinking.getText();
		String i = Drink.substring(18, 32);
		System.out.println("Drinking Habit : " + i);
		Cell c9c = rr.createCell(9);
		c9c.setCellValue(i);

		WebElement Smoking = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[16]"));
		String Smoke = Smoking.getText();
		String j = Smoke.substring(16, 31);
		System.out.println("Smoking Habit : " + j);
		Cell c10c = rr.createCell(10);
		c10c.setCellValue(j);

		WebElement Religion = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[18]"));
		String Rel = Religion.getText();
		String k = Rel.substring(11, 16);
		System.out.println("Religion : " + k);
		Cell c11c = rr.createCell(11);
		c11c.setCellValue(k);

		WebElement SubCaste = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[20]"));
		String caste = SubCaste.getText();
		String l = caste.substring(11, 14);
		System.out.println("Subcaste : " + l);
		Cell c12c = rr.createCell(12);
		c12c.setCellValue(l);

		WebElement Star = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[22]"));
		String starr = Star.getText();
		String m = starr.substring(7, 10);
		System.out.println("Star : " + m);
		Cell c13c = rr.createCell(13);
		c13c.setCellValue(m);

		WebElement MAnglik = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[24]"));
		String mangel = MAnglik.getText();
		String n = mangel.substring(10, 24);
		System.out.println("Manglik : " + n);
		Cell c14c = rr.createCell(14);
		c14c.setCellValue(n);

		WebElement Education = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[26]"));
		String Education1 = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[26]")).getText();
		System.out.println("Education : " + Education1);
		
		String edu = Education.getText();
		String o = edu.substring(12, 33);
		System.out.println("Education : " + o);
		Cell c15c = rr.createCell(15);
		c15c.setCellValue(o);

		WebElement Occupation = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[28]"));
		String occ = Occupation.getText();
		String pp = occ.substring(13, 16);
		System.out.println("Occupation : " + pp);
		Cell c16c = rr.createCell(16);
		c16c.setCellValue(pp);

		WebElement Income = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[30]"));
		String Annual = Income.getText();
		String q = Annual.substring(16, 19);
		System.out.println("Annula Income : " + q);
		Cell c17c = rr.createCell(17);
		c17c.setCellValue(q);

		WebElement CitizenShip = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[32]"));
		String citizen = CitizenShip.getText();
		String r = citizen.substring(14, 19);
		System.out.println("Citizenship : " + r);
		Cell c18c = rr.createCell(18);
		c18c.setCellValue(r);

		WebElement Country = driver.findElement(By.xpath("//*[@id=\"strictflag\"]/div[34]"));
		String con = Country.getText();
		String s = con.substring(10, 13);
		System.out.println("Country : " + s);
		Cell c19c = rr.createCell(19);
		c19c.setCellValue(s);

//Naviganting to GMail  ************************************************************************************************** 

		driver.navigate().to("https://www.gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("cbsautomationreport");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("cbstest123");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();

		// Selecting Mail Using Text Value *****************VIJAY
		// MOHAN****************************************************
		Thread.sleep(3000);
		List<WebElement> x = driver.findElements(By.xpath("//*[@class='yW']/span"));
		System.out.println(x.size());
		for (int ii = 0; ii < x.size(); ii++) {
			// System.out.println(x.get(ii).getText());
			if (x.get(ii).getText().equals("Vijay Mohan")) {
				x.get(ii).click();
			}
		}

		// Geting the PP Value from Mail.++	A	AQQQQQQ
		// **************************************************************************
		WebElement openid = driver.findElement(By.xpath("//*[@id=\":ml\"]/div[1]/div[2]/table/tbody"));
		String open1 = openid.getText();

		Row r2 = ss.createRow(2);
		Cell c20c = r2.createCell(1);
		c20c.setCellValue(open1);

		//Splitiing The Value **************************Using the Value  "!" ***************************************
		String[] agee = open1.split("!");
		String aaaa = agee[0].toString();
		String bbbb = agee[1].toString();

		
		//Splitting the VALUE bASED On ***************MAtri ID ** BRH ** MUT ** CHR ** MUS ** DIV ********************
		String[] cccc = bbbb.split("MUT");
		String dddd = cccc[1].toString();
		String[] ffff = dddd.split("|");
		String place = dddd.toString();

		String agemail = ffff[8] + ffff[9] + ffff[10] + ffff[11] + ffff[12] + ffff[13];
		System.out.println("Age : " + agemail);
		
		String height_feet = ffff[17] + ffff[18] + ffff[19] + ffff[20];
		System.out.println("Height : " + height_feet);
		
		
		String height_feet_inche = ffff[17] + ffff[18] + ffff[19] + ffff[20] + ffff[21] + ffff[22] + ffff[23] + ffff[24]
				+ ffff[25];
		
		
		try {
			String height_feet_inche1 = ffff[17] + ffff[18] + ffff[19] + ffff[20] + ffff[21] + ffff[22] + ffff[23]
					+ ffff[24] + ffff[25];
			System.out.println("Height Inches : " + height_feet_inche1);
		} catch (Exception ee) {
			System.out.println("no ft");
		}
		String[] p1 = place.split(",");

		String loc = p1[1].toString();
		String[] split = loc.split("Education");

		String state_mail = split[0].toString();
		System.out.println("State : " + state_mail.trim());

		String educat = split[1].toString();
		String[] split2 = educat.split(":");
		String edu1 = split2[1].toString();

		String[] split3 = edu1.split("Occupation");
		String education_mail = split3[0].toString();
		System.out.println("Education : " + education_mail.trim());
		
		
		/*String age1 = agemail.replaceAll("[yrs]", "");
		String age4 = age1.trim();
		int age = Integer.parseInt(age4);
		int age2 = Integer.parseInt(b);
		int age3 = Integer.parseInt(c);
		if (age == age2 || age <= age3) {
			System.out.println(age + "is between" + age2 + "and" + age3);
		} else {
			System.out.println(age + "is not between" + age2 + "and" + age3);
		}*/
		
		
		String height = height_feet_inche.replaceAll("[ftin]", "");
		// System.out.println(height);
		String[] split4 = height.split("  ");
		String height1 = split4[0] + "." + split4[1];
		float h11 = Float.parseFloat(height1);
		System.out.println(h11);
		String he1 = d.replaceAll("[ftin]", "");
		String he2 = e.replaceAll("[ftin]", "");
		float h12 = Float.parseFloat(he1);
		float h13 = Float.parseFloat(he2);
		// String[] split5 = he1.split(" ");
		// String h1=split5[0]+"."+split5[1];
		// String[] split6 = he2.split(" ");
		// String h2=split6[0]+"."+split6[1];
		System.out.println(he1);
		System.out.println(he2);
		if (h11 == h12 || h11 <= h13) {
			System.out.println(h11 + "is between" + h12 + "and" + h13);

		} else {
			System.out.println(h11 + "is not between" + h12 + "and" + h13);
		}
		
		boolean case11 = Education1.equalsIgnoreCase(edu);
		System.out.println(case11);
		
		boolean casee12 = Education1.contains(edu);
		System.out.println(casee12);
		
		
		
		/*
		 * ww.write(out); int ccd = Integer.parseInt(c);
		 * 
		 * if (agee==b && agee<ccd) { sys
		 * 
		 * } else {
		 * 
		 * }
		 */

	}

}
