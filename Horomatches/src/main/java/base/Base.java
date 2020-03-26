package base;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base {
	public static WebDriver driver;



public static void setText(WebElement element, String string) {
	//cleartextbox(element);
	element.sendKeys(string);

}

public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

    //Convert web driver object to TakeScreenshot

    TakesScreenshot scrShot =((TakesScreenshot)webdriver);

    //Call getScreenshotAs method to create image file

            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

            File DestFile=new File("C:\\Users\\Admin\\workspace\\PwaBanner\\screenshot\\"+fileWithPath+".png");

            //Copy file at destination

            FileUtils.copyFile(SrcFile, DestFile);

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
public static void action(WebDriver driver,WebElement element) {
    Actions ac1 = new Actions(driver);

    ac1.moveToElement(element).build().perform();

} 

public static List<HashMap<String, String>> readValueFromExcelSheet()  throws NullPointerException  {
	List<HashMap<String, String>> mapDatasList = new ArrayList<HashMap<String, String>>();
	try {
		File excelLocaltion = new File("C:\\Users\\Admin\\workspace\\CCEOCheck\\Excel\\cityList.xlsx");

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
public static List<HashMap<String, String>> readValueFromExcelSheet1()  throws NullPointerException  {
	List<HashMap<String, String>> mapDatasList = new ArrayList<HashMap<String, String>>();
	try {
		File excelLocaltion = new File("C:\\Users\\Admin\\workspace\\CCEOCheck\\Excel\\Dist&State.xlsx");

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
public void click(String xpath)
{
	WebElement e=driver.findElement(By.xpath(xpath));
	Actions a=new Actions(driver);
	a.click(e).build().perform();
	
}
public void fill(String xpath,String data)
{
	WebElement e=driver.findElement(By.xpath(xpath));
	Actions a=new Actions(driver);
	a.sendKeys(e,data).build().perform();
	
}
public void SelectCast(String xpath,String Text,String Available) throws InterruptedException
{
	int c=0;
	 Thread.sleep(1000);
	     List<WebElement>l=driver.findElements(By.xpath(xpath));
	     if(l.size()!=0)
	     {
	    	 
	    	 System.out.println(" "+Available+"  "+"Available");
	    	 System.out.println(l.size());
	    	 for(int i=1;i<=l.size();i++)
				{
					String x=driver.findElement(By.xpath(""+xpath+"["+i+"]")).getText();
					
					if(x.equalsIgnoreCase(Text))
					{
						System.out.println(x);
						Thread.sleep(2000);
						driver.findElement(By.xpath(""+xpath+"["+i+"]")).click();
						System.out.println(" "+Text+" "+"Updated");
						c=c+1;
						if(c>1)
						{
							System.out.println(" "+Text+" "+"Duplicates"+" "+c);
							
						}
					}
					else
					{
						if(i!=l.size())
						{
							
						}
						else if(c>=1)
						{
							this.Drop("//select[@name='RELIGION']", "Hindu");
						}
						
						else
						{
							System.out.println(""+Text+" "+"NotUpdated");
						}
					}
					
					
				}
	    	 
	    	 }
	     else
	     {
	    	 System.out.println(Available+ "Not Available");
	    	 System.out.println(l.size());
	     }
		
	}

	public void Extent()
	{
		ExtentReports er=new ExtentReports("C:\\Users\\kranthi rampeesa\\Desktop\\selenium\\ReportsCityValidation1.html",false);
		ExtentTest et=er.startTest("StateandCityUpdationTest");
	}
	
	
	
public void SelectStateandCity(String Statexpath,String Cityxpath,String StateText,String CityText) throws Exception 
{
	ExtentReports er=new ExtentReports("C:\\Users\\BMTech\\Desktop\\selenium\\CityValidation21.html",false);
	ExtentTest et=er.startTest("CityUpdationTest");
	WebDriverWait w=new WebDriverWait(driver,10);
	Actions a=new Actions(driver);
	int c=0;
	 while(2>1)
	 {
			try
			{
				if(driver.findElement(By.xpath("//input[@aria-owns='select2-results-13']")).isDisplayed())
				{
				break;
				}
				else
				{
			    WebDriverWait w1=new WebDriverWait(driver,10);
	    		Actions a1=new Actions(driver);
	    		w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='select2-choice'])[12]")));
	    		WebElement e=driver.findElement(By.xpath("(//a[@class='select2-choice'])[12]"));
	    		a1.click(e).build().perform();
				}
			
			}
			catch(Exception e2)
			{
				e2.getMessage();
			}
	 }
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Statexpath)));
List<WebElement>l1=driver.findElements(By.xpath(Statexpath));
if(l1.size()!=0)
{
	  for(int i=1;i<=l1.size();i++)
		{
		   w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""+Statexpath+"["+i+"]")));
			String x=driver.findElement(By.xpath(""+Statexpath+"["+i+"]")).getText();			
			if(x.equalsIgnoreCase(StateText))
			{
				System.out.println("State:" +x);
				Thread.sleep(1000);
				WebElement e1=driver.findElement(By.xpath(""+Statexpath+"["+i+"]"));
				a.click(e1).build().perform();
				try{
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//a[@class='select2-choice'])[13]")).click();
					Thread.sleep(1000);
					try
					{
						driver.findElement(By.xpath("//div[text()='Show more cities']")).click();
					}
					catch(Exception tr)
					{
						
					}
					/*if(driver.findElement(By.xpath("//div[text()='Show more cities']")).isDisplayed())
					{
						driver.findElement(By.xpath("//div[text()='Show more cities']")).click();
					}*/
					
					Thread.sleep(2000);
				     List<WebElement>cl=driver.findElements(By.xpath(Cityxpath));
				     if(cl.size()!=0)
				     {
				    	 System.out.println("City List:"+" "+cl.size());
				    	 for(int k=1;k<=cl.size();k++)
							{
				    		 try{
				    			 
				    		
								String cx=driver.findElement(By.xpath(""+Cityxpath+"["+k+"]")).getText();
								//System.err.println(cx);
								if(cx.equalsIgnoreCase(CityText))
								{
									System.out.println(cx);
									System.out.println(" "+cx+" "+"Updated");
									driver.findElement(By.xpath(""+Cityxpath+"["+k+"]")).click();
									et.log(LogStatus.PASS, " "+CityText+" "+"Updated");
									driver.findElement(By.xpath("(//a[@class='select2-choice'])[13]")).click();
									
									c=c+1;
									if(c>1)
									{
										System.out.println(" "+cx+" "+"Duplicates"+" "+c);
										et.log(LogStatus.FAIL, " "+cx+" "+"Duplicates"+" "+c);
									}
								
									
									
								
								}
								else
								{
									if(k!=cl.size())
									{
										
									}
									else if(c>=1)
									{
										driver.findElement(By.xpath("//input[@id='s2id_autogen14_search']")).sendKeys(Keys.ESCAPE);
									}
									else
									{
										System.err.println(""+CityText+" "+"NotUpdated");
										et.log(LogStatus.FAIL, " "+CityText+" "+"NotUpdated");
										et.addScreenCapture("C:\\Users\\BMTech\\Desktop\\selenium\\Reports\\City"+k+"");
										driver.findElement(By.xpath("//input[@id='s2id_autogen14_search']")).sendKeys(Keys.ESCAPE);
									}
								}
				    		 }
				    		 catch(Exception ek)
				    		 {
				    			ek.getMessage();
										
					    	 }
								
								
								
							}
				    	 
				    	 
				    	 }
				     
					
				
				}
				
				catch(Exception e)
				{
					e.getMessage();
				}
				break;
				
			}
			
			
				else
			     {
					if(i!=l1.size())
					{
						
					}
					else
					{
						System.err.println("State"+" " +""+StateText+" "+"NotUpdated");
						et.log(LogStatus.FAIL, " "+StateText+" "+"NotUpdated");			
						driver.findElement(By.xpath("//input[@id='s2id_autogen13_search']")).sendKeys(Keys.ESCAPE);
				    }
			     }
			
			
		}
	er.flush();
	er.endTest(et);
 System.out.println("NUmber of Passed Tests:"+c+"");
}


	 }
			

	

