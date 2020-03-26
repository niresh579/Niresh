
package ref.referenecepg;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Logic {
WebDriver driver;
String driverExecutablePath = "C:\\Users\\CBS Testing\\workspace\\Niresh\\referenecepg\\driver\\chromedriver.exe";

ExtentReports report;
ExtentTest logger;

@BeforeTest
public void setup() {
System.setProperty("webdriver.chrome.driver", driverExecutablePath);
driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
}

@Test
public void matrixid() throws InterruptedException {
System.out.println("login");

driver.get("https://profile.tamilmatrimony.com/login/login.php");
driver.manage().window().maximize();

// WebDriver driver = Base.getDriver("https://www.bharatmatrimony.com");
Pom p = new Pom(driver);
Random rand = new Random();
int low = 10000;
int high = 90000;
int nn = rand.nextInt(high - low) + low;
report = new ExtentReports("D:\\BmDesktpSanity\\test-output\\login.html", true);
logger = report.startTest("login");
logger.log(LogStatus.PASS, "login process started useing matid");
Base.cleartextbox(p.getStglog());
Base.setText(p.getStglog(), "M3507028");

Base.btnclick(p.getStgpass());
Base.setText(p.getStgpass(), "test4bm");
Thread.sleep(2000);
Base.radioButton(p.getStglogin());
logger.log(LogStatus.PASS, "successfuly navigate to home page");
Thread.sleep(5000);
try {
driver.findElement(By.xpath("//a[@class='fright skiptxtbtn']"))
.click();

} catch (Exception e) {
System.out.println("no popup");
}
Thread.sleep(5000);
try {
driver.findElement(By.xpath("//*[@id='popbox']/div/a")).click();

} catch (Exception e) {
System.out.println("no popup");
}
try {
driver.findElement(By.xpath("//*[@id='popbox']/a/img")).click();
} catch (Exception e) {
System.out.println("no popup");
}
Thread.sleep(5000);
JavascriptExecutor jse = (JavascriptExecutor) driver;
driver.navigate().refresh();
Base.action( driver,driver.findElement(By.xpath("//*[@id='fixed-topnavbg']/div/ul/div[1]/li[4]/div/div[1]/a")));
driver.findElement(By.xpath("//*[@id='fixed-topnavbg']/div/ul/div[1]/li[4]/div/div[2]/a[2]")).click();
for (int i = 1; i <= 1500; i++) {

Thread.sleep(5000);
for (int j = 1; j <=10; j++) {
try{
Thread.sleep(3000);

driver.findElement(By.xpath("//*[@id='srhactive-btns']/div[1]/div[2]/span" + "["+ j + "]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id='cboxClose']")).click();
}
catch(Exception e){

}
}


}
driver.navigate().refresh();

}}
