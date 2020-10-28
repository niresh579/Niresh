package Logic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTest;
import pom.RegistrationPOM;

public class Registration extends BaseTest{
	public static WebDriver driver;
	String driverExecutablePath= "C:\\Users\\CBS Testing\\workspace\\Niresh\\Negative\\driver\\chromedriver.exe";

	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver", driverExecutablePath);
		Map<String, String> mobileEmulation= new HashMap<String,String>();
		mobileEmulation.put("deviceName", "Pixel 2");
		
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        chromeOptions.addArguments("--disable-notifications");
        driver = new ChromeDriver(chromeOptions);
       
	}
	
	@Test
	public void test() throws Throwable {
		RegistrationPOM rp=new RegistrationPOM(driver);
		Thread.sleep(4000);
		driver.get("https://m.communitymatrimony.com/cbsmob/registration/register.php");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		WebElement community=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[1]/div[2]"));
		String a=community.getText();
		System.out.println(a);
		BaseTest.getScreenshot(driver, "select community");
		
		Thread.sleep(4000);
		BaseTest.click(rp.getCommunity());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		Thread.sleep(4000);
		 BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 0)+"')]")));
		
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		WebElement profile=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[2]/div[2]/div[2]"));
		String b=profile.getText();
		System.out.println(b);
		BaseTest.getScreenshot(driver, "select community");
		Thread.sleep(4000);
		BaseTest.getScreenshot(driver, "profile created by");
		 
		Thread.sleep(4000);
		BaseTest.click(rp.getProfilecreatedfor());
		
		
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		WebElement name=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[3]/div[2]"));
		String c=name.getText();
		System.out.println(c);
		
		Thread.sleep(4000);
		BaseTest.getScreenshot(driver, "name popup");
		
		
		Thread.sleep(4000);
		WebElement e1=driver.findElement(By.xpath("//*[@id='USERNAME1']"));
		Actions a1=new Actions(driver);
		Thread.sleep(4000);
		a1.sendKeys(e1,"@#$%^*(^$%").build().perform();
	   
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
         
		Thread.sleep(4000);
		WebElement e11=driver.findElement(By.xpath("//*[@id='USERNAME1']"));
		Actions a11=new Actions(driver);
		Thread.sleep(4000);
		a11.sendKeys(e11,"12345678").build().perform();
	   

		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		
		Thread.sleep(4000);
		WebElement e111=driver.findElement(By.xpath("//*[@id='USERNAME1']"));
		Actions a111=new Actions(driver);
		Thread.sleep(4000);
		a111.sendKeys(e111,"Lalli").build().perform();
	   
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		
		WebElement gender=driver.findElement(By.xpath("//*[@id='CBSRegistration']/div[2]"));
		String d=gender.getText();
		System.out.println(d);	
		Thread.sleep(4000);
		BaseTest.getScreenshot(driver, "gender popup");
		
		Thread.sleep(4000);
		BaseTest.click(rp.getMalegender());
		
		Thread.sleep(4000);
		BaseTest.click(rp.getDob());
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='dw_set']")).click();
		
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		
		WebElement malegender=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[4]/div[2]"));
		String d1=malegender.getText();
		System.out.println(d1);	
		Thread.sleep(4000);
		BaseTest.getScreenshot(driver, "male gender popup");
		
		
		Thread.sleep(4000);
		BaseTest.click(rp.getGender());
		
		
		Thread.sleep(4000);
		BaseTest.click(rp.getDob());
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='dw_set']")).click();
		
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		
		WebElement password=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[5]/div[2]"));
		String g=password.getText();
		System.out.println(g);		
		Thread.sleep(4000);
		BaseTest.getScreenshot(driver, "password popup");
		
		
		Thread.sleep(4000);
		WebElement pass=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
		pass.sendKeys("cbst");
		
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		
		WebElement passwordlen=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[5]/div[2]"));
		String h=passwordlen.getText();
	    System.out.println(h);		
		Thread.sleep(4000);
		BaseTest.getScreenshot(driver, "password character popup");
		
		
		Thread.sleep(4000);
		WebElement pass1=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
		pass1.clear();
		pass1.sendKeys("123456789446");
		
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		
		WebElement passwordlen1=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[5]/div[2]"));
		String h1=passwordlen1.getText();
	    System.out.println(h1);		
		Thread.sleep(4000);
		BaseTest.getScreenshot(driver, "password character popup");
		
		Thread.sleep(4000);
		WebElement pass11=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
		pass11.clear();
		pass11.sendKeys("123456789446");
		
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		
		WebElement passwordlen11=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[5]/div[2]"));
		String h11=passwordlen11.getText();
	    System.out.println(h11);		
		Thread.sleep(4000);
		BaseTest.getScreenshot(driver, "password character popup");
		
		
		Thread.sleep(4000);
		WebElement pass111=driver.findElement(By.xpath("//*[@id='PASSWORD']"));
		pass111.clear();
		pass111.sendKeys("cbstest");
		
		Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton());
		WebElement mobileno=driver.findElement(By.xpath("//*[@id='CBSRegistration']/fieldset[6]/div[2]"));
		String i=mobileno.getText();
		System.out.println(i);		
		Thread.sleep(4000);
		BaseTest.getScreenshot(driver, "mobile number popup");
		
		Thread.sleep(4000);
		BaseTest.click(rp.getIsdcode());
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		Thread.sleep(4000);
		 BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 1)+"')]")));
		
			
			Thread.sleep(4000);
			WebElement mobile=driver.findElement(By.xpath("//*[@id='CONTACTNO']"));
			mobile.sendKeys("9176800869");
			Thread.sleep(4000);
			BaseTest.click(rp.getContinuebutton());
			WebElement religion=driver.findElement(By.xpath("//*[@id='religion_display']/fieldset/div[2]"));
			String k=religion.getText();
			System.out.println(k);	
			
			BaseTest.getScreenshot(driver, "religion popup");
			
			Thread.sleep(4000);
			BaseTest.click(rp.getReligion());
		
		
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 2)+"')]")));
			
			  Thread.sleep(8000);
			   	JavascriptExecutor js9 = (JavascriptExecutor)driver;
			   	  WebElement edi29= driver.findElement(By.xpath("//*[@id='continuebutton']"));
				  	  js9.executeScript("arguments[0].scrollIntoView(true);",edi29);
			 
			BaseTest.click(rp.getContinuebutton());
			WebElement subcaste=driver.findElement(By.xpath("//*[@id='subcaste_display']/fieldset/div[2]"));
			String l=subcaste.getText();
			System.out.println(l);	
			
			BaseTest.getScreenshot(driver, "subcaste popup");
			
			Thread.sleep(4000);
			try {
				BaseTest.click(rp.getSubcaste());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 3)+"')]")));
			} catch (Exception e) {
				System.out.println("no element1");
			}
			Thread.sleep(4000);
			try {
				driver.findElement(By.xpath("(//*[@id='SUBCASTE'])[1]")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 3)+"')]")));
			} catch (Exception e) {
				System.out.println("no element 2");
			}
			
			  Thread.sleep(8000);
			   	JavascriptExecutor js1 = (JavascriptExecutor)driver;
			   	  WebElement edi1= driver.findElement(By.xpath("//*[@id='continuebutton']"));
				  	  js1.executeScript("arguments[0].scrollIntoView(true);",edi1);
			 
			
			BaseTest.click(rp.getContinuebutton());
			WebElement mothertongue=driver.findElement(By.xpath("//*[@id='mothertongue_display']/fieldset/div[2]"));
			String m=mothertongue.getText();
			System.out.println(m);	
			BaseTest.getScreenshot(driver, "mothertongue popup");
			
			BaseTest.click(rp.getMothertongue());
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 4)+"')]")));
			
			 Thread.sleep(8000);
			   	JavascriptExecutor js2 = (JavascriptExecutor)driver;
			   	  WebElement edi2= driver.findElement(By.xpath("//*[@id='continuebutton']"));
				  	  js2.executeScript("arguments[0].scrollIntoView(true);",edi2);
			 
			BaseTest.click(rp.getContinuebutton());
			
			/////////page2////////////
			
			BaseTest.click(rp.getContinuebutton2());
