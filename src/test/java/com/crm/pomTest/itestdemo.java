package com.crm.pomTest;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.Baseclass;

@Listeners(Base.Itest.class)
public class itestdemo extends Baseclass{
	@Test
	public void tc1(){
	driver.findElement(By.name("accountname")).sendKeys("test2");

	}}
