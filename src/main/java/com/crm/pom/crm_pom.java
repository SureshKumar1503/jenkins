package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseOfwebdriver.WebDriverUtility;
import raina.propertiesUtility;

public class crm_pom  {
	WebDriverUtility wd = new WebDriverUtility();
	propertiesUtility pp= new propertiesUtility();
	WebDriver driver;
	
public crm_pom(WebDriver driver) 
    {  
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

@FindBy(name="user_name")
private WebElement un;

@FindBy(name="user_password")
private WebElement pwd;

@FindBy(id="submitButton")
private WebElement sbt;

public WebElement getusername() {
	return un;
}
public WebElement getpassword() {
	return pwd;
}
public WebElement getlogin() {
	return sbt;
}
public void logInApp(String username,String password) 
{
	
	un.sendKeys(username);
	pwd.sendKeys(password);
	sbt.click();
	
}
@FindBy(xpath="(//td[@class=\"small\"])[2]")
private WebElement admin;

@FindBy(xpath=("//a[text()='Sign Out']"))
private WebElement signout;

public WebElement houver() {
	return admin;
	
}

public void singout() {
wd.mouseOver(driver, admin, signout);
}
}