//			WebElement marital=driver.findElement(By.xpath("//div[@class='matritalerror error_display']"));
//			String n=marital.getText();
//			System.out.println(n);	
			BaseTest.getScreenshot(driver, "marital status popup");
			
			Thread.sleep(4000);
			BaseTest.click(rp.getMaritalstatusdivorced());
			
			
			BaseTest.click(rp.getContinuebutton2());
			
			WebElement maritalnoofchild=driver.findElement(By.xpath("//*[@id='no_child_section']/fieldset/div[2]/div[2]"));
			String m1=maritalnoofchild.getText();
			System.out.println(m1);	
			BaseTest.getScreenshot(driver, "no of child popup");
			BaseTest.click(rp.getNoofchild());
			
			BaseTest.click(rp.getContinuebutton2());
			WebElement childlivingwith=driver.findElement(By.xpath("//*[@id='child_living_section']/fieldset/div[2]/div[2]"));
			String m11=childlivingwith.getText();
			System.out.println(m11);	
			
			BaseTest.click(rp.getChildlivingwith());
			
			BaseTest.click(rp.getMaritalstatus());
			BaseTest.click(rp.getContinuebutton2());
			BaseTest.getScreenshot(driver, "email popup");
			
			WebElement validmail=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
			validmail.sendKeys("gihgjgog");
			BaseTest.click(rp.getContinuebutton2());
			WebElement mail23=driver.findElement(By.xpath("//*[@id='CBSRegistration2']/fieldset[2]/div[2]"));
			String m2=mail23.getText();
			System.out.println(m2);	
			BaseTest.getScreenshot(driver, "valid email popup");
			
			
			Thread.sleep(4000);
			Actions acc1 = new Actions(driver);
			WebElement mail1=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
			acc1.doubleClick(mail1).perform();
			Thread.sleep(4000);
			WebElement mail=driver.findElement(By.xpath("//*[@id='EMAIL1']"));
			mail.sendKeys("st"+ (Math.floor(Math.random() * 1478) + "@gmail.com"));
			
			try {
				driver.findElement(By.xpath("//*[@id='COUNTRYLIVING']")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 5)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no element");
			}
			 Thread.sleep(8000);
			   	JavascriptExecutor js3 = (JavascriptExecutor)driver;
			   	  WebElement edi3= driver.findElement(By.xpath("//*[@id='home-footer']/div[1]"));
				  	  js3.executeScript("arguments[0].scrollIntoView(true);",edi3);
			
			BaseTest.click(rp.getContinuebutton2());
			WebElement residing=driver.findElement(By.xpath("//*[@id='StateTextDisplay']/fieldset/div[2]"));
			String o=residing.getText();
			System.out.println(o);	
			BaseTest.getScreenshot(driver, "residing state popup");
			
			
			
		try {
			Thread.sleep(4000);

			BaseTest.click(rp.getResidingstate());
		driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
		BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 6)+"')]")));
		} catch (Exception e) {
			System.out.println("no exception");
		}
			
			try {
				Thread.sleep(4000);
				WebElement ref=driver.findElement(By.xpath("//*[@id='RESIDINGSTATETXT']"));
				ref.sendKeys(BaseTest.getExcelData("Sheet3", 1, 6));
			} catch (Exception e) {
				System.out.println("no exceptions");
			}
			
			
			 Thread.sleep(8000);
			   	JavascriptExecutor js4 = (JavascriptExecutor)driver;
			   	  WebElement edi4= driver.findElement(By.xpath("//*[@id='home-footer']/div[1]"));
				  	  js4.executeScript("arguments[0].scrollIntoView(true);",edi4);
			BaseTest.click(rp.getContinuebutton2());
			WebElement residingcity=driver.findElement(By.xpath("//*[@id='CityInputBox']/fieldset/div[2]"));
			String p=residingcity.getText();
			System.out.println(p);	
			
			BaseTest.getScreenshot(driver, "residing city popup");
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getResidingcity());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 7)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no exception");
			}
			
			try {	
				Thread.sleep(4000);
				WebElement ref1=driver.findElement(By.xpath("//*[@id='RESIDINGCITYTEXT']"));
				ref1.sendKeys(BaseTest.getExcelData("Sheet3", 1, 7));
				
			} catch (Exception e) {
				System.out.println("no exception");
			}
			
			//citizenship
			
			try {
				Thread.sleep(4000);

				BaseTest.click(rp.getCitizenship());
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 8)+"')]")));
			} catch (Exception e) {
				System.out.println("no exception");
			}
			//residing status
			try {
				 Thread.sleep(8000);
				   	JavascriptExecutor js41 = (JavascriptExecutor)driver;
				   	  WebElement edi41= driver.findElement(By.xpath("//*[@id='home-footer']/div[1]"));
					  	  js41.executeScript("arguments[0].scrollIntoView(true);",edi41);
				BaseTest.click(rp.getContinuebutton2());
				WebElement residingcity1=driver.findElement(By.xpath("//*[@id='Resident_status']/fieldset/div[2]"));
				String p1=residingcity1.getText();
				System.out.println(p1);	
				
			} catch (Exception e) {
				System.out.println("no residing status");
			}
			
			try {
				Thread.sleep(4000);

				BaseTest.click(rp.getResidingstatus());
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 9)+"')]")));
			} catch (Exception e) {
				System.out.println("no exception");
			}
			
			 Thread.sleep(8000);
			   	JavascriptExecutor js5 = (JavascriptExecutor)driver;
			   	  WebElement edi5= driver.findElement(By.xpath("//*[@id='home-footer']/div[1]"));
				  	  js5.executeScript("arguments[0].scrollIntoView(true);",edi5);
			BaseTest.click(rp.getContinuebutton2());
			
			////////////page3///////////
			Thread.sleep(8000);
		   	JavascriptExecutor js6 = (JavascriptExecutor)driver;
		   	  WebElement edi6= driver.findElement(By.xpath("//*[@id='continuebutton']"));
			  	  js6.executeScript("arguments[0].scrollIntoView(true);",edi6);
			  	  Thread.sleep(4000);
		BaseTest.click(rp.getContinuebutton3());
			
			WebElement height=driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[1]/div[2]"));
			String q=height.getText();
			System.out.println(q);	
			BaseTest.getScreenshot(driver, "height popup");
			
			BaseTest.click(rp.getHeight());
			Thread.sleep(5000);
	        List<WebElement> heigt = driver.findElements(By.xpath("//div[@class='dww dwrc']//ul//li"));
	        int z = heigt.size();
	        System.out.println(a);

	        for (int x = 0; x <=22; x++) {

	        //    heigt.get(i).sendKeys("4 ft 2 in / 127 cm");
    Actions mn= new Actions(driver);
	mn.moveToElement(heigt.get(x)).click().build().perform();
	                Thread.sleep(1000);
	           /*    actions.click();
	        //      actions.sendKeys(" ");
	                actions.build().perform();*/

	        } 
			
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[1]")).click();
			
			BaseTest.click(rp.getContinuebutton3());
			WebElement physical=driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[2]/div[2]/div[2]"));
			String r=physical.getText();
			System.out.println(r);	
			BaseTest.getScreenshot(driver, "physical status popup");
			
			BaseTest.click(rp.getPhysicalstatus());
			
			Thread.sleep(4000);
			JavascriptExecutor js12 = (JavascriptExecutor)driver;
		   	  WebElement edi12= driver.findElement(By.xpath("//*[@id='continuebutton']"));
			  	  js12.executeScript("arguments[0].scrollIntoView(true);",edi12);
			  	  Thread.sleep(4000);
			BaseTest.click(rp.getContinuebutton3());
			WebElement education=driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[3]/div[2]"));
			String s=education.getText();
			System.out.println(s);	
			BaseTest.getScreenshot(driver, "education popup");
			
			BaseTest.click(rp.getEducation());
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 10)+"')]")));
			
			
			Thread.sleep(4000);
			JavascriptExecutor js13 = (JavascriptExecutor)driver;
		   	  WebElement edi13= driver.findElement(By.xpath("//*[@id='continuebutton']"));
			  	  js13.executeScript("arguments[0].scrollIntoView(true);",edi13);
			BaseTest.click(rp.getContinuebutton3());
			WebElement employedin=driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[4]/div[2]/div[2]"));
			String t=employedin.getText();
			System.out.println(t);	
			BaseTest.getScreenshot(driver, "employedin popup");
			
			
			BaseTest.click(rp.getEmployedinworking());
			
			BaseTest.click(rp.getContinuebutton3());
			WebElement occupation=driver.findElement(By.xpath("//*[@id='fieldOccupation']/div[2]"));
			String u=occupation.getText();
			System.out.println(u);	
			BaseTest.getScreenshot(driver, "occupation popup");
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getEmployedin());
				
				BaseTest.click(rp.getOccupation());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 11)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no exception");
			}
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getEmployedinworking());
				
				BaseTest.click(rp.getOccupation());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 12)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no exception");
			}
			
			Thread.sleep(4000);
			JavascriptExecutor js14 = (JavascriptExecutor)driver;
		   	  WebElement edi14= driver.findElement(By.xpath("//*[@id='continuebutton']"));
			  	  js14.executeScript("arguments[0].scrollIntoView(true);",edi14);
			BaseTest.click(rp.getContinuebutton3());
			WebElement rs=driver.findElement(By.xpath("//*[@id='fieldCurrencyType']/div[2]"));
			String w=rs.getText();
			System.out.println(w);	
			BaseTest.getScreenshot(driver, "rs popup");
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getRs());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 13)+"')]")));
				
				Thread.sleep(4000);
				BaseTest.click(rp.getIncome());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 14)+"')]")));
					

			} catch (Exception e) {
				System.out.println("no exception");
			}
			
			try {
			
				Thread.sleep(4000);
				BaseTest.click(rp.getRs());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 15)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no exceptions");
			}
			try {

				Thread.sleep(4000);
				WebElement ref1=driver.findElement(By.xpath("//input[@placeholder='Enter Salary']"));
				Thread.sleep(4000);
				ref1.sendKeys("54545");
				
			
			} catch (Exception e) {
				System.out.println("no exception");
			}
			
			Thread.sleep(4000);
			JavascriptExecutor js20 = (JavascriptExecutor)driver;
		   	  WebElement edi20= driver.findElement(By.xpath("//*[@id='continuebutton']"));
		   	js20.executeScript("arguments[0].scrollIntoView(true);",edi20);
			BaseTest.click(rp.getContinuebutton3());
				
			Thread.sleep(4000);
			WebElement ref=driver.findElement(By.xpath("//*[@id='INCOMETEXTVALUES']"));
			String abc=ref.getText();
			System.out.println(abc);
			BaseTest.getScreenshot(driver, "Rs permonth popup");
			Thread.sleep(4000);
			JavascriptExecutor js201 = (JavascriptExecutor)driver;
		   	  WebElement edi201= driver.findElement(By.xpath("//*[@id='continuebutton']"));
		   	js201.executeScript("arguments[0].scrollIntoView(true);",edi201);
			BaseTest.click(rp.getContinuebutton3());
			WebElement familystatus=driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[8]/div[2]/div[2]"));
			String x=familystatus.getText();
			System.out.println(x);	
			BaseTest.getScreenshot(driver, "familystatus popup");
			
			BaseTest.click(rp.getFamilystatus());
			
			Thread.sleep(4000);
			JavascriptExecutor js21 = (JavascriptExecutor)driver;
		   	  WebElement edi21= driver.findElement(By.xpath("//*[@id='continuebutton']"));
		   	js21.executeScript("arguments[0].scrollIntoView(true);",edi21);
			BaseTest.click(rp.getContinuebutton3());
			
			WebElement familytype=driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[9]/div[2]/div[2]"));
			String y=familytype.getText();
			System.out.println(y);	
			BaseTest.getScreenshot(driver, "familytype popup");
			BaseTest.click(rp.getFamilytype());
			
		
			
			Thread.sleep(4000);
			JavascriptExecutor js22 = (JavascriptExecutor)driver;
		   	  WebElement edi22= driver.findElement(By.xpath("//*[@id='continuebutton']"));
		   	js22.executeScript("arguments[0].scrollIntoView(true);",edi22);
			BaseTest.click(rp.getContinuebutton3());
			WebElement familyvalue=driver.findElement(By.xpath("//*[@id='CBSRegistration3']/fieldset[10]/div[2]/div[2]"));
			String y2=familyvalue.getText();
			System.out.println(y2);	
			BaseTest.getScreenshot(driver, "familyvalue popup");
			
			BaseTest.click(rp.getFamilyvalues());
			
			Thread.sleep(4000);
			JavascriptExecutor js23 = (JavascriptExecutor)driver;
		   	  WebElement edi23= driver.findElement(By.xpath("//*[@id='continuebutton']"));
		   	js23.executeScript("arguments[0].scrollIntoView(true);",edi23);
		   	
		   	///muslim matri
		   	
		   	try {
				Thread.sleep(4000);
				BaseTest.click(rp.getEthinicity());
				
				Thread.sleep(4000);
				Actions acc921 = new Actions(driver);
				WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
				acc921.doubleClick(ma41).perform();

				Thread.sleep(6000);
				
				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 16)+"')]")));
				
			} catch (Exception e2) {
				System.out.println("no ethinicity");
			}

			try {
				Thread.sleep(4000);
			    BaseTest.click(rp.getReligiousvalue());
				
				Thread.sleep(4000);
				Actions acc921 = new Actions(driver);
				WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
				acc921.doubleClick(ma41).perform();
				
				Thread.sleep(6000);
				
				  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 17)+"')]")));
				
			} catch (Exception e2) {
				System.out.println("no religiousvalue");
			}
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getDressofmodestry());
			} catch (Exception e2) {
				System.out.println("no dress of modestry");
			}
			
			try {
				Thread.sleep(4000);
				BaseTest.click(rp.getReadquran());
			} catch (Exception e2) {
				System.out.println("no Read quran");
			}
			
