package training;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;





public class Adactin {
	public static void main(String[] args) throws InterruptedException, AWTException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CBS Testing\\workspace\\Niresh\\Class\\drivernew1\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung mobile phone ");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(6000);
		WebElement firstone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		String first = firstone.getText();
		System.out.println("First page phone = " + first);
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).click();
		
		
		
		WebElement scondtone = driver.findElement(By.xpath("//span[@class=\"a-size-large product-title-word-break\"]"));
		String second = scondtone.getText();
		System.out.println("second page phone = " + second);
		Thread.sleep(6000);
		
		Assert.assertEquals(first, second);
		
		if (first.equalsIgnoreCase(second)) {
			System.out.println("Pass");
			
		}else {
			System.out.println("Fail");
		}
		
		
		
	   	  
		
		
	}
	
}
