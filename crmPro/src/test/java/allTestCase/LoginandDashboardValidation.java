package allTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import crmProBase.BaseFile;

public class LoginandDashboardValidation extends BaseFile{
	
	WebDriverWait wait;
	@Parameters({ "username", "password" })
	@Test
	public void login(@Optional("achakraborty83")String username, @Optional("Krishna@835@")String password) {
		
		driver.findElement(By.xpath(propX.getProperty("username"))).sendKeys(username);
		driver.findElement(By.name(propX.getProperty("password"))).sendKeys(password);
		driver.findElement(By.xpath(propX.getProperty("click"))).click();
	}
	
	@Test
	public void validateElementAfterLogin()
	{
		
		driver.switchTo().frame("mainpanel");
		s=driver.findElement(By.xpath(propX.getProperty("crmText"))).getText();
		System.out.println("Text after logged in is:"+s);
	}
	
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void hoverOnCompannies()
	{
		driver.switchTo().defaultContent();
		try {
		 wait = new WebDriverWait(driver,10);
			element=(WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@class=\"headertable\" and @valign='top'and @width='100%']")));
		} catch (TimeoutException e) {
			wait=new WebDriverWait(driver,10);
			element=(WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@class=\"headertable\" and @valign='top'and @width='100%']")));
			e.printStackTrace();
		}
		driver.switchTo().frame("mainpanel");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//ul[@cl ass='mlddm']//a[contains(text(),'Companies')]"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//a[@title='New Company']"))).click().perform();
	}
	/*
	 * @Test public void Logout() { //driver.switchTo().defaultContent();
	 * driver.findElement(By.cssSelector(propX.getProperty("Logout"))).click(); }
	 */

}
