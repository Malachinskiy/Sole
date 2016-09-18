package Op;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstPage {
	private static final String SEARCH_FIELD_XPATH = "//input[contains(@class, 'input__control') and contains(@class, 'input__input')]";
	private static final String SEARCH_BUTTON_XPATH = "//button[contains(@class, 'suggest2-form__button') and contains(@class, 'button_js_inited')]";

	private WebDriver driver;

	public FirstPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSearchField() {
		return driver.findElement(By.xpath(SEARCH_FIELD_XPATH));
	}

	public WebElement getSearchButton() {
		return driver.findElement(By.xpath(SEARCH_BUTTON_XPATH));
	}

	public void click() {
		getSearchButton().click();
	}

	public SecondPage search(String text) {
		getSearchField().sendKeys(text);
		click();
		return new SecondPage(driver);

	}

}
