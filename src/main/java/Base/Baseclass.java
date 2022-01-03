package Base;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import BaseOfwebdriver.WebDriverUtility;
import raina.DButility;
import raina.excelutility;
import raina.propertiesUtility;


public class Baseclass extends WebDriverUtility{


	public WebDriver driver;

	public DButility db1 = new DButility();
	public excelutility x1 = new excelutility();
	public	propertiesUtility pp = new propertiesUtility();
	public WebDriverUtility wd2 = new WebDriverUtility();
	public LogIn lg = new LogIn();
public LogOut lgo = new LogOut();
	//public static WebDriver sd; 
	
	
	@BeforeSuite (groups={"smoke","regression"})
	public void dbconnect() throws SQLException {

		System.out.println("data base connection");
		db1.ConnectToDatabase();
	}

	@BeforeClass (groups={"smoke","regression"})
	public void configWebDrive() {
		System.out.println("****webdriver browser connection*****");
		driver = new ChromeDriver();
		wd2.waitUntilPageLoad(driver);
		driver.manage().window().maximize();

	}

	@BeforeMethod (groups={"smoke","regression"})
	public void login() throws IOException {
		lg.loginTest(driver);
	}

	@AfterMethod (groups={"smoke","regression"})
	public void logout() {
		lgo.closeapp(driver);
	}

	@AfterClass (groups={"smoke","regression"})
	public void webclose() {
		System.out.println("close browser");
		driver.close();

	}

	@AfterSuite (groups={"smoke","regression"})
	public void closeconnection() throws SQLException {
		db1.closeDB();
	}
}
