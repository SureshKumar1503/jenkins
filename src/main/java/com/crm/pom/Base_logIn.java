package com.crm.pom;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import BaseOfwebdriver.WebDriverUtility;
import raina.propertiesUtility;

public class Base_logIn {
	public WebDriver driver;
	propertiesUtility p=new propertiesUtility();
	WebDriverUtility wd=new WebDriverUtility();
	crm_pom cr = new crm_pom(driver);     
	@BeforeMethod
	public void loginweb() throws IOException 
		{
			driver= new  ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:8888/index.php?module=Home&action=index&parenttab=My%20Home%20Page");
	        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
	       crm_pom cr = new crm_pom(driver);
	       cr.logInApp(p.readDataFromProperty("username"),p.readDataFromProperty("password"));
	       
	  		}
	
	@AfterMethod
	public void logOut()
	{
		
		cr.singout();
		
		driver.close();
		}
}