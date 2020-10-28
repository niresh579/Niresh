package BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

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
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("restriction")
public class Base {
	
	public static ExtentReports reports;
    public static ExtentTest test;
    WebDriver driver;
    String html =  Math.floor(Math.random() * 143) + "AndroidReport.html";

	
	
	
	   public static void click(WebElement element) {	
	  		element.click();

	  	}
	  	 
	  	 public static void clear(WebElement element) {	
	  			element.clear();
	  	 }
	  			
	  	 public static void typeData(WebElement element, String Value) {
	  		element.sendKeys(Value);

	  	}
	  	 
	  	 @BeforeSuite
	  	public  void htmlReport() throws IOException {

			 reports=new ExtentReports("D:\\Android HTML Report\\"+html,true);
	    	 reports.loadConfig(new File("C:\\Users\\amuthan\\eclipse-workspace\\Community_Edit\\extent-config.xml"));
	    	 
	  	 }
	  	 
	  	 public static List<HashMap<String, String>> readValueFromExcelSheet()  throws NullPointerException  {
	    		List<HashMap<String, String>> mapDatasList = new ArrayList<HashMap<String, String>>();
	    		try {
	    			File excelLocaltion = new File("C:\\Users\\amuthan\\eclipse-workspace\\Community_Edit\\Excel\\editpp.xlsx");

	    			String sheetName = "Sheet1";

	    			FileInputStream f = new FileInputStream(
	    					excelLocaltion.getAbsolutePath());
	    			  Workbook w= new XSSFWorkbook(f);
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
	  	 
         
	  	
	  
	    @AfterSuite
	    public void reportflush()
	    {
	    	reports.flush();    	
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
	  
	            message.setSubject("CBS Desktop Automation Report ");
	         
	            message.setRecipients(Message.RecipientType.TO,
	                        InternetAddress.parse("amudhan.nagarajan@matrimony.com,sai.jyothi@matrimony.com"));
	               //,thanikachalam.thirunanasambandan@matrimony.com                        
	            Multipart multipart = new MimeMultipart();

	            MimeBodyPart messageBodyPart = new MimeBodyPart();
	            messageBodyPart.setText("CBS Automation Report");
	            MimeBodyPart attachmentBodyPart = new MimeBodyPart();       
	          

	            String file = ":\\Users\\amuthan\\eclipse-workspace\\SampleLogin\\output\\MyOwnReport.html";

	            String fileName = "CBS-AutomationReport-Desktop";
	            DataSource source = new FileDataSource(file);
	           // messageBodyPart.setDataHandler(new DataHandler(source));
	            attachmentBodyPart.setDataHandler(new DataHandler(source));
	            attachmentBodyPart.setFileName("MyOwnReport.html");
	          
	           
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
	        
	public static String takeScreenShot(String methodName,WebDriver driver) {
	    	
	        String path ="C:\\Mohan\\Results\\"+methodName+".png";
	      //  String path1="C:\\Mohan\\screenshots\\"+methodName+".png";
	        try {
	            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(screenshotFile, new File(path));
	        } catch (Exception e) {
	         
	        }
	        return path;
	    }

	     
	    
	}
