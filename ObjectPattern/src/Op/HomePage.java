package Op;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {

	private WebDriver driver;

	public HomePage(FirefoxDriver driver) {
		this.driver = driver;
	}

	public ResultPage search(String text) {
		getSearchField().sendKeys(text);
		return new ResultPage(driver);
	}
public WebElement getSearchField ()
{
	return driver.findElement(By.xpath(".//*[@id='gs_htif0']"));
	}
}
