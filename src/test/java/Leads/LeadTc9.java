package Leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.Baseclass;

	public class LeadTc9 extends Baseclass{
		@Test
		public void Tc6(){
			driver.findElement(By.name("lastname")).sendKeys("sivasakthi");
			driver.findElement(By.name("company")).sendKeys("testyantra");
			
			WebElement ele = driver.findElement(By.name("industry"));
		ele.click();
		    Select s=new Select(ele);
		    s.selectByValue("Banking");
			ele.click();
			WebElement redio = driver.findElement(By.xpath("(//input[@name='assigntype'])[2]"));
			redio.click() ;
			
			WebElement ele2 = driver.findElement(By.name("leadsource"));
			ele2.click();
			Select s2 =new Select(ele2);
			s2.selectByValue("Partner");
			ele2.click();
			WebElement ele3 = driver.findElement(By.name("leadstatus"));
			ele3.click();
			Select s3 =new Select(ele3);
			s3.selectByValue("Cold");
			ele3.click();
			WebElement ele4 = driver.findElement(By.name("rating"));
			ele3.click();
			Select s4 =new Select(ele4);
			s4.selectByValue("Active");
			ele4.click();
			driver.findElement(By.name("button")).click();
			
		}

	}