//			try {
//				Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='GOTHRAM']")).click();
//			Thread.sleep(4000);
//			Actions acc921 = new Actions(driver);
//			WebElement ma41=driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']"));
//			acc921.doubleClick(ma41).perform();
//			
//			Thread.sleep(6000);
//			
//			  BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 12)+"')]")));
//			
//				
//			} catch (Exception e2) {
//				System.out.println("no gothram");
//			}
			//////muslim matri/////////
		   	
		   	try {
		   
		   		Thread.sleep(4000);
				JavascriptExecutor js231 = (JavascriptExecutor)driver;
			   	  WebElement edi231= driver.findElement(By.id("ABOUTME"));
			   	js231.executeScript("arguments[0].scrollIntoView(true);",edi231);
			   	
		   		Thread.sleep(4000);
			   	WebElement aboutme=driver.findElement(By.id("ABOUTME"));
				String y21 = aboutme.getText();
			System.out.println(y21);
				
				System.out.println(y21);
			} catch (Exception e) {
				System.out.println("no element1");
			}
		   		
			try {
				Thread.sleep(4000);
				JavascriptExecutor js231 = (JavascriptExecutor)driver;
			   	  WebElement edi231= driver.findElement(By.xpath("//*[@id='fieldabtme']/div[2]"));
			   	js231.executeScript("arguments[0].scrollIntoView(true);",edi231);
			   	
		   		Thread.sleep(4000);
			   	WebElement aboutme=driver.findElement(By.xpath("//*[@id='fieldabtme']/div[2]"));
				String y21=aboutme.getText();
				System.out.println(y21);
			} catch (Exception e) {
				System.out.println("no element2");
			}
			
		 	try {
		 		Thread.sleep(4000);
				JavascriptExecutor js231 = (JavascriptExecutor)driver;
			   	  WebElement edi231= driver.findElement(By.xpath("//*[@id='fieldabtme']"));
			   	js231.executeScript("arguments[0].scrollIntoView(true);",edi231);
			   	
		   		Thread.sleep(4000);
			   	WebElement aboutme=driver.findElement(By.xpath("//*[@id='fieldabtme']"));
				String y21=aboutme.getText();
				System.out.println(y21);
			} catch (Exception e) {
				System.out.println("no element3");
			}
			
			Thread.sleep(4000);
			BaseTest.click(rp.getContinuebutton3());
			
			Thread.sleep(4000);
			BaseTest.click(rp.getStar());
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 19)+"')]")));
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='RAASI']"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
				Thread.sleep(4000);
				BaseTest.click(rp.getRaasi());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 20)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no Rassi 1");
			}
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='CBSRegistration4']/fieldset[2]/div"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
				driver.findElement(By.xpath("//*[@id='CBSRegistration4']/fieldset[2]/div")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 20)+"')]")));
			} catch (Exception e) {
				System.out.println("no raasi 2");
			}
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='CBSRegistration4']/fieldset[2]/div/div"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
				Thread.sleep(4000);
				driver.findElement(By.xpath("//*[@id='CBSRegistration4']/fieldset[2]/div/div")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 20)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no raasi3");
			}
			
			
			
			Thread.sleep(4000);
			WebElement gothra=driver.findElement(By.xpath("//*[@id='GOTHRA_TXT']"));
			gothra.sendKeys("siva");
			
			BaseTest.click(rp.getDhosam());
			
			BaseTest.click(rp.getTimeofbirth());
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/span[1]")).click();
			
			BaseTest.click(rp.getCountryofbirth());
			driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
			BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 21)+"')]")));
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='BirthStateDisplay']/fieldset/div"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
				BaseTest.click(rp.getStateofbirth());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 22)+"')]")));
			} catch (Exception e) {
				System.out.println("no state1");
			}
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='BIRTHSTATE']"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
			   	driver.findElement(By.xpath("//*[@id='BIRTHSTATE']")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 22)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no state 2");
			}
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='BirthStateDisplay']/fieldset/div/div"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
				driver.findElement(By.xpath("//*[@id='BirthStateDisplay']/fieldset/div/div")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 22)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no state 3");
			}
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div)[1]"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
			   	BaseTest.click(rp.getCityofbirth());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 23)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no city 1");
			}
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div)[1]"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
			   	driver.findElement(By.xpath("//*[@id='BIRTHCITY']")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 23)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no city 2");
			}
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div/div)[1]"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
			   	driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div/div)[1]")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 23)+"')]")));
				
			} catch (Exception e) {
				System.out.println("no city 3");
			}
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div)[2]"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
				BaseTest.click(rp.getChartstyle());
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 24)+"')]")));
				
				
			} catch (Exception e) {
				System.out.println("no chartstyle1");
			}
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("//*[@id='chartstyle']"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
				driver.findElement(By.xpath("//*[@id='chartstyle']")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 24)+"')]")));
				
				
			} catch (Exception e) {
				System.out.println("no chartstyle2");
			}
			
			try {
				Thread.sleep(4000);
				JavascriptExecutor js25 = (JavascriptExecutor)driver;
			   	  WebElement edi25= driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div)[2]"));
			   	js25.executeScript("arguments[0].scrollIntoView(true);",edi25);
				driver.findElement(By.xpath("(//*[@id='CitySelectBox']/fieldset/div)[2]")).click();
				driver.findElement(By.xpath("//*[@id='RegPanelSearchvalue']")).click();
				BaseTest.click(driver.findElement(By.xpath("//li[contains(text(),'"+getExcelData("Sheet3", 1, 24)+"')]")));
				
				
			} catch (Exception e) {
				System.out.println("no chartstyle3");
			}
			
			Thread.sleep(4000);
			BaseTest.click(rp.getContinuebutton());
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
	
	
	
	
	
	
	
	
}           