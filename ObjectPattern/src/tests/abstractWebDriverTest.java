package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class abstractWebDriverTest {

	protected WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.navigate().to("http://sole.com.ua");
	}

	@After
	public void shutDown() {
		driver.close();
	}
//чето не то
}
