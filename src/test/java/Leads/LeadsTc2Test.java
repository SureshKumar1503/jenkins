package Leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Baseclass;

public class LeadsTc2Test extends Baseclass {
@Test (groups={"regression"})
	public void industri() {
		WebElement tc2 = driver.findElement(By.name("industry"));
		tc2.click();
	}
}
