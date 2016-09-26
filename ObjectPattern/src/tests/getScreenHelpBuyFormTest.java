package tests;

import java.io.IOException;

import org.junit.Test;

import sole.Banner;
import sole.HelpbuyPage;
import sole.WebDriverUtils;

public class getScreenHelpBuyFormTest extends abstractWebDriverTest {

	@Test
	public void getScreenTest() throws IOException {
		WebDriverUtils utils = new WebDriverUtils(driver);
		Banner banner = new Banner(driver);
		HelpbuyPage helpbuy = new HelpbuyPage(driver);
		banner.getHelpBuyPageFromMainMenu();
		helpbuy.calculation("VOVA TEST!!!", "Adidas Special", "0933340169", "а € ебу", "цветом как у кешкатуры",
				"это часом не зашквар, не");
		utils.takeScreenShot("HelpByy Form");
		helpbuy.calcclick();
	}

}