public static void Drop(String xpath,String text)
{
	WebElement e=driver.findElement(By.xpath(xpath));
	Select s=new Select(e);
	s.selectByVisibleText(text);
}
public void SearchState(String xpath,String data) throws InterruptedException
{
	
	WebElement e=driver.findElement(By.xpath(xpath));
	Actions a=new Actions(driver);
	a.sendKeys(e,data).build().perform();
	Thread.sleep(1000);
	List<WebElement>l=driver.findElements(By.xpath("(//ul[@class='select2-results'])[15]/li"));
	if(l.size()!=0)
	{
		System.out.println("City List available");
	System.out.println("Number of Similar casts:"+" "+l.size());
	for(int i=1;i<=l.size();i++)
	{
		String x=driver.findElement(By.xpath("(//ul[@class='select2-results'])[15]/li")).getText();
		System.out.println(x);
		if(x.equalsIgnoreCase(""+data+""))
		{
			System.out.println(" " +x+ " "+"Updated");
			driver.findElement(By.xpath("(//ul[@class='select2-results'])[15]/li["+i+"]")).click();
		}
		else
		{
			if(i!=l.size())
			{
				
			}
			else
			{
				System.out.println(""+data+" "+"NotUpdated");
			}
		}
	}
	}
	else
	{
		System.out.println("Cast List Not Available");
	}
	
	
	
	
	

}
public void SearchCity(String xpath,String data) throws InterruptedException
{
	WebElement e=driver.findElement(By.xpath(xpath));
	Actions a=new Actions(driver);
	a.sendKeys(e,data).build().perform();
	Thread.sleep(1000);
	List<WebElement>l=driver.findElements(By.xpath("//ul[@id='select2-results-14']/li"));
	if(l.size()!=0)
	{
		System.out.println("City List available");
	System.out.println("Number of Similar cities:"+" "+l.size());
	for(int i=1;i<=l.size();i++)
	{
		String x=driver.findElement(By.xpath("//ul[@id='select2-results-14']/li["+i+"]")).getText();
		System.out.println(x);
		if(x.equalsIgnoreCase(""+data+""))
		{
			System.out.println(" " +x+ " "+"Updated");
			driver.findElement(By.xpath("//ul[@id='select2-results-14']/li["+i+"]")).click();
		}
		else
		{
			if(i!=l.size())
			{
				
			}
			else
			{
				System.out.println(""+data+" "+"NotUpdated");
			}
		}
	}
	}
}
public void PPStateandcity(String Statexpath,String Cityxpath,String StateText,String CityText) throws InterruptedException
{
	ExtentReports er=new ExtentReports("C:\\Users\\BMTech\\Desktop\\selenium\\PPCityValidation2.html",false);
	ExtentTest et=er.startTest("CityUpdationTest");
	WebDriverWait w=new WebDriverWait(driver,10);
	Actions a=new Actions(driver);
	int c=0;
	   try
			{
				
			    WebDriverWait w1=new WebDriverWait(driver,10);
	    		Actions a1=new Actions(driver);
	    		w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='selected_parent_box7']")));
	    		WebElement e=driver.findElement(By.xpath("//div[@id='selected_parent_box7']"));
	    		a1.click(e).build().perform();
			
			}
			catch(Exception e2)
			{
				e2.getMessage();
			}
	     try
	     {
	    	 driver.findElement(By.xpath("//div[@id='selected_parent_box7']/div[1]/span[2]")).click();
	     }
	     catch(Exception el)
	     {
	    	 
	     }
	     Thread.sleep(2000);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Statexpath)));
