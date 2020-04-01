package crmProHomePageTest;

import org.testng.annotations.Test;

import crmProBase.BaseFile;

public class HomePage extends BaseFile{
	
	
	@Test
	public void currentUrl() {
		driver.getCurrentUrl();
	}
	

}
