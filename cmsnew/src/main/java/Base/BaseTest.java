	package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest {
	static WebDriver driver;
	public static ExtentReports extent;
	    public static ExtentTest test;
	    public static String domain;
	    public static String error;
	    public static String expt,ex,exp,e,expti,exptio,status;
	    String html =  "MyReport.html";


	public static void click(WebElement element) {
		element.click();
	}


	public static void clear(WebElement element) {
	element.clear();
	}


	public static void typeData(WebElement element, String Value) {
	element.sendKeys(Value);
	}
	////////////////Drop Down Base//////////////////

	public static void select_string(WebElement element, String Value) {
	//Select s = new Select(element);
	//s.selectByValue(Value);
	}

	

	public static void select_index(WebElement element, int Value) {
	//Select s = new Select(element);
	//s.selectByIndex(Value);
	}


	public static void select_text(WebElement element, String text) {
	//Select s = new Select(element);
	//s.selectByVisibleText(text);
	}


//////////////////////	    Screen SHot    //////////////////////////////////////


	//Creating a method getScreenshot and passing two parameters
	//driver and screenshotName
	public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
	                //below line is just to append the date format with the screenshot name to avoid duplicate names
	                String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	 TakesScreenshot ts = (TakesScreenshot) driver;
	 File source = ts.getScreenshotAs(OutputType.FILE);
	                //after execution, you could see a folder "FailedTestsScreenshots" under src folder
	 String destination = "C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\screenshots\\editpi\\" +screenshotName+".png";
	 File finalDestination = new File(destination);
	 FileUtils.copyFile(source, finalDestination);
	                //Returns the captured file path
	 return destination;
	}


	                         //////////    Excel    COde   ///////////////////////
	 
	  public static String getExcelData(String sheetName, int rowNum, int colNum) throws Throwable{
	FileInputStream fis = new FileInputStream("C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\excel\\Data.xlsx");
	      Workbook wb = WorkbookFactory.create(fis);
	      Sheet sh = wb.getSheet(sheetName);
	      Row row = sh.getRow(rowNum);
	      String data = row.getCell(colNum).getStringCellValue();
	      wb.close();
	return data;
	}

	  public static int getCellCount(String sheetName) throws Throwable {
		    FileInputStream fis = new FileInputStream("C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\excel\\Data.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(0);
		int cell = row.getLastCellNum();
		return cell;
		} 

	public static int getExcelRandomRowNum(String sheetName) throws Throwable{
	FileInputStream fis = new FileInputStream("C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\excel\\Data.xlsx");
	      Workbook wb = WorkbookFactory.create(fis);
	      Sheet sh = wb.getSheet(sheetName);
	      Random rand = new Random();
	      int rowNum = rand.nextInt(sh.getLastRowNum());
	      return rowNum;
	}
	public static void setExcelData(String sheetName, int rowNum, int colNum,String data) throws Throwable{
	FileInputStream fis = new FileInputStream("C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\excel\\Data.xlsx");
	      Workbook wb = WorkbookFactory.create(fis);
	      Sheet sh = wb.getSheet(sheetName);
	      Row row = sh.getRow(rowNum);
	      Cell cel = row.createCell(colNum);
	      cel.setCellValue(data);
	      FileOutputStream fos = new FileOutputStream("C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\excel\\Data.xlsx");
	wb.write(fos);
	wb.close();
	}
	public static int getRowCount(String sheetName) throws Throwable {
	FileInputStream fis = new FileInputStream("C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\excel\\Data.xlsx");
	      Workbook wb = WorkbookFactory.create(fis);
	      int rowIndex = wb.getSheet(sheetName).getLastRowNum();
	      return rowIndex;
	}

	public static void setExcelDataInteg(String sheetName, int rowNum, int colNum,int data) throws Throwable{
	FileInputStream fis = new FileInputStream("C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\excel\\Data.xlsx");
	      Workbook wb = WorkbookFactory.create(fis);
	      Sheet sh = wb.getSheet(sheetName);
	      Row row = sh.getRow(rowNum);
	      Cell cel = row.createCell(colNum);
	      cel.setCellValue(data);
	      FileOutputStream fos = new FileOutputStream("C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\excel\\Data.xlsx");
	wb.write(fos);
	wb.close();
	
	
	 
	}



	public static  String  randomSelection(WebDriver driver){

	List<WebElement> links = driver.findElements(By.cssSelector("html body div.innerdiv.margin-reset div.bgclr2 div.pad7 div.bgclr5.pad10.smalltxt form dl.nomargpad dd.fleft.padb5.mediumhdrtxt.domainlist a.clr4"));
	List<WebElement> visited = new ArrayList<WebElement>();
	WebElement random = links.get(new Random().nextInt(links.size()));
	String randomId=random.getText();
	System.out.println("No.of ID's.. "+links.size());
	if( !visited.contains(random))
	{
	 random.click();
	  visited.add(random);
	   //driver.navigate().back();
	}
	return randomId;
	}

	public static List<HashMap<String, String>> readValueFromExcelSheet()  throws NullPointerException  {
		List<HashMap<String, String>> mapDatasList = new ArrayList<HashMap<String, String>>();
		try {
			File excelLocaltion = new File("C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\excel\\Data.xlsx");

			String sheetName = "Sheet1";	

			FileInputStream f = new FileInputStream(
					excelLocaltion.getAbsolutePath());
			Workbook w = new XSSFWorkbook(f);
			Sheet sheet = w.getSheet(sheetName);
			Row headerRow = sheet.getRow(0);
			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
				Row currentRow = sheet.getRow(i);
				HashMap<String, String> mapDatas = new HashMap<String, String>();
				for (int j = 0; j < headerRow.getPhysicalNumberOfCells(); j++) {
					Cell currentCell = currentRow.getCell(j);

					switch (currentCell.getCellType()) {
					case Cell.CELL_TYPE_STRING:
						mapDatas.put(headerRow.getCell(j).getStringCellValue(),
								currentCell.getStringCellValue());
						break;
					case Cell.CELL_TYPE_NUMERIC:
						mapDatas.put(headerRow.getCell(j).getStringCellValue(),
								String.valueOf(currentCell
										.getNumericCellValue()));

						break;

					}
				}

				mapDatasList.add(mapDatas);
			}

		} catch (Throwable e) {
			e.printStackTrace();
		}
		return mapDatasList;



	}
	
}
