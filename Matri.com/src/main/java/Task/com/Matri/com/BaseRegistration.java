package Task.com.Matri.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BaseRegistration {
	public static WebDriver driver;
	public static void setText(WebElement element, String string) {
		//cleartextbox(element);
		element.sendKeys(string);

	}
	
	
	public static void cleartextbox(WebElement element) {
		element.clear();

	}

	public static void btnclick(WebElement element) {
		element.click();
	}

	public static void closeApp(WebDriver driver) {
		driver.close();

	}
	public static String getAttri(WebElement element,String value) {
		return element.getAttribute(value);
		
		

	}
	 public static void setAttributeValue(WebElement elem, String value){
		 JavascriptExecutor    js = (JavascriptExecutor) driver; 

		    String scriptSetAttrValue = "arguments[0].setAttribute(arguments[1],arguments[2])";

		    js.executeScript(scriptSetAttrValue, elem, "value", value);

		}
	public static void drbdwnvalueselect(WebElement element, String name) {

		Select s = new Select(element);
		//s.selectByValue(name);
s.selectByVisibleText(name);
	}

	public static void radioButton(WebElement element) {
		element.click();
	}
	public static String gettext(WebElement element ) {
		 
		return element.getText();

	}


	// public static String getdata(int rownum, int cellno) throws Throwable{
	//
	// File excellocation=new
	// File("G:\\Santhosh\\Workspace\\HelloMaven\\Excel\\excel.xlsx");
	// FileInputStream stream=new FileInputStream(excellocation);
	//
	// Workbook book=new XSSFWorkbook(stream);
	// Sheet sheet = book.getSheet("datas");
	// int rowcount = sheet.getPhysicalNumberOfRows();
	// Row row=sheet.getRow(rowcount);
	// int countCells = row.getPhysicalNumberOfCells();
	// for (int i = 0; i < countCells; i++) {
	//
	// Cell cell = row.getCell(i);
	// int k=cell.getCellType();
	// if(k==1) {
	// String name= cell.getStringCellValue();
	// }else if(k==0) {
	//
	// double d = cell.getNumericCellValue();
	// long l = (long) d;
	// name =String .valueOf(l) ;
	// }
	// }
	//
	//
	// return name;

	// }

	public static List<HashMap<String, String>> readValueFromExcelSheet()  throws NullPointerException  {
		List<HashMap<String, String>> mapDatasList = new ArrayList<HashMap<String, String>>();
		try {
			File excelLocaltion = new File("C:\\Users\\Admin\\workspace\\CCEOCheck\\Excel\\New Microsoft Excel Workbook1111.xlsx");

			String sheetName = "Sheet1";

			FileInputStream f = new FileInputStream(excelLocaltion.getAbsolutePath());
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
