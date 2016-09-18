package Op;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecondPage {

	private static final String SEARCH_FIRSTLINK_XPATH = "//a[contains(@class, 'serp-item__title-link link') and contains(@class, 'link_cropped_no')]";

	private WebDriver driver;

	public SecondPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstLink() {
		return driver.findElement(By.xpath(SEARCH_FIRSTLINK_XPATH));
	}

}
