package Op;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTestPage {
	private WebDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://yandex.com");
	}

	@After
	public void tearDown() {
		driver.close();
	}

	/*
	 * @Test public void testSearch() { HomePage home = new HomePage(driver);
	 * ResultPage result = home.search("automated testing info");
	 * assertTrue(result.getFirstLink().contains("automated"));* }
	 */

	@Test
	public void testSearch() {
		FirstPage home = new FirstPage(driver);
		SecondPage result = home.search("automated testing info");
		assertTrue(result.getFirstLink().getText().contains("automated"));
	}
}
