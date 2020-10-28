package com.TestScripts;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Base.Base;
import com.ObjectRepository.inbox_POM;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Communication_Api_Test extends Base{
	
	
	WebDriver driver;
	String Requested_Id=null;
	String requested_deatils=null;
	String matid,asd,ageFro,ageT,maritalStatus,mariedstatus1,Religion,Religion1,Caste,Caste1,SubCaste,SubCaste1,Education,Education1;
	int ageFrom,ageTo,ageFrom1,ageTo1;
    float heightFrom,heightFrom1,heightTo,heightTo1,heightFrom2,heightTo2,Height;
    
	@Test(priority=2,enabled=true)
	public void communicationDetails() {
		// Specify the base URL to the RESTful web service
		
		
		RestAssured.baseURI = "https://api.communitymatrimony.com/api/webservicecall.php?filename=showRecMsgCurl&MatriId=MDA281774&Gender=2&MessageAction=RMPENDING&MsgType=1,2&Page=2&OrderBy=Date_Received%20DESC&FilterFlag=0";

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.request(Method.GET,
				"https://api.communitymatrimony.com/api/webservicecall.php?filename=showRecMsgCurl&MatriId=MDA281774&Gender=2&MessageAction=RMPENDING&MsgType=1,2&Page=2&OrderBy=Date_Received%20DESC&FilterFlag=0");

		JsonPath jsonPathEvaluator = response.jsonPath();

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);

		String statusLine = response.getStatusLine();
		System.out.println("Status Line : " + statusLine);

		String contentType = response.header("Content-Type");
		System.out.println("Content-Type value: " + contentType);

		String serverType = response.header("Server");
		System.out.println("Server value: " + serverType);

		String acceptLanguage = response.header("Content-Encoding");
		System.out.println("Content-Encoding: " + acceptLanguage);

		

		ResponseBody body = response.getBody();
		System.out.println("Response Body is: " + body.asString());
		
		String ERRORDESC = response.jsonPath().get("ERRORDESC").toString();
	//	System.out.println(ERRORDESC+" . ' . ' ");
		
		if (!ERRORDESC.equalsIgnoreCase("Sorry No Record's Found")) {
			
			
        String tota = response.jsonPath().get("TOTALRESULTS").toString();
       Float totaal = Float.parseFloat(tota);
       
       
       
       float tot = (float) (totaal/10.0);
       System.out.println(tot);
       int total = (int) Math.ceil(tot);
     //  int tot = (int) (totaal/10);
      //  float totalll = Math.round(tot);
     //  int total = Math.round(tot);
        System.out.println(total);
      
        
        for (int i = 1; i <=total; i++) {
        	
        	System.out.println("\n"+"\n"+i+"\n"+"\n");
        	
        	RestAssured.baseURI = "https://api.communitymatrimony.com/api/webservicecall.php?filename=showRecMsgCurl&MatriId=MDA281774&Gender=2&MessageAction=RMPENDING&MsgType=1,2&Page="+i+"&OrderBy=Date_Received%20DESC&FilterFlag=0";

    		RequestSpecification httpRequest1 = RestAssured.given();

    		Response response1 = httpRequest1.request(Method.GET,
    				"https://api.communitymatrimony.com/api/webservicecall.php?filename=showRecMsgCurl&MatriId=MDA281774&Gender=2&MessageAction=RMPENDING&MsgType=1,2&Page="+i+"&OrderBy=Date_Received%20DESC&FilterFlag=0");

    		JsonPath jsonPathEvaluator1= response1.jsonPath();
    		
    		ResponseBody body1 = response1.getBody();
    		
    	//	String ERRORDESC = response1.jsonPath().get("ERRORDESC").toString();

            			
		
	
		
		
	
		
		List<Map<String, String>> profile_details = response1.jsonPath().getList("PROFILEDETAILS");
        for (int j = 0; j < profile_details.size(); j++) {
        	int k = j+1;
        	
        	 
        	 System.out.println("\n"+k+"\n");
        	 
        	 System.out.println(profile_details.get(j).get("MATRIID"));
        	     	 
  
        	// System.out.println(profile_details.get(i).get("RELIGION"));

        
            String age = profile_details.get(j).get("AGE");
            Integer age1 = Integer.parseInt(age);
     //       System.out.println("Age is:" + age1);
            
            
            String maried_status = profile_details.get(j).get("MARITALSTATUS");
            
            String Relign = profile_details.get(j).get("RELIGION");
            
            String suCas = profile_details.get(j).get("SUBCASTE");
            
            String Education1 = profile_details.get(j).get("EDUCATION"); 
           // System.out.println(profile_details.get(j).get("Educat"));
            
            String Heig = profile_details.get(j).get("HEIGHT");
            System.out.println(Heig);
            String[] heiii = Heig.split("/");
            String heig = heiii[0].toString().trim();
          
             if (heig.endsWith("in")) {
				
				String[] hei = heig.split(" ft ");
				String heig1 = hei[0].toString().trim();
				
				String[] heigh = hei[1].split(" in");
				String heigg = heigh[0].toString().trim();
				
				String heightFro = heig1+"."+heigg;
				Height = Float.parseFloat(heightFro);
		//		System.out.println(":::"+Height);
				
			} else {
				
				String[] hei = heig.split(" ft");
				String heig1 = hei[0].toString().trim();
				
				Height=Float.parseFloat(heig1);
		//		System.out.println(":::"+Height);

			}
            
        
            
         
            
        
            	
            	     if (ageFrom==age1 || ageTo>=age1) {
            	    	 System.out.println(age1 + " is in between " + ageFrom + " and " + ageTo);
					} else {
						 System.out.println(age1 + " is not in between " + ageFrom + " and " + ageTo);
					}
            	     
            	     
            	     
            	     if (heightFrom==Height|| heightTo>=Height) {
                        	System.out.println(Height + " is in between " + heightFrom + " and " + heightTo);
            			} else {
            				System.out.println(Height + " is not in between " + heightFrom + " and " + heightTo);
            			}
            	     
            	     
            	     if (maried_status.equals(maritalStatus)) {
                     	System.out.println("Marital Status Verified");	
         			} else {
         				System.out.println("Marital  Status not Verified");
         			}
            	     
            	                	     
                   try {     	     
            	     
            	     if (Religion.equalsIgnoreCase(Relign)) {
                     	System.out.println("Religion  Verified");
         			} else {
         				System.out.println("Religion not Verified  ");
         			}
                   } catch (Exception e) {
					
				}     
            	     
                   
                   try {
            	     if (SubCaste.equalsIgnoreCase(suCas)) {                    	
                      	System.out.println("SubCaste  Verified");          				
          			} else {         				
          				System.out.println("SubCaste not Verified  ");
          			}
            	     
                   } catch (Exception e) {
   					
   				}   
            	     
            	   /*  try {
            	     if (Education.contains(Education1)) {                      	
                       	System.out.println("Education  Verified");          				
           			} else {          				
           				System.out.println("Education not Verified  ");
           			}
            	     
            	     } catch (Exception e) {
     					
     				} */
            	     
		}
        
		
		
        }  
} else {
			
			System.out.println("Sorry No Record's Found");

		}
        }

	
	@Test(priority=1,enabled=true)
	public void Inbox_verify() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.communitymatrimony.com");
	


		inbox_POM i = new inbox_POM(driver);
		Actions acc =new Actions(driver);

		
		driver.manage().window().maximize();
