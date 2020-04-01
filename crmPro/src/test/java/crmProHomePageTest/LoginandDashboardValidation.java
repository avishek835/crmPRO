package crmProHomePageTest;

import org.openqa.selenium.By;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import crmProBase.BaseFile;

public class LoginandDashboardValidation extends BaseFile{
	
	@Parameters({ "username", "password" })
	@Test
	public void login(@Optional("achakraborty83")String username, @Optional("Krishna@835@")String password) {
		
		driver.findElement(By.xpath(propX.getProperty("username"))).sendKeys(username);
		driver.findElement(By.name(propX.getProperty("password"))).sendKeys(password);
		driver.findElement(By.xpath(propX.getProperty("click"))).click();
	}
	
	
	

}
