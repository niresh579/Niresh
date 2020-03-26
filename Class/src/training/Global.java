package training;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class Global {
	  public static void main(String[] args) throws InterruptedException, AWTException {
	        // TODO Auto-generated method stub

	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CBS Testing\\workspace\\Niresh\\Class\\driverlatest\\chromedriver.exe");


	        ChromeOptions options = new ChromeOptions();
	         options.addArguments("--disable-notifications");
	        WebDriver driver=new ChromeDriver(options);
	///////////////////////////////////////////////////////////////////////

	        driver.get("https://www.nepalimatrimony.com/");
	        driver.manage().window().maximize();
	        WebElement profcreatedby=driver.findElement(By.xpath("//*[@id='profile']"));
	        Select st=new Select(profcreatedby);
	        /*Thread.sleep(5000);*/
	        st.selectByValue("5");

	driver.findElement(By.xpath("//*[@id='name']")).sendKeys("priya menon ");
	driver.findElement(By.xpath("//*[@id='hpreg']/div/dl[3]/dd[2]/label[2]")).click();

	        WebElement dob=driver.findElement(By.xpath("//*[@id='dobDay']"));
	        Select date=new Select(dob);
	        date.selectByValue("25");

	        WebElement dobm=driver.findElement(By.xpath("//*[@id='dobMonth']"));
	        Select month=new Select(dobm);
	        month.selectByValue("11");

	        WebElement doby=driver.findElement(By.xpath("//*[@id='dobYear']"));
	        Select year=new Select(doby);
	        year.selectByValue("1990");

	driver.findElement(By.xpath("//*[@id='mStatus4']")).click();

	        WebElement mot=driver.findElement(By.xpath("//*[@id='motherTongue']"));
	        Select Assamese=new Select(mot);
	        Assamese.selectByValue("2");

	        WebElement ctl=driver.findElement(By.xpath("//*[@id='country']"));
	        Select nepal=new Select(ctl);
	        nepal.selectByValue("146");

	        WebElement ctcode=driver.findElement(By.xpath("//*[@id='countryCode']"));
	        Select ccode=new Select(ctcode);
	        ccode.selectByValue("98");

	driver.findElement(By.xpath("//*[@id='mobileNo']")).sendKeys("9790143075");
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("cbstest");
	driver.findElement(By.xpath("//*[@id='hpreg']/div/div/div[3]/input[5]")).click();

	        /*Registration 2 page*/

	         String winHandleBefore = driver.getWindowHandle();
	          for(String winHandle : driver.getWindowHandles()){
	                driver.switchTo().window(winHandle);
	          }


	          Thread.sleep(3500);

	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("avsumagthfhfdthiprasfad@gmail.com");

	driver.findElement(By.xpath("//*[@id='frm']/div[3]/div[2]/dl[5]/dd/label[2]")).click();
	driver.findElement(By.xpath("//*[@id='child_live_status']/dl[1]/dd/label[1]")).click();


	        Thread.sleep(4000);
	WebElement wb= driver.findElement(By.xpath("//span[@id='select2-heightFeet-container']"));
	wb.click();
	//wb.sendKeys("142 cm");
	 
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER); 
	 
	        Thread.sleep(2000);
	     //   WebElement height=driver.findElement(By.xpath("//span[@id='select2-heightFeet-container']"));
//	        Select s=new Select(driver.findElement(By.xpath("//span[@id='select2-heightFeet-container']")));
//	        s.selectByVisibleText("129 cm");

	        
	        

	driver.findElement(By.xpath("//*[@id='placeofbirth']")).sendKeys("uttarpradesh");
	driver.findElement(By.xpath("//*[@id='residingState']")).sendKeys("jarkhand");
	driver.findElement(By.xpath("//*[@id='residingCity']")).sendKeys("rajput");


	    /*    WebElement Citizenship=driver.findElement(By.xpath("//*[@id='select2-citizenship-container']"));
	        Select Citizenshipnepal=new Select(Citizenship);
	        Citizenshipnepal.selectByVisibleText("Nepal");*/




	    } 

}
