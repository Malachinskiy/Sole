package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sole.Banner;

public class SelectVsActoinBuilderTest extends abstractWebDriverTest {

	@Test
	public void titlePage() {
		Banner banner = new Banner(driver);
		assertTrue(banner.getTitle().contains("Купить"));
		System.out.println(banner.getTitle());
	}

	@Test
	public void actionsBrandTest() throws InterruptedException {
		Banner banner = new Banner(driver);
		banner.hover();
		banner.getBrandsAdidas().click();
		Thread.sleep(2000);

	}

	@Test
	public void selectBrandTest() {
		Banner banner = new Banner(driver);
		banner.selectBrand();
	}
}
