//package training;
//
//import java.awt.Robot;
//import java.awt.event.KeyEvent;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Set;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//
//
//
//
//public class DataDriven {
//	public static void main(String[] args) throws IOException {
//		
//		File loc=new File("C:\\Users\\CBS Testing\\workspace\\Niresh\\Class\\data\\Rasi.xlsx");
//		FileInputStream f=new FileInputStream(loc);
//		Workbook w=new XSSFWorkbook(f);
//		Sheet s=w.getSheet("Sheet1");
//		Row r=s.getRow(1);
//		Cell c=r.getCell(1);
//		System.out.println(r);
//		List<WebElement> elementName = driver.findElements(By.LocatorStrategy("LocatorValue"));
//		
//		String parentwindow = driver.getWindowHandle();
//		Set<String> allwindow = driver.getWindowHandles();
//		for (String id : allwindow) {
//			if (!parentwindow.equals(id)) {
//			driver.switchTo().window(id);
//			}
//			
//		}
//		
//		WebElement edi41= driver.findElement(By.xpath("//*[@id='continuebutton']"));
//	   	JavascriptExecutor js41 = (JavascriptExecutor)driver;
//		  	  js41.executeScript("arguments[0].scrollIntoView(true);",edi41);
//
//		  	Robot r=new Robot();
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//			
//			Actions a111=new Actions(driver);
//			a111.moveToElement(edi41).build().perform();
//		
//	}
//
//}
