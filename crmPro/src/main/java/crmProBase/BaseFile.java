package crmProBase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import crmProUtil.CrmProPractiseUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseFile {
	
	//Protected can be access through inheritance
	protected WebDriver driver;
	protected WebElement element;
	protected String s;
	protected Properties propX;
	
	protected BaseFile(){
	CrmProPractiseUtil crmutil=new CrmProPractiseUtil();
	propX= crmutil.getProp();
	}
	
	//@Parameters("browser")
	@BeforeSuite()
	public void setupBrowser()
	{
		String browser = propX.getProperty("browser");
		
		if (browser.equals("chrome")) 
		{
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(browser.equals("headlessChrome")) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		driver = new ChromeDriver(options);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.get("https://www.crmpro.com/");

	}
	
	
	//@BeforeClass()
	//@Parameters("URL")
	//@Optional("https://www.crmpro.com")String URL
	
	@BeforeClass()
	public void getURL()
	{
		
		driver.get(propX.getProperty("URL"));
		
				
	}
	
	@AfterClass()
	public void quitBrowser()
	{
		driver.quit();
	}
	
}