List<WebElement>l1=driver.findElements(By.xpath(Statexpath));
if(l1.size()!=0)
{
	  for(int i=1;i<=l1.size();i++)
		{
		   w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""+Statexpath+"["+i+"]")));
			String x=driver.findElement(By.xpath(""+Statexpath+"["+i+"]")).getText();			
			if(x.equalsIgnoreCase(StateText))
			{
				System.out.println("State:" +x);
				Thread.sleep(1000);
				WebElement e1=driver.findElement(By.xpath(""+Statexpath+"["+i+"]"));
				a.click(e1).build().perform();
				Thread.sleep(2000);
				this.Drop("//select[@name='RELIGION']", "Hindu");
				try{
					Thread.sleep(1000);
					driver.findElement(By.xpath("//div[@id='selected_parent_box8']")).click();
					try
				     {
				    	 driver.findElement(By.xpath("//div[@id='selected_parent_box8']/div[1]/span[2]")).click();
				     }
					catch(Exception ew)
					{
						
					}
					Thread.sleep(2000);
				     List<WebElement>cl=driver.findElements(By.xpath(Cityxpath));
				     if(cl.size()!=0)
				     {
				    	 System.out.println("City List:"+" "+cl.size());
				    	 for(int k=1;k<=cl.size();k++)
							{
				    		 try{
				    			 
				    		
								String cx=driver.findElement(By.xpath(""+Cityxpath+"["+k+"]")).getText();
								System.err.println(cx);
								if(cx.equalsIgnoreCase(CityText))
								{
									System.out.println(cx);
									System.out.println(" "+cx+" "+"Updated");
									driver.findElement(By.xpath(""+Cityxpath+"["+k+"]")).click();
									et.log(LogStatus.PASS, " "+CityText+" "+"Updated");
									//driver.findElement(By.xpath("(//a[@class='select2-choice'])[13]")).click();
									//this.Drop("//select[@name='RELIGION']", "Hindu");
									c=c+1;
									if(c>1)
									{
										System.out.println(" "+cx+" "+"Duplicates"+" "+c);
										et.log(LogStatus.FAIL, " "+cx+" "+"Duplicates"+" "+c);
									}
								
									
									
								
								}
								else
								{
									if(k!=cl.size())
									{
										
									}
									else if(c>=1)
									{
										this.Drop("//select[@name='RELIGION']", "Hindu");
									}
									else
									{
										System.err.println(""+CityText+" "+"NotUpdated");
										et.log(LogStatus.FAIL, " "+CityText+" "+"NotUpdated");
										et.addScreenCapture("C:\\Users\\BMTech\\Desktop\\selenium\\Reports\\City"+k+"");
										this.Drop("//select[@name='RELIGION']", "Hindu");
									}
								}
				    		 }
				    		 catch(Exception ek)
				    		 {
				    			ek.getMessage();
										
					    	 }
								
								
								
							}
				    	 
				    	 
				    	 }
				     
					
				
				}
				
				catch(Exception e)
				{
					e.getMessage();
				}
				break;
				
			}
			
			
				else
			     {
					if(i!=l1.size())
					{
						
					}
					else
					{
						System.err.println("State"+" " +""+StateText+" "+"NotUpdated");
						et.log(LogStatus.FAIL, " "+StateText+" "+"NotUpdated");			
						this.Drop("//select[@name='RELIGION']", "Hindu");
				    }
			     }
			
			
		}
	er.flush();
	er.endTest(et);
 System.out.println("NUmber of Passed Tests:"+c+"");
}

}
public void HoroState(String Statexpath,String Cityxpath,String StateText,String CityText) throws InterruptedException
{
	ExtentReports er=new ExtentReports("C:\\Users\\BMTech\\Desktop\\selenium\\HOROValidation25.html",false);
	ExtentTest et=er.startTest("CityUpdationTest");
	WebDriverWait w=new WebDriverWait(driver,10);
	Actions a=new Actions(driver);
	int c=0;
	while(2>1)
	{
			try
			{
			    if(driver.findElement(By.xpath("//*[@id='s2id_autogen9_search']")).isDisplayed())
			    {
			    	break;
			    }
			    else
			    {
			    	WebDriverWait w1=new WebDriverWait(driver,10);
    	    		Actions a1=new Actions(driver);
    	    		w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='s2id_lstState1']/a")));
    	    		WebElement e=driver.findElement(By.xpath("//*[@id='s2id_lstState1']/a"));
    	    		a1.click(e).build().perform();
			    }
			
			}
			catch(Exception e2)
			{
				
			}
	}
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Statexpath)));
List<WebElement>l1=driver.findElements(By.xpath(Statexpath));
if(l1.size()!=0)
{
	  for(int i=1;i<=l1.size();i++)
		{
		   w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""+Statexpath+"["+i+"]")));
			String x=driver.findElement(By.xpath(""+Statexpath+"["+i+"]")).getText();		
			if(x.equalsIgnoreCase(StateText))
			{
				System.out.println("State:" +x);
				Thread.sleep(1000);
				WebElement e1=driver.findElement(By.xpath(""+Statexpath+"["+i+"]"));
				a.click(e1).build().perform();
				
				try{
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id='s2id_lstcity']/a")).click();
					Thread.sleep(1000);
					try
					{
						driver.findElement(By.xpath("//div[text()='Show more cities']")).click();
					}
					catch(Exception rt)
					{
						
					}
					Thread.sleep(2000);
				     List<WebElement>cl=driver.findElements(By.xpath(Cityxpath));
				     if(cl.size()!=0)
				     {
				    	 System.out.println("City List:"+" "+cl.size());
				    	 for(int k=1;k<=cl.size();k++)
							{
				    		 try{
				    			 
				    		
								String cx=driver.findElement(By.xpath(""+Cityxpath+"["+k+"]")).getText();
								if(cx.equalsIgnoreCase(CityText))
								{
									System.out.println(cx);
									System.out.println(" "+cx+" "+"Updated");
									driver.findElement(By.xpath(""+Cityxpath+"["+k+"]")).click();
									et.log(LogStatus.PASS, " "+CityText+" "+"Updated");
									driver.findElement(By.xpath("//*[@id='s2id_lstcity']/a")).click();
									
									c=c+1;
									if(c>1)
									{
										System.out.println(" "+cx+" "+"Duplicates"+" "+c);
										et.log(LogStatus.FAIL, " "+cx+" "+"Duplicates"+" "+c);
									}
								
									
									
								
								}
								else
								{
									if(k!=cl.size())
									{
										
									}
									else if(c>=1)
									{
										driver.findElement(By.xpath("//*[@id='s2id_lstcity']/a")).sendKeys(Keys.ESCAPE);
									}
									else
									{
										System.err.println(""+CityText+" "+"NotUpdated");
										et.log(LogStatus.FAIL, " "+CityText+" "+"NotUpdated");
										//et.addScreenCapture("C:\\Users\\BMTech\\Desktop\\selenium\\Reports\\City"+k+"");
										driver.findElement(By.xpath("//*[@id='s2id_lstcity']/a")).sendKeys(Keys.ESCAPE);
									}
								}
				    		 }
				    		 catch(Exception ek)
				    		 {
				    			ek.getMessage();
										
					    	 }
								
								
								
							}
				    	 
				    	 
				    	 }
				     
					
				
				}
				
				catch(Exception e)
				{
					e.getMessage();
				}
				break;
				
			}
			
			
				else
			     {
					if(i!=l1.size())
					{
						
					}
					else
					{
						System.err.println("State"+" " +""+StateText+" "+"NotUpdated");
						et.log(LogStatus.FAIL, " "+StateText+" "+"NotUpdated");			
						driver.findElement(By.xpath("//*[@id='s2id_lstState1']/a")).sendKeys(Keys.ESCAPE);
				    }
			     }
			
			
		}
	er.flush();
	er.endTest(et);
 System.out.println("NUmber of Passed Tests:"+c+"");
}

	
}
}
