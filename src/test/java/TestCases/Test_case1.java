package TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BasePackage.baseClass;
import Baseclass.BasePage;
import Baseclass.Customer_dashboard;

public class Test_case1 extends baseClass{
JavascriptExecutor js = ((JavascriptExecutor)driver);
	
@Test
public void test_account() {
	logger.info("starting test case1");
	//JavascriptExecutor js = ((JavascriptExecutor)driver);
		
 Customer_dashboard cd = new Customer_dashboard(driver);
 cd.setusername("naveen@gmail.com");
 cd.setpassword("111111");
 logger.info("clicked on link");
 cd.clickprimarybutton(); 
 cd.clickbookings();
 cd.setapplicant("kaja65");
 cd.setapp("kaja65");
 cd.setaddress("10");
 cd.setcontactperson("kaja65");
 cd.setemail("p@gmail.com");
 cd.setfactory("water bottles");
 cd.setproduct("water bottles");
 cd.settest(null);
 cd.setclient("kaja65");
 cd.setclientapplication("14042023");
 cd.setcreate();
 		 
 }

}

