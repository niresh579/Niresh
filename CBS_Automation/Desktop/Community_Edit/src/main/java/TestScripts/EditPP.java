package TestScripts;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.Base;
import Pom.LoginPom;

public class EditPP extends Base {
	WebDriver driver;

	@BeforeMethod
	public void startUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amuthan\\eclipse-workspace\\Community_Edit\\Driver\\chromedriver.exe");
		driver = new ChromeDriver(options);

	}

	@Test
	public void loginEPP() throws InterruptedException, IOException {

		File ff = new File("C:\\Users\\amuthan\\eclipse-workspace\\Community_Edit\\Excel\\writeeditpp.xlsx");
		Workbook www = new XSSFWorkbook();
		Sheet ss = www.createSheet("editppvalue1");
		Sheet ss1 = www.createSheet("Sheet1");

		
      //  Row r2 = ss.createRow(2);
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
		
		
		List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"strictflag\"]"));
		for (int i = 0; i < element.size(); i++) {
			String pp = element.get(i).getText();
			System.out.println(pp);
			
			
			String[] st = pp.split("Marital Status - ");
			String s1 = st[1].toString();
			String[] s12 = s1.split("Age - ");
			String Marital_Status = s12[0].toString();
			System.out.println(Marital_Status);
			
			
			String s22= s12[1].toString();
			String[] s23 = s22.split("Height - ");
			String Age = s23[0].toString();
			System.out.println(Age);
			String[] s24 = Age.split(" to ");
			String Age_From = s24[0].toString();
			System.out.println(Age_From);
			String Age_2 =s24[1].toString();
			System.out.println(Age_2);
			String Age_to= Age_2.replaceAll("[Yrs]", "");
			System.out.println(Age_to);
			
			
			String[] s25 = s23[1].split("Mother Tongue - ");
			String s26 = s25[0].toString();
			System.out.println(s26);
			String[] Height = s26.split(" to ");
			String Height_from = Height[0].toString();
			System.out.println(Height_from);
			String Height_to = Height[1].toString();
			System.out.println(Height_to);
			if (Height_from.contains("ft")) {
				String Height_replace = Height_from.replaceAll("ft", "");
				System.out.println(Height_replace);
				
				
				
			} else {
				String Height_replace1 = Height_from.replaceAll("ftin", "");
				System.out.println(Height_replace1);

			}
			
			if (Height_to.contains("ft")) {
				String Height_replace = Height_to.replaceAll("ft", "");
				System.out.println(Height_replace);
				
				
				
			} else {
				String Height_replace1 = Height_from.replaceAll("ftin", "");
				System.out.println(Height_replace1);

			}
			
			
			
			//System.out.println(s22);
			/*String[] st1 = pp.split("Age - ");
			String s2 = st1[1].toString();
			String[] st2 = pp.split("Height - ");
			String s3 = st2[1].toString();
			String[] st3 = pp.split("Mother Tongue - ");
			String s4 = st3[1].toString();
			String[] st4 = pp.split("Physical Status - ");
			String s5 = st4[1].toString();
			//String 
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			System.out.println(s5);*/
			//String s2 = s1.split[1];
			
			Row r = ss.createRow(i);
			Cell c = r.createCell(i);
			c.setCellValue(pp);
			www.write(out);
			
			}
		}
	}

	
