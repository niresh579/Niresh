package Basepack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Base1{
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


     public static void sk(WebElement element, String Value) {
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


//////////////////////        Screen SHot 
//////////////////////////////////////
     public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

         //Convert web driver object to TakeScreenshot

         TakesScreenshot scrShot =((TakesScreenshot)webdriver);

         //Call getScreenshotAs method to create image file

                 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

             //Move image file to new destinationC:\Users\CBSTEsting\eclipse-workspace\ArtifMatrimony\src\test\java\Screenshot

                 File DestFile=new File("C:\\Users\\CBSTEsting\\eclipse-workspace\\ArtifMatrimony\\src\\test\\java\\Screenshot"+fileWithPath+".png");

                 //Copy file at destination

                 FileUtils.copyFile(SrcFile, DestFile); 
     }


     //Creating a method getScreenshot and passing two parameters
     //driver and screenshotName
     public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
                     //below line is just to append the date format with 
//the screenshot name to avoid duplicate names
                    
    	 TakesScreenshot ts = (TakesScreenshot) driver;
	      File source = ts.getScreenshotAs(OutputType.FILE);
	      File finalDestination = new File("E:\\ScreenShot\\"+".png");
	      FileUtils.copyFile(source, finalDestination);
		return screenshotName;
	      
     }
     


                              //////////    Excel    COde 
///////////////////////

     public static int getCellCount(String sheetName) throws Throwable {
         FileInputStream fis = new FileInputStream("C:\\Users\\CBS Testing\\workspace\\Niresh\\cmsnew\\excel\\Rasi.xlsx");
      Workbook wb = WorkbookFactory.create(fis);
     Sheet sh = wb.getSheet(sheetName);
     Row row = sh.getRow(0);
     int cell = row.getLastCellNum();
     return cell;
     }
       public static String getExcelData(String sheetName, int rowNum, 
int colNum) throws Throwable{
     FileInputStream fis = new FileInputStream("C:\\Users\\CBSTEsting\\eclipse-workspace\\ArtifMatrimony\\Excel\\Star.xlsx");
           Workbook wb = WorkbookFactory.create(fis);
           Sheet sh = wb.getSheet(sheetName);
           Row row = sh.getRow(rowNum);
           String data = row.getCell(colNum).getStringCellValue();
           wb.close();
     return data;
     }


     public static int getExcelRandomRowNum(String sheetName) throws 
Throwable{
     FileInputStream fis = new FileInputStream("C:\\Users\\CBSTEsting\\eclipse-workspace\\ArtifMatrimony\\Excel\\Star.xlsx");
           Workbook wb = WorkbookFactory.create(fis);
           Sheet sh = wb.getSheet(sheetName);
           Random rand = new Random();
           int rowNum = rand.nextInt(sh.getLastRowNum());
           return rowNum;
     }
     public static String setExcelData(String sheetName, int rowNum, int 
    		 colNum,String data) throws Throwable{
    		     FileInputStream fis = new FileInputStream("C:\\Users\\CBSTEsting\\eclipse-workspace\\ArtifMatrimony\\Excel\\Pricerate.xlsx");
    		           Workbook wb = WorkbookFactory.create(fis);
    		           Sheet sh = wb.getSheet(sheetName);
    		           Row row = sh.getRow(rowNum);
    		           Cell cel = row.createCell(colNum);
    		           cel.setCellValue(data);
    		           FileOutputStream fos = new FileOutputStream("C:\\Users\\CBSTEsting\\eclipse-workspace\\ArtifMatrimony\\Excel\\Pricerate.xlsx");
    		     wb.write(fos);
    		     wb.close();
    		 return data; 
     }
     public static int getRowCount(String sheetName) throws Throwable {
     FileInputStream fis = new FileInputStream("C:\\Users\\CBSTEsting\\eclipse-workspace\\ArtifMatrimony\\Excel\\Star.xlsx");
           Workbook wb = WorkbookFactory.create(fis);
           int rowIndex = wb.getSheet(sheetName).getLastRowNum();
           return rowIndex;
     }

     public static void setExcelDataInteg(String sheetName, int rowNum, 
int colNum,int data) throws Throwable{
     FileInputStream fis = new FileInputStream("C:\\Users\\CBSTesting\\workspace\\Vijay\\cmsnew\\excel\\Data.xlsx");
           Workbook wb = WorkbookFactory.create(fis);
           Sheet sh = wb.getSheet(sheetName);
           Row row = sh.getRow(rowNum);
           Cell cel = row.createCell(colNum);
           cel.setCellValue(data);
           FileOutputStream fos = new FileOutputStream("C:\\Users\\CBSTesting\\workspace\\Vijay\\cmsnew\\excel\\Data.xlsx");
     wb.write(fos);
     wb.close();
     
     


     //}



//     public static  String  randomSelection(WebDriver driver){
//
//     List<WebElement> links = driver.findElements(By.cssSelector("htmlbody div.innerdiv.margin-reset div.bgclr2 div.pad7 
//div.bgclr5.pad10.smalltxt form dl.nomargpad 
//dd.fleft.padb5.mediumhdrtxt.domainlist a.clr4"));
//     List<WebElement> visited = new ArrayList<WebElement>();
//     WebElement random = links.get(new Random().nextInt(links.size()));
//     String randomId=random.getText();
//     System.out.println("No.of ID's.. "+links.size());
//     if( !visited.contains(random))
//     {
//      random.click();
//       visited.add(random);
        //driver.navigate().back();
     //}
   //  return randomId;
     }


	public static void sk1(WebElement element , String value) {
		element.sendKeys(value);
   		
	}


			
	}








