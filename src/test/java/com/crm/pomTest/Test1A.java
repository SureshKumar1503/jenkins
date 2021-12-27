package com.crm.pomTest;

import org.testng.annotations.Test;

import com.crm.pom.Base_logIn;
import com.crm.pom.crm_pom;
import com.crm.pom.organization;

import BaseOfwebdriver.WebDriverUtility;

public class Test1A extends Base_logIn {
	WebDriverUtility wd= new WebDriverUtility();
	crm_pom cm=new crm_pom(driver);
  @Test
	public void tc1() throws InterruptedException {
	  
		organization or=new organization(driver);
		or.orgs();
		or.org();
		or.name1();
		or.btn();
		wd.waitForElementVisibility(driver, cm.houver());
		
		}
	}
