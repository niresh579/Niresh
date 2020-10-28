package Functionalites;



import org.testng.Assert;
import org.testng.annotations.Test;

import Basepacknew.Base3;
import PomPack.AddonpackPom;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Getdata2restassured{
	
  
  
  @Test(priority=1)
  public void testResponsecode()  {
	  
	  Response resp = RestAssured.get("https://www.communitymatrimony.com");
	  int code = resp.getStatusCode();
	  System.out.println("status code is " + code);
	  Assert.assertEquals(code, 200);
  }
  @Test(priority=2)
  public void testbody() {
	  
	  Response resp = RestAssured.get("https://www.communitymatrimony.com");
	  String data = resp.asString();
	  System.out.println("data is " + data);
	  System.out.println("response time " + resp.getTime());
	  
  }
 
  
  
}
  
  