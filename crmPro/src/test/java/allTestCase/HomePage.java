package allTestCase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import crmProBase.BaseFile;

public class HomePage extends BaseFile {

	@Test
	public void currentUrl() {
		driver.getCurrentUrl();
	}

	@Test
	public void getAllLinks() {
		List<WebElement> getAllLinks = driver.findElements(By.tagName("a"));

		System.out.println(getAllLinks.size());

		for (WebElement links : getAllLinks)

		{
			System.out.println(links.getText() + " - " + links.getAttribute("href"));

		}
	}

}
