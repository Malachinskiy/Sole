package sole;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainPageTest {
	private WebDriver driver;

	@Before
	public void setUp() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("http://sole.com.ua");
		Thread.sleep(5000);
	}

	@After
	public void tearDown() {
		driver.close();
	}

	@Test
	public void closeBanner() {
		Banner banner = new Banner(driver);
		if (banner.getContainer().isDisplayed()) {
			banner.close();
		}
	}

	@Test
	public void clickBannerButton() {
		Banner banner = new Banner(driver);
		if (banner.getContainer().isDisplayed()) {
			banner.clickHelpBuy();
		}

	}

	@Test
	public void textPresent() {
		Banner banner = new Banner(driver);
		assertTrue(banner.getContainer().getText().contains("Вам приобрести"));
	}

	/*
	 * @Test public void hoverTheText(){ //Actions actions = new
	 * Actions(driver); Banner banner = new Banner(driver); if
	 * (banner.getContainer().getText().contains("Вам приобрести")) {
	 * banner.mouseHover();
	 * //actions.moveToElement(banner.getContainer()).perform(); }
	 */

	@Test
	public void buttonTextIsNotEmpty() {
		Banner banner = new Banner(driver);
		assertTrue(banner.getHelpBuyButton().getText().isEmpty());

	}

	@Test
	public void testBannerSize() {
		Banner banner = new Banner(driver);
		int width = banner.getBannerImage().getSize().getWidth();
		int height = banner.getBannerImage().getSize().getHeight();
		assertEquals(512, width);
		assertEquals(256, height);
	}

	/*
	 * @Test public void cssBanner() { Banner banner = new Banner(driver);
	 * String css = banner.getContainer().getCssValue(null);
	 * System.out.println(css);
	 * 
	 * }
	 */

	@Test

	public void titlePage() {
		Banner banner = new Banner(driver);
		assertTrue(banner.getTitle().contains("Купить"));
		System.out.println(banner.getTitle());
	}

	@Test

	public void mouseHover() {
		Banner banner = new Banner(driver);
		if (banner.getContainer().isDisplayed()) {
			banner.clickHelpBuy();
		}

		banner.hover();
	}

	@Test
	public void brandAdidasPage() {
		Banner banner = new Banner(driver);
		/*
		 * if (banner.getContainer().isDisplayed()) { banner.close(); }
		 */
		banner.hover();
		banner.clickBrandsAdidas();
	}

	@Test
	public void calculationHelpBuy() {
		Banner banner = new Banner(driver);
		HelpbuyPage helpbuy = new HelpbuyPage(driver);
		if (banner.getContainer().isDisplayed()) {
			banner.clickHelpBuy();
		}
		// helpbuy.getNameFieldHelpBuy().sendKeys("Tralalalala");
		// helpbuy.getModelFieldHelpBuy().sendKeys("Adidas Special");
		helpbuy.calculation("VOVA TEST!!!", "Adidas Special", "0933340169", "а я ебу", "цветом как у кешкатуры",
				"это часом не зашквар, не");
		helpbuy.calcclick();
	}
	
	@Test
	public void sendFormHelpBuyTest() {
		Banner banner = new Banner(driver);
		HelpbuyPage helpbuy = new HelpbuyPage(driver);
		if (banner.getContainer().isDisplayed()) {
			banner.clickHelpBuy();
		}
		// helpbuy.getNameFieldHelpBuy().sendKeys("Tralalalala");
		// helpbuy.getModelFieldHelpBuy().sendKeys("Adidas Special");
		helpbuy.calculation("VOVA TEST!!!", "Adidas Special", "0933340169", "а я ебу", "цветом как у кешкатуры",
				"это часом не зашквар, не");
		helpbuy.calcclick();
	}

	
}
