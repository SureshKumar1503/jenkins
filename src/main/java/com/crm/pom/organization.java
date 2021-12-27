package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseOfwebdriver.WebDriverUtility;
import raina.propertiesUtility;



	public class organization extends Base_logIn {
		
		WebDriverUtility wd= new WebDriverUtility();
		propertiesUtility pb=new propertiesUtility();
		
		WebDriver driver;
		public organization(WebDriver driver)
		    {
			this.driver=driver;
			PageFactory.initElements(driver,this);
			}
	    
		
		@FindBy(xpath="//a[text()='Organizations']")
		private WebElement org;
		
		@FindBy(xpath="//img[@title='Create Organization...']")
		private WebElement cr;
		
		
		public void orgs() {
		org.click();	
		}
		public void org() {
			cr.click();
		}
		
		
		@FindBy(name="accountname")
		private WebElement acname;
		
		public WebElement acc() {
		return	acname;
		}
		public void name1()
		{
			organization or = new organization(driver);
			or.acc().sendKeys("manooon");
					}
	
		@FindBy(name="button")
		private WebElement btnn;
		
		public void btn() {
			
			btnn.click();
		
			}
		}