package com.framework.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.base.TestBase;


public class MinervaHomePage extends TestBase{
	@Test
	public void homePage() {
		driver.findElement(By.id(or.getProperty("UsernameID"))).sendKeys(config.getProperty("ValidUserName"));
		driver.findElement(By.id(or.getProperty("passwordID"))).sendKeys(config.getProperty("ValidPassWord"));
		driver.findElement(By.id(or.getProperty("signInID"))).click();
		WebElement homepage = driver.findElement(By.id(or.getProperty("Home")));
		if(homepage.isDisplayed()) {
			System.out.println("We are on Home Page");
		}
		else {
			System.out.println("Some error occurred");
		}
		
	}
	@DataProvider
	public Object[][] getDataProvider(){
	Object[][] data = new Object[2][2];
	data[0][0]="rulihilk";
	data[1][1]="itj,gk,kj";
	for (int i = 0; i < 2; i++) { 
	
		for (int j = 0; j < 2; j++) {
			
			data[i][j]=
			j++;
			System.out.println(data[i]);
			j++;
		}
	}
	return data;
}
	
	
	
}
