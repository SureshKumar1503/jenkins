package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseOfwebdriver.WebDriverUtility;

public class HomePage extends Base_logIn {
	
	WebDriverUtility wd= new WebDriverUtility();
	
	WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	public void orgs() {
		
	}
    
	
	/*@FindBy(xpath="//a[text()='Organizations']")
	private WebElement org;
	
	public void orgs() {
	org.click();	
	
	}
*/
  /*  @FindBy(xpath="//a[text()='Leads']")
    private WebElement ld;
    
    public void ld() {
    	ld.click();   
    	}
    @FindBy(xpath="//a[text()='Calendar']")
    private WebElement cl;
    
    public void cl() {
    	cl.click();   
    	}
    @FindBy(xpath="//a[text()='Contacts']")
    private WebElement ct;
    
    public void contact() {
    	ld.click();   
    	}
    @FindBy(xpath="//a[text()='Products']")
    private WebElement product;
    
    public void product() {
    	product.click();   
    	}
    @FindBy(xpath="//a[text()='Opportunities']")
    private WebElement opp;
    
    public void oppor() {
    	opp.click();   
    	}
    @FindBy(xpath="//a[text()='Documents']")
    private WebElement doc;
    
    public void doc() {
    	doc.click();   
    	}
    @FindBy(xpath="//a[text()='Email']")
    private WebElement emi;
    
    public void emails() {
    	emi.click();   
    	}
    
    
    
    
    
    
    */
}
