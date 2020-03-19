package Base;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

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
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest {
	static WebDriver driver;
	public static ExtentReports report;
	    public static ExtentTest logger;
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
	 String destination = "C:\\Users\\CBS Testing\\workspace\\Niresh\\Negative\\screenshots\\" +screenshotName+".png";
	 File finalDestination = new File(destination);
	 FileUtils.copyFile(source, finalDestination);
	                //Returns the captured file path
	 return destination;	
	}


	                         //////////    Excel    COde   ///////////////////////
	 
	  public static String getExcelData(String sheetName, int rowNum, int colNum) throws Throwable{
	FileInputStream fis = new FileInputStream("C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali\\excel\\Registration1.xls");
	      Workbook wb = WorkbookFactory.create(fis);
	      Sheet sh = wb.getSheet(sheetName);
	      Row row = sh.getRow(rowNum);
	      String data = row.getCell(colNum).getStringCellValue();
	      wb.close();
	return data;
	}

	  public static int getExcelData1(String sheetName, int rowNum, int colNum) throws Throwable{
			FileInputStream fis = new FileInputStream("C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali\\excel\\Registration1.xls");
			      Workbook wb = WorkbookFactory.create(fis);
			      Sheet sh = wb.getSheet(sheetName);
			      Row row = sh.getRow(rowNum);
			      int data1 = (int) row.getCell(colNum).getNumericCellValue();
			      wb.close();
			return data1;
			}
	  
	  public static int getCellCount(String sheetName) throws Throwable {
		    FileInputStream fis = new FileInputStream("C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali\\excel\\Registration1.xls");
		 Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(0);
		int cell = row.getLastCellNum();
		return cell;
		} 

	public static int getExcelRandomRowNum(String sheetName) throws Throwable{
	FileInputStream fis = new FileInputStream("C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali\\excel\\Registration1.xls");
	      Workbook wb = WorkbookFactory.create(fis);
	      Sheet sh = wb.getSheet(sheetName);
	      Random rand = new Random();
	      int rowNum = rand.nextInt(sh.getLastRowNum());
	      return rowNum;
	}
	public static void setExcelData(String sheetName, int rowNum, int colNum,String data) throws Throwable{
	FileInputStream fis = new FileInputStream("C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali\\excel\\Registration1.xls");
	      Workbook wb = WorkbookFactory.create(fis);
	      Sheet sh = wb.getSheet(sheetName);
	      Row row = sh.getRow(rowNum);
	      Cell cel = row.createCell(colNum);
	      cel.setCellValue(data);
	      FileOutputStream fos = new FileOutputStream("C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali\\excel\\Registration1.xls");
	wb.write(fos);
	wb.close();
	}
	public static int getRowCount(String sheetName) throws Throwable {
	FileInputStream fis = new FileInputStream("C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali\\excel\\Registration1.xls");
	      Workbook wb = WorkbookFactory.create(fis);
	      int rowIndex = wb.getSheet(sheetName).getLastRowNum();
	      return rowIndex;
	}

	public static void setExcelDataInteg(String sheetName, int rowNum, int colNum,int data) throws Throwable{
	FileInputStream fis = new FileInputStream("C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali\\excel\\Registration1.xls");
	      Workbook wb = WorkbookFactory.create(fis);
	      Sheet sh = wb.getSheet(sheetName);
	      Row row = sh.getRow(rowNum);
	      Cell cel = row.createCell(colNum);
	      cel.setCellValue(data);
	      FileOutputStream fos = new FileOutputStream("C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali\\excel\\Registration1.xls");
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
			File excelLocaltion = new File("C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali\\excel\\Registration1.xls");

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
	

///////////////////////////  SMS CODE   ////////////////////////////////////////
public static void sendVFSms1() throws Exception {
    String message="PASS : CBS-Login-Desktop-Adyar,Chennai";
    String mobileno="918098882244,916302165648,";
    String[] s = mobileno.split(",");
    for (int i = 0; i < s.length; i++) {


    String url = 
"http://api.myvaluefirst.com/psms/servlet/psms.Eservice2";
    URL obj = new URL(url);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();

    //add reuqest header
    con.setRequestMethod("POST");
    //con.setRequestProperty("User-Agent", USER_AGENT);
    con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

    String urlParameters = "data=<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><!DOCTYPE MESSAGE SYSTEM \"http://127.0.0.1/psms/dtd/message.dtd\" ><MESSAGE><USER USERNAME=\"matrimony2\" PASSWORD=\"matrimony02\"/><SMS UDH=\"0\" CODING=\"1\" TEXT=\""+message+"\" PROPERTY=\"0\" ID=\"1\"><ADDRESS FROM=\"CMATRI\" TO=\""+s[i]+"\" SEQ=\"1\" TAG=\"some clientside random data\" /></SMS></MESSAGE>&action=send";

    // Send post request
    con.setDoOutput(true);
    DataOutputStream wr = new DataOutputStream(con.getOutputStream());
    wr.writeBytes(urlParameters);
    wr.flush();
    wr.close();

    int responseCode = con.getResponseCode();
    System.out.println("\nSending 'POST' request to URL : " + url);
    System.out.println("Post parameters : " + urlParameters);
    System.out.println("Response Code : " + responseCode);

    BufferedReader in = new BufferedReader(
            new InputStreamReader(con.getInputStream()));
    String inputLine;
    StringBuffer response = new StringBuffer();

    while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
    }
    in.close();

    //print result
    System.out.println(response.toString());

} 
}
public static void sendVFSms() throws Exception {
    String message="FAIL : CBS_Login-Desktop-Adyar,Chennai";
    		
    String mobileno="918098882244,916302165648";
    String[] s = mobileno.split(",");
    for (int i = 0; i < s.length; i++) {
    String url ="http://api.myvaluefirst.com/psms/servlet/psms.Eservice2";
    URL obj = new URL(url);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();

    //add reuqest header
    con.setRequestMethod("POST");
    //con.setRequestProperty("User-Agent", USER_AGENT);
    con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

    String urlParameters = "data=<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><!DOCTYPE MESSAGE SYSTEM \"http://127.0.0.1/psms/dtd/message.dtd\" ><MESSAGE><USER USERNAME=\"matrimony2\" PASSWORD=\"matrimony02\"/><SMS UDH=\"0\" CODING=\"1\" TEXT=\""+message+"\" PROPERTY=\"0\" ID=\"1\"><ADDRESS FROM=\"CMATRI\" TO=\""+s[i]+"\" SEQ=\"1\" TAG=\"some clientside random data\" /></SMS></MESSAGE>&action=send";

    // Send post request
    con.setDoOutput(true);
    DataOutputStream wr = new DataOutputStream(con.getOutputStream());
    wr.writeBytes(urlParameters);
    wr.flush();
    wr.close();

    int responseCode = con.getResponseCode();
    System.out.println("\nSending 'POST' request to URL : " + url);
    System.out.println("Post parameters : " + urlParameters);
    System.out.println("Response Code : " + responseCode);

    BufferedReader in = new BufferedReader(
            new InputStreamReader(con.getInputStream()));
    String inputLine;
    StringBuffer response = new StringBuffer();

    while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
    }
    in.close();

    //print result
    System.out.println(response.toString());

}
}


