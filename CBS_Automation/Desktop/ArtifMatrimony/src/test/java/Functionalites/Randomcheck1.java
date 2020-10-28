
package Functionalites;

import java.net.MalformedURLException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Basepack.Base3;

import PomPack.RandomidcheckPOM;

public class Randomcheck1 extends Base3{
    public static WebDriver driver;
    String driverExecutablePath = "C:\\Users\\CBSTEsting\\eclipse-workspace\\ArtifMatrimony\\driver\\chromedriver.exe";
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


  }
  @Test
  public void setUp2()throws Throwable  {
      RandomidcheckPOM rps = new RandomidcheckPOM(driver);
      driver.get("https://www.communitymatrimony.com");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        WebElement email = driver.findElement(By.xpath("//*[@id='login-btn']/a"));
        email.click();
        Thread.sleep(4000);
        WebElement username = driver.findElement(By.xpath("//*[@id='idEmail']"));
        username.sendKeys("nireshk750@gmail.com");
      // sk1(rps.getUsername(),"srivijayaragavan30@gmail.com");
        Thread.sleep(4000);
        WebElement e1=driver.findElement(By.xpath("//*[@id='password1']"));
        Actions a1=new Actions(driver);
        a1.sendKeys(e1,"cbstest").build().perform();
        Thread.sleep(4000);
        WebElement login1 = driver.findElement(By.xpath("//*[@id=\\\"login-button\\\"]"));
        login1.click();
        Thread.sleep(4000);
//        List<WebElement> allProducts = driver.findElements(By.xpath("//dt[@class='fleft mediumhdrtxt domainlist']"));
//          Random rand = new Random();
//          Thread.sleep(4000);
//        int randprod = rand.nextInt(allProducts.size());
//        Thread.sleep(4000);
//        allProducts.get(randprod).click();


  }

    @AfterMethod
    public void Randommethod() throws InterruptedException {
        Random rand = new Random();
        List<WebElement> li = driver.findElements(By.xpath("//a[@class='ui-link']"));
        Thread.sleep(4000);
        int randprod = rand.nextInt(li.size());
        Thread.sleep(4000);
    li.get(randprod).click();
    Thread.sleep(20000);
    WebElement menu = driver.findElement(By.xpath("//*[@id='mainsidemenu']/div/ion-header/ion-navbar/div[2]/ion-grid/ion-row/ion-col[5]/a/span"));
    menu.click();
    Thread.sleep(8000);
    WebElement setting = driver.findElement(By.xpath("(//*[@id='mainsidemenu']/div/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list[7]/ion-item/div[1]/div/ion-label"));
    setting.click();
    Thread.sleep(4000);
    WebElement logout = driver.findElement(By.xpath("(/html/body/ion-app/ion-modal/div/settingpopup/ion-content/div[2]/ion-grid/ion-row/ion-col/ion-list/ion-item[5]/div[1]/div/ion-label"));
    logout.click();
try {
	
} catch (Exception e) {
System.out.println("mail id expire");
}
    }
  }


