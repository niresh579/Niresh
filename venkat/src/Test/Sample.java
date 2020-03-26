package Test;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CBS Testing\\workspace\\Niresh\\venkat\\drivernew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("nireshnirea");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("cbstest");
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		
		
	}

}
