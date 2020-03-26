package training;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Adactin {
	public static void main(String[] args) throws InterruptedException, AWTException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CBS Testing\\workspace\\Niresh\\Class\\drivernew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement gh=driver.findElement(By.xpath("//*[@id='username']"));
		gh.sendKeys("nireshnirea");
		Thread.sleep(4000);
		WebElement gh1=driver.findElement(By.xpath("//*[@id='password']"));
		gh1.sendKeys("cbstest");
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
		driver.findElement(By.xpath("//*[@id='location']")).click();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
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
		
		
		WebElement g=driver.findElement(By.xpath("//*[@id='room_nos']"));
		Select s=new Select(g);
		s.selectByValue("5");

		WebElement g1=driver.findElement(By.xpath("//*[@id='adult_room']"));
		s.selectByValue("2");
		
		driver.findElement(By.xpath("//*[@id='Submit']")).click();
		
		WebElement b=driver.findElement(By.xpath("//*[@id='radiobutton_2']"));
		//b.click();
		
		if (b.isEnabled()) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	
//		Select s=new Select(loc);
//		s.selectByValue("Paris");
		////screenshot///////
		
		
		
		
		
		
	}
	
}
