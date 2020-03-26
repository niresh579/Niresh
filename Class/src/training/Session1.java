package training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Session1 {
	public static void main(String[] args) throws InterruptedException, IOException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CBS Testing\\workspace\\Niresh\\Class\\driverlatest\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		FileInputStream fis = new FileInputStream("E:\\Book1.xls");
//		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		 XSSFSheet sheet = workbook.getSheet("Sheet1");
//		 Row row = sheet.createRow(1);
//		 Cell cell = row.createCell(1);
//		 cell.setCellType(cell.CELL_TYPE_STRING);
//		 cell.setCellValue("SoftwareTestingMaterial.com");
//		 FileOutputStream fos = new FileOutputStream("C:\\Users\\CBS Testing\\workspace\\Niresh\\Class\\data\\Rasi.xlsx");
//		 workbook.write(fos);
//		 fos.close();
//		 System.out.println("END OF WRITING DATA IN EXCEL");
//		
		
		
		
			
		
		
//		driver.get("https://www.toolsqa.com/selenium-webdriver/actions-class-in-selenium/");
//		driver.manage().window().maximize();
//		Thread.sleep(4000);
//		WebElement add=driver.findElement(By.xpath("(//span[contains(text(),'Tutorial')])[1]"));
//		Actions acc=new Actions(driver);
//		acc.moveToElement(add).build().perform();
//		WebElement tut=driver.findElement(By.xpath("(//span[contains(text(),'Cross Browser Testing Tools')])[1]"));
//		
//		acc.moveToElement(tut).build().perform();
//		WebElement cross=driver.findElement(By.xpath("(//*[@id='primary-menu']/li[2]/ul/li[4]/ul/li[2]/a/span/span)[1]"));
//		acc.moveToElement(cross).build().perform();
//		cross.click();
//		Thread.sleep(5000);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		WebElement fb=driver.findElement(By.xpath("//*[@id=\"post-35036\"]/div[3]/div[2]/a[1]"));
//		js.executeScript("arguments[0].scrollIntoView(true);", fb);
//		Thread.sleep(5000);
//		JavascriptExecutor js1=(JavascriptExecutor)driver;
//		WebElement fb1=driver.findElement(By.xpath("(//span[contains(text(),'Tutorial')])[1]"));
//		js1.executeScript("arguments[0].scrollIntoView(false);", fb1);
//		
		 
		 
//		 File loc= new File("c\\:user\\");
//		 String sheetname="Sheet";
//		 
//		 FileInputStream f=new FileInputStream(loc);
//		 Workbook w=new XSSFWorkbook(f);
//		 Sheet s=w.getSheet(sheetname);
//		 Row r=s.getRow(0);
//		 for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
//			Row currentrow=s.getRow(0);
//		}
		 
		String myText="Some Multiline Text....";
		myText=myText.replace("\n","\13");
		 
	System.out.println(myText+"\r\n");
		
		
		
		System.out.println("hai\r\nhow\rare\ru");
		
		 
	}
	

}
