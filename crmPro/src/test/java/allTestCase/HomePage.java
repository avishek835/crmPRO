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
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for (int i = 1; i <= links.size(); i = i + 1)

		{

			System.out.println(links.get(i).getText());
			System.out.println(links.get(i));

		}
	}

}
