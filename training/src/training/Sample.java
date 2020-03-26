package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\drivernew1\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://localhost:8080/login?from=%2F");
		 Thread.sleep(4000);
		 WebElement g=driver.findElement(By.id("j_username"));
		 g.sendKeys("niresh");
		 
		 
	}

}
