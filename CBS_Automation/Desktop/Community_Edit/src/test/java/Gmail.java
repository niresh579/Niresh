import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.Base;
import Pom.LoginPom;

public class Gmail extends Base {
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
		Sheet ss = ww.createSheet("editppvalue");

		Row rr = ss.createRow(1);

		FileOutputStream out = new FileOutputStream(ff);
//		  Cell cc = rr.createCell(1);
		LoginPom p = new LoginPom(driver);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("cbsautomationreport");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("cbstest123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

		// Selecting Mail Using Text Value *****************VIJAY
		// MOHAN****************************************************
		Thread.sleep(10000);
		List<WebElement> x = driver.findElements(By.xpath("//span[contains(text(),'Matrimony')]"));
		System.out.println(x.size());
		
		Thread.sleep(5000);
		for (int ii = 1; ii < x.size(); ii++) {
			// System.out.println(x.get(ii).getText());
			if (x.get(ii).getText().contains("YadavMatrimony")) {
				x.get(ii).click();
			}
			else {
				System.out.println("Mail Not found");
				break;
			}
		}

		// Geting the PP Value from Mail.
		// **************************************************************************
	Thread.sleep(3000);
	x.get(1).click();
	Thread.sleep(5000);
		WebElement openid = driver.findElement(By.xpath("//a[contains(text(),'Full Profile>>')]"));	
		openid.click();
		//*[@id=":mj"]/div[1]/div[2]
		//*[@id=":ml"]/div[1]
		
	/*	String open1 = openid.getText();
		Row r2 = ss.createRow(2);
		Cell c20c = r2.createCell(1);
		c20c.setCellValue(open1);*/
		//*[@id=":mf"]/div[1]
		//Splitiing The Value **************************Using the Value  "!" ***************************************
		/*String[] agee = open1.split("!");
		String aaaa = agee[0].toString();
		String bbbb = agee[1].toString();*/
   
		
		
		//Splitting the VALUE bASED On ***************MAtri ID ** BRH ** MUT ** CHR ** MUS ** DIV ********************
		/*String[] cccc = bbbb.split("EZH");
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
		
		*/
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
		
		/*
		String height = height_feet_inche.replaceAll("[ftin]", "");
		// System.out.println(height);
		String[] split4 = height.split("  ");
		String height1 = split4[0] + "." + split4[1];
		float h11 = Float.parseFloat(height1);
		System.out.println(h11);*/
		//String he1 = d.replaceAll("[ftin]", "");
	//	String he2 = e.replaceAll("[ftin]", "");
	//	float h12 = Float.parseFloat(he1);
	//	float h13 = Float.parseFloat(he2);
		// String[] split5 = he1.split(" ");
		// String h1=split5[0]+"."+split5[1];
		// String[] split6 = he2.split(" ");
		// String h2=split6[0]+"."+split6[1];
		//System.out.println(he1);
	//	System.out.println(he2);
	//	if (h11 == h12 || h11 <= h13) {
	//		System.out.println(h11 + "is between" + h12 + "and" + h13);

	//	} else {
	//		System.out.println(h11 + "is not between" + h12 + "and" + h13);
	//	}
		

		
		
		
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