/////////////////////////////  Mail   ////////////

public static void reportflush()
{
	report.flush();    	
	final String username = "mohantest.mm@gmail.com";
 final String password = "mohanmmteam";

 Properties props = new Properties();
 props.put("mail.smtp.auth", true);
 props.put("mail.smtp.starttls.enable", true);
 props.put("mail.smtp.host", "smtp.gmail.com");
 props.put("mail.smtp.port", "587");

 Session session = Session.getInstance(props, new javax.mail.Authenticator() {
     protected PasswordAuthentication getPasswordAuthentication() {
         return new PasswordAuthentication(username, password);
     }
 });
 Message message = new MimeMessage(session);

 try {
    
     message.setFrom(new InternetAddress("mohantest.mm@gmail.com"));

     message.setSubject("CBS Desktop Automation Report ");  /// Global Module Content
  
     message.setRecipients(Message.RecipientType.TO,
                 InternetAddress.parse("cbsautomationreport@gmail.com"));  //  Add Email Address To Whom Mail Need to be Send
        //,thanikachalam.thirunanasambandan@matrimony.com                        
     Multipart multipart = new MimeMultipart();

     MimeBodyPart messageBodyPart = new MimeBodyPart();
     messageBodyPart.setText("CBS Automation Report");
     MimeBodyPart attachmentBodyPart = new MimeBodyPart();       
   

     String file = "C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali2\\Report.html";
                     // HtMALReport File Bath  ---   EXtent Report
     String fileName = "CBS-AutomationReport-Desktop";  // Change CBS to Global or Individual Domain
     DataSource source = new FileDataSource(file);
    // messageBodyPart.setDataHandler(new DataHandler(source));
     attachmentBodyPart.setDataHandler(new DataHandler(source));
     attachmentBodyPart.setFileName("Report.html");
   
    
     multipart.addBodyPart(messageBodyPart);
     multipart.addBodyPart(attachmentBodyPart);

     message.setContent(multipart);

     System.out.println("Sending....");

     Transport.send(message);

     System.out.println("Mail Sent Successfully");

 } catch (MessagingException e) {
     e.printStackTrace();
 }      
	
}    

@BeforeSuite
public void htmlReport() {
	
	
    // extent = new ExtentHtmlReporter("C:\\Users\\amuthan\\eclipse-workspace\\com.mobile\\ScreenShot");

	 report=new ExtentReports("C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali2\\Report\\"+html,true);
	 report.loadConfig(new File("C:\\Users\\CBS Testing\\workspace\\Niresh\\Nepali2\\extent-config.xml"));
	 //test=reports.startTest("Android Registeration Test");
  
}




}