try {
		Base.click(i.getMatriId());//MDA281774 //MUS2066206 //EZH710533
		Base.typeData(i.getMatriId(), "MDA281774");

		Base.click(i.getPaswwordclr());
		Base.typeData(i.getPassword(), "cbstest");

		Base.click(i.getLoginbtn());
} catch (Exception e) {
	System.out.println("Already Logged In");
}
		//////////////////////// INtermediate Pages /////////////////////////////

		try {
			WebElement photo_add = driver.findElement(By.xpath("/html/body/div[2]/a"));
			if (photo_add.isDisplayed()) {
				photo_add.click();
				driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
				driver.findElement(By.xpath("//*[@id=\"reason3\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"skipphotoclick\"]")).click();

			}

		} catch (Exception e) {
			System.out.println("Photo Page Skipped");
		}

		try {
			WebElement skip_matches = driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
			if (skip_matches.isDisplayed()) {
				skip_matches.click();

			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled 1");
		}

		try {
			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
			if (element.isDisplayed()) {
				element.click();

			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled 2");
		}

		try {
			WebElement divorcee_intermediate_skip = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
			if (divorcee_intermediate_skip.isDisplayed()) {
				divorcee_intermediate_skip.click();

			}
		} catch (Exception e) {
			System.out.println("Intermediate pages handled 3");
		}

		try {
			driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
		} catch (Exception e) {
			System.out.println("No Intermediate pages");
		}
		// AD Pages

		Thread.sleep(3000);
		try {
			driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
		} catch (Exception e) {
			System.out.println("ADs Closed Successfully");
		}
	
	 Thread.sleep(3000); 
	 acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a"))).build().perform();
	 Thread.sleep(1500);
	 acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[2]/a"))).build().perform();
	 
	 Thread.sleep(2000);
	 Base.click(driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[2]/a")));
	 
	 Thread.sleep(3000);
	 
	
		 
		 maritalStatus = driver.findElement(By.xpath("//span[contains(text(),'Marital Status - ')]//following::span[1]")).getText();
		   System.out.println(maritalStatus);

		   
		   String age = driver.findElement(By.xpath("//span[contains(text(),'Age - ')]//following::span[1]")).getText();
			
			String[] agef = age.split(" to ");
			String agefr = agef[0].toString();
			ageFrom = Integer.parseInt(agefr);
			System.out.println(ageFrom);
			
			String[] agefrr = agef[1].split(" Yrs");
			String ageT=agefrr[0].toString();
			ageTo = Integer.parseInt(ageT);
			System.out.println(ageTo);
			
			
			
			
			//////////////////
         String Height1 = driver.findElement(By.xpath("//span[contains(text(),'Height - ')]//following::span[1]")).getText();
			
			String[] heightF = Height1.split(" to ");
			
			String he = heightF[0].toString().trim();
			System.out.println(he);
		////	
			if (he.endsWith("in")) {
				
				String[] hei = he.split(" ft ");
				String heig = hei[0].toString().trim();
				
				String[] heigh = hei[1].split(" in");
				String heigg = heigh[0].toString().trim();
				
				String heightFro = heig+"."+heigg;
				heightFrom = Float.parseFloat(heightFro);
				System.out.println(":::"+heightFrom);
				
			} else {
				
				String[] hei = he.split(" ft");
				String heig = hei[0].toString().trim();
				
				heightFrom=Float.parseFloat(heig);
				System.out.println(":::"+heightFrom);

			}
			
			/////
			
			
			String he1 = heightF[1].toString().trim();
			System.out.println(he1);
		////	
			if (he1.endsWith("in")) {
				
				String[] hei1 = he1.split(" ft ");
				String heig1 = hei1[0].toString().trim();
				
				String[] heigh1 = hei1[1].split(" in");
				String heigg1 = heigh1[0].toString().trim();
				
				String heightFro1 = heig1+"."+heigg1;
				heightTo = Float.parseFloat(heightFro1);
				System.out.println(":*:*:"+heightTo);
				
			} else {
				
				String[] hei1 = he1.split(" ft");
				String heig1 = hei1[0].toString().trim();
				
				heightTo=Float.parseFloat(heig1);	
				System.out.println(":*:*:"+heightTo);

			}
			
			
			
		           ////////////////////////
			
			
			
			//String Height = driver.findElement(By.xpath(xpathExpression))
		try {	
			Religion = driver.findElement(By.xpath("//span[contains(text(),'Religion - ')]//following::span[1]")).getText();
			System.out.println("Religion : "+Religion);
		
} catch (Exception e) {
			
		}
		
		try {
			SubCaste = driver.findElement(By.xpath("//span[contains(text(),'Subcaste - ')]//following::span[1]")).getText();
			System.out.println("SubCaste : "+SubCaste);
} catch (Exception e) {
			
		}
		
		try {
			Education = driver.findElement(By.xpath("//span[contains(text(),'Education - ')]//following::span[1]")).getText();
			System.out.println("Education : "+Education);
		} catch (Exception e) {
			
		}
			
			
		
	}
	

}
