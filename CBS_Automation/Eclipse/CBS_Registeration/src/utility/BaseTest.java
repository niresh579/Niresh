package utility;


	
	import java.io.File;
import java.io.IOException;
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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;


	public class BaseTest {
	
	    public static ExtentHtmlReporter htmlReporter;
	    public static ExtentReports extent;
	    public static ExtentTest test;
	    protected static WebDriver driver;
	 
	    @BeforeSuite
	    public void reportConfig(){
	    		    
	        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/MyOwnReport.html");
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	                
	        htmlReporter.config().setChartVisibilityOnOpen(true);
	        htmlReporter.config().setDocumentTitle("AutomationTesting.in Demo Report");
	        htmlReporter.config().setReportName("My Own Report");
	        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	        htmlReporter.config().setTheme(Theme.DARK);  
	        //htmlReporter.getEndTime();
	       // htmlReporter.getStartTime();
	       // htmlReporter.getRunDuration();    
	       
	    }          
	    @BeforeMethod
	    public void startUp()
	    {
	    	ChromeOptions options = new ChromeOptions();
	    	options.addArguments("--disable-notifications");
	    	//System.setProperty("webdriver.chrome.driver", "C:\\Mohan\\chromedriver_win32\\chromedriver.exe");
	 		 // driver = new ChromeDriver(options);	
	 		 System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
			  driver = new ChromeDriver(options);	
	    }
	   
	    @AfterMethod
	    public void getResult(ITestResult result)throws IOException
	    {
	        	
	        if(result.getStatus() == ITestResult.FAILURE)
	        {
	            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
	            test.fail(result.getThrowable());
	        
	            test.log(Status.FAIL,"Screenshot below: " + test.addScreenCaptureFromPath(takeScreenShot(result.getMethod().getMethodName(),driver)));
	                   
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS)
	        {
	            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
//	            test.pass(result.getThrowable());
		        
	            test.log(Status.PASS,"Screenshot below: " + test.addScreenCaptureFromPath(takeScreenShot(result.getMethod().getMethodName(),driver)));
	        
	        }
	        
	        else
	        {
	            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
	            test.skip(result.getThrowable());
	        }
	     
	      }    
	        
	    @AfterSuite
	    public void reportflush()
	    {
	    	extent.flush();    	
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
	                        InternetAddress.parse("cbsautomationreport@gmail.com"));
	               //,thanikachalam.thirunanasambandan@matrimony.com                        
	            Multipart multipart = new MimeMultipart();

	            MimeBodyPart messageBodyPart = new MimeBodyPart();
	            messageBodyPart.setText("CBS Automation Report");
	            MimeBodyPart attachmentBodyPart = new MimeBodyPart();       
	          

	            String file = ".//test-output//MyOwnReport.html";

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
	    	
	        String path =".//Screenshot//"+methodName+".png";
	        try {
	            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(screenshotFile, new File(path));
	        } catch (Exception e) {
	         
	        }
	        return path;
	    }

	     
	    
	}



